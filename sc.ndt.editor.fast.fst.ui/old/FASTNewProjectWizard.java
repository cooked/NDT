package sc.ndt.editor.fast.ui.wizard.old;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.TextProcessor;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;

import com.google.inject.Inject;

public class FASTNewProjectWizard extends XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	@Inject
	public FASTNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New Project");
	}

	public void addPages() {
			mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
			mainPage.setTitle("My Project");
			addPage(mainPage);
	}

	@Override
	protected IProjectInfo getProjectInfo() {
		FMainProjectInfo projectInfo = new FMainProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}
}


/*
extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage mainPage;
	
	private WizardNewFileCreationPage mainFilePage;
	private WizardNewFileCreationPage aeroFilePage;
	private WizardNewFileCreationPage towerFilePage;
	private WizardNewFileCreationPage bladeFilePage;

	private IWorkbench workbench;
	private IStructuredSelection selection;
	
	public FASTNewProjectWizard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}

	public void addPages() {
		
		mainPage = new WizardNewProjectCreationPage("New FAST Project");
		mainPage.setTitle("FAST Project");
		addPage(mainPage);
		
		mainFilePage = new WizardNewFileCreationPage("New FAST Project", selection);
		mainFilePage.setTitle("FAST Main file");
		addPage(mainFilePage);
		
		aeroFilePage = new WizardNewFileCreationPage("New FAST Project", null);
		aeroFilePage.setTitle("FAST AeroDyn file");
		addPage(aeroFilePage);
		
		
	}
	
	@Override
	public boolean performFinish() {

		return false;
	}

	
	///////////////////////////////////////////////////////
	private void createNewProjectFolderExtended() {

		//String 		projName 	= page1.getProjectName();
		IPath 		path 		= null;

		String[] projectFolder 	= {"MB_Model","Run"};

		for(int i=0; i<projectFolder.length; i++) {
			path = (new Path(TextProcessor.deprocess(projName+File.separator+projectFolder[i])));
			createNewFolder(createFolderHandle(path));
		}
	}
}*/
