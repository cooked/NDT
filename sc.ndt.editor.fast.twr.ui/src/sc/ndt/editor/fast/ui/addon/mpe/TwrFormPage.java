package sc.ndt.editor.fast.ui.addon.mpe;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationListener;
import org.eclipse.jface.viewers.ColumnViewerEditorDeactivationEvent;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;

import sc.ndt.commons.model.ModelFileTowerSec;
import sc.ndt.commons.model.OutList;
import sc.ndt.commons.model.TowerNodeStruct;
import sc.ndt.commons.model.TowerNodeStructList;
import sc.ndt.commons.model.providers.StructListLabelProvider;
import sc.ndt.commons.model.providers.airfoils.AirfoilCellEditorProvider;
import sc.ndt.commons.model.providers.airfoils.AirfoilListLabelProvider;
import sc.ndt.commons.ui.editor.IXtextFormEditor;
import sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage;
import sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi;
import sc.ndt.editor.bmodes.bmodestsp.BmodestspPackage;
import sc.ndt.editor.bmodes.bmodestsp.ModelBmodestsp;
import sc.ndt.editor.bmodes.bmodestsp.aSec;
import sc.ndt.editor.fast.fasttwr.FasttwrPackage;
import sc.ndt.editor.fast.fasttwr.ModelFasttwr;
import sc.ndt.editor.fast.fasttwr.aTwrStat;

import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EObject;

import ch.vorburger.xtext.databinding.XtextDataBindingContext;
import ch.vorburger.xtext.databinding.XtextProperties;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.CCombo;



public class TwrFormPage extends FormPage {

	private DataBindingContext m_bindingContext;

	private ScrolledForm form;
	private FormToolkit toolkit;
	private IToolBarManager manager;

	public URI uri;
	private Spinner FAStTunr2;
	private Text radius;
	private Text hub_rad;
	private Text modepr;


	private TowerNodeStructList tnslTwr 	= new TowerNodeStructList(); // from tower.twr file
	private TowerNodeStructList tnslTsv 	= new TowerNodeStructList(); // from section .tsv file
	
	public TowerNodeStructList getTnslTsv() {
		return tnslTsv;
	}

	private TowerNodeStructList tnslTsp 	= new TowerNodeStructList(); // from bmodes .tsp file
	
	private ModelFasttwr 	mTwr;
	private ModelBmodestsp 	mTsp;
	
	private Table table;
	private TableViewer tableViewer_1;

	private Menu contextMenu;
	private Spinner TwrFADmp1;
	private Spinner TwrFADmp2;

	private FieldDecoration fieldDecERR;
	private Spinner TwrSSDmp1;
	private Spinner TwrSSDmp2;
	private Spinner FAStTunr1;
	private Spinner SSStTunr2;
	private Spinner SSStTunr1;
	private Text tip_mass;
	private Text cm_loc;
	private Text cm_axial;
	private Text ixx_tip;
	private Text ixy_tip;
	private Text izx_tip;
	private Text iyy_tip;
	private Text iyz_tip;
	private Text izz_tip;
	private Spinner sec_mass_mult;
	private Spinner flp_iner_mult;
	private Spinner lag_iner_mult;
	private Spinner flp_stff_mult;
	private Spinner edge_stff_mult;
	private Spinner tor_stff_mult;
	private Spinner axial_stff_mult;
	private Spinner cg_offst_mult;
	private Spinner sc_offst_mult;
	private Spinner tc_offst_mult;
	
	TwrMultiPageEditor tmpe;

	private IXtextDocument docBmi;
	private IXtextDocument docTwr;
	private IXtextDocument docTsp;

	private aTwrStat ast;

	private aSec asc;
	
	IAdapterManager am = Platform.getAdapterManager();
	
	private HashMap<String,XtextEditor>	xtextEditors 		= new HashMap<String,XtextEditor>();
	private HashMap<String,EObject>		xtextEditorsModel 	= new HashMap<String,EObject>();
	
	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public TwrFormPage(String id, String title) {
		super(id, title);
	}
	
