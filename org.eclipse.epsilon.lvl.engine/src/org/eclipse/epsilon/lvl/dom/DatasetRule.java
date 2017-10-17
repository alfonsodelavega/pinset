package org.eclipse.epsilon.lvl.dom;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.util.AstUtil;
import org.eclipse.epsilon.emc.emf.AbstractEmfModel;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.dom.ExecutableBlock;
import org.eclipse.epsilon.eol.dom.Parameter;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.parse.EolParser;
import org.eclipse.epsilon.eol.types.EolModelElementType;
import org.eclipse.epsilon.lvl.LvlModule;
import org.eclipse.epsilon.lvl.output.DatasetFile;
import org.eclipse.epsilon.lvl.output.ReturnValueParser;
import org.eclipse.epsilon.lvl.parse.LvlParser;

public class DatasetRule extends AnnotatableModuleElement {

  protected String name;
  protected Parameter parameter;
  protected List<ColumnDefinition> columns = new ArrayList<ColumnDefinition>();
  protected List<String> simpleFeatures = new ArrayList<String>();
  protected ExecutableBlock<Boolean> guardBlock;
  protected List<SimpleReference> simpleReferences = new ArrayList<SimpleReference>();
  protected List<Grid> grids = new ArrayList<Grid>();

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
    for (AST gridAST : AstUtil.getChildren(cst, LvlParser.GRID)) {
      grids.add((Grid) module.createAst(gridAST, this));
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


  public void execute(IEolContext context) throws EolRuntimeException {

    EolModelElementType parameterType = (EolModelElementType) parameter.getType(context);
    IModel model = parameterType.getModel();
    IPropertyGetter getter = model.getPropertyGetter();
    getter.setContext(context);

    // as some constructs are emf-dependent, prepare the emf model
    AbstractEmfModel emfModel = null;
    EClass eClass = null;
    if (model instanceof AbstractEmfModel) {
      emfModel = (AbstractEmfModel)model;
      eClass = emfModel.classForName(parameterType.getTypeName());
    }

    Collection<?> oElements = parameterType.getAllOfKind();
    // use the first element to check features existence
    Object ou = oElements.iterator().next(); // this fails if empty collection

    validateSimpleFeatures(ou, getter, parameterType.getName());

    for (SimpleReference ref : simpleReferences) {
      ref.validate(ou, getter, oElements.iterator(), parameterType.getName());
      // references without declared attributes include all (if model is emf)
      if (ref.includesAllAttributes()) {
        if (emfModel == null || eClass == null) {
          throw new EolRuntimeException("Single reference EMF functionalities "
              + "are not available in non-emf models");
        } else {
          ref.populateFeatures(eClass);
        }
      }
    }

    String filePath = ((LvlModule)module).getOutputFolder()
        + "/" + name + ((LvlModule)module).getExtension();
    DatasetFile df = null;
    try {
        df = new DatasetFile(filePath);
        df.setSeparator(((LvlModule)module).getSeparator());
    } catch (FileNotFoundException e) {
        e.printStackTrace();
        return;
    }

    List<String> columnNames = new ArrayList<String>();
    for (String feature : simpleFeatures) {
      columnNames.add(feature);
    }
    for (SimpleReference reference : simpleReferences) {
      columnNames.addAll(reference.getNames());
    }
    for (ColumnDefinition c : columns) {
      columnNames.add(c.getName());
    }
    for (Grid grid : grids) {
      columnNames.addAll(grid.getNames(context));
    }
    df.newRecord(columnNames);

    for (Object o : oElements) {
      // check if element is filtered
      if (!isIncluded(o, context, parameter.getName())) {
        continue;
      }
      List<String> recordValues = new ArrayList<String>();
      for (String feature : simpleFeatures) {
        recordValues.add(ReturnValueParser.getStringOrBlank(
            getter.invoke(o, feature)));
      }
      for (SimpleReference reference : simpleReferences) {
        recordValues.addAll(reference.getValues(o, getter));
      }
      for (ColumnDefinition c : columns) {
        recordValues.add(c.getValue(o, context, parameter.getName()));
      }
      for (Grid mc : grids) {
        recordValues.addAll(mc.getValues(o, context, parameter.getName()));
      }
      df.newRecord(recordValues);
    }
    df.close();
  }

  private void validateSimpleFeatures(Object ou, IPropertyGetter getter, String type)
      throws EolRuntimeException {
    for (String feature : simpleFeatures)  {
      if (!getter.hasProperty(ou, feature)) {
        throw new EolRuntimeException("Feature " + feature +
            " not found in type " + type);
      }
    }
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
