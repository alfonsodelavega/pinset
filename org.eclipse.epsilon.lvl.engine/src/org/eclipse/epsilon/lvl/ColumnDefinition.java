package org.eclipse.epsilon.lvl;

import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.dom.IExecutableModuleElement;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.Return;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;

public class ColumnDefinition extends AnnotatableModuleElement {

  protected String name;
  protected IExecutableModuleElement block;

  public String getName() {
    return name;
  }
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

  public Object execute(IEolContext context, String varName, Object obj) {
    Object res = null;
    context.getFrameStack().put(
        Variable.createReadOnlyVariable(varName, obj));
    try{
      res = context.getExecutorFactory().execute(block, context);
    } catch (EolRuntimeException r) {
      res = "";
    }
    if (res != null) {
      if (res instanceof Return) {
        return ((Return)res).getValue();
      }
    }
    return res;
  }

}