	/**
	 * Create the form page.
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public TwrFormPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}
	
	

	@Override
	public void init(IEditorSite site, IEditorInput input) {

		super.init(site, input);

		IFile file = ((FileEditorInput) input).getFile();

		// form is contained in a pure tower multipage editor
		if(getEditor() instanceof TwrMultiPageEditor) {

			IXtextFormEditor 	xfe = (IXtextFormEditor)getEditor();

			mTwr = (ModelFasttwr) am.getAdapter(file, ModelFasttwr.class);
			//docTwr = mTwr.getDocument();

			XtextEditor eBmi = xfe.getXtextEditor("bmi");
			if(eBmi!=null)
				docBmi = eBmi.getDocument();

			XtextEditor eTsp = xfe.getXtextEditor("tsp");
			if(eTsp!=null) {
				mTsp = (ModelBmodestsp) xfe.getModelFromXtextEditor(eTsp);
				docTsp = eTsp.getDocument();
				asc = mTsp.getSections();

				for(int i = 0; i < asc.getSec_loc().size(); i++) {
					tnslTsp.add(new TowerNodeStruct(
							asc.getSec_loc().get(i),
							asc.getMass_den().get(i),
							asc.getFlp_stff().get(i),
							asc.getEdge_stff().get(i),
							asc.getTor_stff().get(i),
							asc.getAxial_stff().get(i),
							asc.getFlp_iner().get(i),
							asc.getEdge_iner().get(i),
							asc.getCg_offst().get(i)
							));
				}
			}


		// contained in FAST multi page editor
		} else if(getEditor() instanceof IXtextFormEditor) {

			IXtextFormEditor xfe = (IXtextFormEditor)getEditor();
			if(mTwr==null) {
				mTwr = (ModelFasttwr) am.getAdapter(file, ModelFasttwr.class);
				XtextEditor eTwr = xfe.getXtextEditor("twr");
				if(eTwr!=null)
					docTwr = eTwr.getDocument();


				//FileEditorInput input = (FileEditorInput) getEditorInput();

				//mTwr = (ModelFasttwr) am.getAdapter(input.getFile(), ModelFasttwr.class);
				//docTwr = ((XtextEditor) am.getAdapter(input, ModelFasttwr.class)).getDocument();

				Path path = new Path(file.getFullPath().toOSString());
				IWorkspaceRoot r = ResourcesPlugin.getWorkspace().getRoot();


				///// Bmodes input source
				IPath p2 = path.removeFileExtension().addFileExtension("bmi");
				xtextEditorsModel.put("bmi", (ModelBmodesbmi) am.getAdapter(r.getFile(p2), ModelBmodesbmi.class));

				///// Bmodes input source
				//p2 = path.removeFileExtension().addFileExtension("tsp");
				//file = r.getFile(p2);
				//xtextEditorsModel.put("tsp", (ModelBmodesbmi) am.getAdapter(file, ModelBmodesbmi.class));

				// il file .tsv non lo visualizzo ma viene caricato headless e utilizzato
				// nel form
			}
			
		}



		ast = mTwr.getTwrStat();
		for(int i = 0; i < ast.getHtFract().size(); i++) {
			tnslTwr.add(new TowerNodeStruct(
					ast.getHtFract().get(i),
					ast.getTMassDen().get(i),
					ast.getTwFAStif().get(i),
					ast.getTwSSStif().get(i),
					ast.getTwGJStif().get(i),
					ast.getTwEAStif().get(i),
					ast.getTwFAIner().get(i),
					ast.getTwSSIner().get(i),
					ast.getTwFAcgOf().get(i),
					ast.getTwSScgOf().get(i)
					));
		}



		if(getEditor() instanceof TwrMultiPageEditor) {
			tmpe 	= (TwrMultiPageEditor)getEditor();
			tnslTsv = tmpe.fileTwrTsv.getTower();

		}

		// TODO check constistency of node structures

	}

	public void doSave(IProgressMonitor monitor) {
		super.doSave(monitor);
		
		tmpe.fileTwrTsv.save(tnslTsv);
		
		setDirty(false);
		
	}

    public void doSaveAs() {
    	super.doSaveAs();
    	// TODO
    	// save with the new name tmpe.fileTwrTsv.save(tnslTsv);
    }
    
	// used to update the viewer from outside
	protected void refresh() {
		
		tnslTsv.calcHtFract();

		// TODO aggiungere qui codice per mantenere i file NON SINCRONIZZATI,
		// ovvero fare in modo che dal form non si modifichi il file di bmodes
		
		docTsp.modify(new IUnitOfWork.Void<XtextResource>() {
			@Override
			public void process(XtextResource resource) throws Exception {
				ModelBmodestsp m = (ModelBmodestsp) resource.getContents().get(0);
				if (m!=null && asc!=null) {
					
					m.getNNodes().setValue(tnslTsv.size());
					
					asc.getSec_loc().clear();
					asc.getSec_loc().addAll(tnslTsv.getListHtFract());
					asc.getStr_tw().clear();
					asc.getStr_tw().addAll(tnslTsv.getListStrTw());
					asc.getTw_iner().clear();
					asc.getTw_iner().addAll(tnslTsv.getListTwIner());
					asc.getMass_den().clear();
					asc.getMass_den().addAll(tnslTsv.getListTMassDen());
					asc.getFlp_iner().clear();
					asc.getFlp_iner().addAll(tnslTsv.getListTwFAIner());
					asc.getEdge_iner().clear();
					asc.getEdge_iner().addAll(tnslTsv.getListTwSSIner());
					asc.getFlp_stff().clear();
					asc.getFlp_stff().addAll(tnslTsv.getListTwFAStif());
					asc.getEdge_stff().clear();
					asc.getEdge_stff().addAll(tnslTsv.getListTwSSStif());
					asc.getTor_stff().clear();
					asc.getTor_stff().addAll(tnslTsv.getListTwGJStif());
					asc.getAxial_stff().clear();
					asc.getAxial_stff().addAll(tnslTsv.getListTwEAStif());
					asc.getCg_offst().clear();
					asc.getCg_offst().addAll(tnslTsv.getListTwFAcgOf());
					asc.getSc_offst().clear();
					asc.getSc_offst().addAll(tnslTsv.getListScOffst());
					asc.getTc_offst().clear();
					asc.getTc_offst().addAll(tnslTsv.getListTcOffst());
					
					m.setSections(asc);
					
				} else
					throw new IllegalStateException("Uh uh, no content");

			};
		});

		// when modify table notify the document
		//deactivateBinding();
				docTwr.modify(new IUnitOfWork.Void<XtextResource>() {
					@Override
					public void process(XtextResource resource) throws Exception {
						ModelFasttwr m = (ModelFasttwr) resource.getContents().get(0);
						if (m != null && ast != null){
							
							int size = tnslTsv.size();
							
							m.getNTwInpSt().setValue(size);
							
							ast.getHtFract().clear();
							ast.getTMassDen().clear();
							ast.getTwFAStif().clear();
							ast.getTwSSStif().clear();
							ast.getTwGJStif().clear();
							ast.getTwEAStif().clear();
							ast.getTwFAIner().clear();
							ast.getTwSSIner().clear();
							ast.getTwFAcgOf().clear();
							ast.getTwSScgOf().clear();
							
							for(int i=0; i<size; i++) {
								ast.getHtFract().add(tnslTsv.getListHtFract().get(i));
								ast.getTMassDen().add(tnslTsv.getListTMassDen().get(i));
								ast.getTwFAStif().add(tnslTsv.getListTwFAStif().get(i));
								ast.getTwSSStif().add(tnslTsv.getListTwSSStif().get(i));
								ast.getTwGJStif().add(tnslTsv.getListTwGJStif().get(i));
								ast.getTwEAStif().add(tnslTsv.getListTwEAStif().get(i));
								ast.getTwFAIner().add(tnslTsv.getListTwFAIner().get(i));
								ast.getTwSSIner().add(tnslTsv.getListTwSSIner().get(i));
								ast.getTwFAcgOf().add(tnslTsv.getListTwFAcgOf().get(i));
								ast.getTwSScgOf().add(tnslTsv.getListTwSScgOf().get(i));
							}
								
							/*
							ast.getHtFract().addAll(tnslTsv.getListHtFract());
							ast.getTMassDen().addAll(tnslTsv.getListTMassDen());
							ast.getTwFAStif().addAll(tnslTsv.getListTwFAStif());
							ast.getTwSSStif().addAll(tnslTsv.getListTwSSStif());
							ast.getTwGJStif().addAll(tnslTsv.getListTwGJStif())
							ast.getTwEAStif().addAll(tnslTsv.getListTwEAStif());
							ast.getTwFAIner().addAll(tnslTsv.getListTwFAIner());
							ast.getTwSSIner().addAll(tnslTsv.getListTwSSIner());
							ast.getTwFAcgOf().addAll(tnslTsv.getListTwFAcgOf());
							ast.getTwSScgOf().addAll(tnslTsv.getListTwSScgOf());
							*/
							/*Iterator<Float> it = tnslTsv.getListHtFract().iterator();
							while(it.hasNext())
								ast.getHtFract().add(it.next());*/
							
