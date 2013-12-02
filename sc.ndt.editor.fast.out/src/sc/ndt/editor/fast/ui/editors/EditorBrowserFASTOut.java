package sc.ndt.editor.fast.ui.editors;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.wb.swt.ResourceManager;

import sc.ndt.commons.http.HttpUtils;
import sc.ndt.commons.model.OutList;
import sc.ndt.editor.fast.ui.views.OutlinePageChGraph;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.osgi.framework.Bundle;

public class EditorBrowserFASTOut extends FormPage {

	//public static final String ID = "sc.webui.charting.editors.EditorBrowserFASTOut"; //$NON-NLS-1$
		
	@Override
	public void dispose() {
		
		myOutlinePage.dispose();
		
		super.dispose();
	}

	public ArrayList<String> 	visibleCh;
	private OutlinePageChGraph 	myOutlinePage;
	private Browser 			browser;

	public boolean initialized;
	
	public EditorBrowserFASTOut(FormEditor editor, String id, String title) {
		super(editor, id, title);
		// init map to track plotted channels
		visibleCh = new ArrayList<String>();
		        
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) {
				
		setSite(site);
		setInput(input);
		//setPartName(input.getName());
				
	}
	
	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	private Browser createSWTBrowser(Composite parent)
    {
            try
            {
                    if (System.getProperty(HttpUtils.XULRUNNER_ENV) == null)
                    {
                            Bundle bundle = null;
                            if (Platform.getOS().matches(Platform.OS_WIN32))
                                    bundle = Platform.getBundle(HttpUtils.XULRUNNER_WIN32_PLUGIN);
                            else if (Platform.getOS().matches(Platform.OS_MACOSX))
                                    bundle = Platform.getBundle(HttpUtils.XULRUNNER_MAC_PLUGIN);

                            if (bundle != null)
                            {
                                    URL xulrunner = bundle.getEntry(HttpUtils.XULRUNNER_PATH);
                                    if (xulrunner != null)
                                    {
                                            try
                                            {
                                                    xulrunner = FileLocator.toFileURL(xulrunner);
                                                    if (xulrunner != null)
                                                    {
                                                            File xulrunnerFolder = new File(xulrunner.getFile());
                                                            /*String message = MessageFormat.format(
                                                                    Messages.getString("FirefoxBrowser.Setting_Path_To"), //$NON-NLS-1$
                                                                    new Object[] {
                                                                            xulrunnerFolder.getAbsolutePath()
                                                                    }
                                                            );*/
                                                            System.setProperty(HttpUtils.XULRUNNER_ENV, xulrunnerFolder.getAbsolutePath());
                                                            //IdeLog.logInfo(Activator.getDefault(), message);
                                                    }
                                            }
                                            catch (IOException e)
                                            {
                                                  //  IdeLog.logError(Activator.getDefault(), Messages.getString("FirefoxBrowser.Error_Setting_Path"), e); //$NON-NLS-1$
                                            }
                                    }
                            }
                    }
            }
            catch (Exception e)
            {
                   // IdeLog.logError(Activator.getDefault(), Messages.getString("FirefoxBrowser.Error_Setting_Path"), e); //$NON-NLS-1$
            }

            return new Browser(parent, HttpUtils.getEngine());
            //browser.addProgressListener(progressListener);
            //browser.addOpenWindowListener(openWindowListener);
            
    }
            
	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		
		// TODO
		// change to WebBrowserEditor
		
		HttpUtils.getDefaultServer();
		
		try {
			GridLayout layout = new GridLayout();
			layout.marginHeight = 0;
	        layout.marginWidth = 0;
	        layout.horizontalSpacing = 0;
	        layout.verticalSpacing = 0;
	        
	         managedForm.getForm().getBody().setLayout(layout);
	         //browser = new Browser(managedForm.getForm().getBody(), HttpUtils.getEngine());
	         browser = createSWTBrowser(managedForm.getForm().getBody());
	         browser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		} catch (SWTError e) {
	         MessageBox messageBox = new MessageBox(managedForm.getForm().getBody().getShell(), SWT.ICON_ERROR | SWT.OK);
	         messageBox.setMessage("Browser cannot be initialized.");
	         messageBox.setText("Exit");
	         messageBox.open();
	         //System.exit(-1);
	    }
		
		/*browser = new Browser(managedForm.getForm().getBody(),HttpUtils.getEngine());
		managedForm.getToolkit().adapt(browser);
		managedForm.getToolkit().paintBordersFor(browser);
		*/
		
		browser.setUrl("http://localhost:8888/index.html");
		//browser.setUrl("http://localhost:8888/index_flot.html");
		
		browser.addControlListener(new ControlListener() {
            public void controlResized(ControlEvent e) {
            }
            public void controlMoved(ControlEvent e) {
            }
        });
		
		browser.addProgressListener(new ProgressListener() {

            
			@Override
            public void completed(ProgressEvent event) {
        		
            	// ----- DYGRAPH chart
            	String name = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelsNameString();
        		String data = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelsData();
        		String vis = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelsVisible();
        		
        		// la forma, visibility: [false, true, true,...]
        		browser.execute("setData("+name+","+data+","+vis+");");
        		
        		// numero canali meno il tempo
        		//int numCh = ((MultiPageFASTOutEditor)getEditor()).pFile.channels.length-1;
        		//browser.execute("hideAll();");
        		//browser.execute("hideAllButFirst();");
        		
        		//browser.evaluate("return setData(["+"\"Wind\""+"],"+single+",0);");
        		//browser.evaluate("return setData(["+"\"Time\",\"Wind\""+"],"+single+",0);");
        		//String single = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelString("Azimuth");
        		// ----- END
        		
        		
        		/* for FLOT graph*/
				//String single = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelString("Azimuth");
				//browser.evaluate("return setCh(["+single+"]);");
				initialized = true;
            }
            @Override
            public void changed(ProgressEvent event) {
            }
        });
        
		browser.addLocationListener(new LocationListener(){
			@Override
			public void changing(LocationEvent event) {
			}
			@Override
			public void changed(LocationEvent event) {
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

	public void toggleChVisibility(String chName,boolean value) {
		browser.execute("setSerieVisibility(\""+chName+"\","+value+");");
		browser.execute("TESTcheckClicked(\""+chName+"\");");
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
