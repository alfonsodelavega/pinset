package org.eclipse.epsilon.lvl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.util.AstUtil;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.parse.EolParser;

public class SimpleReference extends AnnotatableModuleElement {
  protected String name;
  protected List<String> features = new ArrayList<String>();

  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    name = (String) cst.getFirstChild().getText();
    // skip the first children as it is the name of the reference
    List<AST> children = AstUtil.getChildren(cst, EolParser.NAME);
    children.remove(0);
    for (AST feature : children) {
      features.add(feature.getText());
    }
  }

  public String getName() {
    return name;
  }

  public List<String> getFeatures() {
    return features;
  }
}
