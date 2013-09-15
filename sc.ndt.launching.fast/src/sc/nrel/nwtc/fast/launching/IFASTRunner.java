package sc.nrel.nwtc.fast.launching;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.Launch;

public interface IFASTRunner {

	/**
	 * Launches a Java VM as specified in the given configuration,
	 * contributing results (debug targets and processes), to the
	 * given launch.
	 *
	 * @param configuration the configuration settings for this run
	 * @param launch the launch to contribute to
	 * @param monitor progress monitor or <code>null</code> A cancelable progress monitor is provided by the Job
	 *  framework. It should be noted that the setCanceled(boolean) method should never be called on the provided
	 *  monitor or the monitor passed to any delegates from this method; due to a limitation in the progress monitor 
	 *  framework using the setCanceled method can cause entire workspace batch jobs to be canceled, as the canceled flag 
	 *  is propagated up the top-level parent monitor. The provided monitor is not guaranteed to have been started. 
	 * @exception CoreException if an exception occurs while launching
	 */
	public void run(FASTRunnerConfiguration configuration, ILaunch launch, IProgressMonitor monitor) throws CoreException;	
	
}
