/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.lvl.dt.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.dt.editor.outline.ModuleContentProvider;
import org.eclipse.epsilon.common.dt.editor.outline.ModuleElementLabelProvider;
import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.lvl.LvlModule;
import org.eclipse.epsilon.eol.dt.editor.EolEditor;
import org.eclipse.epsilon.lvl.dt.editor.outline.LvlModuleContentProvider;
import org.eclipse.epsilon.lvl.dt.editor.outline.LvlModuleElementLabelProvider;

public class LvlEditor extends EolEditor{

  public LvlEditor() {
    templateContributors.add(new LvlEditorStaticTemplateContributor());
  }

  @Override
  public List<String> getKeywords() {

    List<String> lvlKeywords = new ArrayList<String>();
    lvlKeywords.add("dataset");
    lvlKeywords.add("column");
    lvlKeywords.add("over");
    lvlKeywords.add("include");
    lvlKeywords.add("guard");
    lvlKeywords.add("attributes");
    lvlKeywords.add("reference");
    lvlKeywords.addAll(super.getKeywords());

    return lvlKeywords;
  }

  @Override
  public ModuleElementLabelProvider createModuleElementLabelProvider() {
    return new LvlModuleElementLabelProvider();
  }

  @Override
  protected ModuleContentProvider createModuleContentProvider() {
    return new LvlModuleContentProvider();
  }

  @Override
  public IModule createModule(){
    return new LvlModule();
  }

}
