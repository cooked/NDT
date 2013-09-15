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
package sc.nrel.nwtc.fast.internal.debug;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Plug-in class for the org.eclipse.jdt.debug.ui plug-in.
 */
public class FREIDebugUIPlugin extends AbstractUIPlugin {

	/**
	 * Unique identifier constant (value <code>"org.eclipse.jdt.debug.ui"</code>)
	 * for the JDI Debug plug-in.
	 */
	private static final String PI_JDI_DEBUG = "sc.nrel.nwtc.fast.internal.debug.ui"; //$NON-NLS-1$
	
	
	/**
	 * Java Debug UI plug-in instance
	 */
	private static FREIDebugUIPlugin fgPlugin;
	
	
	// Map of VMInstallTypeIDs to IConfigurationElements
	protected Map<String, IConfigurationElement> fVmInstallTypePageMap;
	
	/**
	 * Whether this plugin is in the process of shutting
	 * down.
	 */
	private boolean fShuttingDown= false;

	/**
	 * @see Plugin()
	 */
	public FREIDebugUIPlugin() {
		super();
		setDefault(this);
	}
	
	/**
	 * Returns the Java Debug UI plug-in instance
	 * 
	 * @return the Java Debug UI plug-in instance
	 */
	public static FREIDebugUIPlugin getDefault() {
		return fgPlugin;
	}
	
	/**
	 * Sets the Java Debug UI plug-in instance
	 * 
	 * @param plugin the plugin instance
	 */
	private static void setDefault(FREIDebugUIPlugin plugin) {
		fgPlugin = plugin;
	}
	
	/**
	 * Returns the active workbench window
	 * 
	 * @return the active workbench window
	 */
	public static IWorkbenchWindow getActiveWorkbenchWindow() {
		return getDefault().getWorkbench().getActiveWorkbenchWindow();
	}	
	
	public static IWorkbenchPage getActivePage() {
		IWorkbenchWindow w = getActiveWorkbenchWindow();
		if (w != null) {
			return w.getActivePage();
		}
		return null;
	}
	
	
	/**
	 * Returns the active workbench shell or <code>null</code> if none
	 * 
	 * @return the active workbench shell or <code>null</code> if none
	 */
	public static Shell getActiveWorkbenchShell() {
		IWorkbenchWindow window = getActiveWorkbenchWindow();
		if (window != null) {
			return window.getShell();
		}
		return null;
	}
	
	/**
	 * Logs the specified status with this plug-in's log.
	 * 
	 * @param status status to log
	 */
	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}
	
	/**
	 * Return an object that implements <code>ILaunchConfigurationTab</code> for the
	 * specified vm install type ID.  
	 */
	public ILaunchConfigurationTab getVMInstallTypePage(String vmInstallTypeID) {
		if (fVmInstallTypePageMap == null) {	
			initializeVMInstallTypePageMap();
		}
		IConfigurationElement configElement = fVmInstallTypePageMap.get(vmInstallTypeID);
		ILaunchConfigurationTab tab = null;
		if (configElement != null) {
			try {
				tab = (ILaunchConfigurationTab) configElement.createExecutableExtension("class"); //$NON-NLS-1$
			} catch(CoreException ce) {			 
				// TODO log(new Status(IStatus.ERROR, getUniqueIdentifier(), IJavaDebugUIConstants.INTERNAL_ERROR, "An error occurred retrieving a VMInstallType page.", ce));  //$NON-NLS-1$
			} 
		}
		return tab;
	}
	
	protected void initializeVMInstallTypePageMap() {
		fVmInstallTypePageMap = new HashMap<String, IConfigurationElement>(10);

		/* TODO IExtensionPoint extensionPoint= Platform.getExtensionRegistry().getExtensionPoint(getUniqueIdentifier(), IJavaDebugUIConstants.EXTENSION_POINT_VM_INSTALL_TYPE_PAGE);
		IConfigurationElement[] infos= extensionPoint.getConfigurationElements();
		for (int i = 0; i < infos.length; i++) {
			String id = infos[i].getAttribute("vmInstallTypeID"); //$NON-NLS-1$
			fVmInstallTypePageMap.put(id, infos[i]);
		}	*/	
	}
	
	/**
	 * Convenience method which returns the unique identifier of this plugin.
	 */
	public static String getUniqueIdentifier() {
		return PI_JDI_DEBUG;
	}
	
}

