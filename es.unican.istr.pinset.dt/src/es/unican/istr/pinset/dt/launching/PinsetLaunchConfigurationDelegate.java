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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.dt.debug.EolDebugger;
import org.eclipse.epsilon.eol.dt.launching.EpsilonLaunchConfigurationDelegate;

import es.unican.istr.pinset.PinsetModule;
import es.unican.istr.pinset.dt.launching.tabs.PinsetOutputConfigurationTab;

public class PinsetLaunchConfigurationDelegate extends EpsilonLaunchConfigurationDelegate {

  @Override
  public IEolModule createModule() {
    PinsetModule module = new PinsetModule();
    if (configuration != null) {
      try {
        IFile file =
            ResourcesPlugin.getWorkspace()
                           .getRoot()
                           .getFile(new Path(configuration.getAttribute(
                               PinsetOutputConfigurationTab.OUTPUT_FOLDER,
                               PinsetOutputConfigurationTab.DEFAULT_OUTPUT_FOLDER)));
        String outputFolder = file.getRawLocation().toOSString();
        module.setOutputFolder(outputFolder);
        module.setSilent(configuration.getAttribute(
            PinsetOutputConfigurationTab.SILENT_EXECUTION,
            PinsetOutputConfigurationTab.DEFAULT_SILENT_EXECUTION));
      } catch (CoreException e) {
        e.printStackTrace();
      }
    }
    return module;
  }

  @Override
  protected EolDebugger createDebugger() {
    return new PinsetDebugger();
  }

}
