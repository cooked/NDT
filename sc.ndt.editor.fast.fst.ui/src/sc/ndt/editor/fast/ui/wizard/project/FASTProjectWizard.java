package sc.ndt.editor.fast.ui.wizard.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;
import java.util.TreeSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import sc.ndt.commons.http.HttpUtils;
import sc.ndt.commons.ui.editor.IXtextFormEditor;
import sc.ndt.editor.fast.fastadn.ModelFastadn;
import sc.ndt.editor.fast.fastfst.ModelFastfst;
import sc.ndt.editor.fast.ui.mpe.ui.FstMultiPageEditor;
import sc.nrel.nwtc.fast.launching.FASTRuntime;
import sc.nrel.nwtc.fast.launching.IFASTInstall;

public class FASTProjectWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private static final String PAGE_NAME 	= "New FAST Project Wizard"; //$NON-NLS-1$
	private static final String WIZARD_NAME = "New FAST Project"; //$NON-NLS-1$
	
	private WizardNewProjectCreationPage 	_page1;
	private FASTProjectWizardPage2 			_page2;
	
	private IConfigurationElement 	_configurationElement;
	private IStructuredSelection 	_selection;
	private IWorkbench _workbench;
	
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
		
		_workbench = workbench;
		_selection = selection;
		
	}
	
	@Override
	public void addPages() {
	    super.addPages();
	 
	    _page1 = new WizardNewProjectCreationPage(PAGE_NAME);
	    _page1.setTitle("From Scratch Project");
	    _page1.setDescription("Create something from scratch.");
	 
	    _page2 = new FASTProjectWizardPage2(_selection);
	    _page2.setTitle("From Scratch Project");
	    _page2.setDescription("Create something from scratch.");
	    
	    addPage(_page1);
	    //addPage(_page2);
	}

	@Override
	public boolean performFinish() {
		
		String name = _page1.getProjectName();
        URI location = null;
        if (!_page1.useDefaults()) {
            location = _page1.getLocationURI();
            System.err.println("location: " + location.toString()); //$NON-NLS-1$
        }

        IProject prj = FASTProjectSupport.createProject(name, location);
        BasicNewProjectResourceWizard.updatePerspective(_configurationElement);

        // see:
        // http://stackoverflow.com/questions/17011108/how-can-i-write-java-properties-in-a-defined-order
        
        Properties properties = new Properties() {
            @Override
            public synchronized Enumeration<Object> keys() {
                return Collections.enumeration(new TreeSet<Object>(super.keySet()));
            }
        };
        
        //IPath path = file.getProjectRelativePath();
    	//String str = path.toString();
    	
        IFile f = prj.getFile("build.properties");
        
        InputStream is;
		try {
			is = f.getContents();
			properties.load(is);
			is.close();
			
			// TODO: get default from preferences
			String fastLoc 		= "";
			String turbsimLoc 	= "";
			String crunchLoc 	= "";
			
			IFASTInstall fdi = FASTRuntime.getDefaultFASTInstall();
			if(fdi!=null)
				fastLoc = fdi.getInstallLocation().getAbsoluteFile().toString();
			
			if (Platform.getOS().matches(Platform.OS_WIN32))
                fastLoc = fastLoc + File.separatorChar + "FAST.exe";
			else if (Platform.getOS().matches(Platform.OS_MACOSX))
				fastLoc = fastLoc + File.separatorChar + "FAST";

			
			// TODO: substitute constant string with variable
			properties.setProperty("file.FAST", 	prj.getName()+".fst");
			properties.setProperty("loc.fast", 		fastLoc);
	        properties.setProperty("loc.turbsim", 	turbsimLoc);
	        properties.setProperty("loc.crunch", 	crunchLoc);
	        
	        //f.getFullPath().toFile()
	        File fi = f.getLocation().toFile();
	        
	        FileOutputStream os = new FileOutputStream(fi);
	        properties.store(os,"");
	        
	        // see
	        // http://www.eclipse.org/forums/index.php/t/99891/
	        f.refreshLocal(IResource.NONE, null);
	        
	        
		} catch (CoreException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
        // http://blog.eclipse-tips.com/2008/07/how-to-create-new-file-wizard.html
        // http://wiki.eclipse.org/FAQ_How_do_I_find_the_active_workbench_page%3F
        try {
        	
        	IEditorPart 	editor;
        	IXtextDocument 	document;
        	IWorkbenchPage 	page 	= _workbench.getActiveWorkbenchWindow().getActivePage();
        	IProject 		project	= ResourcesPlugin.getWorkspace().getRoot().getProject(_page1.getProjectName());
  
        	
        	// write to model of FAST.fst
			editor = IDE.openEditor(page, project.getFile(name+".fst"));
			if(editor instanceof IXtextFormEditor)
				document = ((IXtextFormEditor)editor).getXtextEditor("fst").getDocument();
			else if(editor instanceof XtextEditor)
				document = ((XtextEditor)editor).getDocument();
			else
				return true;
			
			
			/* TODO 
			document.modify(new IUnitOfWork.Void<XtextResource>() {
				@Override
				public void process(XtextResource resource) throws Exception {
					ModelFastfst m = (ModelFastfst) resource.getContents().get(0);
					if (m != null) {
						m.getTowerHt().setValue(Float.parseFloat(_page2.getTowerHt().getText()));
						m.getNumBl().setValue(Integer.parseInt(_page2.getNumBl().getText()));
						m.getTipRad().setValue(Float.parseFloat(_page2.getRotDiam().getText())/2);
					} else
						throw new IllegalStateException("Uh uh, no content");

				};
			});
			
			// write to model of aerodyn.adn
        	editor 		= IDE.openEditor(page, project.getFile("input/aero/aerodyn.adn"));
        	document 	= ((XtextEditor)editor).getDocument();
			document.modify(new IUnitOfWork.Void<XtextResource>() {
				@Override
				public void process(XtextResource resource) throws Exception {
					ModelFastadn m = (ModelFastadn) resource.getContents().get(0);
					if (m != null) {
						m.getHH().setValue(Float.parseFloat(_page2.getTowerHt().getText()));
					} else
						throw new IllegalStateException("Uh uh, no content");
				};
			});
			
			// write to model of tower.twr
        	editor 		= IDE.openEditor(page, project.getFile("input/tower.twr"));
        	document 	= ((XtextEditor)editor).getDocument();
			
        	// write to model of blade.bld
        	editor 		= IDE.openEditor(page, project.getFile("input/blade.bld"));
        	document 	= ((XtextEditor)editor).getDocument();
			
			// write to model of iecwind.iec
        	editor 		= IDE.openEditor(page, project.getFile("input/wind/iecwind/iecwind.iec"));
        	document 	= ((XtextEditor)editor).getDocument();
			document.modify(new IUnitOfWork.Void<XtextResource>() {
				@Override
				public void process(XtextResource resource) throws Exception {
					ModelIecwindiec m = (ModelIecwindiec) resource.getContents().get(0);
					if (m != null) {
						m.getHubHeight().setValue(Float.parseFloat(_page2.getTowerHt().getText()));
						m.getRotDiam().setValue(Float.parseFloat(_page2.getRotDiam().getText()));
						m.getIECClass().setValue(Integer.parseInt(_page2.getIECClass()));
						m.getWindTurb().setValue(_page2.getWindTurb());
						m.getWindIn().setValue(Float.parseFloat(_page2.getWindIn()));
						m.getWindNom().setValue(Float.parseFloat(_page2.getWindRated()));
						m.getWindOut().setValue(Float.parseFloat(_page2.getWindOut()));
					} else
						throw new IllegalStateException("Uh uh, no content");

				};
			});
			*/

		} catch (PartInitException e) {
			e.printStackTrace();
		}
        
        
        return true;
	}

	

}
