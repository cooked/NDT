package sc.ndt.editor.fast.ui.wizard.old.wiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IPluginRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.osgi.util.TextProcessor;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.IPluginContribution;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.activities.IActivityManager;
import org.eclipse.ui.activities.IIdentifier;
import org.eclipse.ui.activities.IWorkbenchActivitySupport;
import org.eclipse.ui.activities.WorkbenchActivityHelper;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.dialogs.WizardNewProjectReferencePage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.undo.CreateFileOperation;
import org.eclipse.ui.ide.undo.CreateFolderOperation;
import org.eclipse.ui.ide.undo.CreateProjectOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.eclipse.ui.internal.IPreferenceConstants;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.ide.DialogUtil;
import org.eclipse.ui.internal.ide.IDEInternalPreferences;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.internal.ide.StatusUtil;
import org.eclipse.ui.internal.ide.dialogs.CreateLinkedResourceGroup;
import org.eclipse.ui.internal.ide.misc.ResourceAndContainerGroup;
import org.eclipse.ui.internal.registry.PerspectiveDescriptor;
import org.eclipse.ui.internal.util.PrefUtil;
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

//import poliwind.editors.cplambda.CpLambdaEditorInput;
import sc.pwdt.cpl.builder.CplMBModelBuilder;
import sc.pwdt.cpl.builder.CplNature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.cdt.ui.newui.UIMessages;

public class CplProjectWizard extends CplCommonProjectWizard {

	// temp
	// root level
	String[] rootFolder = { "MB_Model", "RUN", "Wind" };
	String[] projectFolder = { "S", "P", "U", "F" };
	String[] sFile = { "Static" };
	String[] pFile = { "Eigenvalues", "CpLambdaCurves" };
	String[] uFile = { "DLC_1.1", "DLC_1.2", "DLC_1.3" };
	String[] fFile = { "DLC_2.1", "DLC_2.2", "DLC_2.3" };

	private IFile newBaseFile;

	public CplProjectWizard() {
		super(UIMessages.getString("NewModelProjectWizard.4"), //$NON-NLS-1$
				UIMessages.getString("NewModelProjectWizard.5")); //$NON-NLS-1$
	}

	@Override
	public boolean canFinish() {
		// if (fMainPage.h_selected != null) {
		// if(!fMainPage.h_selected.canFinish())
		// return false;
		// String s = fMainPage.h_selected.getErrorMessage();
		// if (s != null) return false;
		// }
		// return super.canFinish();
		return true;
	}

	@Override
	public String[] getNatures() {
		return new String[] { CProjectNature.C_NATURE_ID };
	}

	@Override
	protected IProject continueCreation(IProject prj) {
		if (continueCreationMonitor == null) {
			continueCreationMonitor = new NullProgressMonitor();
		}

		try {
			continueCreationMonitor.beginTask(UIMessages.getString("CProjectWizard.0"), 1); //$NON-NLS-1$
			// addNature(prj, "sc.pwdt.cpl.nature.run", new
			// SubProgressMonitor(continueCreationMonitor, 1));
		} finally {
			continueCreationMonitor.done();
		}
		return prj;
	}

	@Override
	public String[] getContentTypeIDs() {
		return new String[] { CCorePlugin.CONTENT_TYPE_CSOURCE,
				CCorePlugin.CONTENT_TYPE_CHEADER };
	}

	private void addNature(IProjectDescription desc, String id) {
		String[] natures = desc.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = id;
		desc.setNatureIds(newNatures);
	}
	private void addBuilder(IProjectDescription desc, String id) {
		ICommand[] commands = desc.getBuildSpec();
		for (int i = 0; i < commands.length; ++i)
			if (commands[i].getBuilderName().equals(id))
				return;
		// add builder to project
		ICommand command = desc.newCommand();
		command.setBuilderName(id);
		ICommand[] nc = new ICommand[commands.length + 1];
		// Add it before other builders.
		System.arraycopy(commands, 0, nc, 1, commands.length);
		nc[0] = command;
		desc.setBuildSpec(nc);
	}
		
	
	@Override
	public boolean performFinish() {

		createNewProject();
		if (newProject == null)
			return false;

		// createNewProjectFileBase();
		createNewProjectFileExtended();
		createNewProjectFolderExtended();
		
		IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
		// IWorkingSet[] workingSets = page1.getSelectedWorkingSets();
		// getWorkbench().getWorkingSetManager().addToWorkingSets(newProject,workingSets);
		try {
			// Open editor on new file.
			if (dw != null) {
				IWorkbenchPage page = dw.getActivePage();
				if (page != null)
					IDE.openEditor(page, newBaseFile, true);
				// if (page != null)
				// IDE.openEditor(page, newBaseFile, true);
				// test open Analysis
				// IDE.openEditor(page, new CpLambdaEditorInput(),
				// "CpLambda Editor.was", true);
			}
		} catch (PartInitException e) {
			DialogUtil.openError(dw.getShell(),ResourceMessages.FileResource_errorMessage, e.getMessage(),e);
		}
		
		// updatePerspective();
		selectAndReveal(newProject);
		return true;

	}
		
