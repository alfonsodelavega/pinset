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
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;

import es.unican.istr.pinset.output.ReturnValueParser;
import es.unican.istr.pinset.parse.PinsetParser;

public class Properties extends AnnotatableModuleElement
    implements ColumnGenerator {
  protected List<String> properties = new ArrayList<String>();
  protected List<String> columnNames = new ArrayList<String>();
  protected IPropertyGetter getter;
  protected IEolContext context;

  @Override
  public void build(AST cst, IModule module) {
    super.build(cst, module);
    List<AST> aliasedNames =
        AstUtil.getChild(cst, PinsetParser.NAMESLIST).getChildren();
    for (AST aliasedName : aliasedNames) {
      // fill column names: if an alias is defined, use it
      if (aliasedName.getNumberOfChildren() > 0) {
        columnNames.add(aliasedName.getFirstChild().getText());
      } else {
        columnNames.add(aliasedName.getText());
      }
      // keep property name for later access
      properties.add(aliasedName.getText());
    }
  }

  public List<String> getNames() {
    return columnNames;
  }

  public List<Object> getValues(Object elem)
      throws EolRuntimeException {
    List<Object> res = new ArrayList<Object>();
    for (String prop : properties) {
      res.add(ReturnValueParser.obtainValue(getter.invoke(elem, prop, context)));
    }
    return res;
  }

  public void setGetter(IPropertyGetter getter) {
    this.getter = getter;
  }

  public void setContext(IEolContext context) {
    this.context = context;
  }
}
