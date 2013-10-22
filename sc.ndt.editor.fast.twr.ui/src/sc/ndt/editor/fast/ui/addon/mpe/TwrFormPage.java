package sc.ndt.editor.fast.ui.addon.mpe;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
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
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.ViewerCell;
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
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
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
import sc.ndt.editor.bmodesbmi.BmodesbmiPackage;
import sc.ndt.editor.bmodesbmi.ModelBmodesbmi;
import sc.ndt.editor.bmodestsp.BmodestspPackage;
import sc.ndt.editor.bmodestsp.ModelBmodestsp;
import sc.ndt.editor.bmodestsp.aSec;
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

import ch.vorburger.xtext.databinding.XtextDataBindingContext;
import ch.vorburger.xtext.databinding.XtextProperties;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.events.MouseAdapter;



public class TwrFormPage extends FormPage {

	private DataBindingContext m_bindingContext;

	private ScrolledForm form;
	private FormToolkit toolkit;
	private IToolBarManager manager;

	public URI uri;
	private Text FAStTunr2;
	private Text radius;
	private Text hub_rad;
	private Text modepr;


	private TowerNodeStructList tnslTwr 	= new TowerNodeStructList(); // from tower.twr file
	private TowerNodeStructList tnslTsv 	= new TowerNodeStructList(); // from section .tsv file
	private TowerNodeStructList tnslTsp 	= new TowerNodeStructList(); // from bmodes .tsp file
	
	private ModelFasttwr 	mTwr;
	private ModelBmodestsp 	mTsp;
	
	private Table table;
	private TableViewer tableViewer_1;

	private Menu contextMenu;
	private Text TwrFADmp1;
	private Text TwrFADmp2;

	private FieldDecoration fieldDecERR;
	private Text TwrSSDmp1;
	private Text TwrSSDmp2;
	private Text FAStTunr1;
	private Text SSStTunr2;
	private Text SSStTunr1;
	private Text tip_mass;
	private Text cm_loc;
	private Text cm_axial;
	private Text ixx_tip;
	private Text ixy_tip;
	private Text izx_tip;
	private Text iyy_tip;
	private Text iyz_tip;
	private Text izz_tip;
	private Text sec_mass_mult;
	private Text flp_iner_mult;
	private Text lag_iner_mult;
	private Text flp_stff_mult;
	private Text edge_stff_mult;
	private Text tor_stff_mult;
	private Text axial_stff_mult;
	private Text cg_offst_mult;
	private Text sc_offst_mult;
	private Text tc_offst_mult;
	
	TwrMultiPageEditor tmpe;

	private IXtextDocument docBmi;
	private IXtextDocument docTwr;
	private IXtextDocument docTsp;

	private aTwrStat ast;

	private aSec asc;
	
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

		if(getEditor() instanceof IXtextFormEditor) {
			IXtextFormEditor 	xfe = (IXtextFormEditor)getEditor();
			
			XtextEditor 		eTwr 	= xfe.getXtextEditor("twr");
			mTwr = (ModelFasttwr) xfe.getModelFromXtextEditor(eTwr);
			docTwr = eTwr.getDocument();
			
			XtextEditor eBmi = xfe.getXtextEditor("bmi");
			docBmi = eBmi.getDocument();
			
			XtextEditor eTsp = xfe.getXtextEditor("tsp");
			mTsp = (ModelBmodestsp) xfe.getModelFromXtextEditor(eTsp);
			docTsp = eTsp.getDocument();
			
			// il file .tsv non lo visualizzo ma viene caricato headless e utilizzato
			// nel form
		}
		
