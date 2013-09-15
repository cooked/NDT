/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package sc.nrel.nwtc.fast.debug.ui.launchConfigurations;

 
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;

import sc.nrel.nwtc.fast.internal.debug.FREIDebugUIPlugin;
import sc.nrel.nwtc.fast.internal.debug.ui.LauncherMessages;
import sc.nrel.nwtc.fast.internal.debug.ui.fres.FREDescriptor;
import sc.nrel.nwtc.fast.internal.debug.ui.fres.FREsComboBlock;
import sc.nrel.nwtc.fast.launching.FASTRuntime;
import sc.nrel.nwtc.fast.launching.IFASTInstall;
import sc.nrel.nwtc.fast.launching.IFASTLaunchConfigurationConstants;

//import core.IFASTProject;

/**
 * A launch configuration tab that displays and edits the VM install 
 * launch configuration attributes.
 * <p>
 * Clients may call {@link #setHelpContextId(String)} on this tab prior to control
 * creation to alter the default context help associated with this tab. 
 * </p>
 * <p>
 * This class may be instantiated.
 * </p>
 * @since 2.0
 * @noextend This class is not intended to be sub-classed by clients.
 */

public class FastFRETab extends AbstractLaunchConfigurationTab /*FastLaunchTab*/ {
	
	// JRE Block
	protected FREsComboBlock fJREBlock;
	
	// Dynamic JRE UI widgets
	protected ILaunchConfigurationTab fDynamicTab;
	protected Composite fDynamicTabHolder;
	protected boolean fUseDynamicArea = true;
	
	protected ILaunchConfigurationWorkingCopy fWorkingCopy;
	protected ILaunchConfiguration fLaunchConfiguration;
	
	// State
	protected boolean fIsInitializing = false;
	
	// Selection changed listener (checked JRE)
	private IPropertyChangeListener fCheckListener = new IPropertyChangeListener() {
		public void propertyChange(PropertyChangeEvent event) {
			handleSelectedJREChanged();
		}
	};
	
	/**
	 * Constructor
	 */
	public FastFRETab() {
		//setHelpContextId(IJavaDebugHelpContextIds.LAUNCH_CONFIGURATION_DIALOG_JRE_TAB);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
		if (fJREBlock != null) {
			fJREBlock.removePropertyChangeListener(fCheckListener);
		}
	}

	/**
	 * @see ILaunchConfigurationTab#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Font font = parent.getFont();
		Composite topComp = SWTFactory.createComposite(parent, font, 1, 1, GridData.FILL_HORIZONTAL, 0, 0);
		setDynamicTabHolder(SWTFactory.createComposite(topComp, font, 1, 1, GridData.FILL_BOTH, 0, 0));
		setControl(topComp);
		
		fJREBlock = new FREsComboBlock(true);
		fJREBlock.setDefaultFREDescriptor(getDefaultFREDescriptor());
		fJREBlock.setSpecificFREDescriptor(getSpecificFREDescriptor());
		fJREBlock.createControl(topComp);
		Control control = fJREBlock.getControl();
		fJREBlock.addPropertyChangeListener(fCheckListener);
		control.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), getHelpContextId());
	}

	protected void setDynamicTabHolder(Composite tabHolder) {
		this.fDynamicTabHolder = tabHolder;
	}

	protected Composite getDynamicTabHolder() {
		return fDynamicTabHolder;
	}

	protected void setDynamicTab(ILaunchConfigurationTab tab) {
		fDynamicTab = tab;
	}

	protected ILaunchConfigurationTab getDynamicTab() {
		return fDynamicTab;
	}

	/**
	 * @see ILaunchConfigurationTab#setDefaults(ILaunchConfigurationWorkingCopy)
	 */
	public void setDefaults(ILaunchConfigurationWorkingCopy config) {
		setLaunchConfigurationWorkingCopy(config);
		ILaunchConfigurationTab dynamicTab = getDynamicTab();
		if (dynamicTab != null) {
			dynamicTab.setDefaults(config);
		}
	}
	
