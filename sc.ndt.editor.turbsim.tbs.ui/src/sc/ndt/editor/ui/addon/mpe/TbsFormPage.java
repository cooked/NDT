package sc.ndt.editor.ui.addon.mpe;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationListener;
import org.eclipse.jface.viewers.ColumnViewerEditorDeactivationEvent;
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
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.swt.WidgetProperties;

import sc.ndt.commons.model.AirfoilFile;
import sc.ndt.commons.model.AirfoilList;
import sc.ndt.commons.model.BladeNodeAero;
import sc.ndt.commons.model.BladeNodeAeroList;
import sc.ndt.commons.model.OutList;
import sc.ndt.commons.model.OutListRegistry;
import sc.ndt.commons.model.providers.airfoils.AirfoilCellEditorProvider;
import sc.ndt.commons.model.providers.airfoils.AirfoilListLabelProvider;
import sc.ndt.commons.ui.editor.IXtextFormEditor;
import sc.ndt.editor.turbsimtbs.ModelTurbsimtbs;
import sc.ndt.editor.turbsimtbs.TurbsimtbsPackage;

import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.FeaturePath;

import ch.vorburger.xtext.databinding.XtextDataBindingContext;
import ch.vorburger.xtext.databinding.XtextProperties;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;

import com.google.inject.Injector;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.RowData;

public class TbsFormPage extends FormPage {

	private IXtextDocument document;

	private DataBindingContext m_bindingContext;

	public OutList outList = OutListRegistry.getInstance().getNewOutList();

	private ScrolledForm form;
	private FormToolkit toolkit;
	private IToolBarManager manager;
	private String list;

	public URI uri;
	private FieldDecoration fieldDecINF;
	private FieldDecoration fieldDecERR;
	private Text NumGrid_Z;
	private Text TwrShad;
	private Text TimeStep;
	private Text AnalysisTime;
	private Text UsableTime;
	private Text HubHt;
	private Text GridHeight;

	private AirfoilList 	al = new AirfoilList();
	private BladeNodeAeroList 	as = new BladeNodeAeroList();
	
	private ModelTurbsimtbs m;

	private Button WrFHHTP;

	private Button WrADHH;

	private Button WrADFF;

	private Button WrBLFF;

	private Button WrADTWR;

	private Button WrFMTFF;

	private Button WrACT;
	private Text GridWidth;
	private Text HFlowAng;
	private Text VFlowAng;
	
	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public TbsFormPage(String id, String title) {
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
	public TbsFormPage(FormEditor editor, String id, String title) {
		super(editor, id, title);

		if(document==null && getEditor() instanceof IXtextFormEditor) {
			XtextEditor e = ((IXtextFormEditor)getEditor()).getXtextEditor("adn");
			document = e.getDocument();
		}
		
		/*list = document.readOnly(new IUnitOfWork<String,XtextResource>() {

			public String exec(XtextResource resource) {
				m = (ModelTurbsimtbs)resource.getContents().get(0);
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
			as.add(new BladeNodeAero(
					ast.getRnodes().get(i),
					ast.getAerotwst().get(i),
					ast.getDrnodes().get(i),
					ast.getChord().get(i),
					ast.getNfoil().get(i),
					ast.getPrnelm().get(i) ));
		}
		 
		al.setAirfoilList(list);
		*/
		
	}

	private TurbsimtbsPackage bindTurbsimtbsPackage() {
		return TurbsimtbsPackage.eINSTANCE;
	}

	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {

		form = managedForm.getForm();
		form.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));		
		form.setText("TurbSim Input File");

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

		// control decoration
		fieldDecERR = FieldDecorationRegistry.getDefault().getFieldDecoration(
				FieldDecorationRegistry.DEC_ERROR);
		managedForm.getForm().getBody().setLayout(new FillLayout(SWT.VERTICAL));
		
		Composite composite_2 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
		managedForm.getToolkit().adapt(composite_2);
		managedForm.getToolkit().paintBordersFor(composite_2);
		composite_2.setLayout(new GridLayout(2, false));
		
		Composite composite_4 = new Composite(composite_2, SWT.NONE);
		composite_4.setLayout(new FillLayout(SWT.VERTICAL));
		composite_4.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		managedForm.getToolkit().adapt(composite_4);
		managedForm.getToolkit().paintBordersFor(composite_4);
		
		Section sctnNewSection = managedForm.getToolkit().createSection(composite_4, Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnNewSection);
		sctnNewSection.setText("Output");
		sctnNewSection.setExpanded(true);
		
		Composite composite_1 = new Composite(sctnNewSection, SWT.NONE);
		sctnNewSection.setClient(composite_1);
		managedForm.getToolkit().adapt(composite_1);
		managedForm.getToolkit().paintBordersFor(composite_1);
		GridLayout gl_composite_1 = new GridLayout(1, false);
		gl_composite_1.verticalSpacing = 1;
		composite_1.setLayout(gl_composite_1);
		
