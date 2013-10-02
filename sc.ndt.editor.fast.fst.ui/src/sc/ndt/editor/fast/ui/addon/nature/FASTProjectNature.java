package sc.ndt.editor.fast.ui.addon.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class FASTProjectNature implements IProjectNature {

	public static final String NATURE_ID = "sc.ndt.editor.fast.fst.ui.fastNature"; //$NON-NLS-1$
	
	//private IProject project;
	
	@Override
	public void configure() throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public IProject getProject() {
		return null;//project;
	}

	@Override
	public void setProject(IProject project) {
		//this.project = project;
	}

}

