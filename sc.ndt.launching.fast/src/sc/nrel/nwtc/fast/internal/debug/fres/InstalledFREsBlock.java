package sc.nrel.nwtc.fast.internal.debug.fres;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.internal.ui.SWTFactory;
/*import org.eclipse.jdt.internal.debug.ui.JDIDebugUIPlugin;
import org.eclipse.jdt.launching.AbstractVMInstall;
import org.eclipse.jdt.launching.AbstractVMInstallType;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMInstallType;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.VMStandin;
import org.eclipse.jdt.ui.ISharedImages;
import org.eclipse.jdt.ui.JavaUI;*/

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import sc.nrel.nwtc.fast.internal.debug.ui.fres.EditFASTInstallWizard;
import sc.nrel.nwtc.fast.launching.AbstractFASTInstall;
import sc.nrel.nwtc.fast.launching.AbstractFASTInstallType;
import sc.nrel.nwtc.fast.launching.FASTRuntime;
import sc.nrel.nwtc.fast.launching.FASTStandin;
import sc.nrel.nwtc.fast.launching.IFASTInstall;
import sc.nrel.nwtc.fast.launching.IFASTInstallType;

/**
 * A composite that displays installed FRE's in a table. FREs can be 
 * added, removed, edited, and searched for.
 * <p>
 * This block implements ISelectionProvider - it sends selection change events
 * when the checked FRE in the table changes, or when the "use default" button
 * check state changes.
 * </p>
 */
public class InstalledFREsBlock implements IAddFASTDialogRequestor, ISelectionProvider {
	
	/**
	 * This block's control
	 */
	private Composite fControl;
	
	/**
	 * FASTs being displayed
	 */
	private List<Object> fFASTs = new ArrayList<Object>(); 
	
	/**
	 * The main list control
	 */ 
	private CheckboxTableViewer fFASTList;
	
	// Action buttons
	private Button fAddButton;
	private Button fRemoveButton;
	private Button fEditButton;
	private Button fCopyButton;
	private Button fSearchButton;	
    
	// index of column used for sorting
	private int fSortColumn = 0;
	
	/**
	 * Selection listeners (checked FRE changes)
	 */
	private ListenerList fSelectionListeners = new ListenerList();
	
	/**
	 * Previous selection
	 */
	private ISelection fPrevSelection = new StructuredSelection();

    private Table fTable;
			
	// Make sure that VMStandin ids are unique if multiple calls to System.currentTimeMillis()
	// happen very quickly
	private static String fgLastUsedID;	
	
	/**
	 * VM install type id for OSX VMs
	 */
	public static final String MACOSX_VM_TYPE_ID = "org.eclipse.jdt.internal.launching.macosx.MacOSXType"; //$NON-NLS-1$
	
	/** 
	 * Content provider to show a list of FREs
	 */ 
	class FREsContentProvider implements IStructuredContentProvider {		
		public Object[] getElements(Object input) {
			return fFASTs.toArray();
		}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
	}
	
	/**
	 * Label provider for installed FREs table.
	 */
	class VMLabelProvider extends LabelProvider implements ITableLabelProvider {

		/**
		 * @see ITableLabelProvider#getColumnText(Object, int)
		 */
		public String getColumnText(Object element, int columnIndex) {
			if (element instanceof IFASTInstall) {
				IFASTInstall vm= (IFASTInstall)element;
				switch(columnIndex) {
					case 0:
						if (isContributed(vm)) {
							String[] str = new String[]{vm.getName()};
							return NLS.bind(FREMessages.InstalledJREsBlock_19, str);
						}
						return vm.getName();
					case 1:
						return vm.getInstallLocation().getAbsolutePath();
					case 2: 
						return vm.getFASTInstallType().getName();						
				}
			}
			return element.toString();
		}

