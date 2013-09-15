package sc.nrel.nwtc.fast.internal.debug.fres;

import org.eclipse.jface.wizard.IWizardPage;

import sc.nrel.nwtc.fast.debug.ui.launchConfigurations.AbstractFASTInstallPage;
import sc.nrel.nwtc.fast.launching.FASTStandin;
import sc.nrel.nwtc.fast.launching.IFASTInstall;

/**
 * @since 3.3
 */
public class AddFASTInstallWizard extends FASTInstallWizard {
	
	private IWizardPage fTypePage = null;
	
	private FASTStandin fResult = null;

	/**
	 * Constructs a wizard to add a new FAST install.
	 * 
	 * @param currentInstalls currently existing FASTs, used for name validation
	 */
	public AddFASTInstallWizard(IFASTInstall[] currentInstalls) {
		super(null, currentInstalls);
		setForcePreviousAndNextButtons(true);
		setWindowTitle(FREMessages.AddVMInstallWizard_0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		fTypePage = new FASTTypePage();
		addPage(fTypePage);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.internal.debug.ui.jres.VMInstallWizard#getResult()
	 */
	@Override
	protected FASTStandin getResult() {
		return fResult;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.internal.debug.ui.jres.VMInstallWizard#canFinish()
	 */
	@Override
	public boolean canFinish() {
		IWizardPage currentPage = getContainer().getCurrentPage();
		return currentPage != fTypePage && super.canFinish() && currentPage.isPageComplete();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.internal.debug.ui.jres.VMInstallWizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		IWizardPage currentPage = getContainer().getCurrentPage();
		if (currentPage instanceof AbstractFASTInstallPage) {
			AbstractFASTInstallPage page = (AbstractFASTInstallPage) currentPage;
			boolean finish = page.finish();
			fResult = page.getSelection();
			return finish;
		}
		return false;
	}

	
	
}
