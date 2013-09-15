package sc.nrel.nwtc.fast.internal.debug.fres;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.debug.internal.ui.actions.StatusInfo;
import org.eclipse.debug.ui.StringVariableSelectionDialog;
/*import org.eclipse.jdt.debug.ui.launchConfigurations.AbstractVMInstallPage;
import org.eclipse.jdt.internal.debug.ui.IJavaDebugHelpContextIds;
import org.eclipse.jdt.internal.debug.ui.JavaDebugImages;
import org.eclipse.jdt.internal.debug.ui.StatusInfo;
import org.eclipse.jdt.launching.AbstractVMInstallType;
import org.eclipse.jdt.launching.IVMInstallType;
import org.eclipse.jdt.launching.VMStandin;*/
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import sc.nrel.nwtc.fast.debug.ui.launchConfigurations.AbstractFASTInstallPage;
import sc.nrel.nwtc.fast.launching.FASTStandin;
import sc.nrel.nwtc.fast.launching.IFASTInstallType;

/**
 * Page used to edit a standard VM.
 * 
 * @since 3.3
 */
public class StandardFASTPage extends AbstractFASTInstallPage {
	
	// VM being edited or created
	private FASTStandin fVM;
	private Text fVMName;
	private Text fVMArgs;
	private Text fJRERoot;
//	private VMLibraryBlock fLibraryBlock;
// the VM install's javadoc location
	private URL fJavadocLocation = null;
	private boolean fAutoDetectAttributes = false;
	private IStatus[] fFieldStatus = new IStatus[1];
	
