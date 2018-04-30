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
package es.unican.istr.pinset.dt.editor.outline;

import java.util.List;

import org.eclipse.epsilon.common.module.ModuleElement;
import org.eclipse.epsilon.eol.dt.editor.outline.EolModuleContentProvider;

import es.unican.istr.pinset.PinsetModule;
import es.unican.istr.pinset.dom.DatasetRule;

public class PinsetModuleContentProvider extends EolModuleContentProvider {

  @Override
  public ModuleElement getFocusedModuleElement(ModuleElement moduleElement) {

    if (moduleElement instanceof DatasetRule) {
      return ((DatasetRule) moduleElement).getParameter();
    }

    return super.getFocusedModuleElement(moduleElement);
  }

  @Override
  public List<ModuleElement> getVisibleChildren(ModuleElement moduleElement) {
    List<ModuleElement> visible = super.getVisibleChildren(moduleElement);

    if (moduleElement.getClass() == PinsetModule.class) {
      PinsetModule module = (PinsetModule) moduleElement;
      visible.addAll(module.getImports());
      visible.addAll(module.getDeclaredModelDeclarations());
      visible.addAll(module.getDeclaredDatasetRules());
      visible.addAll(module.getDeclaredOperations());
    }

    return visible;
  }

}
