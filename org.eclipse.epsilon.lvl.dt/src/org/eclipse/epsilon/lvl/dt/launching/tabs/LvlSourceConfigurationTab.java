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
package org.eclipse.epsilon.lvl.dt.launching.tabs;

import org.eclipse.epsilon.common.dt.EpsilonPlugin;
import org.eclipse.epsilon.common.dt.launching.AbstractSourceConfigurationTab;
import org.eclipse.epsilon.lvl.dt.LvlPlugin;

public class LvlSourceConfigurationTab extends AbstractSourceConfigurationTab{

  @Override
  public EpsilonPlugin getPlugin() {
    return LvlPlugin.getDefault();
  }

  @Override
  public String getImagePath() {
    return "icons/edl.png";
  }

  @Override
  public String getFileExtension() {
    return "lvl";
  }

  @Override
  public String getSelectionTitle() {
    return "Select an LVL file";
  }

  @Override
  public String getSelectionSubtitle() {
    return "LVL files in Workspace";
  }

  public String getLaunchConfigurationKey() {
    return "SOURCE";
  }

}
