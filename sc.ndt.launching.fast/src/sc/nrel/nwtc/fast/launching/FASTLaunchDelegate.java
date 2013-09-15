package sc.nrel.nwtc.fast.launching;

import java.io.File;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.osgi.util.NLS;

/**
 * A launch delegate for launching local Java applications.
 * <p>
 * Clients may subclass and instantiate this class.
 * </p>
 * @since 3.1
 */
public class FASTLaunchDelegate extends AbstractFASTLaunchConfigurationDelegate {

	public static String ID = "sc.nrel.nwtc.fast.launching.FASTLaunchDelegate";
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		
		monitor.beginTask(NLS.bind("{0}...", new String[]{configuration.getName()}), 3); //$NON-NLS-1$
		// check for cancellation
		if (monitor.isCanceled()) {
			return;
		}
		try {
			monitor.subTask(LaunchingMessages.JavaLocalApplicationLaunchConfigurationDelegate_Verifying_launch_attributes____1); 
							
			String mainTypeName = verifyMainTypeName(configuration);
			IFASTRunner runner = getFASTRunner(configuration, mode);
	
			File workingDir = verifyWorkingDirectory(configuration);
			String workingDirName = null;
			if (workingDir != null) {
				workingDirName = workingDir.getAbsolutePath();
			}
			
			// Environment variables
			String[] envp= getEnvironment(configuration);
			
			// Program & VM arguments
			// TODO String pgmArgs = getProgramArguments(configuration);
			// TODO String vmArgs = getVMArguments(configuration);
			// TODO ExecutionArguments execArgs = new ExecutionArguments(vmArgs, pgmArgs);
			
			// VM-specific attributes
			Map<String, Object> vmAttributesMap = getVMSpecificAttributesMap(configuration);
			
			// Classpath
			String[] classpath = null; // TODO getClasspath(configuration);
			
			// Create VM config
			FASTRunnerConfiguration runConfig = new FASTRunnerConfiguration(mainTypeName, classpath);
			// TODO runConfig.setProgramArguments(execArgs.getProgramArgumentsArray());
			// TODO runConfig.setEnvironment(envp);
			// TODO runConfig.setVMArguments(execArgs.getVMArgumentsArray());
			runConfig.setWorkingDirectory(workingDirName);
			// TODO runConfig.setVMSpecificAttributesMap(vmAttributesMap);
	
			// Bootpath
			// TODO runConfig.setBootClassPath(getBootpath(configuration));
			
			// check for cancellation
			if (monitor.isCanceled()) {
				return;
			}		
			
			// stop in main
			prepareStopInMain(configuration);
			
			// done the verification phase
			monitor.worked(1);
			
			monitor.subTask(LaunchingMessages.JavaLocalApplicationLaunchConfigurationDelegate_Creating_source_locator____2); 
			// set the default source locator if required
			setDefaultSourceLocator(launch, configuration);
			monitor.worked(1);		
			
			// Launch the configuration - 1 unit of work
			runner.run(runConfig, launch, monitor);
			
			// check for cancellation
			if (monitor.isCanceled()) {
				return;
			}	
		}
		finally {
			monitor.done();
		}
	}

}