	private IProject createNewProject() {
		if (newProject != null)
			return newProject;

		// get a project handle
		final IProject newProjectHandle = page1.getProjectHandle();

		// get a project descriptor
		URI location = null;
		if (!page1.useDefaults())
			location = page1.getLocationURI();

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProjectDescription description = workspace
				.newProjectDescription(newProjectHandle.getName());
		description.setLocationURI(location);

		// add CpLambda nature and builder
		addNature(description, CplNature.NATURE_ID);
		addBuilder(description, CplMBModelBuilder.BUILDER_ID);

		// create the new project operation
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				CreateProjectOperation op = new CreateProjectOperation(
						description, "CpLambda");
				try {
					PlatformUI.getWorkbench().getOperationSupport()
							.getOperationHistory().execute(
									op,
									monitor,
									WorkspaceUndoUtil
											.getUIInfoAdapter(getShell()));
				} catch (ExecutionException e) {
					throw new InvocationTargetException(e);
				}
			}
		};

		// run the new project creation operation
		try {
			getContainer().run(true, true, op);
		} catch (InterruptedException e) {
			return null;
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			if (t instanceof ExecutionException
					&& t.getCause() instanceof CoreException) {
				CoreException cause = (CoreException) t.getCause();
				StatusAdapter status;
				if (cause.getStatus().getCode() == IResourceStatus.CASE_VARIANT_EXISTS) {
					status = new StatusAdapter(
							StatusUtil
									.newStatus(
											IStatus.WARNING,
											NLS
													.bind(
															ResourceMessages.NewProject_caseVariantExistsError,
															newProjectHandle
																	.getName()),
											cause));
				} else {
					status = new StatusAdapter(StatusUtil.newStatus(cause
							.getStatus().getSeverity(),
							ResourceMessages.NewProject_errorMessage, cause));
				}
				status.setProperty(StatusAdapter.TITLE_PROPERTY,
						ResourceMessages.NewProject_errorMessage);
				StatusManager.getManager().handle(status, StatusManager.BLOCK);
			} else {
				StatusAdapter status = new StatusAdapter(new Status(
						IStatus.WARNING, IDEWorkbenchPlugin.IDE_WORKBENCH, 0,
						NLS.bind(ResourceMessages.NewProject_internalError, t
								.getMessage()), t));
				status.setProperty(StatusAdapter.TITLE_PROPERTY,
						ResourceMessages.NewProject_errorMessage);
				StatusManager.getManager().handle(status,
						StatusManager.LOG | StatusManager.BLOCK);
			}
			return null;
		}

		newProject = newProjectHandle;

		return newProject;
	}
	
