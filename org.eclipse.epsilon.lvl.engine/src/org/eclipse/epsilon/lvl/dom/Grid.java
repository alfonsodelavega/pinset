package org.eclipse.epsilon.lvl.dom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.util.AstUtil;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.dom.IExecutableModuleElement;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.FrameType;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.lvl.LvlModule;
import org.eclipse.epsilon.lvl.output.ReturnValueParser;
import org.eclipse.epsilon.lvl.parse.LvlParser;

public class Grid extends AnnotatableModuleElement {

  private static final String KEY_VARNAME = "key";

  protected IExecutableModuleElement keysBlock;
  protected IExecutableModuleElement headerBlock;
  protected IExecutableModuleElement bodyBlock;

  protected Collection<Object> keys = null;
  protected Collection<String> headers = null;

  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    AST keysAST = AstUtil.getChild(cst, LvlParser.GRIDKEYS);
    keysBlock = (IExecutableModuleElement)
        module.createAst(keysAST.getFirstChild(), this);
    AST headerAST = AstUtil.getChild(cst, LvlParser.GRIDHEADER);
    headerBlock = (IExecutableModuleElement)
        module.createAst(headerAST.getFirstChild(), this);
    AST bodyAST = AstUtil.getChild(cst, LvlParser.GRIDBODY);
    bodyBlock = (IExecutableModuleElement)
        module.createAst(bodyAST.getFirstChild(), this);
  }

  public Collection<String> getNames(IEolContext context)
      throws EolRuntimeException {
    if (headers == null) {
      initHeaders(context);
    }
    return headers;
  }

  private void initHeaders(IEolContext context) throws EolRuntimeException {
    initKeys(context);
    headers = new ArrayList<String>();
    context.getFrameStack().enterLocal(FrameType.PROTECTED, headerBlock);
    for (Object key : keys) {
      context.getFrameStack().put(
          Variable.createReadOnlyVariable(KEY_VARNAME, key));
      Object result = ReturnValueParser.obtainValue(
          context.getExecutorFactory().execute(headerBlock, context));
      if (result == null) {
        throw new EolRuntimeException(String.format(
            "There has been a problem when generating a header for key %s",
            key));
      }
      String header = "" + result;
      headers.add(header.trim().replaceAll("\\s+", "_"));
    }
    context.getFrameStack().leaveLocal(headerBlock);
  }

  @SuppressWarnings("unchecked")
  private void initKeys(IEolContext context) throws EolRuntimeException {
    if (keys == null) {
      keys = (Collection<Object>)ReturnValueParser.obtainValue(
          context.getExecutorFactory().execute(keysBlock, context));
    }
  }

  public List<String> getValues(Object obj, IEolContext context, String varName)
      throws EolRuntimeException {
    initKeys(context);
    List<String> values = new ArrayList<String>();
    context.getFrameStack().enterLocal(FrameType.PROTECTED, bodyBlock);
    context.getFrameStack().put(
        Variable.createReadOnlyVariable(varName, obj));
    for (Object key : keys) {
      context.getFrameStack().put(
          Variable.createReadOnlyVariable(KEY_VARNAME, key));
      String value = "";
      try {
        value = ReturnValueParser.obtainAndParseValue(
            context.getExecutorFactory().execute(bodyBlock, context));
      } catch (EolRuntimeException e) {
        if (!(this.hasAnnotation(LvlModule.SILENT_ANNOTATION)
            || ((DatasetRule)parent).hasAnnotation(LvlModule.SILENT_ANNOTATION)
            || ((LvlModule)module).isSilent())) {
          throw e;
        }
      }
      values.add(value);
    }
    context.getFrameStack().leaveLocal(bodyBlock);
    return values;
  }
}
