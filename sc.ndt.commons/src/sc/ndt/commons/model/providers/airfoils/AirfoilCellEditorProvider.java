package sc.ndt.commons.model.providers.airfoils;

import java.util.ArrayList;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import sc.ndt.commons.model.BladeNodeAero;

	//SC see
	// http://www.subshell.com/en/subshell/blog/Eclipse-RCP-Comboboxes-inside-a-JFace-TableViewer100.html#jumpto
	public class AirfoilCellEditorProvider  extends EditingSupport {
	     
	    private ComboBoxViewerCellEditor cellEditor = null;
	     
	    @SuppressWarnings("deprecation")
		public AirfoilCellEditorProvider(ColumnViewer viewer) {
	        super(viewer);
	        cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer().getControl(), SWT.READ_ONLY);
	        cellEditor.setLabelProvider(new LabelProvider());
	        cellEditor.setContenProvider(new ArrayContentProvider());
	        ArrayList<String> aal = new ArrayList<String>();
	        aal.add("NOPRINT");
	        aal.add("PRINT");
	        cellEditor.setInput(aal);
	        
	    }
	     
	    @Override
	    protected CellEditor getCellEditor(Object element) {
	        return cellEditor;
	    }
	     
	    @Override
	    protected boolean canEdit(Object element) {
	        return true;
	    }
	     
	    
	    @Override
	    protected Object getValue(Object element) {
	    	@SuppressWarnings("unused")
			ColumnViewer aaa = this.getViewer();
	    	//ISelection prop = aaa.
	        if (element instanceof BladeNodeAero) {
	        	return ((BladeNodeAero)element).print;
	        	/*	return "PRINT";
	        	else
	        		return "NOPRINT";
	        		*/
	        }
	        return null;
	    }
	     
	    @Override
	    protected void setValue(Object element,Object value) {
	        if (element instanceof BladeNodeAero /*&& value instanceof Value*/) {
	            BladeNodeAero data = (BladeNodeAero) element;
	            //Value newValue = (Value) value;
	            // only set new value if it differs from old one
	            //if (!data.getData().equals(newValue)) {
	               data.print = (String)value;
	            //}*/
	        }
	    }
	     
	}