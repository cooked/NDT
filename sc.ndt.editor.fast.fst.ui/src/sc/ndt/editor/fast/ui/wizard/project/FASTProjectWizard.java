package sc.ndt.editor.fast.ui.wizard.project;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

public class FASTProjectWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private static final String PAGE_NAME 	= "Custom Plug-in Project Wizard"; //$NON-NLS-1$
	private static final String WIZARD_NAME = "New Custom Plug-in Project"; //$NON-NLS-1$
	
	private WizardNewProjectCreationPage _pageOne;
	
	private IConfigurationElement _configurationElement;

	
	public FASTProjectWizard() {
	    setWindowTitle(WIZARD_NAME);
	}
	
	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		
		_configurationElement = config;

	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addPages() {
	    super.addPages();
	 
	    _pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
	    _pageOne.setTitle("From Scratch Project");
	    _pageOne.setDescription("Create something from scratch.");
	 
	    addPage(_pageOne);
	}

	@Override
	public boolean performFinish() {
		
		String name = _pageOne.getProjectName();
        URI location = null;
        if (!_pageOne.useDefaults()) {
            location = _pageOne.getLocationURI();
            System.err.println("location: " + location.toString()); //$NON-NLS-1$
        } // else location == null

        FASTProjectSupport.createProject(name, location);
        // Add this
        BasicNewProjectResourceWizard.updatePerspective(_configurationElement);

        return true;
	}

	

}
