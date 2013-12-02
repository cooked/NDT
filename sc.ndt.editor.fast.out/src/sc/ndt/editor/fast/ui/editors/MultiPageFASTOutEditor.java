package sc.ndt.editor.fast.ui.editors;

import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.internal.browser.BrowserManager;
import org.eclipse.ui.internal.browser.BrowserViewer;
import org.eclipse.ui.internal.browser.WebBrowserEditor;
import org.eclipse.ui.internal.browser.WebBrowserEditorInput;
import org.eclipse.ui.internal.browser.WorkbenchBrowserSupport;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;

import sc.ndt.commons.http.HttpUtils;
import sc.ndt.commons.model.EditorInputFASTOut;
import sc.ndt.commons.model.ModelFileFASTOut;
import sc.ndt.editor.fast.ui.views.ChannelsMultiPageContentOutline;
import sc.ndt.editor.fast.ui.views.OutlinePageChGraph;


public class MultiPageFASTOutEditor extends FormEditor {


	public static final String ID = "sc.ndt.editor.fast.ui.editors.MultiPageFASTOutEditor"; //$NON-NLS-1$
	
	public ModelFileFASTOut 		pFile;

	private EditorFormTableFASTOut 	te;
	private EditorBrowserFASTOut 	be;

	private ChannelsMultiPageContentOutline fContentOutline;

	private TextEditor se;

	private WebBrowserEditor wb;

	private BrowserManager bm;

	private WebBrowserEditor be2;

	private WebBrowserEditorInput bei;

	private IContentOutlinePage out;

	
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {

		setSite(site);		
		
		if (input instanceof FileEditorInput) {
			// TODO add checks!!!!!!
			IFile f = (IFile) input.getAdapter(IFile.class);
			setInput(new EditorInputFASTOut(f));
			setPartName(f.getName());
			
			if(pFile==null)
				pFile = ((EditorInputFASTOut)getEditorInput()).load();
			
		}

	}
	
	@Override
	public void dispose() {
		out.dispose();
		super.dispose();
	}
	
	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void setFocus() {
	}

	@Override
	protected void addPages() {
		
	        try {
	        	
	        	// chart		
	        	be = new EditorBrowserFASTOut(this,"graph","Graph");
				addPage(be, getEditorInput());
				
	        	// table
	        	te = new EditorFormTableFASTOut(this,"table","Table"); 
	        	addPage(te, getEditorInput());
	        					
	        	
				// TEST new chart
	        	//HttpUtils.getDefaultServer();
	        	
	        	
				/*be2 = new WebBrowserEditor();
				bei = new WebBrowserEditorInput(new URL("http://localhost:8888/index.html"));
				be2.open(bei);
				addPage(be2, bei);
	        	*/
	        	
				/*int style = IWorkbenchBrowserSupport.AS_EDITOR | IWorkbenchBrowserSupport.LOCATION_BAR | IWorkbenchBrowserSupport.STATUS;
	        	IWebBrowser browser = WorkbenchBrowserSupport.getInstance().createBrowser(style, "MyBrowserID", "MyBrowserName", "MyBrowser Tooltip");
	        	browser.openURL(new URL("http://www.google.com"));
	        	
				
				bm = BrowserManager.getInstance();
				wb = (WebBrowserEditor) bm.getCurrentWebBrowser();
				addPage(browser, getEditorInput());*/
					
	        	se = new TextEditor();
				setPageText(addPage(se, getEditorInput()), "Source");
				
				// Make the selection available to other views
				// see:
				// http://wiki.eclipse.org/FAQ_How_do_I_make_a_view_respond_to_selection_changes_in_another_view%3F
				// NOTE: getSite() here and not in the child editors please otherwise not working!!!
				
				getSite().setSelectionProvider(te.getTableViewer());
				
	        } catch (Exception e) {
	            System.err.println(e);
	            e.printStackTrace();
	        }
		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {	
	}

	
	@Override
	public Object getAdapter(Class adapter) {
		
		if (IPropertySheetPage.class.equals(adapter)) {
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
	
	public IContentOutlinePage getContentOutline() {
		//if (fContentOutline == null || fContentOutline.isDisposed()) {
			//fContentOutline = new ChannelsMultiPageContentOutline(this);
			
			updateContentOutline(getActivePageInstance());
		//}
		return out;
	}
	
	private void updateContentOutline(IFormPage page) {
		//if (fContentOutline == null)
		//	return;

		if (out == null)
			out = be.getContentOutline();
		/*IContentOutlinePage outline = null;
		if (page instanceof EditorBrowserFASTOut)
			outline = ((EditorBrowserFASTOut)page).getContentOutline();
		else if (page instanceof EditorFormTableFASTOut)
			outline = ((EditorFormTableFASTOut)page).getContentOutline();
		 */
		//fContentOutline.setPageActive(outline);
	}
		
	@Override
	public void doSaveAs() {
		
	}
	
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);		
		IFormPage page = getActivePageInstance();	
		//updateContentOutline(page);
		updateContentOutline(page);
		//if (page != null) {
		//	fLastActivePageId = page.getId();
		//}
	}

}
