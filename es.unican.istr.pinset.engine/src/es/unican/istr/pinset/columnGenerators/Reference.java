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
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;

import es.unican.istr.pinset.output.ReturnValueParser;
import es.unican.istr.pinset.parse.PinsetParser;

public class Reference extends AnnotatableModuleElement
      implements ColumnGenerator {
  protected String name;
  protected List<String> columnNames = new ArrayList<String>();
  protected List<String> properties = new ArrayList<String>();
  protected IPropertyGetter getter;

  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    name = (String) cst.getFirstChild().getText();
    List<AST> aliasedNames =
        AstUtil.getChild(cst, PinsetParser.NAMESLIST).getChildren();
    for (AST aliasedName : aliasedNames) {
      // fill column names: if an alias is defined, use it
      if (aliasedName.getNumberOfChildren() > 0) {
        columnNames.add(aliasedName.getFirstChild().getText());
      } else {
        columnNames.add(name + "_" + aliasedName.getText());
      }
      // keep property name for later access
      properties.add(aliasedName.getText());
    }
  }

  public List<String> getNames() {
    return columnNames;
  }

  public List<Object> getValues(Object o)
      throws EolRuntimeException {
    List<Object> res = new ArrayList<Object>();
    Object refObject = getter.invoke(o, name);
    if (refObject == null) {
      // No object present in reference, blank for all columns
      for (int i = 0; i < properties.size(); i++) {
        res.add(null);
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
