package sc.ndt.commons.ant.core;

import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.part.FileEditorInput;

public class AntLauncher {
	
	//IWorkbenchPage 	page 	= _workbench.getActiveWorkbenchWindow().getActivePage();
	//IProject 		project	= ResourcesPlugin.getWorkspace().getRoot().getProject(_page1.getProjectName());

	FileEditorInput fei;
	
	public void run(String buildFile, String[] targets) {
		
		AntRunner runner = new AntRunner();
		runner.setBuildFileLocation(buildFile);
		//runner.setExecutionTargets(targets);
		runner.setExecutionTargets(new String[]{"wind"});
		runner.setMessageOutputLevel(org.apache.tools.ant.Project.MSG_VERBOSE);
		
		// see
		// http://codescale.wordpress.com/2010/04/25/log-the-ant-output-to-the-eclipse-console/
		runner.addBuildLogger("sc.ndt.commons.ant.log.AntLogger");
		runner.setArguments("-Dmessage=Building -verbose");
		try {
			runner.run();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	/*
	public Object start() throws Exception {
		
		IExtension extension = Platform.getExtensionRegistry().getExtension("org.eclipse.ant.core.antRunner"); //$NON-NLS-1$
		if (extension == null)
			return null;
		IConfigurationElement element = extension.getConfigurationElements()[0];
		Object ee = element.createExecutableExtension("run"); //$NON-NLS-1$
		String[] args = {
			""	
		};

		if (ee instanceof AntRunner) {
			return ((AntRunner) ee).run(args);
		}
		// else it is probably an old IPlatformRunnable
		return doPlatformRunnable(ee, args);
	}*/
	

}
