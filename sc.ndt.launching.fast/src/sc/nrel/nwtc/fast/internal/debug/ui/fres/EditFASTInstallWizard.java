/*******************************************************************************
 * Copyright (c) 2007, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package sc.nrel.nwtc.fast.internal.debug.ui.fres;

import sc.nrel.nwtc.fast.debug.ui.launchConfigurations.AbstractFASTInstallPage;
import sc.nrel.nwtc.fast.internal.debug.fres.FASTInstallWizard;
import sc.nrel.nwtc.fast.internal.debug.fres.FREMessages;
import sc.nrel.nwtc.fast.launching.FASTStandin;
import sc.nrel.nwtc.fast.launching.IFASTInstall;


/**
 * @since 3.3
 */
public class EditFASTInstallWizard extends FASTInstallWizard {
	
	private AbstractFASTInstallPage fEditPage;
	
	/**
	 * Constructs a wizard to edit the given vm.
	 * 
	 * @param vm vm to edit
	 * @param allVMs all VMs being edited
	 */
	public EditFASTInstallWizard(FASTStandin vm, IFASTInstall[] allVMs) {
		super(vm, allVMs);
		setWindowTitle(FREMessages.EditVMInstallWizard_0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		fEditPage = getPage(getVMInstall().getFASTInstallType());
		fEditPage.setSelection(new FASTStandin(getVMInstall()));
		addPage(fEditPage);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		if (fEditPage.finish()) {
			return super.performFinish();
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.internal.debug.ui.jres.VMInstallWizard#getResult()
	 */
	@Override
	public FASTStandin getResult() {
		return fEditPage.getSelection();
	}

	
}
