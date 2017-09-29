package org.eclipse.epsilon.lvl;

import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.dom.IExecutableModuleElement;

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

}
