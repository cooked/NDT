package sc.ndt.editor.fast.ui.addon.mpe;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.IMessage;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationListener;
import org.eclipse.jface.viewers.ColumnViewerEditorDeactivationEvent;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Button;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.ObservablesManager;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.ValidationStatusProvider;
import org.eclipse.core.databinding.observable.AbstractObservable;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;

import sc.ndt.commons.model.AirfoilFile;
import sc.ndt.commons.model.AirfoilList;
import sc.ndt.commons.model.BladeNode;
import sc.ndt.commons.model.BladeNodesList;
import sc.ndt.commons.model.OutBlock;
import sc.ndt.commons.model.OutCh;
import sc.ndt.commons.model.OutList;
import sc.ndt.commons.model.airfoillist.providers.AirfoilCellEditorProvider;
import sc.ndt.commons.model.airfoillist.providers.AirfoilListLabelProvider;
import sc.ndt.commons.model.outlist.providers.OutListCheckStateProvider;
import sc.ndt.commons.model.outlist.providers.OutListContentProvider;
import sc.ndt.commons.model.outlist.providers.OutListLabelProvider;
import sc.ndt.commons.model.outlist.providers.OutListToolTipSupport;
import sc.ndt.editor.fast.fastadn.FastadnPackage;
import sc.ndt.editor.fast.fastadn.ModelFastadn;
import sc.ndt.editor.fast.fastadn.aAirStat;
import sc.ndt.editor.fast.fastadn.aAirfoilList;

import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.FeaturePath;

import ch.vorburger.xtext.databinding.XtextDataBindingContext;
import ch.vorburger.xtext.databinding.XtextProperties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;

public class AdnFormPage extends FormPage {
	private Text text;

	private CheckboxTreeViewer checkboxTreeViewer;

	private IXtextDocument document;

	private DataBindingContext m_bindingContext;

	public OutList outList = new OutList();

	private ScrolledForm form;
	private FormToolkit toolkit;
	private IToolBarManager manager;
	private String list;
	private Text text_1;
	private Text text_5a;


	
	public URI uri;
	private FieldDecoration fieldDecINF;
	private FieldDecoration fieldDecERR;
	private Text AToler;
	private Text WindFile;
	private Text HH;
	private Text TwrShad;
	private Text ShadHWid;
	private Text TShadRefPt;
	private Text Rho;
	private Text KinVisc;
	private Text DTAero;
	private Text NumFoil;
	private Text BldNodes;

	private Combo TLModel;

	private Combo HLModel;
	private Table table_2;

	private TableViewer tableViewer;

	private AirfoilList 	al = new AirfoilList();
	private BladeNodesList 	as = new BladeNodesList();
	
	private ModelFastadn m;
	private Table table;

	private TableViewer tableViewer_1;
	
	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public AdnFormPage(String id, String title) {
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
	public AdnFormPage(FormEditor editor, String id, String title) {
		super(editor, id, title);

		document = ((AdnMultiPageEditor)getEditor()).xtextEditorAdn.getDocument();

		// do stuff the first timee (load outList, set uri)
		list = document.readOnly(new IUnitOfWork<String,XtextResource>() {

			

			public String exec(XtextResource resource) {
				m = (ModelFastadn)resource.getContents().get(0);
				uri = m.eResource().getURI();
				String out = "";
				EList<String> af = m.getFoilNm().getValue();
				for (int i = 0; i < af.size(); i++) {
					if (af.get(i) != "")
						out += af.get(i) + ",";
				}
				return out.substring(0, out.length() - 1);
				
			}

		});	
		
		aAirStat ast = m.getAirStat();
		for(int i = 0; i < ast.getRnodes().size(); i++) {
			as.add(new BladeNode(
					ast.getRnodes().get(i),
					ast.getAerotwst().get(i),
					ast.getDrnodes().get(i),
					ast.getChord().get(i),
					ast.getNfoil().get(i),
					ast.getPrnelm().get(i) ));
		}
		 
		al.setAirfoilList(list);

	}

	private FastadnPackage bindFastadnPackage() {
		return FastadnPackage.eINSTANCE;
	}

	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {

		form = managedForm.getForm();
		form.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));		
		form.setText("FAST AeroDyn Input File");

		toolkit = managedForm.getToolkit();
		toolkit.decorateFormHeading(form.getForm());

		manager = form.getToolBarManager();

		// see
		// http://devblog.virtage.com/2012/09/snippet-of-the-day-execute-eclipse-command-programmatically/
		
