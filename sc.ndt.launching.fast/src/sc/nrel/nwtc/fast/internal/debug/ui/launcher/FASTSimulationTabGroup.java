package sc.nrel.nwtc.fast.internal.debug.ui.launcher;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.RefreshTab;

import sc.ndt.ui.externaltools.internal.program.launchConfigurations.ProgramMainTab;
//import sc.nrel.nwtc.fast.debug.ui.launchConfigurations.FastFRETab;
import sc.nrel.nwtc.fast.debug.ui.launchConfigurations.FastFRETab;


public class FASTSimulationTabGroup extends AbstractLaunchConfigurationTabGroup  {

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
			//new FASTMainTab(),
			new ProgramMainTab(),
			//new FastFRETab(), //new JavaJRETab(),
			new RefreshTab(),
			// TODO new ExternalToolsBuildTab(),
			new EnvironmentTab(),
			//new AppletParametersTab(),
			//new JavaArgumentsTab(),
			//new JavaClasspathTab(), 
			new CommonTab()
		};
		setTabs(tabs);
	}

}
