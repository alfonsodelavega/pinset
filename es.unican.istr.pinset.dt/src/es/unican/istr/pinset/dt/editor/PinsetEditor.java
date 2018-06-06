/*******************************************************************************
 * Copyright (c) 2018 University of York, University of Cantabria.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dimitrios Kolovos - initial API and EDL demo implementation
 *     Alfonso de la Vega - initial API and implementation
 ******************************************************************************/
package es.unican.istr.pinset.dt.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.dt.editor.outline.ModuleContentProvider;
import org.eclipse.epsilon.common.dt.editor.outline.ModuleElementLabelProvider;
import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.eol.dt.editor.EolEditor;

import es.unican.istr.pinset.PinsetModule;
import es.unican.istr.pinset.dt.editor.outline.PinsetModuleContentProvider;
import es.unican.istr.pinset.dt.editor.outline.PinsetModuleElementLabelProvider;

public class PinsetEditor extends EolEditor{

  public PinsetEditor() {
  }

  @Override
  public List<String> getKeywords() {
    List<String> keywords = new ArrayList<String>();
    keywords.add("pre");
    keywords.add("post");
    keywords.add("dataset");
    keywords.add("over");
    keywords.add("from");
    keywords.add("guard");
    keywords.add("properties");
    keywords.add("reference");
    keywords.add("column");
    keywords.add("grid");
    keywords.add("keys");
    keywords.add("header");
    keywords.add("body");
    keywords.add("as");
    keywords.addAll(super.getKeywords());
    return keywords;
  }

  @Override
  public ModuleElementLabelProvider createModuleElementLabelProvider() {
    return new PinsetModuleElementLabelProvider();
  }

  @Override
  protected ModuleContentProvider createModuleContentProvider() {
    return new PinsetModuleContentProvider();
  }

  @Override
  public IModule createModule(){
    return new PinsetModule();
  }

}
