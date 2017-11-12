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
package org.eclipse.epsilon.lvl.dt.launching;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.dt.debug.EolDebugger;
import org.eclipse.epsilon.eol.dt.launching.EpsilonLaunchConfigurationDelegate;
import org.eclipse.epsilon.lvl.LvlModule;
import org.eclipse.epsilon.lvl.dt.launching.tabs.LvlOutputConfigurationTab;

public class LvlLaunchConfigurationDelegate extends EpsilonLaunchConfigurationDelegate {

  @Override
  public IEolModule createModule() {
    LvlModule module = new LvlModule();
    if (configuration != null) {
      try {
        String workspacePath = ResourcesPlugin.getWorkspace()
                                              .getRoot()
                                              .getLocation()
                                              .toString();
        String outputFolder = workspacePath + configuration.getAttribute(
                LvlOutputConfigurationTab.OUTPUT_FOLDER,
                LvlOutputConfigurationTab.DEFAULT_OUTPUT_FOLDER);
        module.setOutputFolder(outputFolder);
        module.setSilent(configuration.getAttribute(
            LvlOutputConfigurationTab.SILENT_EXECUTION,
            LvlOutputConfigurationTab.DEFAULT_SILENT_EXECUTION));
      } catch (CoreException e) {
        e.printStackTrace();
      }
    }
    return module;
  }

  @Override
  protected EolDebugger createDebugger() {
    return new LvlDebugger();
  }

}
