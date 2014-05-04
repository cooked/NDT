package sc.nrel.nwtc.fast.debug.ui.launchConfigurations;

import org.eclipse.ant.launching.IAntLaunchConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

import sc.ndt.core.externaltools.internal.IExternalToolConstants;

public class FASTLaunchShortcutBatch implements ILaunchShortcut2 {

	String executable;
	String commandLine;
	String attributes;
	String workingDir;
	
	public void launch(IEditorPart editor, String mode) {
		IEditorInput input = editor.getEditorInput();
		IFile je = (IFile) input.getAdapter(IFile.class);
		if (je != null)
			searchAndLaunch(new Object[] {je}, mode, "title", "emptyeditor");
	}

	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			searchAndLaunch(((IStructuredSelection)selection).toArray(), mode, "title", "emptyselection");
		}
	}
	
	private void searchAndLaunch(Object[] scope, String mode, String selectTitle, String emptyMessage) {
		
		launch((IFile)scope[0],mode);

	}
	
	protected void launch(IFile file,String mode) {
		
		String 		buildFile 	= file.getProject().getFile("build.xml").getRawLocation().makeAbsolute().toOSString();
		
		// see 
		// http://codescale.wordpress.com/2010/04/25/log-the-ant-output-to-the-eclipse-console/
		
		ILaunchManager 				launchManager 	= DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType 	lcType 			= launchManager.getLaunchConfigurationType(IAntLaunchConstants.ID_ANT_LAUNCH_CONFIGURATION_TYPE);
		 
		String name = launchManager.generateLaunchConfigurationName(file.getName());
		try {
			ILaunchConfigurationWorkingCopy wc = lcType.newInstance(null, name);
			wc.setAttribute(ILaunchManager.ATTR_PRIVATE, 			true		);	// make it appear in the history or not (under External Tools)
			wc.setAttribute(IExternalToolConstants.ATTR_LOCATION, 	buildFile	);	// the build.xml file
			wc.setAttribute(IAntLaunchConstants.ATTR_ANT_TARGETS, 	"dlc"		); 	// the selected target inside the build.xml
			wc.launch(ILaunchManager.RUN_MODE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	
	}
	
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
		
}

