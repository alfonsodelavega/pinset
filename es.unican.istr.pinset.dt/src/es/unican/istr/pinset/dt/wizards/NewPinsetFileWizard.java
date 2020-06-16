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
package es.unican.istr.pinset.dt.wizards;

import org.eclipse.epsilon.common.dt.wizards.AbstractNewFileWizard2;

public class NewPinsetFileWizard extends AbstractNewFileWizard2 {

  @Override
  public String getTitle() {
    return "New Pinset file";
  }

  @Override
  public String getExtension() {
    return "pinset";
  }

  @Override
  public String getDescription() {
    return "This wizard creates a new Pinset file with *.pinset extension.";
  }

}