//	private IProject createNewProject() {
//		if (newProject != null)
//			return newProject;
//
//		// get a project handle
//		final IProject newProjectHandle = fMainPage.getProjectHandle();
//
//		// get a project descriptor
//		URI location = null;
//		if (!fMainPage.useDefaults())
//			location = fMainPage.getLocationURI();
//
//		IWorkspace workspace = ResourcesPlugin.getWorkspace();
//		final IProjectDescription description = workspace
//				.newProjectDescription(newProjectHandle.getName());
//		description.setLocationURI(location);
//
//		// add CpLambda RUN nature and builder
//		addNature(description, CplRunNature.NATURE_ID);
//		// addBuilder(description, CplMBModelBuilder.BUILDER_ID);
//
//		// create the new project operation
//		IRunnableWithProgress op = new IRunnableWithProgress() {
//			public void run(IProgressMonitor monitor)
//					throws InvocationTargetException {
//				CreateProjectOperation op = new CreateProjectOperation(
//						description, "CpLambda");
//				try {
//					PlatformUI.getWorkbench().getOperationSupport()
//							.getOperationHistory().execute(
//									op,
//									monitor,
//									WorkspaceUndoUtil
//											.getUIInfoAdapter(getShell()));
//				} catch (ExecutionException e) {
//					throw new InvocationTargetException(e);
//				}
//			}
//		};
//
//		// run the new project creation operation
//		try {
//			getContainer().run(true, true, op);
//		} catch (InterruptedException e) {
//			return null;
//		} catch (InvocationTargetException e) {
//			Throwable t = e.getTargetException();
//			if (t instanceof ExecutionException
//					&& t.getCause() instanceof CoreException) {
//				CoreException cause = (CoreException) t.getCause();
//				StatusAdapter status;
//				if (cause.getStatus().getCode() == IResourceStatus.CASE_VARIANT_EXISTS) {
//					status = new StatusAdapter(
//							StatusUtil
//									.newStatus(
//											IStatus.WARNING,
//											NLS
//													.bind(
//															ResourceMessages.NewProject_caseVariantExistsError,
//															newProjectHandle
//																	.getName()),
//											cause));
//				} else {
//					status = new StatusAdapter(StatusUtil.newStatus(cause
//							.getStatus().getSeverity(),
//							ResourceMessages.NewProject_errorMessage, cause));
//				}
//				status.setProperty(StatusAdapter.TITLE_PROPERTY,
//						ResourceMessages.NewProject_errorMessage);
//				StatusManager.getManager().handle(status, StatusManager.BLOCK);
//			} else {
//				StatusAdapter status = new StatusAdapter(new Status(
//						IStatus.WARNING, IDEWorkbenchPlugin.IDE_WORKBENCH, 0,
//						NLS.bind(ResourceMessages.NewProject_internalError, t
//								.getMessage()), t));
//				status.setProperty(StatusAdapter.TITLE_PROPERTY,
//						ResourceMessages.NewProject_errorMessage);
//				StatusManager.getManager().handle(status,
//						StatusManager.LOG | StatusManager.BLOCK);
//			}
//			return null;
//		}
//
//		newProject = newProjectHandle;
//
//		return newProject;
//	}

	private void createNewProjectFileBase() {
		IPath filePath = (new Path(TextProcessor.deprocess(fMainPage.getProjectName()
				+ File.separator + fMainPage.getProjectName() + ".was"))).makeAbsolute();
		IFile fileHandle = createFileHandle(filePath);
		newBaseFile = createNewFile(fileHandle, null);
//		IPath filePath = (new Path(TextProcessor.deprocess(page1.getProjectName()
//				+ File.separator + "MBModelAssemblyTest.was"))).makeAbsolute();
//		IFile fileHandle = createFileHandle(filePath);
//		newBaseFile = createNewFile(fileHandle, null);
	}
	
	private void createNewProjectFileExtended() {
		String projName = fMainPage.getProjectName();
		//String projName = page1.getProjectName();
		IPath path = null;
		
		String[] files = { "Beam.dat", "FixedFrames.dat" };
		for (String file : files) {
			IPath filePath = (new Path(TextProcessor.deprocess(page1
					.getProjectName()
					+ File.separator + file))).makeAbsolute();
			IFile fileHandle = createFileHandle(filePath);
			createNewFile(fileHandle, null);
		}
		
		
		for (String sf : sFile) {
			path = (new Path(TextProcessor.deprocess(projName + File.separator
					+ projectFolder[0] + File.separator + sf + File.separator
					+ sf + ".was"))).makeAbsolute();
			createNewFile(createFileHandle(path), null);
		}
		for (String pf : pFile) {
			path = (new Path(TextProcessor.deprocess(projName + File.separator
					+ projectFolder[1] + File.separator + pf + File.separator
					+ pf + ".was"))).makeAbsolute();
			createNewFile(createFileHandle(path), null);
		}
		for (String uf : uFile) {
			path = (new Path(TextProcessor.deprocess(projName + File.separator
					+ projectFolder[2] + File.separator + uf + File.separator
					+ uf + ".was"))).makeAbsolute();
			createNewFile(createFileHandle(path), null);
		}
		for (String ff : fFile) {
			path = (new Path(TextProcessor.deprocess(projName + File.separator
					+ projectFolder[3] + File.separator + ff + File.separator
					+ ff + ".was"))).makeAbsolute();
			createNewFile(createFileHandle(path), null);
		}

	}
	
		

	private void createNewProjectFolderExtended() {
		
		/// TODO
		String projName = page1.getProjectName();
		//String projName = fMainPage.getProjectName();
		
		IPath path = null;
		
		

		for (int i = 0; i < projectFolder.length; i++) {
			path = (new Path(TextProcessor.deprocess(projName + File.separator
					+ projectFolder[i])));
			createNewFolder(createFolderHandle(path));
		}
		
		
		// TODO take data from wizard about DLCs to create!!!
		for (String fold : projectFolder) {
			String t = projName + File.separator + fold;
			path = (new Path(TextProcessor.deprocess(t)));
			createNewFolder(createFolderHandle(path));
		}
		for (String fold : sFile) {
			path = (new Path(TextProcessor.deprocess(projName + File.separator
					+ projectFolder[0] + File.separator + fold)));
			createNewFolder(createFolderHandle(path));
		}
		for (String fold : pFile) {
			path = (new Path(TextProcessor.deprocess(projName + File.separator
					+ projectFolder[1] + File.separator + fold)));
			createNewFolder(createFolderHandle(path));
		}
		for (String fold : uFile) {
			path = (new Path(TextProcessor.deprocess(projName + File.separator
					+ projectFolder[2] + File.separator + fold)));
			createNewFolder(createFolderHandle(path));
		}
		for (String fold : fFile) {
			path = (new Path(TextProcessor.deprocess(projName + File.separator
					+ projectFolder[3] + File.separator + fold)));
			createNewFolder(createFolderHandle(path));
		}
	}

	// this is "custom folder creation"
	public IFolder createNewFolder(final IFolder newFolderHandle) {

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) {
				CreateFolderOperation op = new CreateFolderOperation(
						newFolderHandle, null,
						IDEWorkbenchMessages.WizardNewFolderCreationPage_title);
				try {
					PlatformUI.getWorkbench().getOperationSupport()
							.getOperationHistory().execute(
									op,
									monitor,
									WorkspaceUndoUtil
											.getUIInfoAdapter(getShell()));
				} catch (final ExecutionException e) {
					getContainer().getShell().getDisplay().syncExec(
							new Runnable() {
								public void run() {
									if (e.getCause() instanceof CoreException) {
										ErrorDialog
												.openError(
														getContainer()
																.getShell(),
														IDEWorkbenchMessages.WizardNewFolderCreationPage_errorTitle,
														null,
														((CoreException) e
																.getCause())
																.getStatus());
									} else {
										IDEWorkbenchPlugin
												.log(
														getClass(),
														"createNewFile()", e.getCause()); //$NON-NLS-1$
										MessageDialog
												.openError(
														getContainer()
																.getShell(),
														IDEWorkbenchMessages.WizardNewFolderCreationPage_internalErrorTitle,
														NLS
																.bind(
																		IDEWorkbenchMessages.WizardNewFileCreationPage_internalErrorMessage,
																		e
																				.getCause()
																				.getMessage()));
									}
								}
							});
				}
			}
		};
		try {
			getContainer().run(true, true, op);
		} catch (InterruptedException e) {
			return null;
		} catch (InvocationTargetException e) {
			// Execution Exceptions are handled above but we may still get
			// unexpected runtime errors.
			IDEWorkbenchPlugin.log(getClass(),
					"createNewFile()", e.getTargetException()); //$NON-NLS-1$
			MessageDialog
					.openError(
							getContainer().getShell(),
							IDEWorkbenchMessages.WizardNewFolderCreationPage_internalErrorTitle,
							NLS
									.bind(
											IDEWorkbenchMessages.WizardNewFileCreationPage_internalErrorMessage,
											e.getTargetException().getMessage()));
			return null;
		}
		return newFolderHandle;
	}

	// this is "custom file creation"
	public IFile createNewFile(final IFile newFileHandle,
			final InputStream initialContents) {

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) {
				CreateFileOperation op = new CreateFileOperation(newFileHandle,
						null, initialContents,
						IDEWorkbenchMessages.WizardNewFileCreationPage_title);
				try {
					PlatformUI.getWorkbench().getOperationSupport()
							.getOperationHistory().execute(
									op,
									monitor,
									WorkspaceUndoUtil
											.getUIInfoAdapter(getShell()));
				} catch (final ExecutionException e) {
					getContainer().getShell().getDisplay().syncExec(
							new Runnable() {
								public void run() {
									if (e.getCause() instanceof CoreException) {
										ErrorDialog
												.openError(
														getContainer()
																.getShell(),
														IDEWorkbenchMessages.WizardNewFileCreationPage_errorTitle,
														null,
														((CoreException) e
																.getCause())
																.getStatus());
									} else {
										IDEWorkbenchPlugin
												.log(
														getClass(),
														"createNewFile()", e.getCause()); //$NON-NLS-1$
										MessageDialog
												.openError(
														getContainer()
																.getShell(),
														IDEWorkbenchMessages.WizardNewFileCreationPage_internalErrorTitle,
														NLS
																.bind(
																		IDEWorkbenchMessages.WizardNewFileCreationPage_internalErrorMessage,
																		e
																				.getCause()
																				.getMessage()));
									}
								}
							});
				}
			}
		};
		try {
			getContainer().run(true, true, op);
		} catch (InterruptedException e) {
			return null;
		} catch (InvocationTargetException e) {
			// Execution Exceptions are handled above but we may still get
			// unexpected runtime errors.
			IDEWorkbenchPlugin.log(getClass(),
					"createNewFile()", e.getTargetException()); //$NON-NLS-1$
			MessageDialog
					.openError(
							getContainer().getShell(),
							IDEWorkbenchMessages.WizardNewFileCreationPage_internalErrorTitle,
							NLS
									.bind(
											IDEWorkbenchMessages.WizardNewFileCreationPage_internalErrorMessage,
											e.getTargetException().getMessage()));
			return null;
		}
		return newFileHandle;
	}

	

	// protected void updatePerspective() {
	// updatePerspective(configElement);
	// }
	//
	// public static void updatePerspective(IConfigurationElement configElement)
	// {
	// // Do not change perspective if the configuration element is not
	// specified.
	// if (configElement == null)
	// return;
	//
	// // Retrieve the new project open perspective preference setting
	// String perspSetting =
	// PrefUtil.getAPIPreferenceStore().getString(IDE.Preferences.PROJECT_OPEN_NEW_PERSPECTIVE);
	// String promptSetting =
	// IDEWorkbenchPlugin.getDefault().getPreferenceStore().getString(IDEInternalPreferences.PROJECT_SWITCH_PERSP_MODE);
	//
	// // Return if do not switch perspective setting and are not prompting
	// if (!(promptSetting.equals(MessageDialogWithToggle.PROMPT)) &&
	// perspSetting.equals(IWorkbenchPreferenceConstants.NO_NEW_PERSPECTIVE))
	// return;
	//
	// // Read the requested perspective id to be opened.
	// String finalPerspId = configElement.getAttribute("Analysis");
	// if (finalPerspId == null)
	// return;
	//
	// // Map perspective id to descriptor.
	// IPerspectiveRegistry reg =
	// PlatformUI.getWorkbench().getPerspectiveRegistry();
	//
	// // leave this code in - the perspective of a given project may map to
	// activities other than those that the wizard itself maps to.
	// IPerspectiveDescriptor finalPersp =
	// reg.findPerspectiveWithId(finalPerspId);
	// if (finalPersp != null && finalPersp instanceof IPluginContribution) {
	// IPluginContribution contribution = (IPluginContribution) finalPersp;
	// if (contribution.getPluginId() != null) {
	// IWorkbenchActivitySupport workbenchActivitySupport =
	// PlatformUI.getWorkbench().getActivitySupport();
	// IActivityManager activityManager =
	// workbenchActivitySupport.getActivityManager();
	// IIdentifier identifier =
	// activityManager.getIdentifier(WorkbenchActivityHelper.createUnifiedId(contribution));
	// Set idActivities = identifier.getActivityIds();
	// if (!idActivities.isEmpty()) {
	// Set enabledIds = new HashSet(activityManager.getEnabledActivityIds());
	// if (enabledIds.addAll(idActivities))
	// workbenchActivitySupport.setEnabledActivityIds(enabledIds);
	// }
	// }
	// } else {
	// IDEWorkbenchPlugin.log("Unable to find persective "+finalPerspId+" in BasicNewProjectResourceWizard.updatePerspective");
	// return;
	// }
	//
	// // gather the preferred perspectives always consider the final
	// perspective (and those derived from it) to be preferred
	// ArrayList preferredPerspIds = new ArrayList();
	// addPerspectiveAndDescendants(preferredPerspIds, finalPerspId);
	// String preferred = configElement.getAttribute("Analysis");
	// if (preferred != null) {
	//		StringTokenizer tok = new StringTokenizer(preferred, " \t\n\r\f,"); //$NON-NLS-1$
	// while (tok.hasMoreTokens())
	// addPerspectiveAndDescendants(preferredPerspIds, tok.nextToken());
	// }
	//
	// IWorkbenchWindow window =
	// PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	// if (window != null) {
	// IWorkbenchPage page = window.getActivePage();
	// if (page != null) {
	// IPerspectiveDescriptor currentPersp = page.getPerspective();
	// // don't switch if the current perspective is a preferred perspective
	// if (currentPersp != null &&
	// preferredPerspIds.contains(currentPersp.getId()))
	// return;
	// }
	// // prompt the user to switch
	// if (!confirmPerspectiveSwitch(window, finalPersp))
	// return;
	// }
	//
	// int workbenchPerspectiveSetting =
	// WorkbenchPlugin.getDefault().getPreferenceStore().getInt(IPreferenceConstants.OPEN_PERSP_MODE);
	// // open perspective in new window setting
	// if (workbenchPerspectiveSetting == IPreferenceConstants.OPM_NEW_WINDOW) {
	// openInNewWindow(finalPersp);
	// return;
	// }
	// // replace active perspective setting otherwise
	// replaceCurrentPerspective(finalPersp);
	// }

	//
	// private static void addPerspectiveAndDescendants(List
	// perspectiveIds,String id) {
	// IPerspectiveRegistry registry =
	// PlatformUI.getWorkbench().getPerspectiveRegistry();
	// IPerspectiveDescriptor[] perspectives = registry.getPerspectives();
	// for (int i = 0; i < perspectives.length; i++) {
	// // @issue illegal ref to workbench internal class; consider adding
	// getOriginalId() as API on IPerspectiveDescriptor
	// PerspectiveDescriptor descriptor = ((PerspectiveDescriptor)
	// perspectives[i]);
	// if (descriptor.getOriginalId().equals(id)) {
	// perspectiveIds.add(descriptor.getId());
	// }
	// }
	// }
	//
	// private static boolean confirmPerspectiveSwitch(IWorkbenchWindow
	// window,IPerspectiveDescriptor finalPersp) {
	// IPreferenceStore store =
	// IDEWorkbenchPlugin.getDefault().getPreferenceStore();
	// String pspm =
	// store.getString(IDEInternalPreferences.PROJECT_SWITCH_PERSP_MODE);
	// if (!IDEInternalPreferences.PSPM_PROMPT.equals(pspm)) {
	// // Return whether or not we should always switch
	// return IDEInternalPreferences.PSPM_ALWAYS.equals(pspm);
	// }
	// String desc = finalPersp.getDescription();
	// String message;
	// if (desc == null || desc.length() == 0)
	// message = NLS.bind(ResourceMessages.NewProject_perspSwitchMessage,
	// finalPersp.getLabel());
	// else
	// message =
	// NLS.bind(ResourceMessages.NewProject_perspSwitchMessageWithDesc,
	// new String[] { finalPersp.getLabel(), desc });
	//
	// MessageDialogWithToggle dialog =
	// MessageDialogWithToggle.openYesNoQuestion(window.getShell(),
	// ResourceMessages.NewProject_perspSwitchTitle, message,
	// null /* use the default message for the toggle */,false /* toggle is
	// initially unchecked */, store,
	// IDEInternalPreferences.PROJECT_SWITCH_PERSP_MODE);
	// int result = dialog.getReturnCode();
	//
	// // If we are not going to prompt anymore propogate the choice.
	// if (dialog.getToggleState()) {
	// String preferenceValue;
	// if (result == IDialogConstants.YES_ID) {
	// // Doesn't matter if it is replace or new window as we are going to use
	// the open perspective setting
	// preferenceValue = IWorkbenchPreferenceConstants.OPEN_PERSPECTIVE_REPLACE;
	// } else {
	// preferenceValue = IWorkbenchPreferenceConstants.NO_NEW_PERSPECTIVE;
	// }
	//
	// // update PROJECT_OPEN_NEW_PERSPECTIVE to correspond
	// PrefUtil.getAPIPreferenceStore().setValue(IDE.Preferences.PROJECT_OPEN_NEW_PERSPECTIVE,preferenceValue);
	// }
	// return result == IDialogConstants.YES_ID;
	// }
	//
	// private static void replaceCurrentPerspective(IPerspectiveDescriptor
	// persp) {
	//
	// // Get the active page.
	// IWorkbenchWindow window =
	// PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	// if (window == null) {
	// return;
	// }
	// IWorkbenchPage page = window.getActivePage();
	// if (page == null) {
	// return;
	// }
	//
	// // Set the perspective.
	// page.setPerspective(persp);
	// }
	//
	// private static void openInNewWindow(IPerspectiveDescriptor desc) {
	//
	// // Open the page.
	// try {
	// PlatformUI.getWorkbench().openWorkbenchWindow(desc.getId(),ResourcesPlugin.getWorkspace().getRoot());
	// } catch (WorkbenchException e) {
	// IWorkbenchWindow window =
	// PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	// if (window != null) {
	// ErrorDialog.openError(window.getShell(), "Error", e.getMessage(),
	// e.getStatus());
	// }
	// }
	// }
	//
	// //@Override
	// public void setInitializationData(IConfigurationElement cfig, String
	// propertyName, Object data) {
	// configElement = cfig;
	// }
	//
	// /**
	// * Selects and reveals the newly added resource in all parts
	// * of the active workbench window's active page.
	// *
	// * @see ISetSelectionTarget
	// */
	// protected void selectAndReveal(IResource newResource) {
	// selectAndReveal(newResource, getWorkbench().getActiveWorkbenchWindow());
	// }
	//
	// /**
	// * Attempts to select and reveal the specified resource in all
	// * parts within the supplied workbench window's active page.
	// * <p>
	// * Checks all parts in the active page to see if they implement
	// <code>ISetSelectionTarget</code>,
	// * either directly or as an adapter. If so, tells the part to select and
	// reveal the
	// * specified resource.
	// * </p>
	// *
	// * @param resource the resource to be selected and revealed
	// * @param window the workbench window to select and reveal the resource
	// *
	// * @see ISetSelectionTarget
	// */
	// public static void selectAndReveal(IResource resource, IWorkbenchWindow
	// window) {
	// // validate the input
	// if (window == null || resource == null) {
	// return;
	// }
	// IWorkbenchPage page = window.getActivePage();
	// if (page == null) {
	// return;
	// }
	//
	// // get all the view and editor parts
	// List parts = new ArrayList();
	// IWorkbenchPartReference refs[] = page.getViewReferences();
	// for (int i = 0; i < refs.length; i++) {
	// IWorkbenchPart part = refs[i].getPart(false);
	// if (part != null) {
	// parts.add(part);
	// }
	// }
	// refs = page.getEditorReferences();
	// for (int i = 0; i < refs.length; i++) {
	// if (refs[i].getPart(false) != null) {
	// parts.add(refs[i].getPart(false));
	// }
	// }
	//
	// final ISelection selection = new StructuredSelection(resource);
	// Iterator itr = parts.iterator();
	// while (itr.hasNext()) {
	// IWorkbenchPart part = (IWorkbenchPart) itr.next();
	//
	// // get the part's ISetSelectionTarget implementation
	// ISetSelectionTarget target = null;
	// if(part instanceof ISetSelectionTarget)
	// target = (ISetSelectionTarget) part;
	// else
	// target = (ISetSelectionTarget)
	// part.getAdapter(ISetSelectionTarget.class);
	//
	// if(target != null) {
	// // select and reveal resource
	// final ISetSelectionTarget finalTarget = target;
	// window.getShell().getDisplay().asyncExec(new Runnable() {
	// public void run() {
	// finalTarget.selectReveal(selection);
	// }
	// });
	// }
	// }
	// }
	//
	//
	protected IFile createFileHandle(IPath filePath) {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(filePath);
	}

	protected IFolder createFolderHandle(IPath folderPath) {
		return ResourcesPlugin.getWorkspace().getRoot().getFolder(folderPath);
	}

	//
	//
	//
	// //"icons/accept.png"
	// public InputStream createInitContent(IPath path) {
	// // InputStream fis = null;
	// // String ext = path.getFileExtension();
	// //
	// // String templateName = AudioConstants.TEMPLATES_REGISTRY.get(ext);
	// // IPath template = new Path("/resources/templates/"+templateName);
	// // // open input
	// // try {
	// // fis = FileLocator.openStream(CpLambdaPlugin.getDefault().getBundle(),
	// template, false);
	// // fillInitContent(fis);
	// // } catch (FileNotFoundException e) {
	// // e.printStackTrace();
	// // } catch (IOException e) {
	// // e.printStackTrace();
	// // }
	// return null;
	// }
	//
	// public void fillInitContent(InputStream is) {
	// //int index = AudioConstants.EXTENSION_REGISTRY.indexOf(ext);
	// //switch(index) {
	// //IAnalysis tree = (IAnalysis)XMLEngine.getDefault().fromXML(is);
	// //int i = 1;
	// }
	// }

	private WizardNewProjectCreationPage page1;
	// private WizardNewFileCreationPage page2;
	// private ProjectLoudspeakerWizardPage3 page3;
	private IStructuredSelection selection;
	private IWorkbench workbench;

	// cache of newly-created project
	private IProject newProject;
	//private IFile newBaseFile;
	private IConfigurationElement configElement;

