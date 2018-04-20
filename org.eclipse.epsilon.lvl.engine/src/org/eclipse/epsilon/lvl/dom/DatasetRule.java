package org.eclipse.epsilon.lvl.dom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
import org.eclipse.epsilon.lvl.columnGenerators.ColumnGenerator;
import org.eclipse.epsilon.lvl.columnGenerators.Grid;
import org.eclipse.epsilon.lvl.columnGenerators.NestedFrom;
import org.eclipse.epsilon.lvl.columnGenerators.Properties;
import org.eclipse.epsilon.lvl.columnGenerators.Reference;
import org.eclipse.epsilon.lvl.output.Persistence;
import org.eclipse.epsilon.lvl.output.ReturnValueParser;
import org.eclipse.epsilon.lvl.parse.LvlParser;

public class DatasetRule extends AnnotatableModuleElement {

  protected String name;
  protected Parameter parameter;
  protected ExecutableBlock<Boolean> guardBlock;
  protected IExecutableModuleElement fromBlock = null;
  protected List<ColumnGenerator> generators = new ArrayList<ColumnGenerator>();

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
    boolean isSilent = ((LvlModule)module).isSilent() ||
        this.hasAnnotation(LvlModule.SILENT_ANNOTATION);
    // loop over children looking for column generators
    for (AST child : cst.getChildren()) {
      if (isColumnGenerator(child)) {
        ColumnGenerator gen = (ColumnGenerator) module.createAst(child, this);
        setSilent(gen, isSilent);
        generators.add(gen);
      }
    }
  }

  public static void setSilent(ColumnGenerator colGen, boolean isSilent) {
    if (colGen instanceof Column) {
      ((Column)colGen).setSilent(isSilent);
    } else if (colGen instanceof Grid) {
      ((Grid)colGen).setSilent(isSilent);
    } else if (colGen instanceof NestedFrom) {
      ((NestedFrom)colGen).setSilent(isSilent);
    }
  }

  public static boolean isColumnGenerator(AST child) {
    switch(child.getType()) {
    case LvlParser.PROPERTIES:
    case LvlParser.REFERENCE:
    case LvlParser.COLUMN:
    case LvlParser.GRID:
    case LvlParser.NESTEDFROM:
      return true;
    default:
      return false;
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
            "The 'from' expression must return a collection of elements");
      }
      oElements = (Collection<?>) result;
    }
    initialiseGenerators(context, getter);
    Dataset dataset = new Dataset();
    List<String> columnNames = new ArrayList<String>();
    for (ColumnGenerator generator : generators) {
      initialise(generator, context, getter);
      columnNames.addAll(generator.getNames());
    }
    dataset.setColumnNames(getColumnNames());
    for (Object oElem : oElements) {
      if (!isIncluded(oElem, context, parameter.getName())) {
        continue;
      }
      dataset.addColumnValues(getRowValues(context, oElem));
    }
    postProcess(dataset);
    Persistence.persist(dataset, getFilePath(), ((LvlModule)module).getSeparator());
  }

  private void postProcess(Dataset dataset)
      throws EolRuntimeException, RuntimeException {
    for (ColumnGenerator colGen : generators) {
      if (colGen instanceof Column || colGen instanceof Grid) {
        if (((AnnotatableModuleElement)colGen).hasAnnotation(
            LvlModule.NORMALIZE_ANNOTATION)) {
          for (String colName : colGen.getNames()) {
            PostProcessing.normalize(dataset.getValuesByColumn(colName));
          }
        }
        if (((AnnotatableModuleElement)colGen).hasAnnotation(
            LvlModule.FILL_NULLS_ANNOTATION)) {
          for (String colName : colGen.getNames()) {
            PostProcessing.fillNullValues(dataset.getValuesByColumn(colName),
                                          PostProcessing.FillType.VALUE,
                                          null);
          }
        }
      }
    }
  }

  private List<Object> getRowValues(IEolContext context, Object oElem)
      throws EolRuntimeException {
    List<Object> rowValues = new ArrayList<Object>();
    context.getFrameStack().enterLocal(FrameType.PROTECTED, this);
    context.getFrameStack().put(
        Variable.createReadOnlyVariable(parameter.getName(), oElem));
    for (ColumnGenerator generator : generators) {
      List<Object> values = generator.getValues(oElem);
      rowValues.addAll(values);
      // if we calculate a column, we add it to the stack so it can be used
      //    in later column calculations. We know that values only has 1 elem
      if (generator instanceof Column) {
        context.getFrameStack().put(
            Variable.createReadOnlyVariable(((Column)generator).getName(),
                                            values.get(0)));
      }
    }
    context.getFrameStack().leaveLocal(this);
    return rowValues;
  }

  private List<String> getColumnNames() throws EolRuntimeException {
    List<String> columnNames = new ArrayList<String>();
    for (ColumnGenerator generator : generators) {
      columnNames.addAll(generator.getNames());
    }
    return columnNames;
  }

  private String getFilePath() {
    return ((LvlModule)module).getOutputFolder()
        + "/" + name + ((LvlModule)module).getExtension();
  }

  private void initialiseGenerators(IEolContext context,
      IPropertyGetter getter) {
    for (ColumnGenerator generator : generators) {
      initialise(generator, context, getter);
    }
  }

  public static void initialise(ColumnGenerator generator, IEolContext context,
      IPropertyGetter getter) {
    if (generator instanceof Properties) {
      ((Properties)generator).setGetter(getter);
    } else if (generator instanceof Reference) {
      ((Reference)generator).setGetter(getter);
    } else if (generator instanceof Column) {
      ((Column)generator).setContext(context);
    } else if(generator instanceof Grid) {
      ((Grid)generator).setContext(context);
    } else if (generator instanceof NestedFrom) {
      ((NestedFrom)generator).initialise(context, getter);
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
