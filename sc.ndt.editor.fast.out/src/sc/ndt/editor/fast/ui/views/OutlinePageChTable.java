package sc.ndt.editor.fast.ui.views;

import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import sc.ndt.commons.model.outlist.providers.OutListContentProvider;
import sc.ndt.commons.model.outlist.providers.OutListLabelProvider;
import sc.ndt.editor.fast.ui.editors.EditorFormTableFASTOut;
import sc.ndt.editor.fast.ui.editors.MultiPageFASTOutEditor;

public class OutlinePageChTable extends ContentOutlinePage {

	private TreeViewer viewer ;
	//private ModelFileFASTOut model;
	
	private EditorFormTableFASTOut ed;
	
	public OutlinePageChTable(EditorFormTableFASTOut editorFormTableFASTOut) {
		ed = editorFormTableFASTOut;
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		// TODO Auto-generated method stub
	}

	@Override
	protected int getTreeStyle() {
		return super.getTreeStyle();
	}

	@Override
	public void createControl(Composite parent) {
	      super.createControl(parent);
	      viewer = getTreeViewer();
	      viewer.setContentProvider(new OutListContentProvider());
	      viewer.setLabelProvider(new OutListLabelProvider());
	      viewer.addSelectionChangedListener(this);
	      viewer.setInput(((MultiPageFASTOutEditor)ed.getEditor()).pFile.outList.getAllOutBlocks());
	   }

	@Override
	public Control getControl() {
		if (viewer == null)
			return null;
        return viewer.getControl();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}
	
}