		if(getEditor() instanceof TwrMultiPageEditor) {
			tmpe 	= (TwrMultiPageEditor)getEditor();
			tnslTsv = tmpe.fileTwrTsv.getTower();
			
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
		tableViewer_1.setInput(tnslTsv);

		// when modify table notify the document
		docTwr.modify(new IUnitOfWork.Void<XtextResource>() {
			@Override
			public void process(XtextResource resource) throws Exception {
				ModelFasttwr m = (ModelFasttwr) resource.getContents().get(0);
				if (m != null && ast != null){
					
					m.getNTwInpSt().setValue(tnslTsv.size());
					
					ast.getHtFract().clear();
					ast.getHtFract().addAll(tnslTsv.getListHtFract());
					ast.getTMassDen().clear();
					ast.getTMassDen().addAll(tnslTsv.getListTMassDen());
					ast.getTwFAStif().clear();
					ast.getTwFAStif().addAll(tnslTsv.getListTwFAStif());
					ast.getTwSSStif().clear();
					ast.getTwSSStif().addAll(tnslTsv.getListTwSSStif());
					ast.getTwGJStif().clear();
					ast.getTwGJStif().addAll(tnslTsv.getListTwGJStif());
					ast.getTwEAStif().clear();
					ast.getTwEAStif().addAll(tnslTsv.getListTwEAStif());
					ast.getTwFAIner().clear();
					ast.getTwFAIner().addAll(tnslTsv.getListTwFAIner());
					ast.getTwSSIner().clear();
					ast.getTwSSIner().addAll(tnslTsv.getListTwSSIner());
					ast.getTwFAcgOf().clear();
					ast.getTwFAcgOf().addAll(tnslTsv.getListTwFAcgOf());
					ast.getTwSScgOf().clear();
					ast.getTwSScgOf().addAll(tnslTsv.getListTwSScgOf());
					
					m.setTwrStat(ast);
				}
				else
					throw new IllegalStateException("Uh uh, no content");

			};
		});
		
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

		tableViewer_1.refresh();
		setDirty(true);
		
	} 

	// see: http://eclipseo.blogspot.it/2013/09/making-your-formeditor-dirty.html
	protected boolean dirty = false;
	
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
		FillLayout fillLayout = new FillLayout(SWT.HORIZONTAL);
		fillLayout.marginHeight = 5;
		managedForm.getForm().getBody().setLayout(fillLayout);
		
		SashForm sashForm = new SashForm(managedForm.getForm().getBody(), SWT.VERTICAL);
		managedForm.getToolkit().adapt(sashForm);
		managedForm.getToolkit().paintBordersFor(sashForm);
		
		Composite composite_14 = new Composite(sashForm, SWT.NONE);
		managedForm.getToolkit().adapt(composite_14);
		managedForm.getToolkit().paintBordersFor(composite_14);
		GridLayout gl_composite_14 = new GridLayout(1, false);
		gl_composite_14.marginHeight = 0;
		composite_14.setLayout(gl_composite_14);
		
		
		Composite composite_2 = new Composite(sashForm, SWT.NONE);
		managedForm.getToolkit().adapt(composite_2);
		managedForm.getToolkit().paintBordersFor(composite_2);
		FillLayout fl_composite_2 = new FillLayout(SWT.HORIZONTAL);
		fl_composite_2.spacing = 5;
		fl_composite_2.marginWidth = 5;
		composite_2.setLayout(fl_composite_2);
		
		
		
		
		Section sctnNewSection = managedForm.getToolkit().createSection(composite_2, Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnNewSection);
		sctnNewSection.setText("Tower Parameters");
		sctnNewSection.setExpanded(true);
		
		Composite composite_1 = new Composite(sctnNewSection, SWT.NONE);
		sctnNewSection.setClient(composite_1);
		managedForm.getToolkit().adapt(composite_1);
		managedForm.getToolkit().paintBordersFor(composite_1);
		GridLayout gl_composite_1 = new GridLayout(2, false);
		gl_composite_1.verticalSpacing = 1;
		composite_1.setLayout(gl_composite_1);
		
		Label lblNewLabel = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Tower 1st fore-aft mode damping ratio:");
		
		TwrFADmp1 = new Text(composite_1, SWT.BORDER);
		GridData gd_TwrFADmp1 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_TwrFADmp1.widthHint = 40;
		TwrFADmp1.setLayoutData(gd_TwrFADmp1);
		
		Label lblNewLabel_1 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText("Tower 2st fore-aft mode damping ratio:");
		
		TwrFADmp2 = new Text(composite_1, SWT.BORDER);
		TwrFADmp2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblNewLabel_2 = new Label(composite_1, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblNewLabel_2, true, true);
		lblNewLabel_2.setText("Tower 1st side-side mode damping ratio:");
		
