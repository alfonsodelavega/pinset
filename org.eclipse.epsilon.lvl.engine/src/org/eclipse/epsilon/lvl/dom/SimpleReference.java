package org.eclipse.epsilon.lvl.dom;

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

public class SimpleReference extends AnnotatableModuleElement {
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

  public String getName() {
    return name;
  }

  public List<String> getFeatures() {
    return features;
  }

  public boolean includesAllAttributes() {
    return includesAllAttributes;
  }

  public void validate(Object ou, IPropertyGetter getter,
      Iterator<?> iterator, String type) throws EolRuntimeException {
    if (!getter.hasProperty(ou, name)) {
      throw new EolRuntimeException("Feature " + name +
          " not found in type " + type);
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
          throw new EolRuntimeException("Feature " + feat +
              " not found in type of reference " + name);
        }
      }
    }
  }

  public void populateFeatures(EClass eClass) {
    EReference eRef = (EReference)eClass.getEStructuralFeature(name);
    for (EAttribute attr : eRef.getEReferenceType().getEAttributes()) {
      features.add(attr.getName());
    }
  }
}