		Action runAction = new Action("Run") { //$NON-NLS-1$
			public void run() {
			}
		};
		runAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("org.eclipse.jdt.debug.ui", "/icons/full/etool16/run_exc.gif"));

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
		
		//manager.add(runAction);		// run time-marching simulation
		//manager.add(linAction);		// run model linearization
		//manager.add(helpAction);	// open help
		
		
		form.updateToolBar();
		RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
		managedForm.getForm().getBody().setLayout(rowLayout);

		// control decoration
		fieldDecERR = FieldDecorationRegistry.getDefault().getFieldDecoration(
				FieldDecorationRegistry.DEC_ERROR);
		
		Composite composite_2 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
		managedForm.getToolkit().adapt(composite_2);
		managedForm.getToolkit().paintBordersFor(composite_2);
		FillLayout fl_composite_2 = new FillLayout(SWT.HORIZONTAL);
		fl_composite_2.spacing = 5;
		composite_2.setLayout(fl_composite_2);
		
		Section sctnNewSection = managedForm.getToolkit().createSection(composite_2, Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnNewSection);
		sctnNewSection.setText("Controls");
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
		lblNewLabel.setText("System of units");
		
		Combo SysUnits = new Combo(composite_1, SWT.NONE);
		SysUnits.setItems(new String[] {"SI"});
		GridData gd_SysUnits = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_SysUnits.widthHint = 100;
		SysUnits.setLayoutData(gd_SysUnits);
		managedForm.getToolkit().adapt(SysUnits);
		managedForm.getToolkit().paintBordersFor(SysUnits);
		
		Label lblNewLabel_1 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText("Dynamic stall model");
		
		Combo StallMod = new Combo(composite_1, SWT.NONE);
		StallMod.setItems(new String[] {"BEDDOES", "STEADY"});
		StallMod.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(StallMod);
		managedForm.getToolkit().paintBordersFor(StallMod);
		
		Label lblNewLabel_2 = new Label(composite_1, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblNewLabel_2, true, true);
		lblNewLabel_2.setText("Aerodynamic pitch moment model");
		
		Combo UseCm = new Combo(composite_1, SWT.NONE);
		UseCm.setItems(new String[] {"USE_CM", "NO_CM"});
		UseCm.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(UseCm);
		managedForm.getToolkit().paintBordersFor(UseCm);
		
		Label lblInflowModel = managedForm.getToolkit().createLabel(composite_1, "Inflow model", SWT.NONE);
		
		Combo combo = new Combo(composite_1, SWT.NONE);
		combo.setItems(new String[] {"DYNIN", "EQUIL"});
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(combo);
		managedForm.getToolkit().paintBordersFor(combo);

		// see
		// http://stackoverflow.com/questions/14398966/check-checkbox-selection-from-within-listener
		combo.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (((Combo) e.widget).getSelectionIndex() == 1) {
					TLModel.setEnabled(true);
					HLModel.setEnabled(true);
				} else {
					TLModel.setEnabled(false);
					HLModel.setEnabled(false);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		Label lblNewLabel_3 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_3, true, true);
		lblNewLabel_3.setText("Induction-factor model");
		
		Combo IndModel = new Combo(composite_1, SWT.NONE);
		IndModel.setItems(new String[] {"NONE", "WAKE", "SWIRL"});
		IndModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(IndModel);
		managedForm.getToolkit().paintBordersFor(IndModel);
		
		Label lblInductionfactorTolerance = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblInductionfactorTolerance, true, true);
		lblInductionfactorTolerance.setText("Induction-factor tolerance");
		
		AToler = new Text(composite_1, SWT.BORDER);
		AToler.setText("0");
		AToler.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(AToler, true, true);
		
		Label lblNewLabel_5 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_5, true, true);
		lblNewLabel_5.setText("Tip-loss model");
		
		TLModel = new Combo(composite_1, SWT.NONE);
		TLModel.setItems(new String[] {"NONE", "PRANDtl", "GTECH"});
		TLModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(TLModel);
		managedForm.getToolkit().paintBordersFor(TLModel);
		
		Label lblNewLabel_6 = new Label(composite_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_6, true, true);
		lblNewLabel_6.setText("Hub-loss model");
		
		HLModel = new Combo(composite_1, SWT.NONE);
		HLModel.setItems(new String[] {"NONE", "PRANDtl"});
		HLModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(HLModel);
		managedForm.getToolkit().paintBordersFor(HLModel);
		
		Section sctnNewSection_1 = managedForm.getToolkit().createSection(composite_2, Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnNewSection_1);
		sctnNewSection_1.setText("Model");
		sctnNewSection_1.setExpanded(true);
		
		Composite composite_3 = new Composite(sctnNewSection_1, SWT.NONE);
		managedForm.getToolkit().adapt(composite_3);
		managedForm.getToolkit().paintBordersFor(composite_3);
		sctnNewSection_1.setClient(composite_3);
		GridLayout gl_composite_3 = new GridLayout(2, false);
		gl_composite_3.verticalSpacing = 1;
		composite_3.setLayout(gl_composite_3);
		
		Label lblWindFile = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblWindFile, true, true);
		lblWindFile.setText("Wind file");
		
		WindFile = new Text(composite_3, SWT.BORDER);
		WindFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(WindFile, true, true);
		
		Label lblNewLabel_4 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_4, true, true);
		lblNewLabel_4.setText("Wind reference (hub) height");
		
		HH = new Text(composite_3, SWT.BORDER);
		HH.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(HH, true, true);
		
		Label lblNewLabel_7 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_7, true, true);
		lblNewLabel_7.setText("Tower-shadow velocity deficit");
		
		TwrShad = new Text(composite_3, SWT.BORDER);
		TwrShad.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(TwrShad, true, true);
		
		Label lblTowershadowHalfWidth = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblTowershadowHalfWidth, true, true);
		lblTowershadowHalfWidth.setText("Tower-shadow half width");
		
		ShadHWid = new Text(composite_3, SWT.BORDER);
		ShadHWid.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(ShadHWid, true, true);
		
		Label lblTowershadowReferencePoint = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblTowershadowReferencePoint, true, true);
		lblTowershadowReferencePoint.setText("Tower-shadow reference point");
		
		TShadRefPt = new Text(composite_3, SWT.BORDER);
		TShadRefPt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(TShadRefPt, true, true);
		
		Label lblNewLabel_8 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_8, true, true);
		lblNewLabel_8.setText("Air density");
		
		Rho = new Text(composite_3, SWT.BORDER);
		Rho.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(Rho, true, true);
		
		Label lblNewLabel_9 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_9, true, true);
		lblNewLabel_9.setText("Kinematic air viscosity");
		
		KinVisc = new Text(composite_3, SWT.BORDER);
		KinVisc.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(KinVisc, true, true);
		
		Label lblNewLabel_10 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_10, true, true);
		lblNewLabel_10.setText("Time interval for aerodynamic calculations");
		
		DTAero = new Text(composite_3, SWT.BORDER);
		DTAero.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(DTAero, true, true);
		
		// This example will allow text to be dragged
        //Transfer[] types = new Transfer[] {SectionTransfer.getInstance()};

		Composite composite_14 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
		managedForm.getToolkit().adapt(composite_14);
		managedForm.getToolkit().paintBordersFor(composite_14);
		GridLayout gl_composite_14 = new GridLayout(1, false);
		gl_composite_14.marginHeight = 0;
		gl_composite_14.marginWidth = 0;
		composite_14.setLayout(gl_composite_14);
		
		
		Section sctnOutputList = managedForm.getToolkit().createSection(composite_14, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
		GridData gd_sctnOutputList = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_sctnOutputList.heightHint = 413;
		sctnOutputList.setLayoutData(gd_sctnOutputList);
		managedForm.getToolkit().paintBordersFor(sctnOutputList);
		sctnOutputList.setText("Blade");
		
				Composite composite_5 = managedForm.getToolkit().createComposite(sctnOutputList, SWT.NONE);
				managedForm.getToolkit().paintBordersFor(composite_5);
				sctnOutputList.setClient(composite_5);
				GridLayout gl_composite_5 = new GridLayout(1, false);
				gl_composite_5.horizontalSpacing = 10;
				composite_5.setLayout(gl_composite_5);
				
				SashForm sashForm = new SashForm(composite_5, SWT.NONE);
				GridData gd_sashForm = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
				gd_sashForm.widthHint = 650;
				sashForm.setLayoutData(gd_sashForm);
				managedForm.getToolkit().adapt(sashForm);
				managedForm.getToolkit().paintBordersFor(sashForm);
				
				Composite composite_4 = managedForm.getToolkit().createComposite(sashForm, SWT.NONE);
				managedForm.getToolkit().paintBordersFor(composite_4);
				GridLayout gl_composite_4 = new GridLayout(1, false);
				gl_composite_4.marginWidth = 0;
				composite_4.setLayout(gl_composite_4);
				
				Composite composite_7 = managedForm.getToolkit().createComposite(composite_4, SWT.NONE);
				composite_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
				managedForm.getToolkit().paintBordersFor(composite_7);
				GridLayout gl_composite_7 = new GridLayout(2, false);
				gl_composite_7.marginWidth = 0;
				gl_composite_7.marginHeight = 0;
				composite_7.setLayout(gl_composite_7);
				
				Label lblNewLabel_11 = managedForm.getToolkit().createLabel(composite_7, "Number of airfoil files", SWT.NONE);
				
				NumFoil = new Text(composite_7, SWT.BORDER | SWT.CENTER);
				GridData gd_NumFoil = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
				gd_NumFoil.widthHint = 40;
				NumFoil.setLayoutData(gd_NumFoil);
				managedForm.getToolkit().adapt(NumFoil, true, true);
				
				
				
				
				tableViewer = new TableViewer(composite_4, SWT.BORDER | SWT.FULL_SELECTION);
				table_2 = tableViewer.getTable();
				table_2.setLinesVisible(true);
				table_2.setHeaderVisible(true);
				managedForm.getToolkit().paintBordersFor(table_2);
				
				TableViewerColumn tableViewerColumnID = new TableViewerColumn(tableViewer, SWT.NONE);
				TableColumn tableColumnID = tableViewerColumnID.getColumn();
				tableColumnID.setResizable(false);
				tableColumnID.setWidth(30);
				tableColumnID.setText("ID");
				tableViewerColumnID.setLabelProvider(new AirfoilListLabelProvider()); 
				tableViewerColumnID.setLabelProvider(new ColumnLabelProvider() {
					  @Override
					  public String getText(Object element) {
					    return Integer.toString(al.indexOf( (AirfoilFile) element));
					  }
					});
				
				TableViewerColumn tableViewerColumnAirfoil = new TableViewerColumn(tableViewer, SWT.NONE);
				TableColumn tableColumnAirfoil = tableViewerColumnAirfoil.getColumn();
				tableColumnAirfoil.setWidth(200);
				tableColumnAirfoil.setText("Airfoil");
				tableViewerColumnAirfoil.setLabelProvider(new AirfoilListLabelProvider()); 
				
				// this code is placed after the definition of 
				// the viewer

				// set the content provider
				tableViewer.setContentProvider(ArrayContentProvider.getInstance());

				// provide the input to the viewer
				// setInput() calls getElements() on the 
				// content provider instance
				
				tableViewer.setInput(al); 
				
				//tableViewer.setContentProvider(new OutListContentProvider());
				//tableViewer.setInput(outList.getAllOutBlocks());
				
				
				
				
				Composite composite_6 = managedForm.getToolkit().createComposite(sashForm, SWT.NONE);
				managedForm.getToolkit().paintBordersFor(composite_6);
				composite_6.setLayout(new GridLayout(1, false));
				
				Composite composite_8 = new Composite(composite_6, SWT.NONE);
				composite_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
				managedForm.getToolkit().adapt(composite_8);
				managedForm.getToolkit().paintBordersFor(composite_8);
				GridLayout gl_composite_8 = new GridLayout(2, false);
				gl_composite_8.verticalSpacing = 3;
				gl_composite_8.marginHeight = 0;
				gl_composite_8.marginWidth = 0;
				composite_8.setLayout(gl_composite_8);
				
				Label lblNewLabel_12 = new Label(composite_8, SWT.NONE);
				managedForm.getToolkit().adapt(lblNewLabel_12, true, true);
				lblNewLabel_12.setText("Number of analysis blade nodes");
				
				BldNodes = new Text(composite_8, SWT.BORDER | SWT.CENTER);
				GridData gd_BldNodes = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
				gd_BldNodes.widthHint = 40;
				BldNodes.setLayoutData(gd_BldNodes);
				managedForm.getToolkit().adapt(BldNodes, true, true);
				
				
				
				
				tableViewer_1 = new TableViewer(composite_6, SWT.BORDER | SWT.FULL_SELECTION);
				table = tableViewer_1.getTable();
				table.setLinesVisible(true);
				table.setHeaderVisible(true);
				managedForm.getToolkit().paintBordersFor(table);
				tableViewer_1.getColumnViewerEditor().addEditorActivationListener(
						new ColumnViewerEditorActivationListener() {

							@Override
							public void beforeEditorActivated(ColumnViewerEditorActivationEvent event) {
								// TODO Auto-generated method stub
								
							}

							@Override
							public void afterEditorActivated(final ColumnViewerEditorActivationEvent event) {
							
								document.modify(new IUnitOfWork.Void<XtextResource>() {
									@Override
									public void process(XtextResource resource) throws Exception {
										ModelFastadn m = (ModelFastadn) resource.getContents().get(0);
										ViewerCell o = (ViewerCell)event.getSource();
										//tableViewer_1.getCell(new Point(event., y))
										String t = o.getText();
										
										if (m != null && m.getAirStat() != null)
											m.getAirStat().getPrnelm().set(0, t);//.ge(outList.getAllSelectedByBlock());
										else
											throw new IllegalStateException("Uh uh, no content");
										
									};
								});
								
							}

							@Override
							public void beforeEditorDeactivated(
									ColumnViewerEditorDeactivationEvent event) {
								// TODO Auto-generated method stub
								
							}

							@Override
							public void afterEditorDeactivated(
									ColumnViewerEditorDeactivationEvent event) {
								// TODO Auto-generated method stub
								
							}
					
						});
				
				TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnRm = tableViewerColumn.getColumn();
				tblclmnRm.setAlignment(SWT.CENTER);
				tblclmnRm.setWidth(50);
				tblclmnRm.setText("R [m]");
				tableViewerColumn.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return Float.toString( ((BladeNode)element).R );
					}
				});
				
				TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnTwistdeg = tableViewerColumn_1.getColumn();
				tblclmnTwistdeg.setAlignment(SWT.CENTER);
				tblclmnTwistdeg.setWidth(80);
				tblclmnTwistdeg.setText("Twist [deg]");
				tableViewerColumn_1.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return Float.toString( ((BladeNode)element).Twist );
					}
				});
				
				TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnDrm = tableViewerColumn_2.getColumn();
				tblclmnDrm.setAlignment(SWT.CENTER);
				tblclmnDrm.setWidth(60);
				tblclmnDrm.setText("dR [m]");
				tableViewerColumn_2.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return Float.toString( ((BladeNode)element).dR );
					}
				});
				
				TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				//tableViewerColumn_3.setEditingSupport(
				//		new TextCellEditor(tableViewerColumn_5.getViewer()) );
				TableColumn tblclmnChordm = tableViewerColumn_3.getColumn();
				tblclmnChordm.setAlignment(SWT.CENTER);
				tblclmnChordm.setWidth(80);
				tblclmnChordm.setText("Chord [m]");
				tableViewerColumn_3.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return Float.toString( ((BladeNode)element).Chord );
					}
				});
				
				TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				TableColumn tblclmnId_1 = tableViewerColumn_4.getColumn();
				tblclmnId_1.setAlignment(SWT.CENTER);
				tblclmnId_1.setWidth(50);
				tblclmnId_1.setText("ID");
				tableViewerColumn_4.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return Float.toString( ((BladeNode)element).AirfoilID );
					}
				});
				
				TableViewerColumn tableViewerColumn_5 = new TableViewerColumn(tableViewer_1, SWT.NONE);
				tableViewerColumn_5.setEditingSupport(
						new AirfoilCellEditorProvider(tableViewerColumn_5.getViewer()) );
				TableColumn tblclmnPrint = tableViewerColumn_5.getColumn();
				tblclmnPrint.setAlignment(SWT.CENTER);
				tblclmnPrint.setWidth(60);
				tblclmnPrint.setText("Print");
				tableViewerColumn_5.setLabelProvider(new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
					    return ((BladeNode)element).print;
					}
				});
				
				// set the content provider
				tableViewer_1.setContentProvider(ArrayContentProvider.getInstance());
				tableViewer_1.setInput(as);
				
				
				sashForm.setWeights(new int[] {3, 5});
		
		Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
		managedForm.getToolkit().adapt(composite);
		managedForm.getToolkit().paintBordersFor(composite);
		
		
				// OutList
				checkboxTreeViewer = new CheckboxTreeViewer(composite, SWT.MULTI);
				Tree treeTower = checkboxTreeViewer.getTree();
				treeTower.setBounds(-122, 0, 196, 315);
				treeTower.setHeaderVisible(true);
				treeTower.setLinesVisible(true);
				managedForm.getToolkit().paintBordersFor(treeTower);
				
						TreeViewerColumn column_1 = new TreeViewerColumn(checkboxTreeViewer,SWT.NONE);
						TreeColumn treeColumn = column_1.getColumn();
						treeColumn.setResizable(false);
						column_1.getColumn().setWidth(220);
						column_1.getColumn().setText("Output Channel");
						column_1.setLabelProvider(new OutListLabelProvider());
						
						TreeViewerColumn column_2 = new TreeViewerColumn(checkboxTreeViewer,SWT.NONE);
						TreeColumn treeColumn_1 = column_2.getColumn();
						treeColumn_1.setResizable(false);
						column_2.getColumn().setWidth(60);
						column_2.getColumn().setText("Unit");
						column_2.setLabelProvider(new ColumnLabelProvider() {
							public String getText(Object element) {
								if (element instanceof OutCh)
									return ((OutCh) element).unit;
								return "";
							}

						});
						
								checkboxTreeViewer.setContentProvider(new OutListContentProvider());
								checkboxTreeViewer.setCheckStateProvider(new OutListCheckStateProvider());
								checkboxTreeViewer.setInput(outList.getAllOutBlocks());
								OutListToolTipSupport.enableFor(checkboxTreeViewer);
								
										// see
										// http://www.java2s.com/Code/Java/SWT-JFace-Eclipse/DemonstratesCheckboxTreeViewer.htm
										checkboxTreeViewer.addCheckStateListener(new ICheckStateListener() {
											public void checkStateChanged(CheckStateChangedEvent event) {
												if (event.getChecked()) {
													checkboxTreeViewer.setSubtreeChecked(event.getElement(),
															true);
													Object o = event.getElement();
													if (o instanceof OutCh) {
														outList.get(((OutCh) o).name).setAvailable(true);
											
													} else if (o instanceof OutBlock)
														outList.setBlockSelected((OutBlock) o, true);
													
												} else if (!event.getChecked()) {
													checkboxTreeViewer.setSubtreeChecked(event.getElement(),
															false);
													Object o = event.getElement();
													if (o instanceof OutCh)
														outList.get(((OutCh) o).name).setAvailable(false);
													else if (o instanceof OutBlock)
														outList.setBlockSelected((OutBlock) o, false);
												}
								
												/*// TODO write to xtext model
												document.modify(new IUnitOfWork.Void<XtextResource>() {
													@Override
													public void process(XtextResource resource) throws Exception {
														ModelFastadn m = (ModelFastadn) resource.getContents().get(0);
														if (m != null && m.getOutList() != null)
															m.getOutList().setValue(outList.getAllSelectedByBlock());
														else
															throw new IllegalStateException("Uh uh, no content");
								
													};
												});*/
												
												checkboxTreeViewer.refresh();
								
											}
										});
		//toolkit.decorateFormHeading(form.getForm());



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
		/*initXDB_TurbineControl		(m_bindingContext);
		initXDB_Environment			(m_bindingContext);
		initXDB_FeatureFlags		(m_bindingContext);
		initXDB_InitialConditions	(m_bindingContext);
		initXDB_TurbineConfiguration(m_bindingContext);
		initXDB_MassAndInertia		(m_bindingContext);
		initXDB_Drivetrain			(m_bindingContext);
		initXDB_GeneratorSI			(m_bindingContext);
		initXDB_GeneratorTEC		(m_bindingContext);
		initXDB_PlatformModel		(m_bindingContext);
		initXDB_Tower				(m_bindingContext);
		initXDB_NacelleYaw			(m_bindingContext);
		initXDB_Furling				(m_bindingContext);
		initXDB_RotorTeeter			(m_bindingContext);
		initXDB_TipBrake			(m_bindingContext);
		initXDB_Blade				(m_bindingContext);
		initXDB_AeroDyn				(m_bindingContext);
		initXDB_Noise				(m_bindingContext);
		initXDB_ADAMS				(m_bindingContext);
		initXDB_Linearization		(m_bindingContext);		
		initXDB_Output				(m_bindingContext);
		*/
		
	}

	
	protected DataBindingContext initXDB_SimulationControl (DataBindingContext bindingContext) {

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
		
		return bindingContext;
	}
	
	/*
	protected DataBindingContext initXDB_TurbineControl (DataBindingContext bindingContext) {
		// YCMode
		IObservableValue observeTextYCModeObserveWidget = WidgetProperties.singleSelectionIndex().observe(YCMode);
		IObservableValue modelValueObserveValue8 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_YCMode(), bindFastfstPackage().getiYCMode_Value())).observe(document);
		bindingContext.bindValue(observeTextYCModeObserveWidget, modelValueObserveValue8, null, null);
		//
		IObservableValue observeTextTYCOnObserveWidget = WidgetProperties.text(SWT.Modify).observe(TYCOn);
		IObservableValue modelValueObserveValue_81 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TYCOn(), bindFastfstPackage().getnTYCOn_Value())).observe(document);
		bindingContext.bindValue(observeTextTYCOnObserveWidget, modelValueObserveValue_81, null, null);
		// PCMode
		IObservableValue observeTextPCModeObserveWidget = WidgetProperties.singleSelectionIndex().observe(PCMode);
		IObservableValue modelValueObserveValue_9 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_PCMode(), bindFastfstPackage().getiPCMode_Value())).observe(document);
		bindingContext.bindValue(observeTextPCModeObserveWidget, modelValueObserveValue_9, null, null);
		//
		IObservableValue observeTextTPCOnObserveWidget = WidgetProperties.text(SWT.Modify).observe(TPCOn);
		IObservableValue modelValueObserveValue_10 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TPCOn(), bindFastfstPackage().getnTPCOn_Value())).observe(document);
		bindingContext.bindValue(observeTextTPCOnObserveWidget, modelValueObserveValue_10, null, null);
		//
		IObservableValue observeTextVSContrlObserveWidget = WidgetProperties.singleSelectionIndex().observe(VSContrl);
		IObservableValue modelValueObserveValue = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_VSContrl(), bindFastfstPackage().getiVSContrl_Value())).observe(document);
		bindingContext.bindValue(observeTextVSContrlObserveWidget, modelValueObserveValue, null, null);
		//
		IObservableValue observeTextVS_RtTqObserveWidget = WidgetProperties.text(SWT.Modify).observe(VS_RtTq);
		IObservableValue modelValueObserveValue_2 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_VS_RtTq(), bindFastfstPackage().getnVS_RtTq_Value())).observe(document);
		bindingContext.bindValue(observeTextVS_RtTqObserveWidget, modelValueObserveValue_2, null, null);
		//
		IObservableValue observeTextVS_RtGnSpObserveWidget = WidgetProperties.text(SWT.Modify).observe(VS_RtGnSp);
		IObservableValue modelValueObserveValue_1 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_VS_RtGnSp(), bindFastfstPackage().getnVS_RtGnSp_Value())).observe(document);
		bindingContext.bindValue(observeTextVS_RtGnSpObserveWidget, modelValueObserveValue_1, null, null);
		//
		IObservableValue observeTextVS_Rgn2KObserveWidget = WidgetProperties.text(SWT.Modify).observe(VS_Rgn2K);
		IObservableValue modelValueObserveValue_3 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_VS_Rgn2K(), bindFastfstPackage().getnVS_Rgn2K_Value())).observe(document);
		bindingContext.bindValue(observeTextVS_Rgn2KObserveWidget, modelValueObserveValue_3, null, null);
		//
		IObservableValue observeTextVS_SlPcObserveWidget = WidgetProperties.text(SWT.Modify).observe(VS_SlPc);
		IObservableValue modelValueObserveValue_4 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_VS_SlPc(), bindFastfstPackage().getnVS_SlPc_Value())).observe(document);
		bindingContext.bindValue(observeTextVS_SlPcObserveWidget, modelValueObserveValue_4, null, null);
		//
		IObservableValue observeTextGenModelObserveWidget = WidgetProperties.singleSelectionIndex().observe(GenModel);
		IObservableValue modelValueObserveValue_5 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_GenModel(), bindFastfstPackage().getiGenModel_Value())).observe(document);
		bindingContext.bindValue(observeTextGenModelObserveWidget, modelValueObserveValue_5, null, null);
		//
		IObservableValue observeSelectionGenTiStrObserveWidget = WidgetProperties.selection().observe(GenTiStr);
		IObservableValue modelValueObserveValue_6 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_GenTiStr(), bindFastfstPackage().getbGenTiStr_Value())).observe(document);
		bindingContext.bindValue(observeSelectionGenTiStrObserveWidget, modelValueObserveValue_6, null, null);
		//
		IObservableValue observeSelectionGenTiStpObserveWidget = WidgetProperties.selection().observe(GenTiStp);
		IObservableValue modelValueObserveValue_7 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_GenTiStp(), bindFastfstPackage().getbGenTiStp_Value())).observe(document);
		bindingContext.bindValue(observeSelectionGenTiStpObserveWidget, modelValueObserveValue_7, null, null);
		//
		IObservableValue observeTextSpdGenOnObserveWidget = WidgetProperties.text(SWT.Modify).observe(SpdGenOn);
		IObservableValue modelValueObserveValue_10a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_SpdGenOn(), bindFastfstPackage().getnSpdGenOn_Value())).observe(document);
		bindingContext.bindValue(observeTextSpdGenOnObserveWidget, modelValueObserveValue_10a, null, null);
		//
		IObservableValue observeTextTimGenOnObserveWidget = WidgetProperties.text(SWT.Modify).observe(TimGenOn);
		IObservableValue modelValueObserveValue_8 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TimGenOn(), bindFastfstPackage().getnTimGenOn_Value())).observe(document);
		bindingContext.bindValue(observeTextTimGenOnObserveWidget, modelValueObserveValue_8, null, null);
		//
		IObservableValue observeTextTimGenOfObserveWidget = WidgetProperties.text(SWT.Modify).observe(TimGenOf);
		IObservableValue modelValueObserveValue_9a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TimGenOf(), bindFastfstPackage().getnTimGenOf_Value())).observe(document);
		bindingContext.bindValue(observeTextTimGenOfObserveWidget, modelValueObserveValue_9a, null, null);
		//
		IObservableValue observeTextHSSBrModeObserveWidget = WidgetProperties.singleSelectionIndex().observe(HSSBrMode);
		IObservableValue modelValueObserveValuea = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_HSSBrMode(), bindFastfstPackage().getiHSSBrMode_Value())).observe(document);
		bindingContext.bindValue(observeTextHSSBrModeObserveWidget, modelValueObserveValuea, null, null);
		//
		IObservableValue observeTextTHSSBrDpObserveWidget = WidgetProperties.text(SWT.Modify).observe(THSSBrDp);
		IObservableValue modelValueObserveValue_1a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_THSSBrDp(), bindFastfstPackage().getnTHSSBrDp_Value())).observe(document);
		bindingContext.bindValue(observeTextTHSSBrDpObserveWidget, modelValueObserveValue_1a, null, null);
		//
		IObservableValue observeTextTiDynBrkObserveWidget = WidgetProperties.text(SWT.Modify).observe(TiDynBrk);
		IObservableValue modelValueObserveValue_2a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TiDynBrk(), bindFastfstPackage().getnTiDynBrk_Value())).observe(document);
		bindingContext.bindValue(observeTextTiDynBrkObserveWidget, modelValueObserveValue_2a, null, null);
		//
		IObservableValue observeTextTTpBrDp_1_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TTpBrDp_1_);
		IObservableValue modelValueObserveValue_3a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TTpBrDp_1_(), bindFastfstPackage().getnTTpBrDp_1__Value())).observe(document);
		bindingContext.bindValue(observeTextTTpBrDp_1_ObserveWidget, modelValueObserveValue_3a, null, null);
		//
		IObservableValue observeTextTTpBrDp_2_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TTpBrDp_2_);
		IObservableValue modelValueObserveValue_4a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TTpBrDp_2_(), bindFastfstPackage().getnTTpBrDp_2__Value())).observe(document);
		bindingContext.bindValue(observeTextTTpBrDp_2_ObserveWidget, modelValueObserveValue_4a, null, null);
		//
		IObservableValue observeTextTTpBrDp_3_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TTpBrDp_3_);
		IObservableValue modelValueObserveValue_5a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TTpBrDp_3_(), bindFastfstPackage().getnTTpBrDp_3__Value())).observe(document);
		bindingContext.bindValue(observeTextTTpBrDp_3_ObserveWidget, modelValueObserveValue_5a, null, null);
		//
		IObservableValue observeTextTBDepISp_1_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TBDepISp_1_);
		IObservableValue modelValueObserveValue_6a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TBDepISp_1_(), bindFastfstPackage().getnTBDepISp_1__Value())).observe(document);
		bindingContext.bindValue(observeTextTBDepISp_1_ObserveWidget, modelValueObserveValue_6a, null, null);
		//
		IObservableValue observeTextTBDepISp_2_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TBDepISp_2_);
		IObservableValue modelValueObserveValue_7a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TBDepISp_2_(), bindFastfstPackage().getnTBDepISp_2__Value())).observe(document);
		bindingContext.bindValue(observeTextTBDepISp_2_ObserveWidget, modelValueObserveValue_7a, null, null);
		//
		IObservableValue observeTextTBDepISp_3_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TBDepISp_3_);
		IObservableValue modelValueObserveValue_8a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TBDepISp_3_(), bindFastfstPackage().getnTBDepISp_3__Value())).observe(document);
		bindingContext.bindValue(observeTextTBDepISp_3_ObserveWidget, modelValueObserveValue_8a, null, null);
		//
		IObservableValue observeTextTYawManSObserveWidget = WidgetProperties.text(SWT.Modify).observe(TYawManS);
		IObservableValue modelValueObserveValue_83 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TYawManS(), bindFastfstPackage().getnTYawManS_Value())).observe(document);
		bindingContext.bindValue(observeTextTYawManSObserveWidget, modelValueObserveValue_83, null, null);
		//
		IObservableValue observeTextTYawManEObserveWidget = WidgetProperties.text(SWT.Modify).observe(TYawManE);
		IObservableValue modelValueObserveValue_84 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TYawManE(), bindFastfstPackage().getnTYawManE_Value())).observe(document);
		bindingContext.bindValue(observeTextTYawManEObserveWidget, modelValueObserveValue_84, null, null); 
		//		
		IObservableValue observeTextNacYawFObserveWidget = WidgetProperties.text(SWT.Modify).observe(NacYawF);
		IObservableValue modelValueObserveValue_82 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NacYawF(), bindFastfstPackage().getnTimGenOf_Value())).observe(document);
		bindingContext.bindValue(observeTextNacYawFObserveWidget, modelValueObserveValue_82, null, null);
		//
		IObservableValue observeTextTPitManS_1_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TPitManS_1_);
		IObservableValue modelValueObserveValue_11 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TPitManS_1_(), bindFastfstPackage().getnTPitManS_1__Value())).observe(document);
		bindingContext.bindValue(observeTextTPitManS_1_ObserveWidget, modelValueObserveValue_11, null, null);
		//
		IObservableValue observeTextTPitManS_2_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TPitManS_2_);
		IObservableValue modelValueObserveValue_12 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TPitManS_2_(), bindFastfstPackage().getnTPitManS_2__Value())).observe(document);
		bindingContext.bindValue(observeTextTPitManS_2_ObserveWidget, modelValueObserveValue_12, null, null);
		//
		IObservableValue observeTextTPitManS_3_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TPitManS_3_);
		IObservableValue modelValueObserveValue_13 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TPitManS_3_(), bindFastfstPackage().getnTPitManS_3__Value())).observe(document);
		bindingContext.bindValue(observeTextTPitManS_3_ObserveWidget, modelValueObserveValue_13, null, null);
		//
		IObservableValue observeTextTPitManE_1_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TPitManE_1_);
		IObservableValue modelValueObserveValue_14 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TPitManE_1_(), bindFastfstPackage().getnTPitManE_1__Value())).observe(document);
		bindingContext.bindValue(observeTextTPitManE_1_ObserveWidget, modelValueObserveValue_14, null, null);
		//
		IObservableValue observeTextTPitManE_2_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TPitManE_2_);
		IObservableValue modelValueObserveValue_15 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TPitManE_2_(), bindFastfstPackage().getnTPitManE_2__Value())).observe(document);
		bindingContext.bindValue(observeTextTPitManE_2_ObserveWidget, modelValueObserveValue_15, null, null);
		//
		IObservableValue observeTextTPitManE_3_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TPitManE_3_);
		IObservableValue modelValueObserveValue_16 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TPitManE_3_(), bindFastfstPackage().getnTPitManE_3__Value())).observe(document);
		bindingContext.bindValue(observeTextTPitManE_3_ObserveWidget, modelValueObserveValue_16, null, null);
		//
		IObservableValue observeTextBlPitch_1_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(BlPitch_1_);
		IObservableValue modelValueObserveValue_17 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_BlPitch_1_(), bindFastfstPackage().getnBlPitch_1__Value())).observe(document);
		bindingContext.bindValue(observeTextBlPitch_1_ObserveWidget, modelValueObserveValue_17, null, null);
		//
		IObservableValue observeTextBlPitch_2_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(BlPitch_2_);
		IObservableValue modelValueObserveValue_18 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_BlPitch_2_(), bindFastfstPackage().getnBlPitch_2__Value())).observe(document);
		bindingContext.bindValue(observeTextBlPitch_2_ObserveWidget, modelValueObserveValue_18, null, null);
		//
		IObservableValue observeTextBlPitch_3_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(BlPitch_3_);
		IObservableValue modelValueObserveValue_19 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_BlPitch_3_(), bindFastfstPackage().getnBlPitch_3__Value())).observe(document);
		bindingContext.bindValue(observeTextBlPitch_3_ObserveWidget, modelValueObserveValue_19, null, null);
		//
		IObservableValue observeTextB1PitchF_1_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(B1PitchF_1_);
		IObservableValue modelValueObserveValue_20 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_BlPitchF_1_(), bindFastfstPackage().getnBlPitchF_1__Value())).observe(document);
		bindingContext.bindValue(observeTextB1PitchF_1_ObserveWidget, modelValueObserveValue_20, null, null);
		//
		IObservableValue observeTextB1PitchF_2_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(B1PitchF_2_);
		IObservableValue modelValueObserveValue_21 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_BlPitchF_2_(), bindFastfstPackage().getnBlPitchF_2__Value())).observe(document);
		bindingContext.bindValue(observeTextB1PitchF_2_ObserveWidget, modelValueObserveValue_21, null, null);
		//
		IObservableValue observeTextB1PitchF_3_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(B1PitchF_3_);
		IObservableValue modelValueObserveValue_22 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_BlPitchF_3_(), bindFastfstPackage().getnBlPitchF_3__Value())).observe(document);
		bindingContext.bindValue(observeTextB1PitchF_3_ObserveWidget, modelValueObserveValue_22, null, null);
		
		return bindingContext;
	}
	protected DataBindingContext initXDB_Environment (DataBindingContext bindingContext) {
		//
		IObservableValue observeTextGravityObserveWidget = WidgetProperties.text(SWT.Modify).observe(Gravity);
		IObservableValue modelValueObserveValue_48 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_Gravity(), bindFastfstPackage().getnGravity_Value())).observe(document);
		bindingContext.bindValue(observeTextGravityObserveWidget, modelValueObserveValue_48, null, null);

		return bindingContext;
	}
	protected DataBindingContext initXDB_TurbineConfiguration (DataBindingContext bindingContext) {

		// TipRad
		IObservableValue observeTextTipRadObserveWidget = WidgetProperties.text(SWT.Modify).observe(TipRad);
		IObservableValue modelValueObserveValue_1 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TipRad(), bindFastfstPackage().getnTipRad_Value())).observe(document);
		bindingContext.bindValue(observeTextTipRadObserveWidget, modelValueObserveValue_1, null, null);
		//
		IObservableValue observeTextHubRadObserveWidget = WidgetProperties.text(SWT.Modify).observe(HubRad);
		IObservableValue modelValueObserveValue_2 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_HubRad(), bindFastfstPackage().getnHubRad_Value())).observe(document);
		bindingContext.bindValue(observeTextHubRadObserveWidget, modelValueObserveValue_2, null, null);
		//
		IObservableValue observeTextPSpnElNObserveWidget = WidgetProperties.text(SWT.Modify).observe(PSpnElN);
		IObservableValue modelValueObserveValue_3 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_PSpnElN(), bindFastfstPackage().getnPSpnElN_Value())).observe(document);
		bindingContext.bindValue(observeTextPSpnElNObserveWidget, modelValueObserveValue_3, null, null);
		//
		IObservableValue observeTextUndSlingObserveWidget = WidgetProperties.text(SWT.Modify).observe(UndSling);
		IObservableValue modelValueObserveValue_4 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_UndSling(), bindFastfstPackage().getnUndSling_Value())).observe(document);
		bindingContext.bindValue(observeTextUndSlingObserveWidget, modelValueObserveValue_4, null, null);
		//
		IObservableValue observeTextHubCMObserveWidget = WidgetProperties.text(SWT.Modify).observe(HubCM);
		IObservableValue modelValueObserveValue_5 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_HubCM(), bindFastfstPackage().getnHubCM_Value())).observe(document);
		bindingContext.bindValue(observeTextHubCMObserveWidget, modelValueObserveValue_5, null, null);
		//
		IObservableValue observeTextOverHangObserveWidget = WidgetProperties.text(SWT.Modify).observe(OverHang);
		IObservableValue modelValueObserveValue_6 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_OverHang(), bindFastfstPackage().getnOverHang_Value())).observe(document);
		bindingContext.bindValue(observeTextOverHangObserveWidget, modelValueObserveValue_6, null, null);
		//
		IObservableValue observeTextNacCMxnObserveWidget = WidgetProperties.text(SWT.Modify).observe(NacCMxn);
		IObservableValue modelValueObserveValue_7 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NacCMxn(), bindFastfstPackage().getnNacCMxn_Value())).observe(document);
		bindingContext.bindValue(observeTextNacCMxnObserveWidget, modelValueObserveValue_7, null, null);
		//
		IObservableValue observeTextNacCMynObserveWidget = WidgetProperties.text(SWT.Modify).observe(NacCMyn);
		IObservableValue modelValueObserveValue_8 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NacCMyn(), bindFastfstPackage().getnNacCMyn_Value())).observe(document);
		bindingContext.bindValue(observeTextNacCMynObserveWidget, modelValueObserveValue_8, null, null);
		//
		IObservableValue observeTextNacCMznObserveWidget = WidgetProperties.text(SWT.Modify).observe(NacCMzn);
		IObservableValue modelValueObserveValue_9 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NacCMzn(), bindFastfstPackage().getnNacCMzn_Value())).observe(document);
		bindingContext.bindValue(observeTextNacCMznObserveWidget, modelValueObserveValue_9, null, null);
		//
		IObservableValue observeTextTowerHtObserveWidget = WidgetProperties.text(SWT.Modify).observe(TowerHt);
		IObservableValue modelValueObserveValue_10 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TowerHt(), bindFastfstPackage().getnTowerHt_Value())).observe(document);
		bindingContext.bindValue(observeTextTowerHtObserveWidget, modelValueObserveValue_10, null, null);
		//
		IObservableValue observeTextTwr2ShftObserveWidget = WidgetProperties.text(SWT.Modify).observe(Twr2Shft);
		IObservableValue modelValueObserveValuee = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_Twr2Shft(), bindFastfstPackage().getnTwr2Shft_Value())).observe(document);
		bindingContext.bindValue(observeTextTwr2ShftObserveWidget, modelValueObserveValuee, null, null);
		//
		IObservableValue observeTextTwrRBHtObserveWidget = WidgetProperties.text(SWT.Modify).observe(TwrRBHt);
		IObservableValue modelValueObserveValue_1a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TwrRBHt(), bindFastfstPackage().getnTwrRBHt_Value())).observe(document);
		bindingContext.bindValue(observeTextTwrRBHtObserveWidget, modelValueObserveValue_1a, null, null);
		//
		IObservableValue observeTextShftTiltObserveWidget = WidgetProperties.text(SWT.Modify).observe(ShftTilt);
		IObservableValue modelValueObserveValue_2a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_ShftTilt(), bindFastfstPackage().getnShftTilt_Value())).observe(document);
		bindingContext.bindValue(observeTextShftTiltObserveWidget, modelValueObserveValue_2a, null, null);
		//
		IObservableValue observeTextDelta3ObserveWidget = WidgetProperties.text(SWT.Modify).observe(Delta3);
		IObservableValue modelValueObserveValue_3a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_Delta3(), bindFastfstPackage().getnDelta3_Value())).observe(document);
		bindingContext.bindValue(observeTextDelta3ObserveWidget, modelValueObserveValue_3a, null, null);
		//
		IObservableValue observeTextPreCone_1_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(PreCone_1_);
		IObservableValue modelValueObserveValue_4a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_PreCone_1_(), bindFastfstPackage().getnPreCone_1__Value())).observe(document);
		bindingContext.bindValue(observeTextPreCone_1_ObserveWidget, modelValueObserveValue_4a, null, null);
		//
		IObservableValue observeTextPreCone_2_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(PreCone_2_);
		IObservableValue modelValueObserveValue_5a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_PreCone_2_(), bindFastfstPackage().getnPreCone_2__Value())).observe(document);
		bindingContext.bindValue(observeTextPreCone_2_ObserveWidget, modelValueObserveValue_5a, null, null);
		//
		IObservableValue observeTextPreCone_3_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(PreCone_3_);
		IObservableValue modelValueObserveValue_6a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_PreCone_3_(), bindFastfstPackage().getnPreCone_3__Value())).observe(document);
		bindingContext.bindValue(observeTextPreCone_3_ObserveWidget, modelValueObserveValue_6a, null, null);
		//
		IObservableValue observeTextAzimB1UpObserveWidget = WidgetProperties.text(SWT.Modify).observe(AzimB1Up);
		IObservableValue modelValueObserveValue_7a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_Azimuth(), bindFastfstPackage().getnAzimuth_Value())).observe(document);
		bindingContext.bindValue(observeTextAzimB1UpObserveWidget, modelValueObserveValue_7a, null, null);
		return bindingContext;

	}
	protected DataBindingContext initXDB_MassAndInertia(DataBindingContext bindingContext) {
		//
		IObservableValue observeTextYawBrMassObserveWidget = WidgetProperties.text(SWT.Modify).observe(YawBrMass);
		IObservableValue modelValueObserveValue_8a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_YawBrMass(), bindFastfstPackage().getnYawBrMass_Value())).observe(document);
		bindingContext.bindValue(observeTextYawBrMassObserveWidget, modelValueObserveValue_8a, null, null);
		//
		IObservableValue observeTextNacMassObserveWidget = WidgetProperties.text(SWT.Modify).observe(NacMass);
		IObservableValue modelValueObserveValue_9a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NacMass(), bindFastfstPackage().getnNacMass_Value())).observe(document);
		bindingContext.bindValue(observeTextNacMassObserveWidget, modelValueObserveValue_9a, null, null);
		//
		IObservableValue observeTextHubMassObserveWidget = WidgetProperties.text(SWT.Modify).observe(HubMass);
		IObservableValue modelValueObserveValue_9z = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_HubMass(), bindFastfstPackage().getnHubMass_Value())).observe(document);
		bindingContext.bindValue(observeTextHubMassObserveWidget, modelValueObserveValue_9z, null, null);
		//
		IObservableValue observeTextTipMass_1_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TipMass_1_);
		IObservableValue modelValueObserveValue_10a = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TipMass_1_(), bindFastfstPackage().getnTipMass_1__Value())).observe(document);
		bindingContext.bindValue(observeTextTipMass_1_ObserveWidget, modelValueObserveValue_10a, null, null);
		//
		IObservableValue observeTextTipMass_2_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TipMass_2_);
		IObservableValue modelValueObserveValue_11 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TipMass_2_(), bindFastfstPackage().getnTipMass_2__Value())).observe(document);
		bindingContext.bindValue(observeTextTipMass_2_ObserveWidget, modelValueObserveValue_11, null, null);
		//
		IObservableValue observeTextTipMass_3_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TipMass_3_);
		IObservableValue modelValueObserveValue_12 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TipMass_3_(), bindFastfstPackage().getnTipMass_3__Value())).observe(document);
		bindingContext.bindValue(observeTextTipMass_3_ObserveWidget, modelValueObserveValue_12, null, null);
		//
		IObservableValue observeTextNacYInerObserveWidget = WidgetProperties.text(SWT.Modify).observe(NacYIner);
		IObservableValue modelValueObserveValue_13 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NacYIner(), bindFastfstPackage().getnNacYIner_Value())).observe(document);
		bindingContext.bindValue(observeTextNacYInerObserveWidget, modelValueObserveValue_13, null, null);
		//
		IObservableValue observeTextGenInerObserveWidget = WidgetProperties.text(SWT.Modify).observe(GenIner);
		IObservableValue modelValueObserveValue_14 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_GenIner(), bindFastfstPackage().getnGenIner_Value())).observe(document);
		bindingContext.bindValue(observeTextGenInerObserveWidget, modelValueObserveValue_14, null, null);
		//
		IObservableValue observeTextHubInerObserveWidget = WidgetProperties.text(SWT.Modify).observe(HubIner);
		IObservableValue modelValueObserveValue_15 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_HubIner(), bindFastfstPackage().getnHubIner_Value())).observe(document);
		bindingContext.bindValue(observeTextHubInerObserveWidget, modelValueObserveValue_15, null, null);

		return bindingContext;
	}
	protected DataBindingContext initXDB_AeroDyn(DataBindingContext bindingContext) {

		//
		IObservableValue observeTextADFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(ADFile);
		IObservableValue modelValueObserveValue = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_ADFile(), bindFastfstPackage().getfADAMSFile_Value())).observe(document);
		bindingContext.bindValue(observeTextADFileObserveWidget, modelValueObserveValue,
				new UpdateValueStrategy().setAfterConvertValidator(
						new FileValidator("File doesn't exist",cdADFile,uri)
						), 
						null);

		return bindingContext;

	}
	protected DataBindingContext initXDB_PlatformModel(DataBindingContext bindingContext) {

		// PlatformModel
		IObservableValue observeTextPlatformModelObserveWidget = WidgetProperties.singleSelectionIndex().observe(PlatformModel);
		IObservableValue modelValueObserveValue_PlatformModel = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_PtfmModel(), bindFastfstPackage().getiPtfmModel_Value())).observe(document);
		bindingContext.bindValue(observeTextPlatformModelObserveWidget, modelValueObserveValue_PlatformModel, null, null);
		//
		IObservableValue observeTextPtfmFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(PtfmFile);
		IObservableValue modelValueObserveValue_16 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_PtfmFile(), bindFastfstPackage().getfPtfmFile_Value())).observe(document);
		bindingContext.bindValue(observeTextPtfmFileObserveWidget, modelValueObserveValue_16,
				new UpdateValueStrategy().setAfterConvertValidator(
						new FileValidator("File doesn't exist",cdPtfmFile,uri)
						), 
						null);

		return bindingContext;

	}
	protected DataBindingContext initXDB_Tower(DataBindingContext bindingContext) {

		//
		IObservableValue observeTextTwrNodesObserveWidget = WidgetProperties.text(SWT.Modify).observe(TwrNodes);
		IObservableValue modelValueObserveValue_TwrNodes = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TwrNodes(), bindFastfstPackage().getiTwrNodes_Value())).observe(document);
		bindingContext.bindValue(observeTextTwrNodesObserveWidget, modelValueObserveValue_TwrNodes, null, null);
		//
		IObservableValue observeTextTwrFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(TwrFile);
		IObservableValue modelValueObserveValue_TwrFile = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TwrFile(), bindFastfstPackage().getfTwrFile_Value())).observe(document);
		bindingContext.bindValue(observeTextTwrFileObserveWidget, modelValueObserveValue_TwrFile, null, null);

		return bindingContext;

	}
	protected DataBindingContext initXDB_NacelleYaw(DataBindingContext bindingContext) {

		//
		IObservableValue observeTextYawSprObserveWidget = WidgetProperties.text(SWT.Modify).observe(YawSpr);
		IObservableValue modelValueObserveValue = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_YawSpr(), bindFastfstPackage().getnYawSpr_Value())).observe(document);
		bindingContext.bindValue(observeTextYawSprObserveWidget, modelValueObserveValue, null, null);
		//
		IObservableValue observeTextYawDampObserveWidget = WidgetProperties.text(SWT.Modify).observe(YawDamp);
		IObservableValue modelValueObserveValue_1 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_YawDamp(), bindFastfstPackage().getnYawDamp_Value())).observe(document);
		bindingContext.bindValue(observeTextYawDampObserveWidget, modelValueObserveValue_1, null, null);
		//
		IObservableValue observeTextYawNeutObserveWidget = WidgetProperties.text(SWT.Modify).observe(YawNeut);
		IObservableValue modelValueObserveValue_2 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_YawNeut(), bindFastfstPackage().getnYawNeut_Value())).observe(document);
		bindingContext.bindValue(observeTextYawNeutObserveWidget, modelValueObserveValue_2, null, null);

		return bindingContext;
	}
	protected DataBindingContext initXDB_Drivetrain(DataBindingContext bindingContext) {
		//
		IObservableValue observeTextGBoxEffObserveWidget = WidgetProperties.text(SWT.Modify).observe(GBoxEff);
		IObservableValue modelValueObserveValue_3 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_GBoxEff(), bindFastfstPackage().getnGBoxEff_Value())).observe(document);
		bindingContext.bindValue(observeTextGBoxEffObserveWidget, modelValueObserveValue_3, null, null);
		//
		IObservableValue observeTextGBRatioObserveWidget = WidgetProperties.text(SWT.Modify).observe(GBRatio);
		IObservableValue modelValueObserveValue_4 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_GBRatio(), bindFastfstPackage().getnGBRatio_Value())).observe(document);
		bindingContext.bindValue(observeTextGBRatioObserveWidget, modelValueObserveValue_4, null, null);
		//
		IObservableValue observeSelectionGBReversObserveWidget = WidgetProperties.selection().observe(GBRevers);
		IObservableValue modelValueObserveValue_5 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_GBRevers(), bindFastfstPackage().getbGBRevers_Value())).observe(document);
		bindingContext.bindValue(observeSelectionGBReversObserveWidget, modelValueObserveValue_5, null, null);
		//
		IObservableValue observeTextGenEffObserveWidget = WidgetProperties.text(SWT.Modify).observe(GenEff);
		IObservableValue modelValueObserveValue_6 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_GenEff(), bindFastfstPackage().getnGenEff_Value())).observe(document);
		bindingContext.bindValue(observeTextGenEffObserveWidget, modelValueObserveValue_6, null, null);
		//
		IObservableValue observeTextHSSBrTqFObserveWidget = WidgetProperties.text(SWT.Modify).observe(HSSBrTqF);
		IObservableValue modelValueObserveValue_7 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_HSSBrTqF(), bindFastfstPackage().getnHSSBrTqF_Value())).observe(document);
		bindingContext.bindValue(observeTextHSSBrTqFObserveWidget, modelValueObserveValue_7, null, null);
		//
		IObservableValue observeTextHSSBrDTObserveWidget = WidgetProperties.text(SWT.Modify).observe(HSSBrDT);
		IObservableValue modelValueObserveValue_8 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_HSSBrDT(), bindFastfstPackage().getnHSSBrDT_Value())).observe(document);
		bindingContext.bindValue(observeTextHSSBrDTObserveWidget, modelValueObserveValue_8, null, null);
		//
		IObservableValue observeTextDynBrkFiObserveWidget = WidgetProperties.text(SWT.Modify).observe(DynBrkFi);
		IObservableValue modelValueObserveValue_9 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_DynBrkFi(), bindFastfstPackage().getfDynBrkFi_Value())).observe(document);
		bindingContext.bindValue(observeTextDynBrkFiObserveWidget, modelValueObserveValue_9, null, null);
		//
		IObservableValue observeTextDTTorSprObserveWidget = WidgetProperties.text(SWT.Modify).observe(DTTorSpr);
		IObservableValue modelValueObserveValue_10 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_DTTorSpr(), bindFastfstPackage().getnDTTorSpr_Value())).observe(document);
		bindingContext.bindValue(observeTextDTTorSprObserveWidget, modelValueObserveValue_10, null, null);
		//
		IObservableValue observeTextDTTorDmpObserveWidget = WidgetProperties.text(SWT.Modify).observe(DTTorDmp);
		IObservableValue modelValueObserveValue_11 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_DTTorDmp(), bindFastfstPackage().getnDTTorDmp_Value())).observe(document);
		bindingContext.bindValue(observeTextDTTorDmpObserveWidget, modelValueObserveValue_11, null, null);

		return bindingContext;
	}

	*/
	
	public IContentOutlinePage getContentOutline() {
		// TODO Auto-generated method stub
		return null;
	}

}
