package sc.ndt.editor.fast.ui.wizard.project;

import java.net.URI;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFolderMainPage;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import sc.ndt.commons.ui.editor.IXtextFormEditor;

public class TowerSetWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private static final String PAGE_NAME 	= "New Tower Wizard"; //$NON-NLS-1$
	private static final String WIZARD_NAME = "New Tower file set"; //$NON-NLS-1$
	
	private WizardNewFolderMainPage 	_page1;
	//private FASTProjectWizardPage2 			_page2;
	
	private IConfigurationElement 	_configurationElement;
	private IStructuredSelection 	_selection;
	private IWorkbench _workbench;
	
	public TowerSetWizard() {
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
	 
	    _page1 = new WizardNewFolderMainPage(PAGE_NAME, _selection);
	    _page1.setTitle("New Tower");
	    _page1.setDescription("Create tower file set");
	 
	    //_page2 = new FASTProjectWizardPage2(_selection);
	    //_page2.setTitle("From Scratch Project");
	    //_page2.setDescription("Create something from scratch.");
	    
	    addPage(_page1);
	    //addPage(_page2);
	}

	@Override
	public boolean performFinish() {
		
		IFolder folder 		= _page1.createNewFolder();
        URI 	location 	= null;
        String 	name		= null;
        
        if (folder!=null) {
        	name = folder.getName();
            location = folder.getLocationURI();
        }

		//  TODO create the set
        IProject prj = (IProject)_selection.getFirstElement();
        
        TowerSetSupport.createProjectTwr(prj, name, location);
        //BasicNewProjectResourceWizard.updatePerspective(_configurationElement);

        
		
		// TODO after creation open the twr editor
		
        // http://blog.eclipse-tips.com/2008/07/how-to-create-new-file-wizard.html
        // http://wiki.eclipse.org/FAQ_How_do_I_find_the_active_workbench_page%3F
        try {
        	
        	IEditorPart 	editor;
        	IXtextDocument 	document;
        	IWorkbenchPage 	page 	= _workbench.getActiveWorkbenchWindow().getActivePage();
//        	IProject 		project	= ResourcesPlugin.getWorkspace().getRoot().getProject(_page1.getProjectName());
  
        	
//        	// write to model of FAST.fst
			editor = IDE.openEditor(page, prj.getFile("FAST.fst"));
//			if(editor instanceof IXtextFormEditor)
//				document = ((IXtextFormEditor)editor).getXtextEditor("fst").getDocument();
//			else if(editor instanceof XtextEditor)
//				document = ((XtextEditor)editor).getDocument();
//			else
//				return true;
//			
//			
//			// write to model of tower.twr
//        	editor 		= IDE.openEditor(page, project.getFile("input/tower.twr"));
//        	document 	= ((XtextEditor)editor).getDocument();
//			
//        	// write to model of blade.bld
//        	editor 		= IDE.openEditor(page, project.getFile("input/blade.bld"));
//        	document 	= ((XtextEditor)editor).getDocument();
//			
//			// write to model of iecwind.iec
//        	editor 		= IDE.openEditor(page, project.getFile("input/wind/iecwind/iecwind.iec"));
//        	document 	= ((XtextEditor)editor).getDocument();
//			document.modify(new IUnitOfWork.Void<XtextResource>() {
//				@Override
//				public void process(XtextResource resource) throws Exception {
//					ModelIecwindiec m = (ModelIecwindiec) resource.getContents().get(0);
//					if (m != null) {
//						m.getHubHeight().setValue(Float.parseFloat(_page2.getTowerHt().getText()));
//						m.getRotDiam().setValue(Float.parseFloat(_page2.getRotDiam().getText()));
//						m.getIECClass().setValue(Integer.parseInt(_page2.getIECClass()));
//						m.getWindTurb().setValue(_page2.getWindTurb());
//						m.getWindIn().setValue(Float.parseFloat(_page2.getWindIn()));
//						m.getWindNom().setValue(Float.parseFloat(_page2.getWindRated()));
//						m.getWindOut().setValue(Float.parseFloat(_page2.getWindOut()));
//					} else
//						throw new IllegalStateException("Uh uh, no content");
//
//				};
//			});
//			
//
		} catch (PartInitException e) {
			e.printStackTrace();
		}
        
        
        return true;
	}

	

}