//	public CplMBModelProjectWizard() {
//	}

	// @Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}

	public IStructuredSelection getSelection() {
		return selection;
	}

	public IWorkbench getWorkbench() {
		return workbench;
	}

	@Override
	public void addPages() {
		// super.addPages();
		page1 = new WizardNewProjectCreationPage("basicNewProjectPage") {
			public void createControl(Composite parent) {
				super.createControl(parent);
				// this add the composite for the workingset
				createWorkingSetGroup(
						(Composite) getControl(),
						getSelection(),
						new String[] { "org.eclipse.ui.resourceWorkingSetPage" });
				// this add a composite where user can specify project main file
				// name
				Dialog.applyDialogFont(getControl());
			}
		};
		page1.setTitle("New CpLambda Project");
		// page1.setImageDescriptor(CplActivatore.getImageDescriptor("icons/bitcons/flag.gif"));
		page1.setDescription("Creates a new CpLambda project.");
		this.addPage(page1);

		// page3 = new ProjectLoudspeakerWizardPage3(selection);
		// this.addPage(page3);
	}

	

	

	protected void updatePerspective() {
		updatePerspective(configElement);
	}

	public static void updatePerspective(IConfigurationElement configElement) {
		// Do not change perspective if the configuration element is not
		// specified.
		if (configElement == null)
			return;

		// Retrieve the new project open perspective preference setting
		String perspSetting = PrefUtil.getAPIPreferenceStore().getString(
				IDE.Preferences.PROJECT_OPEN_NEW_PERSPECTIVE);
		String promptSetting = IDEWorkbenchPlugin.getDefault()
				.getPreferenceStore().getString(
						IDEInternalPreferences.PROJECT_SWITCH_PERSP_MODE);

		// Return if do not switch perspective setting and are not prompting
		if (!(promptSetting.equals(MessageDialogWithToggle.PROMPT))
				&& perspSetting
						.equals(IWorkbenchPreferenceConstants.NO_NEW_PERSPECTIVE))
			return;

		// Read the requested perspective id to be opened.
		String finalPerspId = configElement.getAttribute("Analysis");
		if (finalPerspId == null)
			return;

		// Map perspective id to descriptor.
		IPerspectiveRegistry reg = PlatformUI.getWorkbench()
				.getPerspectiveRegistry();

		// leave this code in - the perspective of a given project may map to
		// activities other than those that the wizard itself maps to.
		IPerspectiveDescriptor finalPersp = reg
				.findPerspectiveWithId(finalPerspId);
		if (finalPersp != null && finalPersp instanceof IPluginContribution) {
			IPluginContribution contribution = (IPluginContribution) finalPersp;
			if (contribution.getPluginId() != null) {
				IWorkbenchActivitySupport workbenchActivitySupport = PlatformUI
						.getWorkbench().getActivitySupport();
				IActivityManager activityManager = workbenchActivitySupport
						.getActivityManager();
				IIdentifier identifier = activityManager
						.getIdentifier(WorkbenchActivityHelper
								.createUnifiedId(contribution));
				Set idActivities = identifier.getActivityIds();
				if (!idActivities.isEmpty()) {
					Set enabledIds = new HashSet(activityManager
							.getEnabledActivityIds());
					if (enabledIds.addAll(idActivities))
						workbenchActivitySupport
								.setEnabledActivityIds(enabledIds);
				}
			}
		} else {
			IDEWorkbenchPlugin.log("Unable to find persective " + finalPerspId
					+ " in BasicNewProjectResourceWizard.updatePerspective");
			return;
		}

		// gather the preferred perspectives always consider the final
		// perspective (and those derived from it) to be preferred
		ArrayList preferredPerspIds = new ArrayList();
		addPerspectiveAndDescendants(preferredPerspIds, finalPerspId);
		String preferred = configElement.getAttribute("Analysis");
		if (preferred != null) {
			StringTokenizer tok = new StringTokenizer(preferred, " \t\n\r\f,"); //$NON-NLS-1$
			while (tok.hasMoreTokens())
				addPerspectiveAndDescendants(preferredPerspIds, tok.nextToken());
		}

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			IWorkbenchPage page = window.getActivePage();
			if (page != null) {
				IPerspectiveDescriptor currentPersp = page.getPerspective();
				// don't switch if the current perspective is a preferred
				// perspective
				if (currentPersp != null
						&& preferredPerspIds.contains(currentPersp.getId()))
					return;
			}
			// prompt the user to switch
			if (!confirmPerspectiveSwitch(window, finalPersp))
				return;
		}

		int workbenchPerspectiveSetting = WorkbenchPlugin.getDefault()
				.getPreferenceStore().getInt(
						IPreferenceConstants.OPEN_PERSP_MODE);
		// open perspective in new window setting
		if (workbenchPerspectiveSetting == IPreferenceConstants.OPM_NEW_WINDOW) {
			openInNewWindow(finalPersp);
			return;
		}
		// replace active perspective setting otherwise
		replaceCurrentPerspective(finalPersp);
	}

	private static void addPerspectiveAndDescendants(List perspectiveIds,
			String id) {
		IPerspectiveRegistry registry = PlatformUI.getWorkbench()
				.getPerspectiveRegistry();
		IPerspectiveDescriptor[] perspectives = registry.getPerspectives();
		for (int i = 0; i < perspectives.length; i++) {
			// @issue illegal ref to workbench internal class; consider adding
			// getOriginalId() as API on IPerspectiveDescriptor
			PerspectiveDescriptor descriptor = ((PerspectiveDescriptor) perspectives[i]);
			if (descriptor.getOriginalId().equals(id)) {
				perspectiveIds.add(descriptor.getId());
			}
		}
	}

	private static boolean confirmPerspectiveSwitch(IWorkbenchWindow window,
			IPerspectiveDescriptor finalPersp) {
		IPreferenceStore store = IDEWorkbenchPlugin.getDefault()
				.getPreferenceStore();
		String pspm = store
				.getString(IDEInternalPreferences.PROJECT_SWITCH_PERSP_MODE);
		if (!IDEInternalPreferences.PSPM_PROMPT.equals(pspm)) {
			// Return whether or not we should always switch
			return IDEInternalPreferences.PSPM_ALWAYS.equals(pspm);
		}
		String desc = finalPersp.getDescription();
		String message;
		if (desc == null || desc.length() == 0)
			message = NLS.bind(ResourceMessages.NewProject_perspSwitchMessage,
					finalPersp.getLabel());
		else
			message = NLS.bind(
					ResourceMessages.NewProject_perspSwitchMessageWithDesc,
					new String[] { finalPersp.getLabel(), desc });

		MessageDialogWithToggle dialog = MessageDialogWithToggle
				.openYesNoQuestion(window.getShell(),
						ResourceMessages.NewProject_perspSwitchTitle, message,
						null /* use the default message for the toggle */,
						false /* toggle is initially unchecked */, store,
						IDEInternalPreferences.PROJECT_SWITCH_PERSP_MODE);
		int result = dialog.getReturnCode();

		// If we are not going to prompt anymore propogate the choice.
		if (dialog.getToggleState()) {
			String preferenceValue;
			if (result == IDialogConstants.YES_ID) {
				// Doesn't matter if it is replace or new window as we are going
				// to use the open perspective setting
				preferenceValue = IWorkbenchPreferenceConstants.OPEN_PERSPECTIVE_REPLACE;
			} else {
				preferenceValue = IWorkbenchPreferenceConstants.NO_NEW_PERSPECTIVE;
			}

			// update PROJECT_OPEN_NEW_PERSPECTIVE to correspond
			PrefUtil.getAPIPreferenceStore().setValue(
					IDE.Preferences.PROJECT_OPEN_NEW_PERSPECTIVE,
					preferenceValue);
		}
		return result == IDialogConstants.YES_ID;
	}

	private static void replaceCurrentPerspective(IPerspectiveDescriptor persp) {

		// Get the active page.
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window == null) {
			return;
		}
		IWorkbenchPage page = window.getActivePage();
		if (page == null) {
			return;
		}

		// Set the perspective.
		page.setPerspective(persp);
	}

	private static void openInNewWindow(IPerspectiveDescriptor desc) {

		// Open the page.
		try {
			PlatformUI.getWorkbench().openWorkbenchWindow(desc.getId(),
					ResourcesPlugin.getWorkspace().getRoot());
		} catch (WorkbenchException e) {
			IWorkbenchWindow window = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow();
			if (window != null) {
				ErrorDialog.openError(window.getShell(), "Error", e
						.getMessage(), e.getStatus());
			}
		}
	}

	// @Override
	public void setInitializationData(IConfigurationElement cfig,
			String propertyName, Object data) {
		configElement = cfig;
	}

	/**
	 * Selects and reveals the newly added resource in all parts of the active
	 * workbench window's active page.
	 * 
	 * @see ISetSelectionTarget
	 */
	protected void selectAndReveal(IResource newResource) {
		selectAndReveal(newResource, getWorkbench().getActiveWorkbenchWindow());
	}

	/**
	 * Attempts to select and reveal the specified resource in all parts within
	 * the supplied workbench window's active page.
	 * <p>
	 * Checks all parts in the active page to see if they implement
	 * <code>ISetSelectionTarget</code>, either directly or as an adapter. If
	 * so, tells the part to select and reveal the specified resource.
	 * </p>
	 * 
	 * @param resource
	 *            the resource to be selected and revealed
	 * @param window
	 *            the workbench window to select and reveal the resource
	 * 
	 * @see ISetSelectionTarget
	 */
	public static void selectAndReveal(IResource resource,
			IWorkbenchWindow window) {
		// validate the input
		if (window == null || resource == null) {
			return;
		}
		IWorkbenchPage page = window.getActivePage();
		if (page == null) {
			return;
		}

		// get all the view and editor parts
		List parts = new ArrayList();
		IWorkbenchPartReference refs[] = page.getViewReferences();
		for (int i = 0; i < refs.length; i++) {
			IWorkbenchPart part = refs[i].getPart(false);
			if (part != null) {
				parts.add(part);
			}
		}
		refs = page.getEditorReferences();
		for (int i = 0; i < refs.length; i++) {
			if (refs[i].getPart(false) != null) {
				parts.add(refs[i].getPart(false));
			}
		}

		final ISelection selection = new StructuredSelection(resource);
		Iterator itr = parts.iterator();
		while (itr.hasNext()) {
			IWorkbenchPart part = (IWorkbenchPart) itr.next();

			// get the part's ISetSelectionTarget implementation
			ISetSelectionTarget target = null;
			if (part instanceof ISetSelectionTarget)
				target = (ISetSelectionTarget) part;
			else
				target = (ISetSelectionTarget) part
						.getAdapter(ISetSelectionTarget.class);

			if (target != null) {
				// select and reveal resource
				final ISetSelectionTarget finalTarget = target;
				window.getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						finalTarget.selectReveal(selection);
					}
				});
			}
		}
	}

