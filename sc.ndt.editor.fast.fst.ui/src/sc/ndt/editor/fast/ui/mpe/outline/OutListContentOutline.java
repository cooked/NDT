package sc.ndt.editor.fast.ui.mpe.outline;

import java.util.ArrayList;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import sc.ndt.commons.model.OutBlock;
import sc.ndt.commons.model.OutCh;
import sc.ndt.commons.model.OutList;
import sc.ndt.commons.model.providers.outlist.OutListCheckStateProvider;
import sc.ndt.commons.model.providers.outlist.OutListContentProvider;
import sc.ndt.commons.model.providers.outlist.OutListLabelProvider;
import sc.ndt.commons.model.providers.outlist.OutListToolTipSupport;
import sc.ndt.commons.model.providers.outlist.OutListViewerComparator;
import sc.ndt.commons.ui.views.EmptyOutlinePage;
import sc.ndt.editor.fast.fastfst.ModelFastfst;
import sc.ndt.editor.fast.ui.mpe.ui.FstFormPage;
import sc.ndt.editor.fast.ui.mpe.ui.FstMultiPageEditor;


public class OutListContentOutline extends Page implements IContentOutlinePage, ISelectionProvider/*, ISelectionChangedListener*/ {
	
	private PageBook pagebook;
	private ISelection selection;
	private ArrayList listeners;
	private /*ISortable*/IContentOutlinePage currentPage;
	private /*ISortable*/IContentOutlinePage emptyPage;
	private IActionBars actionBars;
	private boolean sortingOn;
	private CheckboxTreeViewer checkboxTreeViewer;

	private FstMultiPageEditor editor;
	private OutList outList;
	
	public OutListContentOutline(FormEditor formEditor) {
		this.editor  = (FstMultiPageEditor)formEditor;
		// OutList
		outList = editor.outList;

	}
	
