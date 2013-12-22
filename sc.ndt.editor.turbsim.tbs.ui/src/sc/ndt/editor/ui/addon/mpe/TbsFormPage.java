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
import org.eclipse.swt.widgets.Spinner;

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
	private Spinner NumGrid_Z;
	private Spinner NumGrid_Y;
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
	private Text ETMc;
	private Text RefHt;
	private Text Uref;
	private Text ZJetMax;
	private Text Z0;
	private Text PLExp;
	private Text Location;
	private Text RICH_NO;
	private Text ZI;
	private Text PC_UW;
	private Text PC_UV;
	private Text PC_VW;
	private Text IncDec1;
	private Text IncDec2;
	private Text IncDec3;
	private Text UStar;
	private Text DistScl;
	private Text CTLy;
	private Text CTLz;
	private Text CTStartTime;

	private Combo TurbModel;

	private Combo IECstandard;

	private Combo IECturbc;

	private Combo IEC_WindType;

	private Combo WindProfileType;
	private Text CohExp;
	private Combo CTEventPath;
	private Combo CTEventFile;
	private Button Randomize;
	
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

	private TurbsimtbsPackage bindTbsPkg() {
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
		composite_4.setLayout(new GridLayout(1, false));
		composite_4.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		managedForm.getToolkit().adapt(composite_4);
		managedForm.getToolkit().paintBordersFor(composite_4);
		
		Section sctnNewSection_1 = managedForm.getToolkit().createSection(composite_4, Section.TWISTIE | Section.TITLE_BAR);
		sctnNewSection_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sctnNewSection_1);
		sctnNewSection_1.setText("Model");
		
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
		
		Composite composite_9 = new Composite(composite_3, SWT.NONE);
		composite_9.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
		managedForm.getToolkit().adapt(composite_9);
		managedForm.getToolkit().paintBordersFor(composite_9);
		GridLayout gl_composite_9 = new GridLayout(3, false);
		gl_composite_9.marginWidth = 0;
		composite_9.setLayout(gl_composite_9);
		
		Label lblNewLabel_4 = new Label(composite_9, SWT.NONE);
		lblNewLabel_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(lblNewLabel_4, true, true);
		lblNewLabel_4.setText("Grid-point matrix dimensions WxH");
		
		NumGrid_Y = new Spinner(composite_9, SWT.BORDER);
		NumGrid_Y.setToolTipText("NumGrid_Y");
		managedForm.getToolkit().adapt(NumGrid_Y, true, true);
		
		NumGrid_Z = new Spinner(composite_9, SWT.BORDER);
		NumGrid_Z.setToolTipText("NumGrid_Z");
		managedForm.getToolkit().adapt(NumGrid_Z, true, true);
		
		Label lblTowershadowHalfWidth = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblTowershadowHalfWidth, true, true);
		lblTowershadowHalfWidth.setText("Time step");
		
		TimeStep = new Text(composite_3, SWT.BORDER);
		TimeStep.setToolTipText("Timestep");
		TimeStep.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(TimeStep, true, true);
		
		Label lblTowershadowReferencePoint = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblTowershadowReferencePoint, true, true);
		lblTowershadowReferencePoint.setText("Length of analysis time series");
		
		AnalysisTime = new Text(composite_3, SWT.BORDER);
		AnalysisTime.setToolTipText("AnalysisTime");
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
		HubHt.setToolTipText("HubHt");
		HubHt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(HubHt, true, true);
		
		Label lblNewLabel_10 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_10, true, true);
		lblNewLabel_10.setText("GridHeight");
		
		GridHeight = new Text(composite_3, SWT.BORDER);
		GridHeight.setToolTipText("GridHeight");
		GridHeight.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(GridHeight, true, true);
		
		Label lblNewLabel = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel, true, true);
		lblNewLabel.setText("GridWidth");
		
		GridWidth = new Text(composite_3, SWT.BORDER);
		GridWidth.setToolTipText("GridWidth");
		GridWidth.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(GridWidth, true, true);
		
		Label lblNewLabel_1 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText("VFlowAng");
		
		VFlowAng = new Text(composite_3, SWT.BORDER);
		VFlowAng.setToolTipText("VFlowAng");
		VFlowAng.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(VFlowAng, true, true);
		
		Label lblNewLabel_2 = new Label(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_2, true, true);
		lblNewLabel_2.setText("HFlowAng");
		
		HFlowAng = new Text(composite_3, SWT.BORDER);
		HFlowAng.setToolTipText("HFlowAng");
		HFlowAng.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(HFlowAng, true, true);
		
		Section sctnNewSection = managedForm.getToolkit().createSection(composite_4, Section.TWISTIE | Section.TITLE_BAR);
		sctnNewSection.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sctnNewSection);
		sctnNewSection.setText("Output");
		
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
		
		Section sctnCoherentTurbulenceScaling = managedForm.getToolkit().createSection(composite_4, Section.TWISTIE | Section.TITLE_BAR);
		sctnCoherentTurbulenceScaling.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sctnCoherentTurbulenceScaling);
		sctnCoherentTurbulenceScaling.setText("Coherent Turbulence Scaling Parameters");
		sctnCoherentTurbulenceScaling.setExpanded(true);
		
		Composite composite_6 = managedForm.getToolkit().createComposite(sctnCoherentTurbulenceScaling, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite_6);
		sctnCoherentTurbulenceScaling.setClient(composite_6);
		composite_6.setLayout(new GridLayout(2, false));
		
		Composite composite_7 = new Composite(composite_6, SWT.NONE);
		composite_7.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
		managedForm.getToolkit().adapt(composite_7);
		managedForm.getToolkit().paintBordersFor(composite_7);
		GridLayout gl_composite_7 = new GridLayout(2, false);
		gl_composite_7.marginWidth = 0;
		gl_composite_7.marginHeight = 0;
		composite_7.setLayout(gl_composite_7);
		
		Label lblNewLabel_25 = managedForm.getToolkit().createLabel(composite_7, "Event file", SWT.NONE);
		
		CTEventPath = new Combo(composite_7, SWT.NONE);
		CTEventPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		CTEventPath.setToolTipText("CTEventPath");
		managedForm.getToolkit().adapt(CTEventPath);
		managedForm.getToolkit().paintBordersFor(CTEventPath);
		
		Label lblNewLabel_18 = managedForm.getToolkit().createLabel(composite_6, "Type of event files", SWT.NONE);
		
		CTEventFile = new Combo(composite_6, SWT.NONE);
		CTEventFile.setToolTipText("CTEventFile");
		CTEventFile.setItems(new String[] {"LES", "DNS", "RANDOM"});
		CTEventFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(CTEventFile);
		managedForm.getToolkit().paintBordersFor(CTEventFile);
		CTEventFile.select(0);
		
		Randomize = new Button(composite_6, SWT.CHECK);
		Randomize.setToolTipText("Randomize");
		Randomize.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		managedForm.getToolkit().adapt(Randomize, true, true);
		Randomize.setText("Randomize the disturbance scale and locations?");
		
		Label lblDisturbanceScale = new Label(composite_6, SWT.NONE);
		managedForm.getToolkit().adapt(lblDisturbanceScale, true, true);
		lblDisturbanceScale.setText("Disturbance scale");
		
		DistScl = new Text(composite_6, SWT.BORDER);
		DistScl.setToolTipText("DistScl");
		DistScl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(DistScl, true, true);
		
		Label lblFractionalLocationOf = new Label(composite_6, SWT.NONE);
		lblFractionalLocationOf.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblFractionalLocationOf, true, true);
		lblFractionalLocationOf.setText("Fract location of tower centerline from right");
		
		CTLy = new Text(composite_6, SWT.BORDER);
		CTLy.setToolTipText("CTLy");
		CTLy.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(CTLy, true, true);
		
		Label lblFractionalLocationOf_1 = new Label(composite_6, SWT.NONE);
		managedForm.getToolkit().adapt(lblFractionalLocationOf_1, true, true);
		lblFractionalLocationOf_1.setText("Fract location of hub height");
		
		CTLz = new Text(composite_6, SWT.BORDER);
		CTLz.setToolTipText("CTLz");
		CTLz.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(CTLz, true, true);
		
		Label lblNewLabel_26 = new Label(composite_6, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_26, true, true);
		lblNewLabel_26.setText("Min start time for structures");
		
		CTStartTime = new Text(composite_6, SWT.BORDER);
		CTStartTime.setToolTipText("CTStartTime");
		CTStartTime.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(CTStartTime, true, true);
		
		Composite composite_8 = new Composite(composite_2, SWT.NONE);
		composite_8.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		managedForm.getToolkit().adapt(composite_8);
		managedForm.getToolkit().paintBordersFor(composite_8);
		composite_8.setLayout(new GridLayout(1, false));
		
		
		Section sctnOutputList = managedForm.getToolkit().createSection(composite_8, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
		sctnOutputList.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sctnOutputList);
		sctnOutputList.setText("Meteorological Boundary Conditions");
		sctnOutputList.setExpanded(false);
		
		Composite composite = managedForm.getToolkit().createComposite(sctnOutputList, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite);
		sctnOutputList.setClient(composite);
		composite.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel_3 = managedForm.getToolkit().createLabel(composite, "Turbulence Model", SWT.NONE);
		
		TurbModel = new Combo(composite, SWT.NONE);
		TurbModel.setToolTipText("TurbModel");
		TurbModel.setItems(new String[] {"NONE", "IECKAI (Kaimal)", "IECVKM (von Karman)", "GP_LLJ (Great Planes)", "NWTCUP", "SMOOTH", "WF_UPW", "WF_07D", "WF_14D"});
		TurbModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(TurbModel);
		managedForm.getToolkit().paintBordersFor(TurbModel);
		TurbModel.select(0);
		
		Label lblNewLabel_5 = managedForm.getToolkit().createLabel(composite, "IEC 61400-x standard", SWT.NONE);
		
		IECstandard = new Combo(composite, SWT.NONE);
		IECstandard.setItems(new String[] {"1-ED1", "1-ED2", "1-ED3", "2-ED1", "2-ED2", "2-ED3", "3-ED1", "3-ED2", "3-ED3"});
		IECstandard.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(IECstandard);
		managedForm.getToolkit().paintBordersFor(IECstandard);
		IECstandard.select(0);
		
		Label lblNewLabel_6 = managedForm.getToolkit().createLabel(composite, "IEC turbulence characteristic", SWT.NONE);
		
		IECturbc = new Combo(composite, SWT.NONE);
		IECturbc.setItems(new String[] {"A", "B", "C"});
		IECturbc.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(IECturbc);
		managedForm.getToolkit().paintBordersFor(IECturbc);
		IECturbc.select(0);
		
		Label lblNewLabel_11 = managedForm.getToolkit().createLabel(composite, "IEC turbulence type", SWT.NONE);
		
		IEC_WindType = new Combo(composite, SWT.NONE);
		IEC_WindType.setItems(new String[] {"NTM", "1ETM", "2ETM", "3ETM", "1EWM1", "2EWM1", "3EWM1", "1EWM50", "2EWM50", "3EWM50"});
		IEC_WindType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(IEC_WindType);
		managedForm.getToolkit().paintBordersFor(IEC_WindType);
		IEC_WindType.select(0);
		
		Label lblNewLabel_12 = new Label(composite, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_12, true, true);
		lblNewLabel_12.setText("ETMc");
		
		ETMc = new Text(composite, SWT.BORDER);
		ETMc.setText("DEFAULT");
		ETMc.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(ETMc, true, true);
		
		Label lblNewLabel_13 = new Label(composite, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_13, true, true);
		lblNewLabel_13.setText("Wind profile type");
		
		WindProfileType = new Combo(composite, SWT.NONE);
		WindProfileType.setItems(new String[] {"JET", "LOG", "PL"});
		WindProfileType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(WindProfileType);
		managedForm.getToolkit().paintBordersFor(WindProfileType);
		WindProfileType.select(2);
		
		Label lblNewLabel_14 = new Label(composite, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_14, true, true);
		lblNewLabel_14.setText("RefHt");
		
		RefHt = new Text(composite, SWT.BORDER);
		RefHt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(RefHt, true, true);
		
		Label lblUref = new Label(composite, SWT.NONE);
		lblUref.setText("Mean wind speed at the ref height");
		managedForm.getToolkit().adapt(lblUref, true, true);
		
		Uref = new Text(composite, SWT.BORDER);
		Uref.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(Uref, true, true);
		
		Label lblZjetmax = new Label(composite, SWT.NONE);
		lblZjetmax.setText("Jet height");
		managedForm.getToolkit().adapt(lblZjetmax, true, true);
		
		ZJetMax = new Text(composite, SWT.BORDER);
		ZJetMax.setToolTipText("ZJetMax");
		ZJetMax.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(ZJetMax, true, true);
		
		Label lblNewLabel_15 = new Label(composite, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_15, true, true);
		lblNewLabel_15.setText("Power law exponent");
		
		PLExp = new Text(composite, SWT.BORDER);
		PLExp.setToolTipText("PLExp");
		PLExp.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(PLExp, true, true);
		
		Label lblZ = new Label(composite, SWT.NONE);
		lblZ.setText("Surface roughness length");
		managedForm.getToolkit().adapt(lblZ, true, true);
		
		Z0 = new Text(composite, SWT.BORDER);
		Z0.setToolTipText("Z0");
		Z0.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(Z0, true, true);
		
		Section sctnNewSection_2 = managedForm.getToolkit().createSection(composite_8, Section.TWISTIE | Section.TITLE_BAR);
		sctnNewSection_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sctnNewSection_2);
		sctnNewSection_2.setText("Non-IEC Meteorological Boundary Conditions");
		sctnNewSection_2.setExpanded(true);
		
		Composite composite_5 = managedForm.getToolkit().createComposite(sctnNewSection_2, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite_5);
		sctnNewSection_2.setClient(composite_5);
		composite_5.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel_16 = managedForm.getToolkit().createLabel(composite_5, "Site latitude", SWT.NONE);
		
		Location = managedForm.getToolkit().createText(composite_5, "", SWT.NONE);
		Location.setToolTipText("Latitude");
		Location.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblGradientRichardsonNumber = managedForm.getToolkit().createLabel(composite_5, "Gradient Richardson number", SWT.NONE);
		
		RICH_NO = managedForm.getToolkit().createText(composite_5, "", SWT.NONE);
		RICH_NO.setToolTipText("RICH_NO");
		RICH_NO.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_17 = managedForm.getToolkit().createLabel(composite_5, "Friction or shear velocity", SWT.NONE);
		
		UStar = managedForm.getToolkit().createText(composite_5, "", SWT.NONE);
		UStar.setToolTipText("UStar");
		UStar.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_19 = managedForm.getToolkit().createLabel(composite_5, "Mixing layer depth", SWT.NONE);
		
		ZI = managedForm.getToolkit().createText(composite_5, "", SWT.NONE);
		ZI.setToolTipText("ZI");
		ZI.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_20 = managedForm.getToolkit().createLabel(composite_5, "u'w' cross-correlation coefficient", SWT.NONE);
		
		PC_UW = managedForm.getToolkit().createText(composite_5, "", SWT.NONE);
		PC_UW.setToolTipText("PC_UW");
		PC_UW.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_21 = managedForm.getToolkit().createLabel(composite_5, "u'v' cross-correlation coefficient", SWT.NONE);
		
		PC_UV = managedForm.getToolkit().createText(composite_5, "", SWT.NONE);
		PC_UV.setToolTipText("PC_UV");
		PC_UV.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_22 = managedForm.getToolkit().createLabel(composite_5, "v'w' cross-correlation coefficient", SWT.NONE);
		
		PC_VW = managedForm.getToolkit().createText(composite_5, "", SWT.NONE);
		PC_VW.setToolTipText("PC_VW");
		PC_VW.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_23 = managedForm.getToolkit().createLabel(composite_5, "u-component coherence decrement", SWT.NONE);
		
		IncDec1 = managedForm.getToolkit().createText(composite_5, "", SWT.NONE);
		IncDec1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_24 = managedForm.getToolkit().createLabel(composite_5, "v-component coherence decrement", SWT.NONE);
		
		IncDec2 = managedForm.getToolkit().createText(composite_5, "", SWT.NONE);
		IncDec2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblUcomponentCoherenceDecrement = managedForm.getToolkit().createLabel(composite_5, "w-component coherence decrement", SWT.NONE);
		
		IncDec3 = managedForm.getToolkit().createText(composite_5, "", SWT.NONE);
		IncDec3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_7 = new Label(composite_5, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_7, true, true);
		lblNewLabel_7.setText("New Label");
		
		CohExp = new Text(composite_5, SWT.BORDER);
		CohExp.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(CohExp, true, true);

		// DATABINDING
		m_bindingContext = new XtextDataBindingContext();
		initXDB_Model		(m_bindingContext);
		initXDB_Output		(m_bindingContext);
		initXDB_TurbScalPar	(m_bindingContext);
		initXDB_CohStr		(m_bindingContext);
		
		
	}

	protected DataBindingContext initXDB_Model (DataBindingContext bindingContext) {

		//
		IObservableValue observeSelectionNumGrid_Z = WidgetProperties.selection().observe(NumGrid_Z);
		IObservableValue modelValueNumGrid_Z = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_NumGrid_Z(), bindTbsPkg().getiNumGrid_Z_Value())).observe(document);
		bindingContext.bindValue(observeSelectionNumGrid_Z, modelValueNumGrid_Z, null, null);
		//
		IObservableValue observeSelectionNumGrid_Y = WidgetProperties.selection().observe(NumGrid_Y);
		IObservableValue modelValueNumGrid_Y = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_NumGrid_Y(), bindTbsPkg().getiNumGrid_Y_Value())).observe(document);
		bindingContext.bindValue(observeSelectionNumGrid_Y, modelValueNumGrid_Y, null, null);
		//
		IObservableValue observeSelectionTimeStep = WidgetProperties.text(SWT.Modify).observe(TimeStep);
		IObservableValue modelValueTimeStep = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_TimeStep(), bindTbsPkg().getnTimeStep_Value())).observe(document);
		bindingContext.bindValue(observeSelectionTimeStep, modelValueTimeStep, null, null);
		//
		IObservableValue observeSelectionAnalysisTime = WidgetProperties.text(SWT.Modify).observe(AnalysisTime);
		IObservableValue modelValueAnalysisTime = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_AnalysisTime(), bindTbsPkg().getnAnalysisTime_Value())).observe(document);
		bindingContext.bindValue(observeSelectionAnalysisTime, modelValueAnalysisTime, null, null);
		//
		IObservableValue observeSelectionUsableTime = WidgetProperties.text(SWT.Modify).observe(UsableTime);
		IObservableValue modelValueUsableTime = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_UsableTime(), bindTbsPkg().getnUsableTime_Value())).observe(document);
		bindingContext.bindValue(observeSelectionUsableTime, modelValueUsableTime, null, null);
		//
		IObservableValue observeSelectionHubHt = WidgetProperties.text(SWT.Modify).observe(HubHt);
		IObservableValue modelValueHubHt = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_HubHt(), bindTbsPkg().getnHubHt_Value())).observe(document);
		bindingContext.bindValue(observeSelectionHubHt, modelValueHubHt, null, null);
		//
		IObservableValue observeSelectionGridHeight = WidgetProperties.text(SWT.Modify).observe(GridHeight);
		IObservableValue modelValueGridHeight = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_GridHeight(), bindTbsPkg().getnGridHeight_Value())).observe(document);
		bindingContext.bindValue(observeSelectionGridHeight, modelValueGridHeight, null, null);
		//
		IObservableValue observeSelectionGridWidth = WidgetProperties.text(SWT.Modify).observe(GridWidth);
		IObservableValue modelValueGridWidth = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_GridWidth(), bindTbsPkg().getnGridWidth_Value())).observe(document);
		bindingContext.bindValue(observeSelectionGridWidth, modelValueGridWidth, null, null);
		//
		IObservableValue observeSelectionVFlowAng = WidgetProperties.text(SWT.Modify).observe(VFlowAng);
		IObservableValue modelValueVFlowAng = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_VFlowAng(), bindTbsPkg().getnVFlowAng_Value())).observe(document);
		bindingContext.bindValue(observeSelectionVFlowAng, modelValueVFlowAng, null, null);
		//
		IObservableValue observeSelectionHFlowAng = WidgetProperties.text(SWT.Modify).observe(HFlowAng);
		IObservableValue modelValueHFlowAng = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_HFlowAng(), bindTbsPkg().getnHFlowAng_Value())).observe(document);
		bindingContext.bindValue(observeSelectionHFlowAng, modelValueHFlowAng, null, null);
		
		
		
		//
		IObservableValue observeSelectionTurbModel = WidgetProperties.selection().observe(TurbModel);
		IObservableValue modelValueTurbModel = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_TurbModel(), bindTbsPkg().getsTurbModel_Value())).observe(document);
		bindingContext.bindValue(observeSelectionTurbModel, modelValueTurbModel, null, null);
		//
		IObservableValue observeSelectionIECstandard = WidgetProperties.selection().observe(IECstandard);
		IObservableValue modelValueIECstandard = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_IECstandard(), bindTbsPkg().getsIECstandard_Value())).observe(document);
		bindingContext.bindValue(observeSelectionIECstandard, modelValueIECstandard, null, null);
		//
		IObservableValue observeSelectionIECturbc = WidgetProperties.selection().observe(IECturbc);
		IObservableValue modelValueIECturbc = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_IECturbc(), bindTbsPkg().getsIECturbc_Value())).observe(document);
		bindingContext.bindValue(observeSelectionIECturbc, modelValueIECturbc, null, null);
		//
		IObservableValue observeSelectionIEC_WindType = WidgetProperties.selection().observe(IEC_WindType);
		IObservableValue modelValueIEC_WindType = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_IEC_WindType(), bindTbsPkg().getsIEC_WindType_Value())).observe(document);
		bindingContext.bindValue(observeSelectionIEC_WindType, modelValueIEC_WindType, null, null);
		
		//
		IObservableValue observeSelectionETMc = WidgetProperties.text(SWT.Modify).observe(ETMc);
		IObservableValue modelValueETMc = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_ETMc(), bindTbsPkg().getsETMc_Value())).observe(document);
		bindingContext.bindValue(observeSelectionETMc, modelValueETMc, null, null);
		//
		IObservableValue observeSelectionWindProfileType = WidgetProperties.selection().observe(WindProfileType);
		IObservableValue modelValueWindProfileType = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_WindProfileType(), bindTbsPkg().getsWindProfileType_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWindProfileType, modelValueWindProfileType, null, null);
		//
		IObservableValue observeSelectionRefHt = WidgetProperties.text(SWT.Modify).observe(RefHt);
		IObservableValue modelValueRefHt = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_RefHt(), bindTbsPkg().getnRefHt_Value())).observe(document);
		bindingContext.bindValue(observeSelectionRefHt, modelValueRefHt, null, null);
		//
		IObservableValue observeSelectionUref = WidgetProperties.text(SWT.Modify).observe(Uref);
		IObservableValue modelValueUref = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_Uref(), bindTbsPkg().getnUref_Value())).observe(document);
		bindingContext.bindValue(observeSelectionUref, modelValueUref, null, null);
		//
		IObservableValue observeSelectionZJetMax = WidgetProperties.text(SWT.Modify).observe(ZJetMax);
		IObservableValue modelValueZJetMax = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_ZJetMax(), bindTbsPkg().getnZJetMax_Value())).observe(document);
		bindingContext.bindValue(observeSelectionZJetMax, modelValueZJetMax, null, null);
		//
		IObservableValue observeSelectionPLExp = WidgetProperties.text(SWT.Modify).observe(PLExp);
		IObservableValue modelValuePLExp = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_PLExp(), bindTbsPkg().getnPLExp_Value())).observe(document);
		bindingContext.bindValue(observeSelectionPLExp, modelValuePLExp, null, null);
		//
		IObservableValue observeSelectionZ0 = WidgetProperties.text(SWT.Modify).observe(Z0);
		IObservableValue modelValueZ0 = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_Z0(), bindTbsPkg().getnZ0_Value())).observe(document);
		bindingContext.bindValue(observeSelectionZ0, modelValueZ0, null, null);
		
		return bindingContext;
	}
	
	protected DataBindingContext initXDB_Output (DataBindingContext bindingContext) {

		//
		IObservableValue observeSelectionWrFHHTPObserveWidget = WidgetProperties.selection().observe(WrFHHTP);
		IObservableValue modelValueObsWrFHHTP = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_WrFHHTP(), bindTbsPkg().getbWrFHHTP_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrFHHTPObserveWidget, modelValueObsWrFHHTP, null, null);
		//
		IObservableValue observeSelectionWrADHHObserveWidget = WidgetProperties.selection().observe(WrADHH);
		IObservableValue modelValueObsWrADHH = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_WrADHH(), bindTbsPkg().getbWrADHH_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrADHHObserveWidget, modelValueObsWrADHH, null, null);
		//
		IObservableValue observeSelectionWrADFFObserveWidget = WidgetProperties.selection().observe(WrADFF);
		IObservableValue modelValueObsWrADFF = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_WrADFF(), bindTbsPkg().getbWrADFF_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrADFFObserveWidget, modelValueObsWrADFF, null, null);
		//
		IObservableValue observeSelectionWrBLFFObserveWidget = WidgetProperties.selection().observe(WrBLFF);
		IObservableValue modelValueObsWrBLFF = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_WrBLFF(), bindTbsPkg().getbWrBLFF_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrBLFFObserveWidget, modelValueObsWrBLFF, null, null);
		//
		IObservableValue observeSelectionWrADTWRObserveWidget = WidgetProperties.selection().observe(WrADTWR);
		IObservableValue modelValueObsWrADTWR = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_WrADTWR(), bindTbsPkg().getbWrADTWR_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrADTWRObserveWidget, modelValueObsWrADTWR, null, null);
		//
		IObservableValue observeSelectionWrFMTFFObserveWidget = WidgetProperties.selection().observe(WrFMTFF);
		IObservableValue modelValueObsWrFMTFF = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_WrFMTFF(), bindTbsPkg().getbWrFMTFF_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrFMTFFObserveWidget, modelValueObsWrFMTFF, null, null);
		//
		IObservableValue observeSelectionWrACTObserveWidget = WidgetProperties.selection().observe(WrACT);
		IObservableValue modelValueObsWrACT = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_WrACT(), bindTbsPkg().getbWrACT_Value())).observe(document);
		bindingContext.bindValue(observeSelectionWrACTObserveWidget, modelValueObsWrACT, null, null);
		
		return bindingContext;
	}
	
	protected DataBindingContext initXDB_TurbScalPar (DataBindingContext bindingContext) {

		//
		IObservableValue observeSelectionLocation = WidgetProperties.text(SWT.Modify).observe(Location);
		IObservableValue modelValueLocation = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_Location(), bindTbsPkg().getnLocation_Value())).observe(document);
		bindingContext.bindValue(observeSelectionLocation, modelValueLocation, null, null);
		//
		IObservableValue observeRICH_NO = WidgetProperties.text(SWT.Modify).observe(RICH_NO);
		IObservableValue modelValueRICH_NO = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_RICH_NO(), bindTbsPkg().getnRICH_NO_Value())).observe(document);
		bindingContext.bindValue(observeRICH_NO, modelValueRICH_NO, null, null);
		//
		IObservableValue observeUStar = WidgetProperties.text(SWT.Modify).observe(UStar);
		IObservableValue modelUStar = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_UStar(), bindTbsPkg().getnUStar_Value())).observe(document);
		bindingContext.bindValue(observeUStar, modelUStar, null, null);
		//
		IObservableValue observeZI = WidgetProperties.text(SWT.Modify).observe(ZI);
		IObservableValue modelZI = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_ZI(), bindTbsPkg().getnZI_Value())).observe(document);
		bindingContext.bindValue(observeZI, modelZI, null, null);
		//
		IObservableValue observePC_UW = WidgetProperties.text(SWT.Modify).observe(PC_UW);
		IObservableValue modelPC_UW = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_PC_UW(), bindTbsPkg().getnPC_UW_Value())).observe(document);
		bindingContext.bindValue(observePC_UW, modelPC_UW, null, null);
		//
		IObservableValue observePC_UV = WidgetProperties.text(SWT.Modify).observe(PC_UV);
		IObservableValue modelPC_UV = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_PC_UV(), bindTbsPkg().getnPC_UV_Value())).observe(document);
		bindingContext.bindValue(observePC_UV, modelPC_UV, null, null);
		//
		IObservableValue observePC_VW = WidgetProperties.text(SWT.Modify).observe(PC_VW);
		IObservableValue modelPC_VW = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_PC_VW(), bindTbsPkg().getnPC_VW_Value())).observe(document);
		bindingContext.bindValue(observePC_VW, modelPC_VW, null, null);
		//
		IObservableValue observeIncDec1 = WidgetProperties.text(SWT.Modify).observe(IncDec1);
		IObservableValue modelIncDec1 = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_IncDec1(), bindTbsPkg().getnIncDec1_Value())).observe(document);
		bindingContext.bindValue(observeIncDec1, modelIncDec1, null, null);
		//
		IObservableValue observeIncDec2 = WidgetProperties.text(SWT.Modify).observe(IncDec2);
		IObservableValue modelIncDec2 = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_IncDec2(), bindTbsPkg().getnIncDec2_Value())).observe(document);
		bindingContext.bindValue(observeIncDec2, modelIncDec2, null, null);
		//
		IObservableValue observeIncDec3 = WidgetProperties.text(SWT.Modify).observe(IncDec3);
		IObservableValue modelIncDec3 = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_IncDec3(), bindTbsPkg().getnIncDec3_Value())).observe(document);
		bindingContext.bindValue(observeIncDec3, modelIncDec3, null, null);
		//
		IObservableValue observeCohExp = WidgetProperties.text(SWT.Modify).observe(CohExp);
		IObservableValue modelCohExp = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_CohExp(), bindTbsPkg().getnCohExp_Value())).observe(document);
		bindingContext.bindValue(observeCohExp, modelCohExp, null, null);
		
		
		return bindingContext;
	}
	
	protected DataBindingContext initXDB_CohStr (DataBindingContext bindingContext) {

		//
		IObservableValue observeCTEventPath = WidgetProperties.selection().observe(CTEventPath);
		IObservableValue modelCTEventPath = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_CTEventPath(), bindTbsPkg().getsCTEventPath_Value())).observe(document);
		bindingContext.bindValue(observeCTEventPath, modelCTEventPath, null, null);
		//
		IObservableValue observeCTEventFile = WidgetProperties.selection().observe(CTEventFile);
		IObservableValue modelCTEventFile = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_CTEventFile(), bindTbsPkg().getsCTEventFile_Value())).observe(document);
		bindingContext.bindValue(observeCTEventFile, modelCTEventFile, null, null);
		//
		IObservableValue observeRandomize = WidgetProperties.selection().observe(Randomize);
		IObservableValue modelRandomize = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_Randomize(), bindTbsPkg().getbRandomize_Value())).observe(document);
		bindingContext.bindValue(observeRandomize, modelRandomize, null, null);
		//
		IObservableValue observeDistScl = WidgetProperties.text(SWT.Modify).observe(DistScl);
		IObservableValue modelDistScl = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_DistScl(), bindTbsPkg().getnDistScl_Value())).observe(document);
		bindingContext.bindValue(observeDistScl, modelDistScl, null, null);
		//
		IObservableValue observeCTLy = WidgetProperties.text(SWT.Modify).observe(CTLy);
		IObservableValue modelCTLy = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_CTLy(), bindTbsPkg().getnCTLy_Value())).observe(document);
		bindingContext.bindValue(observeCTLy, modelCTLy, null, null);
		//
		IObservableValue observeCTLx = WidgetProperties.text(SWT.Modify).observe(CTLz);
		IObservableValue modelCTLx = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_CTLz(), bindTbsPkg().getnCTLz_Value())).observe(document);
		bindingContext.bindValue(observeCTLx, modelCTLx, null, null);
		//
		IObservableValue observeCTStartTime = WidgetProperties.text(SWT.Modify).observe(CTStartTime);
		IObservableValue modelCTStartTime = XtextProperties.value(FeaturePath.fromList(bindTbsPkg().getModelTurbsimtbs_CTStartTime(), bindTbsPkg().getnCTStartTime_Value())).observe(document);
		bindingContext.bindValue(observeCTStartTime, modelCTStartTime, null, null);
		
		
		return bindingContext;
	}
	
	public IContentOutlinePage getContentOutline() {
		// TODO Auto-generated method stub
		return null;
	}
}