		Button WrBHHTP = new Button(composite_1, SWT.CHECK);
		WrBHHTP.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		managedForm.getToolkit().adapt(WrBHHTP, true, true);
		WrBHHTP.setText("hub-height turbulence binary file (*.bin)");
		
		WrFHHTP = new Button(composite_1, SWT.CHECK);
		managedForm.getToolkit().adapt(WrFHHTP, true, true);
		WrFHHTP.setText("hub-height turbulence formatted file (*.dat)");
		
		WrADHH = new Button(composite_1, SWT.CHECK);
		managedForm.getToolkit().adapt(WrADHH, true, true);
		WrADHH.setText("hub-height time-series AeroDyn file (*.hh)");
		
		WrADFF = new Button(composite_1, SWT.CHECK);
		managedForm.getToolkit().adapt(WrADFF, true, true);
		WrADFF.setText("full-field time-series TurbSim/AeroDyn file (*.bts)");
		
		WrBLFF = new Button(composite_1, SWT.CHECK);
		managedForm.getToolkit().adapt(WrBLFF, true, true);
		WrBLFF.setText("full-field time-series BLADED/AeroDyn file (*.wnd)");
		
		WrADTWR = new Button(composite_1, SWT.CHECK);
		managedForm.getToolkit().adapt(WrADTWR, true, true);
		WrADTWR.setText("tower time-series file (*.twr)");
		
		WrFMTFF = new Button(composite_1, SWT.CHECK);
		managedForm.getToolkit().adapt(WrFMTFF, true, true);
		WrFMTFF.setText("full-field time-series formatted files (*.u,*.v,*.w)");
		
		WrACT = new Button(composite_1, SWT.CHECK);
		managedForm.getToolkit().adapt(WrACT, true, true);
		WrACT.setText("coherent turbulence time-step AeroDyn file (*.cts)");
		
		
		Section sctnOutputList = managedForm.getToolkit().createSection(composite_4, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnOutputList);
		sctnOutputList.setText("Blade");
		
		Composite composite = managedForm.getToolkit().createComposite(sctnOutputList, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite);
		sctnOutputList.setClient(composite);
		composite.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel_3 = managedForm.getToolkit().createLabel(composite, "New Label", SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		Combo combo = new Combo(composite, SWT.NONE);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(combo);
		managedForm.getToolkit().paintBordersFor(combo);
		
		Label lblNewLabel_5 = managedForm.getToolkit().createLabel(composite, "New Label", SWT.NONE);
		lblNewLabel_5.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		Combo combo_1 = new Combo(composite, SWT.NONE);
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(combo_1);
		managedForm.getToolkit().paintBordersFor(combo_1);
		
		Label lblNewLabel_6 = managedForm.getToolkit().createLabel(composite, "New Label", SWT.NONE);
		lblNewLabel_6.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		Combo combo_2 = new Combo(composite, SWT.NONE);
		combo_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(combo_2);
		managedForm.getToolkit().paintBordersFor(combo_2);
		
		Label lblNewLabel_11 = managedForm.getToolkit().createLabel(composite, "New Label", SWT.NONE);
		lblNewLabel_11.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		Combo combo_3 = new Combo(composite, SWT.NONE);
		combo_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(combo_3);
		managedForm.getToolkit().paintBordersFor(combo_3);
		
		Section sctnNewSection_1 = managedForm.getToolkit().createSection(composite_2, Section.TWISTIE | Section.TITLE_BAR);
		sctnNewSection_1.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
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
		
		Button Clockwise = new Button(composite_3, SWT.CHECK);
		Clockwise.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		managedForm.getToolkit().adapt(Clockwise, true, true);
		Clockwise.setText("Clockwise rotation looking downwind");
		new Label(composite_3, SWT.NONE);
		
		Button ScaleIEC = new Button(composite_3, SWT.CHECK);
		managedForm.getToolkit().adapt(ScaleIEC, true, true);
		ScaleIEC.setText("Scale hub-height IEC turbulence to target TI");
		new Label(composite_3, SWT.NONE);
		
		Label lblNewLabel_4 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_4, true, true);
		lblNewLabel_4.setText("Vertical grid-point matrix dimension");
		
		NumGrid_Z = new Text(composite_3, SWT.BORDER);
		NumGrid_Z.setToolTipText("NumGrid_Z");
		NumGrid_Z.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(NumGrid_Z, true, true);
		
