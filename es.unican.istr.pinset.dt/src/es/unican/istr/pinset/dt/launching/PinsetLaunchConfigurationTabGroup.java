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
package es.unican.istr.pinset.dt.launching;

import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.epsilon.common.dt.launching.tabs.EpsilonLaunchConfigurationTabGroup;

import es.unican.istr.pinset.dt.launching.tabs.PinsetAdvancedConfigurationTab;
import es.unican.istr.pinset.dt.launching.tabs.PinsetOutputConfigurationTab;
import es.unican.istr.pinset.dt.launching.tabs.PinsetSourceConfigurationTab;

public class PinsetLaunchConfigurationTabGroup extends EpsilonLaunchConfigurationTabGroup{

  @Override
  public ILaunchConfigurationTab getSourceConfigurationTab() {
    return new PinsetSourceConfigurationTab();
  }

  @Override
  public ILaunchConfigurationTab[] getOtherConfigurationTabs() {
    return new ILaunchConfigurationTab[]{new PinsetOutputConfigurationTab()};
  }

  @Override
  public ILaunchConfigurationTab getAdvancedConfigurationTab() {
    return new PinsetAdvancedConfigurationTab();
  }

}
