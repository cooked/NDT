package sc.ndt.editor.fast.ui.addon.mpe;

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
import sc.ndt.commons.model.providers.airfoils.AirfoilCellEditorProvider;
import sc.ndt.commons.model.providers.airfoils.AirfoilListLabelProvider;
import sc.ndt.commons.ui.editor.IXtextFormEditor;
import sc.ndt.editor.fast.fastadn.FastadnPackage;
import sc.ndt.editor.fast.fastadn.ModelFastadn;
import sc.ndt.editor.fast.fastadn.aAirStat;

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

public class AdnFormPage extends FormPage {

	private IXtextDocument document;

	private DataBindingContext m_bindingContext;

	public OutList outList = new OutList();

	private ScrolledForm form;
	private FormToolkit toolkit;
	private IToolBarManager manager;
	private String list;

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
	private BladeNodeAeroList 	as = new BladeNodeAeroList();
	
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

		if(document==null && getEditor() instanceof IXtextFormEditor) {
			XtextEditor e = ((IXtextFormEditor)getEditor()).getXtextEditor("adn");
			document = e.getDocument();
		}
		
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
			as.add(new BladeNodeAero(
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

		// control decoration
		fieldDecERR = FieldDecorationRegistry.getDefault().getFieldDecoration(
				FieldDecorationRegistry.DEC_ERROR);
		managedForm.getForm().getBody().setLayout(new FillLayout(SWT.VERTICAL));
		
		Composite composite_2 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
		managedForm.getToolkit().adapt(composite_2);
		managedForm.getToolkit().paintBordersFor(composite_2);
		FillLayout fl_composite_2 = new FillLayout(SWT.HORIZONTAL);
		fl_composite_2.marginWidth = 5;
		fl_composite_2.marginHeight = 5;
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
					    return Float.toString( ((BladeNodeAero)element).R );
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
					    return Float.toString( ((BladeNodeAero)element).Twist );
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
					    return Float.toString( ((BladeNodeAero)element).dR );
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
					    return Float.toString( ((BladeNodeAero)element).Chord );
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
					    return Float.toString( ((BladeNodeAero)element).AirfoilID );
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
					    return ((BladeNodeAero)element).print;
					}
				});
				
				// set the content provider
				tableViewer_1.setContentProvider(ArrayContentProvider.getInstance());
				tableViewer_1.setInput(as);
				
				
				sashForm.setWeights(new int[] {3, 5});
		
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
	
	
	public IContentOutlinePage getContentOutline() {
		// TODO Auto-generated method stub
		return null;
	}

}
