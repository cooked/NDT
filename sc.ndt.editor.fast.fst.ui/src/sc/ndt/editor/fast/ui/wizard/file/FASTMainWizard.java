package sc.ndt.editor.fast.ui.wizard.file;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class FASTMainWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private static final String WIZARD_NAME = "New FAST main file"; //$NON-NLS-1$
	
	private FASTMainWizardPage 	_page1;
	
	private IConfigurationElement 	_configurationElement;
	private IStructuredSelection 	_selection;
	private IWorkbench 				_workbench;
	
	public FASTMainWizard() {
	    setWindowTitle(WIZARD_NAME);
	}
	
	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		
		_configurationElement = config;

	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		
		_workbench = workbench;
		_selection = selection;
		
	}
	
	@Override
	public void addPages() {
	    super.addPages();
	 
	    _page1 = new FASTMainWizardPage(_selection);
	    _page1.setTitle("From Scratch Project");
	    _page1.setDescription("Create something from scratch.");
	 
	    addPage(_page1);

	}

	@Override
	public boolean performFinish() {
		
		IFile file = _page1.createNewFile();
		return true;
		
        /*if (file != null) {
        	try {
				file.setContents(_page1.getInitialContents(), IResource.NONE, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
            return true;
        } else
            return false;
        */
		
        // TODO
        //FASTProjectSupport.createProject(name, location);
        // perspective
        //BasicNewProjectResourceWizard.updatePerspective(_configurationElement);

	}

	

}
