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

public class Reference extends AnnotatableModuleElement
      implements ColumnGenerator {
  protected String name;
  protected List<String> properties = new ArrayList<String>();
  protected IPropertyGetter getter;

  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    name = (String) cst.getFirstChild().getText();
    List<AST> children =
        AstUtil.getChild(cst, LvlParser.NAMESLIST).getChildren();
    for (AST child : children) {
      properties.add(child.getText());
    }
  }

  public List<String> getNames() {
    List<String> res = new ArrayList<String>();
    for (String feature : properties) {
      res.add(name + "_" + feature);
    }
    return res;
  }

  public List<Object> getValues(Object o)
      throws EolRuntimeException {
    List<Object> res = new ArrayList<Object>();
    Object refObject = getter.invoke(o, name);
    if (refObject == null) {
      // No object present in reference, blank for all columns
      for (int i = 0; i < properties.size(); i++) {
        res.add("");
      }
    } else {
      for (String prop : properties) {
        res.add(ReturnValueParser.obtainValue(
            getter.invoke(refObject, prop)));
      }
    }
    return res;
  }

  public void setGetter(IPropertyGetter getter) {
    this.getter = getter;
  }
}
