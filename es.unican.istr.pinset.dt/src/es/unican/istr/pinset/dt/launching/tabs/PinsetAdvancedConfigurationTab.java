package es.unican.istr.pinset.dt.launching.tabs;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.epsilon.common.dt.EpsilonPlugin;
import org.eclipse.epsilon.common.dt.launching.tabs.AbstractAdvancedConfigurationTab;

import es.unican.istr.pinset.dt.PinsetPlugin;

public class PinsetAdvancedConfigurationTab extends AbstractAdvancedConfigurationTab {

  @Override
  public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
  }

  @Override
  public EpsilonPlugin getPlugin() {
    return PinsetPlugin.getDefault();
  }

  @Override
  public String getLanguage(ILaunchConfiguration configuration) {
    return getLanguage();
  }

  public String getLanguage() {
    return "Pinset";
  }
}
