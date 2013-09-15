package sc.ndt.editor.fast.ui.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;

import sc.ndt.commons.model.EditorInputFASTOut;
import sc.ndt.commons.model.ModelFileFASTOut;
import sc.ndt.editor.fast.ui.views.ChannelsMultiPageContentOutline;


public class MultiPageFASTOutEditor extends FormEditor {

	public static final String ID = "sc.ndt.editor.fast.ui.editors.MultiPageFASTOutEditor"; //$NON-NLS-1$
	
	public ModelFileFASTOut 		pFile;

	private EditorFormTableFASTOut 	te;
	private EditorBrowserFASTOut 	be;

	private ChannelsMultiPageContentOutline fContentOutline;

	
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {

		setSite(site);		

		if (input instanceof FileEditorInput) {
			// TODO add checks!!!!!!
			setInput(new EditorInputFASTOut(
					(IFile) input.getAdapter(IFile.class)));
			
			if(pFile==null)
				pFile = ((EditorInputFASTOut)getEditorInput()).load();
			
		}

	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void addPages() {
		
	        try {
	        	
	        	// table
	        	te = new EditorFormTableFASTOut(this,"a","a"); 
	        	addPage(te, getEditorInput());
	        					
	        	// chart		
	        	be = new EditorBrowserFASTOut(this,"b","b");
				addPage(be, getEditorInput());
												
	        } catch (Exception e) {
	            System.err.println(e);
	            e.printStackTrace();
	        }
		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public Object getAdapter(Class adapter) {
		
		if (adapter.equals(IPropertySheetPage.class)) {
			// TODO
			return null;
		} else if(ModelFileFASTOut.class.equals(adapter)) {
			if(pFile!=null) 
				return pFile;
			else 
				return null;
		} else if (IContentOutlinePage.class.equals(adapter)) {
			return getContentOutline();
		}
		return super.getAdapter(adapter);
	}
	
	public ChannelsMultiPageContentOutline getContentOutline() {
		if (fContentOutline == null || fContentOutline.isDisposed()) {
			fContentOutline = new ChannelsMultiPageContentOutline(this);
			updateContentOutline(getActivePageInstance());
		}
		return fContentOutline;
	}
	
	private void updateContentOutline(IFormPage page) {
		if (fContentOutline == null)
			return;

		/*ISortable*/IContentOutlinePage outline = null;
		if (page instanceof EditorBrowserFASTOut)
			outline = ((EditorBrowserFASTOut)page).getContentOutline();
		else if (page instanceof EditorFormTableFASTOut)
			outline = ((EditorFormTableFASTOut)page).getContentOutline();

		fContentOutline.setPageActive(outline);
	}
		
	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		
	}
	
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);		
		IFormPage page = getActivePageInstance();	
		updateContentOutline(page);
		//if (page != null) {
		//	fLastActivePageId = page.getId();
		//}
	}

}
