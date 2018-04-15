package org.eclipse.epsilon.lvl.columnGenerators;

import java.util.Arrays;
import java.util.List;

import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.dom.IExecutableModuleElement;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.FrameType;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.lvl.LvlModule;
import org.eclipse.epsilon.lvl.dom.DatasetRule;
import org.eclipse.epsilon.lvl.output.ReturnValueParser;

public class Column extends AnnotatableModuleElement
    implements ColumnGenerator {

  protected String name;
  protected IExecutableModuleElement block;

  protected IEolContext context;
  protected String paramName;

  public void setName(String name) {
    this.name = name;
  }
  public IExecutableModuleElement getBlock() {
    return block;
  }
  public void setBlock(IExecutableModuleElement block) {
    this.block = block;
  }

  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    name = (String) cst.getFirstChild().getText();
    block = (IExecutableModuleElement) module.createAst(cst.getSecondChild(), this);
  }

  public List<String> getNames() {
    return Arrays.asList(getName());
  }

  private String getName() {
    return name;
  }

  public List<String> getValues(Object elem) throws EolRuntimeException {
    return Arrays.asList(getValue(elem));
  }

  private String getValue(Object obj)
      throws EolRuntimeException {
    context.getFrameStack().enterLocal(FrameType.PROTECTED, block);
    context.getFrameStack().put(
        Variable.createReadOnlyVariable(paramName, obj));
    Object res = null;
    try {
      res = context.getExecutorFactory().execute(block, context);
    } catch (EolRuntimeException e) {
      if (!(this.hasAnnotation(LvlModule.SILENT_ANNOTATION)
          || ((DatasetRule)parent).hasAnnotation(LvlModule.SILENT_ANNOTATION)
          || ((LvlModule)module).isSilent())) {
        throw e;
      }
    }
    context.getFrameStack().leaveLocal(block);
    return ReturnValueParser.obtainAndParseValue(res);
  }

  public void setContext(IEolContext context) {
    this.context = context;
  }

  public void setParamName(String paramName) {
    this.paramName = paramName;
  }
}