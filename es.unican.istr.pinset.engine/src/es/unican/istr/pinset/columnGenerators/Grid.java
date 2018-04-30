/*******************************************************************************
 * Copyright (c) 2018 University of York, University of Cantabria.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alfonso de la Vega - initial API and implementation
 ******************************************************************************/
package es.unican.istr.pinset.columnGenerators;

import java.util.ArrayList;
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

import es.unican.istr.pinset.PinsetModule;
import es.unican.istr.pinset.output.ReturnValueParser;
import es.unican.istr.pinset.parse.PinsetParser;

public class Grid extends AnnotatableModuleElement
    implements ColumnGenerator {

  private static final String KEY_VARNAME = "key";

  protected IExecutableModuleElement keysBlock;
  protected IExecutableModuleElement headerBlock;
  protected IExecutableModuleElement bodyBlock;
  protected boolean isSilent = false;

  protected List<Object> keys = null;
  protected List<String> headers = null;

  protected IEolContext context;


  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    AST keysAST = AstUtil.getChild(cst, PinsetParser.GRIDKEYS);
    keysBlock = (IExecutableModuleElement)
        module.createAst(keysAST.getFirstChild(), this);
    AST headerAST = AstUtil.getChild(cst, PinsetParser.GRIDHEADER);
    headerBlock = (IExecutableModuleElement)
        module.createAst(headerAST.getFirstChild(), this);
    AST bodyAST = AstUtil.getChild(cst, PinsetParser.GRIDBODY);
    bodyBlock = (IExecutableModuleElement)
        module.createAst(bodyAST.getFirstChild(), this);
    isSilent = this.hasAnnotation(PinsetModule.SILENT_ANNOTATION);
  }

  public List<String> getNames()
      throws EolRuntimeException {
    if (headers == null) {
      initHeaders();
    }
    return headers;
  }

  private void initHeaders() throws EolRuntimeException {
    initKeys(context);
    headers = new ArrayList<String>();
    context.getFrameStack().enterLocal(FrameType.UNPROTECTED, headerBlock);
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
      context.getFrameStack().enterLocal(FrameType.PROTECTED, keysBlock);
      keys = (List<Object>)ReturnValueParser.obtainValue(
          context.getExecutorFactory().execute(keysBlock, context));
      context.getFrameStack().leaveLocal(keysBlock);
    }
  }

  public List<Object> getValues(Object obj)
      throws EolRuntimeException {
    initKeys(context);
    List<Object> values = new ArrayList<Object>();
    context.getFrameStack().enterLocal(FrameType.UNPROTECTED, bodyBlock);
    for (Object key : keys) {
      context.getFrameStack().put(
          Variable.createReadOnlyVariable(KEY_VARNAME, key));
      Object value = null;
      try {
        value = context.getExecutorFactory().execute(bodyBlock, context);
      } catch (EolRuntimeException e) {
        if (!isSilent) {
          throw e;
        }
      }
      values.add(ReturnValueParser.obtainValue(value));
    }
    context.getFrameStack().leaveLocal(bodyBlock);
    return values;
  }

  public void setContext(IEolContext context) {
    this.context = context;
  }

  public void setSilent(boolean isSilent) {
    this.isSilent |= isSilent;
  }
}
