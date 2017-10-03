package org.eclipse.epsilon.lvl.dt.launching.tabs;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public class LvlOutputConfigurationTab
    extends AbstractLaunchConfigurationTab implements ModifyListener {

  protected Label folderLabel;
  protected Text folderPath;
  protected Composite extras;

  public void createControl(Composite parent) {

    FillLayout parentLayout = new FillLayout();
    parent.setLayout(parentLayout);

    Composite control = new Composite(parent, SWT.NONE);
    setControl(control);

    GridLayout controlLayout = new GridLayout(1, false);
    control.setLayout(controlLayout);

    final Group outputGroup = createGroup(control,
        "Introduce a folder for the generated output", 1);

    GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
    folderPath = new Text(outputGroup, SWT.BORDER);
    folderPath.setLayoutData(filePathData);
    folderPath.addModifyListener(this);

    extras = new Composite(control, SWT.NONE);
    GridData extrasData = new GridData(GridData.FILL_BOTH);
    extrasData.horizontalSpan = 1;
    extras.setLayoutData(extrasData);

    control.setBounds(0, 0, 300, 300);
    control.layout();
    control.pack();

    canSave();
  }

  protected Group createGroup(Composite control, String name, int numberOfColumns) {
    final Group group = new Group(control, SWT.SHADOW_ETCHED_IN);
    group.setLayout(new GridLayout(numberOfColumns, false));
    group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    group.setText(name);
    return group;
  }

  @Override
  public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    folderPath.setText(getDefaultFolderText());
  }

  @Override
  public void initializeFrom(ILaunchConfiguration configuration) {
    try {
      folderPath.setText(configuration.getAttribute(getOutputAttributeName(),
          getDefaultFolderText()));
      canSave();
      updateLaunchConfigurationDialog();
    } catch (CoreException e) {
      // Ignore
    }
  }

  public String getActiveEditorPath() {
    IWorkbench wb = PlatformUI.getWorkbench();
    IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
    IWorkbenchPage page = win.getActivePage();
    IEditorPart part = page.getActiveEditor();
    if (part.getEditorInput() instanceof FileEditorInput) {
      FileEditorInput fileEditorInput = (FileEditorInput) part.getEditorInput();
      String path = fileEditorInput.getFile().getParent().getFullPath().toString();
      return path;
    }
    return "";
  }

  @Override
  public void performApply(ILaunchConfigurationWorkingCopy configuration) {
    configuration.setAttribute(getOutputAttributeName(), folderPath.getText());
  }

  @Override
  public boolean canSave() {
    IFolder folder = null;
    try {
      folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(
          new Path(folderPath.getText()));
    }
    catch (Exception ex) {
      // do nothing
    }
    if (folder == null || !folder.exists()){
      setErrorMessage("Selected folder "
          + folderPath.getText() + " does not exist");
      return false;
    } else {
      setErrorMessage(null);
      return true;
    }
  }

  @Override
  public void modifyText(ModifyEvent e) {
    canSave();
    updateLaunchConfigurationDialog();
  }

  @Override
  public String getName() {
    return getTitle();
  }

  public String getTitle() {
    return "Output";
  }

  public String getOutputAttributeName() {
    return getOutputFolder();
  }

  public static String getOutputFolder() {
    return "outputFolder";
  }

  private String getDefaultFolderText() {
    return "";
  }
}
