package sc.ndt.editor.fast.ui.editors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.swt.SWT;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ILazyContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;

import org.eclipse.swt.widgets.TableColumn;

import sc.ndt.editor.fast.ui.views.OutlinePageChTable;

public class EditorFormTableFASTOut extends FormPage {
	
	private Table 					table;
	private Table 					table_1;
	private OutlinePageChTable 		outlinePageTable;

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
		
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText("Empty FormPage");
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody().setLayout(new FillLayout(SWT.VERTICAL));
		
		TableViewer tableViewer = new TableViewer(managedForm.getForm().getBody(), SWT.VIRTUAL);
		table_1 = tableViewer.getTable();
		table_1.setHeaderVisible(true);
		managedForm.getToolkit().paintBordersFor(table_1);
		
		createColumns(tableViewer);
				
		
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		tableViewer.setContentProvider( new MyLazyArrayContentProvider(tableViewer));// new ArrayContentProvider());
		tableViewer.setUseHashlookup(true);
		
		ArrayList<ArrayList<Float>> arr = ((MultiPageFASTOutEditor)getEditor()).pFile.rowData;
		tableViewer.setInput( arr );
		tableViewer.setItemCount(arr.size()); // This is the difference when using a
		// ILazyContentProvider
		//table.update();
		//table.layout();
		
		// Make the selection available to other views
		//getSite().setSelectionProvider(viewer);
		
		
		
	}
		
	// This will create the columns for the table
	private void createColumns(final TableViewer viewer) {
	    
		MultiPageFASTOutEditor ed = (MultiPageFASTOutEditor)getEditor();
		if(ed.pFile!=null) {
			
			List<String> 			ls = Arrays.asList(ed.pFile.channels);
			ListIterator<String> 	it = ls.listIterator();
			
			while(it.hasNext()) {
				
				final int idx = it.nextIndex();
				
				String ch = it.next();
				TableViewerColumn 	tvc = new TableViewerColumn(viewer,SWT.NONE);
				TableColumn 		col = tvc.getColumn();
				
				col.setText(ch);
				col.setWidth(70);
				col.setResizable(true);
				col.setMoveable(false);
				
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
			    
			    /*tvc.setLabelProvider(new StyledCellLabelProvider() {
			    	@Override
			    	  public void update(ViewerCell cell) {
			    	    StyledString text = new StyledString();
			    	    StyleRange myStyledRange = new StyleRange(17, 2, null, Display
			    	      .getCurrent().getSystemColor(SWT.COLOR_YELLOW));
			    	    text.append("This is a test", StyledString.DECORATIONS_STYLER);
			    	    text.append(" (" + 15 + ") ", StyledString.DECORATIONS_STYLER);
			    	    cell.setText(text.toString());

			    	    StyleRange[] range = { myStyledRange };
			    	    cell.setStyleRanges(range);
			    	    super.update(cell);
			    	  }
			    	}); */
			    
			    
			    //viewerColumns.add(tvc);

			}
		}

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
