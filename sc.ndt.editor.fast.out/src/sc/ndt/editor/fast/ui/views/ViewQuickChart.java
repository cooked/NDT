package sc.ndt.editor.fast.ui.views;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;

import sc.ndt.commons.http.HttpUtils;
import sc.ndt.editor.fast.ui.editors.EditorFormTableFASTOut;
import sc.ndt.editor.fast.ui.editors.MultiPageFASTOutEditor;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class ViewQuickChart extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "sc.ndt.editor.fast.out.views.ViewQuickChart";
	private Action action1;
	private Action action2;
	private Action doubleClickAction;
	private Browser browser;
	
	/**
	 * The constructor.
	 */
	public ViewQuickChart() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {

		// kick-off server
		HttpUtils.getDefaultServer();

		// bring up the browser
		browser = new Browser(parent, HttpUtils.getEngine());
		browser.setUrl("http://localhost:8888/quickChart.html");
		browser.addProgressListener(new ProgressListener() {
			@Override
			public void completed(ProgressEvent event) {

				/*String name = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelsNameString();
        		String data = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelsData();
        		String vis = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelsInvisible();
				 */

				//browser.evaluate("return setData("+name+","+data+","+vis+");");

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

		// see:
		// http://www.eclipse.org/articles/Article-WorkbenchSelections/article.html
		// http://wiki.eclipse.org/FAQ_How_do_I_make_a_view_respond_to_selection_changes_in_another_view%3F
		getSite().getPage().addSelectionListener(listener);

		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	
	ISelectionListener listener = new ISelectionListener() {
		public void selectionChanged(IWorkbenchPart part, ISelection sel) {
			if (part instanceof MultiPageFASTOutEditor) {
				EditorFormTableFASTOut eft = (EditorFormTableFASTOut)((MultiPageFASTOutEditor)part).getActivePageInstance();
				String data = eft.data;
				if(data!=null)
					browser.evaluate("return setData([\"Time\",\"\"],"+data+",[1,1]);");
				
			}
			
			//if (o instanceof Book)
			//	viewer.setInput(ss.size()==1 ? o : null);
		}
		
		
	};

	private SelectionAdapter getSelectionAdapter() {
		SelectionAdapter selectionAdapter = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(e.getSource() instanceof TableColumn) {
					//TableColumn tc = (TableColumn)e.getSource();
					//String chName = tc.getText(); 
					//String data = ((MultiPageFASTOutEditor)getEditor()).pFile.getChannelString(chName);
					//System.out.println(data);
				}
			}
		};
		return selectionAdapter;
	}
	
	public void dispose() {
		getSite().getPage().removeSelectionListener(listener);
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ViewQuickChart.this.fillContextMenu(manager);
			}
		});
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		/*doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};*/
	}

	private void hookDoubleClickAction() {
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
				browser.getShell(),
				"Quick Chart",
				message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		browser.getParent().setFocus();
	}
}