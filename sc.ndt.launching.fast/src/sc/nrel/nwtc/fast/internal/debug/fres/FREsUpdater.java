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
package sc.nrel.nwtc.fast.internal.debug.fres;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.operation.IRunnableWithProgress;

import sc.nrel.nwtc.fast.internal.debug.FREIDebugUIPlugin;
import sc.nrel.nwtc.fast.launching.FASTDefinitionsContainer;
import sc.nrel.nwtc.fast.launching.FASTRuntime;
import sc.nrel.nwtc.fast.launching.IFASTInstall;
import sc.nrel.nwtc.fast.launching.IFASTInstallType;
import sc.nrel.nwtc.fast.launching.LaunchingPlugin;

/**
 * Processes add/removed/changed VMs.
 */
public class FREsUpdater {
	
	// the VMs defined when this updated is instantiated
	private FASTDefinitionsContainer fOriginalVMs;	
	
	/**
	 * Contstructs a new VM updater to update VM install settings.
	 */
	public FREsUpdater() {
		fOriginalVMs = new FASTDefinitionsContainer();
		IFASTInstall def = FASTRuntime.getDefaultFASTInstall();
		if (def != null) {
			fOriginalVMs.setDefaultVMInstallCompositeID(FASTRuntime.getCompositeIdFromVM(def));
		}
	
		IFASTInstallType[] types = FASTRuntime.getFASTInstallTypes();
		for (int i = 0; i < types.length; i++) {
			IFASTInstall[] vms = types[i].getFASTInstalls();
			for (int j = 0; j < vms.length; j++) {
				fOriginalVMs.addVM(vms[j]);
			}
		}
	}
	
	/**
	 * Updates VM settings and returns whether the update was successful.
	 * 
	 * @param jres new installed JREs
	 * @param defaultJRE new default VM
	 * @return whether the update was successful
	 */
	public boolean updateJRESettings(IFASTInstall[] jres, IFASTInstall defaultJRE) {
		
		// Create a VM definition container
		FASTDefinitionsContainer vmContainer = new FASTDefinitionsContainer();
		
		// Set the default VM Id on the container
		String defaultVMId = FASTRuntime.getCompositeIdFromVM(defaultJRE);
		vmContainer.setDefaultVMInstallCompositeID(defaultVMId);
		
		// Set the VMs on the container
		for (int i = 0; i < jres.length; i++) {
			vmContainer.addVM(jres[i]);
		}
		
		
		// Generate XML for the VM defs and save it as the new value of the VM preference
		saveVMDefinitions(vmContainer);
		
		return true;
	}
	
	private void saveVMDefinitions(final FASTDefinitionsContainer container) {
		IRunnableWithProgress runnable = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				try {
					monitor.beginTask(FREMessages.JREsUpdater_0, 100); 
					String vmDefXML = container.getAsXML();
					monitor.worked(40);
					IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(LaunchingPlugin.ID_PLUGIN);
					if(prefs != null) {
						prefs.put(FASTRuntime.PREF_VM_XML, vmDefXML);
					}
					monitor.worked(30);
					FASTRuntime.savePreferences();
					monitor.worked(30);
				}  catch (CoreException e) {
					//JDIDebugUIPlugin.log(e);
				} finally {
					monitor.done();
				}
				
			}
		};
		try {
			FREIDebugUIPlugin.getDefault().getWorkbench().getProgressService().busyCursorWhile(runnable);
		} catch (InvocationTargetException e) {
			//FREIDebugUIPlugin.log(e);
		} catch (InterruptedException e) {
			//FREIDebugUIPlugin.log(e);
		}
	}
}
