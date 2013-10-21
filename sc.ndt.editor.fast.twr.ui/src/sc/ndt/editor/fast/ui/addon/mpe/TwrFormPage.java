package sc.ndt.editor.fast.ui.addon.mpe;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
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
import org.eclipse.swt.widgets.Button;



public class TwrFormPage extends FormPage {

	private DataBindingContext m_bindingContext;

	private ScrolledForm form;
	private FormToolkit toolkit;
	private IToolBarManager manager;

	public URI uri;
	private Text AToler;
	private Text radius;
	private Text hub_rad;
	private Text modepr;
	private Table table_2;


	private TowerNodeStructList tnsl 	= new TowerNodeStructList(); // from tower.bmi file
	private TowerNodeStructList tnsl2 	= new TowerNodeStructList(); // from tower.sec file
	private ModelFasttwr m;
	private Table table;

	private TableViewer tableViewer;
	private TableViewer tableViewer_1;

	private Menu contextMenu;
	private Text TwrFADmp1;
	private Text TwrFADmp2;

	private FieldDecoration fieldDecERR;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
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
	private Text txtNewText_2;
	private Text txtNewText_3;
	private Text txtNewText_4;
	private Text txtNewText_5;
	private Text txtNewText_6;
	private Text txtNewText_7;
	private Text txtNewText_8;
	private Text txtNewText_9;
	
	TwrMultiPageEditor tmpe;
	
	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public TwrFormPage(String id, String title) {
		super(id, title);
	}
	
	public void doSave(IProgressMonitor monitor) {
		
		tmpe.fileTwrSec.save(tnsl2);
		
	}

    public void doSaveAs() {
    	doSave(null);
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
			XtextEditor 		e 	= xfe.getXtextEditor("twr");		
			m = (ModelFasttwr) xfe.getModelFromXtextEditor(e);
		}
		
		aTwrStat ast = m.getTwrStat();
		for(int i = 0; i < ast.getHtFract().size(); i++) {
			tnsl.add(new TowerNodeStruct(
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
			tmpe = (TwrMultiPageEditor)getEditor();
			tnsl2 = tmpe.fileTwrSec.getTower();
		}
		
	}

	// used to update the viewer from outsite
	private void refresh() {
		tableViewer.setInput(tnsl2);
		
		tableViewer.refresh();
		tableViewer_1.refresh();

		setDirty(true);
		
	} 

	protected boolean dirty = false;
	
    public boolean isDirty() {
       return dirty;
    }
    protected void setDirty(boolean value) {
       dirty = value;
       firePropertyChange(PROP_DIRTY);
    }
    
	private FasttwrPackage bindFasttwrPackage() {
		return FasttwrPackage.eINSTANCE;
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
		managedForm.getForm().getBody().setLayout(new FillLayout(SWT.VERTICAL));
		
		Composite composite_2 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
		managedForm.getToolkit().adapt(composite_2);
		managedForm.getToolkit().paintBordersFor(composite_2);
		composite_2.setLayout(new RowLayout(SWT.HORIZONTAL));
		
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
		
		TwrFADmp1 = managedForm.getToolkit().createText(composite_1, "New Text", SWT.NONE);
		TwrFADmp1.setText("0");
		GridData gd_TwrFADmp1 = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_TwrFADmp1.widthHint = 50;
		TwrFADmp1.setLayoutData(gd_TwrFADmp1);
		
		Label lblNewLabel_1 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText("Tower 2st fore-aft mode damping ratio:");
		
		TwrFADmp2 = managedForm.getToolkit().createText(composite_1, "New Text", SWT.NONE);
		TwrFADmp2.setText("0");
		TwrFADmp2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblNewLabel_2 = new Label(composite_1, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblNewLabel_2, true, true);
		lblNewLabel_2.setText("Tower 1st side-side mode damping ratio:");
		
		text = new Text(composite_1, SWT.BORDER);
		text.setText("0");
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(text, true, true);
		
		Label lblInflowModel = managedForm.getToolkit().createLabel(composite_1, "Tower 2st side-side mode damping ratio:", SWT.NONE);
		lblInflowModel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		text_1 = new Text(composite_1, SWT.BORDER);
		text_1.setText("0");
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(text_1, true, true);
		
		Label lblNewLabel_3 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_3, true, true);
		lblNewLabel_3.setText("Tower 1st fore-aft mode tuner:");
		
		text_2 = new Text(composite_1, SWT.BORDER);
		text_2.setText("0");
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(text_2, true, true);
		
		Label lblInductionfactorTolerance = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblInductionfactorTolerance, true, true);
		lblInductionfactorTolerance.setText("Tower 2nd fore-aft mode tuner:");
		
