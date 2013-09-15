package sc.ndt.editor.fast.ui.wizard.old.wiz;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;

import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;

import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jdt.internal.ui.packageview.PackageExplorerPart;
import org.eclipse.jdt.internal.ui.workingsets.JavaWorkingSetPage;

public class NewCplWorkingSetWizard extends Wizard implements INewWizard {

	private JavaWorkingSetPage fPage;
	private IStructuredSelection fSelection;

	public NewCplWorkingSetWizard() {
		setDefaultPageImageDescriptor(JavaPluginImages.DESC_WIZBAN_JAVA_WORKINGSET);
		setDialogSettings(JavaPlugin.getDefault().getDialogSettings());
		//setWindowTitle(NewWizardMessages.NewJavaWorkingSetWizard_title);

		fPage= null;
	}

	/*
	 * @see Wizard#addPages
	 */
	public void addPages() {
		super.addPages();
		if (fPage == null) {
			fPage= new JavaWorkingSetPage();
			fPage.setInitialSelection(fSelection);
		}
		addPage(fPage);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	public boolean performFinish() {
		fPage.finish();

		IWorkingSet ws= fPage.getSelection();
		if (ws != null) {
			PlatformUI.getWorkbench().getWorkingSetManager().addWorkingSet(ws);

			PackageExplorerPart explorer= getActivePackageExplorer();
			if (explorer != null) {
				if (explorer.getRootMode() == PackageExplorerPart.WORKING_SETS_AS_ROOTS) {
					explorer.selectReveal(new StructuredSelection(ws));
				}
			}
		}
		return true;
	}

	private PackageExplorerPart getActivePackageExplorer() {
		IWorkbenchPage page= JavaPlugin.getActivePage();
		if (page != null) {
			IWorkbenchPart activePart= page.getActivePart();
			if (activePart instanceof PackageExplorerPart) {
				return (PackageExplorerPart) activePart;
			}
		}
		return null;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		fSelection= selection;
	}
}

