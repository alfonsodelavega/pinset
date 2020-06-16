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
package es.unican.istr.pinset.dt.launching.tabs;

import org.eclipse.epsilon.common.dt.EpsilonPlugin;
import org.eclipse.epsilon.common.dt.launching.tabs.AbstractSourceConfigurationTab;

import es.unican.istr.pinset.dt.PinsetPlugin;

public class PinsetSourceConfigurationTab extends AbstractSourceConfigurationTab {

  @Override
  public EpsilonPlugin getPlugin() {
    return PinsetPlugin.getDefault();
  }

  @Override
  public String getImagePath() {
    return "icons/edl.png";
  }

  @Override
  public String getFileExtension() {
    return "pinset";
  }

  @Override
  public String getSelectionTitle() {
    return "Select a Pinset file";
  }

  @Override
  public String getSelectionSubtitle() {
    return "Pinset files in Workspace";
  }

  public String getLaunchConfigurationKey() {
    return "SOURCE";
  }

}
