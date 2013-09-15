package sc.nrel.nwtc.fast.internal.launching;

import sc.nrel.nwtc.fast.launching.IFASTInstall;
import sc.nrel.nwtc.fast.launching.IFASTInstallChangedListener;
import sc.nrel.nwtc.fast.launching.PropertyChangeEvent;

/**
 * Simple VM listener that reports whether VM settings have changed.
 * 
 * @since 3.2
 *
 */
public class VMListener implements IFASTInstallChangedListener {
	
	private boolean fChanged = false;

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.launching.IVMInstallChangedListener#defaultVMInstallChanged(org.eclipse.jdt.launching.IVMInstall, org.eclipse.jdt.launching.IVMInstall)
	 */
	public void defaultVMInstallChanged(IFASTInstall previous, IFASTInstall current) {
		fChanged = true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.launching.IVMInstallChangedListener#vmAdded(org.eclipse.jdt.launching.IVMInstall)
	 */
	public void vmAdded(IFASTInstall vm) {
		fChanged = true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.launching.IVMInstallChangedListener#vmChanged(org.eclipse.jdt.launching.PropertyChangeEvent)
	 */
	public void vmChanged(PropertyChangeEvent event) {
		fChanged = true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.launching.IVMInstallChangedListener#vmRemoved(org.eclipse.jdt.launching.IVMInstall)
	 */
	public void vmRemoved(IFASTInstall vm) {
		fChanged = true;
	}
	
	public boolean isChanged() {
		return fChanged;
	}

}
