package org.eclipse.epsilon.lvl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.util.AstUtil;
import org.eclipse.epsilon.emc.emf.AbstractEmfModel;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.dom.ExecutableBlock;
import org.eclipse.epsilon.eol.dom.Parameter;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.Return;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.parse.EolParser;
import org.eclipse.epsilon.eol.types.EolModelElementType;
import org.eclipse.epsilon.lvl.parse.LvlParser;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class DatasetRule extends AnnotatableModuleElement {

  protected String name;
  protected Parameter parameter;
  protected List<ColumnDefinition> columns = new ArrayList<ColumnDefinition>();
  protected List<String> simpleFeatures = new ArrayList<String>();
  protected ExecutableBlock<Boolean> guardBlock;
  protected List<SimpleReference> simpleReferences = new ArrayList<SimpleReference>();

  @SuppressWarnings("unchecked")
  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    name = (String) cst.getFirstChild().getText();
    parameter = (Parameter) module.createAst(cst.getSecondChild(), this);
    guardBlock = (ExecutableBlock<Boolean>) module.createAst(
        AstUtil.getChild(cst, LvlParser.GUARD), this);
    AST simpleFeaturesCST = AstUtil.getChild(cst, LvlParser.SIMPLEFEATURES);
    for (AST feature : AstUtil.getChildren(simpleFeaturesCST, EolParser.NAME)) {
      simpleFeatures.add(feature.getText());
    }
    for (AST simpleRefAST : AstUtil.getChildren(cst, LvlParser.SIMPLEREFERENCE)) {
      simpleReferences.add((SimpleReference) module.createAst(simpleRefAST, this));
    }
    for (AST columnAST : AstUtil.getChildren(cst, LvlParser.COLUMNDEFINITION)) {
      columns.add((ColumnDefinition) module.createAst(columnAST, this));
    }
  }

  public boolean isIncluded(Object object, IEolContext context,
      String varName) throws EolRuntimeException{
    if (guardBlock != null) {
      return guardBlock.execute(context,
          Variable.createReadOnlyVariable(varName, object));
    } else {
      return true;
    }
  }


  protected void execute(IEolContext context) throws EolRuntimeException {

    EolModelElementType parameterType = (EolModelElementType) parameter.getType(context);
    IModel model = parameterType.getModel();
    System.out.println("Model name: " + model.getName());
    IPropertyGetter getter = model.getPropertyGetter();
    getter.setContext(context);

    // as some constructs are emf-dependent, we prepare the emf model here
    AbstractEmfModel emfModel = null;
    EClass eClass = null;
    if (model instanceof AbstractEmfModel) {
      emfModel = (AbstractEmfModel)model;
      eClass = emfModel.classForName(parameterType.getTypeName());
    }

    // get the first element to check features existence
    Collection<?> oElements = parameterType.getAllOfKind();
    Iterator<?> iterator = oElements.iterator();
    Object ou = iterator.next(); // this fails if empty collection
    for (String feature : simpleFeatures) {
      if (!getter.hasProperty(ou, feature)) {
        throw new EolRuntimeException("Feature " + feature +
            " not found in type " + parameterType.getName());
      }
    }

    // Check simplereferences correctness
    for (SimpleReference ref : simpleReferences) {
      if (!getter.hasProperty(ou, ref.getName())) {
        throw new EolRuntimeException("Feature " + ref.getName() +
            " not found in type " + parameterType.getName());
      }
      // We need a valid object from the reference to check its features
      // we could do it with emf too, but this is independent of any tech
      Object refObject = null;
      while (refObject == null && iterator.hasNext()) {
        ou = iterator.next();
        refObject = getter.invoke(ou, ref.getName());
      }
      if (refObject != null) {
        for (String feat : ref.getFeatures()) {
          if (!getter.hasProperty(refObject, feat)) {
            throw new EolRuntimeException("Feature " + feat +
                " not found in type of reference " + ref.getName());
          }
        }
      }
      // references without declared attributes include all (if model is emf)
      if (ref.getFeatures().isEmpty()) {
        if (emfModel == null || eClass == null) {
          throw new EolRuntimeException("Single reference EMF functionalities "
              + "are not available in non-emf models");
        } else {
          EReference eRef = (EReference)eClass.getEStructuralFeature(ref.getName());
          for (EAttribute attr : eRef.getEReferenceType().getEAttributes()) {
            ref.getFeatures().add(attr.getName());
          }
        }
      }
    }
    // Get the project where to store the generated tables
    //   This only works if there is an editor opened (enough)
    IProject project = null;
    IWorkbench workbench = PlatformUI.getWorkbench();
    IWorkbenchWindow window = workbench.getWorkbenchWindows()[0];
    IWorkbenchPage activePage = window.getActivePage();
    IEditorPart activeEditor = activePage.getActiveEditor();
    if (activeEditor != null) {
       IEditorInput input = activeEditor.getEditorInput();
       project = input.getAdapter(IProject.class);
       if (project == null) {
          IResource resource = input.getAdapter(IResource.class);
          if (resource != null) {
             project = resource.getProject();
          }
       }
    }
    if (project == null) {
      return;
    }
//    IFolder folder = project.getFolder("gen");
//    try {
//      for (IResource res : folder.members()) {
//        res.delete(false, null);
//      }
//    } catch (CoreException e1) {
//      e1.printStackTrace();
//    }
    String filePath = project.getLocation() + "/gen/" + name + ".csv";


    PrintWriter pw = null;
    try {
        pw = new PrintWriter(new File(filePath));
    } catch (FileNotFoundException e) {
        e.printStackTrace();
        return;
    }

    List<String> columnNames = new ArrayList<String>();

    //System.out.println("\nDataset " + name);
    for (String feature : simpleFeatures) {
      //System.out.print(feature + ", ");
      columnNames.add(feature);
    }
    for (SimpleReference reference : simpleReferences) {
      for (String feature : reference.getFeatures()) {
        columnNames.add(reference.getName() + "_" + feature);
      }
    }
    for (ColumnDefinition c : columns) {
      //System.out.print(c.getName() + ", ");
      columnNames.add(c.getName());
    }
    //System.out.println();
    pw.write(String.join(",", columnNames) +"\n");

    for (Object o : oElements) {
      // check if element is filtered
      if (!isIncluded(o, context, parameter.getName())){
        continue;
      }
      List<String> recordValues = new ArrayList<String>();
      for (String feature : simpleFeatures) {
        recordValues.add(getter.invoke(o, feature).toString());
        //System.out.print(getter.invoke(o, feature) + ", ");
      }
      for (SimpleReference reference : simpleReferences) {
        EObject refObject = (EObject)getter.invoke(o, reference.getName());
        if (refObject == null) {
          // No object present in reference, blank for all columns
          for (int i = 0; i < reference.getFeatures().size(); i++) {
            recordValues.add("");
          }
        } else {
          for (String feature : reference.getFeatures()) {
            recordValues.add(getter.invoke(refObject, feature).toString());
          }
        }
      }
//      context.getFrameStack().enterLocal(FrameType.PROTECTED, c.getBlock());
      context.getFrameStack().put(
          Variable.createReadOnlyVariable(parameter.getName(), o));
      for (ColumnDefinition c : columns) {
        Object res = null;
        try{
          res = context.getExecutorFactory().execute(c.getBlock(), context);
        } catch (EolRuntimeException r) {
          res = "";
        }
//        String res = c.getBlock().execute(context, Variable.createReadOnlyVariable(parameter.getName(), o));
        if (res != null) {
          String value = "";
          if (res instanceof Return) {
            //System.out.print(((Return)res).getValue() + ", ");
            value = ((Return)res).getValue().toString();
          } else {
            //System.out.print(res + ", ");
            value = res.toString();
          }
          recordValues.add(value);
        } else {
          recordValues.add("nullnull");
          //System.out.print("nullnull, ");
        }
      }
//      context.getFrameStack().leaveLocal(c.getBlock());
      pw.write(String.join(",", recordValues) +"\n");
      //System.out.println();
    }
    pw.close();
  }

  public Parameter getParameter() {
    return parameter;
  }
  public void setParameter(Parameter parameter) {
    this.parameter = parameter;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

}