	/**
	 * 
	 */
	public StandardFASTPage() {
		super(FREMessages.StandardVMPage_0);
		for (int i = 0; i < fFieldStatus.length; i++) {
			fFieldStatus[i] = Status.OK_STATUS;
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#getImage()
	 */
	@Override
	public Image getImage() {
		return null; // TODO JavaDebugImages.get(JavaDebugImages.IMG_WIZBAN_LIBRARY);
	}	

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite p) {
		// create a composite with standard margins and spacing
		Composite composite = new Composite(p, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
	// VM location
		SWTFactory.createLabel(composite, FREMessages.addVMDialog_jreHome, 1);
		fJRERoot = SWTFactory.createSingleText(composite, 1);
		Button folders = SWTFactory.createPushButton(composite, FREMessages.AddVMDialog_22, null);
		GridData data = (GridData) folders.getLayoutData();
		data.horizontalAlignment = GridData.END;
	//VM name
		SWTFactory.createLabel(composite, FREMessages.addVMDialog_jreName, 1);
		fVMName = SWTFactory.createSingleText(composite, 2);
	//VM arguments
		SWTFactory.createLabel(composite, FREMessages.AddVMDialog_23, 1);
		fVMArgs = SWTFactory.createSingleText(composite, 1);
		Button variables = SWTFactory.createPushButton(composite, FREMessages.StandardVMPage_3, null);
		data = (GridData) variables.getLayoutData();
		data.horizontalAlignment = GridData.END;
	
	//VM libraries block 
		/* TODO
		SWTFactory.createLabel(composite, FREMessages.AddVMDialog_JRE_system_libraries__1, 3);
		fLibraryBlock = new VMLibraryBlock();
		fLibraryBlock.setWizard(getWizard());
		fLibraryBlock.createControl(composite);
		Control libControl = fLibraryBlock.getControl();
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 3;
		libControl.setLayoutData(gd);
		*/
	
	//add the listeners now to prevent them from monkeying with initialized settings
		fVMName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateVMName();
			}
		});
		fJRERoot.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateFRELocation();
			}
		});
		folders.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {}
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(getShell());
				File file = new File(fJRERoot.getText());
				String text = fJRERoot.getText();
				if (file.isFile()) {
					text = file.getParentFile().getAbsolutePath();
				}
				dialog.setFilterPath(text);
				dialog.setMessage(FREMessages.addVMDialog_pickJRERootDialog_message); 
				String newPath = dialog.open();
				if (newPath != null) {
					fJRERoot.setText(newPath);
				}
			}
		});
		variables.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				StringVariableSelectionDialog dialog = new StringVariableSelectionDialog(getShell());
				if (dialog.open() == Window.OK) {
					String expression = dialog.getVariableExpression();
					if (expression != null) {
						fVMArgs.insert(expression);
					}
				}
			}
		});
		Dialog.applyDialogFont(composite);
		setControl(composite);
		initializeFields();
		
		// TODO PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), IJavaDebugHelpContextIds.EDIT_JRE_STD_VM_WIZARD_PAGE);	
	}	
	
	/**
	 * Validates the JRE location
	 * @return the status after validating the JRE location
	 */
	private void validateFRELocation() {
		//TODO fall into endless loop// 
		
		String locationName = fJRERoot.getText();
		IStatus s = null;
		File file = null;
		if (locationName.length() == 0) {
			 s = new StatusInfo(IStatus.WARNING, FREMessages.addVMDialog_enterLocation); 
		} else {
			file = new File(locationName);
			if (!file.exists()) {
				s = new StatusInfo(IStatus.ERROR, FREMessages.addVMDialog_locationNotExists); 
			} 
			else {
				final IStatus[] temp = new IStatus[1];
				final File tempFile = file; 
				Runnable r = new Runnable() {
					public void run() {
						temp[0] = fVM.getFASTInstallType().validateInstallLocation(tempFile);
					}
				};
				BusyIndicator.showWhile(getShell().getDisplay(), r);
				s = temp[0];
			}
		}
		if (file != null) {
			fVM.setInstallLocation(file);
		}
		if (s.isOK() && file != null) {
			String name = fVMName.getText();
			if (name == null || name.trim().length() == 0) {
				// auto-generate VM name
				if (file.isFile()) {
					String fileName = file.getName();
					int index = fileName.lastIndexOf(".ee"); //$NON-NLS-1$
					if (index > 0) {
						fileName = fileName.substring(0, index);
					}
					fVMName.setText(fileName);
				} else {
					try {
						String genName = null;
						IPath path = new Path(file.getCanonicalPath());
						int segs = path.segmentCount();
						if (segs == 1) {
							genName = path.segment(0);
						} 
						else if (segs >= 2) {
							String last = path.lastSegment();
							//if ("jre".equalsIgnoreCase(last)) { //$NON-NLS-1$
							//	genName = path.segment(segs - 2);
							//} 
							//else {
								genName = "FAST "+last;
							//}
						}
						if (genName != null) {
							fVMName.setText(genName);
						}
					} catch (IOException e) {}
				}
			}
		}
		detectJavadocLocation();
		// TODO setJRELocationStatus(s);
		// TODO fLibraryBlock.setSelection(fVM);
		
		updatePageStatus();
		
	}
	
	/**
	 * Auto-detects the default javadoc location
	 */
	private void detectJavadocLocation() {
		/* TODO if (fAutoDetectAttributes) {
			IFASTInstallType type = fVM.getVMInstallType();
			if (type instanceof AbstractFASTInstallType) {
				AbstractFASTInstallType atype = (AbstractFASTInstallType)type;
				fJavadocLocation = atype.getDefaultJavadocLocation(getInstallLocation());
				String args = atype.getDefaultVMArguments(getInstallLocation());
				if (args != null) {
					fVMArgs.setText(args);
				}
			}
		} else {
			fJavadocLocation = fVM.getJavadocLocation();
		} */
	} 
	
	/**
	 * Returns the installation location as a file from the JRE root text control
	 * @return the installation location as a file
	 */
	protected File getInstallLocation() {
		return new File(fJRERoot.getText());
	}	

	/**
	 * Validates the entered name of the VM
	 * @return the status of the name validation
	 */
	private void validateVMName() {
		nameChanged(fVMName.getText());
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jdt.debug.ui.launchConfigurations.AbstractVMInstallPage#finish()
	 */
	@Override
	public boolean finish() {
		setFieldValuesToVM(fVM);
		/*fLibraryBlock.finish(); */
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.debug.ui.launchConfigurations.AbstractVMInstallPage#getSelection()
	 */
	@Override
	public FASTStandin getSelection() {
		return fVM;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jdt.debug.ui.launchConfigurations.AbstractVMInstallPage#setSelection(org.eclipse.jdt.launching.VMStandin)
	 */
	@Override
	public void setSelection(FASTStandin vm) {
		super.setSelection(vm);
		fVM = vm;
		// TODO fAutoDetectAttributes = vm.getJavadocLocation() == null;
		setTitle(FREMessages.StandardVMPage_1);
		setDescription(FREMessages.StandardVMPage_2);
		
	}
	
	/**
	 * initialize fields to the specified VM
	 * @param vm the VM to initialize from
	 */
	protected void setFieldValuesToVM(FASTStandin vm) {
		File dir = new File(fJRERoot.getText());
		File file = dir.getAbsoluteFile();
		vm.setInstallLocation(file);
		vm.setName(fVMName.getText());
		// TODO vm.setJavadocLocation(getURL());
		
		String argString = fVMArgs.getText().trim();
		if (argString != null && argString.length() > 0) {
			// TODO vm.setVMArgs(argString);			
		} 
		else {
			// TODO vm.setVMArgs(null);
		}
	}
	
	/**
	 * Returns the URL for the javadoc location
	 * @return the URL for the javadoc location
	 */
	protected URL getURL() {
		return fJavadocLocation;
	}
	
	/**
	 * Creates a unique name for the VMInstallType
	 * @param vmType the vm install type
	 * @return a unique name
	 */
	protected static String createUniqueId(IFASTInstallType vmType) {
		String id = null;
		do {
			id = String.valueOf(System.currentTimeMillis());
		} while (vmType.findFASTInstall(id) != null);
		return id;
	}	
	
	/**
	 * Initialize the dialogs fields
	 */
	private void initializeFields() {
		// TODO fLibraryBlock.setSelection(fVM);
		fVMName.setText(fVM.getName());
		File installLocation = fVM.getInstallLocation();
		if (installLocation != null) {
			fJRERoot.setText(installLocation.getAbsolutePath());
		}
		// TODO String vmArgs = fVM.getVMArgs();
		//if (vmArgs != null) {
		//	fVMArgs.setText(vmArgs);
		//}
		validateVMName();
		validateFRELocation();
		
	}	
	
	/**
	 * Sets the status of the JRE location field.
	 * 
	 * @param status JRE location status
	 */
	private void setJRELocationStatus(IStatus status) {
		fFieldStatus[0] = status;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.DialogPage#getErrorMessage()
	 */
	@Override
	public String getErrorMessage() {
		String message = super.getErrorMessage();
		/* TODO if (message == null) {
			return fLibraryBlock.getErrorMessage();
		} */
		return message;

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.WizardPage#isPageComplete()
	 */
	@Override
	public boolean isPageComplete() {
		boolean complete = super.isPageComplete();
		/* TODO if (complete) {
			return fLibraryBlock.isPageComplete();
		} */
		return complete;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.debug.ui.launchConfigurations.AbstractVMInstallPage#getVMStatus()
	 */
	@Override
	protected IStatus[] getVMStatus() {
		return fFieldStatus;
	}
	
}
