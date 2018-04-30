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

import org.eclipse.epsilon.eol.dt.editor.outline.EolModuleElementLabelProvider;
import org.eclipse.swt.graphics.Image;

import es.unican.istr.pinset.dom.DatasetRule;
import es.unican.istr.pinset.dt.PinsetPlugin;

public class PinsetModuleElementLabelProvider extends EolModuleElementLabelProvider {

  @Override
  public Image getImage(Object element) {
    if (element instanceof DatasetRule) {
      return PinsetPlugin.getDefault().createImage("icons/process-rule.png");
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