		TwrSSDmp1 = new Text(composite_1, SWT.BORDER);
		TwrSSDmp1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(TwrSSDmp1, true, true);
		
		Label lblInflowModel = managedForm.getToolkit().createLabel(composite_1, "Tower 2st side-side mode damping ratio:", SWT.NONE);
		lblInflowModel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		TwrSSDmp2 = new Text(composite_1, SWT.BORDER);
		TwrSSDmp2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(TwrSSDmp2, true, true);
		
		Label lblNewLabel_3 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_3, true, true);
		lblNewLabel_3.setText("Tower 1st fore-aft mode tuner:");
		
		FAStTunr1 = new Text(composite_1, SWT.BORDER);
		FAStTunr1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(FAStTunr1, true, true);
		
		Label lblInductionfactorTolerance = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblInductionfactorTolerance, true, true);
		lblInductionfactorTolerance.setText("Tower 2nd fore-aft mode tuner:");
		
		FAStTunr2 = new Text(composite_1, SWT.BORDER);
		FAStTunr2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(FAStTunr2, true, true);
		
		Label lblNewLabel_5 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_5, true, true);
		lblNewLabel_5.setText("Tower 1st side-side mode tuner:");
		
		SSStTunr1 = new Text(composite_1, SWT.BORDER);
		SSStTunr1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(SSStTunr1, true, true);
		
		Label lblNewLabel_6 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_6, true, true);
		lblNewLabel_6.setText("Tower 2nd side-side mode tuner:");
		
		SSStTunr2 = new Text(composite_1, SWT.BORDER);
		SSStTunr2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(SSStTunr2, true, true);
		
		Section sctnNewSection_2 = managedForm.getToolkit().createSection(composite_2, Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnNewSection_2);
		sctnNewSection_2.setText("Scaling factors");
		sctnNewSection_2.setExpanded(true);
		
		Composite composite_9 = managedForm.getToolkit().createComposite(sctnNewSection_2, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite_9);
		sctnNewSection_2.setClient(composite_9);
		GridLayout gl_composite_9 = new GridLayout(2, false);
		gl_composite_9.verticalSpacing = 1;
		composite_9.setLayout(gl_composite_9);
		
		Label lblNewLabel_10 = managedForm.getToolkit().createLabel(composite_9, "Mass density multiplier:", SWT.NONE);
		
		sec_mass_mult = new Text(composite_9, SWT.BORDER);
		GridData gd_sec_mass_mult = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_sec_mass_mult.widthHint = 40;
		sec_mass_mult.setLayoutData(gd_sec_mass_mult);
		
		Label lblNewLabel_11 = managedForm.getToolkit().createLabel(composite_9, "Fore-aft inertia multiplier:", SWT.NONE);
		
		flp_iner_mult = new Text(composite_9, SWT.BORDER);
		flp_iner_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_12 = managedForm.getToolkit().createLabel(composite_9, "Side-side inertia multiplier:", SWT.NONE);
		
		lag_iner_mult = new Text(composite_9, SWT.BORDER);
		lag_iner_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_13 = managedForm.getToolkit().createLabel(composite_9, "Fore-aft bending stiffness multiplier:", SWT.NONE);
		
		flp_stff_mult = new Text(composite_9, SWT.BORDER);
		flp_stff_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_14 = managedForm.getToolkit().createLabel(composite_9, "Side-side bending stiffness multiplier:", SWT.NONE);
		
		edge_stff_mult = new Text(composite_9, SWT.BORDER);
		edge_stff_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_15 = managedForm.getToolkit().createLabel(composite_9, "Torsion stiffness multiplier:", SWT.NONE);
		
		tor_stff_mult = new Text(composite_9, SWT.BORDER);
		tor_stff_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_16 = managedForm.getToolkit().createLabel(composite_9, "Axial stiffness multiplier:", SWT.NONE);
		
		axial_stff_mult = new Text(composite_9, SWT.BORDER);
		axial_stff_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_17 = managedForm.getToolkit().createLabel(composite_9, "CG offset multiplier:", SWT.NONE);
		
		cg_offst_mult = new Text(composite_9, SWT.BORDER);
		cg_offst_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_18 = managedForm.getToolkit().createLabel(composite_9, "Shear center multiplier:", SWT.NONE);
		
		sc_offst_mult = new Text(composite_9, SWT.BORDER);
		sc_offst_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_19 = managedForm.getToolkit().createLabel(composite_9, "Tension center multiplier:", SWT.NONE);
		
		tc_offst_mult = new Text(composite_9, SWT.BORDER);
		tc_offst_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		


		Section sctnNewSection_3 = managedForm.getToolkit().createSection(composite_2, Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnNewSection_3);
		sctnNewSection_3.setText("Bmodes.bmi");
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
		labTowerHeigth.setText("Tower heigth");
		
		radius = new Text(composite_3, SWT.BORDER);
		radius.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(radius, true, true);
		
		Label lblNewLabel_4 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_4, true, true);
		lblNewLabel_4.setText("Tower rigid base");
		
		hub_rad = new Text(composite_3, SWT.BORDER);
		hub_rad.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(hub_rad, true, true);
		
		Label lblNewLabel_7 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_7, true, true);
		lblNewLabel_7.setText("Root constraint type");
		
		Combo hu_conn = new Combo(composite_3, SWT.NONE);
		hu_conn.setItems(new String[] {"CANTILEVERED", "AXIAL+TORSION", "FREE-FREE"});
		hu_conn.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(hu_conn);
		managedForm.getToolkit().paintBordersFor(hu_conn);
		
		Label lblTowershadowHalfWidth = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblTowershadowHalfWidth, true, true);
		lblTowershadowHalfWidth.setText("Modes to be printed");
		
		modepr = new Text(composite_3, SWT.BORDER);
		modepr.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(modepr, true, true);
		
		Button btnCheckButton = new Button(composite_3, SWT.CHECK);
		btnCheckButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		managedForm.getToolkit().adapt(btnCheckButton, true, true);
		btnCheckButton.setText("tab-delimited output tables");
		
		Button btnCheckButton_1 = new Button(composite_3, SWT.CHECK);
		btnCheckButton_1.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		managedForm.getToolkit().adapt(btnCheckButton_1, true, true);
		btnCheckButton_1.setText("output twist @ mid-nodes");
		
		Label lblNewLabel_8 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_8, true, true);
		lblNewLabel_8.setText("Tower-top mass");
		
		tip_mass = new Text(composite_3, SWT.BORDER);
		tip_mass.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(tip_mass, true, true);
		
		Label lblNewLabel_9 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_9, true, true);
		lblNewLabel_9.setText("CM fore-aft offset");
		
		cm_loc = new Text(composite_3, SWT.BORDER);
		cm_loc.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(cm_loc, true, true);
		
		Label lblCmTopOffset = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblCmTopOffset, true, true);
		lblCmTopOffset.setText("CM top offset");
		
		cm_axial = new Text(composite_3, SWT.BORDER);
		cm_axial.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(cm_axial, true, true);
		
		Composite composite_8 = new Composite(composite_3, SWT.NONE);
		composite_8.setLayout(new GridLayout(3, false));
		composite_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
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
		

		Section sctnOutputList = managedForm.getToolkit().createSection(composite_14, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
		GridData gd_sctnOutputList = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_sctnOutputList.heightHint = 500;
		sctnOutputList.setLayoutData(gd_sctnOutputList);
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
				
				
				
				
				tableViewer_1 = new TableViewer(composite_7, SWT.BORDER | SWT.FULL_SELECTION);
				table = tableViewer_1.getTable();
				GridData gd_table = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
				gd_table.heightHint = 140;
				table.setLayoutData(gd_table);
				table.setLinesVisible(true);
				table.setHeaderVisible(true);
				managedForm.getToolkit().paintBordersFor(table);
				
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
				
				TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tabColHt = tableViewerColumn.getColumn();
				tabColHt.setAlignment(SWT.RIGHT);
				tabColHt.setWidth(50);
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
				tblclmnThickmm.setWidth(70);
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
				tblclmnTwistdeg.setWidth(80);
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
				tblclmnPrint.setWidth(50);
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
				tblclmnFaIner.setWidth(50);
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
				tblclmnNewColumn.setWidth(50);
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
				tblclmnNewColumn_1.setWidth(50);
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
				tblclmnNewColumn_2.setWidth(50);
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
		sashForm.setWeights(new int[] {6, 8});
				
		
		// VALIDATOR / CONVERTER

		// Define a validator to check that only numbers are entered
		//IValidator validator = new FstValidator();

		// Create UpdateValueStratgy and assign to the binding
		//strategy = new UpdateValueStrategy();
		//strategy.setBeforeSetValidator(validator);
		
		// see											
		// http://javafact.com/jface/databinding/converter/
		//UpdateValueStrategy strategy = new UpdateValueStrategy();
		//strategy.setBeforeSetValidator(validator);


		// DATABINDING
		m_bindingContext = new XtextDataBindingContext();
		
		initXDB_Multipliers		(m_bindingContext);
		initXDB_TowerParameters	(m_bindingContext);
		
	}

	
	protected DataBindingContext initXDB_Multipliers (DataBindingContext bindingContext) {

		IObservableValue observeTextATolerObserveWidget = WidgetProperties.text(SWT.Modify).observe(sec_mass_mult);
		IObservableValue modelValueObserveValueA = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_SecMasMult(), bindBmodesbmiPackage().getnSecMasMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextATolerObserveWidget, modelValueObserveValueA, null, null);
		
		IObservableValue observeHHObserveWidget = WidgetProperties.text(SWT.Modify).observe(flp_iner_mult);
		IObservableValue modelValueObserveValueB = XtextProperties.value(
				FeaturePath.fromList( bindBmodesbmiPackage().getModelBmodesbmi_FlpInrMult(), bindBmodesbmiPackage().getnFlpInrMult_Value()) ).observe(docBmi);
		bindingContext.bindValue(observeHHObserveWidget, modelValueObserveValueB, null, null);
		
		IObservableValue observeTextNumFoilObserveWidget = WidgetProperties.text(SWT.Modify).observe(lag_iner_mult);
		IObservableValue modelValueObserveValueC = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_LagInrMult(), bindBmodesbmiPackage().getnLagInrMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextNumFoilObserveWidget, modelValueObserveValueC, null, null);

		IObservableValue observeTextBldNodesObserveWidget = WidgetProperties.text(SWT.Modify).observe(flp_stff_mult);
		IObservableValue modelValueObserveValue_33 = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_FlpstfMult(), bindBmodesbmiPackage().getnFlpstfMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextBldNodesObserveWidget, modelValueObserveValue_33, null, null);
		
		IObservableValue observeTextTwrShadObserveWidget = WidgetProperties.text(SWT.Modify).observe(edge_stff_mult);
		IObservableValue modelValueObserveValue_34 = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_EdgStfMult(), bindBmodesbmiPackage().getnEdgStfMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextTwrShadObserveWidget, modelValueObserveValue_34, null, null);

		IObservableValue observeTextShadHWidObserveWidget = WidgetProperties.text(SWT.Modify).observe(tor_stff_mult);
		IObservableValue modelValueObserveValue_ShadHWid = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_TorStfMult(), bindBmodesbmiPackage().getnTorStfMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextShadHWidObserveWidget, modelValueObserveValue_ShadHWid, null, null);

		IObservableValue observeTextTShadRefPtObserveWidget = WidgetProperties.text(SWT.Modify).observe(axial_stff_mult);
		IObservableValue modelValueObserveValue_TShadRefPt = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_AxiStfMult(), bindBmodesbmiPackage().getnAxiStfMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextTShadRefPtObserveWidget, modelValueObserveValue_TShadRefPt, null, null);

		IObservableValue observeTextRhoObserveWidget = WidgetProperties.text(SWT.Modify).observe(cg_offst_mult);
		IObservableValue modelValueObserveValue_Rho = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_CgOffsMult(), bindBmodesbmiPackage().getnCgOffsMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextRhoObserveWidget, modelValueObserveValue_Rho, null, null);

		IObservableValue observeTextKinViscObserveWidget = WidgetProperties.text(SWT.Modify).observe(sc_offst_mult);
		IObservableValue modelValueObserveValue_KinVisc = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_ScOffsMult(), bindBmodesbmiPackage().getnScOffsMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextKinViscObserveWidget, modelValueObserveValue_KinVisc, null, null);

		IObservableValue observeTextDTAeroObserveWidget = WidgetProperties.text(SWT.Modify).observe(tc_offst_mult);
		IObservableValue modelValueObserveValue_DTAero = XtextProperties.value(
				FeaturePath.fromList(bindBmodesbmiPackage().getModelBmodesbmi_TcOffsMult(), bindBmodesbmiPackage().getnTcOffsMult_Value())).observe(docBmi);
		bindingContext.bindValue(observeTextDTAeroObserveWidget, modelValueObserveValue_DTAero, null, null);
		
		
		return bindingContext;
	}
	
	protected DataBindingContext initXDB_TowerParameters (DataBindingContext bindingContext) {

		// dampers
		IObservableValue observeTextATolerObserveWidget = WidgetProperties.text(SWT.Modify).observe(TwrFADmp1);
		IObservableValue modelValueObserveValueA = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_BldFlDmp1(), bindFasttwrPackage().getnTwrFADmp1_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidget, modelValueObserveValueA, null, null);
		
		IObservableValue observeTextATolerObserveWidget2 = WidgetProperties.text(SWT.Modify).observe(TwrFADmp2);
		IObservableValue modelValueObserveValueA2 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_BldFlDmp2(), bindFasttwrPackage().getnTwrFADmp2_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidget2, modelValueObserveValueA2, null, null);
		
		IObservableValue observeTextATolerObserveWidget3 = WidgetProperties.text(SWT.Modify).observe(TwrSSDmp1);
		IObservableValue modelValueObserveValueA3 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_BldEdDmp1(), bindFasttwrPackage().getnTwrSSDmp1_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidget3, modelValueObserveValueA3, null, null);
		
		IObservableValue observeTextATolerObserveWidget4 = WidgetProperties.text(SWT.Modify).observe(TwrSSDmp2);
		IObservableValue modelValueObserveValueA4 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_BldEdDmp2(), bindFasttwrPackage().getnTwrSSDmp2_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidget4, modelValueObserveValueA4, null, null);
		
		
		// tuners
		IObservableValue observeTextATolerObserveWidgetz1 = WidgetProperties.text(SWT.Modify).observe(FAStTunr1);
		IObservableValue modelValueObserveValueAz1 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_FAStTunr1(), bindFasttwrPackage().getnFAStTunr1_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidgetz1, modelValueObserveValueAz1, null, null);
		
		IObservableValue observeTextATolerObserveWidgetz2 = WidgetProperties.text(SWT.Modify).observe(FAStTunr2);
		IObservableValue modelValueObserveValueAz2 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_FAStTunr2(), bindFasttwrPackage().getnFAStTunr2_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidgetz2, modelValueObserveValueAz2, null, null);
		
		IObservableValue observeTextATolerObserveWidgetz3 = WidgetProperties.text(SWT.Modify).observe(SSStTunr1);
		IObservableValue modelValueObserveValueAz3 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_SSStTunr1(), bindFasttwrPackage().getnSSStTunr1_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidgetz3, modelValueObserveValueAz3, null, null);
		
		IObservableValue observeTextATolerObserveWidgetz4 = WidgetProperties.text(SWT.Modify).observe(SSStTunr2);
		IObservableValue modelValueObserveValueAz4 = XtextProperties.value(
				FeaturePath.fromList( bindFasttwrPackage().getModelFasttwr_SSStTunr2(), bindFasttwrPackage().getnSSStTunr2_Value())).observe(docTwr);
		bindingContext.bindValue(observeTextATolerObserveWidgetz4, modelValueObserveValueAz4, null, null);
		return bindingContext;
	}
		
	public IContentOutlinePage getContentOutline() {
		// TODO Auto-generated method stub
		return null;
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
}