							m.setTwrStat(ast);
						}
						else
							throw new IllegalStateException("Uh uh, no content");

					};
				});
				
		tableViewer_1.setInput(tnslTsv);
		tableViewer_1.refresh();
		setDirty(true);
		
	} 

	// see: http://eclipseo.blogspot.it/2013/09/making-your-formeditor-dirty.html
	protected boolean dirty = false;

	protected int currentColumn;
	private CCombo hub_conn;
	
    public boolean isDirty() {
       return dirty;
    }
    
    protected void setDirty(boolean value) {
       dirty = value;
       firePropertyChange(PROP_DIRTY);
       tmpe.editorDirtyStateChanged();
    }
    
	private FasttwrPackage bindFasttwrPackage() {
		return FasttwrPackage.eINSTANCE;
	}

	private BmodesbmiPackage bindBmodesbmiPackage() {
		return BmodesbmiPackage.eINSTANCE;
	}
	
	private BmodestspPackage bindBmodestspPackage() {
		return BmodestspPackage.eINSTANCE;
	}
	
	private void createMenuItem(Menu parent, final TableColumn column) {
		
		  final MenuItem itemName = new MenuItem(parent, SWT.CHECK);
		  itemName.setText(column.getText());
		  itemName.setSelection(column.getResizable());
		  itemName.addSelectionListener(new SelectionAdapter() {
		      @Override
		      public void widgetSelected(SelectionEvent e) {
			      if (itemName.getSelection()) {
			        column.setWidth(150);
			        column.setResizable(true);
			      } else {
			        column.setWidth(0);
			        column.setResizable(false);
			      }
		      }
		  });
	}
		  
	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		managedForm.getForm().setAlwaysShowScrollBars(true);

		form = managedForm.getForm();
		form.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));		
		form.setText("FAST Tower");

		toolkit = managedForm.getToolkit();
		toolkit.decorateFormHeading(form.getForm());

		manager = form.getToolBarManager();

		// see
		// http://devblog.virtage.com/2012/09/snippet-of-the-day-execute-eclipse-command-programmatically/
		
		Action runAction = new Action("Find Modes") { //$NON-NLS-1$
			public void run() {
			}
		};
		runAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("sc.ndt.commons", "/icons/chart_curve.png"));

		/*
		Action linAction = new Action("Linearize") { //$NON-NLS-1$
			public void run() {
			}
		};
		linAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("org.eclipse.jdt.debug.ui", "/icons/full/etool16/run_exc.gif"));

		Action helpAction = new Action("Help") { //$NON-NLS-1$
			public void run() {
			}
		};
		helpAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("org.eclipse.help.ui", "/icons/etool16/help.gif"));
		 */
		
		manager.add(runAction);		// run time-marching simulation
		//manager.add(linAction);		// run model linearization
		//manager.add(helpAction);	// open help
		
		
		form.updateToolBar();

		// control decoration
		fieldDecERR = FieldDecorationRegistry.getDefault().getFieldDecoration(
				FieldDecorationRegistry.DEC_ERROR);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 0;
		managedForm.getForm().getBody().setLayout(gridLayout);
		
		Composite composite_10 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
		GridData gd_composite_10 = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_composite_10.widthHint = 920;
		composite_10.setLayoutData(gd_composite_10);
		managedForm.getToolkit().adapt(composite_10);
		managedForm.getToolkit().paintBordersFor(composite_10);
		composite_10.setLayout(new GridLayout(3, false));
		

		Section sctnOutputList = managedForm.getToolkit().createSection(composite_10, Section.EXPANDED | Section.TITLE_BAR);
		sctnOutputList.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		managedForm.getToolkit().paintBordersFor(sctnOutputList);
		sctnOutputList.setText("Tower Structure");
		
				Composite composite_5 = managedForm.getToolkit().createComposite(sctnOutputList, SWT.NONE);
				managedForm.getToolkit().paintBordersFor(composite_5);
				sctnOutputList.setClient(composite_5);
				composite_5.setLayout(new FillLayout(SWT.HORIZONTAL));
				
				Composite composite = new Composite(composite_5, SWT.NONE);
				managedForm.getToolkit().adapt(composite);
				managedForm.getToolkit().paintBordersFor(composite);
				GridLayout gl_composite = new GridLayout(1, false);
				gl_composite.verticalSpacing = 0;
				gl_composite.horizontalSpacing = 1;
				gl_composite.marginWidth = 0;
				composite.setLayout(gl_composite);
				
				
				
				
				Composite composite_6 = new Composite(composite, SWT.NONE);
				managedForm.getToolkit().adapt(composite_6);
				managedForm.getToolkit().paintBordersFor(composite_6);
				composite_6.setLayout(new RowLayout(SWT.HORIZONTAL));
				
				ImageHyperlink mghprlnkAdd = managedForm.getToolkit().createImageHyperlink(composite_6, SWT.NONE);
				mghprlnkAdd.setImage(ResourceManager.getPluginImage("sc.ndt.commons", "icons/add.png"));
				managedForm.getToolkit().paintBordersFor(mghprlnkAdd);
				mghprlnkAdd.setText("Add");
				mghprlnkAdd.addMouseListener(new MouseListener() {
		
					@Override
					public void mouseDoubleClick(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseDown(MouseEvent e) {
						TowerNodeStruct lsn = tnslTsv.get(tnslTsv.size()-1);
						tnslTsv.add(new TowerNodeStruct(
								lsn.getPropertyFloat("HtAgl"),
								lsn.getPropertyFloat("d"),
								lsn.getPropertyFloat("thick") ));
						
						refresh();
						
					}

					@Override
					public void mouseUp(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				    });
				
				
				
				ImageHyperlink mghprlnkDel = managedForm.getToolkit().createImageHyperlink(composite_6, SWT.NONE);
				mghprlnkDel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseDown(MouseEvent e) {
						IStructuredSelection sel = (IStructuredSelection) tableViewer_1.getSelection();
						if(sel!=null && sel.getFirstElement() instanceof TowerNodeStruct){
							((TowerNodeStructList)tableViewer_1.getInput()).remove( 
									(TowerNodeStruct) sel.getFirstElement());
						}
						tableViewer_1.refresh();
						
					}
				});
				mghprlnkDel.setImage(ResourceManager.getPluginImage("sc.ndt.commons", "icons/cross.png"));
				managedForm.getToolkit().paintBordersFor(mghprlnkDel);
				mghprlnkDel.setText("Del");
				
				Composite composite_7 = new Composite(composite, SWT.NONE);
				composite_7.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
				managedForm.getToolkit().adapt(composite_7);
				managedForm.getToolkit().paintBordersFor(composite_7);
				GridLayout gl_composite_7 = new GridLayout(1, false);
				gl_composite_7.marginTop = 5;
				gl_composite_7.verticalSpacing = 0;
				gl_composite_7.marginWidth = 0;
				gl_composite_7.marginHeight = 0;
				composite_7.setLayout(gl_composite_7);
				
				/*TableColumnLayout ly = new TableColumnLayout();
				composite_7.setLayout(ly);*/
				
				
				
				
				tableViewer_1 = new TableViewer(composite_7, SWT.BORDER | SWT.FULL_SELECTION);
				table = tableViewer_1.getTable();
				GridData gd_table = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
				gd_table.heightHint = 140;
				table.setLayoutData(gd_table);
				table.setLinesVisible(true);
				table.setHeaderVisible(true);
				managedForm.getToolkit().paintBordersFor(table);
				
				tableViewer_1.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						@SuppressWarnings("unused")
						IStructuredSelection selection = (IStructuredSelection) tableViewer_1.getSelection();
						// ... Do something with selection
						int i = 0;  
					}
				});
				table.addListener(SWT.Selection, new Listener() {
					@Override
				    public void handleEvent(Event event) {
				    }
				});
				table.addListener(SWT.MouseDown, new Listener() {
					@Override
				    public void handleEvent(Event event) {
				        Point p = new Point(event.x, event.y);
				        ViewerCell cell = tableViewer_1.getCell(p);
				        int columnIndex = cell.getColumnIndex();
				        currentColumn = columnIndex;
				        //System.out.println(currentColumn);
				    }
				});
				
				TableViewerColumn tabViewColID = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tabColID = tabViewColID.getColumn();
				tabColID.setAlignment(SWT.RIGHT);
				tabColID.setResizable(false);
				tabColID.setWidth(30);
				tabColID.setText("ID");
				tabViewColID.setLabelProvider(new ColumnLabelProvider() {
					  @Override
					  public String getText(Object element) {
						  return Integer.toString(tnslTsv.indexOf( (TowerNodeStruct) element));
					  }
					});
				tabColID.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						
						tableViewer_1.setSorter(new FirstSorter());
						
					}
				});
				
				TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tabColHt = tableViewerColumn.getColumn();
				tabColHt.setAlignment(SWT.RIGHT);
				tabColHt.setWidth(60);
				tabColHt.setText("HtFract");
				tableViewerColumn.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("HtFract") ;
					}
				});
				
				TableViewerColumn tabViewColHagl = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tabColHagl = tabViewColHagl.getColumn();
				tabColHagl.setAlignment(SWT.RIGHT);
				tabColHagl.setWidth(60);
				tabColHagl.setText("Height [m]");
				tabViewColHagl.setLabelProvider(new ColumnLabelProvider() {
					  @Override
					  public String getText(Object element) {
						  return  ((TowerNodeStruct)element).getProperty("HtAgl");
					  }
					});
				tabViewColHagl.setEditingSupport(new HtAglEditingSupport(tableViewer_1));
				
				TableViewerColumn tableViewerColumn_6 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tabColD = tableViewerColumn_6.getColumn();
				tabColD.setAlignment(SWT.RIGHT);
				tabColD.setWidth(60);
				tabColD.setText("d [m]");
				tableViewerColumn_6.setLabelProvider(new ColumnLabelProvider() {
					  @Override
					  public String getText(Object element) {
						  return ((TowerNodeStruct)element).getProperty("d");
					  }
					});
				tableViewerColumn_6.setEditingSupport(new DEditingSupport(tableViewer_1));
				
				
				TableViewerColumn tableViewerColumn_7 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnThickmm = tableViewerColumn_7.getColumn();
				tblclmnThickmm.setAlignment(SWT.RIGHT);
				tblclmnThickmm.setWidth(60);
				tblclmnThickmm.setText("Thick [mm]");
				tableViewerColumn_7.setLabelProvider(new ColumnLabelProvider() {
					  @Override
					  public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("thick");
					  }
					});
				tableViewerColumn_7.setEditingSupport(new ThickEditingSupport(tableViewer_1));
				
				TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnTwistdeg = tableViewerColumn_1.getColumn();
				tblclmnTwistdeg.setAlignment(SWT.RIGHT);
				tblclmnTwistdeg.setWidth(60);
				tblclmnTwistdeg.setText("Density [kg/m]");
				tableViewerColumn_1.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TMassDen");
					}
				});
				
				TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnDrm = tableViewerColumn_2.getColumn();
				tblclmnDrm.setAlignment(SWT.RIGHT);
				tblclmnDrm.setWidth(70);
				tblclmnDrm.setText("FA Stif [Nm2]");
				tableViewerColumn_2.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TwEAStif");
					}
				});
				
				TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnChordm = tableViewerColumn_3.getColumn();
				tblclmnChordm.setAlignment(SWT.RIGHT);
				tblclmnChordm.setWidth(70);
				tblclmnChordm.setText("SS Stif [Nm2]");
				tableViewerColumn_3.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TwSSStif");
					}
				});
				
				TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnId_1 = tableViewerColumn_4.getColumn();
				tblclmnId_1.setAlignment(SWT.RIGHT);
				tblclmnId_1.setWidth(70);
				tblclmnId_1.setText("GJ Stif ");
				tableViewerColumn_4.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TwGJStif");
					}
				});
				
				TableViewerColumn tableViewerColumn_5 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnPrint = tableViewerColumn_5.getColumn();
				tblclmnPrint.setAlignment(SWT.RIGHT);
				tblclmnPrint.setWidth(70);
				tblclmnPrint.setText("EA Stif");
				tableViewerColumn_5.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TwEAStif");
					}
				});
				
				TableViewerColumn tableViewerColumn_8 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnFaIner = tableViewerColumn_8.getColumn();
				tblclmnFaIner.setAlignment(SWT.RIGHT);
				tblclmnFaIner.setWidth(70);
				tblclmnFaIner.setText("FA Iner");
				tableViewerColumn_8.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TwFAIner");
					}
				});
				
				TableViewerColumn tableViewerColumn_9 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnNewColumn = tableViewerColumn_9.getColumn();
				tblclmnNewColumn.setAlignment(SWT.RIGHT);
				tblclmnNewColumn.setWidth(70);
				tblclmnNewColumn.setText("SS iner");
				tableViewerColumn_9.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TwSSIner");
					}
				});
				
				TableViewerColumn tableViewerColumn_10 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnNewColumn_1 = tableViewerColumn_10.getColumn();
				tblclmnNewColumn_1.setAlignment(SWT.RIGHT);
				tblclmnNewColumn_1.setWidth(60);
				tblclmnNewColumn_1.setText("FA cg");
				tableViewerColumn_10.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TwFAcgOf");
					}
				});
				
				TableViewerColumn tableViewerColumn_11 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnNewColumn_2 = tableViewerColumn_11.getColumn();
				tblclmnNewColumn_2.setAlignment(SWT.RIGHT);
				tblclmnNewColumn_2.setWidth(60);
				tblclmnNewColumn_2.setText("SS cg");
				tableViewerColumn_11.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TwSScgOf");
					}
				});
				
				
				// set the content provider
				tableViewer_1.setContentProvider(ArrayContentProvider.getInstance());
				tableViewer_1.setInput(tnslTsv);
		new Label(composite_10, SWT.NONE);
		


		Section sctnNewSection_3 = managedForm.getToolkit().createSection(composite_10, Section.TITLE_BAR);
		sctnNewSection_3.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sctnNewSection_3);
		sctnNewSection_3.setText("Modal Analysis Parameters");
		sctnNewSection_3.setExpanded(true);
		
		
		Composite composite_3 = new Composite(sctnNewSection_3, SWT.NONE);
		managedForm.getToolkit().adapt(composite_3);
		managedForm.getToolkit().paintBordersFor(composite_3);
		sctnNewSection_3.setClient(composite_3);
		GridLayout gl_composite_3 = new GridLayout(2, false);
		gl_composite_3.verticalSpacing = 1;
		composite_3.setLayout(gl_composite_3);
		
		Label labTowerHeigth = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(labTowerHeigth, true, true);
		labTowerHeigth.setText("Tower heigth:");
		
		radius = new Text(composite_3, SWT.BORDER);
		radius.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(radius, true, true);
		
		Label lblNewLabel_4 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_4, true, true);
		lblNewLabel_4.setText("Tower rigid base:");
		
		hub_rad = new Text(composite_3, SWT.BORDER);
		hub_rad.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(hub_rad, true, true);
		
		Label lblNewLabel_7 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_7, true, true);
		lblNewLabel_7.setText("Root constraint type");
		
		hub_conn = new CCombo(composite_3, SWT.NONE);
		hub_conn.setItems(new String[] {"", "CANTILEVERED", "AXIAL+TORSION", "FREE-FREE"});
		hub_conn.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(hub_conn);
		managedForm.getToolkit().paintBordersFor(hub_conn);
		
		Label lblTowershadowHalfWidth = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblTowershadowHalfWidth, true, true);
		lblTowershadowHalfWidth.setText("Modes to be printed");
		
		modepr = new Text(composite_3, SWT.BORDER);
		modepr.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(modepr, true, true);
		
		Button btnCheckButton = new Button(composite_3, SWT.CHECK | SWT.RIGHT);
		btnCheckButton.setAlignment(SWT.RIGHT);
		btnCheckButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		managedForm.getToolkit().adapt(btnCheckButton, true, true);
		btnCheckButton.setText("TAB-delimited output tables");
		
		Button btnCheckButton_1 = new Button(composite_3, SWT.CHECK);
		btnCheckButton_1.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		managedForm.getToolkit().adapt(btnCheckButton_1, true, true);
		btnCheckButton_1.setText("output twist @ mid-nodes");
		
		Label lblNewLabel_8 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_8, true, true);
		lblNewLabel_8.setText("Tower-top mass");
		
		tip_mass = new Text(composite_3, SWT.BORDER);
		tip_mass.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(tip_mass, true, true);
		
		Label lblNewLabel_9 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_9, true, true);
		lblNewLabel_9.setText("CM fore-aft offset");
		
		cm_loc = new Text(composite_3, SWT.BORDER);
		cm_loc.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(cm_loc, true, true);
		
		Label lblCmTopOffset = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblCmTopOffset, true, true);
		lblCmTopOffset.setText("CM top offset");
		
		cm_axial = new Text(composite_3, SWT.BORDER);
		cm_axial.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(cm_axial, true, true);
		
		Composite composite_8 = new Composite(composite_3, SWT.NONE);
		composite_8.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		GridLayout gl_composite_8 = new GridLayout(3, true);
		gl_composite_8.marginWidth = 0;
		composite_8.setLayout(gl_composite_8);
		composite_8.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
		managedForm.getToolkit().adapt(composite_8);
		managedForm.getToolkit().paintBordersFor(composite_8);
		
		ixx_tip = new Text(composite_8, SWT.BORDER);
		ixx_tip.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(ixx_tip, true, true);
		
		ixy_tip = new Text(composite_8, SWT.BORDER);
		ixy_tip.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(ixy_tip, true, true);
		
		izx_tip = new Text(composite_8, SWT.BORDER);
		izx_tip.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(izx_tip, true, true);
		new Label(composite_8, SWT.NONE);
		
		iyy_tip = new Text(composite_8, SWT.BORDER);
		iyy_tip.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(iyy_tip, true, true);
		
		iyz_tip = new Text(composite_8, SWT.BORDER);
		iyz_tip.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(iyz_tip, true, true);
		new Label(composite_8, SWT.NONE);
		new Label(composite_8, SWT.NONE);
		
		izz_tip = new Text(composite_8, SWT.BORDER);
		izz_tip.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(izz_tip, true, true);
		new Label(composite_3, SWT.NONE);
		new Label(composite_3, SWT.NONE);
		
		ImageHyperlink mghprlnkLaunchABmodes = managedForm.getToolkit().createImageHyperlink(sctnNewSection_3, SWT.NONE);
		mghprlnkLaunchABmodes.setImage(ResourceManager.getPluginImage("sc.ndt.editor.fast.twr.ui", "icons/calculator.png"));
		managedForm.getToolkit().paintBordersFor(mghprlnkLaunchABmodes);
		sctnNewSection_3.setDescriptionControl(mghprlnkLaunchABmodes);
		mghprlnkLaunchABmodes.setText("Launch a BModes tower analisys");
		
		Composite composite_2 = new Composite(composite_10, SWT.NONE);
		composite_2.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
		managedForm.getToolkit().adapt(composite_2);
		managedForm.getToolkit().paintBordersFor(composite_2);
		GridLayout gl_composite_2 = new GridLayout(1, false);
		gl_composite_2.marginWidth = 0;
		gl_composite_2.marginHeight = 0;
		gl_composite_2.horizontalSpacing = 0;
		composite_2.setLayout(gl_composite_2);
		
		
		
		
		Section sctnNewSection = managedForm.getToolkit().createSection(composite_2, Section.TITLE_BAR);
		sctnNewSection.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sctnNewSection);
		sctnNewSection.setText("Bending Properties Tuner");
		
		Composite composite_1 = new Composite(sctnNewSection, SWT.NONE);
		sctnNewSection.setClient(composite_1);
		managedForm.getToolkit().adapt(composite_1);
		managedForm.getToolkit().paintBordersFor(composite_1);
		GridLayout gl_composite_1 = new GridLayout(3, false);
		gl_composite_1.verticalSpacing = 1;
		composite_1.setLayout(gl_composite_1);
		new Label(composite_1, SWT.NONE);
		
		Label lblst = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblst, true, true);
		lblst.setText("1st");
		
		Label lblnd = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblnd, true, true);
		lblnd.setText("2nd");
		
		Label lblNewLabel = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Tower fore-aft mode damping ratio:");
		
		TwrFADmp1 = new Spinner(composite_1, SWT.BORDER | SWT.CENTER);
		TwrFADmp1.setPageIncrement(100);
		TwrFADmp1.setIncrement(10);
		TwrFADmp1.setMaximum(1000);
		TwrFADmp1.setDigits(2);
		GridData gd_TwrFADmp1 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_TwrFADmp1.widthHint = 40;
		TwrFADmp1.setLayoutData(gd_TwrFADmp1);
		
		TwrFADmp2 = new Spinner(composite_1, SWT.BORDER | SWT.CENTER);
		TwrFADmp2.setPageIncrement(100);
		TwrFADmp2.setMaximum(1000);
		TwrFADmp2.setIncrement(10);
		TwrFADmp2.setDigits(2);
		TwrFADmp2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblNewLabel_2 = new Label(composite_1, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblNewLabel_2, true, true);
		lblNewLabel_2.setText("Tower side-side mode damping ratio:");
		
		TwrSSDmp1 = new Spinner(composite_1, SWT.BORDER | SWT.CENTER);
		TwrSSDmp1.setPageIncrement(100);
		TwrSSDmp1.setIncrement(10);
		TwrSSDmp1.setMaximum(1000);
		TwrSSDmp1.setDigits(2);
		TwrSSDmp1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(TwrSSDmp1, true, true);
		
		TwrSSDmp2 = new Spinner(composite_1, SWT.BORDER | SWT.CENTER);
		TwrSSDmp2.setPageIncrement(100);
		TwrSSDmp2.setMaximum(1000);
		TwrSSDmp2.setIncrement(10);
		TwrSSDmp2.setDigits(2);
		TwrSSDmp2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(TwrSSDmp2, true, true);
		
		Label lblNewLabel_3 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_3, true, true);
		lblNewLabel_3.setText("Tower 1st fore-aft mode tuner:");
		
		FAStTunr1 = new Spinner(composite_1, SWT.BORDER | SWT.CENTER);
		FAStTunr1.setPageIncrement(100);
		FAStTunr1.setMaximum(1000);
		FAStTunr1.setIncrement(10);
		FAStTunr1.setDigits(2);
		FAStTunr1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(FAStTunr1, true, true);
		
		FAStTunr2 = new Spinner(composite_1, SWT.BORDER | SWT.CENTER);
		FAStTunr2.setPageIncrement(100);
		FAStTunr2.setMaximum(1000);
		FAStTunr2.setIncrement(10);
		FAStTunr2.setDigits(2);
		FAStTunr2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(FAStTunr2, true, true);
		
		Label lblNewLabel_5 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_5, true, true);
		lblNewLabel_5.setText("Tower 1st side-side mode tuner:");
		
		SSStTunr1 = new Spinner(composite_1, SWT.BORDER | SWT.CENTER);
		SSStTunr1.setPageIncrement(100);
		SSStTunr1.setMaximum(1000);
		SSStTunr1.setIncrement(10);
		SSStTunr1.setDigits(2);
		SSStTunr1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(SSStTunr1, true, true);
		
		SSStTunr2 = new Spinner(composite_1, SWT.BORDER | SWT.CENTER);
		SSStTunr2.setDigits(2);
		SSStTunr2.setPageIncrement(100);
		SSStTunr2.setMaximum(1000);
		SSStTunr2.setIncrement(10);
		SSStTunr2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(SSStTunr2, true, true);
		
		Section sctnNewSection_2 = managedForm.getToolkit().createSection(composite_2, Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnNewSection_2);
		sctnNewSection_2.setText("Scaling Factors");
		sctnNewSection_2.setExpanded(true);
		
		Composite composite_9 = managedForm.getToolkit().createComposite(sctnNewSection_2, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite_9);
		sctnNewSection_2.setClient(composite_9);
		GridLayout gl_composite_9 = new GridLayout(2, false);
		gl_composite_9.verticalSpacing = 1;
		composite_9.setLayout(gl_composite_9);
		
		Label lblNewLabel_10 = managedForm.getToolkit().createLabel(composite_9, "Mass density multiplier:", SWT.NONE);
		
		sec_mass_mult = new Spinner(composite_9, SWT.BORDER);
		sec_mass_mult.setDigits(2);
		sec_mass_mult.setPageIncrement(100);
		sec_mass_mult.setMaximum(1000);
		sec_mass_mult.setIncrement(10);
		GridData gd_sec_mass_mult = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_sec_mass_mult.widthHint = 40;
		sec_mass_mult.setLayoutData(gd_sec_mass_mult);
		
		Label lblNewLabel_11 = managedForm.getToolkit().createLabel(composite_9, "Fore-aft inertia multiplier:", SWT.NONE);
		
		flp_iner_mult = new Spinner(composite_9, SWT.BORDER);
		flp_iner_mult.setPageIncrement(100);
		flp_iner_mult.setMaximum(1000);
		flp_iner_mult.setIncrement(10);
		flp_iner_mult.setDigits(2);
		flp_iner_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblNewLabel_12 = managedForm.getToolkit().createLabel(composite_9, "Side-side inertia multiplier:", SWT.NONE);
		
		lag_iner_mult = new Spinner(composite_9, SWT.BORDER);
		lag_iner_mult.setPageIncrement(100);
		lag_iner_mult.setMaximum(1000);
		lag_iner_mult.setIncrement(10);
		lag_iner_mult.setDigits(2);
		lag_iner_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblNewLabel_13 = managedForm.getToolkit().createLabel(composite_9, "Fore-aft bending stiffness multiplier:", SWT.NONE);
		
		flp_stff_mult = new Spinner(composite_9, SWT.BORDER);
		flp_stff_mult.setPageIncrement(100);
		flp_stff_mult.setMaximum(1000);
		flp_stff_mult.setIncrement(10);
		flp_stff_mult.setDigits(2);
		flp_stff_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblNewLabel_14 = managedForm.getToolkit().createLabel(composite_9, "Side-side bending stiffness multiplier:", SWT.NONE);
		
		edge_stff_mult = new Spinner(composite_9, SWT.BORDER);
		edge_stff_mult.setPageIncrement(100);
		edge_stff_mult.setMaximum(1000);
		edge_stff_mult.setIncrement(10);
		edge_stff_mult.setDigits(2);
		edge_stff_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblNewLabel_15 = managedForm.getToolkit().createLabel(composite_9, "Torsion stiffness multiplier:", SWT.NONE);
		
		tor_stff_mult = new Spinner(composite_9, SWT.BORDER);
		tor_stff_mult.setPageIncrement(100);
		tor_stff_mult.setMaximum(1000);
		tor_stff_mult.setIncrement(10);
		tor_stff_mult.setDigits(2);
		tor_stff_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblNewLabel_16 = managedForm.getToolkit().createLabel(composite_9, "Axial stiffness multiplier:", SWT.NONE);
		
		axial_stff_mult = new Spinner(composite_9, SWT.BORDER);
		axial_stff_mult.setPageIncrement(100);
		axial_stff_mult.setMaximum(1000);
		axial_stff_mult.setIncrement(10);
		axial_stff_mult.setDigits(2);
		axial_stff_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblNewLabel_17 = managedForm.getToolkit().createLabel(composite_9, "CG offset multiplier:", SWT.NONE);
		
		cg_offst_mult = new Spinner(composite_9, SWT.BORDER);
		cg_offst_mult.setPageIncrement(100);
		cg_offst_mult.setDigits(2);
		cg_offst_mult.setIncrement(10);
		cg_offst_mult.setMaximum(1000);
		cg_offst_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblNewLabel_18 = managedForm.getToolkit().createLabel(composite_9, "Shear center multiplier:", SWT.NONE);
		
		sc_offst_mult = new Spinner(composite_9, SWT.BORDER);
		sc_offst_mult.setPageIncrement(100);
		sc_offst_mult.setMaximum(1000);
		sc_offst_mult.setIncrement(10);
		sc_offst_mult.setDigits(2);
		sc_offst_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblNewLabel_19 = managedForm.getToolkit().createLabel(composite_9, "Tension center multiplier:", SWT.NONE);
		
		tc_offst_mult = new Spinner(composite_9, SWT.BORDER);
		tc_offst_mult.setPageIncrement(100);
		tc_offst_mult.setDigits(2);
		tc_offst_mult.setMaximum(1000);
		tc_offst_mult.setIncrement(10);
		tc_offst_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Composite composite_4 = managedForm.getToolkit().createComposite(sctnNewSection_2, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite_4);
		sctnNewSection_2.setDescriptionControl(composite_4);
		GridLayout gl_composite_4 = new GridLayout(2, false);
		gl_composite_4.marginHeight = 0;
		gl_composite_4.marginWidth = 0;
		gl_composite_4.verticalSpacing = 0;
		composite_4.setLayout(gl_composite_4);
		
		Label lblNewLabel_21 = managedForm.getToolkit().createLabel(composite_4, "New Label", SWT.NONE);
		GridData gd_lblNewLabel_21 = new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1);
		gd_lblNewLabel_21.verticalIndent = 3;
		lblNewLabel_21.setLayoutData(gd_lblNewLabel_21);
		lblNewLabel_21.setImage(ResourceManager.getPluginImage("sc.ndt.commons", "icons/text_padding_left.png"));
		
		CLabel lblNewLabel_20 = new CLabel(composite_4, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_20);
		managedForm.getToolkit().paintBordersFor(lblNewLabel_20);
		lblNewLabel_20.setText("Fine tune the multipliers to fit tower's real \nproperties and experimental data.");


		// DATABINDING
		activateBinding();
			
	}

	private void activateBinding() {
		
		m_bindingContext = new XtextDataBindingContext();
		if(docBmi!=null)
			initXDB_BModesbmi (m_bindingContext);
		initXDB_TowerParameters	(m_bindingContext); // generate error

		
	}
	
	/*private void deactivateBinding() {
		if(m_bindingContext!=null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
	}*/
	
	protected DataBindingContext initXDB_BModesbmi (DataBindingContext bindingContext) {

		// connection type
		IObservableValue ow = WidgetProperties.singleSelectionIndex().observe(hub_conn);
		IObservableValue mow = XtextProperties.value(
		FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_HubConn(), bindBmodesbmiPackage().getiHubConn_Value())).observe(docBmi);
		bindingContext.bindValue(ow, mow, null, null);
				
				
		IObservableValue observeTextATolerObserveWidget = WidgetProperties.selection().observe(sec_mass_mult);
		IObservableValue modelValueObserveValueA = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_SecMasMult(), bindBmodesbmiPackage().getnSecMasMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextATolerObserveWidget, modelValueObserveValueA, null, null);
		
		IObservableValue observeHHObserveWidget = WidgetProperties.selection().observe(flp_iner_mult);
		IObservableValue modelValueObserveValueB = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_FlpInrMult(), bindBmodesbmiPackage().getnFlpInrMult_Value()) ).observe(docBmi);
		bindingContext.bindValue(observeHHObserveWidget, modelValueObserveValueB, null, null);
		
		IObservableValue observeTextNumFoilObserveWidget = WidgetProperties.selection().observe(lag_iner_mult);
		IObservableValue modelValueObserveValueC = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_LagInrMult(), bindBmodesbmiPackage().getnLagInrMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextNumFoilObserveWidget, modelValueObserveValueC, null, null);

		IObservableValue observeTextBldNodesObserveWidget = WidgetProperties.selection().observe(flp_stff_mult);
		IObservableValue modelValueObserveValue_33 = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_FlpstfMult(), bindBmodesbmiPackage().getnFlpstfMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextBldNodesObserveWidget, modelValueObserveValue_33, null, null);
		
		IObservableValue observeTextTwrShadObserveWidget = WidgetProperties.selection().observe(edge_stff_mult);
		IObservableValue modelValueObserveValue_34 = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_EdgStfMult(), bindBmodesbmiPackage().getnEdgStfMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextTwrShadObserveWidget, modelValueObserveValue_34, null, null);

		IObservableValue observeTextShadHWidObserveWidget = WidgetProperties.selection().observe(tor_stff_mult);
		IObservableValue modelValueObserveValue_ShadHWid = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_TorStfMult(), bindBmodesbmiPackage().getnTorStfMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextShadHWidObserveWidget, modelValueObserveValue_ShadHWid, null, null);

		IObservableValue observeTextTShadRefPtObserveWidget = WidgetProperties.selection().observe(axial_stff_mult);
		IObservableValue modelValueObserveValue_TShadRefPt = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_AxiStfMult(), bindBmodesbmiPackage().getnAxiStfMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextTShadRefPtObserveWidget, modelValueObserveValue_TShadRefPt, null, null);

		IObservableValue observeTextRhoObserveWidget = WidgetProperties.selection().observe(cg_offst_mult);
		IObservableValue modelValueObserveValue_Rho = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_CgOffsMult(), bindBmodesbmiPackage().getnCgOffsMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextRhoObserveWidget, modelValueObserveValue_Rho, null, null);

		IObservableValue observeTextKinViscObserveWidget = WidgetProperties.selection().observe(sc_offst_mult);
		IObservableValue modelValueObserveValue_KinVisc = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_ScOffsMult(), bindBmodesbmiPackage().getnScOffsMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextKinViscObserveWidget, modelValueObserveValue_KinVisc, null, null);

		IObservableValue observeTextDTAeroObserveWidget = WidgetProperties.selection().observe(tc_offst_mult);
		IObservableValue modelValueObserveValue_DTAero = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_TcOffsMult(), bindBmodesbmiPackage().getnTcOffsMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextDTAeroObserveWidget, modelValueObserveValue_DTAero, null, null);

		// bmi
		IObservableValue observeTextATolerObserveWidgetz0 = WidgetProperties.text(SWT.Modify).observe(radius);
		IObservableValue modelValueObserveValueAz0 = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_Radius(), bindBmodesbmiPackage().getnRadius_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextATolerObserveWidgetz0, modelValueObserveValueAz0, null, null);

		IObservableValue observeTextB1 = WidgetProperties.text(SWT.Modify).observe(hub_rad);
		IObservableValue modelValueB1 = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_HubRad(), bindBmodesbmiPackage().getnHubRad_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextB1, modelValueB1, null, null);

		IObservableValue observeTextB2 = WidgetProperties.text(SWT.Modify).observe(tip_mass);
		IObservableValue modelValueB2 = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_TipMass(), bindBmodesbmiPackage().getnTipMass_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextB2, modelValueB2, null, null);

		IObservableValue observeTextB3 = WidgetProperties.text(SWT.Modify).observe(modepr);
		IObservableValue modelValueB3 = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_ModePr(), bindBmodesbmiPackage().getiModePr_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextB3, modelValueB3, null, null);

		IObservableValue observeTextB4 = WidgetProperties.text(SWT.Modify).observe(cm_loc);
		IObservableValue modelValueB4 = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_CmLoc(), bindBmodesbmiPackage().getnCmLoc_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextB4, modelValueB4, null, null);

		IObservableValue observeTextB5 = WidgetProperties.text(SWT.Modify).observe(cm_axial);
		IObservableValue modelValueB5 = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_CmAxial(), bindBmodesbmiPackage().getnCmAxial_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextB5, modelValueB5, null, null);


		IObservableValue observeTextB6 = WidgetProperties.text(SWT.Modify).observe(ixx_tip);
		IObservableValue modelValueB6 = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_IxxTip(), bindBmodesbmiPackage().getnIxxTip_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextB6, modelValueB6, null, null);

		IObservableValue observeTextc6 = WidgetProperties.text(SWT.Modify).observe(iyy_tip);
		IObservableValue modelValuec6 = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_IyyTip(), bindBmodesbmiPackage().getnIyyTip_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextc6, modelValuec6, null, null);

		IObservableValue observeTextc7 = WidgetProperties.text(SWT.Modify).observe(izz_tip);
		IObservableValue modelValuec7 = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_IzzTip(), bindBmodesbmiPackage().getnIzzTip_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextc7, modelValuec7, null, null);

	
		IObservableValue observeTextB7 = WidgetProperties.text(SWT.Modify).observe(ixy_tip);
		IObservableValue modelValueB7 = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_IxyTip(), bindBmodesbmiPackage().getnIxyTip_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextB7, modelValueB7, null, null);

		IObservableValue observeTextB8 = WidgetProperties.text(SWT.Modify).observe(izx_tip);
		IObservableValue modelValueB8 = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_IzxTip(), bindBmodesbmiPackage().getnIzxTip_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextB8, modelValueB8, null, null);

		bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observe(iyz_tip), 
				XtextProperties.value(FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_IyzTip(), bindBmodesbmiPackage().getnIyzTip_Value())).observe(docBmi), 
				null, null);



		return bindingContext;
	}
	
	
	
	
	protected DataBindingContext initXDB_TowerParameters (DataBindingContext bindingContext) {
		
		UpdateValueStrategy stratI2F = new UpdateValueStrategy();
		stratI2F.setConverter(new IntegerToFloatConverter());
		UpdateValueStrategy stratF2I = new UpdateValueStrategy();
		stratF2I.setConverter(new FloatToIntegerConverter());
		
		// dampers
		IObservableValue observeTextATolerObserveWidget = WidgetProperties.selection().observe(TwrFADmp1);
		IObservableValue modelValueObserveValueA = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_BldFlDmp1(), bindFasttwrPackage().getnTwrFADmp1_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidget, modelValueObserveValueA, stratI2F, stratF2I);
		
		IObservableValue observeTextATolerObserveWidget2 = WidgetProperties.selection().observe(TwrFADmp2);
		IObservableValue modelValueObserveValueA2 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_BldFlDmp2(), bindFasttwrPackage().getnTwrFADmp2_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidget2, modelValueObserveValueA2, stratI2F, stratF2I);
		
		IObservableValue observeTextATolerObserveWidget3 = WidgetProperties.selection().observe(TwrSSDmp1);
		IObservableValue modelValueObserveValueA3 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_BldEdDmp1(), bindFasttwrPackage().getnTwrSSDmp1_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidget3, modelValueObserveValueA3, stratI2F, stratF2I);
		
		IObservableValue observeTextATolerObserveWidget4 = WidgetProperties.selection().observe(TwrSSDmp2);
		IObservableValue modelValueObserveValueA4 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_BldEdDmp2(), bindFasttwrPackage().getnTwrSSDmp2_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidget4, modelValueObserveValueA4, stratI2F, stratF2I);
		
		
		// tuners
		IObservableValue observeTextATolerObserveWidgetz1 = WidgetProperties.selection().observe(FAStTunr1);
		IObservableValue modelValueObserveValueAz1 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_FAStTunr1(), bindFasttwrPackage().getnFAStTunr1_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidgetz1, modelValueObserveValueAz1, stratI2F, stratF2I);
		
		IObservableValue observeTextATolerObserveWidgetz2 = WidgetProperties.selection().observe(FAStTunr2);
		IObservableValue modelValueObserveValueAz2 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_FAStTunr2(), bindFasttwrPackage().getnFAStTunr2_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidgetz2, modelValueObserveValueAz2, stratI2F, stratF2I);
		
		IObservableValue observeTextATolerObserveWidgetz3 = WidgetProperties.selection().observe(SSStTunr1);
		IObservableValue modelValueObserveValueAz3 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_SSStTunr1(), bindFasttwrPackage().getnSSStTunr1_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidgetz3, modelValueObserveValueAz3, stratI2F, stratF2I);
		
		IObservableValue observeTextATolerObserveWidgetz4 = WidgetProperties.selection().observe(SSStTunr2);
		IObservableValue modelValueObserveValueAz4 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_SSStTunr2(), bindFasttwrPackage().getnSSStTunr2_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidgetz4, modelValueObserveValueAz4, stratI2F, stratF2I);
		
		return bindingContext;
	}
		
	public IContentOutlinePage getContentOutline() {
		// TODO Auto-generated method stub
		return null;
	}

	// convert and scale (factor 100)
	public class IntegerToFloatConverter extends Converter {
		public IntegerToFloatConverter() {
			this(Integer.class, Float.class);
		}
		public IntegerToFloatConverter(Object fromType, Object toType) {
			super(fromType, toType);
		}
		@Override
		public Object convert(Object fromObject) {
			Integer from = (Integer) fromObject;
			Float result = new Float(0);
			try{
				result = from/100f;
			} catch(Exception ex){
				//do nothing
			}
			return result;
		}
	}

	public class FloatToIntegerConverter extends Converter {
		public FloatToIntegerConverter() {
			this(Float.class, Integer.class);
		}
		public FloatToIntegerConverter(Object fromType, Object toType) {
			super(fromType, toType);
		}
		@Override
		public Object convert(Object fromObject) {
			Float from = (Float) fromObject;
			Integer result = new Integer(0);
			try{
				from = from*100;
				result = from.intValue();
			} catch(Exception ex){
				//do nothing
			}
			return result;
		}
	}

	
	class HtAglEditingSupport extends EditingSupport {

		private final TableViewer viewer;

		public HtAglEditingSupport(TableViewer viewer) {
			super(viewer);
			this.viewer = viewer;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			return new TextCellEditor(viewer.getTable());
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {
			return ((TowerNodeStruct) element).getProperty("HtAgl");
		}

		@Override
		protected void setValue(Object element, Object userInputValue) {

			// update node
			TowerNodeStruct tn = ((TowerNodeStruct) element);
			tn.setProperty("HtAgl", Float.valueOf((String) userInputValue));
			tn.calcNodeStruct();
			
			refresh();
			
		}
	}
		 
	class DEditingSupport extends EditingSupport {

		  private final TableViewer viewer;

		  public DEditingSupport(TableViewer viewer) {
		    super(viewer);
		    this.viewer = viewer;
		  }

		  @Override
		  protected CellEditor getCellEditor(Object element) {
		    return new TextCellEditor(viewer.getTable());
		  }

		  @Override
		  protected boolean canEdit(Object element) {
		    return true;
		  }

		  @Override
		  protected Object getValue(Object element) {
		    return ((TowerNodeStruct) element).getProperty("d");
		  }

		  @Override
		  protected void setValue(Object element, Object userInputValue) {
			  	// update node
				TowerNodeStruct tn = ((TowerNodeStruct) element);
				tn.setProperty("d", Float.valueOf((String) userInputValue));
				tn.calcNodeStruct();

				refresh();
				
		  }
		  
	}
	
	class ThickEditingSupport extends EditingSupport {

		  private final TableViewer viewer;

		  public ThickEditingSupport(TableViewer viewer) {
		    super(viewer);
		    this.viewer = viewer;
		  }

		  @Override
		  protected CellEditor getCellEditor(Object element) {
		    return new TextCellEditor(viewer.getTable());
		  }

		  @Override
		  protected boolean canEdit(Object element) {
		    return true;
		  }

		  @Override
		  protected Object getValue(Object element) {
		    return ((TowerNodeStruct) element).getProperty("thick");
		  }

		  @Override
		  protected void setValue(Object element, Object userInputValue) {
			// update node
				TowerNodeStruct tn = ((TowerNodeStruct) element);
				tn.setProperty("thick", (String) userInputValue, "mm");
				tn.calcNodeStruct();
				
				refresh();
				
		  }
		  
	}
	
	private static class FirstSorter extends ViewerSorter {
		public int compare(Viewer viewer, Object e1, Object e2) {
			// TODO:  do nothing for now? 0 means equal
			return 0;
		}
	}
}

