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
package org.eclipse.epsilon.lvl.dt.launching;

import org.eclipse.epsilon.common.module.ModuleElement;
import org.eclipse.epsilon.eol.dt.debug.EolDebugger;
import org.eclipse.epsilon.lvl.dom.DatasetRule;

public class LvlDebugger extends EolDebugger {

  public LvlDebugger() {
    super();
  }

  @Override
  protected boolean isStructuralBlock(ModuleElement ast) {
    return super.isStructuralBlock(ast) || ast instanceof DatasetRule;
  }

}
