package sc.ndt.editor.fast.ui.wizard.old.wiz;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import org.eclipse.jdt.core.IJavaElement;

import org.eclipse.jdt.ui.IPackagesViewPart;

import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jdt.internal.ui.packageview.PackageExplorerPart;
import org.eclipse.jdt.internal.ui.util.ExceptionHandler;

//import sc.pwdt.cpl.core.ICplElement;
import sc.pwdt.cpl.core.ICplElement;
import sc.pwdt.cpl.ui.CplPluginImages;
import sc.pwdt.internal.CplActivator;

public class CplProjectWizard2 extends NewElementWizard implements IExecutableExtension {

	private NewCplProjectWizardPage1 fFirstPage;
	private NewCplProjectWizardPage2 fSecondPage;

	private IConfigurationElement fConfigElement;

	public CplProjectWizard2() {
		this(null, null);
	}

	public CplProjectWizard2(NewCplProjectWizardPage1 pageOne, NewCplProjectWizardPage2 pageTwo) {
		setDefaultPageImageDescriptor(CplPluginImages.DESC_WIZBAN_NEWJPRJ);
		setDialogSettings(CplActivator.getInstance().getDialogSettings());
		setWindowTitle(NewWizardMessages.CplProjectWizard_title);

		fFirstPage= pageOne;
		fSecondPage= pageTwo;
	}

	public void addPages() {
		if (fFirstPage == null)
			fFirstPage= new NewCplProjectWizardPage1();
		addPage(fFirstPage);

		if (fSecondPage == null)
			fSecondPage= new NewCplProjectWizardPage2(fFirstPage);
		addPage(fSecondPage);

		fFirstPage.init(getSelection(), getActivePart());
	}

	protected void finishPage(IProgressMonitor monitor) throws InterruptedException, CoreException {
		fSecondPage.performFinish(monitor); // use the full progress monitor
	}

	// actually finish
	public boolean performFinish() {
		boolean res= super.performFinish();
		if (res) {
			// SC
			final IJavaElement newElement = getCreatedElement();

			IWorkingSet[] workingSets= fFirstPage.getWorkingSets();
			if (workingSets.length > 0) {
				PlatformUI.getWorkbench().getWorkingSetManager().addToWorkingSets(newElement, workingSets);
			}

			BasicNewProjectResourceWizard.updatePerspective(fConfigElement);
			selectAndReveal(fSecondPage.getJavaProject().getProject());

			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPart activePart= getActivePart();
					if (activePart instanceof IPackagesViewPart) {
						PackageExplorerPart view= PackageExplorerPart.openInActivePerspective();
						view.tryToReveal(newElement);
					}
				}
			});
		}
		return res;
	}

	private IWorkbenchPart getActivePart() {
		IWorkbenchWindow activeWindow= getWorkbench().getActiveWorkbenchWindow();
		if (activeWindow != null) {
			IWorkbenchPage activePage= activeWindow.getActivePage();
			if (activePage != null) {
				return activePage.getActivePart();
			}
		}
		return null;
	}

	protected void handleFinishException(Shell shell, InvocationTargetException e) {
		String title= NewWizardMessages.JavaProjectWizard_op_error_title;
		String message= NewWizardMessages.JavaProjectWizard_op_error_create_message;
		ExceptionHandler.handle(e, getShell(), title, message);
	}

	/*
	 * Stores the configuration element for the wizard.  The config element will be used
	 * in <code>performFinish</code> to set the result perspective.
	 */
	public void setInitializationData(IConfigurationElement cfig, String propertyName, Object data) {
		fConfigElement= cfig;
	}

	public boolean performCancel() {
		fSecondPage.performCancel();
		return super.performCancel();
	}

	public IJavaElement getCreatedElement() {
		return fSecondPage.getJavaProject();
	}
}
