package sc.ndt.editor.fast.ui.views;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import sc.ndt.commons.model.OutBlock;
import sc.ndt.commons.model.OutCh;
import sc.ndt.commons.model.OutList;
import sc.ndt.commons.model.providers.outlist.OutListCheckStateProvider;
import sc.ndt.commons.model.providers.outlist.OutListContentProvider;
import sc.ndt.commons.model.providers.outlist.OutListLabelProvider;
import sc.ndt.commons.model.providers.outlist.OutListViewerComparator;
import sc.ndt.editor.fast.ui.editors.EditorBrowserFASTOut;
import sc.ndt.editor.fast.ui.editors.MultiPageFASTOutEditor;

//public class OutlinePageChGraph extends Page implements IContentOutlinePage, ISelectionChangedListener {
public class OutlinePageChGraph extends ContentOutlinePage implements ISelectionChangedListener {

	private ListenerList selectionChangedListeners = new ListenerList();

	private CheckboxTreeViewer checkboxTreeViewer;

	private IContentOutlinePage currentPage;

	private EditorBrowserFASTOut ed;

	private ArrayList<OutBlock> ob;
	
	// see
	// http://help.eclipse.org/indigo/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fapi%2Forg%2Feclipse%2Fui%2Fviews%2Fcontentoutline%2FContentOutline.html
	
	@Override
	public void dispose() {
		checkboxTreeViewer = null;
		super.dispose();
	}
	public OutlinePageChGraph() {
        super();
    }
	public OutlinePageChGraph(EditorBrowserFASTOut editor) {
		ed  = editor;
	}
		
