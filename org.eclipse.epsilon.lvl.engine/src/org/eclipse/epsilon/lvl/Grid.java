package org.eclipse.epsilon.lvl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.util.AstUtil;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.dom.IExecutableModuleElement;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.lvl.parse.LvlParser;

public class Grid extends AnnotatableModuleElement {

  private static final String KEY_KEYWORD = "key";

  protected IExecutableModuleElement keysBlock;
  protected IExecutableModuleElement headerBlock;
  protected IExecutableModuleElement bodyBlock;

  protected Collection<Object> keys = null;
  protected Collection<String> headers = null;

  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    AST keysAST = AstUtil.getChild(cst, LvlParser.GKEYS);
    keysBlock = (IExecutableModuleElement)
        module.createAst(keysAST.getFirstChild(), this);
    AST headerAST = AstUtil.getChild(cst, LvlParser.GHEADER);
    headerBlock = (IExecutableModuleElement)
        module.createAst(headerAST.getFirstChild(), this);
    AST bodyAST = AstUtil.getChild(cst, LvlParser.GBODY);
    bodyBlock = (IExecutableModuleElement)
        module.createAst(bodyAST.getFirstChild(), this);
  }

  public Collection<String> getHeaders(IEolContext context) {
    if (headers == null) {
      initHeaders(context);
    }
    return headers;
  }

  private void initHeaders(IEolContext context) {
    try {
      initKeys(context);
      headers = new ArrayList<String>();
      for (Object key : keys) {
        context.getFrameStack().put(
            Variable.createReadOnlyVariable(KEY_KEYWORD, key));
        String header = "" + context.getExecutorFactory().execute(headerBlock, context);
        headers.add(header.trim().replaceAll("\\s+", "_"));
      }
    } catch (EolRuntimeException e) {
      e.printStackTrace();
    }
  }

  @SuppressWarnings("unchecked")
  private void initKeys(IEolContext context) {
    if (keys == null) {
      try {
        keys = (Collection<Object>)context.getExecutorFactory().execute(keysBlock, context);
      } catch (EolRuntimeException e) {
        e.printStackTrace();
      }
    }
  }

  public List<String> getCellValues(IEolContext context, String varName, Object obj) {
    initKeys(context);
    List<String> values = new ArrayList<String>();
    context.getFrameStack().put(
        Variable.createReadOnlyVariable(varName, obj));
    for (Object key : keys) {
      context.getFrameStack().put(
          Variable.createReadOnlyVariable(KEY_KEYWORD, key));
      try {
        values.add("" + context.getExecutorFactory().execute(bodyBlock, context));
      } catch (EolRuntimeException e) {
        e.printStackTrace();
      }
    }
    return values;
  }
}
