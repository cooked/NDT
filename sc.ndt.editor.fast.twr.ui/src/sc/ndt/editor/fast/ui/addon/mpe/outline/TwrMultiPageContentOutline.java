package sc.ndt.editor.fast.ui.addon.mpe.outline;

import java.util.ArrayList;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import sc.ndt.commons.ui.views.EmptyOutlinePage;
import sc.ndt.editor.fast.ui.addon.mpe.TwrMultiPageEditor;

public class TwrMultiPageContentOutline extends Page implements IContentOutlinePage, ISelectionProvider, ISelectionChangedListener {
	
	private PageBook pagebook;
	private ISelection selection;
	private ArrayList listeners;
	private /*ISortable*/IContentOutlinePage currentPage;
	private /*ISortable*/IContentOutlinePage emptyPage;
	private IActionBars actionBars;
	private boolean sortingOn;
	private TwrMultiPageEditor editor;

	public TwrMultiPageContentOutline(TwrMultiPageEditor editor) {
		this.editor = editor;
		listeners = new ArrayList();
		//sortingOn = PDEPlugin.getDefault().getPreferenceStore().getBoolean("PDEMultiPageContentOutline.SortingAction.isChecked"); //$NON-NLS-1$

	}

	public void addFocusListener(FocusListener listener) {
	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}

	public void createControl(Composite parent) {
		pagebook = new PageBook(parent, SWT.NONE);
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

	public boolean isDisposed() {
		return listeners == null;
	}

	public Control getControl() {
		return pagebook;
	}

	public PageBook getPagebook() {
		return pagebook;
	}

	public ISelection getSelection() {
		return selection;
	}

	public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
	}

	public void removeFocusListener(FocusListener listener) {
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);
	}

	public void selectionChanged(SelectionChangedEvent event) {
		setSelection(event.getSelection());
	}

	public void setActionBars(IActionBars actionBars) {
		this.actionBars = actionBars;
		registerToolbarActions(actionBars);
		if (currentPage != null)
			setPageActive(currentPage);

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

	public void setPageActive(/*ISortable*/IContentOutlinePage page) {
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
	}

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