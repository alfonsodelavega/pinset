package org.eclipse.epsilon.lvl.columnGenerators;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.util.AstUtil;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;
import org.eclipse.epsilon.lvl.output.ReturnValueParser;
import org.eclipse.epsilon.lvl.parse.LvlParser;

public class Properties extends AnnotatableModuleElement
    implements ColumnGenerator {
  protected List<String> properties = new ArrayList<String>();
  protected IPropertyGetter getter;

  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    List<AST> children =
        AstUtil.getChild(cst, LvlParser.NAMESLIST).getChildren();
    for (AST child : children) {
      properties.add(child.getText());
    }
  }

  public List<String> getNames() {
    return properties;
  }

  public List<String> getValues(Object elem)
      throws EolRuntimeException {
    List<String> res = new ArrayList<String>();
    for (String prop : properties) {
      res.add(ReturnValueParser.getStringOrBlank(getter.invoke(elem, prop)));
    }
    return res;
  }

  public void setGetter(IPropertyGetter getter) {
    this.getter = getter;
  }
}