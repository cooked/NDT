package sc.nrel.nwtc.fast.launching;

import java.io.IOException;

public abstract class FASTRunner extends StandardFASTRunner {

	public FASTRunner(IFASTInstall vmInstance) {
		super(vmInstance);
		// TODO Auto-generated constructor stub
	}

	/*public void run(FASTRunnerConfiguration config) {
		
		ProcessBuilder processBuilder = new ProcessBuilder(
				config.getProgramExe(),
				config.getInputFile());
		
		//processBuilder.directory(File.config.getWorkingDir());
		
		try {
			Process process = processBuilder.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/

	@Override
	protected String getPluginIdentifier() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