	/**
	 * @see ILaunchConfigurationTab#initializeFrom(ILaunchConfiguration)
	 */
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		fIsInitializing = true;
		getControl().setRedraw(false);
		setLaunchConfiguration(configuration);
		updateJREFromConfig(configuration);
		fJREBlock.setDefaultFREDescriptor(getDefaultFREDescriptor());
		ILaunchConfigurationTab dynamicTab = getDynamicTab();
		if (dynamicTab != null) {
			dynamicTab.initializeFrom(configuration);
		}		
		getControl().setRedraw(true);
		fIsInitializing = false;
	}

	/**
	 * @see ILaunchConfigurationTab#performApply(ILaunchConfigurationWorkingCopy)
	 */
	@SuppressWarnings("deprecation")
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		if (fJREBlock.isDefaultJRE()) {
			configuration.setAttribute(IFASTLaunchConfigurationConstants.ATTR_JRE_CONTAINER_PATH, (String)null);
		} else {
			IPath containerPath = fJREBlock.getPath();
			String portablePath = null;
			if (containerPath != null) {
				portablePath = containerPath.toPortableString();
			}
			configuration.setAttribute(IFASTLaunchConfigurationConstants.ATTR_JRE_CONTAINER_PATH, portablePath);
		}
		// erase old attributes in case the user changed from 'specific JRE' to 'default' - see bug 152446
		configuration.setAttribute(IFASTLaunchConfigurationConstants.ATTR_VM_INSTALL_NAME, (String)null);
		configuration.setAttribute(IFASTLaunchConfigurationConstants.ATTR_VM_INSTALL_TYPE, (String)null);
		
		// Handle any attributes in the VM-specific area
		ILaunchConfigurationTab dynamicTab = getDynamicTab();
		if (dynamicTab == null) {
			configuration.setAttribute(IFASTLaunchConfigurationConstants.ATTR_VM_INSTALL_TYPE_SPECIFIC_ATTRS_MAP, (Map<String, String>)null);
		} else {
			dynamicTab.performApply(configuration);
		}
	}

	/**
	 * @see ILaunchConfigurationTab#isValid(ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(ILaunchConfiguration config) {
		
		setErrorMessage(null);
		setMessage(null);
		
		IStatus status = fJREBlock.getStatus();
		if (!status.isOK()) {
			setErrorMessage(status.getMessage());			 
			return false;
		}
		if(!isExternalToolConfiguration(fLaunchConfiguration)) {
			status = checkCompliance();
			if (!status.isOK()) {
				setErrorMessage(status.getMessage());			 
				return false;
			}
		}

		ILaunchConfigurationTab dynamicTab = getDynamicTab();
		if (dynamicTab != null) {
			return dynamicTab.isValid(config);
		}
		return true;
	}
	
	/**
	 * Returns if the specified <code>ILaunchConfiguration</code> is an ant or external tool
	 * type.
	 * @param configuration the {@link ILaunchConfiguration}
	 * @return true if the specified <code>ILaunchConfiguration</code> is an ant or external tools
	 * type configuration
	 * 
	 * @since 3.4
	 */
	private boolean isExternalToolConfiguration(ILaunchConfiguration configuration) {
		try {
			ILaunchConfigurationType type = configuration.getType();
			String id = type.getIdentifier();
			return id != null && (id.equals("org.eclipse.ant.AntLaunchConfigurationType") || //$NON-NLS-1$
			id.equals("org.eclipse.ant.AntBuilderLaunchConfigurationType") ||  //$NON-NLS-1$
			id.equals("org.eclipse.ui.externaltools.ProgramLaunchConfigurationType") || //$NON-NLS-1$
			id.equals("org.eclipse.ui.externaltools.ProgramBuilderLaunchConfigurationType")); //$NON-NLS-1$
		} 
		catch (CoreException e) {
			return false;
		}
	}
	
	/**
	 * Checks to make sure the class file compliance level and the selected VM are compatible
	 * i.e. such that the selected JRE can run the currently compiled code
	 * @return the status of the check
	 * @since 3.3
	 */
	private IStatus checkCompliance() {
		/* TODO IJavaProject javaProject = getJavaProject();
		if (javaProject == null) {
			return Status.OK_STATUS;
		}
		String source = LauncherMessages.JavaJRETab_3;
		String	compliance = javaProject.getOption(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, false);
		if(compliance == null) {
			compliance = javaProject.getOption(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, true);
			source = LauncherMessages.JavaJRETab_4;
		}
		IPath vmPath = fJREBlock.getPath();
		if (vmPath != null) {
			IVMInstall vm = null;
			if(JavaRuntime.newDefaultJREContainerPath().equals(vmPath)) {
				if(javaProject.isOpen()) {
					try {
						vm = JavaRuntime.getVMInstall(getJavaProject());
					} catch (CoreException e) {
						JDIDebugUIPlugin.log(e);
						return Status.OK_STATUS;
					}
					if(vm == null) {
						vm = JavaRuntime.getVMInstall(vmPath);
					}
				}
			}
			else {
				vm = JavaRuntime.getVMInstall(vmPath);
			}
			String environmentId = JavaRuntime.getExecutionEnvironmentId(vmPath);
			if(vm instanceof AbstractVMInstall) {
				AbstractVMInstall install = (AbstractVMInstall) vm;
				String vmver = install.getJavaVersion();
				if(vmver != null) {
					int val = compliance.compareTo(vmver);
					if(val > 0) {
						String setting = null;
						if (environmentId == null) {
							setting = LauncherMessages.JavaJRETab_2;
						} else {
							setting = LauncherMessages.JavaJRETab_1;
						}
						return new Status(IStatus.ERROR, IJavaDebugUIConstants.PLUGIN_ID, IStatus.ERROR, NLS.bind(LauncherMessages.JavaJRETab_0, new String[] {setting, source, compliance}), null); 
					}
				}
			}
			return Status.OK_STATUS;
		}
		// when no VM path is specified return the error status from the JRE block
		return fJREBlock.getStatus();
		*/
		return Status.OK_STATUS;
	}	

	/**
	 * @see ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return LauncherMessages.JavaJRETab__JRE_1; 
	}
	
	/**
	 * @see ILaunchConfigurationTab#getImage()
	 */
	@Override
	public Image getImage() {
		return null; //JavaUI.getSharedImages().getImage(ISharedImages.IMG_OBJS_LIBRARY);
	}	

	/**
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getId()
	 * 
	 * @since 3.3
	 */
	@Override
	public String getId() {
		return "org.eclipse.jdt.debug.ui.javaJRETab"; //$NON-NLS-1$
	}
	
	/**
	 * This method updates the jre selection from the <code>ILaunchConfiguration</code>
	 * @param config the config to update from 
	 */
	@SuppressWarnings("deprecation")
	protected void updateJREFromConfig(ILaunchConfiguration config) {
		try {
			String path = config.getAttribute(IFASTLaunchConfigurationConstants.ATTR_JRE_CONTAINER_PATH, (String)null);
			if (path != null) {
				fJREBlock.setPath(Path.fromPortableString(path));
				return;
			}
		} catch (CoreException e) {
			// TODO FREIDebugUIPlugin.log(e);
		}
		String vmName = null;
		String vmTypeID = null;
		try {
			vmTypeID = config.getAttribute(IFASTLaunchConfigurationConstants.ATTR_VM_INSTALL_TYPE, (String)null);
			vmName = config.getAttribute(IFASTLaunchConfigurationConstants.ATTR_VM_INSTALL_NAME, (String)null);
		} catch (CoreException ce) {
			// TODO FREIDebugUIPlugin.log(ce);			
		}
		selectFRE(vmTypeID, vmName);
	}	
	
	/**
	 * Notification that the user changed the selection in the JRE combination box.
	 */
	protected void handleSelectedJREChanged() {
		loadDynamicJREArea();
		
		// always set the newly created area with defaults
		ILaunchConfigurationWorkingCopy wc = getLaunchConfigurationWorkingCopy();
		if (getDynamicTab() == null) {
			// remove any VM specific arguments from the config
			if (wc == null) {
				if (getLaunchConfiguration().isWorkingCopy()) {
					wc = (ILaunchConfigurationWorkingCopy)getLaunchConfiguration();
				}
			}
			if (!fIsInitializing) {
				if (wc != null) {
					wc.setAttribute(IFASTLaunchConfigurationConstants.ATTR_VM_INSTALL_TYPE_SPECIFIC_ATTRS_MAP, (Map<String, String>)null);
				}
			}
		} else {
			if (wc == null) {
				try {
					ILaunchConfiguration config = getLaunchConfiguration();
					if (config.isWorkingCopy()) {
						// get a fresh copy to work on, only if there is an original to do so
						wc = (ILaunchConfigurationWorkingCopy) config;
						if(wc.getOriginal() != null) {
							wc.getOriginal().getWorkingCopy();
						}
					} else {
							wc = getLaunchConfiguration().getWorkingCopy();
					}
				} catch (CoreException e) {
					IStatus status = e.getStatus();
					// TODO FREIDebugUIPlugin.statusDialog(status); 
					// TODO JDIDebugUIPlugin.log(status);
					return;
				}
			}
			if (!fIsInitializing) {
				getDynamicTab().setDefaults(wc);
				getDynamicTab().initializeFrom(wc);
			}
		}
				
		updateLaunchConfigurationDialog();		
	}
	
	protected void selectFRE(String typeID, String vmName) {
		/* TODO if (typeID == null) {
			fJREBlock.setPath(JavaRuntime.newDefaultJREContainerPath());
		} else {
			fJREBlock.setPath(JavaRuntime.newJREContainerPath(typeID, vmName));
		}*/
	}
	
	/**
	 * Return the class that implements <code>ILaunchConfigurationTab</code>
	 * that is registered against the install type of the currently selected VM.
	 * @return the backing {@link ILaunchConfigurationTab}
	 */
	protected ILaunchConfigurationTab getTabForCurrentJRE() {
		if (!fJREBlock.isDefaultJRE()) {
			IPath path = fJREBlock.getPath();
			if (path != null /*TODO && FASTRuntime.getExecutionEnvironmentId(path) == null*/) {
				IFASTInstall vm = fJREBlock.getFRE();
				if (vm != null) {
					String vmInstallTypeID = vm.getFASTInstallType().getId();
					return FREIDebugUIPlugin.getDefault().getVMInstallTypePage(vmInstallTypeID);
				}
			}
		}		
		return null;
	}
	
	/**
	 * Show the contributed piece of UI that was registered for the install type
	 * of the currently selected VM.
	 */
	protected void loadDynamicJREArea() {
		
		// Dispose of any current child widgets in the tab holder area
		Control[] children = getDynamicTabHolder().getChildren();
		for (int i = 0; i < children.length; i++) {
			children[i].dispose();
		}
		
		if (isUseDynamicJREArea()) {
			// Retrieve the dynamic UI for the current JRE 
			setDynamicTab(getTabForCurrentJRE());
			if (getDynamicTab() == null) {
				return;
			}
			
			// Ask the dynamic UI to create its Control
			getDynamicTab().setLaunchConfigurationDialog(getLaunchConfigurationDialog());
			getDynamicTab().createControl(getDynamicTabHolder());
			getDynamicTabHolder().layout();	
		}
			
	}

	protected ILaunchConfigurationWorkingCopy getLaunchConfigurationWorkingCopy() {
		return fWorkingCopy;
	}
	
	/**
	 * Overridden here so that any error message in the dynamic UI gets returned.
	 * 
	 * @see ILaunchConfigurationTab#getErrorMessage()
	 */
	@Override
	public String getErrorMessage() {
		ILaunchConfigurationTab tab = getDynamicTab();
		if ((super.getErrorMessage() != null) || (tab == null)) {
			return super.getErrorMessage();
		}
		return tab.getErrorMessage();
	}

	protected void setLaunchConfigurationWorkingCopy(ILaunchConfigurationWorkingCopy workingCopy) {
		fWorkingCopy = workingCopy;
	}

	protected ILaunchConfiguration getLaunchConfiguration() {
		return fLaunchConfiguration;
	}

	protected void setLaunchConfiguration(ILaunchConfiguration launchConfiguration) {
		fLaunchConfiguration = launchConfiguration;
	}
	
	/**
	 * Sets whether this tab will display the VM specific arguments area
	 * if a JRE supports VM specific arguments.
	 * 
	 * @param visible whether this tab will display the VM specific arguments area
	 * 	if a JRE supports VM specific arguments
	 */
	public void setVMSpecificArgumentsVisible(boolean visible) {
		fUseDynamicArea = visible;
	}
	
	protected boolean isUseDynamicJREArea() {
		return fUseDynamicArea;
	}

	protected FREDescriptor getDefaultFREDescriptor() {
		return new FREDescriptor() {

			/* (non-Javadoc)
			 * @see org.eclipse.jdt.internal.debug.ui.jres.DefaultJREDescriptor#getDescription()
			 */
			@Override
			public String getDescription() {
				/*IFASTProject*/ IProject project = getJavaProject();
				String name = LauncherMessages.JavaJRETab_7; 
				if (project == null) {
					IFASTInstall vm = FASTRuntime.getDefaultFASTInstall();
					if (vm != null) {
						name = vm.getName();
					}
					return NLS.bind(LauncherMessages.JavaJRETab_8, new String[]{name}); 
				}
				/* TODO
				try {
					String eeName = null;
					IClasspathEntry[] classpath = project.getRawClasspath();
					for (int i = 0; i < classpath.length; i++) {
						IClasspathEntry entry = classpath[i];
						if (entry.getEntryKind() == IClasspathEntry.CPE_CONTAINER) {
							if (JavaRuntime.JRE_CONTAINER.equals(entry.getPath().segment(0))) {
								String id = JavaRuntime.getExecutionEnvironmentId(entry.getPath());
								if (id != null) {
									IExecutionEnvironment env = JavaRuntime.getExecutionEnvironmentsManager().getEnvironment(id);
									if (env != null) {
										eeName = env.getId();
										break;
									}
								}
							}
						}
					}
					IFASTInstall vm = FASTRuntime.getFASTInstall(project);
					if (vm != null) {
						name = vm.getName();
					}
					if (eeName != null) {
						return NLS.bind(LauncherMessages.JavaJRETab_5, new String[]{eeName, name});
					}
				} catch (CoreException e) {
				}*/
				return NLS.bind(LauncherMessages.JavaJRETab_9, new String[]{name}); 
			}
		};
	}
	
	protected FREDescriptor getSpecificFREDescriptor() {
		return null;
	}
	
	/**
	 * Returns the Java project associated with the current config being edited,
	 * or <code>null</code> if none.
	 * 
	 * @return java project or <code>null</code>
	 */
	protected /*IFASTProject*/ IProject getJavaProject() {
		if (getLaunchConfiguration() != null) {
			try {
				String name = getLaunchConfiguration().getAttribute(IFASTLaunchConfigurationConstants.ATTR_PROJECT_NAME, (String)null);
				if (name != null && name.length() > 0) {
					IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
					if (project.exists()) { 
						return null;// TODO JavaCore.create(project);
					}
				}
			} catch (CoreException e) {
				// TODO FREIDebugUIPlugin.log(e);
			}
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#activated(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void activated(ILaunchConfigurationWorkingCopy workingCopy) {
		// update the default JRE description, in case it has changed
		// based on the selected project
		fJREBlock.refresh();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#deactivated(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void deactivated(ILaunchConfigurationWorkingCopy workingCopy) {
		// do nothing when deactivated
	}	
}