		AToler = new Text(composite_1, SWT.BORDER);
		AToler.setText("0");
		AToler.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(AToler, true, true);
		
		Label lblNewLabel_5 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_5, true, true);
		lblNewLabel_5.setText("Tower 1st side-side mode tuner:");
		
		text_4 = new Text(composite_1, SWT.BORDER);
		text_4.setText("0");
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(text_4, true, true);
		
		Label lblNewLabel_6 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_6, true, true);
		lblNewLabel_6.setText("Tower 2nd side-side mode tuner:");
		
		text_3 = new Text(composite_1, SWT.BORDER);
		text_3.setText("0");
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(text_3, true, true);
		
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
		
		sec_mass_mult = managedForm.getToolkit().createText(composite_9, "New Text", SWT.NONE);
		sec_mass_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_11 = managedForm.getToolkit().createLabel(composite_9, "Fore-aft inertia multiplier:", SWT.NONE);
		
		flp_iner_mult = managedForm.getToolkit().createText(composite_9, "New Text", SWT.NONE);
		flp_iner_mult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_12 = managedForm.getToolkit().createLabel(composite_9, "Side-side inertia multiplier:", SWT.NONE);
		
		txtNewText_2 = managedForm.getToolkit().createText(composite_9, "New Text", SWT.NONE);
		txtNewText_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_13 = managedForm.getToolkit().createLabel(composite_9, "Fore-aft bending stiffness multiplier:", SWT.NONE);
		
		txtNewText_3 = managedForm.getToolkit().createText(composite_9, "New Text", SWT.NONE);
		txtNewText_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_14 = managedForm.getToolkit().createLabel(composite_9, "Side-side bending stiffness multiplier:", SWT.NONE);
		
		txtNewText_4 = managedForm.getToolkit().createText(composite_9, "New Text", SWT.NONE);
		txtNewText_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_15 = managedForm.getToolkit().createLabel(composite_9, "Torsion stiffness multiplier:", SWT.NONE);
		
		txtNewText_5 = managedForm.getToolkit().createText(composite_9, "New Text", SWT.NONE);
		txtNewText_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_16 = managedForm.getToolkit().createLabel(composite_9, "Axial stiffness multiplier:", SWT.NONE);
		
		txtNewText_6 = managedForm.getToolkit().createText(composite_9, "New Text", SWT.NONE);
		txtNewText_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_17 = managedForm.getToolkit().createLabel(composite_9, "CG offset multiplier:", SWT.NONE);
		
		txtNewText_7 = managedForm.getToolkit().createText(composite_9, "New Text", SWT.NONE);
		txtNewText_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_18 = managedForm.getToolkit().createLabel(composite_9, "Shear center multiplier:", SWT.NONE);
		
		txtNewText_8 = managedForm.getToolkit().createText(composite_9, "New Text", SWT.NONE);
		txtNewText_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_19 = managedForm.getToolkit().createLabel(composite_9, "Tension center multiplier:", SWT.NONE);
		
		txtNewText_9 = managedForm.getToolkit().createText(composite_9, "New Text", SWT.NONE);
		txtNewText_9.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		


		Section sctnNewSection_3 = managedForm.getToolkit().createSection(composite_2, Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnNewSection_3);
		sctnNewSection_3.setText("Bmodes.bmi");
		sctnNewSection_3.setExpanded(true);
		
		
		Composite composite_3 = new Composite(sctnNewSection_3, SWT.NONE);
		managedForm.getToolkit().adapt(composite_3);
		managedForm.getToolkit().paintBordersFor(composite_3);
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
		
			

		Composite composite_14 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
		managedForm.getToolkit().adapt(composite_14);
		managedForm.getToolkit().paintBordersFor(composite_14);
		GridLayout gl_composite_14 = new GridLayout(1, false);
		gl_composite_14.marginHeight = 0;
		composite_14.setLayout(gl_composite_14);
		
		
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
				GridLayout gl_composite = new GridLayout(2, false);
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
						
						tnsl2.add( tnsl2.get(tnsl2.size()-1) );
						refresh();
						
					}

					@Override
					public void mouseUp(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				    });
				
				
				
				ImageHyperlink mghprlnkDel = managedForm.getToolkit().createImageHyperlink(composite_6, SWT.NONE);
				mghprlnkDel.setImage(ResourceManager.getPluginImage("sc.ndt.commons", "icons/cross.png"));
				managedForm.getToolkit().paintBordersFor(mghprlnkDel);
				mghprlnkDel.setText("Del");
				new Label(composite, SWT.NONE);
				
				Composite composite_4 = new Composite(composite, SWT.NONE);
				composite_4.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
				managedForm.getToolkit().adapt(composite_4);
				managedForm.getToolkit().paintBordersFor(composite_4);
				GridLayout gl_composite_4 = new GridLayout(1, false);
				gl_composite_4.marginTop = 5;
				gl_composite_4.marginWidth = 0;
				gl_composite_4.verticalSpacing = 0;
				gl_composite_4.marginHeight = 0;
				gl_composite_4.horizontalSpacing = 0;
				composite_4.setLayout(gl_composite_4);
				
				
				
				
				tableViewer = new TableViewer(composite_4, SWT.BORDER | SWT.FULL_SELECTION);
				table_2 = tableViewer.getTable();
				GridData gd_table_2 = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
				gd_table_2.heightHint = 100;
				table_2.setLayoutData(gd_table_2);
				table_2.setLinesVisible(true);
				table_2.setHeaderVisible(true);
				managedForm.getToolkit().paintBordersFor(table_2);
				
				TableViewerColumn tabViewColID = new TableViewerColumn(tableViewer, SWT.NONE);
				TableColumn tabColID = tabViewColID.getColumn();
				tabColID.setAlignment(SWT.CENTER);
				tabColID.setResizable(false);
				tabColID.setWidth(30);
				tabColID.setText("ID");
				tabViewColID.setLabelProvider(new ColumnLabelProvider() {
					  @Override
					  public String getText(Object element) {
						  return Integer.toString(tnsl2.indexOf( (TowerNodeStruct) element));
					  }
					});
				
				TableViewerColumn tabViewColHagl = new TableViewerColumn(tableViewer, SWT.NONE);
				TableColumn tabColHagl = tabViewColHagl.getColumn();
				tabColHagl.setWidth(60);
				tabColHagl.setText("H agl [m]");
				tabViewColHagl.setLabelProvider(new ColumnLabelProvider() {
					  @Override
					  public String getText(Object element) {
						  return  ((TowerNodeStruct)element).getProperty("HtAgl");
					  }
					}); 
				tabViewColHagl.setEditingSupport(
						TowerNodeStruct.getHtAglEditingSupport(tableViewer));
				
				TableViewerColumn tableViewerColumn_6 = new TableViewerColumn(tableViewer, SWT.NONE);
				TableColumn tabColD = tableViewerColumn_6.getColumn();
				tabColD.setWidth(60);
				tabColD.setText("d [m]");
				tableViewerColumn_6.setLabelProvider(new ColumnLabelProvider() {
					  @Override
					  public String getText(Object element) {
						  return ((TowerNodeStruct)element).getProperty("d");
					  }
					});
				tableViewerColumn_6.setEditingSupport(
						TowerNodeStruct.getDEditingSupport(tableViewer));
				
				TableViewerColumn tableViewerColumn_7 = new TableViewerColumn(tableViewer, SWT.NONE);
				TableColumn tblclmnThickmm = tableViewerColumn_7.getColumn();
				tblclmnThickmm.setWidth(60);
				tblclmnThickmm.setText("Thick [mm]");
				tableViewerColumn_7.setLabelProvider(new ColumnLabelProvider() {
					  @Override
					  public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("thick");
					  }
					});
				tableViewerColumn_7.setEditingSupport(
						TowerNodeStruct.getThickEditingSupport(tableViewer));
				
				// this code is placed after the definition of the viewer
				// set the content provider
				tableViewer.setContentProvider(ArrayContentProvider.getInstance());
				tableViewer.setInput(tnsl2);
				
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
				gd_table.heightHint = 100;
				table.setLayoutData(gd_table);
				table.setLinesVisible(true);
				table.setHeaderVisible(true);
				managedForm.getToolkit().paintBordersFor(table);
				
				TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tabColHt = tableViewerColumn.getColumn();
				tabColHt.setWidth(50);
				tabColHt.setText("HtFract");
				tableViewerColumn.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("HtFract") ;
					}
				});
				
				TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnTwistdeg = tableViewerColumn_1.getColumn();
				tblclmnTwistdeg.setWidth(50);
				tblclmnTwistdeg.setText("Mass Density [kg/m]");
				tableViewerColumn_1.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TMassDen");
					}
				});
				
				TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnDrm = tableViewerColumn_2.getColumn();
				tblclmnDrm.setWidth(50);
				tblclmnDrm.setText("FA Stif [Nm^2]");
				tableViewerColumn_2.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TwEAStif");
					}
				});
				
				TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnChordm = tableViewerColumn_3.getColumn();
				tblclmnChordm.setWidth(50);
				tblclmnChordm.setText("SS Stif [Nm^2]");
				tableViewerColumn_3.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TwSSStif");
					}
				});
				
				TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnId_1 = tableViewerColumn_4.getColumn();
				tblclmnId_1.setWidth(50);
				tblclmnId_1.setText("GJ Stif ");
				tableViewerColumn_4.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((TowerNodeStruct)element).getProperty("TwGJStif");
					}
				});
				
				TableViewerColumn tableViewerColumn_5 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnPrint = tableViewerColumn_5.getColumn();
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
				tblclmnNewColumn.setAlignment(SWT.CENTER);
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
				tblclmnNewColumn_1.setAlignment(SWT.CENTER);
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
				tblclmnNewColumn_2.setAlignment(SWT.CENTER);
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
				tableViewer_1.setInput(tnsl2);
				
		
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
		
		initXDB_SimulationControl	(m_bindingContext);
		
		
	}

	
	protected DataBindingContext initXDB_SimulationControl (DataBindingContext bindingContext) {

		/*
		// AToler
		IObservableValue observeTextATolerObserveWidget = WidgetProperties.text(SWT.Modify).observe(AToler);
		IObservableValue modelValueObserveValueA = XtextProperties.value(FeaturePath.fromList( bindFastadnPackage().getModelFastadn_Atoler(), bindFastadnPackage().getnAtoler_Value()) ).observe(document);
		bindingContext.bindValue(observeTextATolerObserveWidget, modelValueObserveValueA, null, null);
		
		IObservableValue observeHHObserveWidget = WidgetProperties.text(SWT.Modify).observe(HH);
		IObservableValue modelValueObserveValueB = XtextProperties.value(FeaturePath.fromList( bindFastadnPackage().getModelFastadn_HH(), bindFastadnPackage().getnHH_Value()) ).observe(document);
		bindingContext.bindValue(observeHHObserveWidget, modelValueObserveValueB, null, null);
		
		//
		IObservableValue observeTextNumFoilObserveWidget = WidgetProperties.text(SWT.Modify).observe(NumFoil);
		IObservableValue modelValueObserveValueC = XtextProperties.value(FeaturePath.fromList(bindFastadnPackage().getModelFastadn_NumFoil(), bindFastadnPackage().getiNumFoil_Value())).observe(document);
		bindingContext.bindValue(observeTextNumFoilObserveWidget, modelValueObserveValueC, null, null);
		//
		IObservableValue observeTextBldNodesObserveWidget = WidgetProperties.text(SWT.Modify).observe(BldNodes);
		IObservableValue modelValueObserveValue_33 = XtextProperties.value(FeaturePath.fromList(bindFastadnPackage().getModelFastadn_BldNodes(), bindFastadnPackage().getiBldNodes_Value())).observe(document);
		bindingContext.bindValue(observeTextBldNodesObserveWidget, modelValueObserveValue_33, null, null);
		
		//
		IObservableValue observeTextTwrShadObserveWidget = WidgetProperties.text(SWT.Modify).observe(TwrShad);
		IObservableValue modelValueObserveValue_34 = XtextProperties.value(FeaturePath.fromList(bindFastadnPackage().getModelFastadn_TwrShad(), bindFastadnPackage().getnTwrShad_Value())).observe(document);
		bindingContext.bindValue(observeTextTwrShadObserveWidget, modelValueObserveValue_34, null, null);

		//
		IObservableValue observeTextShadHWidObserveWidget = WidgetProperties.text(SWT.Modify).observe(ShadHWid);
		IObservableValue modelValueObserveValue_ShadHWid = XtextProperties.value(FeaturePath.fromList(bindFastadnPackage().getModelFastadn_ShadHWid(), bindFastadnPackage().getnShadHWid_Value())).observe(document);
		bindingContext.bindValue(observeTextShadHWidObserveWidget, modelValueObserveValue_ShadHWid, null, null);

		//
		IObservableValue observeTextTShadRefPtObserveWidget = WidgetProperties.text(SWT.Modify).observe(TShadRefPt);
		IObservableValue modelValueObserveValue_TShadRefPt = XtextProperties.value(FeaturePath.fromList(bindFastadnPackage().getModelFastadn_TShadRefPt(), bindFastadnPackage().getnTShadRefPt_Value())).observe(document);
		bindingContext.bindValue(observeTextTShadRefPtObserveWidget, modelValueObserveValue_TShadRefPt, null, null);

		//
		IObservableValue observeTextRhoObserveWidget = WidgetProperties.text(SWT.Modify).observe(Rho);
		IObservableValue modelValueObserveValue_Rho = XtextProperties.value(FeaturePath.fromList(bindFastadnPackage().getModelFastadn_Rho(), bindFastadnPackage().getnRho_Value())).observe(document);
		bindingContext.bindValue(observeTextRhoObserveWidget, modelValueObserveValue_Rho, null, null);

		//
		IObservableValue observeTextKinViscObserveWidget = WidgetProperties.text(SWT.Modify).observe(KinVisc);
		IObservableValue modelValueObserveValue_KinVisc = XtextProperties.value(FeaturePath.fromList(bindFastadnPackage().getModelFastadn_KinVisc(), bindFastadnPackage().getnKinVisc_Value())).observe(document);
		bindingContext.bindValue(observeTextKinViscObserveWidget, modelValueObserveValue_KinVisc, null, null);

		//
		IObservableValue observeTextDTAeroObserveWidget = WidgetProperties.text(SWT.Modify).observe(DTAero);
		IObservableValue modelValueObserveValue_DTAero = XtextProperties.value(FeaturePath.fromList(bindFastadnPackage().getModelFastadn_DTAero(), bindFastadnPackage().getnDTAero_Value())).observe(document);
		bindingContext.bindValue(observeTextDTAeroObserveWidget, modelValueObserveValue_DTAero, null, null);
		*/
		
		return bindingContext;
	}
	
	
	public IContentOutlinePage getContentOutline() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
		  
}
