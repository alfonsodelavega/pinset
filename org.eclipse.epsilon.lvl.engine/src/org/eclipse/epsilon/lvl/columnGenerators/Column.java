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
import org.eclipse.epsilon.lvl.LvlModule;
import org.eclipse.epsilon.lvl.output.ReturnValueParser;

public class Column extends AnnotatableModuleElement
    implements ColumnGenerator {

  protected String name;
  protected IExecutableModuleElement block;
  protected boolean isSilent = false;

  protected IEolContext context;


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
    isSilent = this.hasAnnotation(LvlModule.SILENT_ANNOTATION);
  }

  public List<String> getNames() {
    return Arrays.asList(getName());
  }

  public String getName() {
    return name;
  }

  public List<Object> getValues(Object elem) throws EolRuntimeException {
    return Arrays.asList(getValue(elem));
  }

  private Object getValue(Object obj)
      throws EolRuntimeException {
    context.getFrameStack().enterLocal(FrameType.UNPROTECTED, block);
    Object res = null;
    try {
      res = context.getExecutorFactory().execute(block, context);
    } catch (EolRuntimeException e) {
      if (!isSilent) {
        throw e;
      }
    }
    context.getFrameStack().leaveLocal(block);
    return ReturnValueParser.obtainValue(res);
  }

  public void setContext(IEolContext context) {
    this.context = context;
  }

  public void setSilent(boolean isSilent) {
    this.isSilent |= isSilent;
  }
}
