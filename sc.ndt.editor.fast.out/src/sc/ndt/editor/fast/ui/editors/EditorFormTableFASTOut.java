package sc.ndt.editor.fast.ui.editors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.swt.SWT;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.swt.widgets.Table;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.FocusCellHighlighter;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILazyContentProvider;
import org.eclipse.jface.viewers.IPostSelectionProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TableViewerFocusCellManager;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.TableColumn;

import sc.ndt.editor.fast.ui.views.OutlinePageChTable;

public class EditorFormTableFASTOut extends FormPage {
	
	private Table 					table;
	private OutlinePageChTable 		outlinePageTable;
	private TableViewer 			tableViewer;
	private TableCursor 			cursor;
	
	// currently selected channel to show in QuickView
	public String 					data;
	
	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public EditorFormTableFASTOut(String id, String title) {
		super(id, title);
	}

	/**
	 * Create the form page.
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public EditorFormTableFASTOut(FormEditor editor, String id, String title) {
		super(editor, id, title);
		
	}
	
	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		
		// collect data
		ArrayList<ArrayList<Float>> arr = ((MultiPageFASTOutEditor)getEditor()).pFile.rowData;
		
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText("Empty FormPage");
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody().setLayout(new FillLayout(SWT.VERTICAL));
		
		tableViewer = new TableViewer(managedForm.getForm().getBody(), SWT.VIRTUAL|SWT.MULTI|SWT.BORDER);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		cursor = new TableCursor(table, SWT.NONE);
     
		managedForm.getToolkit().paintBordersFor(table);
		
		createColumns(tableViewer);
				
		tableViewer.setContentProvider( new MyLazyArrayContentProvider(tableViewer));
		tableViewer.setUseHashlookup(true);
		tableViewer.setInput( arr );
		tableViewer.setItemCount(arr.size()); 
				
		// TODO ? This is the difference when using a ILazyContentProvider
		//table.update();
		//table.layout();
		
		
	}
		
	public TableViewer getTableViewer() {
		return tableViewer;
	}

	// This will create the columns for the table
	private void createColumns(final TableViewer viewer) {

		MultiPageFASTOutEditor ed = (MultiPageFASTOutEditor)getEditor();
		if(ed.pFile!=null) {

			List<String> 			ls = Arrays.asList(ed.pFile.channels);
			ListIterator<String> 	it = ls.listIterator();

			while(it.hasNext()) {

				final int 	idx = it.nextIndex();
				String 		ch 	= it.next();
				
				TableViewerColumn tvc = createTableViewerColumn(ch, 70, idx);
				tvc.setLabelProvider(new ColumnLabelProvider() {

					int i = idx;

					@Override
					public String getText(Object element) {
						if(element instanceof Float)
							return  ((Float)element).toString();
						else if(element instanceof ArrayList<?>) {
							String s =((ArrayList<?>)element).get(i).toString();  
							return s;
						} else
							return "ERR";
					}
				});
				
			}
		}

	}
	
	private TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		column.addSelectionListener(getSelectionAdapter(column, colNumber));
		return viewerColumn;
	}

	
	
	private SelectionAdapter getSelectionAdapter(final TableColumn column, final int index) {
		SelectionAdapter selectionAdapter = new SelectionAdapter() {
		
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(e.getSource() instanceof TableColumn) {
					TableColumn tc = (TableColumn)e.getSource();
					String chName = tc.getText(); 
					data = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelString(chName);
					
					// forward event to listener registered to the selection service (and hopefully QuickChart)
					//Listener[] ls = tableViewer.getTable().getListeners(SWT.Selection);
					//System.out.println(ls);
					//tableViewer.setSelection(selection);
				}
			}
		};
		return selectionAdapter;
	}

	private class MyLazyArrayContentProvider extends ArrayContentProvider implements ILazyContentProvider {
		
		private TableViewer 					viewer;
		private ArrayList<ArrayList<Float>>  	elements;

		public MyLazyArrayContentProvider(TableViewer viewer) {
			this.viewer = viewer;
		}

		public void dispose() {
			super.dispose();
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			this.elements = (ArrayList<ArrayList<Float>>) newInput;
		}

		public void updateElement(int index) {
			viewer.replace(elements.get(index), index);
		}

	}

	public IContentOutlinePage getContentOutline() {
		if (outlinePageTable == null)
			outlinePageTable = new OutlinePageChTable(this);
		return outlinePageTable;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
	}

	@Override
	public boolean canLeaveThePage() {
		// TODO Auto-generated method stub
		return super.canLeaveThePage();
	}

}


