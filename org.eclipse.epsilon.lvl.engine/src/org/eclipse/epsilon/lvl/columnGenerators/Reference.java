package org.eclipse.epsilon.lvl.columnGenerators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.util.AstUtil;
import org.eclipse.epsilon.eol.dom.AnnotatableModuleElement;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;
import org.eclipse.epsilon.eol.parse.EolParser;
import org.eclipse.epsilon.lvl.output.ReturnValueParser;

public class Reference extends AnnotatableModuleElement {
  protected String name;
  protected List<String> features = new ArrayList<String>();
  protected boolean includesAllAttributes = false;

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
    if (features.isEmpty()) {
      includesAllAttributes = true;
    }
  }

  public boolean includesAllAttributes() {
    return includesAllAttributes;
  }

  public void validate(Object ou, IPropertyGetter getter,
      Iterator<?> iterator, String type) throws EolRuntimeException {
    if (!getter.hasProperty(ou, name)) {
      throw new EolRuntimeException(
          String.format("Feature %s not found in type %s", name, type));
    }
    // We need a valid object from the reference to check its features
    // we could do it with emf too, but this is independent of any tech
    Object refObject = null;
    while (refObject == null && iterator.hasNext()) {
      ou = iterator.next();
      refObject = getter.invoke(ou, name);
    }
    if (refObject != null) {
      for (String feat : features) {
        if (!getter.hasProperty(refObject, feat)) {
          throw new EolRuntimeException(String.format(
              "Feature %s not found in type of reference %s", feat, name));
        }
      }
    }
  }

  public void populateFeatures(EClass referencingEClass) {
    EReference eRef = (EReference)referencingEClass.getEStructuralFeature(name);
    for (EAttribute attr : eRef.getEReferenceType().getEAttributes()) {
      features.add(attr.getName());
    }
  }

  public List<String> getNames() {
    List<String> res = new ArrayList<String>();
    for (String feature : features) {
      res.add(name + "_" + feature);
    }
    return res;
  }

  public List<String> getValues(Object o, IPropertyGetter getter)
      throws EolRuntimeException {
    List<String> res = new ArrayList<String>();
    Object refObject = getter.invoke(o, name);
    if (refObject == null) {
      // No object present in reference, blank for all columns
      for (int i = 0; i < features.size(); i++) {
        res.add("");
      }
    } else {
      for (String feature : features) {
        res.add(ReturnValueParser.getStringOrBlank(
            getter.invoke(refObject, feature)));
      }
    }
    return res;
  }
}