//	private void createNewProjectFolderExtended() {
//
//		String projName = page1.getProjectName();
//		IPath path = null;
//
//		String[] projectFolder = { "MB_Model", "Run" };
//
//		for (int i = 0; i < projectFolder.length; i++) {
//			path = (new Path(TextProcessor.deprocess(projName + File.separator
//					+ projectFolder[i])));
//			createNewFolder(createFolderHandle(path));
//		}
//	}

	// this is "custom folder creation"
//	public IFolder createNewFolder(final IFolder newFolderHandle) {
//
//		IRunnableWithProgress op = new IRunnableWithProgress() {
//			public void run(IProgressMonitor monitor) {
//				CreateFolderOperation op = new CreateFolderOperation(
//						newFolderHandle, null,
//						IDEWorkbenchMessages.WizardNewFolderCreationPage_title);
//				try {
//					PlatformUI.getWorkbench().getOperationSupport()
//							.getOperationHistory().execute(
//									op,
//									monitor,
//									WorkspaceUndoUtil
//											.getUIInfoAdapter(getShell()));
//				} catch (final ExecutionException e) {
//					getContainer().getShell().getDisplay().syncExec(
//							new Runnable() {
//								public void run() {
//									if (e.getCause() instanceof CoreException) {
//										ErrorDialog
//												.openError(
//														getContainer()
//																.getShell(),
//														IDEWorkbenchMessages.WizardNewFolderCreationPage_errorTitle,
//														null,
//														((CoreException) e
//																.getCause())
//																.getStatus());
//									} else {
//										IDEWorkbenchPlugin
//												.log(
//														getClass(),
//														"createNewFile()", e.getCause()); //$NON-NLS-1$
//										MessageDialog
//												.openError(
//														getContainer()
//																.getShell(),
//														IDEWorkbenchMessages.WizardNewFolderCreationPage_internalErrorTitle,
//														NLS
//																.bind(
//																		IDEWorkbenchMessages.WizardNewFileCreationPage_internalErrorMessage,
//																		e
//																				.getCause()
//																				.getMessage()));
//									}
//								}
//							});
//				}
//			}
//		};
//		try {
//			getContainer().run(true, true, op);
//		} catch (InterruptedException e) {
//			return null;
//		} catch (InvocationTargetException e) {
//			// Execution Exceptions are handled above but we may still get
//			// unexpected runtime errors.
//			IDEWorkbenchPlugin.log(getClass(),
//					"createNewFile()", e.getTargetException()); //$NON-NLS-1$
//			MessageDialog
//					.openError(
//							getContainer().getShell(),
//							IDEWorkbenchMessages.WizardNewFolderCreationPage_internalErrorTitle,
//							NLS
//									.bind(
//											IDEWorkbenchMessages.WizardNewFileCreationPage_internalErrorMessage,
//											e.getTargetException().getMessage()));
//			return null;
//		}
//		return newFolderHandle;
//	}

	// this is "custom file creation"
