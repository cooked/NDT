package sc.nrel.nwtc.fast.internal.debug.fres;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

import sc.nrel.nwtc.fast.debug.ui.launchConfigurations.AbstractFASTInstallPage;
import sc.nrel.nwtc.fast.launching.FASTRuntime;
import sc.nrel.nwtc.fast.launching.FASTStandin;
import sc.nrel.nwtc.fast.launching.IFASTInstallType;

/**
 * Wizard page used to select a FAST type.
 * 
 * @since 3.3
 */
public class FASTTypePage extends WizardPage {
	
	private ListViewer fTypesViewer;
	
	private AbstractFASTInstallPage fNextPage;
	
	/**
	 * Keep track of pages created, so we can dispose of them.
	 */
	private Set<AbstractFASTInstallPage> fPages = new HashSet<AbstractFASTInstallPage>();
	
	/**
	 * Label provider for FAST types
	 */
	private class TypeLabelProvider extends LabelProvider {

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
		 */
		@Override
		public String getText(Object element) {
			if (element instanceof IFASTInstallType) {
				IFASTInstallType type = (IFASTInstallType) element;
				return type.getName();
			}
			return super.getText(element);
		}
		
	}
	
	/**
	 * Constructs a FAST type selection page
	 */
	public FASTTypePage() {
		super(FREMessages.VMTypePage_0);
		setDescription(FREMessages.VMTypePage_1);
		setTitle(FREMessages.VMTypePage_2);
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.DialogPage#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
		Iterator<AbstractFASTInstallPage> iterator = fPages.iterator();
		while (iterator.hasNext()) {
			AbstractFASTInstallPage page = iterator.next();
			page.dispose();
		}
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite composite = SWTFactory.createComposite(parent, 1, 1, GridData.FILL_BOTH);
		
		SWTFactory.createLabel(composite, FREMessages.VMTypePage_3, 1);
		
		fTypesViewer = new ListViewer(composite, SWT.SINGLE | SWT.BORDER);
		GridData data = new GridData(GridData.FILL_BOTH);
        data.heightHint = 250;
        data.widthHint = 300;
        fTypesViewer.getControl().setFont(composite.getFont());
        fTypesViewer.getControl().setLayoutData(data);
        fTypesViewer.setContentProvider(new ArrayContentProvider());
        fTypesViewer.setLabelProvider(new TypeLabelProvider());
		fTypesViewer.setComparator(new ViewerComparator());
		fTypesViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				setPageComplete(true);
				updateNextPage();
				getWizard().getContainer().showPage(getNextPage());
			}
		});
		fTypesViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent event) {
				if (event.getSelection().isEmpty()){
					setPageComplete(false);
				} else{
					setPageComplete(true);
					updateNextPage();
				}
			}
		});
		fTypesViewer.setInput(FASTRuntime.getFASTInstallTypes());
		setControl(composite);
		/*fTypesViewer.setSelection(
				new StructuredSelection(
						FASTRuntime.getFASTInstallType(StandardFASTType.ID_STANDARD_VM_TYPE)
						)
				);
		*/		
		updateNextPage();
		// TODO PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), IJavaDebugHelpContextIds.ADD_NEW_JRE_WIZARD_PAGE);	
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#getImage()
	 */
	@Override
	public Image getImage() {
		return null; // TODO JavaDebugImages.get(JavaDebugImages.IMG_WIZBAN_LIBRARY);
	}	
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.WizardPage#getNextPage()
	 */
	@Override
	public IWizardPage getNextPage() {
		return fNextPage;
	}
	
	private void updateNextPage() {
		if (isPageComplete()) {
			IStructuredSelection selection = (IStructuredSelection)fTypesViewer.getSelection();
			if (!selection.isEmpty()){
				IFASTInstallType installType = (IFASTInstallType)selection.getFirstElement();
				AbstractFASTInstallPage page = ((FASTInstallWizard)getWizard()).getPage(installType);
				page.setWizard(getWizard());
				FASTStandin standin = new FASTStandin(installType, StandardFASTPage.createUniqueId(installType));
				standin.setName(""); //$NON-NLS-1$
				page.setSelection(standin);
				fNextPage = page;
				fPages.add(page);
			}
		}		
	}

}
