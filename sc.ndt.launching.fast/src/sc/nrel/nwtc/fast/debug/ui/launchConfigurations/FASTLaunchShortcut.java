package sc.nrel.nwtc.fast.debug.ui.launchConfigurations;

//import IType;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.Launch;
import org.eclipse.debug.core.model.IPersistableSourceLocator;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.sourcelookup.IPersistableSourceLocator2;
import org.eclipse.debug.internal.core.LaunchConfiguration;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import sc.ndt.core.externaltools.internal.IExternalToolConstants;
import sc.nrel.nwtc.fast.internal.debug.FREIDebugUIPlugin;
import sc.nrel.nwtc.fast.internal.debug.ui.LauncherMessages;
import sc.nrel.nwtc.fast.launching.FASTLaunchDelegate;
import sc.nrel.nwtc.fast.launching.FASTRuntime;
import sc.nrel.nwtc.fast.launching.IFASTInstall;
//import sc.nrel.nwtc.fast.ui.internal.FMainActivator;
//import sc.nrel.nwtc.fast.ui.preferences.PreferenceConstants;
import sc.nrel.nwtc.fast.launching.IFASTLaunchConfigurationConstants;
import sc.nrel.nwtc.fast.launching.IFASTRunner;
import sc.nrel.nwtc.fast.launching.StandardFAST;

