package sc.ndt.editor.fast.ui.addon.mpe.outline;

import java.util.Iterator;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IPartSelectionListener;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import sc.ndt.commons.http.HttpUtils;
import sc.ndt.commons.model.TowerNodeStruct;
import sc.ndt.commons.model.TowerNodeStructList;
import sc.ndt.editor.fast.fasttwr.aTwrStat;
import sc.ndt.editor.fast.ui.addon.mpe.TwrFormPage;
import sc.ndt.editor.fast.ui.addon.mpe.TwrMultiPageEditor;

public class ChartOutline extends Page implements
	IContentOutlinePage,ISelectionListener /*ISelectionChangedListener*/ {

	private ListenerList selectionChangedListeners = new ListenerList();

	private Browser browser;

	
	protected boolean initialized = false;

	private TowerNodeStruct tn;

	public void init(IPageSite pageSite) {
        super.init(pageSite);
        pageSite.setSelectionProvider(this);
        pageSite.getPage().addSelectionListener(this);
    }
	
	@Override
	public void createControl(Composite parent) {
		// kick-off the server if not already running
				HttpUtils.getDefaultServer();

				// prepare browser
				browser = new Browser(parent,HttpUtils.getEngine());
				//browser.setUrl("http://localhost:8888/outline.html");
				browser.setUrl("http://localhost:8888/outline_flot.html");
				
				browser.addProgressListener(new ProgressListener() {
					
					@Override
					public void completed(ProgressEvent event) {

						initialized = true;
						
						// init size
						//currentSize = browser.getSize();
						//browser.evaluate("return initSize("+currentSize.y+","+currentSize.x+");");
						//browser.evaluate("return create("+currentSize.y+","+currentSize.x+");");
						//browser.evaluate("return create();");
						/*
				            	String name = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelsNameString();
				        		String data = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelsData();
				        		String vis = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelsInvisible();

				            	browser.evaluate("return setData("+name+","+data+","+vis+");");
						 */
						
						
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
				
		
	}
	
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	

	@Override
	public void setFocus() {
		browser.setFocus();
		
	}



	@Override
	public Control getControl() {
		return browser;
	}



	@Override
	public void setActionBars(IActionBars actionBars) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	@Override
	public ISelection getSelection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	@Override
	public void setSelection(ISelection selection) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
	
		if (part instanceof TwrMultiPageEditor) {
			TwrFormPage tfp = (TwrFormPage)((TwrMultiPageEditor)part).formPageMain;
			TowerNodeStructList tnsl = tfp.getTnslTsv();
			
			Iterator<TowerNodeStruct> it = tnsl.iterator();
			boolean check = false;
			
			String data1 	= "[";
			String data2 	= "[";
			while(it.hasNext()){
				tn = it.next();
				float h = tn.getPropertyFloat("HtAgl");
				float d = tn.getPropertyFloat("d");
				
				if(check) {
					data1 = data1.concat(",");
					data2 = data2.concat(",");
				}
				check = true;
				data1 = data1.concat("[").concat(Float.toString(-d/2)).concat(",").concat(Float.toString(h)).concat("]");
				data2 = data2.concat("[").concat(Float.toString(d/2)).concat(",").concat(Float.toString(h)).concat("]");
			}
			data1 = data1.concat("]");
			data2 = data2.concat("]");
			
			if(data1!=null && initialized)
				//browser.evaluate("return setData([\"Time\",\"\"],"+data+",[1,1]);");
				browser.evaluate("return setData(["+data1+","+data2+"]);");
		}
		
		
	}



}
