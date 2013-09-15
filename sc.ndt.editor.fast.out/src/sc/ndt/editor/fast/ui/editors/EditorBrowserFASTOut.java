package sc.ndt.editor.fast.ui.editors;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.wb.swt.ResourceManager;

import sc.ndt.editor.fast.ui.views.OutlinePageChGraph;

public class EditorBrowserFASTOut extends FormPage {

	//public static final String ID = "sc.webui.charting.editors.EditorBrowserFASTOut"; //$NON-NLS-1$
		
	public ArrayList<String> 	visibleCh;

	private OutlinePageChGraph 	myOutlinePage;

	private Browser browser;


	public EditorBrowserFASTOut(FormEditor editor, String id, String title) {
		super(editor, id, title);
		// init map to track plotted channels
		visibleCh = new ArrayList<String>();
		        
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) {
				
		setSite(site);
		setInput(input);
		setPartName(input.getName());
				
	}
	
	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		// set decorations and title
		//FormToolkit toolkit = managedForm.getToolkit();
		//ScrolledForm form = managedForm.getForm();
		//form.setText("Empty FormPage"); 	
		//Composite body = form.getBody();	
		//toolkit.decorateFormHeading(form.getForm());
		//toolkit.paintBordersFor(body);
		managedForm.getForm().getBody().setLayout(new FillLayout(SWT.VERTICAL));
				
		// specify browser type 	- http://www.eclipse.org/swt/faq.php#browserspecifydefault
        // SWT.MOZILLA 				- http://www.eclipse.org/swt/faq.php#howusemozilla
        // 							- https://developer.mozilla.org/en/docs/XULRunner
        // XULRunner Eclipse plugin - http://forge.ispras.ru/projects/xulrunner-eclipse
        // XULRunner vs WebKit 		- http://dottorblaster.it/2011/04/eclipse-sostituire-xulrunner-con-webkit/		
		browser = new Browser(managedForm.getForm().getBody(), SWT.MOZILLA);
		browser.setUrl("http://localhost:8888/index.html");
		//browser.setUrl("http://localhost:8888/dygraph.html");
		managedForm.getToolkit().adapt(browser);
		managedForm.getToolkit().paintBordersFor(browser);
		
		browser.addProgressListener(new ProgressListener() {
            @Override
            public void completed(ProgressEvent event) {
            	// onComplete();
            }
            @Override
            public void changed(ProgressEvent event) {
            }
        });
        
		browser.addLocationListener(new LocationListener(){
			@Override
			public void changing(LocationEvent event) {
				// do nothing
			}
			@Override
			public void changed(LocationEvent event) {
				// do nothing
			}
        	
        });
		
		
//				// see
//				// http://devblog.virtage.com/2012/09/snippet-of-the-day-execute-eclipse-command-programmatically/
//				
//				Action runAction = new Action("Run") { //$NON-NLS-1$
//					public void run() {
//					}
//				};
//				runAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("org.eclipse.jdt.debug.ui", "/icons/full/etool16/run_exc.gif"));
//
//				/*
//				Action linAction = new Action("Linearize") { //$NON-NLS-1$
//					public void run() {
//					}
//				};
//				linAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("org.eclipse.jdt.debug.ui", "/icons/full/etool16/run_exc.gif"));
//
//				Action helpAction = new Action("Help") { //$NON-NLS-1$
//					public void run() {
//					}
//				};
//				helpAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("org.eclipse.help.ui", "/icons/etool16/help.gif"));
//				 */
//				
//				managedForm.getForm().getToolBarManager().add(runAction);		// run time-marching simulation
//				//manager.add(linAction);		// run model linearization
//				//manager.add(helpAction);	// open help
//				
//				
//				managedForm.getForm().updateToolBar();
//				
		// toolbar
        /*ToolBar toolBar = new ToolBar(composite, SWT.FLAT | SWT.RIGHT);
        toolBar.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
        toolBar.setBounds(0, 0, 80, 19);
        
        ToolItem tltmNewItem = new ToolItem(toolBar, SWT.CHECK);
        tltmNewItem.setText("Link");
        tltmNewItem.setToolTipText("Link up/down");
        tltmNewItem.setImage(ResourceManager.getPluginImage("sc.webui.charting", "icons/arrow_switch.png"));
        
        ToolItem tltmDropdownItem = new ToolItem(toolBar, SWT.DROP_DOWN);
        tltmDropdownItem.setText("DropDown Item");
        */
		
	}
		
	public float[][] getChDataF(String chName) {
		return ((MultiPageFASTOutEditor)getEditor()).pFile.xySeries.get(chName);
	}
	
	public String getChDataS(String chName) {
		return Arrays.deepToString(
				((MultiPageFASTOutEditor)getEditor()).pFile.xySeries.get(chName)
				);
	}

	public void appendCh(String chName,int plotNr) {
		String ds = getChDataS(chName);
		Object res = browser.evaluate(	//, curvedLines: {apply:true,fit: true, fitPointDist: 0.000001}
        		"n"+plotNr+".push({ label: '" + chName + "', data:" + ds + " });" +
        		"return setSWTData"+plotNr+"();" );
		visibleCh.add(chName);
    }
	
	public void removeCh(String chName,int plotNr) {
		int index = visibleCh.indexOf(chName);
		Object res = browser.evaluate("n"+plotNr+".splice("+index+",1); return setSWTData"+plotNr+"();");
		visibleCh.remove(index);
    }
	
	@Override
	public void setFocus() {
		super.setFocus();
	}
		
	public IContentOutlinePage getContentOutline() {
		if (myOutlinePage == null)
			myOutlinePage = new OutlinePageChGraph(this);
		return myOutlinePage;
	}
}
