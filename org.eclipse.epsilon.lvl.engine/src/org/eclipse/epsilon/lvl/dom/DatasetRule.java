package org.eclipse.epsilon.lvl.dom;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.util.AstUtil;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.dom.ExecutableBlock;
import org.eclipse.epsilon.eol.dom.IExecutableModuleElement;
import org.eclipse.epsilon.eol.dom.Parameter;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.FrameType;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.types.EolModelElementType;
import org.eclipse.epsilon.eol.types.EolType;
import org.eclipse.epsilon.lvl.LvlModule;
import org.eclipse.epsilon.lvl.columnGenerators.Column;
import org.eclipse.epsilon.lvl.columnGenerators.Grid;
import org.eclipse.epsilon.lvl.columnGenerators.Properties;
import org.eclipse.epsilon.lvl.columnGenerators.Reference;
import org.eclipse.epsilon.lvl.output.DatasetFile;
import org.eclipse.epsilon.lvl.output.ReturnValueParser;
import org.eclipse.epsilon.lvl.parse.LvlParser;

public class DatasetRule extends AnnotatableModuleElement {

  protected String name;
  protected Parameter parameter;
  protected IExecutableModuleElement fromBlock = null;
  protected List<Column> columns = new ArrayList<Column>();
  protected Properties properties;
  protected ExecutableBlock<Boolean> guardBlock;
  protected List<Reference> simpleReferences = new ArrayList<Reference>();
  protected List<Grid> grids = new ArrayList<Grid>();


  @SuppressWarnings("unchecked")
  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    name = (String) cst.getFirstChild().getText();
    parameter = (Parameter) module.createAst(cst.getSecondChild(), this);
    guardBlock = (ExecutableBlock<Boolean>) module.createAst(
        AstUtil.getChild(cst, LvlParser.GUARD), this);
    AST fromAST = AstUtil.getChild(cst, LvlParser.FROM);
    if (fromAST != null) {
      fromBlock = (IExecutableModuleElement)
          module.createAst(fromAST.getFirstChild(), this);
    }
    AST propertiesCST = AstUtil.getChild(cst, LvlParser.PROPERTIES);
    properties = (Properties) module.createAst(propertiesCST, this);
    for (AST simpleRefAST : AstUtil.getChildren(cst, LvlParser.REFERENCE)) {
      simpleReferences.add((Reference) module.createAst(simpleRefAST, this));
    }
    for (AST columnAST : AstUtil.getChildren(cst, LvlParser.COLUMN)) {
      columns.add((Column) module.createAst(columnAST, this));
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
    Collection<?> oElements = null;
    IModel model = null;
    IPropertyGetter getter = null;
    EolType parameterType = parameter.getType(context);
    if (!(parameterType instanceof EolModelElementType)) {
      if(fromBlock == null) {
        throw new EolRuntimeException(
            "Datasets generated over non-model types must specify a 'from' expression");
      }
      if (!(properties == null)
          || !simpleReferences.isEmpty()) {
        throw new EolRuntimeException(
            "Datasets generated over non-model types cannot employ feature access constructs");
      }
    } else {
      model = ((EolModelElementType)parameterType).getModel();
      getter = model.getPropertyGetter();
      getter.setContext(context);
    }

    if (fromBlock == null) {
      oElements = ((EolModelElementType)parameterType).getAllOfKind();
    } else {
      context.getFrameStack().enterLocal(FrameType.PROTECTED, fromBlock);
      Object result = ReturnValueParser.obtainValue(
          context.getExecutorFactory().execute(fromBlock, context));
      context.getFrameStack().leaveLocal(fromBlock);
      if (!(result instanceof Collection<?>)) {
        throw new EolRuntimeException(
            "The dataset 'from' expression must return a collection of elements");
      }
      oElements = (Collection<?>) result;
    }

    if (oElements.isEmpty()) {
      return; // if no elements are to appear in the table, it is not generated
    }

    validateSimpleReferences(oElements, parameterType.getName(), getter);

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
    if (properties != null) {
      columnNames.addAll(properties.getNames());
    }
    for (Reference reference : simpleReferences) {
      columnNames.addAll(reference.getNames());
    }
    for (Column c : columns) {
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
      if (properties != null) {
        recordValues.addAll(properties.getValues(o, getter));
      }
      for (Reference reference : simpleReferences) {
        recordValues.addAll(reference.getValues(o, getter));
      }
      for (Column c : columns) {
        recordValues.add(c.getValue(o, context, parameter.getName()));
      }
      for (Grid mc : grids) {
        recordValues.addAll(mc.getValues(o, context, parameter.getName()));
      }
      df.newRecord(recordValues);
    }
    df.close();
  }

  private void validateSimpleReferences(Collection<?> oElements, String oType,
      IPropertyGetter getter)
      throws EolRuntimeException {
    Iterator<?> iterator = oElements.iterator();
    Object obj = iterator.next();
    for (Reference ref : simpleReferences) {
      ref.validate(obj, getter, iterator, oType);
      // references without declared attributes include all (if model is emf)
      if (ref.includesAllAttributes()) {
        if (!(obj instanceof EObject)) {
          throw new EolRuntimeException("Single reference EMF functionalities "
              + "are not available in non-emf models");
        } else {
          ref.populateFeatures(((EObject)obj).eClass());
        }
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
