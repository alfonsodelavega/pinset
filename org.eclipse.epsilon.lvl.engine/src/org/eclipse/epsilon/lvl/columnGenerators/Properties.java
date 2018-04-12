package org.eclipse.epsilon.lvl.columnGenerators;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.util.AstUtil;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;
import org.eclipse.epsilon.eol.parse.EolParser;
import org.eclipse.epsilon.lvl.output.ReturnValueParser;

public class Properties extends AnnotatableModuleElement {
  protected List<String> properties = new ArrayList<String>();

  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    List<AST> children = AstUtil.getChildren(cst, EolParser.NAME);
    for (AST child : children) {
      properties.add(child.getText());
    }
  }

  public List<String> getNames() {
    return properties;
  }

  public List<String> getValues(Object o, IPropertyGetter getter)
      throws EolRuntimeException {
    List<String> res = new ArrayList<String>();
    for (String prop : properties) {
      res.add(ReturnValueParser.getStringOrBlank(getter.invoke(o, prop)));
    }
    return res;
  }
}