	public void createControl(Composite parent) {
		checkboxTreeViewer = new CheckboxTreeViewer(parent, getTreeStyle());
		checkboxTreeViewer.addSelectionChangedListener(this);
		checkboxTreeViewer.getTree().setHeaderVisible(true);
		checkboxTreeViewer.getTree().setLinesVisible(true);
		
		TreeViewerColumn column_1 = new TreeViewerColumn(checkboxTreeViewer, SWT.NONE);
		column_1.getColumn().setWidth(250);
		column_1.getColumn().setMoveable(false);
		column_1.getColumn().setText("Output Channels");	
		column_1.setLabelProvider(new OutListLabelProvider());
		
		TreeViewerColumn column_2 = new TreeViewerColumn(checkboxTreeViewer, SWT.NONE);
		column_2.getColumn().setWidth(60);
		column_2.getColumn().setResizable(false);
		column_2.getColumn().setMoveable(false);
		column_2.getColumn().setText("Units");
		column_2.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				if (element instanceof OutCh)
					return ((OutCh) element).unit;
				return "";
			}

		});
		
		checkboxTreeViewer.setContentProvider(new OutListContentProvider());
		//checkboxTreeViewer.setCheckStateProvider(new OutListCheckStateProvider());
		checkboxTreeViewer.addSelectionChangedListener(this);
		checkboxTreeViewer.setComparator(new OutListViewerComparator());
		
		ob = ((MultiPageFASTOutEditor)ed.getEditor()).pFile.outList.getAvailableOutBlocks();
		checkboxTreeViewer.setInput(ob);
	     
		/*checkboxTreeViewer.addDoubleClickListener(new IDoubleClickListener() {
			  @Override
			  public void doubleClick(DoubleClickEvent event) {
			    IStructuredSelection thisSelection = (IStructuredSelection) event.getSelection(); 
			    Object selectedNode = thisSelection.getFirstElement(); 
			    // TODO something  viewer.setExpandedState(selectedNode,
			    //                 !viewer.getExpandedState(selectedNode));
			  }
			});
			*/
		
		checkboxTreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object o = event.getSelection();

			}
		});

		
		// TODO http://www.java2s.com/Code/Java/SWT-JFace-Eclipse/DemonstratesCheckboxTreeViewer.htm
		checkboxTreeViewer.addCheckStateListener(new ICheckStateListener() {
			
			public void checkStateChanged(CheckStateChangedEvent event) {

				Object elm = event.getElement();

				// is channel
				if(elm instanceof OutCh && !checkboxTreeViewer.getGrayed(elm)) {

					OutCh ch = (OutCh)elm;
					if(ed.getEditor() instanceof MultiPageFASTOutEditor)
						ed.toggleChVisibility(ch.usedName,event.getChecked());

				// is block of channels
				} else if(elm instanceof OutBlock) {

					OutBlock 		bl = (OutBlock)elm;
					Iterator<OutCh> it = bl.values().iterator();
					if(ed.getEditor() instanceof MultiPageFASTOutEditor) {
						while(it.hasNext()) {
							OutCh ch = it.next();
							ed.toggleChVisibility(ch.usedName,event.getChecked());
						}
					}
					checkboxTreeViewer.setSubtreeChecked(elm, event.getChecked());

				}

			}

		});
		
		checkboxTreeViewer.expandAll();
		checkboxTreeViewer.setAllChecked(true);
		checkboxTreeViewer.collapseAll();
		//checkboxTreeViewer.setAllChecked(false);
		
		//Object obj = checkboxTreeViewer.getInput();
		//checkboxTreeViewer.setSubtreeChecked(obj, true);
		
		//TreeItem ti = checkboxTreeViewer.getTree().getItems();
		
		//checkboxTreeViewer.getTree().setSelection();
		
		getSite().setSelectionProvider(checkboxTreeViewer);
		
		
		/*		
		// add listener
				partListener = new IPartListener() {
					
					private OutListContentProvider olcp;
					private OutListCheckStateProvider olcsp;
					private ArrayList<OutBlock> input;
					private OutListLabelProviderInner c1ollp;
					private ColumnLabelProvider c2ollp;
					
					
					@Override
					public void partActivated(IWorkbenchPart part) {
						if (part instanceof MultiPageFASTOutEditor) {
							
							activePart = part;
							
						//} else if (part instanceof BrowserFASTOutEditor) {
							
						//	activePart = part;
							
							
							//if(checkboxTreeViewer!=null && checkboxTreeViewer.getInput()!=null && chkdElements!=null)
							//	checkboxTreeViewer.setCheckedElements(chkdElements);
							
							
						} else if (part instanceof ViewPartChannels) {
							if(checkboxTreeViewer!=null && checkboxTreeViewer.getInput()!=null && chkdElements!=null)
								checkboxTreeViewer.setCheckedElements(chkdElements);
						}
					}

					@Override
					public void partClosed(IWorkbenchPart part) {
						if(part == activePart)
							activePart = null;
						if(checkboxTreeViewer.getInput()!=null)
							checkboxTreeViewer.setInput(null);
						
					}

					@Override
					public void partBroughtToTop(IWorkbenchPart part) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void partDeactivated(IWorkbenchPart part) {
						if (part instanceof ViewPartChannels || part instanceof MultiPageFASTOutEditor) {
							if(checkboxTreeViewer!=null && checkboxTreeViewer.getInput()!=null)
								chkdElements = checkboxTreeViewer.getCheckedElements();
						}
					}

					@Override
					public void partOpened(IWorkbenchPart part) {
						
						if (part instanceof MultiPageFASTOutEditor) {
							if(outList==null) 
								outList = ((MultiPageFASTOutEditor)part).pFile.outList;
							if(olcp==null) 
								olcp 	= outList.new OutListContentProvider();
							if(olcsp==null)
								olcsp 	= outList.new OutListCheckStateProvider();
							if(input==null)	
								input 	= outList.getAllOutBlocks();
						
							if(c1ollp==null)	
								c1ollp = outList.new OutListLabelProviderInner();
							
							if(c2ollp==null) {
								c2ollp = new ColumnLabelProvider() {
									public String getText(Object element) {
										if (element instanceof OutCh)
											return ((OutCh)element).unit;
										return "";
									}
								};
							}
							
							column_1.setLabelProvider(c1ollp);
							column_2.setLabelProvider(c2ollp);
							
							checkboxTreeViewer.setContentProvider(olcp);
							checkboxTreeViewer.setCheckStateProvider(olcsp);
							checkboxTreeViewer.setInput(input);
							OutListToolTipSupport.enableFor(checkboxTreeViewer);
						}
						
					}
					
				};
				
				getSite().getPage().addPartListener(partListener);
				*/
	}

	protected int getTreeStyle() {
		return SWT.NONE; //SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL;
	}
	
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	protected void fireSelectionChanged(ISelection selection) {
        // create an event
        final SelectionChangedEvent event = new SelectionChangedEvent(this,
                selection);

        // fire the event
        Object[] listeners = selectionChangedListeners.getListeners();
        for (int i = 0; i < listeners.length; ++i) {
            final ISelectionChangedListener l = (ISelectionChangedListener) listeners[i];
            SafeRunner.run(new SafeRunnable() {
                public void run() {
                    l.selectionChanged(event);
                }
            });
        }
    }
	
	@Override
	public ISelection getSelection() {
		if (checkboxTreeViewer == null)
			return StructuredSelection.EMPTY;
        return checkboxTreeViewer.getSelection();
	}

	@Override
	public Control getControl() {
		if (checkboxTreeViewer == null)
			return null;
        return checkboxTreeViewer.getControl();
	}
	
	protected CheckboxTreeViewer getCheckboxTreeViewer() {
        return checkboxTreeViewer;
    }
	
	public void init(IPageSite pageSite) {
        super.init(pageSite);
        pageSite.setSelectionProvider(this);
    }
	
	/* (non-Javadoc)
     * Method declared on ISelectionProvider.
     */
    public void removeSelectionChangedListener(
            ISelectionChangedListener listener) {
        selectionChangedListeners.remove(listener);
    }

    /* (non-Javadoc)
     * Method declared on ISelectionChangeListener.
     * Gives notification that the tree selection has changed.
     */
    public void selectionChanged(SelectionChangedEvent event) {
        fireSelectionChanged(event.getSelection());
    }

    /**
     * Sets focus to a part in the page.
     */
    public void setFocus() {
    	checkboxTreeViewer.getControl().setFocus();
    }

    /* (non-Javadoc)
     * Method declared on ISelectionProvider.
     */
    public void setSelection(ISelection selection) {
        if (checkboxTreeViewer != null)
        	checkboxTreeViewer.setSelection(selection);
    }
        
}
