package sc.nrel.nwtc.fast.internal.debug.fres;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
/*import org.eclipse.jdt.debug.ui.IJavaDebugUIConstants;
import org.eclipse.jdt.debug.ui.launchConfigurations.AbstractVMInstallPage;
import org.eclipse.jdt.internal.debug.ui.JDIDebugUIPlugin;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMInstallType;
import org.eclipse.jdt.launching.VMStandin;*/
import org.eclipse.jface.wizard.Wizard;

import sc.nrel.nwtc.fast.debug.ui.launchConfigurations.AbstractFASTInstallPage;
import sc.nrel.nwtc.fast.launching.FASTStandin;
import sc.nrel.nwtc.fast.launching.IFASTInstall;
import sc.nrel.nwtc.fast.launching.IFASTInstallType;

/**
 * @since 3.3
 * 
 */
public abstract class FASTInstallWizard extends Wizard {
	
	private FASTStandin fEditFAST;
	private String[] fExistingNames;
	
	/**
	 * Constructs a new wizard to add/edit a FAST install.
	 * 
	 * @param editFAST the FAST being edited, or <code>null</code> if none
	 * @param currentInstalls current VM installs used to validate name changes
	 */
	public FASTInstallWizard(FASTStandin editFAST, IFASTInstall[] currentInstalls) {
		fEditFAST = editFAST;
		List<String> names = new ArrayList<String>(currentInstalls.length);
		for (int i = 0; i < currentInstalls.length; i++) {
			IFASTInstall install = currentInstalls[i];
			if (!install.equals(editFAST)) {
				names.add(install.getName());
			}
		}
		fExistingNames = names.toArray(new String[names.size()]);
	}
	
	/**
	 * Returns the FAST to edit, or <code>null</code> if creating a FAST
	 * 
	 * @return vm to edit or <code>null</code>
	 */
	protected FASTStandin getVMInstall() {
		return fEditFAST;
	}
	
	/**
	 * Returns the resulting FAST after edit or creation or <code>null</code> if none.
	 * 
	 * @return resulting VM
	 */
	protected abstract FASTStandin getResult();

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		return getResult() != null;
	}
	
	/**
	 * Returns a page to use for editing a FAST install type
	 * 
	 * @param type
	 * @return
	 */
	public AbstractFASTInstallPage getPage(IFASTInstallType type) {
		//IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(JDIDebugUIPlugin.getUniqueIdentifier(), IJavaDebugUIConstants.EXTENSION_POINT_VM_INSTALL_PAGES);
		
		// TODO we do not have contributed installs yet!
		/*IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint("sc.nrel.nwtc.fast.ui", "fastInstallPages");
		
		IConfigurationElement[] infos= extensionPoint.getConfigurationElements();
		for (int i = 0; i < infos.length; i++) {
			IConfigurationElement element = infos[i];
			String id = element.getAttribute("fastInstallType"); //$NON-NLS-1$
			if (type.getId().equals(id)) {
				try {
					AbstractFASTInstallPage page = (AbstractFASTInstallPage) element.createExecutableExtension("class"); //$NON-NLS-1$
					page.setExistingNames(fExistingNames);
					return page;
				} catch (CoreException e) {
					// TODO JDIDebugUIPlugin.log(e);
				}
			}
		}*/
		
		StandardFASTPage standardFASTPage = new StandardFASTPage();
		standardFASTPage.setExistingNames(fExistingNames);
		
		return standardFASTPage;
	}

}
