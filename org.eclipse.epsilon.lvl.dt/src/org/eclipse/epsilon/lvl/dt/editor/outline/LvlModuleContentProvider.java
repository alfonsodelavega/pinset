package org.eclipse.epsilon.lvl.dt.editor.outline;

import java.util.List;

import org.eclipse.epsilon.common.module.ModuleElement;
import org.eclipse.epsilon.eol.dt.editor.outline.EolModuleContentProvider;
import org.eclipse.epsilon.lvl.LvlModule;
import org.eclipse.epsilon.lvl.dom.DatasetRule;

public class LvlModuleContentProvider extends EolModuleContentProvider {

  @Override
  public ModuleElement getFocusedModuleElement(ModuleElement moduleElement) {

    if (moduleElement instanceof DatasetRule) {
      return ((DatasetRule) moduleElement).getParameter();
    }

    return super.getFocusedModuleElement(moduleElement);
  }

  @Override
  public List<ModuleElement> getVisibleChildren(ModuleElement moduleElement) {
    List<ModuleElement> visible = super.getVisibleChildren(moduleElement);

    if (moduleElement.getClass() == LvlModule.class) {
      LvlModule module = (LvlModule) moduleElement;
      visible.addAll(module.getImports());
      visible.addAll(module.getDeclaredModelDeclarations());
      visible.addAll(module.getDeclaredDatasetRules());
      visible.addAll(module.getDeclaredOperations());
    }

    return visible;
  }

}
