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
package org.eclipse.epsilon.lvl.dt.editor.outline;

import org.eclipse.epsilon.eol.dt.editor.outline.EolModuleElementLabelProvider;
import org.eclipse.epsilon.lvl.DatasetRule;
import org.eclipse.epsilon.lvl.dt.LvlPlugin;
import org.eclipse.swt.graphics.Image;

public class LvlModuleElementLabelProvider extends EolModuleElementLabelProvider {

  @Override
  public Image getImage(Object element) {
    if (element instanceof DatasetRule) {
      return LvlPlugin.getDefault().createImage("icons/process-rule.png");
    } else {
      return super.getImage(element);
    }
  }

  @Override
  public String getText(Object element) {
    if (element instanceof DatasetRule) {
      DatasetRule processRule = (DatasetRule) element;
      return processRule.getParameter().getName() + " : " +
        processRule.getParameter().getTypeName();
    }
    return super.getText(element);
  }
}