	public void init(IPageSite pageSite) {
        super.init(pageSite);
        pageSite.setSelectionProvider(this);
        //pageSite.getPage().addSelectionListener(this);
       
    }

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		//listeners.add(listener);
	}

	public void createControl(Composite parent) {
		//pagebook = new PageBook(parent, SWT.NONE);
		
		checkboxTreeViewer = new CheckboxTreeViewer(parent, SWT.MULTI);
		
		Tree treeTower = checkboxTreeViewer.getTree();
		treeTower.setHeaderVisible(true);
		treeTower.setLinesVisible(true);
		GridData gd_treeTower = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_treeTower.heightHint = 400;
		treeTower.setLayoutData(gd_treeTower);
		
		TreeViewerColumn column_1 = new TreeViewerColumn(checkboxTreeViewer,SWT.NONE);
		TreeColumn treeColumn = column_1.getColumn();
		treeColumn.setResizable(false);
		column_1.getColumn().setWidth(220);
		column_1.getColumn().setText("Output Channel");
		column_1.setLabelProvider(new OutListLabelProvider());
		
		TreeViewerColumn column_2 = new TreeViewerColumn(checkboxTreeViewer,SWT.NONE);
		TreeColumn treeColumn_1 = column_2.getColumn();
		treeColumn_1.setResizable(false);
		column_2.getColumn().setWidth(60);
		column_2.getColumn().setText("Unit");
		column_2.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				if (element instanceof OutCh)
					return ((OutCh) element).unit;
				return "";
			}

		});

		checkboxTreeViewer.setContentProvider(new OutListContentProvider());
		checkboxTreeViewer.setCheckStateProvider(new OutListCheckStateProvider());
		checkboxTreeViewer.setComparator(new OutListViewerComparator());
		checkboxTreeViewer.setInput(outList.getAllOutBlocks());
		OutListToolTipSupport.enableFor(checkboxTreeViewer);

		// see
		// http://www.java2s.com/Code/Java/SWT-JFace-Eclipse/DemonstratesCheckboxTreeViewer.htm
		checkboxTreeViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				if (event.getChecked()) {
					checkboxTreeViewer.setSubtreeChecked(event.getElement(),
							true);
					Object o = event.getElement();
					if (o instanceof OutCh) {
						outList.get(((OutCh) o).name).setAvailable(true);

					} else if (o instanceof OutBlock)
						outList.setBlockSelected((OutBlock) o, true);

				} else if (!event.getChecked()) {
					checkboxTreeViewer.setSubtreeChecked(event.getElement(),
							false);
					Object o = event.getElement();
					if (o instanceof OutCh)
						outList.get(((OutCh) o).name).setAvailable(false);
					else if (o instanceof OutBlock)
						outList.setBlockSelected((OutBlock) o, false);
				}

				// TODO write to xtext model
				editor.getXtextEditor("fst").getDocument().modify(new IUnitOfWork.Void<XtextResource>() {
					@Override
					public void process(XtextResource resource) throws Exception {
						ModelFastfst m = (ModelFastfst) resource.getContents().get(0);
						if (m != null && m.getOutList() != null)
							m.getOutList().setValue(outList.getAllSelectedByBlock());
						else
							throw new IllegalStateException("Uh uh, no content");

					};
				});

				checkboxTreeViewer.refresh();

			}
		});
		
		
	}

	public void dispose() {
		if (pagebook != null && !pagebook.isDisposed())
			pagebook.dispose();
		if (emptyPage != null) {
			emptyPage.dispose();
			emptyPage = null;
		}
		pagebook = null;
		listeners = null;
	}

	public Control getControl() {
		return pagebook;
	}

	public ISelection getSelection() {
		return selection;
	}

	public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
	}


	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		//listeners.remove(listener);
	}

	public void selectionChanged(SelectionChangedEvent event) {
		setSelection(event.getSelection());
	}

	public void setActionBars(IActionBars actionBars) {
		this.actionBars = actionBars;
		registerToolbarActions(actionBars);
		//if (currentPage != null)
		//	setPageActive(currentPage);

	}

	public IActionBars getActionBars() {
		return actionBars;
	}

	public void setFocus() {
		if (currentPage != null)
			currentPage.setFocus();
	}

	private /*ISortable*/IContentOutlinePage getEmptyPage() {
		if (emptyPage == null)
			emptyPage = new EmptyOutlinePage();
		return emptyPage;
	}

	/*public void setPageActive(IContentOutlinePage page) {
		if (page == null) {
			page = getEmptyPage();
		}
		if (currentPage != null) {
			currentPage.removeSelectionChangedListener(this);
		}
		//page.init(getSite());
		//page.sort(sortingOn);
		page.addSelectionChangedListener(this);
		this.currentPage = page;
		if (pagebook == null) {
			// still not being made
			return;
		}
		Control control = page.getControl();
		if (control == null || control.isDisposed()) {
			// first time
			page.createControl(pagebook);
			page.setActionBars(getActionBars());
			control = page.getControl();
		}
		pagebook.showPage(control);
		this.currentPage = page;
	}*/

	/**
	 * Set the selection.
	 */
	public void setSelection(ISelection selection) {
		this.selection = selection;
		if (listeners == null)
			return;
		SelectionChangedEvent e = new SelectionChangedEvent(this, selection);
		for (int i = 0; i < listeners.size(); i++) {
			((ISelectionChangedListener) listeners.get(i)).selectionChanged(e);
		}
	}

	private void registerToolbarActions(IActionBars actionBars) {

		IToolBarManager toolBarManager = actionBars.getToolBarManager();
		if (toolBarManager != null) {
			//toolBarManager.add(new ToggleLinkWithEditorAction(editor));
			toolBarManager.add(new SortingAction());
		}
	}

	

	class SortingAction extends Action {

		public SortingAction() {
			super();
			/* TODO
			PlatformUI.getWorkbench().getHelpSystem().setHelp(this, IHelpContextIds.OUTLINE_SORT_ACTION);
			setText(PDEUIMessages.PDEMultiPageContentOutline_SortingAction_label);
			setImageDescriptor(PDEPluginImages.DESC_ALPHAB_SORT_CO);
			setDisabledImageDescriptor(PDEPluginImages.DESC_ALPHAB_SORT_CO_DISABLED);
			setToolTipText(PDEUIMessages.PDEMultiPageContentOutline_SortingAction_tooltip);
			setDescription(PDEUIMessages.PDEMultiPageContentOutline_SortingAction_description);
			setChecked(sortingOn);
			*/
		}

		public void run() {
			setChecked(isChecked());
			valueChanged(isChecked());
		}

		private void valueChanged(final boolean on) {
			sortingOn = on;
			//if (currentPage != null)
			//	currentPage.sort(on);
			//PDEPlugin.getDefault().getPreferenceStore().setValue("PDEMultiPageContentOutline.SortingAction.isChecked", on); //$NON-NLS-1$
		}

	}
}