		Label lblNewLabel_7 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_7, true, true);
		lblNewLabel_7.setText("NumGrid_Y");
		
		TwrShad = new Text(composite_3, SWT.BORDER);
		TwrShad.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(TwrShad, true, true);
		
		Label lblTowershadowHalfWidth = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblTowershadowHalfWidth, true, true);
		lblTowershadowHalfWidth.setText("Timestep");
		
		TimeStep = new Text(composite_3, SWT.BORDER);
		TimeStep.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(TimeStep, true, true);
		
		Label lblTowershadowReferencePoint = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblTowershadowReferencePoint, true, true);
		lblTowershadowReferencePoint.setText("AnalysisTime:");
		
		AnalysisTime = new Text(composite_3, SWT.BORDER);
		AnalysisTime.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(AnalysisTime, true, true);
		
		Label lblNewLabel_8 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_8, true, true);
		lblNewLabel_8.setText("UsableTime");
		
		UsableTime = new Text(composite_3, SWT.BORDER);
		UsableTime.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(UsableTime, true, true);
		
		Label lblNewLabel_9 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_9, true, true);
		lblNewLabel_9.setText("HubHt");
		
		HubHt = new Text(composite_3, SWT.BORDER);
		HubHt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(HubHt, true, true);
		
		Label lblNewLabel_10 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_10, true, true);
		lblNewLabel_10.setText("GridHeight");
		
		GridHeight = new Text(composite_3, SWT.BORDER);
		GridHeight.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(GridHeight, true, true);
		
		Label lblNewLabel = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel, true, true);
		lblNewLabel.setText("GridWidth");
		
		GridWidth = new Text(composite_3, SWT.BORDER);
		GridWidth.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(GridWidth, true, true);
		
		Label lblNewLabel_1 = new Label(composite_3, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText("VFlowAng");
		
		VFlowAng = new Text(composite_3, SWT.BORDER);
		VFlowAng.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(VFlowAng, true, true);
		
		Label lblNewLabel_2 = new Label(composite_3, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblNewLabel_2, true, true);
		lblNewLabel_2.setText("HFlowAng");
		
		HFlowAng = new Text(composite_3, SWT.BORDER);
		HFlowAng.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(HFlowAng, true, true);
		
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
		
		initXDB_Output	(m_bindingContext);
		
		
	}

	
	protected DataBindingContext initXDB_Output (DataBindingContext bindingContext) {

		//
		IObservableValue observeSelectionWrFHHTPObserveWidget = WidgetProperties.selection().observe(WrFHHTP);
		IObservableValue modelValueObsWrFHHTP = XtextProperties.value(FeaturePath.fromList(bindTurbsimtbsPackage().getModelTurbsimtbs_WrFHHTP(), bindTurbsimtbsPackage().getbWrFHHTP_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrFHHTPObserveWidget, modelValueObsWrFHHTP, null, null);
		//
		IObservableValue observeSelectionWrADHHObserveWidget = WidgetProperties.selection().observe(WrADHH);
		IObservableValue modelValueObsWrADHH = XtextProperties.value(FeaturePath.fromList(bindTurbsimtbsPackage().getModelTurbsimtbs_WrADHH(), bindTurbsimtbsPackage().getbWrADHH_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrADHHObserveWidget, modelValueObsWrADHH, null, null);
		//
		IObservableValue observeSelectionWrADFFObserveWidget = WidgetProperties.selection().observe(WrADFF);
		IObservableValue modelValueObsWrADFF = XtextProperties.value(FeaturePath.fromList(bindTurbsimtbsPackage().getModelTurbsimtbs_WrADFF(), bindTurbsimtbsPackage().getbWrADFF_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrADFFObserveWidget, modelValueObsWrADFF, null, null);
		//
		IObservableValue observeSelectionWrBLFFObserveWidget = WidgetProperties.selection().observe(WrBLFF);
		IObservableValue modelValueObsWrBLFF = XtextProperties.value(FeaturePath.fromList(bindTurbsimtbsPackage().getModelTurbsimtbs_WrBLFF(), bindTurbsimtbsPackage().getbWrBLFF_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrBLFFObserveWidget, modelValueObsWrBLFF, null, null);
		//
		IObservableValue observeSelectionWrADTWRObserveWidget = WidgetProperties.selection().observe(WrADTWR);
		IObservableValue modelValueObsWrADTWR = XtextProperties.value(FeaturePath.fromList(bindTurbsimtbsPackage().getModelTurbsimtbs_WrADTWR(), bindTurbsimtbsPackage().getbWrADTWR_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrADTWRObserveWidget, modelValueObsWrADTWR, null, null);
		//
		IObservableValue observeSelectionWrFMTFFObserveWidget = WidgetProperties.selection().observe(WrFMTFF);
		IObservableValue modelValueObsWrFMTFF = XtextProperties.value(FeaturePath.fromList(bindTurbsimtbsPackage().getModelTurbsimtbs_WrFMTFF(), bindTurbsimtbsPackage().getbWrFMTFF_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrFMTFFObserveWidget, modelValueObsWrFMTFF, null, null);
		//
		IObservableValue observeSelectionWrACTObserveWidget = WidgetProperties.selection().observe(WrACT);
		IObservableValue modelValueObsWrACT = XtextProperties.value(FeaturePath.fromList(bindTurbsimtbsPackage().getModelTurbsimtbs_WrACT(), bindTurbsimtbsPackage().getbWrACT_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrACTObserveWidget, modelValueObsWrACT, null, null);
		
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