public /*abstract*/ class FASTLaunchShortcut implements ILaunchShortcut2 {

	String executable;
	String commandLine;
	String attributes;
	String workingDir;
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.ui.IEditorPart, java.lang.String)
	 */
	public void launch(IEditorPart editor, String mode) {
		IEditorInput input = editor.getEditorInput();
		//IFASTElement je = (IFASTElement) input.getAdapter(IFASTElement.class);
		//if (je != null)
		//	searchAndLaunch(new Object[] {je}, mode, getTypeSelectionTitle(), getEditorEmptyMessage());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.jface.viewers.ISelection, java.lang.String)
	 */
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			searchAndLaunch(((IStructuredSelection)selection).toArray(), mode, "title"/*getTypeSelectionTitle()*/, "emptyselection"/*getSelectionEmptyMessage()*/);
		}
	}
	
	private void searchAndLaunch(Object[] scope, String mode, String selectTitle, String emptyMessage) {
		
		if(scope[0] instanceof IFile) {
			
		}
		/*IType[] types = null;
		try {
			types = findTypes(scope, PlatformUI.getWorkbench().getProgressService());
		} 
		catch (InterruptedException e) {return;} 
		catch (CoreException e) {
			MessageDialog.openError(getShell(), LauncherMessages.JavaLaunchShortcut_0, e.getMessage()); 
			return;
		}
		IType type = null;
		if (types.length == 0) {
			MessageDialog.openError(getShell(), LauncherMessages.JavaLaunchShortcut_1, emptyMessage); 
		} 
		else if (types.length > 1) {
			type = chooseType(types, selectTitle);
		} 
		else {
			type = types[0];
		}
		if (type != null) {*/
			launch(/*type,*/ (IFile)scope[0],mode);
		//}
	}
	
	protected void launch(/*IType type,*/ IFile file,String mode) {
		List<ILaunchConfiguration> configs = getCandidates(/*type,*/file, getConfigurationType());
		if(configs != null) {
			ILaunchConfiguration config = null;
			int count = configs.size();
			if(count == 1) {
				config = configs.get(0);
			}
			else if(count > 1) {
				config = chooseConfiguration(configs);
				if(config == null) {
					return;
				}
			}
			if (config == null) {
				config = createConfiguration(/*type*/file);
			}
			if (config != null) {
				DebugUITools.launch(config, mode);
			}	
		}
	}
	
	
	List<ILaunchConfiguration> getCandidates(/*IType type,*/IFile file, ILaunchConfigurationType ctype) {
		List<ILaunchConfiguration> candidateConfigs = Collections.EMPTY_LIST;

		String idNameStr =  file.getProjectRelativePath().toString().replace(IPath.SEPARATOR, '.');
		try {
			ILaunchConfiguration[] configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(ctype);
			candidateConfigs = new ArrayList<ILaunchConfiguration>(configs.length);
			for (int i = 0; i < configs.length; i++) {
				ILaunchConfiguration config = configs[i];
				if (config.getAttribute(IFASTLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "").equals(idNameStr/*type.getFullyQualifiedName()*/)) { //$NON-NLS-1$
					if (config.getAttribute(IFASTLaunchConfigurationConstants.ATTR_PROJECT_NAME, "").equals(file.getProject().getName()/*type.getJavaProject().getElementName()*/)) { //$NON-NLS-1$
						candidateConfigs.add(config);
					}
				}
			}
		} catch (CoreException e) {
			//FREIDebugUIPlugin.log(e);
		}
		return candidateConfigs;
	}
	
	protected ILaunchConfiguration chooseConfiguration(List<ILaunchConfiguration> configList) {
		IDebugModelPresentation labelProvider = DebugUITools.newDebugModelPresentation();
		ElementListSelectionDialog dialog= new ElementListSelectionDialog(getShell(), labelProvider);
		dialog.setElements(configList.toArray());
		dialog.setTitle("dummy title" /*getTypeSelectionTitle()*/ );  
		dialog.setMessage(LauncherMessages.JavaLaunchShortcut_2);
		dialog.setMultipleSelection(false);
		int result = dialog.open();
		labelProvider.dispose();
		if (result == Window.OK) {
			return (ILaunchConfiguration) dialog.getFirstResult();
		}
		return null;		
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchShortcut#createConfiguration(org.eclipse.jdt.core.IType)
	 */
	protected ILaunchConfiguration createConfiguration(/*IType type*/IFile file) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		int a;
		try {
						
			// qui recupero il tipo di config
			ILaunchConfigurationType configType = getConfigurationType();
			
			wc = configType.newInstance(null, file.getName() /*getLaunchManager().generateLaunchConfigurationName(type.getTypeQualifiedName('.'))*/ );
			
			String fileName= file.getName();
			
			IFASTInstall dfi = FASTRuntime.getDefaultFASTInstall();
			File exe = ((StandardFAST)dfi).getJavaExecutable();
			
			String location = exe.getAbsolutePath();
			
			if (location.length() == 0) {
				wc.setAttribute(IExternalToolConstants.ATTR_LOCATION, (String)null);
			} else {
				wc.setAttribute(IExternalToolConstants.ATTR_LOCATION, location);
			}
			
			String workingDirectory = file.getParent().getLocation().toOSString();
			if (workingDirectory.length() == 0) {
				wc.setAttribute(IExternalToolConstants.ATTR_WORKING_DIRECTORY, (String)null);
			} else {
				wc.setAttribute(IExternalToolConstants.ATTR_WORKING_DIRECTORY, workingDirectory);
			}
			
			// file name as argument passed to FAST.exe
			if(fileName.length() == 0)
				wc.setAttribute(IExternalToolConstants.ATTR_TOOL_ARGUMENTS, (String)null);
			else {
				if(fileName.contains(" "))
					wc.setAttribute(IExternalToolConstants.ATTR_TOOL_ARGUMENTS, "\""+fileName+"\"");
				else
					wc.setAttribute(IExternalToolConstants.ATTR_TOOL_ARGUMENTS, fileName);
				
			}
				
			
			// this should be unique identifier
			wc.setAttribute(IFASTLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, file.getProjectRelativePath().toString().replace(IPath.SEPARATOR, '.') /*type.getFullyQualifiedName()*/);
			
			wc.setAttribute(IFASTLaunchConfigurationConstants.ATTR_PROJECT_NAME, file.getProject().getName() /*type.getJavaProject().getElementName()*/);
			//wc.setMappedResources(new IResource[] {type.getUnderlyingResource()});
			
			//if(userEdited) {
			//	configuration.setAttribute(FIRST_EDIT, (String)null);
			//}
			
			
			config = wc.doSave();
		} catch (CoreException exception) {
			MessageDialog.openError(FREIDebugUIPlugin.getActiveWorkbenchShell(), LauncherMessages.JavaLaunchShortcut_3, exception.getStatus().getMessage());	
		} 
		return config;
	
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchShortcut#getConfigurationType()
	 */
	protected ILaunchConfigurationType getConfigurationType() {
		ILaunchConfigurationType lc =
				getLaunchManager().getLaunchConfigurationType(
				"sc.ndt.launching.fast.localFASTApplication");
				//IFASTLaunchConfigurationConstants.ID_FAST_APPLICATION);		
		return lc;
	}
	
	/**
	 * Convenience method to return the active workbench window shell.
	 * 
	 * @return active workbench window shell
	 */
	protected Shell getShell() {
		return FREIDebugUIPlugin.getActiveWorkbenchShell();
	}
	
	/**
	 * Returns the singleton launch manager.
	 * 
	 * @return launch manager
	 */
	private ILaunchManager getLaunchManager() {
		return DebugPlugin.getDefault().getLaunchManager();
	}
	
	
	
	
	
	/*@Override
	public void launch(ISelection selection, String mode) {

		//workingDir = /*((TreeItem)selection.toString();//.getParent().getFullPath().toString();
		attributes = ((IFile)selection).getName();
		
		//internalLaunch(  );
		//LaunchConfigurationDelegateFAST lcd = new LaunchConfigurationDelegateFAST();
		
		//lcd.launch(
		//	DebugPlugin.getDefault().getLaunchManager().getLaunchConfiguration(),
		//	ILaunchManager.RUN_MODE, 
		//	launch, 
		//	null
		//);
		
		getFASTLaunch();
		
	}*/
	
	/*private static ILaunch getFASTLaunch() {
		
		// find existing launch config
	    ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
	    ILaunch[] launches = manager.getLaunches();
	    if(launches.length > 0){
	        for (ILaunch launch : launches) {
	            ILaunchConfiguration conf = launch.getLaunchConfiguration();
	            try {
	                if(conf.getType().equals(manager.getLaunchConfigurationType(FASTLaunchDelegate.ID)))
	                    return launch;
	            } catch (CoreException e) {
	                e.printStackTrace();
	            }
	        }

	    }
	    
	    return null;
	    
	    /*
	    // no existing launch config, so create brand new
	    ILaunchConfiguration config = getXVRLaunchConfiguration();
	    Launch l = new Launch(config, "run, debug", null);
	    l.setAttribute(DebugPlugin.ATTR_CAPTURE_OUTPUT, null);
	    try {
	        if (l.getSourceLocator() == null) {
	            String type;
	            type = config.getAttribute(ILaunchConfiguration.ATTR_SOURCE_LOCATOR_ID, (String)null);

	            if (type == null) {
	                type = config.getType().getSourceLocatorId();
	            }
	            if (type != null) {
	                IPersistableSourceLocator locator = manager.newSourceLocator(type);
	                String memento = config.getAttribute(ILaunchConfiguration.ATTR_SOURCE_LOCATOR_MEMENTO, (String)null);
	                if (memento == null) {
	                    locator.initializeDefaults(config);
	                } else {
	                    if(locator instanceof IPersistableSourceLocator2)
	                        ((IPersistableSourceLocator2)locator).initializeFromMemento(memento, config);
	                    else
	                        locator.initializeFromMemento(memento);
	                }
	                l.setSourceLocator(locator);
	            }
	        }
	    } catch (CoreException e) {
	        e.printStackTrace();
	    }
	    return l;
	   
	}*/

	
	
	
	
	/*
	protected abstract ILaunchConfigurationType getConfigurationType();
	
	//protected abstract ILaunchConfiguration createConfiguration(IType type);
	
	//protected abstract IType[] findTypes(Object[] elements, IRunnableContext context) throws InterruptedException, CoreException;
	
	protected abstract String getTypeSelectionTitle();
	
	protected abstract String getEditorEmptyMessage();	
	
	protected abstract String getSelectionEmptyMessage();	
	

	/*protected IType chooseType(IType[] types, String title) {
		DebugTypeSelectionDialog mmsd = new DebugTypeSelectionDialog(JDIDebugUIPlugin.getShell(), types, title);
		if (mmsd.open() == Window.OK) {
			return (IType)mmsd.getResult()[0];
		}
		return null;
	}
			
	protected ILaunchConfiguration findLaunchConfiguration(IType type, ILaunchConfigurationType configType) {
		List<ILaunchConfiguration> configs = getCandidates(type, configType);
		int count = configs.size();
		if(count == 1) {
			return configs.get(0);
		}
		if(count > 1) {
			return chooseConfiguration(configs);
		}
		return null;
	}
		*/
	
	public IResource getLaunchableResource(IEditorPart editorpart) {
		return getLaunchableResource(editorpart.getEditorInput());
	}

	public IResource getLaunchableResource(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			if (ss.size() == 1) {
				Object element = ss.getFirstElement();
				if (element instanceof IAdaptable) {
					return getLaunchableResource((IAdaptable)element);
				}
			}
		}
		return null;
	}
	
	private IResource getLaunchableResource(IAdaptable adaptable) {
		/*IFASTElement je = (IFASTElement) adaptable.getAdapter(IFASTElement.class);
		if (je != null) {
			return je.getResource();
		}*/
		return null;
	}

	public ILaunchConfiguration[] getLaunchConfigurations(IEditorPart editorpart) {
		// let the framework resolve configurations based on resource mapping
		return null;
	}

	public ILaunchConfiguration[] getLaunchConfigurations(ISelection selection) {
		// let the framework resolve configurations based on resource mapping
		return null;
	}	
	
	
		
	

		private MessageConsole engineConsole() {
			ConsolePlugin plugin = ConsolePlugin.getDefault();
			IConsoleManager conMan = plugin.getConsoleManager();
			IConsole[] existing = conMan.getConsoles();
			for (int i = 0; i < existing.length; i++)
				if ("FAST".equals(existing[i].getName()))
					return (MessageConsole) existing[i];
			MessageConsole engineConsole = new MessageConsole("FAST", null);
			conMan.addConsoles(new IConsole[] { engineConsole });
			return engineConsole;
		}
	
		
}