		/**
		 * @see ITableLabelProvider#getColumnImage(Object, int)
		 */
		public Image getColumnImage(Object element, int columnIndex) {
			/* TODO if (columnIndex == 0) {
				return JavaUI.getSharedImages().getImage(ISharedImages.IMG_OBJS_LIBRARY);
			}*/
			return null;
		}

	}	
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionProvider#addSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
	 */
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		fSelectionListeners.add(listener);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionProvider#getSelection()
	 */
	public ISelection getSelection() {
		return new StructuredSelection(fFASTList.getCheckedElements());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionProvider#removeSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
	 */
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		fSelectionListeners.remove(listener);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionProvider#setSelection(org.eclipse.jface.viewers.ISelection)
	 */
	public void setSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			if (!selection.equals(fPrevSelection)) {
				fPrevSelection = selection;
				Object jre = ((IStructuredSelection)selection).getFirstElement();
				if (jre == null) {
					fFASTList.setCheckedElements(new Object[0]);
				} else {
					fFASTList.setCheckedElements(new Object[]{jre});
					fFASTList.reveal(jre);
				}
				fireSelectionChanged();
			}
		}
	}

	/**
	 * Creates this block's control in the given control.
	 * 
	 * @param ancestor containing control
	 * @param useManageButton whether to present a single 'manage...' button to
	 *  the user that opens the installed JREs pref page for JRE management,
	 *  or to provide 'add, remove, edit, and search' buttons.
	 */
	public void createControl(Composite ancestor) {
		Font font = ancestor.getFont();
		Composite parent= SWTFactory.createComposite(ancestor, font, 2, 1, GridData.FILL_BOTH);
		fControl = parent;	
				
		SWTFactory.createLabel(parent, FREMessages.InstalledJREsBlock_15, 2);
				
		fTable= new Table(parent, SWT.CHECK | SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 250;
		gd.widthHint = 350;
		fTable.setLayoutData(gd);
		fTable.setFont(font);
		fTable.setHeaderVisible(true);
		fTable.setLinesVisible(true);	

		TableColumn column = new TableColumn(fTable, SWT.NULL);
		column.setText(FREMessages.InstalledJREsBlock_0); 
		column.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sortByName();
			}
		});
		int defaultwidth = 350/3 +1;
		column.setWidth(defaultwidth);
	
		column = new TableColumn(fTable, SWT.NULL);
		column.setText(FREMessages.InstalledJREsBlock_1); 
		column.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sortByLocation();
			}
		});
		column.setWidth(defaultwidth);
		
		column = new TableColumn(fTable, SWT.NULL);
		column.setText(FREMessages.InstalledJREsBlock_2); 
		column.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sortByType();
			}
		});
		column.setWidth(defaultwidth);
		
		fFASTList = new CheckboxTableViewer(fTable);			
		fFASTList.setLabelProvider(new VMLabelProvider());
		fFASTList.setContentProvider(new FREsContentProvider());
		// by default, sort by name
		sortByName();
		
		fFASTList.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent evt) {
				enableButtons();
			}
		});
		
		fFASTList.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				if (event.getChecked()) {
					setCheckedFRE((IFASTInstall)event.getElement());
				} else {
					setCheckedFRE(null);
				}
			}
		});
		
		fFASTList.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent e) {
				if (!fFASTList.getSelection().isEmpty()) {
					editVM();
				}
			}
		});
		fTable.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent event) {
				if (event.character == SWT.DEL && event.stateMask == 0) {
					if (fRemoveButton.isEnabled()){
						removeVMs();
					}
				}
			}
		});	
		
		Composite buttons = SWTFactory.createComposite(parent, font, 1, 1, GridData.VERTICAL_ALIGN_BEGINNING, 0, 0);
		
		fAddButton = SWTFactory.createPushButton(buttons, FREMessages.InstalledJREsBlock_3, null); 
		fAddButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				addVM();
			}
		});
		
		fEditButton= SWTFactory.createPushButton(buttons, FREMessages.InstalledJREsBlock_4, null); 
		fEditButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				editVM();
			}
		});
		
		fCopyButton = SWTFactory.createPushButton(buttons, FREMessages.InstalledJREsBlock_16, null); 
		fCopyButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				copyVM();
			}
		});
		
		fRemoveButton= SWTFactory.createPushButton(buttons, FREMessages.InstalledJREsBlock_5, null); 
		fRemoveButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				removeVMs();
			}
		});
		
		SWTFactory.createVerticalSpacer(parent, 1);
		
		fSearchButton = SWTFactory.createPushButton(buttons, FREMessages.InstalledJREsBlock_6, null); 
		fSearchButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				search();
			}
		});		
		
		fillWithWorkspaceJREs();
		enableButtons();
		fAddButton.setEnabled(FASTRuntime.getFASTInstallTypes().length > 0);
	}
	
	/**
	 * Adds a duplicate of the selected VM to the block 
	 * @since 3.2
	 */
	protected void copyVM() {
        /* TODO IStructuredSelection selection = (IStructuredSelection) fFASTList.getSelection();
        Iterator<IFASTInstall> it = selection.iterator();

        ArrayList<FASTStandin> newEntries = new ArrayList<FASTStandin>();
        while (it.hasNext()) {
            IFASTInstall selectedVM = it.next();
            // duplicate & add VM
            VMStandin standin = new VMStandin(selectedVM, createUniqueId(selectedVM.getVMInstallType()));
            standin.setName(generateName(selectedVM.getName()));
			EditVMInstallWizard wizard = new EditVMInstallWizard(standin, fVMs.toArray(new IVMInstall[fVMs.size()]));
			WizardDialog dialog = new WizardDialog(getShell(), wizard);
			int dialogResult = dialog.open();
			if (dialogResult == Window.OK) {
				VMStandin result = wizard.getResult();
				if (result != null) {
					newEntries.add(result);
				}
			} else if (dialogResult == Window.CANCEL){
				// Canceling one wizard should cancel all subsequent wizards
				break;
			}
        }
        if (newEntries.size() > 0){
        	fVMs.addAll(newEntries);
        	fFASTList.refresh();
        	fFASTList.setSelection(new StructuredSelection(newEntries.toArray()));
        } else {
        	fFASTList.setSelection(selection);
        }*/
    }

	/**
	 * Compares the given name against current names and adds the appropriate numerical 
	 * suffix to ensure that it is unique.
	 * @param name the name with which to ensure uniqueness 
	 * @return the unique version of the given name
	 * @since 3.2
	 */
	public String generateName(String name){
            if (!isDuplicateName(name)) {
                return name;
            }
            
            if (name.matches(".*\\(\\d*\\)")) { //$NON-NLS-1$
                int start = name.lastIndexOf('(');
                int end = name.lastIndexOf(')');
                String stringInt = name.substring(start+1, end);
                int numericValue = Integer.parseInt(stringInt);
                String newName = name.substring(0, start+1) + (numericValue+1) + ")"; //$NON-NLS-1$
                return generateName(newName);
            }
            return generateName(name + " (1)"); //$NON-NLS-1$
        }
	
	/**
	 * Fire current selection
	 */
	private void fireSelectionChanged() {
		SelectionChangedEvent event = new SelectionChangedEvent(this, getSelection());
		Object[] listeners = fSelectionListeners.getListeners();
		for (int i = 0; i < listeners.length; i++) {
			ISelectionChangedListener listener = (ISelectionChangedListener)listeners[i];
			listener.selectionChanged(event);
		}	
	}

	/**
	 * Sorts by VM type, and name within type.
	 */
	private void sortByType() {
		fFASTList.setComparator(new ViewerComparator() {
			@Override
			public int compare(Viewer viewer, Object e1, Object e2) {
				if ((e1 instanceof IFASTInstall) && (e2 instanceof IFASTInstall)) {
					IFASTInstall left= (IFASTInstall)e1;
					IFASTInstall right= (IFASTInstall)e2;
					String leftType= left.getFASTInstallType().getName();
					String rightType= right.getFASTInstallType().getName();
					int res= leftType.compareToIgnoreCase(rightType);
					if (res != 0) {
						return res;
					}
					return left.getName().compareToIgnoreCase(right.getName());
				}
				return super.compare(viewer, e1, e2);
			}
			
			@Override
			public boolean isSorterProperty(Object element, String property) {
				return true;
			}
		});	
		fSortColumn = 3;			
	}
	
	/**
	 * Sorts by VM name.
	 */
	private void sortByName() {
		fFASTList.setComparator(new ViewerComparator() {
			@Override
			public int compare(Viewer viewer, Object e1, Object e2) {
				if ((e1 instanceof IFASTInstall) && (e2 instanceof IFASTInstall)) {
					IFASTInstall left= (IFASTInstall)e1;
					IFASTInstall right= (IFASTInstall)e2;
					return left.getName().compareToIgnoreCase(right.getName());
				}
				return super.compare(viewer, e1, e2);
			}
			
			@Override
			public boolean isSorterProperty(Object element, String property) {
				return true;
			}
		});		
		fSortColumn = 1;		
	}
	
	/**
	 * Sorts by VM location.
	 */
	private void sortByLocation() {
		fFASTList.setComparator(new ViewerComparator() {
			@Override
			public int compare(Viewer viewer, Object e1, Object e2) {
				if ((e1 instanceof IFASTInstall) && (e2 instanceof IFASTInstall)) {
					IFASTInstall left= (IFASTInstall)e1;
					IFASTInstall right= (IFASTInstall)e2;
					return left.getInstallLocation().getAbsolutePath().compareToIgnoreCase(right.getInstallLocation().getAbsolutePath());
				}
				return super.compare(viewer, e1, e2);
			}
			
			@Override
			public boolean isSorterProperty(Object element, String property) {
				return true;
			}
		});		
		fSortColumn = 2;		
	}
		
	/**
	 * Enables the buttons based on selected items counts in the viewer
	 */
	private void enableButtons() {
		IStructuredSelection selection = (IStructuredSelection) fFASTList.getSelection();
		int selectionCount= selection.size();
		fEditButton.setEnabled(selectionCount == 1);
		fCopyButton.setEnabled(selectionCount > 0);
		if (selectionCount > 0 && selectionCount < fFASTList.getTable().getItemCount()) {
			Iterator<IFASTInstall> iterator = selection.iterator();
			while (iterator.hasNext()) {
				IFASTInstall install = iterator.next();
				if (isContributed(install)) {
					fRemoveButton.setEnabled(false);
					return;
				}
			}
			fRemoveButton.setEnabled(true);
		} else {
			fRemoveButton.setEnabled(false);
		}
	}	
	
	/**
	 * Returns if the specified VM install has been contributed
	 * @param install
	 * @return true if the specified VM is contributed, false otherwise
	 */
	private boolean isContributed(IFASTInstall install) {
		return FASTRuntime.isContributedVMInstall(install.getId());
	}
	
	/**
	 * Returns this block's control
	 * 
	 * @return control
	 */
	public Control getControl() {
		return fControl;
	}
	
	/**
	 * Sets the JREs to be displayed in this block
	 * 
	 * @param vms JREs to be displayed
	 */
	protected void setJREs(IFASTInstall[] vms) {
		//fFASTs.clear();
		for (int i = 0; i < vms.length; i++) {
			fFASTs.add(vms[i]);
		}
		fFASTList.setInput(fFASTs);
		fFASTList.refresh();
	}
	
	/**
	 * Returns the JREs currently being displayed in this block
	 * 
	 * @return JREs currently being displayed in this block
	 */
	public IFASTInstall[] getJREs() {
		return fFASTs.toArray(new IFASTInstall[fFASTs.size()]);
	}
	
	/**
	 * Bring up a wizard that lets the user create a new FAST definition.
	 */
	private void addVM() {
		AddFASTInstallWizard wizard = new AddFASTInstallWizard(fFASTs.toArray(new IFASTInstall[fFASTs.size()]));
		WizardDialog dialog = new WizardDialog(getShell(), wizard);
		if (dialog.open() == Window.OK) {
			FASTStandin result = wizard.getResult();
			if (result != null) {
				fFASTs.add(result);
				fFASTList.refresh();
				fFASTList.setSelection(new StructuredSelection(result));
			}
		}
	}
	
	/**
	 * @see IAddVMDialogRequestor#vmAdded(IVMInstall)
	 */
	public void vmAdded(IFASTInstall vm) {
		fFASTs.add(vm);
		fFASTList.refresh();
	}
	
	/**
	 * @see IAddVMDialogRequestor#isDuplicateName(String)
	 */
	public boolean isDuplicateName(String name) {
		for (int i= 0; i < fFASTs.size(); i++) {
			IFASTInstall vm = (IFASTInstall)fFASTs.get(i);
			if (vm.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}	
	
	/**
	 * Performs the edit VM action when the Edit... button is pressed
	 */
	private void editVM() {
		IStructuredSelection selection= (IStructuredSelection)fFASTList.getSelection();
		FASTStandin vm= (FASTStandin)selection.getFirstElement();
		if (vm == null) {
			return;
		}
		if (isContributed(vm)) {
			// TODO VMDetailsDialog dialog= new VMDetailsDialog(getShell(), vm);
			//dialog.open();
		} else {
			EditFASTInstallWizard wizard = new EditFASTInstallWizard(vm, fFASTs.toArray(new IFASTInstall[fFASTs.size()]));
			WizardDialog dialog = new WizardDialog(getShell(), wizard);
			if (dialog.open() == Window.OK) {
				FASTStandin result = wizard.getResult();
				if (result != null) {
					// replace with the edited VM
					int index = fFASTs.indexOf(vm);
					fFASTs.remove(index);
					fFASTs.add(index, result);
					fFASTList.refresh();
					fFASTList.setSelection(new StructuredSelection(result));
				}
			}
		}
		
		
	}
	
	/**
	 * Performs the remove VM(s) action when the Remove... button is pressed
	 */
	private void removeVMs() {
		IStructuredSelection selection= (IStructuredSelection)fFASTList.getSelection();
		IFASTInstall[] vms = new IFASTInstall[selection.size()];
		Iterator<IFASTInstall> iter = selection.iterator();
		int i = 0;
		while (iter.hasNext()) {
			vms[i] = iter.next();
			i++;
		}
		removeFREs(vms);
	}	
	
	/**
	 * Removes the given VMs from the table.
	 * 
	 * @param vms
	 */
	public void removeFREs(IFASTInstall[] vms) {
		IStructuredSelection prev = (IStructuredSelection) getSelection();
		for (int i = 0; i < vms.length; i++) {
			fFASTs.remove(vms[i]);
		}
		fFASTList.refresh();
		IStructuredSelection curr = (IStructuredSelection) getSelection();
		if (!curr.equals(prev)) {
			IFASTInstall[] installs = getJREs();
			if (curr.size() == 0 && installs.length == 1) {
				// pick a default VM automatically
				setSelection(new StructuredSelection(installs[0]));
			} else {
				fireSelectionChanged();
			}
		}
	}
	
	/**
	 * Search for installed VMs in the file system
	 */
	protected void search() {
		if (Platform.OS_MACOSX.equals(Platform.getOS())) {
			doMacSearch();
			return;
		}
		// choose a root directory for the search 
		DirectoryDialog dialog = new DirectoryDialog(getShell());
		dialog.setMessage(FREMessages.InstalledJREsBlock_9); 
		dialog.setText(FREMessages.InstalledJREsBlock_10); 
		String path = dialog.open();
		if (path == null) {
			return;
		}
		
		// ignore installed locations
		final Set<File> exstingLocations = new HashSet<File>();
		Iterator<Object> iter = fFASTs.iterator();
		while (iter.hasNext()) {
			exstingLocations.add(((IFASTInstall)iter.next()).getInstallLocation());
		}
		
		// search
		final File rootDir = new File(path);
		final List<Object> locations = new ArrayList<Object>();
		final List<IFASTInstallType> types = new ArrayList<IFASTInstallType>();

		IRunnableWithProgress r = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) {
				monitor.beginTask(FREMessages.InstalledJREsBlock_11, IProgressMonitor.UNKNOWN); 
				search(rootDir, locations, types, exstingLocations, monitor);
				monitor.done();
			}
		};
		
		try {
            ProgressMonitorDialog progress = new ProgressMonitorDialog(getShell()) {
                
                 //* Overridden createCancelButton to replace Cancel label with Stop label
                 //* More accurately reflects action taken when button pressed.
                 //* Bug [162902]
                 
                @Override
				protected void createCancelButton(Composite parent) {
                    cancel = createButton(parent, IDialogConstants.CANCEL_ID,
                            IDialogConstants.STOP_LABEL, true);
                    if (arrowCursor == null) {
            			arrowCursor = new Cursor(cancel.getDisplay(), SWT.CURSOR_ARROW);
            		}
                    cancel.setCursor(arrowCursor);
                    setOperationCancelButtonEnabled(enableCancelButton);
                }
            };
            progress.run(true, true, r);
		} catch (InvocationTargetException e) {
			//JDIDebugUIPlugin.log(e);
		} catch (InterruptedException e) {
			// canceled
			return;
		}
		
		if (locations.isEmpty()) {
			String messagePath = path.replaceAll("&", "&&"); // @see bug 29855  //$NON-NLS-1$//$NON-NLS-2$
			MessageDialog.openInformation(getShell(), FREMessages.InstalledJREsBlock_12, NLS.bind(FREMessages.InstalledJREsBlock_13, new String[]{messagePath})); // 
		} else {
			iter = locations.iterator();
			Iterator<IFASTInstallType> iter2 = types.iterator();
			while (iter.hasNext()) {
				File location = (File)iter.next();
				IFASTInstallType type = iter2.next();
				AbstractFASTInstall vm = new FASTStandin(type, createUniqueId(type));
				String name = location.getName();
				String nameCopy = new String(name);
				int i = 1;
				while (isDuplicateName(nameCopy)) {
					nameCopy = name + '(' + i++ + ')'; 
				}
				vm.setName(nameCopy);
				vm.setInstallLocation(location);
				if (type instanceof AbstractFASTInstallType) {
					//set default java doc location
					AbstractFASTInstallType abs = (AbstractFASTInstallType)type;
					// TODO vm.setJavadocLocation(abs.getDefaultJavadocLocation(location));
					// TODO vm.setVMArgs(abs.getDefaultVMArguments(location));
				}
				vmAdded(vm);
			}
		}
		
	}
	
	/**
	 * Calls out to {@link MacVMSearch} to find all installed JREs in the standard
	 * Mac OS location
	 */
	private void doMacSearch() {
		/*final List<VMStandin> added = new ArrayList<VMStandin>();
		IRunnableWithProgress r = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				Set<String> exists = new HashSet<String>();
				Iterator<Object> iterator = fVMs.iterator();
				while (iterator.hasNext()) {
					IFASTInstall vm = (IFASTInstall) iterator.next();
					exists.add(vm.getInstallLocation().getPath());
				}
				VMStandin[] standins = new MacVMSearch().search(monitor);
				for (int i = 0; i < standins.length; i++) {
					//we should be comparing install paths, as the ID can be computed differently 
					//based on if the VM is searched or added manually
					if (!exists.contains(standins[i].getInstallLocation().getPath())) {
						added.add(standins[i]);
					}
				}
				monitor.done();
			}
		};
		
		try {
            ProgressMonitorDialog progress = new ProgressMonitorDialog(getShell());
            progress.run(true, true, r);
		} catch (InvocationTargetException e) {
			JDIDebugUIPlugin.log(e);
		} catch (InterruptedException e) {
			// canceled
			return;
		}
		
		Iterator<VMStandin> iterator = added.iterator();
		while (iterator.hasNext()) {
			IFASTInstall vm = iterator.next();
			vmAdded(vm);
		}
		*/

	}

	protected Shell getShell() {
		return getControl().getShell();
	}

	/**
	 * Find a unique VM id.  Check existing 'real' VMs, as well as the last id used for
	 * a VMStandin.
	 */
	private String createUniqueId(IFASTInstallType vmType) {
		String id= null;
		do {
			id= String.valueOf(System.currentTimeMillis());
		} while (vmType.findFASTInstall(id) != null || id.equals(fgLastUsedID));
		fgLastUsedID = id;
		return id;
	}	
	
	/**
	 * Searches the specified directory recursively for installed VMs, adding each
	 * detected VM to the <code>found</code> list. Any directories specified in
	 * the <code>ignore</code> are not traversed.
	 * 
	 * @param directory
	 * @param found
	 * @param types
	 * @param ignore
	 */
	protected void search(File directory, List<Object> found, List<IFASTInstallType> types, Set<File> ignore, IProgressMonitor monitor) {
		if (monitor.isCanceled()) {
			return;
		}

		String[] names = directory.list();
		if (names == null) {
			return;
		}
		List<File> subDirs = new ArrayList<File>();
		for (int i = 0; i < names.length; i++) {
			if (monitor.isCanceled()) {
				return;
			}
			File file = new File(directory, names[i]);
			try {
				monitor.subTask(NLS.bind(FREMessages.InstalledJREsBlock_14, new String[]{Integer.toString(found.size()),
						file.getCanonicalPath().replaceAll("&", "&&")}));   // @see bug 29855 //$NON-NLS-1$ //$NON-NLS-2$
			} catch (IOException e) {
			}		
			IFASTInstallType[] vmTypes = FASTRuntime.getFASTInstallTypes();	
			if (file.isDirectory()) {
				if (!ignore.contains(file)) {
					boolean validLocation = false;
					
					// Take the first VM install type that claims the location as a
					// valid VM install.  VM install types should be smart enough to not
					// claim another type's VM, but just in case...
					for (int j = 0; j < vmTypes.length; j++) {
						if (monitor.isCanceled()) {
							return;
						}
						IFASTInstallType type = vmTypes[j];
						IStatus status = type.validateInstallLocation(file);
						if (status.isOK()) {
							found.add(file);
							types.add(type);
							validLocation = true;
							break;
						}
					}
					if (!validLocation) {
						subDirs.add(file);
					}
				}
			}
		}
		while (!subDirs.isEmpty()) {
			File subDir = subDirs.remove(0);
			search(subDir, found, types, ignore, monitor);
			if (monitor.isCanceled()) {
				return;
			}
		}
		
		
	}	
	
	/**
	 * Sets the checked JRE, possible <code>null</code>
	 * 
	 * @param vm JRE or <code>null</code>
	 */
	public void setCheckedFRE(IFASTInstall vm) {
		if (vm == null) {
			setSelection(new StructuredSelection());
		} else {
			setSelection(new StructuredSelection(vm));
		}
	}
	
	/**
	 * Returns the checked JRE or <code>null</code> if none.
	 * 
	 * @return the checked JRE or <code>null</code> if none
	 */
	public IFASTInstall getCheckedFRE() {
		Object[] objects = fFASTList.getCheckedElements();
		if (objects.length == 0) {
			return null;
		}
		return (IFASTInstall)objects[0];
	}
	
	/**
	 * Persist table settings into the give dialog store, prefixed
	 * with the given key.
	 * 
	 * @param settings dialog store
	 * @param qualifier key qualifier
	 */
	public void saveColumnSettings(IDialogSettings settings, String qualifier) {
        int columnCount = fTable.getColumnCount();
		for (int i = 0; i < columnCount; i++) {
			settings.put(qualifier + ".columnWidth" + i, fTable.getColumn(i).getWidth());	 //$NON-NLS-1$
		}
		settings.put(qualifier + ".sortColumn", fSortColumn); //$NON-NLS-1$
	}
	
	/**
	 * Restore table settings from the given dialog store using the
	 * given key.
	 * 
	 * @param settings dialog settings store
	 * @param qualifier key to restore settings from
	 */
	public void restoreColumnSettings(IDialogSettings settings, String qualifier) {
		fFASTList.getTable().layout(true);
        restoreColumnWidths(settings, qualifier);
		try {
			fSortColumn = settings.getInt(qualifier + ".sortColumn"); //$NON-NLS-1$
		} catch (NumberFormatException e) {
			fSortColumn = 1;
		}
		switch (fSortColumn) {
			case 1:
				sortByName();
				break;
			case 2:
				sortByLocation();
				break;
			case 3:
				sortByType();
				break;
		}
	}
	
	/**
	 * Restores the column widths from dialog settings
	 * @param settings
	 * @param qualifier
	 */
	private void restoreColumnWidths(IDialogSettings settings, String qualifier) {
        int columnCount = fTable.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            int width = -1;
            try {
                width = settings.getInt(qualifier + ".columnWidth" + i); //$NON-NLS-1$
            } catch (NumberFormatException e) {}
            
            if ((width <= 0) || (i == fTable.getColumnCount() - 1)) {
                fTable.getColumn(i).pack();
            } else {
                fTable.getColumn(i).setWidth(width);
            }
        }
	}
	
	/**
	 * Populates the JRE table with existing JREs defined in the workspace.
	 */
	protected void fillWithWorkspaceJREs() {
		// fill with JREs
		List<FASTStandin> standins = new ArrayList<FASTStandin>();
		IFASTInstallType[] types = FASTRuntime.getFASTInstallTypes();
		for (int i = 0; i < types.length; i++) {
			IFASTInstallType type = types[i];
			IFASTInstall[] installs = type.getFASTInstalls();
			for (int j = 0; j < installs.length; j++) {
				IFASTInstall install = installs[j];
				standins.add(new FASTStandin(install));
			}
		}
		setJREs(standins.toArray(new IFASTInstall[standins.size()]));	
		
	}
		
}
