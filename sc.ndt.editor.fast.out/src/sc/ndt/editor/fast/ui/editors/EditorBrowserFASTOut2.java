package sc.ndt.editor.fast.ui.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.internal.browser.BrowserViewer;
import org.eclipse.ui.internal.browser.IBrowserViewerContainer;
import org.eclipse.ui.internal.browser.WebBrowserEditor;
import org.eclipse.ui.part.EditorPart;

import sc.ndt.commons.http.HttpUtils;

public class EditorBrowserFASTOut2 extends EditorPart implements IBrowserViewerContainer {

	private BrowserViewer webBrowser;
	private int id;
	private Browser browser;

	
	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		setPartName(input.getName());
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
	public void createPartControl(Composite parent) {
		
		HttpUtils.getDefaultServer();
		
		//browser = new Browser(parent,SWT.NONE);
		//browser.setUrl("http://localhost:8888/index.html");
		
		int style = 0;
			style += BrowserViewer.LOCATION_BAR;
			style += BrowserViewer.BUTTON_BAR;
		webBrowser = new BrowserViewer(parent, style);
		webBrowser.setURL("http://localhost:8888/index.html");
	
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IActionBars getActionBars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void openInExternalBrowser(String url) {
		// TODO Auto-generated method stub
		
	}

}