//	public IFile createNewFile(final IFile newFileHandle,
//			final InputStream initialContents) {
//
//		IRunnableWithProgress op = new IRunnableWithProgress() {
//			public void run(IProgressMonitor monitor) {
//				CreateFileOperation op = new CreateFileOperation(newFileHandle,
//						null, initialContents,
//						IDEWorkbenchMessages.WizardNewFileCreationPage_title);
//				try {
//					PlatformUI.getWorkbench().getOperationSupport()
//							.getOperationHistory().execute(
//									op,
//									monitor,
//									WorkspaceUndoUtil
//											.getUIInfoAdapter(getShell()));
//				} catch (final ExecutionException e) {
//					getContainer().getShell().getDisplay().syncExec(
//							new Runnable() {
//								public void run() {
//									if (e.getCause() instanceof CoreException) {
//										ErrorDialog
//												.openError(
//														getContainer()
//																.getShell(),
//														IDEWorkbenchMessages.WizardNewFileCreationPage_errorTitle,
//														null,
//														((CoreException) e
//																.getCause())
//																.getStatus());
//									} else {
//										IDEWorkbenchPlugin
//												.log(
//														getClass(),
//														"createNewFile()", e.getCause()); //$NON-NLS-1$
//										MessageDialog
//												.openError(
//														getContainer()
//																.getShell(),
//														IDEWorkbenchMessages.WizardNewFileCreationPage_internalErrorTitle,
//														NLS
//																.bind(
//																		IDEWorkbenchMessages.WizardNewFileCreationPage_internalErrorMessage,
//																		e
//																				.getCause()
//																				.getMessage()));
//									}
//								}
//							});
//				}
//			}
//		};
//		try {
//			getContainer().run(true, true, op);
//		} catch (InterruptedException e) {
//			return null;
//		} catch (InvocationTargetException e) {
//			// Execution Exceptions are handled above but we may still get
//			// unexpected runtime errors.
//			IDEWorkbenchPlugin.log(getClass(),
//					"createNewFile()", e.getTargetException()); //$NON-NLS-1$
//			MessageDialog
//					.openError(
//							getContainer().getShell(),
//							IDEWorkbenchMessages.WizardNewFileCreationPage_internalErrorTitle,
//							NLS
//									.bind(
//											IDEWorkbenchMessages.WizardNewFileCreationPage_internalErrorMessage,
//											e.getTargetException().getMessage()));
//			return null;
//		}
//		return newFileHandle;
//	}

	// "icons/accept.png"
	public InputStream createInitContent(IPath path) {
		// InputStream fis = null;
		// String ext = path.getFileExtension();
		//	
		// String templateName = AudioConstants.TEMPLATES_REGISTRY.get(ext);
		// IPath template = new Path("/resources/templates/"+templateName);
		// // open input
		// try {
		// fis = FileLocator.openStream(CpLambdaPlugin.getDefault().getBundle(),
		// template, false);
		// fillInitContent(fis);
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		return null;
	}

	public void fillInitContent(InputStream is) {
		// int index = AudioConstants.EXTENSION_REGISTRY.indexOf(ext);
		// switch(index) {
		// IAnalysis tree = (IAnalysis)XMLEngine.getDefault().fromXML(is);
		// int i = 1;
	}
}
