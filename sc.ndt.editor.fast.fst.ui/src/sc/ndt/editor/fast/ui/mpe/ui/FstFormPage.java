package sc.ndt.editor.fast.ui.mpe.ui;


import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.ObservablesManager;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.ValidationStatusProvider;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.IMessage;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import sc.ndt.commons.model.OutBlock;
import sc.ndt.commons.model.OutCh;
import sc.ndt.commons.model.OutList;
import sc.ndt.commons.model.providers.outlist.OutListCheckStateProvider;
import sc.ndt.commons.model.providers.outlist.OutListContentProvider;
import sc.ndt.commons.model.providers.outlist.OutListLabelProvider;
import sc.ndt.commons.model.providers.outlist.OutListToolTipSupport;
import sc.ndt.commons.ui.editor.IXtextFormEditor;
import sc.ndt.editor.fast.fastfst.FastfstPackage;
import sc.ndt.editor.fast.fastfst.ModelFastfst;
import ch.vorburger.xtext.databinding.XtextDataBindingContext;
import ch.vorburger.xtext.databinding.XtextProperties;

import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

import com.google.inject.Injector;

public class FstFormPage extends FormPage {

	private Text Gravity;
	private Text TYCOn;
	private Text OoPDefl;
	private Text TipRad;
	private Text IPDefl;
	private Text TeetDefl;
	private Text Azimuth;
	private Text RotSpeed;
	private Text NacYaw;
	private Text TTDspFA;
	private Text TTDspSS;
	private Text HubRad;
	private Text UndSling;
	private Text HubCM;
	private Text OverHang;
	private Text NacCMxn;
	private Text NacCMyn;
	private Text NacCMzn;
	private Text TowerHt;
	private Text Twr2Shft;
	private Text TwrRBHt;
	private Text ShftTilt;
	private Text Delta3;
	private Text AzimB1Up;
	private Text HubMass;
	private Text TipMass_3_;
	private Text NacYIner;
	private Text GenIner;
	private Text TipMass_2_;
	private Text OutFmt;
	private Text GBoxEff;
	private Text GenEff;
	private Text GBRatio;
	private Text TMax;
	private Text DT;
	private Text HSSBrTqF;
	private Text HSSBrDT;
	private Text PreCone_1_;
	private Text PreCone_2_;
	private Text PreCone_3_;
	private Text YawBrMass;
	private Text NacMass;
	private Text TipMass_1_;
	private Text HubIner;
	private Text DTTorSpr;
	private Text DTTorDmp;
	private Text DynBrkFi;
	private Text YawSpr;
	private Text YawDamp;
	private Text YawNeut;
	private Text TeetDmpP;
	private Text TeetDmp;
	private Text TeetCDmp;
	private Text TeetSStP;
	private Text TeetHStP;
	private Text TeetSSSp;
	private Text TeetHSSP;
	private Text TYawManS;
	private Text NacYawF;
	private Text TYawManE;
	private Text VS_RtGnSp;
	private Text VS_RtTq;
	private Text VS_Rgn2K;
	private Text TPitManS_1_;
	private Text TPitManS_2_;
	private Text TPitManS_3_;
	private Text TPitManE_1_;
	private Text BlPitch_1_;
	private Text B1PitchF_1_;
	private Text TPitManE_2_;
	private Text BlPitch_2_;
	private Text B1PitchF_2_;
	private Text TPitManE_3_;
	private Text BlPitch_3_;
	private Text B1PitchF_3_;
	private Text TwrFile;
	private Text TwrNodes;

	private Button Echo;
	private Text FurlFile;
	private Text TBDrConN;
	private Text TBDrConD;
	private Text TpBrDT;
	private Text BldFile_1_;
	private Text BldFile_2_;
	private Text BldFile_3_;
	private Text ADFile;
	private Button FlapDOF1;
	private Button FlapDOF2;
	private Button GenDOF;
	private Button EdgeDOF;
	private Button TeetDOF;
	private Button TwFADOF1;
	private Button YawDOF;
	private Button TwFADOF2;
	private Button TwSSDOF1;
	private Button TwSSDOF2;
	private Button DrTrDOF;
	private Button CompAero;
	private Button CompNoise;
	private Button GBRevers;
	private Text NoiseFile;
	private Text TStart;
	private Text ADAMSFile;
	private Text LinFile;
	private Text PSpnElN;
	private Text DecFact;
	private Text SttsTime;
	private Text NcIMUxn;
	private Text NcIMUyn;
	private Button SumPrint;
	private Button TabDelim;
	private Text PtfmFile;
	private Text NumBl;
	private CCombo PlatformModel;
	private CCombo YCMode;
	private CCombo PCMode;
	private CCombo HSSBrMode;
	private Text THSSBrDp;
	private Text TiDynBrk;
	private Text TTpBrDp_1_;
	private Text TTpBrDp_3_;
	private Text TTpBrDp_2_;
	private Text TBDepISp_1_;
	private Text TBDepISp_2_;
	private Text TPCOn;
	private CCombo VSContrl;
	private Text VS_SlPc;
	private CCombo GenModel;
	private Text TimGenOn;
	private Text TimGenOf;
	private Text SpdGenOn;
	private Text TBDepISp_3_;
	private Label label_4;
	private Button Furling;
	private Button GenTiStr;
	private Button GenTiStp;
	private Text text;
	private Text TEC_Freq;
	private Text TEC_Npol;
	private Text TEC_Sres;
	private Text TEC_Rres;
	private Text TEC_VLL;
	private Text TEC_SLR;
	private Text TEC_RLR;
	private Text TEC_MR;
	private CCombo TeetMod;
	private Text NcIMUzn;
	private Text ShftGagL;
	private Text NTwGages;

	private CheckboxTreeViewer checkboxTreeViewer;

	private IXtextDocument document;

	private DataBindingContext m_bindingContext;

	public OutList outList = new OutList();

	private ScrolledForm form;
	private FormToolkit toolkit;
	private IToolBarManager manager;
	private String list;
	private Text text_1;
	private Text SIG_SlPc;
	private Text text_5a;
	private Text SIG_RtTq;
	private Text SIG_PORt;
	private Text SIG_SySp;
	private Text TwrGagNd;
	private Text NBlGages;
	private Text BldGagNd;
	private CCombo ADAMSPrep;
	private CCombo AnalMode;
	private Label lblFurlingPropertiesFile;
	private Label lblPlatformPropertiesFile;
	private Label lblRatedGeneratorSpeedfor;
	private Label lblrpm;
	private Label lblRatedGeneratorTorque;
	private Label label_19;
	private Label lblGeneratorTorqueConstant;
	private Label lblNewLabel_39;
	private Label lblMethodToStart;
	private Label label_18;


	
	public URI uri;
	
	private ControlDecoration cdFurlFile;
	private FieldDecoration fieldDecINF;
	private FieldDecoration fieldDecERR;
	private ControlDecoration cdBldFile_1_;
	private ControlDecoration cdBldFile_2_;
	private ControlDecoration cdBldFile_3_;
	private ControlDecoration cdADFile;
	private ControlDecoration cdNoiseFile;
	private ControlDecoration cdADAMSFile;
	private ControlDecoration cdLinFile;
	private ControlDecoration cdPtfmFile;
	
	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public FstFormPage(String id, String title) {
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
	public FstFormPage(FormEditor editor, String id, String title) {
		super(editor, id, title);

		if(document==null && getEditor() instanceof IXtextFormEditor) {
			XtextEditor e = ((IXtextFormEditor)getEditor()).getXtextEditor("fst");
			document = e.getDocument();
		}

		list = document.readOnly(new IUnitOfWork<String,XtextResource>() {

			public String exec(XtextResource resource) {
				ModelFastfst m = (ModelFastfst)resource.getContents().get(0);
				uri = m.eResource().getURI();
				return m.getOutList().getValue();
			}

		});	
		outList.setAllSelected(list);

	}

	private FastfstPackage bindFastfstPackage() {
		return FastfstPackage.eINSTANCE;
	}

	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		managedForm.getForm().setImage(ResourceManager.getPluginImage("sc.ndt.editor.fast.fst.ui", "icons/fan-alt.png"));
		managedForm.getToolkit().setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		form = managedForm.getForm();
		form.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));		
		form.setText("FAST Main File");

		toolkit = managedForm.getToolkit();
		toolkit.decorateFormHeading(form.getForm());

		manager = form.getToolBarManager();

		// see
		// http://devblog.virtage.com/2012/09/snippet-of-the-day-execute-eclipse-command-programmatically/
		
		Action runAction = new Action("Run") { //$NON-NLS-1$
			public void run() {
				
			}
		};
		runAction.setToolTipText("Run FAST");
		runAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("sc.ndt.commons", "icons/cog_go.png"));

		
		Action linAction = new Action("Linearize") { //$NON-NLS-1$
			public void run() {
			}
		};
		linAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("sc.ndt.commons", "/icons/table.png"));

		/*
		Action helpAction = new Action("Help") { //$NON-NLS-1$
			public void run() {
			}
		};
		helpAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("org.eclipse.help.ui", "/icons/etool16/help.gif"));
		 */
		
		manager.add(runAction);		// run time-marching simulation
		manager.add(linAction);		// run model linearization
		//manager.add(helpAction);	// open help
		
		
		form.updateToolBar();
		managedForm.getForm().getBody().setLayout(new RowLayout(SWT.HORIZONTAL));

		// control decoration
		fieldDecERR = FieldDecorationRegistry.getDefault().getFieldDecoration(
				FieldDecorationRegistry.DEC_ERROR);
				
		Composite composite_13 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
		composite_13.setLayoutData(new RowData(450, SWT.DEFAULT));
		managedForm.getToolkit().adapt(composite_13);
		managedForm.getToolkit().paintBordersFor(composite_13);
		GridLayout gl_composite_13 = new GridLayout(1, false);
		gl_composite_13.marginWidth = 0;
		composite_13.setLayout(gl_composite_13);
		
				Section sctnNewSection_2 = managedForm.getToolkit().createSection(composite_13, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
				GridData gd_sctnNewSection_2 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
				gd_sctnNewSection_2.widthHint = 400;
				sctnNewSection_2.setLayoutData(gd_sctnNewSection_2);
				managedForm.getToolkit().paintBordersFor(sctnNewSection_2);
				sctnNewSection_2.setText("Environmental Conditions");
				
						Composite composite_2 = managedForm.getToolkit().createComposite(sctnNewSection_2, SWT.NONE);
						managedForm.getToolkit().paintBordersFor(composite_2);
						sctnNewSection_2.setClient(composite_2);
						GridLayout gl_composite_2 = new GridLayout(3, false);
						gl_composite_2.horizontalSpacing = 10;
						composite_2.setLayout(gl_composite_2);
						
								Label lblGravity = new Label(composite_2, SWT.NONE);
								GridData gd_lblGravity = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
								gd_lblGravity.widthHint = 230;
								lblGravity.setLayoutData(gd_lblGravity);
								managedForm.getToolkit().adapt(lblGravity, true, true);
								lblGravity.setText("Acceleration of gravity");
								
										Gravity = new Text(composite_2, SWT.RIGHT);
										Gravity.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
										Gravity.setText("0.0");
										GridData gd_Gravity = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
										gd_Gravity.widthHint = 50;
										Gravity.setLayoutData(gd_Gravity);
										managedForm.getToolkit().adapt(Gravity, true, true);
										
														Label lblms = new Label(composite_2, SWT.NONE);
														lblms.setText("[m/s^2]");
														managedForm.getToolkit().adapt(lblms, true, true);

		Section sPlatform = managedForm.getToolkit().createSection(composite_13, Section.TWISTIE | Section.TITLE_BAR);
		sPlatform.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sPlatform);
		sPlatform.setText("Platform");
		sPlatform.setExpanded(true);

		// Platform
		Composite composite_4 = new Composite(sPlatform, SWT.NONE);
		managedForm.getToolkit().adapt(composite_4);
		managedForm.getToolkit().paintBordersFor(composite_4);
		sPlatform.setClient(composite_4);
		GridLayout gl_composite_4 = new GridLayout(2, false);
		gl_composite_4.horizontalSpacing = 10;
		composite_4.setLayout(gl_composite_4);

		Label lblNewLabel_20 = new Label(composite_4, SWT.NONE);
		GridData gd_lblNewLabel_20 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel_20.widthHint = 120;
		lblNewLabel_20.setLayoutData(gd_lblNewLabel_20);
		managedForm.getToolkit().adapt(lblNewLabel_20, true, true);
		lblNewLabel_20.setText("Platform model");

		PlatformModel = new CCombo(composite_4, SWT.NONE);
		PlatformModel.setItems(new String[] {"NONE", "ONSHORE", "OFFSHORE FIXED", "OFFSHORE FLOATING"});
		GridData gd_PlatformModel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_PlatformModel.widthHint = 150;
		PlatformModel.setLayoutData(gd_PlatformModel);
		PlatformModel.setToolTipText("PlatformModel");
		managedForm.getToolkit().adapt(PlatformModel, true, true);
		PlatformModel.addModifyListener( new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				if(((CCombo)(e.widget)).getSelectionIndex()==0) {
					lblPlatformPropertiesFile.setEnabled(false);
					PtfmFile.setEnabled(false);
				} else {
					lblPlatformPropertiesFile.setEnabled(true);
					PtfmFile.setEnabled(true);
				}
			}
			
		});
		
				
						lblPlatformPropertiesFile = new Label(composite_4, SWT.NONE);
						lblPlatformPropertiesFile.setEnabled(false);
						lblPlatformPropertiesFile.setText("Platform property file");
						GridData gd_lblPlatformPropertiesFile = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
						gd_lblPlatformPropertiesFile.widthHint = 150;
						lblPlatformPropertiesFile.setLayoutData(gd_lblPlatformPropertiesFile);
						managedForm.getToolkit().adapt(lblPlatformPropertiesFile, true, true);
				
				Composite composite_15 = new Composite(composite_4, SWT.NONE);
				GridLayout gl_composite_15 = new GridLayout(3, false);
				gl_composite_15.marginHeight = 0;
				gl_composite_15.marginWidth = 0;
				composite_15.setLayout(gl_composite_15);
				composite_15.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
				managedForm.getToolkit().adapt(composite_15);
				managedForm.getToolkit().paintBordersFor(composite_15);
				
						PtfmFile = new Text(composite_15, SWT.NONE);
						PtfmFile.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
						PtfmFile.setEnabled(false);
						PtfmFile.setToolTipText("PtfmFile");
						PtfmFile.setBounds(0, 0, 76, 19);
						managedForm.getToolkit().adapt(PtfmFile, true, true);
						
						cdPtfmFile = new ControlDecoration(PtfmFile, SWT.LEFT | SWT.TOP);
						cdPtfmFile.setMarginWidth(3);
						cdPtfmFile.setImage(fieldDecERR.getImage());
				
				final ImageHyperlink mghprlnkNewImagehyperlink = managedForm.getToolkit().createImageHyperlink(composite_15, SWT.NONE);
				mghprlnkNewImagehyperlink.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseDown(MouseEvent e) {
							FileDialog dialog = new FileDialog(mghprlnkNewImagehyperlink.getShell(), SWT.OPEN);
						   dialog.setFilterExtensions(new String [] {"*.pfm","*.*"});
						   dialog.setFilterPath("input");
						   String fileName = dialog.open();
						   
						   if(fileName!=null) {
							   IPath file = ((FileEditorInput)getEditor().getEditorInput()).getFile().getParent().getLocation();
							   IPath path = new Path(fileName);
							   IPath path_r = path.makeRelativeTo(file);
						  
							   PtfmFile.setText(path_r.toOSString());
						   }
					}
				});
				mghprlnkNewImagehyperlink.setImage(ResourceManager.getPluginImage("sc.ndt.editor.fast.fst.ui", "icons/page_white_get.png"));
				managedForm.getToolkit().paintBordersFor(mghprlnkNewImagehyperlink);
				mghprlnkNewImagehyperlink.setText("");
				
				ImageHyperlink mghprlnkNewImagehyperlink_2 = managedForm.getToolkit().createImageHyperlink(composite_15, SWT.NONE);
				mghprlnkNewImagehyperlink_2.setImage(ResourceManager.getPluginImage("sc.ndt.editor.fast.fst.ui", "icons/page_white_edit.png"));
				managedForm.getToolkit().paintBordersFor(mghprlnkNewImagehyperlink_2);
				mghprlnkNewImagehyperlink_2.setText("");
				
		// SECTIOIN - Tower
		Section sTower = managedForm.getToolkit().createSection(composite_13, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
		sTower.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sTower);
		sTower.setText("Tower");

		Composite composite_17 = new Composite(sTower, SWT.NONE);
		managedForm.getToolkit().adapt(composite_17);
		managedForm.getToolkit().paintBordersFor(composite_17);
		sTower.setClient(composite_17);
		GridLayout gl_composite_17 = new GridLayout(2, false);
		gl_composite_17.horizontalSpacing = 10;
		composite_17.setLayout(gl_composite_17);

		Label lblTowerNodes = new Label(composite_17, SWT.NONE);
		lblTowerNodes.setText("Tower nodes");
		managedForm.getToolkit().adapt(lblTowerNodes, true, true);

		TwrNodes = new Text(composite_17, SWT.CENTER);
		TwrNodes.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		TwrNodes.setToolTipText("TwrNodes");
		GridData gd_TwrNodes = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TwrNodes.widthHint = 50;
		TwrNodes.setLayoutData(gd_TwrNodes);
		managedForm.getToolkit().adapt(TwrNodes, true, true);
		
		Label lblTowerPropertiesFile = new Label(composite_17, SWT.NONE);
		GridData gd_lblTowerPropertiesFile = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblTowerPropertiesFile.widthHint = 150;
		lblTowerPropertiesFile.setLayoutData(gd_lblTowerPropertiesFile);
		lblTowerPropertiesFile.setText("Tower properties file");
		managedForm.getToolkit().adapt(lblTowerPropertiesFile, true, true);
		
		Composite composite_16 = new Composite(composite_17, SWT.NONE);
		composite_16.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		managedForm.getToolkit().adapt(composite_16);
		managedForm.getToolkit().paintBordersFor(composite_16);
		GridLayout gl_composite_16 = new GridLayout(4, false);
		gl_composite_16.marginWidth = 0;
		gl_composite_16.marginHeight = 0;
		composite_16.setLayout(gl_composite_16);
		
				TwrFile = new Text(composite_16, SWT.NONE);
				TwrFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
				TwrFile.setToolTipText("TwrFile");
				managedForm.getToolkit().adapt(TwrFile, true, true);
				
				ControlDecoration controlDecoration = new ControlDecoration(TwrFile, SWT.LEFT | SWT.TOP);
				controlDecoration.setMarginWidth(3);
				controlDecoration.setDescriptionText("Some description");
		
		ImageHyperlink mghprlnkNewImagehyperlink_1 = managedForm.getToolkit().createImageHyperlink(composite_16, SWT.NONE);
		GridData gd_mghprlnkNewImagehyperlink_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_mghprlnkNewImagehyperlink_1.widthHint = 18;
		gd_mghprlnkNewImagehyperlink_1.heightHint = 16;
		mghprlnkNewImagehyperlink_1.setLayoutData(gd_mghprlnkNewImagehyperlink_1);
		mghprlnkNewImagehyperlink_1.setImage(ResourceManager.getPluginImage("sc.ndt.editor.fast.fst.ui", "icons/page_white_get.png"));
		managedForm.getToolkit().paintBordersFor(mghprlnkNewImagehyperlink_1);
		mghprlnkNewImagehyperlink_1.setText("");
		
		ImageHyperlink mghprlnkNewImagehyperlink_3 = managedForm.getToolkit().createImageHyperlink(composite_16, SWT.NONE);
		GridData gd_mghprlnkNewImagehyperlink_3 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_mghprlnkNewImagehyperlink_3.widthHint = 18;
		mghprlnkNewImagehyperlink_3.setLayoutData(gd_mghprlnkNewImagehyperlink_3);
		mghprlnkNewImagehyperlink_3.setImage(ResourceManager.getPluginImage("sc.ndt.editor.fast.fst.ui", "icons/page_white_edit.png"));
		managedForm.getToolkit().paintBordersFor(mghprlnkNewImagehyperlink_3);
		mghprlnkNewImagehyperlink_3.setText("");
		new Label(composite_16, SWT.NONE);
		
		Section sNacelleYaw = managedForm.getToolkit().createSection(composite_13, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
		sNacelleYaw.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sNacelleYaw);
		sNacelleYaw.setText("Nacelle - Yaw");
		sNacelleYaw.setExpanded(false);

		Composite composite_19 = new Composite(sNacelleYaw, SWT.NONE);
		managedForm.getToolkit().adapt(composite_19);
		managedForm.getToolkit().paintBordersFor(composite_19);
		sNacelleYaw.setClient(composite_19);
		GridLayout gl_composite_19 = new GridLayout(3, false);
		gl_composite_19.horizontalSpacing = 10;
		composite_19.setLayout(gl_composite_19);

		Label lblNacelleyawSpringConstant = new Label(composite_19, SWT.NONE);
		GridData gd_lblNacelleyawSpringConstant = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblNacelleyawSpringConstant.widthHint = 230;
		lblNacelleyawSpringConstant.setLayoutData(gd_lblNacelleyawSpringConstant);
		lblNacelleyawSpringConstant.setText("Nacelle-yaw spring constant");
		managedForm.getToolkit().adapt(lblNacelleyawSpringConstant, true, true);

		YawSpr = new Text(composite_19, SWT.RIGHT);
		YawSpr.setToolTipText("YawSpr");
		GridData gd_YawSpr = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_YawSpr.widthHint = 50;
		YawSpr.setLayoutData(gd_YawSpr);
		managedForm.getToolkit().adapt(YawSpr, true, true);
		
		Label lblnmrad_1 = new Label(composite_19, SWT.NONE);
		lblnmrad_1.setText("[Nm/rad]");
		managedForm.getToolkit().adapt(lblnmrad_1, true, true);

		Label lblNacelleyawDampingConstant = new Label(composite_19, SWT.NONE);
		GridData gd_lblNacelleyawDampingConstant = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblNacelleyawDampingConstant.widthHint = 230;
		lblNacelleyawDampingConstant.setLayoutData(gd_lblNacelleyawDampingConstant);
		lblNacelleyawDampingConstant.setText("Nacelle-yaw damping constant");
		managedForm.getToolkit().adapt(lblNacelleyawDampingConstant, true, true);

		YawDamp = new Text(composite_19, SWT.RIGHT);
		YawDamp.setToolTipText("YawDamp");
		GridData gd_YawDamp = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_YawDamp.widthHint = 50;
		YawDamp.setLayoutData(gd_YawDamp);
		managedForm.getToolkit().adapt(YawDamp, true, true);
		
		Label lblnmrads = new Label(composite_19, SWT.NONE);
		lblnmrads.setText("[Nm/rad/s]");
		managedForm.getToolkit().adapt(lblnmrads, true, true);

		Label lblNeutralYawPosition = new Label(composite_19, SWT.NONE);
		GridData gd_lblNeutralYawPosition = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblNeutralYawPosition.widthHint = 230;
		lblNeutralYawPosition.setLayoutData(gd_lblNeutralYawPosition);
		lblNeutralYawPosition.setText("Neutral yaw position (0 force spring pos)");
		managedForm.getToolkit().adapt(lblNeutralYawPosition, true, true);

		YawNeut = new Text(composite_19, SWT.RIGHT);
		YawNeut.setToolTipText("YawNeut");
		GridData gd_YawNeut = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_YawNeut.widthHint = 50;
		YawNeut.setLayoutData(gd_YawNeut);
		managedForm.getToolkit().adapt(YawNeut, true, true);
		
		Label lbldeg = new Label(composite_19, SWT.NONE);
		lbldeg.setText("[deg]");
		managedForm.getToolkit().adapt(lbldeg, true, true);

		Section sctnNewSection_1 = managedForm.getToolkit().createSection(composite_13, Section.TWISTIE | Section.TITLE_BAR);
		GridData gd_sctnNewSection_1 = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
		gd_sctnNewSection_1.minimumHeight = 200;
		gd_sctnNewSection_1.heightHint = 160;
		sctnNewSection_1.setLayoutData(gd_sctnNewSection_1);
		managedForm.getToolkit().paintBordersFor(sctnNewSection_1);
		sctnNewSection_1.setText("Generator");

		CTabFolder tabFolder = new CTabFolder(sctnNewSection_1, SWT.FLAT);
		tabFolder.setTabHeight(-1);
		managedForm.getToolkit().adapt(tabFolder);
		managedForm.getToolkit().paintBordersFor(tabFolder);
		sctnNewSection_1.setClient(tabFolder);
		tabFolder.setSelectionBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		
		
		CTabItem tbtmNewItem_1 = new CTabItem(tabFolder, SWT.NONE);
		tabFolder.setSelection(tbtmNewItem_1);
		tbtmNewItem_1.setText("Simple Induction");
		
		Composite composite_6 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem_1.setControl(composite_6);
		managedForm.getToolkit().paintBordersFor(composite_6);
		GridLayout gl_composite_6 = new GridLayout(3, false);
		gl_composite_6.horizontalSpacing = 10;
		composite_6.setLayout(gl_composite_6);
		
		Label label_42 = new Label(composite_6, SWT.NONE);
		label_42.setText("Rated generator slip percentage");
		managedForm.getToolkit().adapt(label_42, true, true);
		
		SIG_SlPc = new Text(composite_6, SWT.RIGHT);
		SIG_SlPc.setToolTipText("SIG_SlPc");
		GridData gd_SIG_SlPc = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_SIG_SlPc.widthHint = 50;
		SIG_SlPc.setLayoutData(gd_SIG_SlPc);
		managedForm.getToolkit().adapt(SIG_SlPc, true, true);
		
		Label label_41 = new Label(composite_6, SWT.NONE);
		label_41.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(label_41, true, true);
		label_41.setText("[%]");
		
		
		Label lblZeroTrqGen = new Label(composite_6, SWT.NONE);
		GridData gd_lblZeroTrqGen = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblZeroTrqGen.widthHint = 230;
		lblZeroTrqGen.setLayoutData(gd_lblZeroTrqGen);
		lblZeroTrqGen.setText("Synchronous generator speed");
		managedForm.getToolkit().adapt(lblZeroTrqGen, true, true);
		
		SIG_SySp = new Text(composite_6, SWT.RIGHT);
		SIG_SySp.setToolTipText("SIG_SySp");
		GridData gd_SIG_SySp = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_SIG_SySp.widthHint = 50;
		SIG_SySp.setLayoutData(gd_SIG_SySp);
		managedForm.getToolkit().adapt(SIG_SySp, true, true);
		
		Label lblrpm_3 = new Label(composite_6, SWT.NONE);
		lblrpm_3.setText("[rpm]");
		managedForm.getToolkit().adapt(lblrpm_3, true, true);
				
		
		Label lblTorqueAtRated = new Label(composite_6, SWT.NONE);
		lblTorqueAtRated.setText("Torque at rated speed");
		managedForm.getToolkit().adapt(lblTorqueAtRated, true, true);
		
		SIG_RtTq = new Text(composite_6, SWT.RIGHT);
		SIG_RtTq.setToolTipText("SIG_RtTq");
		GridData gd_SIG_RtTq = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_SIG_RtTq.widthHint = 50;
		SIG_RtTq.setLayoutData(gd_SIG_RtTq);
		managedForm.getToolkit().adapt(SIG_RtTq, true, true);
		
		Label lblnm_2 = new Label(composite_6, SWT.NONE);
		lblnm_2.setText("[Nm]");
		managedForm.getToolkit().adapt(lblnm_2, true, true);
				
		
		Label label_50 = new Label(composite_6, SWT.NONE);
		label_50.setText("Torque at rated speed");
		managedForm.getToolkit().adapt(label_50, true, true);
		
		
		SIG_PORt = new Text(composite_6, SWT.RIGHT);
		SIG_PORt.setToolTipText("SIG_PORt");
		GridData gd_SIG_PORt = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_SIG_PORt.widthHint = 50;
		SIG_PORt.setLayoutData(gd_SIG_PORt);
		managedForm.getToolkit().adapt(SIG_PORt, true, true);
				
		new Label(composite_6, SWT.NONE);
		
		
		
		CTabItem tbtmNewItem = new CTabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("Thevenin-Equivalent Induction");

		Composite composite_12 = managedForm.getToolkit().createComposite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite_12);
		managedForm.getToolkit().paintBordersFor(composite_12);
		GridLayout gl_composite_12 = new GridLayout(3, false);
		gl_composite_12.horizontalSpacing = 10;
		composite_12.setLayout(gl_composite_12);
		
		
		Label lblNewLabel_45 = new Label(composite_12, SWT.NONE);
		GridData gd_lblNewLabel_45 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel_45.widthHint = 230;
		lblNewLabel_45.setLayoutData(gd_lblNewLabel_45);
		managedForm.getToolkit().adapt(lblNewLabel_45, true, true);
		lblNewLabel_45.setText("Line frequency (50 or 60)");

		TEC_Freq = new Text(composite_12, SWT.RIGHT);
		TEC_Freq.setToolTipText("TEC_Freq");
		GridData gd_TEC_Freq = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TEC_Freq.widthHint = 50;
		TEC_Freq.setLayoutData(gd_TEC_Freq);
		managedForm.getToolkit().adapt(TEC_Freq, true, true);
		
		Label lblhz = new Label(composite_12, SWT.NONE);
		lblhz.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(lblhz, true, true);
		lblhz.setText("[Hz]");
		

		Label lblNumberOfPoles = new Label(composite_12, SWT.NONE);
		managedForm.getToolkit().adapt(lblNumberOfPoles, true, true);
		lblNumberOfPoles.setText("Number of poles (even int > 0)");

		TEC_Npol = new Text(composite_12, SWT.RIGHT);
		GridData gd_TEC_Npol = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TEC_Npol.widthHint = 50;
		TEC_Npol.setLayoutData(gd_TEC_Npol);
		TEC_Npol.setToolTipText("TEC_Npol");
		managedForm.getToolkit().adapt(TEC_Npol, true, true);

		new Label(composite_12, SWT.NONE);
		
		
		Label lblStatorResistance = new Label(composite_12, SWT.NONE);
		managedForm.getToolkit().adapt(lblStatorResistance, true, true);
		lblStatorResistance.setText("Stator resistance");				

		TEC_Sres = new Text(composite_12, SWT.RIGHT);
		TEC_Sres.setToolTipText("TEC_Sres");
		GridData gd_TEC_Sres = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TEC_Sres.widthHint = 50;
		TEC_Sres.setLayoutData(gd_TEC_Sres);
		managedForm.getToolkit().adapt(TEC_Sres, true, true);
		
		Label label_51 = new Label(composite_12, SWT.NONE);
		label_51.setText("[ohm]");
		managedForm.getToolkit().adapt(label_51, true, true);
		
		
		Label label_52 = new Label(composite_12, SWT.NONE);
		label_52.setText("Rotor resistance");
		managedForm.getToolkit().adapt(label_52, true, true);
		
		TEC_Rres = new Text(composite_12, SWT.RIGHT);
		TEC_Rres.setToolTipText("TEC_Rres");
		GridData gd_TEC_Rres = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TEC_Rres.widthHint = 50;
		TEC_Rres.setLayoutData(gd_TEC_Rres);
		managedForm.getToolkit().adapt(TEC_Rres, true, true);
		
		Label label_53 = new Label(composite_12, SWT.NONE);
		label_53.setText("[ohm]");
		managedForm.getToolkit().adapt(label_53, true, true);
				
		
		Label label_54 = new Label(composite_12, SWT.NONE);
		label_54.setText("Line-to-line generator voltage");
		managedForm.getToolkit().adapt(label_54, true, true);

		TEC_VLL = new Text(composite_12, SWT.RIGHT);
		TEC_VLL.setToolTipText("TEC_VLL");
		GridData gd_TEC_VLL = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TEC_VLL.widthHint = 50;
		TEC_VLL.setLayoutData(gd_TEC_VLL);
		managedForm.getToolkit().adapt(TEC_VLL, true, true);

		Label label_55 = new Label(composite_12, SWT.NONE);
		label_55.setText("[V]");
		managedForm.getToolkit().adapt(label_55, true, true);
		
		
		Label label_56 = new Label(composite_12, SWT.NONE);
		label_56.setText("Stator leakage reactance");
		managedForm.getToolkit().adapt(label_56, true, true);

		TEC_SLR = new Text(composite_12, SWT.RIGHT);
		TEC_SLR.setToolTipText("TEC_SLR");
		GridData gd_TEC_SLR = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TEC_SLR.widthHint = 50;
		TEC_SLR.setLayoutData(gd_TEC_SLR);
		managedForm.getToolkit().adapt(TEC_SLR, true, true);

		Label label_57 = new Label(composite_12, SWT.NONE);
		label_57.setText("[ohm]");
		managedForm.getToolkit().adapt(label_57, true, true);
		
		
		Label label_58 = new Label(composite_12, SWT.NONE);
		label_58.setText("Rotor leakage reactance");
		managedForm.getToolkit().adapt(label_58, true, true);
		
		TEC_RLR = new Text(composite_12, SWT.RIGHT);
		TEC_RLR.setToolTipText("TEC_RLR");
		GridData gd_TEC_RLR = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TEC_RLR.widthHint = 50;
		TEC_RLR.setLayoutData(gd_TEC_RLR);
		managedForm.getToolkit().adapt(TEC_RLR, true, true);

		Label label_59 = new Label(composite_12, SWT.NONE);
		label_59.setText("[ohm]");
		managedForm.getToolkit().adapt(label_59, true, true);
		
		
		Label label_60 = new Label(composite_12, SWT.NONE);
		label_60.setText("Generator magnetizing reactance");
		managedForm.getToolkit().adapt(label_60, true, true);
		
		TEC_MR = new Text(composite_12, SWT.RIGHT);
		GridData gd_TEC_MR = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TEC_MR.widthHint = 50;
		TEC_MR.setLayoutData(gd_TEC_MR);
		TEC_MR.setToolTipText("TEC_MR");
		managedForm.getToolkit().adapt(TEC_MR, true, true);

		Label label_61 = new Label(composite_12, SWT.NONE);
		label_61.setText("[ohm]");
		managedForm.getToolkit().adapt(label_61, true, true);
		

		// SECTION - Drivetrain
		Section sDrivetrain = managedForm.getToolkit().createSection(composite_13, Section.TWISTIE | Section.TITLE_BAR);
		sDrivetrain.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sDrivetrain);
		sDrivetrain.setText("Drivetrain");

		Composite composite_8 = managedForm.getToolkit().createComposite(sDrivetrain, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite_8);
		sDrivetrain.setClient(composite_8);
		GridLayout gl_composite_8 = new GridLayout(4, false);
		gl_composite_8.horizontalSpacing = 10;
		composite_8.setLayout(gl_composite_8);

		Label lblNewLabel_33 = new Label(composite_8, SWT.NONE);
		GridData gd_lblNewLabel_33 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel_33.widthHint = 230;
		lblNewLabel_33.setLayoutData(gd_lblNewLabel_33);
		managedForm.getToolkit().adapt(lblNewLabel_33, true, true);
		lblNewLabel_33.setText("Gearbox efficiency");

		GBoxEff = new Text(composite_8, SWT.RIGHT);
		GridData gd_GBoxEff = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_GBoxEff.widthHint = 50;
		GBoxEff.setLayoutData(gd_GBoxEff);
		managedForm.getToolkit().adapt(GBoxEff, true, true);

		Label label_10 = new Label(composite_8, SWT.NONE);
		label_10.setText("[%]");
		managedForm.getToolkit().adapt(label_10, true, true);
		new Label(composite_8, SWT.NONE);

		Label lblGeneratorEfficiency = new Label(composite_8, SWT.NONE);
		managedForm.getToolkit().adapt(lblGeneratorEfficiency, true, true);
		lblGeneratorEfficiency.setText("Generator efficiency ");

		GenEff = new Text(composite_8, SWT.RIGHT);
		GridData gd_GenEff = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_GenEff.widthHint = 50;
		GenEff.setLayoutData(gd_GenEff);
		managedForm.getToolkit().adapt(GenEff, true, true);

		Label label_11 = new Label(composite_8, SWT.NONE);
		label_11.setText("[%]");
		managedForm.getToolkit().adapt(label_11, true, true);
		new Label(composite_8, SWT.NONE);

		Label lblGearboxRatio = new Label(composite_8, SWT.NONE);
		managedForm.getToolkit().adapt(lblGearboxRatio, true, true);
		lblGearboxRatio.setText("Gearbox ratio");

		GBRatio = new Text(composite_8, SWT.RIGHT);
		GridData gd_GBRatio = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_GBRatio.widthHint = 50;
		GBRatio.setLayoutData(gd_GBRatio);
		managedForm.getToolkit().adapt(GBRatio, true, true);
		new Label(composite_8, SWT.NONE);
		new Label(composite_8, SWT.NONE);

		GBRevers = new Button(composite_8, SWT.FLAT | SWT.CHECK);
		GBRevers.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		managedForm.getToolkit().adapt(GBRevers, true, true);
		GBRevers.setText("Gearbox reversal");
		new Label(composite_8, SWT.NONE);
		new Label(composite_8, SWT.NONE);

		Label lblNewLabel_36 = new Label(composite_8, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_36, true, true);
		lblNewLabel_36.setText("Fully deployed HSS-brake torque");

		HSSBrTqF = new Text(composite_8, SWT.RIGHT);
		GridData gd_HSSBrTqF = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_HSSBrTqF.widthHint = 50;
		HSSBrTqF.setLayoutData(gd_HSSBrTqF);
		managedForm.getToolkit().adapt(HSSBrTqF, true, true);

		Label lblnm = new Label(composite_8, SWT.NONE);
		lblnm.setText("[Nm]");
		managedForm.getToolkit().adapt(lblnm, true, true);
		new Label(composite_8, SWT.NONE);

		Label lblTimeForHssbrake = new Label(composite_8, SWT.NONE);
		managedForm.getToolkit().adapt(lblTimeForHssbrake, true, true);
		lblTimeForHssbrake.setText("Time to HSS-brake full deployment");

		HSSBrDT = new Text(composite_8, SWT.RIGHT);
		GridData gd_HSSBrDT = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_HSSBrDT.widthHint = 50;
		HSSBrDT.setLayoutData(gd_HSSBrDT);
		managedForm.getToolkit().adapt(HSSBrDT, true, true);

		Label lbls = new Label(composite_8, SWT.NONE);
		lbls.setText("[s]");
		managedForm.getToolkit().adapt(lbls, true, true);
		new Label(composite_8, SWT.NONE);

		Label lblDynamicBrakeTrq = new Label(composite_8, SWT.NONE);
		lblDynamicBrakeTrq.setText("Dynamic brake Trq vs HSS-speed file ");
		managedForm.getToolkit().adapt(lblDynamicBrakeTrq, true, true);

		DynBrkFi = new Text(composite_8, SWT.NONE);
		DynBrkFi.setToolTipText("DynBrkFi");
		DynBrkFi.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		managedForm.getToolkit().adapt(DynBrkFi, true, true);

		Label lblDrivetrainTorsionalSpring = new Label(composite_8, SWT.NONE);
		managedForm.getToolkit().adapt(lblDrivetrainTorsionalSpring, true, true);
		lblDrivetrainTorsionalSpring.setText("Drivetrain torsional spring ");

		DTTorSpr = new Text(composite_8, SWT.RIGHT);
		GridData gd_DTTorSpr = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_DTTorSpr.widthHint = 50;
		DTTorSpr.setLayoutData(gd_DTTorSpr);
		managedForm.getToolkit().adapt(DTTorSpr, true, true);

		Label lblnmrad = new Label(composite_8, SWT.NONE);
		lblnmrad.setText("[Nm/rad]");
		managedForm.getToolkit().adapt(lblnmrad, true, true);
		new Label(composite_8, SWT.NONE);

		Label lblDrivetrainTorsionalDamper = new Label(composite_8, SWT.NONE);
		managedForm.getToolkit().adapt(lblDrivetrainTorsionalDamper, true, true);
		lblDrivetrainTorsionalDamper.setText("Drivetrain torsional damper");

		DTTorDmp = new Text(composite_8, SWT.RIGHT);
		GridData gd_DTTorDmp = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_DTTorDmp.widthHint = 50;
		DTTorDmp.setLayoutData(gd_DTTorDmp);
		managedForm.getToolkit().adapt(DTTorDmp, true, true);

		Label lblnms = new Label(composite_8, SWT.NONE);
		lblnms.setText("[Nm/s]");
		managedForm.getToolkit().adapt(lblnms, true, true);
		new Label(composite_8, SWT.NONE);

		// SECTION - Furling
		Section sFurling = managedForm.getToolkit().createSection(composite_13, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
		sFurling.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sFurling);
		sFurling.setText("Furling");

		Composite composite_26 = new Composite(sFurling, SWT.NONE);
		managedForm.getToolkit().adapt(composite_26);
		managedForm.getToolkit().paintBordersFor(composite_26);
		sFurling.setClient(composite_26);
		GridLayout gl_composite_26 = new GridLayout(2, false);
		gl_composite_26.horizontalSpacing = 10;
		composite_26.setLayout(gl_composite_26);

		Furling = new Button(composite_26, SWT.FLAT | SWT.CHECK);
		managedForm.getToolkit().adapt(Furling, true, true);
		Furling.setText("Furling");
		// see
		// http://stackoverflow.com/questions/14398966/check-checkbox-selection-from-within-listener
		Furling.addSelectionListener(new SelectionAdapter() {
		    
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(((Button)e.widget).getSelection()) {
					lblFurlingPropertiesFile.setEnabled(true);
					FurlFile.setEnabled(true);
				} else {
					lblFurlingPropertiesFile.setEnabled(false);
		        	FurlFile.setEnabled(false);
			
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		new Label(composite_26, SWT.NONE);

		lblFurlingPropertiesFile = new Label(composite_26, SWT.NONE);
		lblFurlingPropertiesFile.setEnabled(false);
		GridData gd_lblFurlingPropertiesFile = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_lblFurlingPropertiesFile.widthHint = 120;
		lblFurlingPropertiesFile.setLayoutData(gd_lblFurlingPropertiesFile);
		lblFurlingPropertiesFile.setText("Furling properties file");
		managedForm.getToolkit().adapt(lblFurlingPropertiesFile, true, true);

		FurlFile = new Text(composite_26, SWT.NONE);
		FurlFile.setEnabled(false);
		FurlFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(FurlFile, true, true);
		
		cdFurlFile = new ControlDecoration(FurlFile, SWT.LEFT | SWT.TOP);
		cdFurlFile.setMarginWidth(3);
		cdFurlFile.setImage(fieldDecERR.getImage());
		
		Section sRotorTeeter = managedForm.getToolkit().createSection(composite_13, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
		GridData gd_sRotorTeeter = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
		gd_sRotorTeeter.heightHint = 173;
		sRotorTeeter.setLayoutData(gd_sRotorTeeter);
		managedForm.getToolkit().paintBordersFor(sRotorTeeter);
		sRotorTeeter.setText("Rotor - Teeter");
		sRotorTeeter.setExpanded(false);

		Composite composite_20 = new Composite(sRotorTeeter, SWT.NONE);
		managedForm.getToolkit().adapt(composite_20);
		managedForm.getToolkit().paintBordersFor(composite_20);
		sRotorTeeter.setClient(composite_20);
		GridLayout gl_composite_20 = new GridLayout(3, false);
		gl_composite_20.marginBottom = 3;
		gl_composite_20.horizontalSpacing = 10;
		composite_20.setLayout(gl_composite_20);

		Label lblRotorteeterSpringdamperModel = new Label(composite_20, SWT.NONE);
		lblRotorteeterSpringdamperModel.setText("Rotor-teeter spring/damper model");
		managedForm.getToolkit().adapt(lblRotorteeterSpringdamperModel, true, true);

		TeetMod = new CCombo(composite_20, SWT.RIGHT);
		TeetMod.setItems(new String[] {"NONE", "STANDARD", "USER DEF"});
		TeetMod.setToolTipText("TeetMod");

		GridData gd_TeetMod = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
		gd_TeetMod.widthHint = 100;
		TeetMod.setLayoutData(gd_TeetMod);
		managedForm.getToolkit().adapt(TeetMod, true, true);

		Label lblRotorteeterDamperPosition = new Label(composite_20, SWT.NONE);
		lblRotorteeterDamperPosition.setText("Rotor-teeter damper position");
		managedForm.getToolkit().adapt(lblRotorteeterDamperPosition, true, true);

		TeetDmpP = new Text(composite_20, SWT.RIGHT);
		TeetDmpP.setToolTipText("TeetDmpP");
		TeetDmpP.setText("0.0");
		GridData gd_TeetDmpP = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TeetDmpP.widthHint = 50;
		TeetDmpP.setLayoutData(gd_TeetDmpP);
		managedForm.getToolkit().adapt(TeetDmpP, true, true);

		Label lbldeg_1 = new Label(composite_20, SWT.NONE);
		lbldeg_1.setText("[deg]");
		managedForm.getToolkit().adapt(lbldeg_1, true, true);

		Label lblRotorteeterDampingCostant = new Label(composite_20, SWT.NONE);
		lblRotorteeterDampingCostant.setText("Rotor-teeter damping costant");
		managedForm.getToolkit().adapt(lblRotorteeterDampingCostant, true, true);

		TeetDmp = new Text(composite_20, SWT.RIGHT);
		TeetDmp.setToolTipText("TeetDmp");
		TeetDmp.setText("0.0");
		GridData gd_TeetDmp = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TeetDmp.widthHint = 50;
		TeetDmp.setLayoutData(gd_TeetDmp);
		managedForm.getToolkit().adapt(TeetDmp, true, true);

		Label lblnmdegs = new Label(composite_20, SWT.NONE);
		lblnmdegs.setText("[Nm/rad/s]");
		managedForm.getToolkit().adapt(lblnmdegs, true, true);

		Label lblRotorteeterRateindipendentCoulombdamping = new Label(composite_20, SWT.NONE);
		lblRotorteeterRateindipendentCoulombdamping.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRotorteeterRateindipendentCoulombdamping.setText("Rotor-teeter rate-indep Coulomb-damp moment");
		managedForm.getToolkit().adapt(lblRotorteeterRateindipendentCoulombdamping, true, true);

		TeetCDmp = new Text(composite_20, SWT.RIGHT);
		TeetCDmp.setToolTipText("TeetCDmp");
		TeetCDmp.setText("0.0");
		GridData gd_TeetCDmp = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TeetCDmp.widthHint = 50;
		TeetCDmp.setLayoutData(gd_TeetCDmp);
		managedForm.getToolkit().adapt(TeetCDmp, true, true);

		Label lblnm_1 = new Label(composite_20, SWT.NONE);
		lblnm_1.setText("[Nm]");
		managedForm.getToolkit().adapt(lblnm_1, true, true);

		Label lblSoftstopPosition = new Label(composite_20, SWT.NONE);
		lblSoftstopPosition.setText("Rotor-teeter soft-stop position");
		managedForm.getToolkit().adapt(lblSoftstopPosition, true, true);

		TeetSStP = new Text(composite_20, SWT.RIGHT);
		TeetSStP.setToolTipText("TeetSStP");
		TeetSStP.setText("0.0");
		GridData gd_TeetSStP = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TeetSStP.widthHint = 50;
		TeetSStP.setLayoutData(gd_TeetSStP);
		managedForm.getToolkit().adapt(TeetSStP, true, true);

		Label lbldeg_2 = new Label(composite_20, SWT.NONE);
		lbldeg_2.setText("[deg]");
		managedForm.getToolkit().adapt(lbldeg_2, true, true);

		Label lblRotorteeterHardstopPosition = new Label(composite_20, SWT.NONE);
		lblRotorteeterHardstopPosition.setText("Rotor-teeter hard-stop position");
		managedForm.getToolkit().adapt(lblRotorteeterHardstopPosition, true, true);

		TeetHStP = new Text(composite_20, SWT.RIGHT);
		TeetHStP.setToolTipText("TeetHStP");
		TeetHStP.setText("0.0");
		GridData gd_TeetHStP = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TeetHStP.widthHint = 50;
		TeetHStP.setLayoutData(gd_TeetHStP);
		managedForm.getToolkit().adapt(TeetHStP, true, true);

		Label lbldeg_3 = new Label(composite_20, SWT.NONE);
		lbldeg_3.setText("[deg]");
		managedForm.getToolkit().adapt(lbldeg_3, true, true);

		Label lblRotorteeterSoftstopLinearspring = new Label(composite_20, SWT.NONE);
		lblRotorteeterSoftstopLinearspring.setText("Rotor-teeter soft-stop linear-spring constant");
		managedForm.getToolkit().adapt(lblRotorteeterSoftstopLinearspring, true, true);

		TeetSSSp = new Text(composite_20, SWT.RIGHT);
		TeetSSSp.setToolTipText("TeetSSSp");
		TeetSSSp.setText("0.0");
		GridData gd_TeetSSSp = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TeetSSSp.widthHint = 50;
		TeetSSSp.setLayoutData(gd_TeetSSSp);
		managedForm.getToolkit().adapt(TeetSSSp, true, true);

		Label lblnmrad_2 = new Label(composite_20, SWT.NONE);
		lblnmrad_2.setText("[Nm/rad]");
		managedForm.getToolkit().adapt(lblnmrad_2, true, true);

		Label lblRotorteeterHardstopLinearspring = new Label(composite_20, SWT.NONE);
		lblRotorteeterHardstopLinearspring.setText("Rotor-teeter hard-stop linear-spring constant");
		managedForm.getToolkit().adapt(lblRotorteeterHardstopLinearspring, true, true);

		TeetHSSP = new Text(composite_20, SWT.RIGHT);
		TeetHSSP.setToolTipText("TeetHSSP");
		TeetHSSP.setText("0.0");
		GridData gd_TeetHSSP = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TeetHSSP.widthHint = 50;
		TeetHSSP.setLayoutData(gd_TeetHSSP);
		managedForm.getToolkit().adapt(TeetHSSP, true, true);

		Label label_13 = new Label(composite_20, SWT.NONE);
		label_13.setText("[Nm/rad]");
		managedForm.getToolkit().adapt(label_13, true, true);
		new Label(composite_20, SWT.NONE);
		new Label(composite_20, SWT.NONE);
		new Label(composite_20, SWT.NONE);

		Section sTipBrake = managedForm.getToolkit().createSection(composite_13, Section.TWISTIE | Section.TITLE_BAR);
		sTipBrake.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sTipBrake);
		sTipBrake.setText("Tip-Brake");

		Composite composite_27 = managedForm.getToolkit().createComposite(sTipBrake, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite_27);
		sTipBrake.setClient(composite_27);
		GridLayout gl_composite_27 = new GridLayout(3, false);
		gl_composite_27.horizontalSpacing = 10;
		composite_27.setLayout(gl_composite_27);

		Label lblTipbrakeCdIn = new Label(composite_27, SWT.NONE);
		GridData gd_lblTipbrakeCdIn = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblTipbrakeCdIn.widthHint = 230;
		lblTipbrakeCdIn.setLayoutData(gd_lblTipbrakeCdIn);
		lblTipbrakeCdIn.setText("Tip-brake Cd in normal operation");
		managedForm.getToolkit().adapt(lblTipbrakeCdIn, true, true);

		TBDrConN = new Text(composite_27, SWT.RIGHT);
		TBDrConN.setToolTipText("TBDrConN");
		TBDrConN.setText("0.0");
		GridData gd_TBDrConN = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_TBDrConN.widthHint = 50;
		TBDrConN.setLayoutData(gd_TBDrConN);
		managedForm.getToolkit().adapt(TBDrConN, true, true);

		Label label_30 = new Label(composite_27, SWT.NONE);
		label_30.setText("[m^2]");
		managedForm.getToolkit().adapt(label_30, true, true);

		Label lblTipbrakeCdIn_1 = new Label(composite_27, SWT.NONE);
		lblTipbrakeCdIn_1.setText("Tip-brake Cd in fully-deployedoperation");
		managedForm.getToolkit().adapt(lblTipbrakeCdIn_1, true, true);

		TBDrConD = new Text(composite_27, SWT.RIGHT);
		TBDrConD.setToolTipText("TBDrConD");
		TBDrConD.setText("0.0");
		GridData gd_TBDrConD = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TBDrConD.widthHint = 50;
		TBDrConD.setLayoutData(gd_TBDrConD);
		managedForm.getToolkit().adapt(TBDrConD, true, true);

		Label lblm_2 = new Label(composite_27, SWT.NONE);
		lblm_2.setText("[m^2]");
		managedForm.getToolkit().adapt(lblm_2, true, true);

		Label lblTimeToFull = new Label(composite_27, SWT.NONE);
		lblTimeToFull.setText("Time to full deployment");
		managedForm.getToolkit().adapt(lblTimeToFull, true, true);

		TpBrDT = new Text(composite_27, SWT.RIGHT);
		TpBrDT.setToolTipText("TpBrDT");
		GridData gd_TpBrDT = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TpBrDT.widthHint = 50;
		TpBrDT.setLayoutData(gd_TpBrDT);
		TpBrDT.setText("0.0");
		managedForm.getToolkit().adapt(TpBrDT, true, true);

		Label label_28 = new Label(composite_27, SWT.NONE);
		label_28.setText("[s]");
		managedForm.getToolkit().adapt(label_28, true, true);

		Section sBlade = managedForm.getToolkit().createSection(composite_13, Section.TWISTIE | Section.TITLE_BAR);
		sBlade.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sBlade);
		sBlade.setText("Blades");
		sBlade.setExpanded(true);

		Composite composite_28 = managedForm.getToolkit().createComposite(sBlade, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite_28);
		sBlade.setClient(composite_28);
		GridLayout gl_composite_28 = new GridLayout(2, false);
		gl_composite_28.horizontalSpacing = 10;
		composite_28.setLayout(gl_composite_28);

		Label lblBladePropertyFile = new Label(composite_28, SWT.NONE);
		GridData gd_lblBladePropertyFile = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblBladePropertyFile.widthHint = 120;
		lblBladePropertyFile.setLayoutData(gd_lblBladePropertyFile);
		lblBladePropertyFile.setText("Blade 1 property file");
		managedForm.getToolkit().adapt(lblBladePropertyFile, true, true);

		BldFile_1_ = new Text(composite_28, SWT.NONE);
		BldFile_1_.setToolTipText("BldFile(1)");
		BldFile_1_.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(BldFile_1_, true, true);
		
		cdBldFile_1_ = new ControlDecoration(BldFile_1_, SWT.LEFT | SWT.TOP);
		cdBldFile_1_.setMarginWidth(3);
		cdBldFile_1_.setImage(fieldDecERR.getImage());
		
		Label lblBladeProperty = new Label(composite_28, SWT.NONE);
		lblBladeProperty.setText("Blade 2 property file");
		managedForm.getToolkit().adapt(lblBladeProperty, true, true);

		BldFile_2_ = new Text(composite_28, SWT.NONE);
		BldFile_2_.setToolTipText("BldFile(2)");
		BldFile_2_.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(BldFile_2_, true, true);
		
		cdBldFile_2_ = new ControlDecoration(BldFile_2_, SWT.LEFT | SWT.TOP);
		cdBldFile_2_.setMarginWidth(3);
		cdBldFile_2_.setImage(fieldDecERR.getImage());
		
		Label lblBladeProperty_1 = new Label(composite_28, SWT.NONE);
		lblBladeProperty_1.setText("Blade 3 property file");
		managedForm.getToolkit().adapt(lblBladeProperty_1, true, true);

		BldFile_3_ = new Text(composite_28, SWT.NONE);
		BldFile_3_.setToolTipText("BldFile(3)");
		BldFile_3_.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(BldFile_3_, true, true);
		
		cdBldFile_3_ = new ControlDecoration(BldFile_3_, SWT.LEFT | SWT.TOP);
		cdBldFile_3_.setMarginWidth(3);
		cdBldFile_3_.setImage(fieldDecERR.getImage());

		Section sAeroDyn = managedForm.getToolkit().createSection(composite_13, Section.TWISTIE | Section.TITLE_BAR);
		sAeroDyn.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sAeroDyn);
		sAeroDyn.setText("AeroDyn");
		sAeroDyn.setExpanded(true);

		Composite composite_29 = managedForm.getToolkit().createComposite(sAeroDyn, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite_29);
		sAeroDyn.setClient(composite_29);
		GridLayout gl_composite_29 = new GridLayout(2, false);
		gl_composite_29.horizontalSpacing = 10;
		composite_29.setLayout(gl_composite_29);

		Label lblAerodynPropertyFile = new Label(composite_29, SWT.NONE);
		lblAerodynPropertyFile.setText("AeroDyn property file");
		GridData gd_lblAerodynPropertyFile = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblAerodynPropertyFile.widthHint = 120;
		lblAerodynPropertyFile.setLayoutData(gd_lblAerodynPropertyFile);
		managedForm.getToolkit().adapt(lblAerodynPropertyFile, true, true);

		ADFile = new Text(composite_29, SWT.NONE);
		ADFile.setToolTipText("ADFile");
		ADFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(ADFile, true, true);
		
		cdADFile = new ControlDecoration(ADFile, SWT.LEFT | SWT.TOP);
		cdADFile.setMarginWidth(3);
		cdADFile.setImage(fieldDecERR.getImage());

		Section sNoise = managedForm.getToolkit().createSection(composite_13, Section.TWISTIE | Section.TITLE_BAR);
		sNoise.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sNoise);
		sNoise.setText("Noise");
		sNoise.setExpanded(true);

		Composite composite_31 = new Composite(sNoise, SWT.NONE);
		managedForm.getToolkit().adapt(composite_31);
		managedForm.getToolkit().paintBordersFor(composite_31);
		sNoise.setClient(composite_31);
		GridLayout gl_composite_31 = new GridLayout(2, false);
		gl_composite_31.horizontalSpacing = 10;
		composite_31.setLayout(gl_composite_31);

		Label lblNewLabel_37 = new Label(composite_31, SWT.NONE);
		GridData gd_lblNewLabel_37 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel_37.widthHint = 120;
		lblNewLabel_37.setLayoutData(gd_lblNewLabel_37);
		managedForm.getToolkit().adapt(lblNewLabel_37, true, true);
		lblNewLabel_37.setText("Aerodynamic noise file");

		NoiseFile = new Text(composite_31, SWT.NONE);
		NoiseFile.setToolTipText("NoiseFile");
		NoiseFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(NoiseFile, true, true);
		
		cdNoiseFile = new ControlDecoration(NoiseFile, SWT.LEFT | SWT.TOP);
		cdNoiseFile.setMarginWidth(3);
		cdNoiseFile.setImage(fieldDecERR.getImage());

		Section sADAMS = managedForm.getToolkit().createSection(composite_13, Section.TWISTIE | Section.TITLE_BAR);
		sADAMS.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sADAMS);
		sADAMS.setText("ADAMS");
		sADAMS.setExpanded(true);

		Composite composite_33 = new Composite(sADAMS, SWT.NONE);
		managedForm.getToolkit().adapt(composite_33);
		managedForm.getToolkit().paintBordersFor(composite_33);
		sADAMS.setClient(composite_33);
		GridLayout gl_composite_33 = new GridLayout(2, false);
		gl_composite_33.horizontalSpacing = 10;
		composite_33.setLayout(gl_composite_33);

		Label lblA = managedForm.getToolkit().createLabel(composite_33, "ADAMS parameters file", SWT.NONE);
		GridData gd_lblA = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblA.widthHint = 120;
		lblA.setLayoutData(gd_lblA);

		ADAMSFile = new Text(composite_33, SWT.NONE);
		ADAMSFile.setToolTipText("ADAMSFile");
		ADAMSFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(ADAMSFile, true, true);
		
		cdADAMSFile = new ControlDecoration(ADAMSFile, SWT.LEFT | SWT.TOP);
		cdADAMSFile.setMarginWidth(3);
		cdADAMSFile.setImage(fieldDecERR.getImage());

		Section sLinearization = managedForm.getToolkit().createSection(composite_13, Section.TWISTIE | Section.TITLE_BAR);
		sLinearization.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sLinearization);
		sLinearization.setText("Linearization");
		sLinearization.setExpanded(true);

		Composite composite_34 = new Composite(sLinearization, SWT.NONE);
		managedForm.getToolkit().adapt(composite_34);
		managedForm.getToolkit().paintBordersFor(composite_34);
		sLinearization.setClient(composite_34);
		GridLayout gl_composite_34 = new GridLayout(2, false);
		gl_composite_34.horizontalSpacing = 10;
		composite_34.setLayout(gl_composite_34);

		Label lblNewLabel_6 = managedForm.getToolkit().createLabel(composite_34, "Linearization file", SWT.NONE);
		GridData gd_lblNewLabel_6 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel_6.widthHint = 120;
		lblNewLabel_6.setLayoutData(gd_lblNewLabel_6);

		LinFile = new Text(composite_34, SWT.NONE);
		LinFile.setToolTipText("LinFile");
		LinFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(LinFile, true, true);
		
		cdLinFile = new ControlDecoration(LinFile, SWT.LEFT | SWT.TOP);
		cdLinFile.setMarginWidth(3);
		cdLinFile.setImage(fieldDecERR.getImage());
		
		// This example will allow text to be dragged
        //Transfer[] types = new Transfer[] {SectionTransfer.getInstance()};

		Composite composite_14 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
		composite_14.setLayoutData(new RowData(450, SWT.DEFAULT));
		managedForm.getToolkit().adapt(composite_14);
		managedForm.getToolkit().paintBordersFor(composite_14);
		GridLayout gl_composite_14 = new GridLayout(1, false);
		composite_14.setLayout(gl_composite_14);
				
						Section sSimulationControl = managedForm.getToolkit().createSection(composite_14, Section.TWISTIE | Section.TITLE_BAR);
						sSimulationControl.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
						sSimulationControl.setDescription("");
						managedForm.getToolkit().paintBordersFor(sSimulationControl);
						sSimulationControl.setText("Simulation Control");
						sSimulationControl.setExpanded(true);
						
								Composite composite = managedForm.getToolkit().createComposite(sSimulationControl, SWT.NONE);
								managedForm.getToolkit().paintBordersFor(composite);
								sSimulationControl.setClient(composite);
								GridLayout gl_composite = new GridLayout(3, false);
								gl_composite.horizontalSpacing = 10;
								composite.setLayout(gl_composite);
								
										Echo = new Button(composite, SWT.FLAT | SWT.CHECK);
										Echo.setToolTipText("Echo");
										Echo.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
										managedForm.getToolkit().adapt(Echo, true, true);
										Echo.setText("Generate ECHO.out file");
										
												Label lblNewLabel = managedForm.getToolkit().createLabel(composite, "Pre-processor mode", SWT.NONE);
												GridData gd_lblNewLabel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
												gd_lblNewLabel.widthHint = 120;
												lblNewLabel.setLayoutData(gd_lblNewLabel);
																		
																		ADAMSPrep = new CCombo(composite, SWT.FLAT);
																		ADAMSPrep.setVisibleItemCount(4);
																		ADAMSPrep.setToolTipText("ADAMSPrep");
																		ADAMSPrep.setItems(new String[] {"", "FAST", "ADAMS", "FAST + ADAMS"});
																		GridData gd_ADAMSPrep = new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1);
																		gd_ADAMSPrep.widthHint = 100;
																		ADAMSPrep.setLayoutData(gd_ADAMSPrep);
																		managedForm.getToolkit().adapt(ADAMSPrep);
																		managedForm.getToolkit().paintBordersFor(ADAMSPrep);
																		
																
																		Label lblAnalysisMode = new Label(composite, SWT.NONE);
																		managedForm.getToolkit().adapt(lblAnalysisMode, true, true);
																		lblAnalysisMode.setText("Analysis mode");
																						
																						AnalMode = new CCombo(composite, SWT.FLAT);
																						AnalMode.setItems(new String[] {"", "TIME MARCH", "LINEARIZE"});
																						GridData gd_AnalMode = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
																						gd_AnalMode.widthHint = 100;
																						AnalMode.setLayoutData(gd_AnalMode);
																						managedForm.getToolkit().adapt(AnalMode);
																						managedForm.getToolkit().paintBordersFor(AnalMode);
																						
																						Label lblNumberOfBlades = managedForm.getToolkit().createLabel(composite, "Number of blades", SWT.NONE);
																						
																						
																								NumBl = new Text(composite, SWT.CENTER);
																								GridData gd_NumBl = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
																								gd_NumBl.widthHint = 50;
																								NumBl.setLayoutData(gd_NumBl);
																								NumBl.setToolTipText("NumBl");
																								NumBl.setText("0");
																								managedForm.getToolkit().adapt(NumBl, true, true);
																								
																										Label lblNewLabel_34 = new Label(composite, SWT.NONE);
																										managedForm.getToolkit().adapt(lblNewLabel_34, true, true);
																										lblNewLabel_34.setText("Total run time");
																										
																												TMax = new Text(composite, SWT.RIGHT);
																												TMax.setToolTipText("TMax");
																												TMax.setText("0.0");
																												GridData gd_TMax = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																												gd_TMax.widthHint = 50;
																												TMax.setLayoutData(gd_TMax);
																												managedForm.getToolkit().adapt(TMax, true, true);
																												
																														Label lbls_1 = managedForm.getToolkit().createLabel(composite, "[s]", SWT.NONE);
																														
																																Label lblNewLabel_35 = new Label(composite, SWT.NONE);
																																managedForm.getToolkit().adapt(lblNewLabel_35, true, true);
																																lblNewLabel_35.setText("Integration time step");
																																
																																		DT = new Text(composite, SWT.RIGHT);
																																		DT.setToolTipText("DT");
																																		DT.setText("0.0");
																																		GridData gd_DT = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																		gd_DT.widthHint = 50;
																																		DT.setLayoutData(gd_DT);
																																		managedForm.getToolkit().adapt(DT, true, true);
																																		
																																				Label lbls_2 = managedForm.getToolkit().createLabel(composite, "[s]", SWT.NONE);
		
				Section sctnNewSection_6 = managedForm.getToolkit().createSection(composite_14, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
				sctnNewSection_6.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
				managedForm.getToolkit().paintBordersFor(sctnNewSection_6);
				sctnNewSection_6.setText("Turbine Configuration");
				sctnNewSection_6.setExpanded(false);
				
						Composite composite_10 = new Composite(sctnNewSection_6, SWT.NONE);
						managedForm.getToolkit().adapt(composite_10);
						managedForm.getToolkit().paintBordersFor(composite_10);
						sctnNewSection_6.setClient(composite_10);
						GridLayout gl_composite_10 = new GridLayout(5, false);
						gl_composite_10.horizontalSpacing = 10;
						composite_10.setLayout(gl_composite_10);
						
								Label lblNewLabel_4 = new Label(composite_10, SWT.NONE);
								GridData gd_lblNewLabel_4 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
								gd_lblNewLabel_4.widthHint = 120;
								lblNewLabel_4.setLayoutData(gd_lblNewLabel_4);
								lblNewLabel_4.setBounds(0, 0, 49, 13);
								managedForm.getToolkit().adapt(lblNewLabel_4, true, true);
								lblNewLabel_4.setText("Rotor apex to  blade tip distance");
								
										TipRad = new Text(composite_10, SWT.RIGHT);
										TipRad.setToolTipText("TipRad");
										GridData gd_TipRad = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
										gd_TipRad.widthHint = 50;
										TipRad.setLayoutData(gd_TipRad);
										managedForm.getToolkit().adapt(TipRad, true, true);
										
												Label lblm_1 = new Label(composite_10, SWT.NONE);
												managedForm.getToolkit().adapt(lblm_1, true, true);
												lblm_1.setText("[m]");
												new Label(composite_10, SWT.NONE);
												new Label(composite_10, SWT.NONE);
												
														Label lblNewLabel_5 = new Label(composite_10, SWT.NONE);
														managedForm.getToolkit().adapt(lblNewLabel_5, true, true);
														lblNewLabel_5.setText("Rotor apex to blade root distance");
														
																HubRad = new Text(composite_10, SWT.RIGHT);
																GridData gd_HubRad = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																gd_HubRad.widthHint = 50;
																HubRad.setLayoutData(gd_HubRad);
																HubRad.setToolTipText("HubRad");
																managedForm.getToolkit().adapt(HubRad, true, true);
																
																		Label label_6 = new Label(composite_10, SWT.NONE);
																		label_6.setText("[m]");
																		managedForm.getToolkit().adapt(label_6, true, true);
																		new Label(composite_10, SWT.NONE);
																		new Label(composite_10, SWT.NONE);
																		
																				Label lblInnermostElementStill = managedForm.getToolkit().createLabel(composite_10, "Innermost element still pitchable", SWT.NONE);
																				
																						PSpnElN = new Text(composite_10, SWT.CENTER);
																						GridData gd_PSpnElN = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																						gd_PSpnElN.widthHint = 50;
																						PSpnElN.setLayoutData(gd_PSpnElN);
																						PSpnElN.setToolTipText("PSpnElN");
																						managedForm.getToolkit().adapt(PSpnElN, true, true);
																						new Label(composite_10, SWT.NONE);
																						new Label(composite_10, SWT.NONE);
																						new Label(composite_10, SWT.NONE);
																						
																								Label lblUnderslingLength = new Label(composite_10, SWT.NONE);
																								managedForm.getToolkit().adapt(lblUnderslingLength, true, true);
																								lblUnderslingLength.setText("Undersling length");
																								
																										UndSling = new Text(composite_10, SWT.RIGHT);
																										UndSling.setToolTipText("UndSling");
																										GridData gd_UndSling = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																										gd_UndSling.widthHint = 50;
																										UndSling.setLayoutData(gd_UndSling);
																										managedForm.getToolkit().adapt(UndSling, true, true);
																										
																												Label label_7 = new Label(composite_10, SWT.NONE);
																												label_7.setText("[m]");
																												managedForm.getToolkit().adapt(label_7, true, true);
																												new Label(composite_10, SWT.NONE);
																												new Label(composite_10, SWT.NONE);
																												
																														Label lblDistanceFromRotor = new Label(composite_10, SWT.NONE);
																														managedForm.getToolkit().adapt(lblDistanceFromRotor, true, true);
																														lblDistanceFromRotor.setText("Distance from rotor apex to hub mass");
																														
																																HubCM = new Text(composite_10, SWT.RIGHT);
																																GridData gd_HubCM = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																gd_HubCM.widthHint = 50;
																																HubCM.setLayoutData(gd_HubCM);
																																HubCM.setToolTipText("HubCM");
																																managedForm.getToolkit().adapt(HubCM, true, true);
																																
																																		Label label_23 = new Label(composite_10, SWT.NONE);
																																		label_23.setText("[m]");
																																		managedForm.getToolkit().adapt(label_23, true, true);
																																		new Label(composite_10, SWT.NONE);
																																		new Label(composite_10, SWT.NONE);
																																		
																																				Label lblDistanceFromYaw = new Label(composite_10, SWT.NONE);
																																				managedForm.getToolkit().adapt(lblDistanceFromYaw, true, true);
																																				lblDistanceFromYaw.setText("Distance from yaw axis to rotor apex");
																																				
																																						OverHang = new Text(composite_10, SWT.RIGHT);
																																						OverHang.setToolTipText("OverHang");
																																						GridData gd_OverHang = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																						gd_OverHang.widthHint = 50;
																																						OverHang.setLayoutData(gd_OverHang);
																																						managedForm.getToolkit().adapt(OverHang, true, true);
																																						
																																								Label label_31 = new Label(composite_10, SWT.NONE);
																																								label_31.setText("[m]");
																																								managedForm.getToolkit().adapt(label_31, true, true);
																																								new Label(composite_10, SWT.NONE);
																																								new Label(composite_10, SWT.NONE);
																																								
																																										Label lblDistanceFromThe = new Label(composite_10, SWT.NONE);
																																										managedForm.getToolkit().adapt(lblDistanceFromThe, true, true);
																																										lblDistanceFromThe.setText("Frontal distance, tower-top to nac CM");
																																										
																																												NacCMxn = new Text(composite_10, SWT.RIGHT);
																																												NacCMxn.setToolTipText("NacCMxn");
																																												GridData gd_NacCMxn = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																												gd_NacCMxn.widthHint = 50;
																																												NacCMxn.setLayoutData(gd_NacCMxn);
																																												managedForm.getToolkit().adapt(NacCMxn, true, true);
																																												
																																														Label label_32 = new Label(composite_10, SWT.NONE);
																																														label_32.setText("[m]");
																																														managedForm.getToolkit().adapt(label_32, true, true);
																																														new Label(composite_10, SWT.NONE);
																																														new Label(composite_10, SWT.NONE);
																																														
																																																Label lblNewLabel_12 = new Label(composite_10, SWT.NONE);
																																																managedForm.getToolkit().adapt(lblNewLabel_12, true, true);
																																																lblNewLabel_12.setText("Lateral  distance, tower-top to nac CM");
																																																
																																																		NacCMyn = new Text(composite_10, SWT.RIGHT);
																																																		NacCMyn.setToolTipText("NacCMyn");
																																																		GridData gd_NacCMyn = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																		gd_NacCMyn.widthHint = 50;
																																																		NacCMyn.setLayoutData(gd_NacCMyn);
																																																		managedForm.getToolkit().adapt(NacCMyn, true, true);
																																																		
																																																				Label label_33 = new Label(composite_10, SWT.NONE);
																																																				label_33.setText("[m]");
																																																				managedForm.getToolkit().adapt(label_33, true, true);
																																																				new Label(composite_10, SWT.NONE);
																																																				new Label(composite_10, SWT.NONE);
																																																				
																																																						Label lblNewLabel_13 = new Label(composite_10, SWT.NONE);
																																																						managedForm.getToolkit().adapt(lblNewLabel_13, true, true);
																																																						lblNewLabel_13.setText("Vertical distance, tower-top to nac CM");
																																																						
																																																								NacCMzn = new Text(composite_10, SWT.RIGHT);
																																																								NacCMzn.setToolTipText("NacCMzn");
																																																								GridData gd_NacCMzn = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																								gd_NacCMzn.widthHint = 50;
																																																								NacCMzn.setLayoutData(gd_NacCMzn);
																																																								managedForm.getToolkit().adapt(NacCMzn, true, true);
																																																								
																																																										Label label_34 = new Label(composite_10, SWT.NONE);
																																																										label_34.setText("[m]");
																																																										managedForm.getToolkit().adapt(label_34, true, true);
																																																										new Label(composite_10, SWT.NONE);
																																																										new Label(composite_10, SWT.NONE);
																																																										
																																																												Label lblNewLabel_14 = new Label(composite_10, SWT.NONE);
																																																												managedForm.getToolkit().adapt(lblNewLabel_14, true, true);
																																																												lblNewLabel_14.setText("Height of tower above ground level");
																																																												
																																																														TowerHt = new Text(composite_10, SWT.RIGHT);
																																																														TowerHt.setToolTipText("TowerHt");
																																																														GridData gd_TowerHt = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																														gd_TowerHt.widthHint = 50;
																																																														TowerHt.setLayoutData(gd_TowerHt);
																																																														managedForm.getToolkit().adapt(TowerHt, true, true);
																																																														
																																																																Label label_35 = new Label(composite_10, SWT.NONE);
																																																																label_35.setText("[m]");
																																																																managedForm.getToolkit().adapt(label_35, true, true);
																																																																new Label(composite_10, SWT.NONE);
																																																																new Label(composite_10, SWT.NONE);
																																																																
																																																																		Label lblNewLabel_15 = new Label(composite_10, SWT.NONE);
																																																																		managedForm.getToolkit().adapt(lblNewLabel_15, true, true);
																																																																		lblNewLabel_15.setText("Vertical dist, tower-top to rotor shaft");
																																																																		
																																																																				Twr2Shft = new Text(composite_10, SWT.RIGHT);
																																																																				Twr2Shft.setToolTipText("Twr2Shft");
																																																																				GridData gd_Twr2Shft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																				gd_Twr2Shft.widthHint = 50;
																																																																				Twr2Shft.setLayoutData(gd_Twr2Shft);
																																																																				managedForm.getToolkit().adapt(Twr2Shft, true, true);
																																																																				
																																																																						Label label_36 = new Label(composite_10, SWT.NONE);
																																																																						label_36.setText("[m]");
																																																																						managedForm.getToolkit().adapt(label_36, true, true);
																																																																						new Label(composite_10, SWT.NONE);
																																																																						new Label(composite_10, SWT.NONE);
																																																																						
																																																																								Label lblNewLabel_16 = new Label(composite_10, SWT.NONE);
																																																																								managedForm.getToolkit().adapt(lblNewLabel_16, true, true);
																																																																								lblNewLabel_16.setText("Tower rigid base height");
																																																																								
																																																																										TwrRBHt = new Text(composite_10, SWT.RIGHT);
																																																																										TwrRBHt.setToolTipText("TwrRBHt");
																																																																										GridData gd_TwrRBHt = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																										gd_TwrRBHt.widthHint = 50;
																																																																										TwrRBHt.setLayoutData(gd_TwrRBHt);
																																																																										managedForm.getToolkit().adapt(TwrRBHt, true, true);
																																																																										
																																																																												Label label_37 = new Label(composite_10, SWT.NONE);
																																																																												label_37.setText("[m]");
																																																																												managedForm.getToolkit().adapt(label_37, true, true);
																																																																												new Label(composite_10, SWT.NONE);
																																																																												new Label(composite_10, SWT.NONE);
																																																																												
																																																																														Label lblNewLabel_17 = new Label(composite_10, SWT.NONE);
																																																																														managedForm.getToolkit().adapt(lblNewLabel_17, true, true);
																																																																														lblNewLabel_17.setText("Rotor shaft tilt angle");
																																																																														
																																																																																ShftTilt = new Text(composite_10, SWT.RIGHT);
																																																																																ShftTilt.setToolTipText("ShftTilt");
																																																																																GridData gd_ShftTilt = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																gd_ShftTilt.widthHint = 50;
																																																																																ShftTilt.setLayoutData(gd_ShftTilt);
																																																																																managedForm.getToolkit().adapt(ShftTilt, true, true);
																																																																																
																																																																																		Label lbldeg_4 = new Label(composite_10, SWT.NONE);
																																																																																		lbldeg_4.setText("[deg]");
																																																																																		managedForm.getToolkit().adapt(lbldeg_4, true, true);
																																																																																		new Label(composite_10, SWT.NONE);
																																																																																		new Label(composite_10, SWT.NONE);
																																																																																		
																																																																																				Label lblNewLabel_18 = new Label(composite_10, SWT.NONE);
																																																																																				managedForm.getToolkit().adapt(lblNewLabel_18, true, true);
																																																																																				lblNewLabel_18.setText("Delta-3 angle for teetering rotors");
																																																																																				
																																																																																						Delta3 = new Text(composite_10, SWT.RIGHT);
																																																																																						Delta3.setToolTipText("Delta3");
																																																																																						GridData gd_Delta3 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																						gd_Delta3.widthHint = 50;
																																																																																						Delta3.setLayoutData(gd_Delta3);
																																																																																						managedForm.getToolkit().adapt(Delta3, true, true);
																																																																																						
																																																																																								Label lbldeg_5 = new Label(composite_10, SWT.NONE);
																																																																																								lbldeg_5.setText("[deg]");
																																																																																								managedForm.getToolkit().adapt(lbldeg_5, true, true);
																																																																																								new Label(composite_10, SWT.NONE);
																																																																																								new Label(composite_10, SWT.NONE);
																																																																																								
																																																																																										Label lblBladesConeAngle = new Label(composite_10, SWT.NONE);
																																																																																										lblBladesConeAngle.setText("Blades cone angle");
																																																																																										managedForm.getToolkit().adapt(lblBladesConeAngle, true, true);
																																																																																										
																																																																																												PreCone_1_ = new Text(composite_10, SWT.RIGHT);
																																																																																												GridData gd_PreCone_1_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																												gd_PreCone_1_.widthHint = 50;
																																																																																												PreCone_1_.setLayoutData(gd_PreCone_1_);
																																																																																												PreCone_1_.setToolTipText("PreCone(1)");
																																																																																												managedForm.getToolkit().adapt(PreCone_1_, true, true);
																																																																																												
																																																																																														PreCone_2_ = new Text(composite_10, SWT.RIGHT);
																																																																																														GridData gd_PreCone_2_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																														gd_PreCone_2_.widthHint = 50;
																																																																																														PreCone_2_.setLayoutData(gd_PreCone_2_);
																																																																																														PreCone_2_.setToolTipText("PreCone(2)");
																																																																																														managedForm.getToolkit().adapt(PreCone_2_, true, true);
																																																																																														
																																																																																																PreCone_3_ = new Text(composite_10, SWT.RIGHT);
																																																																																																GridData gd_PreCone_3_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																gd_PreCone_3_.widthHint = 50;
																																																																																																PreCone_3_.setLayoutData(gd_PreCone_3_);
																																																																																																PreCone_3_.setToolTipText("PreCone(3)");
																																																																																																managedForm.getToolkit().adapt(PreCone_3_, true, true);
																																																																																																
																																																																																																		Label label = new Label(composite_10, SWT.NONE);
																																																																																																		label.setText("[deg]");
																																																																																																		managedForm.getToolkit().adapt(label, true, true);
																																																																																																		
																																																																																																				Label lblNewLabel_22 = new Label(composite_10, SWT.NONE);
																																																																																																				managedForm.getToolkit().adapt(lblNewLabel_22, true, true);
																																																																																																				lblNewLabel_22.setText("Azimuth value");
																																																																																																				
																																																																																																						AzimB1Up = new Text(composite_10, SWT.RIGHT);
																																																																																																						AzimB1Up.setToolTipText("AzimB1Up");
																																																																																																						GridData gd_AzimB1Up = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																						gd_AzimB1Up.widthHint = 50;
																																																																																																						AzimB1Up.setLayoutData(gd_AzimB1Up);
																																																																																																						managedForm.getToolkit().adapt(AzimB1Up, true, true);
																																																																																																						
																																																																																																								Label label_1 = new Label(composite_10, SWT.NONE);
																																																																																																								label_1.setText("[deg]");
																																																																																																								managedForm.getToolkit().adapt(label_1, true, true);
																																																																																																								new Label(composite_10, SWT.NONE);
																																																																																																								new Label(composite_10, SWT.NONE);
		
				Section sMassAndInertia = managedForm.getToolkit().createSection(composite_14, Section.TWISTIE | Section.TITLE_BAR);
				sMassAndInertia.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
				managedForm.getToolkit().paintBordersFor(sMassAndInertia);
				sMassAndInertia.setText("Mass and Inertia");
				
						Composite composite_11 = managedForm.getToolkit().createComposite(sMassAndInertia, SWT.NONE); //new Composite(sMassAndInertia, SWT.NONE);
						managedForm.getToolkit().adapt(composite_11);
						managedForm.getToolkit().paintBordersFor(composite_11);
						sMassAndInertia.setClient(composite_11);
						GridLayout gl_composite_11 = new GridLayout(5, false);
						gl_composite_11.horizontalSpacing = 10;
						composite_11.setLayout(gl_composite_11);
						
								Label YawBrMassDesc = new Label(composite_11, SWT.NONE);
								GridData gd_YawBrMassDesc = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
								gd_YawBrMassDesc.widthHint = 120;
								YawBrMassDesc.setLayoutData(gd_YawBrMassDesc);
								managedForm.getToolkit().adapt(YawBrMassDesc, true, true);
								YawBrMassDesc.setText("Yaw bearing mass");
								
										YawBrMass = new Text(composite_11, SWT.RIGHT);
										YawBrMass.setToolTipText("YawBrMass");
										GridData gd_YawBrMass = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
										gd_YawBrMass.widthHint = 50;
										YawBrMass.setLayoutData(gd_YawBrMass);
										
												Label YawBrMassUnit = new Label(composite_11, SWT.NONE);
												managedForm.getToolkit().adapt(YawBrMassUnit, true, true);
												YawBrMassUnit.setText("[kg]");
												new Label(composite_11, SWT.NONE);
												new Label(composite_11, SWT.NONE);
												
														Label lblNewLabel_24 = new Label(composite_11, SWT.NONE);
														managedForm.getToolkit().adapt(lblNewLabel_24, true, true);
														lblNewLabel_24.setText("Nacelle mass");
														
																NacMass = new Text(composite_11, SWT.RIGHT);
																NacMass.setToolTipText("NacMass");
																GridData gd_NacMass = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																gd_NacMass.widthHint = 50;
																NacMass.setLayoutData(gd_NacMass);
																
																		Label label_3 = new Label(composite_11, SWT.NONE);
																		label_3.setText("[kg]");
																		managedForm.getToolkit().adapt(label_3, true, true);
																		new Label(composite_11, SWT.NONE);
																		new Label(composite_11, SWT.NONE);
																		
																				Label lblNewLabel_25 = new Label(composite_11, SWT.NONE);
																				managedForm.getToolkit().adapt(lblNewLabel_25, true, true);
																				lblNewLabel_25.setText("Hub mass");
																				
																						HubMass = new Text(composite_11, SWT.RIGHT);
																						HubMass.setToolTipText("HubMass");
																						GridData gd_HubMass = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																						gd_HubMass.widthHint = 50;
																						HubMass.setLayoutData(gd_HubMass);
																						managedForm.getToolkit().adapt(HubMass, true, true);
																						
																								label_4 = new Label(composite_11, SWT.NONE);
																								label_4.setText("[kg]");
																								managedForm.getToolkit().adapt(label_4, true, true);
																								new Label(composite_11, SWT.NONE);
																								new Label(composite_11, SWT.NONE);
																								
																										Label lblNewLabel_26 = new Label(composite_11, SWT.NONE);
																										lblNewLabel_26.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
																										managedForm.getToolkit().adapt(lblNewLabel_26, true, true);
																										lblNewLabel_26.setText("Tip-brake masses");
																										
																												TipMass_1_ = new Text(composite_11, SWT.RIGHT);
																												TipMass_1_.setToolTipText("TipMass(1)");
																												GridData gd_TipMass_1_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																												gd_TipMass_1_.widthHint = 50;
																												TipMass_1_.setLayoutData(gd_TipMass_1_);
																												managedForm.getToolkit().adapt(TipMass_1_, true, true);
																												
																														TipMass_2_ = new Text(composite_11, SWT.RIGHT);
																														TipMass_2_.setToolTipText("TipMass(2)");
																														GridData gd_TipMass_2_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																														gd_TipMass_2_.widthHint = 50;
																														TipMass_2_.setLayoutData(gd_TipMass_2_);
																														managedForm.getToolkit().adapt(TipMass_2_, true, true);
																														
																																TipMass_3_ = new Text(composite_11, SWT.RIGHT);
																																TipMass_3_.setToolTipText("TipMass(3)");
																																GridData gd_TipMass_3_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																gd_TipMass_3_.widthHint = 50;
																																TipMass_3_.setLayoutData(gd_TipMass_3_);
																																managedForm.getToolkit().adapt(TipMass_3_, true, true);
																																
																																		Label label_5 = new Label(composite_11, SWT.NONE);
																																		label_5.setText("[kg]");
																																		managedForm.getToolkit().adapt(label_5, true, true);
																																		
																																				Label lblNewLabel_30 = new Label(composite_11, SWT.NONE);
																																				managedForm.getToolkit().adapt(lblNewLabel_30, true, true);
																																				lblNewLabel_30.setText("Nac inertia @ yaw axis");
																																				
																																						NacYIner = new Text(composite_11, SWT.RIGHT);
																																						NacYIner.setToolTipText("NacYIner");
																																						GridData gd_NacYIner = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																						gd_NacYIner.widthHint = 50;
																																						NacYIner.setLayoutData(gd_NacYIner);
																																						managedForm.getToolkit().adapt(NacYIner, true, true);
																																						
																																								Label lblkgm = new Label(composite_11, SWT.NONE);
																																								lblkgm.setText("[kg*m^2]");
																																								managedForm.getToolkit().adapt(lblkgm, true, true);
																																								new Label(composite_11, SWT.NONE);
																																								new Label(composite_11, SWT.NONE);
																																								
																																										Label lblNewLabel_29 = new Label(composite_11, SWT.NONE);
																																										managedForm.getToolkit().adapt(lblNewLabel_29, true, true);
																																										lblNewLabel_29.setText("Generator inertia @ HSS");
																																										
																																												GenIner = new Text(composite_11, SWT.RIGHT);
																																												GenIner.setToolTipText("GenIner");
																																												GridData gd_GenIner = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																												gd_GenIner.widthHint = 50;
																																												GenIner.setLayoutData(gd_GenIner);
																																												managedForm.getToolkit().adapt(GenIner, true, true);
																																												
																																														Label label_8 = new Label(composite_11, SWT.NONE);
																																														label_8.setText("[kg*m^2]");
																																														managedForm.getToolkit().adapt(label_8, true, true);
																																														new Label(composite_11, SWT.NONE);
																																														new Label(composite_11, SWT.NONE);
																																														
																																																Label lblNewLabel_31 = new Label(composite_11, SWT.NONE);
																																																managedForm.getToolkit().adapt(lblNewLabel_31, true, true);
																																																lblNewLabel_31.setText("Hub inertia @ rotor axis");
																																																
																																																		HubIner = new Text(composite_11, SWT.RIGHT);
																																																		HubIner.setToolTipText("HubIner");
																																																		GridData gd_HubIner = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																		gd_HubIner.widthHint = 50;
																																																		HubIner.setLayoutData(gd_HubIner);
																																																		managedForm.getToolkit().adapt(HubIner, true, true);
																																																		
																																																				Label label_9 = new Label(composite_11, SWT.NONE);
																																																				label_9.setText("[kg*m^2]");
																																																				managedForm.getToolkit().adapt(label_9, true, true);
																																																				new Label(composite_11, SWT.NONE);
																																																				new Label(composite_11, SWT.NONE);
		
		
				Section sTurbineControl = managedForm.getToolkit().createSection(composite_14, Section.TWISTIE | Section.TITLE_BAR);
				GridData gd_sTurbineControl = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
				gd_sTurbineControl.heightHint = 293;
				sTurbineControl.setLayoutData(gd_sTurbineControl);
				managedForm.getToolkit().paintBordersFor(sTurbineControl);
				sTurbineControl.setText("Turbine Control");
				sTurbineControl.setExpanded(true);
				
						CTabFolder tabFolder_1 = new CTabFolder(sTurbineControl, SWT.FLAT);
						sTurbineControl.setClient(tabFolder_1);
						managedForm.getToolkit().adapt(tabFolder_1);
						managedForm.getToolkit().paintBordersFor(tabFolder_1);
						tabFolder_1.setSelectionBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
						
								CTabItem tbtmYaw = new CTabItem(tabFolder_1, SWT.NONE);
								tbtmYaw.setImage(null);
								tbtmYaw.setText("Yaw");
																
										Composite composite_1 = new Composite(tabFolder_1, SWT.NONE);
										tbtmYaw.setControl(composite_1);
										managedForm.getToolkit().adapt(composite_1);
										managedForm.getToolkit().paintBordersFor(composite_1);
										GridLayout gl_composite_1 = new GridLayout(5, false);
										gl_composite_1.horizontalSpacing = 10;
										composite_1.setLayout(gl_composite_1);
										
										
												Label lblNewLabel_1 = new Label(composite_1, SWT.NONE);
												GridData gd_lblNewLabel_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
												gd_lblNewLabel_1.widthHint = 120;
												lblNewLabel_1.setLayoutData(gd_lblNewLabel_1);
												managedForm.getToolkit().adapt(lblNewLabel_1, true, true);
												lblNewLabel_1.setText("Yaw control mode");
												
														YCMode = new CCombo(composite_1, SWT.CENTER);
														YCMode.setItems(new String[] {"NONE", "USER DEFINED", "SIMULINK"});
														YCMode.setToolTipText("YCMode 0:none, 1:user function, 2:SIMULINK");
														GridData gd_YCMode = new GridData(SWT.LEFT, SWT.CENTER, false, false, 4, 1);
														gd_YCMode.widthHint = 100;
														YCMode.setLayoutData(gd_YCMode);
														managedForm.getToolkit().adapt(YCMode, true, true);
																		
																						
																								Label lblTimeToEnable = new Label(composite_1, SWT.NONE);
																								GridData gd_lblTimeToEnable = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																								gd_lblTimeToEnable.heightHint = 15;
																								lblTimeToEnable.setLayoutData(gd_lblTimeToEnable);
																								lblTimeToEnable.setText("enable @");
																								managedForm.getToolkit().adapt(lblTimeToEnable, true, true);
																						
																								TYCOn = new Text(composite_1, SWT.CENTER);
																								TYCOn.setToolTipText("TYCOn");
																								TYCOn.setText("0.0");
																								GridData gd_TYCOn = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																								gd_TYCOn.widthHint = 50;
																								TYCOn.setLayoutData(gd_TYCOn);
																								managedForm.getToolkit().adapt(TYCOn, true, true);
																						
																								Label label_15 = new Label(composite_1, SWT.NONE);
																								label_15.setText("[s]");
																								managedForm.getToolkit().adapt(label_15, true, true);
																						new Label(composite_1, SWT.NONE);
																						new Label(composite_1, SWT.NONE);
																						
																						Label label_43 = new Label(composite_1, SWT.SEPARATOR | SWT.HORIZONTAL);
																						label_43.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
																						managedForm.getToolkit().adapt(label_43, true, true);
																																										
																						Label lblYawManeuverOrride = new Label(composite_1, SWT.NONE);
																						lblYawManeuverOrride.setText("Yaw maneuver override");
																						managedForm.getToolkit().adapt(lblYawManeuverOrride, true, true);
																						
																								NacYawF = new Text(composite_1, SWT.CENTER);
																								NacYawF.setToolTipText("NacYawF");
																								NacYawF.setText("0.0");
																								GridData gd_NacYawF = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
																								gd_NacYawF.widthHint = 50;
																								NacYawF.setLayoutData(gd_NacYawF);
																								managedForm.getToolkit().adapt(NacYawF, true, true);
																								
																										Label label_16 = new Label(composite_1, SWT.NONE);
																										label_16.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
																										label_16.setText("[deg]");
																										managedForm.getToolkit().adapt(label_16, true, true);
																										
																												Label lblNewLabel_3 = new Label(composite_1, SWT.RIGHT);
																												managedForm.getToolkit().adapt(lblNewLabel_3, true, true);
																												lblNewLabel_3.setText("start @");
																												
																														TYawManS = new Text(composite_1, SWT.CENTER);
																														TYawManS.setToolTipText("TYawManS");
																														TYawManS.setText("0.0");
																														GridData gd_TYawManS = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																														gd_TYawManS.widthHint = 50;
																														TYawManS.setLayoutData(gd_TYawManS);
																														managedForm.getToolkit().adapt(TYawManS, true, true);
																														
																																Label label_20 = new Label(composite_1, SWT.NONE);
																																label_20.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
																																label_20.setText("[s]");
																																managedForm.getToolkit().adapt(label_20, true, true);
																																
																																		Label lblEnd = new Label(composite_1, SWT.RIGHT);
																																		lblEnd.setText("end @");
																																		managedForm.getToolkit().adapt(lblEnd, true, true);
																																		
																																				TYawManE = new Text(composite_1, SWT.CENTER);
																																				TYawManE.setToolTipText("TYawManE");
																																				TYawManE.setText("0.0");
																																				GridData gd_TYawManE = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																				gd_TYawManE.widthHint = 50;
																																				TYawManE.setLayoutData(gd_TYawManE);
																																				managedForm.getToolkit().adapt(TYawManE, true, true);
																																				
																																						Label label_21 = new Label(composite_1, SWT.NONE);
																																						label_21.setText("[s]");
																																						managedForm.getToolkit().adapt(label_21, true, true);
																																						new Label(composite_1, SWT.NONE);
																																						new Label(composite_1, SWT.NONE);
																																						
																																								CTabItem tbtmGenerator = new CTabItem(tabFolder_1, SWT.NONE);
																																								tabFolder_1.setSelection(tbtmGenerator);
																																								tbtmGenerator.setText("Generator");
																																								
																																										Composite composite_21 = new Composite(tabFolder_1, SWT.NONE);
																																										composite_21.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
																																										tbtmGenerator.setControl(composite_21);
																																										managedForm.getToolkit().paintBordersFor(composite_21);
																																										GridLayout gl_composite_21 = new GridLayout(3, false);
																																										gl_composite_21.marginBottom = 15;
																																										gl_composite_21.horizontalSpacing = 10;
																																										composite_21.setLayout(gl_composite_21);
																																										
																																												Label lblVariablespeedControlMode = new Label(composite_21, SWT.NONE);
																																												GridData gd_lblVariablespeedControlMode = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																												gd_lblVariablespeedControlMode.widthHint = 230;
																																												lblVariablespeedControlMode.setLayoutData(gd_lblVariablespeedControlMode);
																																												lblVariablespeedControlMode.setText("Variable-speed control mode");
																																												managedForm.getToolkit().adapt(lblVariablespeedControlMode, true, true);
																																												
																																														VSContrl = new CCombo(composite_21, SWT.CENTER);
																																														VSContrl.setItems(new String[] {"NONE", "SIMPLE", "USER DEFINED", "SIMULINK"});
																																														VSContrl.setToolTipText("VSContrl");
																																														GridData gd_VSContrl = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
																																														gd_VSContrl.widthHint = 100;
																																														VSContrl.setLayoutData(gd_VSContrl);
																																														VSContrl.addModifyListener( new ModifyListener() {

																																															@Override
																																															public void modifyText(ModifyEvent e) {
																																																if(((CCombo)e.widget).getText().equals("SIMPLE")) {
																																																	lblRatedGeneratorSpeedfor.setEnabled(true);
																																																	VS_RtGnSp.setEnabled(true);
																																																	lblrpm.setEnabled(true);
																																																	lblRatedGeneratorTorque.setEnabled(true);
																																																	VS_RtTq.setEnabled(true);
																																																	label_19.setEnabled(true);
																																																	lblGeneratorTorqueConstant.setEnabled(true);
																																																	VS_Rgn2K.setEnabled(true);
																																																	lblNewLabel_39.setEnabled(true);
																																																	lblMethodToStart.setEnabled(true);
																																																	VS_SlPc.setEnabled(true);
																																																	label_18.setEnabled(true);
																																																} else {
																																																	lblRatedGeneratorSpeedfor.setEnabled(false);
																																																	VS_RtGnSp.setEnabled(false);
																																																	lblrpm.setEnabled(false);
																																																	lblRatedGeneratorTorque.setEnabled(false);
																																																	VS_RtTq.setEnabled(false);
																																																	label_19.setEnabled(false);
																																																	lblGeneratorTorqueConstant.setEnabled(false);
																																																	VS_Rgn2K.setEnabled(false);
																																																	lblNewLabel_39.setEnabled(false);
																																																	lblMethodToStart.setEnabled(false);
																																																	VS_SlPc.setEnabled(false);
																																																	label_18.setEnabled(false);
																																																}
																																																
																																															}
																																														
																																														});
																																														managedForm.getToolkit().adapt(VSContrl, true, true);
																																														
																																																lblRatedGeneratorSpeedfor = new Label(composite_21, SWT.NONE);
																																																managedForm.getToolkit().adapt(lblRatedGeneratorSpeedfor, true, true);
																																																lblRatedGeneratorSpeedfor.setText("Rated generator speed control (HSS side)");
																																																
																																																		VS_RtGnSp = new Text(composite_21, SWT.RIGHT);
																																																		VS_RtGnSp.setToolTipText("VS_RtGnSp");
																																																		VS_RtGnSp.setText("0.0");
																																																		GridData gd_VS_RtGnSp = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																		gd_VS_RtGnSp.widthHint = 50;
																																																		VS_RtGnSp.setLayoutData(gd_VS_RtGnSp);
																																																		managedForm.getToolkit().adapt(VS_RtGnSp, true, true);
																																																		
																																																				lblrpm = new Label(composite_21, SWT.NONE);
																																																				lblrpm.setText("[rpm]");
																																																				managedForm.getToolkit().adapt(lblrpm, true, true);
																																																																																																										
																																																								lblRatedGeneratorTorque = new Label(composite_21, SWT.NONE);
																																																								lblRatedGeneratorTorque.setText("Rated generator torque region 3");
																																																								managedForm.getToolkit().adapt(lblRatedGeneratorTorque, true, true);
																																																						
																																																								VS_RtTq = new Text(composite_21, SWT.RIGHT);
																																																								VS_RtTq.setText("0.0");
																																																								VS_RtTq.setToolTipText("VS_RtTq");
																																																								GridData gd_VS_RtTq = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																								gd_VS_RtTq.widthHint = 50;
																																																								VS_RtTq.setLayoutData(gd_VS_RtTq);
																																																								managedForm.getToolkit().adapt(VS_RtTq, true, true);
																																																								
																																																										label_19 = new Label(composite_21, SWT.NONE);
																																																										label_19.setText("[Nm]");
																																																										managedForm.getToolkit().adapt(label_19, true, true);
																																																																																																																						
																																																														lblGeneratorTorqueConstant = new Label(composite_21, SWT.NONE);
																																																														lblGeneratorTorqueConstant.setText("Generator torque constant region 2 (HSS side)");
																																																														managedForm.getToolkit().adapt(lblGeneratorTorqueConstant, true, true);
																																																												
																																																														VS_Rgn2K = new Text(composite_21, SWT.RIGHT);
																																																														VS_Rgn2K.setText("0.0");
																																																														VS_Rgn2K.setToolTipText("VS_Rgn2K");
																																																														GridData gd_VS_Rgn2K = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																														gd_VS_Rgn2K.widthHint = 50;
																																																														VS_Rgn2K.setLayoutData(gd_VS_Rgn2K);
																																																														managedForm.getToolkit().adapt(VS_Rgn2K, true, true);
																																																														
																																																																lblNewLabel_39 = new Label(composite_21, SWT.NONE);
																																																																managedForm.getToolkit().adapt(lblNewLabel_39, true, true);
																																																																lblNewLabel_39.setText("[Nm/rpm^2]");
																																																																
																																																																
																																																																		lblMethodToStart = new Label(composite_21, SWT.NONE);
																																																																		lblMethodToStart.setText("Rated slip percentage in region 2 1/2");
																																																																		managedForm.getToolkit().adapt(lblMethodToStart, true, true);
																																																																		
																																																																				VS_SlPc = new Text(composite_21, SWT.RIGHT);
																																																																				VS_SlPc.setToolTipText("VS_SlPc");
																																																																				VS_SlPc.setText("0.0");
																																																																				GridData gd_VS_SlPc = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
																																																																				gd_VS_SlPc.widthHint = 50;
																																																																				VS_SlPc.setLayoutData(gd_VS_SlPc);
																																																																				managedForm.getToolkit().adapt(VS_SlPc, true, true);
																																																																				
																																																																						label_18 = new Label(composite_21, SWT.NONE);
																																																																						label_18.setText("[%]");
																																																																						managedForm.getToolkit().adapt(label_18, true, true);
																																																																						
																																																																														
																																																																														Label lblEvents = new Label(composite_21, SWT.SEPARATOR | SWT.HORIZONTAL);
																																																																														lblEvents.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
																																																																														lblEvents.setText("Events");
																																																																														managedForm.getToolkit().adapt(lblEvents, true, true);
																																																																																																																																																										
																																																																														Label lblGeneratorModel = new Label(composite_21, SWT.NONE);
																																																																														lblGeneratorModel.setText("Generator model");
																																																																														managedForm.getToolkit().adapt(lblGeneratorModel, true, true);
																																																																										
																																																																												GenModel = new CCombo(composite_21, SWT.CENTER);
																																																																												GenModel.setVisibleItemCount(3);
																																																																												GenModel.setItems(new String[] {"NONE", "SIMPLE", "THEVENIN EQ", "USER DEFINED"});
																																																																												GenModel.setToolTipText("GenModel");
																																																																												GridData gd_GenModel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
																																																																												gd_GenModel.widthHint = 100;
																																																																												GenModel.setLayoutData(gd_GenModel);
																																																																												managedForm.getToolkit().adapt(GenModel, true, true);
																																																																										
																																																																														
																																																																																GenTiStr = new Button(composite_21, SWT.FLAT | SWT.CHECK);
																																																																																GenTiStr.setToolTipText("GenTiStr");
																																																																																GenTiStr.setText("Programmed START");
																																																																																GenTiStr.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
																																																																																managedForm.getToolkit().adapt(GenTiStr, true, true);
																																																																																
																																																																														
																																																																												
																																																																														Label lblTime = new Label(composite_21, SWT.NONE);
																																																																														managedForm.getToolkit().adapt(lblTime, true, true);
																																																																														lblTime.setText("time @");
																																																																														
																																																																																TimGenOn = new Text(composite_21, SWT.RIGHT);
																																																																																TimGenOn.setToolTipText("TimGenOn");
																																																																																TimGenOn.setText("0.0");
																																																																																GridData gd_TimGenOn = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
																																																																																gd_TimGenOn.widthHint = 50;
																																																																																TimGenOn.setLayoutData(gd_TimGenOn);
																																																																																managedForm.getToolkit().adapt(TimGenOn, true, true);
																																																																																
																																																																																		Label lbls_3 = new Label(composite_21, SWT.NONE);
																																																																																		lbls_3.setText("[s]");
																																																																																		managedForm.getToolkit().adapt(lbls_3, true, true);
																																																																																																																																																																																		
																																																																																														Label lblSpeed = new Label(composite_21, SWT.RIGHT);
																																																																																														lblSpeed.setAlignment(SWT.LEFT);
																																																																																														lblSpeed.setText("speed @");
																																																																																														GridData gd_lblSpeed = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																														gd_lblSpeed.widthHint = 50;
																																																																																														lblSpeed.setLayoutData(gd_lblSpeed);
																																																																																														managedForm.getToolkit().adapt(lblSpeed, true, true);
																																																																																												
																																																																																														SpdGenOn = new Text(composite_21, SWT.RIGHT);
																																																																																														SpdGenOn.setToolTipText("SpdGenOn");
																																																																																														SpdGenOn.setText("0.0");
																																																																																														GridData gd_SpdGenOn = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
																																																																																														gd_SpdGenOn.widthHint = 50;
																																																																																														SpdGenOn.setLayoutData(gd_SpdGenOn);
																																																																																														managedForm.getToolkit().adapt(SpdGenOn, true, true);
																																																																																												
																																																																																														Label lblrpm_2 = new Label(composite_21, SWT.NONE);
																																																																																														lblrpm_2.setText("[rpm]");
																																																																																														managedForm.getToolkit().adapt(lblrpm_2, true, true);
																																																																																												
																																																																																												
																																																																																														GenTiStp = new Button(composite_21, SWT.FLAT | SWT.CHECK);
																																																																																														GenTiStp.setToolTipText("GenTiStp");
																																																																																														GenTiStp.setText("Programmed STOP");
																																																																																														GenTiStp.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
																																																																																														managedForm.getToolkit().adapt(GenTiStp, true, true);
																																																																																												
																																																																																										
																																																																																												Label label_40 = new Label(composite_21, SWT.NONE);
																																																																																												label_40.setText("time @");
																																																																																												managedForm.getToolkit().adapt(label_40, true, true);
																																																																																												
																																																																																														TimGenOf = new Text(composite_21, SWT.RIGHT);
																																																																																														TimGenOf.setToolTipText("TimGenOf");
																																																																																														TimGenOf.setText("0.0");
																																																																																														GridData gd_TimGenOf = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
																																																																																														gd_TimGenOf.widthHint = 50;
																																																																																														TimGenOf.setLayoutData(gd_TimGenOf);
																																																																																														managedForm.getToolkit().adapt(TimGenOf, true, true);
																																																																																														
																																																																																																Label lbls_4 = new Label(composite_21, SWT.NONE);
																																																																																																lbls_4.setText("[s]");
																																																																																																managedForm.getToolkit().adapt(lbls_4, true, true);
																																																																																																
																																																																																																
																																																																																																
																																																																																																		CTabItem tabItem = new CTabItem(tabFolder_1, SWT.NONE);
																																																																																																		tabItem.setText("Brake");
																																																																																																		
																																																																																																				Composite composite_22 = new Composite(tabFolder_1, SWT.NONE);
																																																																																																				tabItem.setControl(composite_22);
																																																																																																				managedForm.getToolkit().paintBordersFor(composite_22);
																																																																																																				GridLayout gl_composite_22 = new GridLayout(5, false);
																																																																																																				gl_composite_22.horizontalSpacing = 10;
																																																																																																				composite_22.setLayout(gl_composite_22);
																																																																																																				
																																																																																																						Label label_29 = new Label(composite_22, SWT.NONE);
																																																																																																						GridData gd_label_29 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																						gd_label_29.widthHint = 120;
																																																																																																						label_29.setLayoutData(gd_label_29);
																																																																																																						label_29.setText("HSS brake model");
																																																																																																						managedForm.getToolkit().adapt(label_29, true, true);
																																																																																																						
																																																																																																								HSSBrMode = new CCombo(composite_22, SWT.CENTER);
																																																																																																								HSSBrMode.setVisibleItemCount(3);
																																																																																																								HSSBrMode.setItems(new String[] {"NONE", "SIMPLE", "USER DEFINED"});
																																																																																																								HSSBrMode.setToolTipText("HSSBrMode");
																																																																																																								GridData gd_HSSBrMode = new GridData(SWT.LEFT, SWT.CENTER, false, false, 4, 1);
																																																																																																								gd_HSSBrMode.widthHint = 100;
																																																																																																								HSSBrMode.setLayoutData(gd_HSSBrMode);
																																																																																																								managedForm.getToolkit().adapt(HSSBrMode, true, true);
																																																																																																								
																																																																																																								
																																																																																																										Label lblTimeToInitiate = new Label(composite_22, SWT.NONE);
																																																																																																										managedForm.getToolkit().adapt(lblTimeToInitiate, true, true);
																																																																																																										lblTimeToInitiate.setText("Start HSS brake");
																																																																																																										
																																																																																																												THSSBrDp = new Text(composite_22, SWT.RIGHT);
																																																																																																												THSSBrDp.setToolTipText("THSSBrDp");
																																																																																																												THSSBrDp.setText("0.0");
																																																																																																												GridData gd_THSSBrDp = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																												gd_THSSBrDp.widthHint = 50;
																																																																																																												THSSBrDp.setLayoutData(gd_THSSBrDp);
																																																																																																												managedForm.getToolkit().adapt(THSSBrDp, true, true);
																																																																																																												
																																																																																																												Label lbls_5 = new Label(composite_22, SWT.NONE);
																																																																																																												managedForm.getToolkit().adapt(lbls_5, true, true);
																																																																																																												lbls_5.setText("[s]");
																																																																																																												new Label(composite_22, SWT.NONE);
																																																																																																														new Label(composite_22, SWT.NONE);
																																																																																																												
																																																																																																														Label lblTimeToInitiate_1 = new Label(composite_22, SWT.NONE);
																																																																																																														managedForm.getToolkit().adapt(lblTimeToInitiate_1, true, true);
																																																																																																														lblTimeToInitiate_1.setText("Start dynamic gen brake");
																																																																																																														
																																																																																																																TiDynBrk = new Text(composite_22, SWT.RIGHT);
																																																																																																																TiDynBrk.setText("0.0");
																																																																																																																TiDynBrk.setToolTipText("TiDynBrk");
																																																																																																																GridData gd_TiDynBrk = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																gd_TiDynBrk.widthHint = 50;
																																																																																																																TiDynBrk.setLayoutData(gd_TiDynBrk);
																																																																																																																managedForm.getToolkit().adapt(TiDynBrk, true, true);
																																																																																																																
																																																																																																																Label label_45 = new Label(composite_22, SWT.NONE);
																																																																																																																label_45.setText("[s]");
																																																																																																																managedForm.getToolkit().adapt(label_45, true, true);
																																																																																																																new Label(composite_22, SWT.NONE);
																																																																																																																		new Label(composite_22, SWT.NONE);
																																																																																																																
																																																																																																																		Label lblTimeToStart = new Label(composite_22, SWT.NONE);
																																																																																																																		managedForm.getToolkit().adapt(lblTimeToStart, true, true);
																																																																																																																		lblTimeToStart.setText("Start override pitch man");
																																																																																																																		
																																																																																																																				TTpBrDp_1_ = new Text(composite_22, SWT.NONE);
																																																																																																																				TTpBrDp_1_.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
																																																																																																																				TTpBrDp_1_.setToolTipText("TTpBrDp(1)");
																																																																																																																				GridData gd_TTpBrDp_1_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																				gd_TTpBrDp_1_.widthHint = 50;
																																																																																																																				TTpBrDp_1_.setLayoutData(gd_TTpBrDp_1_);
																																																																																																																				managedForm.getToolkit().adapt(TTpBrDp_1_, true, true);
																																																																																																																				
																																																																																																																						TTpBrDp_2_ = new Text(composite_22, SWT.NONE);
																																																																																																																						TTpBrDp_2_.setToolTipText("TTpBrDp(2)");
																																																																																																																						GridData gd_TTpBrDp_2_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																						gd_TTpBrDp_2_.widthHint = 50;
																																																																																																																						TTpBrDp_2_.setLayoutData(gd_TTpBrDp_2_);
																																																																																																																						managedForm.getToolkit().adapt(TTpBrDp_2_, true, true);
																																																																																																																						
																																																																																																																								TTpBrDp_3_ = new Text(composite_22, SWT.NONE);
																																																																																																																								TTpBrDp_3_.setToolTipText("TTpBrDp(3)");
																																																																																																																								GridData gd_TTpBrDp_3_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																								gd_TTpBrDp_3_.widthHint = 50;
																																																																																																																								TTpBrDp_3_.setLayoutData(gd_TTpBrDp_3_);
																																																																																																																								TTpBrDp_3_.setText("");
																																																																																																																								managedForm.getToolkit().adapt(TTpBrDp_3_, true, true);
																																																																																																																										
																																																																																																																										Label label_46 = new Label(composite_22, SWT.NONE);
																																																																																																																										label_46.setText("[s]");
																																																																																																																										managedForm.getToolkit().adapt(label_46, true, true);
																																																																																																																								
																																																																																																																										Label lblTimeOfFinal = new Label(composite_22, SWT.NONE);
																																																																																																																										managedForm.getToolkit().adapt(lblTimeOfFinal, true, true);
																																																																																																																										lblTimeOfFinal.setText("Stop override pitch man");
																																																																																																																										
																																																																																																																												TBDepISp_1_ = new Text(composite_22, SWT.NONE);
																																																																																																																												TBDepISp_1_.setToolTipText("TBDepISp(1)");
																																																																																																																												GridData gd_TBDepISp_1_ = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
																																																																																																																												gd_TBDepISp_1_.widthHint = 50;
																																																																																																																												TBDepISp_1_.setLayoutData(gd_TBDepISp_1_);
																																																																																																																												managedForm.getToolkit().adapt(TBDepISp_1_, true, true);
																																																																																																																												
																																																																																																																														TBDepISp_2_ = new Text(composite_22, SWT.NONE);
																																																																																																																														TBDepISp_2_.setToolTipText("TBDepISp(2)");
																																																																																																																														TBDepISp_2_.setText("");
																																																																																																																														GridData gd_TBDepISp_2_ = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
																																																																																																																														gd_TBDepISp_2_.widthHint = 50;
																																																																																																																														TBDepISp_2_.setLayoutData(gd_TBDepISp_2_);
																																																																																																																														managedForm.getToolkit().adapt(TBDepISp_2_, true, true);
																																																																																																																														
																																																																																																																																TBDepISp_3_ = new Text(composite_22, SWT.NONE);
																																																																																																																																TBDepISp_3_.setToolTipText("TBDepISp(3)");
																																																																																																																																TBDepISp_3_.setText("");
																																																																																																																																GridData gd_TBDepISp_3_ = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
																																																																																																																																gd_TBDepISp_3_.widthHint = 50;
																																																																																																																																TBDepISp_3_.setLayoutData(gd_TBDepISp_3_);
																																																																																																																																managedForm.getToolkit().adapt(TBDepISp_3_, true, true);
																																																																																																																																
																																																																																																																																Label label_47 = new Label(composite_22, SWT.NONE);
																																																																																																																																label_47.setText("[s]");
																																																																																																																																managedForm.getToolkit().adapt(label_47, true, true);
																																																																																																																																CTabItem tbtmBrake = new CTabItem(tabFolder_1, SWT.NONE);
																																																																																																																																tbtmBrake.setText("Pitch");
																																																																																																																																
																																																																																																																																		Composite composite_23 = new Composite(tabFolder_1, SWT.NONE);
																																																																																																																																		tbtmBrake.setControl(composite_23);
																																																																																																																																		managedForm.getToolkit().paintBordersFor(composite_23);
																																																																																																																																		GridLayout gl_composite_23 = new GridLayout(5, false);
																																																																																																																																		gl_composite_23.horizontalSpacing = 10;
																																																																																																																																		composite_23.setLayout(gl_composite_23);
																																																																																																																																		
																																																																																																																																				Label label_14 = new Label(composite_23, SWT.NONE);
																																																																																																																																				GridData gd_label_14 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																				gd_label_14.widthHint = 120;
																																																																																																																																				label_14.setLayoutData(gd_label_14);
																																																																																																																																				label_14.setText("Pitch control mode");
																																																																																																																																				managedForm.getToolkit().adapt(label_14, true, true);
																																																																																																																																				
																																																																																																																																						PCMode = new CCombo(composite_23, SWT.CENTER);
																																																																																																																																						PCMode.setVisibleItemCount(3);
																																																																																																																																						PCMode.setItems(new String[] {"NONE", "USER DEFINED", "SIMULINK"});
																																																																																																																																						PCMode.setToolTipText("PCMode");
																																																																																																																																						GridData gd_PCMode = new GridData(SWT.LEFT, SWT.CENTER, false, false, 4, 1);
																																																																																																																																						gd_PCMode.widthHint = 100;
																																																																																																																																						PCMode.setLayoutData(gd_PCMode);
																																																																																																																																						managedForm.getToolkit().adapt(PCMode, true, true);
																																																																																																																																										
																																																																																																																																														
																																																																																																																																																Label lblEnable = new Label(composite_23, SWT.NONE);
																																																																																																																																																lblEnable.setText("enable @");
																																																																																																																																																managedForm.getToolkit().adapt(lblEnable, true, true);
																																																																																																																																														
																																																																																																																																																TPCOn = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																TPCOn.setToolTipText("TPCOn");
																																																																																																																																																TPCOn.setText("0.0");
																																																																																																																																																GridData gd_TPCOn = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																gd_TPCOn.widthHint = 50;
																																																																																																																																																TPCOn.setLayoutData(gd_TPCOn);
																																																																																																																																																managedForm.getToolkit().adapt(TPCOn, true, true);
																																																																																																																																														
																																																																																																																																																Label label_17 = new Label(composite_23, SWT.NONE);
																																																																																																																																																label_17.setText("[s]");
																																																																																																																																																managedForm.getToolkit().adapt(label_17, true, true);
																																																																																																																																														new Label(composite_23, SWT.NONE);
																																																																																																																																														new Label(composite_23, SWT.NONE);
																																																																																																																																																						
																																																																																																																																																								Label lblBlade_1 = new Label(composite_23, SWT.NONE);
																																																																																																																																																								managedForm.getToolkit().adapt(lblBlade_1, true, true);
																																																																																																																																																								lblBlade_1.setText("Pitch angle start");
																																																																																																																																																																
																																																																																																																																																																		TPitManS_1_ = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																																		TPitManS_1_.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.NORMAL));
																																																																																																																																																																		TPitManS_1_.setToolTipText("TPitManS(1)");
																																																																																																																																																																		TPitManS_1_.setText("0.0");
																																																																																																																																																																		GridData gd_TPitManS_1_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																																		gd_TPitManS_1_.widthHint = 50;
																																																																																																																																																																		TPitManS_1_.setLayoutData(gd_TPitManS_1_);
																																																																																																																																																																		managedForm.getToolkit().adapt(TPitManS_1_, true, true);
																																																																																																																																																														
																																																																																																																																																																TPitManS_2_ = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																																TPitManS_2_.setToolTipText("TPitManS(2)");
																																																																																																																																																																TPitManS_2_.setText("0.0");
																																																																																																																																																																GridData gd_TPitManS_2_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																																gd_TPitManS_2_.widthHint = 50;
																																																																																																																																																																TPitManS_2_.setLayoutData(gd_TPitManS_2_);
																																																																																																																																																																managedForm.getToolkit().adapt(TPitManS_2_, true, true);
																																																																																																																																																														
																																																																																																																																																																TPitManS_3_ = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																																TPitManS_3_.setToolTipText("TPitManS(3)");
																																																																																																																																																																TPitManS_3_.setText("0.0");
																																																																																																																																																																GridData gd_TPitManS_3_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																																gd_TPitManS_3_.widthHint = 50;
																																																																																																																																																																TPitManS_3_.setLayoutData(gd_TPitManS_3_);
																																																																																																																																																																managedForm.getToolkit().adapt(TPitManS_3_, true, true);
																																																																																																																																																																
																																																																																																																																																																		Label label_27 = new Label(composite_23, SWT.NONE);
																																																																																																																																																																		label_27.setText("[s]");
																																																																																																																																																																		managedForm.getToolkit().adapt(label_27, true, true);
																																																																																																																																																																		
																																																																																																																																																																				Label lblPitchAngleStop = new Label(composite_23, SWT.NONE);
																																																																																																																																																																				lblPitchAngleStop.setText("Pitch angle stop");
																																																																																																																																																																				managedForm.getToolkit().adapt(lblPitchAngleStop, true, true);
																																																																																																																																																																								
																																																																																																																																																																										TPitManE_1_ = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																																										TPitManE_1_.setToolTipText("TPitManE(1)");
																																																																																																																																																																										TPitManE_1_.setText("0.0");
																																																																																																																																																																										GridData gd_TPitManE_1_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																																										gd_TPitManE_1_.widthHint = 50;
																																																																																																																																																																										TPitManE_1_.setLayoutData(gd_TPitManE_1_);
																																																																																																																																																																										managedForm.getToolkit().adapt(TPitManE_1_, true, true);
																																																																																																																																																																										
																																																																																																																																																																												TPitManE_2_ = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																																												TPitManE_2_.setToolTipText("TPitManE(2)");
																																																																																																																																																																												TPitManE_2_.setText("0.0");
																																																																																																																																																																												GridData gd_TPitManE_2_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																																												gd_TPitManE_2_.widthHint = 50;
																																																																																																																																																																												TPitManE_2_.setLayoutData(gd_TPitManE_2_);
																																																																																																																																																																												managedForm.getToolkit().adapt(TPitManE_2_, true, true);
																																																																																																																																																																										
																																																																																																																																																																												TPitManE_3_ = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																																												TPitManE_3_.setToolTipText("TPitManE(3)");
																																																																																																																																																																												TPitManE_3_.setText("0.0");
																																																																																																																																																																												GridData gd_TPitManE_3_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																																												gd_TPitManE_3_.widthHint = 50;
																																																																																																																																																																												TPitManE_3_.setLayoutData(gd_TPitManE_3_);
																																																																																																																																																																												managedForm.getToolkit().adapt(TPitManE_3_, true, true);
																																																																																																																																																																												
																																																																																																																																																																														Label label_26 = new Label(composite_23, SWT.NONE);
																																																																																																																																																																														label_26.setText("[s]");
																																																																																																																																																																														managedForm.getToolkit().adapt(label_26, true, true);
																																																																																																																																																																														
																																																																																																																																																																																Label lblPitchAngleInitial = new Label(composite_23, SWT.NONE);
																																																																																																																																																																																lblPitchAngleInitial.setText("Pitch angle initial");
																																																																																																																																																																																managedForm.getToolkit().adapt(lblPitchAngleInitial, true, true);
																																																																																																																																																																																				
																																																																																																																																																																																						BlPitch_1_ = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																																																						BlPitch_1_.setToolTipText("BlPitch(1)");
																																																																																																																																																																																						BlPitch_1_.setText("0");
																																																																																																																																																																																						GridData gd_BlPitch_1_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																																																						gd_BlPitch_1_.widthHint = 50;
																																																																																																																																																																																						BlPitch_1_.setLayoutData(gd_BlPitch_1_);
																																																																																																																																																																																						managedForm.getToolkit().adapt(BlPitch_1_, true, true);
																																																																																																																																																																																						
																																																																																																																																																																																								BlPitch_2_ = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																																																								BlPitch_2_.setToolTipText("BlPitch(2)");
																																																																																																																																																																																								BlPitch_2_.setText("0");
																																																																																																																																																																																								GridData gd_BlPitch_2_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																																																								gd_BlPitch_2_.widthHint = 50;
																																																																																																																																																																																								BlPitch_2_.setLayoutData(gd_BlPitch_2_);
																																																																																																																																																																																								managedForm.getToolkit().adapt(BlPitch_2_, true, true);
																																																																																																																																																																																						
																																																																																																																																																																																								BlPitch_3_ = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																																																								BlPitch_3_.setToolTipText("BlPitch(3)");
																																																																																																																																																																																								BlPitch_3_.setText("0");
																																																																																																																																																																																								GridData gd_BlPitch_3_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																																																								gd_BlPitch_3_.widthHint = 50;
																																																																																																																																																																																								BlPitch_3_.setLayoutData(gd_BlPitch_3_);
																																																																																																																																																																																								managedForm.getToolkit().adapt(BlPitch_3_, true, true);
																																																																																																																																																																																								
																																																																																																																																																																																										Label label_24 = new Label(composite_23, SWT.NONE);
																																																																																																																																																																																										label_24.setText("[deg]");
																																																																																																																																																																																										managedForm.getToolkit().adapt(label_24, true, true);
																																																																																																																																																																																										
																																																																																																																																																																																												Label lblPitchAngleFinal = new Label(composite_23, SWT.NONE);
																																																																																																																																																																																												lblPitchAngleFinal.setText("Pitch angle final");
																																																																																																																																																																																												managedForm.getToolkit().adapt(lblPitchAngleFinal, true, true);
																																																																																																																																																																																																
																																																																																																																																																																																																		B1PitchF_1_ = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																																																																		B1PitchF_1_.setToolTipText("B1PitchF(1)");
																																																																																																																																																																																																		B1PitchF_1_.setText("0");
																																																																																																																																																																																																		GridData gd_B1PitchF_1_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																																																																		gd_B1PitchF_1_.widthHint = 50;
																																																																																																																																																																																																		B1PitchF_1_.setLayoutData(gd_B1PitchF_1_);
																																																																																																																																																																																																		managedForm.getToolkit().adapt(B1PitchF_1_, true, true);
																																																																																																																																																																																																		
																																																																																																																																																																																																				B1PitchF_2_ = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																																																																				B1PitchF_2_.setToolTipText("B1PitchF(2)");
																																																																																																																																																																																																				B1PitchF_2_.setText("0");
																																																																																																																																																																																																				GridData gd_B1PitchF_2_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																																																																				gd_B1PitchF_2_.widthHint = 50;
																																																																																																																																																																																																				B1PitchF_2_.setLayoutData(gd_B1PitchF_2_);
																																																																																																																																																																																																				managedForm.getToolkit().adapt(B1PitchF_2_, true, true);
																																																																																																																																																																																																		
																																																																																																																																																																																																				B1PitchF_3_ = new Text(composite_23, SWT.RIGHT);
																																																																																																																																																																																																				B1PitchF_3_.setToolTipText("B1PitchF(3)");
																																																																																																																																																																																																				B1PitchF_3_.setText("0");
																																																																																																																																																																																																				GridData gd_B1PitchF_3_ = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																																																																																																																																																																				gd_B1PitchF_3_.widthHint = 50;
																																																																																																																																																																																																				B1PitchF_3_.setLayoutData(gd_B1PitchF_3_);
																																																																																																																																																																																																				managedForm.getToolkit().adapt(B1PitchF_3_, true, true);
																																																																																																																																																																																																				
																																																																																																																																																																																																						Label label_25 = new Label(composite_23, SWT.NONE);
																																																																																																																																																																																																						label_25.setText("[deg]");
																																																																																																																																																																																																						managedForm.getToolkit().adapt(label_25, true, true);
		
		
		
				Section sFeatureFlags = managedForm.getToolkit().createSection(composite_14, Section.TWISTIE | Section.TITLE_BAR);
				sFeatureFlags.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
				sFeatureFlags.setDescription("");
				managedForm.getToolkit().paintBordersFor(sFeatureFlags);
				sFeatureFlags.setText("Feature Flags");
				
						Composite composite_3 = managedForm.getToolkit().createComposite(sFeatureFlags, SWT.NONE);
						managedForm.getToolkit().paintBordersFor(composite_3);
						sFeatureFlags.setClient(composite_3);
						GridLayout gl_composite_3 = new GridLayout(5, false);
						gl_composite_3.verticalSpacing = 2;
						composite_3.setLayout(gl_composite_3);
						
								Label lblFlapwiseBladeMode = managedForm.getToolkit().createLabel(composite_3, "Blade bending mode DOF", SWT.NONE);
								GridData gd_lblFlapwiseBladeMode = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
								gd_lblFlapwiseBladeMode.widthHint = 150;
								lblFlapwiseBladeMode.setLayoutData(gd_lblFlapwiseBladeMode);
										
												FlapDOF1 = new Button(composite_3, SWT.FLAT | SWT.CHECK);
												FlapDOF1.setToolTipText("FlapDOF1");
												managedForm.getToolkit().adapt(FlapDOF1, true, true);
												FlapDOF1.setText("1\u00B0 FL");
												
														FlapDOF2 = new Button(composite_3, SWT.FLAT | SWT.CHECK);
														FlapDOF2.setToolTipText("FlapDOF2");
														managedForm.getToolkit().adapt(FlapDOF2, true, true);
														FlapDOF2.setText("2\u00B0 FL");
														
																EdgeDOF = new Button(composite_3, SWT.FLAT | SWT.CHECK);
																EdgeDOF.setToolTipText("EdgeDOF");
																managedForm.getToolkit().adapt(EdgeDOF, true, true);
																EdgeDOF.setText("1\u00B0 ED");
																				new Label(composite_3, SWT.NONE);
																		
																				Label lblTowerBendingMode = managedForm.getToolkit().createLabel(composite_3, "Tower bending mode DOF", SWT.NONE);
																						
																								TwFADOF1 = new Button(composite_3, SWT.FLAT | SWT.CHECK);
																								TwFADOF1.setToolTipText("TwFADOF1");
																								TwFADOF1.setText("1\u00B0 FA");
																								managedForm.getToolkit().adapt(TwFADOF1, true, true);
																								
																										TwFADOF2 = new Button(composite_3, SWT.FLAT | SWT.CHECK);
																										TwFADOF2.setToolTipText("TwFADOF2");
																										TwFADOF2.setText("2\u00B0 FA");
																										managedForm.getToolkit().adapt(TwFADOF2, true, true);
																										
																												TwSSDOF1 = new Button(composite_3, SWT.FLAT | SWT.CHECK);
																												TwSSDOF1.setToolTipText("TwSSDOF1");
																												TwSSDOF1.setText("1\u00B0 SS");
																												managedForm.getToolkit().adapt(TwSSDOF1, true, true);
																										
																												TwSSDOF2 = new Button(composite_3, SWT.FLAT | SWT.CHECK);
																												TwSSDOF2.setToolTipText("TwSSDOF2");
																												TwSSDOF2.setText("2\u00B0 SS");
																												managedForm.getToolkit().adapt(TwSSDOF2, true, true);
																																
																																		Label lblNewLabel_2 = managedForm.getToolkit().createLabel(composite_3, "Drivetrain rot flex DOF", SWT.NONE);
																																		
																																				DrTrDOF = new Button(composite_3, SWT.FLAT | SWT.CHECK);
																																				DrTrDOF.setToolTipText("DrTrDOF");
																																				managedForm.getToolkit().adapt(DrTrDOF, true, true);
																																				new Label(composite_3, SWT.NONE);
																																						new Label(composite_3, SWT.NONE);
																																						new Label(composite_3, SWT.NONE);
																																				
																																						Label lblNewLabel_19 = managedForm.getToolkit().createLabel(composite_3, "Generator DOF", SWT.NONE);
																																						
																																								GenDOF = new Button(composite_3, SWT.FLAT | SWT.CHECK);
																																								GenDOF.setToolTipText("GenDOF");
																																								managedForm.getToolkit().adapt(GenDOF, true, true);
																																								new Label(composite_3, SWT.NONE);
																																										new Label(composite_3, SWT.NONE);
																																										new Label(composite_3, SWT.NONE);
																																								
																																										Label lblNewLabel_21 = managedForm.getToolkit().createLabel(composite_3, "Yaw DOF", SWT.NONE);
																																										
																																												YawDOF = new Button(composite_3, SWT.FLAT | SWT.CHECK);
																																												YawDOF.setToolTipText("YawDOF");
																																												managedForm.getToolkit().adapt(YawDOF, true, true);
																																												new Label(composite_3, SWT.NONE);
																																														new Label(composite_3, SWT.NONE);
																																														new Label(composite_3, SWT.NONE);
																																												
																																														Label lblNewLabel_23 = managedForm.getToolkit().createLabel(composite_3, "Rotor-teeter DOF", SWT.NONE);
																																														
																																																TeetDOF = new Button(composite_3, SWT.FLAT | SWT.CHECK);
																																																TeetDOF.setToolTipText("TeetDOF");
																																																managedForm.getToolkit().adapt(TeetDOF, true, true);
																																																new Label(composite_3, SWT.NONE);
																																																		new Label(composite_3, SWT.NONE);
																																																		new Label(composite_3, SWT.NONE);
																																																
																																																		Label lblNewLabel_27 = managedForm.getToolkit().createLabel(composite_3, "Solve aerodynamic forces", SWT.NONE);
																																																		
																																																				CompAero = new Button(composite_3, SWT.FLAT | SWT.CHECK);
																																																				CompAero.setToolTipText("CompAero");
																																																				managedForm.getToolkit().adapt(CompAero, true, true);
																																																				new Label(composite_3, SWT.NONE);
																																																						new Label(composite_3, SWT.NONE);
																																																						new Label(composite_3, SWT.NONE);
																																																				
																																																						Label lblNewLabel_28 = managedForm.getToolkit().createLabel(composite_3, "Solve aerodynamic noise", SWT.NONE);
																																																						
																																																								CompNoise = new Button(composite_3, SWT.FLAT | SWT.CHECK);
																																																								CompNoise.setToolTipText("CompNoise");
																																																								managedForm.getToolkit().adapt(CompNoise, true, true);
																																																								new Label(composite_3, SWT.NONE);
																																																								new Label(composite_3, SWT.NONE);
																																																								new Label(composite_3, SWT.NONE);
		
				Section sctnNewSection_4 = managedForm.getToolkit().createSection(composite_14, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
				sctnNewSection_4.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
				managedForm.getToolkit().paintBordersFor(sctnNewSection_4);
				sctnNewSection_4.setText("Initial Conditions");
				sctnNewSection_4.setExpanded(false);
				
						Composite composite_7 = managedForm.getToolkit().createComposite(sctnNewSection_4, SWT.NONE);
						managedForm.getToolkit().paintBordersFor(composite_7);
						sctnNewSection_4.setClient(composite_7);
						GridLayout gl_composite_7 = new GridLayout(3, false);
						gl_composite_7.horizontalSpacing = 10;
						composite_7.setLayout(gl_composite_7);
						
								Label lblNewLabel_7 = new Label(composite_7, SWT.NONE);
								managedForm.getToolkit().adapt(lblNewLabel_7, true, true);
								lblNewLabel_7.setText("Out-of-plane Blade-Tip displacement");
								
										OoPDefl = new Text(composite_7, SWT.RIGHT);
										GridData gd_OoPDefl = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
										gd_OoPDefl.widthHint = 50;
										OoPDefl.setLayoutData(gd_OoPDefl);
										OoPDefl.setText("0.0");
										managedForm.getToolkit().adapt(OoPDefl, true, true);
										
												Label lblm = new Label(composite_7, SWT.NONE);
												managedForm.getToolkit().adapt(lblm, true, true);
												lblm.setText("[m]");
												
														Label lblNewLabel_8 = new Label(composite_7, SWT.NONE);
														managedForm.getToolkit().adapt(lblNewLabel_8, true, true);
														lblNewLabel_8.setText("In-plane Blade-Tip deflection");
														
																IPDefl = new Text(composite_7, SWT.RIGHT);
																GridData gd_IPDefl = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																gd_IPDefl.widthHint = 50;
																IPDefl.setLayoutData(gd_IPDefl);
																managedForm.getToolkit().adapt(IPDefl, true, true);
																
																		Label label_2 = new Label(composite_7, SWT.NONE);
																		label_2.setText("[m]");
																		managedForm.getToolkit().adapt(label_2, true, true);
																		
																				Label lblNewLabel_9 = new Label(composite_7, SWT.NONE);
																				managedForm.getToolkit().adapt(lblNewLabel_9, true, true);
																				lblNewLabel_9.setText("Initial or fixed teeter angle");
																				
																						TeetDefl = new Text(composite_7, SWT.RIGHT);
																						GridData gd_TeetDefl = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																						gd_TeetDefl.widthHint = 50;
																						TeetDefl.setLayoutData(gd_TeetDefl);
																						managedForm.getToolkit().adapt(TeetDefl, true, true);
																						
																								Label lbldeg_6 = new Label(composite_7, SWT.NONE);
																								lbldeg_6.setText("[deg]");
																								managedForm.getToolkit().adapt(lbldeg_6, true, true);
																								
																										Label lblNewLabel_10 = new Label(composite_7, SWT.NONE);
																										managedForm.getToolkit().adapt(lblNewLabel_10, true, true);
																										lblNewLabel_10.setText("Azimuth angle for blade 1");
																										
																												Azimuth = new Text(composite_7, SWT.RIGHT);
																												GridData gd_Azimuth = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																												gd_Azimuth.widthHint = 50;
																												Azimuth.setLayoutData(gd_Azimuth);
																												managedForm.getToolkit().adapt(Azimuth, true, true);
																												
																														Label lbldeg_7 = new Label(composite_7, SWT.NONE);
																														lbldeg_7.setText("[deg]");
																														managedForm.getToolkit().adapt(lbldeg_7, true, true);
																														
																																Label lblInitialOrFixed = new Label(composite_7, SWT.NONE);
																																managedForm.getToolkit().adapt(lblInitialOrFixed, true, true);
																																lblInitialOrFixed.setText("Initial or fixed rotor speed");
																																
																																		RotSpeed = new Text(composite_7, SWT.RIGHT);
																																		GridData gd_RotSpeed = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																		gd_RotSpeed.widthHint = 50;
																																		RotSpeed.setLayoutData(gd_RotSpeed);
																																		managedForm.getToolkit().adapt(RotSpeed, true, true);
																																		
																																				Label lblrpm_1 = new Label(composite_7, SWT.NONE);
																																				lblrpm_1.setText("[rpm]");
																																				managedForm.getToolkit().adapt(lblrpm_1, true, true);
																																				
																																						Label lblInitialOrFixed_1 = new Label(composite_7, SWT.NONE);
																																						managedForm.getToolkit().adapt(lblInitialOrFixed_1, true, true);
																																						lblInitialOrFixed_1.setText("Initial or fixed nacelle-yaw angle");
																																						
																																								NacYaw = new Text(composite_7, SWT.RIGHT);
																																								GridData gd_NacYaw = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																								gd_NacYaw.widthHint = 50;
																																								NacYaw.setLayoutData(gd_NacYaw);
																																								managedForm.getToolkit().adapt(NacYaw, true, true);
																																								
																																										Label lbldeg_8 = new Label(composite_7, SWT.NONE);
																																										lbldeg_8.setText("[deg]");
																																										managedForm.getToolkit().adapt(lbldeg_8, true, true);
																																										
																																												Label lblForeaftTowertopDisplacement = new Label(composite_7, SWT.NONE);
																																												managedForm.getToolkit().adapt(lblForeaftTowertopDisplacement, true, true);
																																												lblForeaftTowertopDisplacement.setText("Fore-aft tower-top displacement");
																																												
																																														TTDspFA = new Text(composite_7, SWT.RIGHT);
																																														GridData gd_TTDspFA = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																														gd_TTDspFA.widthHint = 50;
																																														TTDspFA.setLayoutData(gd_TTDspFA);
																																														managedForm.getToolkit().adapt(TTDspFA, true, true);
																																														
																																																Label label_39 = new Label(composite_7, SWT.NONE);
																																																label_39.setText("[m]");
																																																managedForm.getToolkit().adapt(label_39, true, true);
																																																
																																																		Label lblNewLabel_11 = new Label(composite_7, SWT.NONE);
																																																		managedForm.getToolkit().adapt(lblNewLabel_11, true, true);
																																																		lblNewLabel_11.setText("Side-to-side tower-top displacement");
																																																		
																																																				TTDspSS = new Text(composite_7, SWT.RIGHT);
																																																				GridData gd_TTDspSS = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																				gd_TTDspSS.widthHint = 50;
																																																				TTDspSS.setLayoutData(gd_TTDspSS);
																																																				managedForm.getToolkit().adapt(TTDspSS, true, true);
																																																				
																																																						Label label_38 = new Label(composite_7, SWT.NONE);
																																																						label_38.setText("[m]");
																																																						managedForm.getToolkit().adapt(label_38, true, true);
		
				Section sctnOutput = managedForm.getToolkit().createSection(composite_14, Section.TWISTIE | Section.TITLE_BAR);
				sctnOutput.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
				managedForm.getToolkit().paintBordersFor(sctnOutput);
				sctnOutput.setText("Output");
				sctnOutput.setExpanded(true);
				
				
						Composite composite_9 = new Composite(sctnOutput, SWT.NONE);
						sctnOutput.setClient(composite_9);
						managedForm.getToolkit().adapt(composite_9);
						managedForm.getToolkit().paintBordersFor(composite_9);
						composite_9.setLayout(new GridLayout(3, false));
						
								SumPrint = new Button(composite_9, SWT.FLAT | SWT.CHECK);
								SumPrint.setToolTipText("SumPrint");
								managedForm.getToolkit().adapt(SumPrint, true, true);
								SumPrint.setText("Print summary data");
								new Label(composite_9, SWT.NONE);
										new Label(composite_9, SWT.NONE);
								
										TabDelim = new Button(composite_9, SWT.FLAT | SWT.CHECK);
										TabDelim.setToolTipText("TabDelim");
										managedForm.getToolkit().adapt(TabDelim, true, true);
										TabDelim.setText("Generate A tab-delimited tabular Output file");
										new Label(composite_9, SWT.NONE);
												new Label(composite_9, SWT.NONE);
										
												Label lblNewLabel_32 = new Label(composite_9, SWT.NONE);
												managedForm.getToolkit().adapt(lblNewLabel_32, true, true);
												lblNewLabel_32.setText("Format used for tabular output except time");
												
														OutFmt = new Text(composite_9, SWT.RIGHT);
														GridData gd_OutFmt = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
														gd_OutFmt.widthHint = 50;
														OutFmt.setLayoutData(gd_OutFmt);
														OutFmt.setToolTipText("OutFmt");
														managedForm.getToolkit().adapt(OutFmt, true, true);
																new Label(composite_9, SWT.NONE);
														
																Label lblTimeToBegin = new Label(composite_9, SWT.NONE);
																managedForm.getToolkit().adapt(lblTimeToBegin, true, true);
																lblTimeToBegin.setText("Time to begin tabular Output");
																
																		TStart = new Text(composite_9, SWT.RIGHT);
																		TStart.setToolTipText("TStart");
																		GridData gd_TStart = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																		gd_TStart.widthHint = 50;
																		TStart.setLayoutData(gd_TStart);
																		managedForm.getToolkit().adapt(TStart, true, true);
																				
																				Label label_49 = new Label(composite_9, SWT.NONE);
																				label_49.setText("[s]");
																				managedForm.getToolkit().adapt(label_49, true, true);
																		
																				Label lblOutputDecimationFactor = new Label(composite_9, SWT.NONE);
																				managedForm.getToolkit().adapt(lblOutputDecimationFactor, true, true);
																				lblOutputDecimationFactor.setText("Output decimation factor");
																				
																						DecFact = new Text(composite_9, SWT.RIGHT);
																						GridData gd_DecFact = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																						gd_DecFact.widthHint = 50;
																						DecFact.setLayoutData(gd_DecFact);
																						DecFact.setToolTipText("DecFact");
																						managedForm.getToolkit().adapt(DecFact, true, true);
																								new Label(composite_9, SWT.NONE);
																						
																								Label lblStatusMessageUpdate = new Label(composite_9, SWT.NONE);
																								lblStatusMessageUpdate.setText("Status message update interval");
																								managedForm.getToolkit().adapt(lblStatusMessageUpdate, true, true);
																								
																										SttsTime = new Text(composite_9, SWT.RIGHT);
																										SttsTime.setToolTipText("SttsTime");
																										GridData gd_SttsTime = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																										gd_SttsTime.widthHint = 50;
																										SttsTime.setLayoutData(gd_SttsTime);
																										managedForm.getToolkit().adapt(SttsTime, true, true);
																												
																												Label lbls_6 = new Label(composite_9, SWT.NONE);
																												managedForm.getToolkit().adapt(lbls_6, true, true);
																												lbls_6.setText("[s]");
																										
																												Label lblNewLabel_38 = new Label(composite_9, SWT.NONE);
																												managedForm.getToolkit().adapt(lblNewLabel_38, true, true);
																												lblNewLabel_38.setText("Downwind distance, tower-top to nacelle IMU");
																												
																														NcIMUxn = new Text(composite_9, SWT.RIGHT);
																														NcIMUxn.setToolTipText("NcIMUxn");
																														GridData gd_NcIMUxn = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																														gd_NcIMUxn.widthHint = 50;
																														NcIMUxn.setLayoutData(gd_NcIMUxn);
																														managedForm.getToolkit().adapt(NcIMUxn, true, true);
																																
																																Label lblm_3 = new Label(composite_9, SWT.NONE);
																																lblm_3.setText("[m]");
																																managedForm.getToolkit().adapt(lblm_3, true, true);
																														
																																Label lblLateralDistanceTowertop = new Label(composite_9, SWT.NONE);
																																lblLateralDistanceTowertop.setText("Lateral distance, tower-top to nacelle IMU");
																																managedForm.getToolkit().adapt(lblLateralDistanceTowertop, true, true);
																																
																																		NcIMUyn = new Text(composite_9, SWT.RIGHT);
																																		NcIMUyn.setToolTipText("NcIMUyn");
																																		GridData gd_NcIMUyn = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																		gd_NcIMUyn.widthHint = 50;
																																		NcIMUyn.setLayoutData(gd_NcIMUyn);
																																		managedForm.getToolkit().adapt(NcIMUyn, true, true);
																																				
																																				Label label_22 = new Label(composite_9, SWT.NONE);
																																				label_22.setText("[m]");
																																				managedForm.getToolkit().adapt(label_22, true, true);
																																		
																																				Label lblVertical = new Label(composite_9, SWT.NONE);
																																				managedForm.getToolkit().adapt(lblVertical, true, true);
																																				lblVertical.setText("Vertical distance from the tower-top to the nacelle IMU");
																																				
																																						NcIMUzn = new Text(composite_9, SWT.RIGHT);
																																						NcIMUzn.setToolTipText("NcIMUzn");
																																						GridData gd_NcIMUzn = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																						gd_NcIMUzn.widthHint = 50;
																																						NcIMUzn.setLayoutData(gd_NcIMUzn);
																																						managedForm.getToolkit().adapt(NcIMUzn, true, true);
																																								
																																								Label label_44 = new Label(composite_9, SWT.NONE);
																																								label_44.setText("[m]");
																																								managedForm.getToolkit().adapt(label_44, true, true);
																																						
																																								Label lblNewLabel_40 = new Label(composite_9, SWT.NONE);
																																								managedForm.getToolkit().adapt(lblNewLabel_40, true, true);
																																								lblNewLabel_40.setText("Distance from rotor apex");
																																								
																																										ShftGagL = new Text(composite_9, SWT.RIGHT);
																																										ShftGagL.setToolTipText("ShftGagL");
																																										GridData gd_ShftGagL = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																										gd_ShftGagL.widthHint = 50;
																																										ShftGagL.setLayoutData(gd_ShftGagL);
																																										managedForm.getToolkit().adapt(ShftGagL, true, true);
																																												
																																												Label label_48 = new Label(composite_9, SWT.NONE);
																																												label_48.setText("[m]");
																																												managedForm.getToolkit().adapt(label_48, true, true);
																																										
																																												Label lblNewLabel_41 = new Label(composite_9, SWT.NONE);
																																												managedForm.getToolkit().adapt(lblNewLabel_41, true, true);
																																												lblNewLabel_41.setText("Number of tower nodes that have strain gages");
																																												
																																														NTwGages = new Text(composite_9, SWT.CENTER);
																																														NTwGages.setToolTipText("NTwGages");
																																														GridData gd_NTwGages = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																														gd_NTwGages.widthHint = 50;
																																														NTwGages.setLayoutData(gd_NTwGages);
																																														managedForm.getToolkit().adapt(NTwGages, true, true);
																																														NTwGages.addModifyListener( new ModifyListener() {
																																														    
																																														    public void modifyText(ModifyEvent e) {
																																														        if(((Text)e.widget).getText().equals("0"))
																																														        	TwrGagNd.setEnabled(false);
																																														        else
																																														        	TwrGagNd.setEnabled(true);
																																														    }
																																														});
																																														
																																																new Label(composite_9, SWT.NONE);
																																														
																																																Label lblNewLabel_42 = new Label(composite_9, SWT.NONE);
																																																managedForm.getToolkit().adapt(lblNewLabel_42, true, true);
																																																lblNewLabel_42.setText("List of tower nodes that have strain gages");
																																																
																																																		TwrGagNd = new Text(composite_9, SWT.NONE);
																																																		TwrGagNd.setToolTipText("TwrGagNd");
																																																		TwrGagNd.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
																																																		managedForm.getToolkit().adapt(TwrGagNd, true, true);
																																																				
																																																						Label lblNewLabel_43 = new Label(composite_9, SWT.NONE);
																																																						managedForm.getToolkit().adapt(lblNewLabel_43, true, true);
																																																						lblNewLabel_43.setText("Number of blade nodes that have strain gages for output");
																																																				
																																																				NBlGages = new Text(composite_9, SWT.CENTER);
																																																				GridData gd_text_2 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
																																																				gd_text_2.widthHint = 50;
																																																				NBlGages.setLayoutData(gd_text_2);
																																																				NBlGages.addModifyListener( new ModifyListener() {
																																																				    
																																																				    public void modifyText(ModifyEvent e) {
																																																				        if(((Text)e.widget).getText().equals("0"))
																																																				        	BldGagNd.setEnabled(false);
																																																				        else
																																																				        	BldGagNd.setEnabled(true);
																																																				    }
																																																				});
																																																				managedForm.getToolkit().adapt(NBlGages, true, true);
																																																				NBlGages.setToolTipText("NBlGages");
																																																				new Label(composite_9, SWT.NONE);
																																																				
																																																				Label lblNewLabel_44 = new Label(composite_9, SWT.NONE);
																																																				managedForm.getToolkit().adapt(lblNewLabel_44, true, true);
																																																				lblNewLabel_44.setText("List of blade nodes that have strain gages");
																																																				
																																																				BldGagNd = new Text(composite_9, SWT.NONE);
																																																				BldGagNd.setToolTipText("BldGagNd");
																																																				BldGagNd.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
																																																				managedForm.getToolkit().adapt(BldGagNd, true, true);
																																																						
		
		Section sctnOutputList = managedForm.getToolkit().createSection(composite_14, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
		sctnOutputList.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(sctnOutputList);
		sctnOutputList.setText("Channels");
		
				Composite composite_5 = managedForm.getToolkit().createComposite(sctnOutputList, SWT.NONE);
				managedForm.getToolkit().paintBordersFor(composite_5);
				sctnOutputList.setClient(composite_5);
				GridLayout gl_composite_5 = new GridLayout(1, false);
				gl_composite_5.horizontalSpacing = 10;
				composite_5.setLayout(gl_composite_5);
				
				
						// OutList
						checkboxTreeViewer = new CheckboxTreeViewer(composite_5, SWT.MULTI);
						Tree treeTower = checkboxTreeViewer.getTree();
						treeTower.setHeaderVisible(true);
						treeTower.setLinesVisible(true);
						GridData gd_treeTower = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
						gd_treeTower.heightHint = 400;
						treeTower.setLayoutData(gd_treeTower);
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

								// TODO write to xtext model
								document.modify(new IUnitOfWork.Void<XtextResource>() {
									@Override
									public void process(XtextResource resource) throws Exception {
										ModelFastfst m = (ModelFastfst) resource.getContents().get(0);
										if (m != null && m.getOutList() != null)
											m.getOutList().setValue(outList.getAllSelectedByBlock());
										else
											throw new IllegalStateException("Uh uh, no content");

									};
								});

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
		initXDB_TurbineControl		(m_bindingContext);
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
		
	}

	protected DataBindingContext initXDB_SimulationControl (DataBindingContext bindingContext) {

		// Echo
		IObservableValue observeSelectionEchoObserveWidget = WidgetProperties.selection().observe(Echo);
		IObservableValue modelValueObserveValue_Echo = XtextProperties.value( FeaturePath.fromList( bindFastfstPackage().getModelFastfst_Echo(), bindFastfstPackage().getbEcho_Value()) ).observe(document);
		bindingContext.bindValue(observeSelectionEchoObserveWidget, modelValueObserveValue_Echo, null, null);
		// ADAMSPrep
		IObservableValue observeTextADAMSPrepObserveWidget = WidgetProperties.singleSelectionIndex().observe(ADAMSPrep);
		IObservableValue modelValueObserveValueA = XtextProperties.value(FeaturePath.fromList( bindFastfstPackage().getModelFastfst_ADAMSPrep(), bindFastfstPackage().getiADAMSPrep_Value()) ).observe(document);
		bindingContext.bindValue(observeTextADAMSPrepObserveWidget, modelValueObserveValueA, null, null);
		
		IObservableValue observeAnalModeObserveWidget = WidgetProperties.singleSelectionIndex().observe(AnalMode);
		IObservableValue modelValueObserveValueB = XtextProperties.value(FeaturePath.fromList( bindFastfstPackage().getModelFastfst_AnalMode(), bindFastfstPackage().getiAnalMode_Value()) ).observe(document);
		bindingContext.bindValue(observeAnalModeObserveWidget, modelValueObserveValueB, null, null);
		// NumBl
		IObservableValue observeTextNumBlObserveWidget = WidgetProperties.text(SWT.Modify).observe(NumBl);
		IObservableValue modelValueObserveValueC = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NumBl(), bindFastfstPackage().getiNumBl_Value())).observe(document);
		bindingContext.bindValue(observeTextNumBlObserveWidget, modelValueObserveValueC, null, null);
		// TMax
		IObservableValue observeTextTMaxObserveWidget = WidgetProperties.text(SWT.Modify).observe(TMax);
		IObservableValue modelValueObserveValue_33 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TMax(), bindFastfstPackage().getnTMax_Value())).observe(document);
		bindingContext.bindValue(observeTextTMaxObserveWidget, modelValueObserveValue_33, null, null);
		// DT
		IObservableValue observeTextDTObserveWidget = WidgetProperties.text(SWT.Modify).observe(DT);
		IObservableValue modelValueObserveValue_34 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_DT(), bindFastfstPackage().getnDT_Value())).observe(document);
		bindingContext.bindValue(observeTextDTObserveWidget, modelValueObserveValue_34, null, null);

		return bindingContext;
	}
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
	protected DataBindingContext initXDB_Furling (DataBindingContext bindingContext) {

		//
		IObservableValue observeSelectionFurlingObserveWidget = WidgetProperties.selection().observe(Furling);
		IObservableValue modelValueObserveValue_12 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_Furling(), bindFastfstPackage().getbFurling_Value())).observe(document);
		bindingContext.bindValue(observeSelectionFurlingObserveWidget, modelValueObserveValue_12, null, null);
		//
		IObservableValue observeTextFurlFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(FurlFile);
		IObservableValue modelValueObserveValue_13 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_FurlFile(), bindFastfstPackage().getfFurlFile_Value())).observe(document);
		bindingContext.bindValue(observeTextFurlFileObserveWidget, modelValueObserveValue_13, 
				new UpdateValueStrategy().setAfterConvertValidator(
						new FileValidator("File doesn't exist",cdFurlFile,uri)
						), 
						null);

		return bindingContext;
	}
	protected DataBindingContext initXDB_RotorTeeter (DataBindingContext bindingContext) {	
		//
		IObservableValue observeTextTeetModObserveWidget = WidgetProperties.singleSelectionIndex().observe(TeetMod);
		IObservableValue modelValueObserveValue_12 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TeetMod(), bindFastfstPackage().getiTeetMod_Value())).observe(document);
		bindingContext.bindValue(observeTextTeetModObserveWidget, modelValueObserveValue_12, null, null);
		//
		IObservableValue observeTextTeetDmpPObserveWidget = WidgetProperties.text(SWT.Modify).observe(TeetDmpP);
		IObservableValue modelValueObserveValue_14 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TeetDmpP(), bindFastfstPackage().getnTeetDmpP_Value())).observe(document);
		bindingContext.bindValue(observeTextTeetDmpPObserveWidget, modelValueObserveValue_14, null, null);
		//
		IObservableValue observeTextTeetDmpObserveWidget = WidgetProperties.text(SWT.Modify).observe(TeetDmp);
		IObservableValue modelValueObserveValue_15 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TeetDmp(), bindFastfstPackage().getnTeetDmp_Value())).observe(document);
		bindingContext.bindValue(observeTextTeetDmpObserveWidget, modelValueObserveValue_15, null, null);
		//
		IObservableValue observeTextTeetCDmpObserveWidget = WidgetProperties.text(SWT.Modify).observe(TeetCDmp);
		IObservableValue modelValueObserveValue_16 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TeetCDmp(), bindFastfstPackage().getnTeetCDmp_Value())).observe(document);
		bindingContext.bindValue(observeTextTeetCDmpObserveWidget, modelValueObserveValue_16, null, null);
		//
		IObservableValue observeTextTeetSStPObserveWidget = WidgetProperties.text(SWT.Modify).observe(TeetSStP);
		IObservableValue modelValueObserveValue_17 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TeetSStP(), bindFastfstPackage().getnTeetSStP_Value())).observe(document);
		bindingContext.bindValue(observeTextTeetSStPObserveWidget, modelValueObserveValue_17, null, null);
		//
		IObservableValue observeTextTeetHStPObserveWidget = WidgetProperties.text(SWT.Modify).observe(TeetHStP);
		IObservableValue modelValueObserveValue_18 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TeetHStP(), bindFastfstPackage().getnTeetHStP_Value())).observe(document);
		bindingContext.bindValue(observeTextTeetHStPObserveWidget, modelValueObserveValue_18, null, null);
		//
		IObservableValue observeTextTeetSSSpObserveWidget = WidgetProperties.text(SWT.Modify).observe(TeetSSSp);
		IObservableValue modelValueObserveValue_19 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TeetSSSp(), bindFastfstPackage().getnTeetSSSp_Value())).observe(document);
		bindingContext.bindValue(observeTextTeetSSSpObserveWidget, modelValueObserveValue_19, null, null);
		//
		IObservableValue observeTextTeetHSSPObserveWidget = WidgetProperties.text(SWT.Modify).observe(TeetHSSP);
		IObservableValue modelValueObserveValue_20 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TeetHSSp(), bindFastfstPackage().getnTeetHSSp_Value())).observe(document);
		bindingContext.bindValue(observeTextTeetHSSPObserveWidget, modelValueObserveValue_20, null, null);

		return bindingContext;
	}
	protected DataBindingContext initXDB_TipBrake (DataBindingContext bindingContext) {	
		//
		IObservableValue observeTextTBDrConNObserveWidget = WidgetProperties.text(SWT.Modify).observe(TBDrConN);
		IObservableValue modelValueObserveValue_21 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TBDrConN(), bindFastfstPackage().getnTBDrConN_Value())).observe(document);
		bindingContext.bindValue(observeTextTBDrConNObserveWidget, modelValueObserveValue_21, null, null);
		//
		IObservableValue observeTextTBDrConDObserveWidget = WidgetProperties.text(SWT.Modify).observe(TBDrConD);
		IObservableValue modelValueObserveValue_22 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TBDrConD(), bindFastfstPackage().getnTBDrConD_Value())).observe(document);
		bindingContext.bindValue(observeTextTBDrConDObserveWidget, modelValueObserveValue_22, null, null);
		//
		IObservableValue observeTextTpBrDTObserveWidget = WidgetProperties.text(SWT.Modify).observe(TpBrDT);
		IObservableValue modelValueObserveValue_23 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TpBrDT(), bindFastfstPackage().getnTpBrDT_Value())).observe(document);
		bindingContext.bindValue(observeTextTpBrDTObserveWidget, modelValueObserveValue_23, null, null);

		return bindingContext;
	}
	protected DataBindingContext initXDB_Blade (DataBindingContext bindingContext) {	
		//
		IObservableValue observeTextBldFile_1_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(BldFile_1_);
		IObservableValue modelValueObserveValue_24 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_BldFile_1_(), bindFastfstPackage().getfBldFile_1__Value())).observe(document);
		bindingContext.bindValue(observeTextBldFile_1_ObserveWidget, modelValueObserveValue_24, 
				new UpdateValueStrategy().setAfterConvertValidator(
						new FileValidator("File doesn't exist",cdBldFile_1_,uri)
						), 
						null);
		//
		IObservableValue observeTextBldFile_2_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(BldFile_2_);
		IObservableValue modelValueObserveValue_25 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_BldFile_2_(), bindFastfstPackage().getfBldFile_2__Value())).observe(document);
		bindingContext.bindValue(observeTextBldFile_2_ObserveWidget, modelValueObserveValue_25,
				new UpdateValueStrategy().setAfterConvertValidator(
						new FileValidator("File doesn't exist",cdBldFile_2_,uri)
						), 
						null);
		//
		IObservableValue observeTextBldFile_3_ObserveWidget = WidgetProperties.text(SWT.Modify).observe(BldFile_3_);
		IObservableValue modelValueObserveValue_26 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_BldFile_3_(), bindFastfstPackage().getfBldFile_3__Value())).observe(document);
		bindingContext.bindValue(observeTextBldFile_3_ObserveWidget, modelValueObserveValue_26,
				new UpdateValueStrategy().setAfterConvertValidator(
						new FileValidator("File doesn't exist",cdBldFile_3_,uri)
						), 
						null);

		return bindingContext;
	}
	protected DataBindingContext initXDB_FeatureFlags (DataBindingContext bindingContext) {

		IObservableValue a = WidgetProperties.selection().observe(FlapDOF1);
		IObservableValue av = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_FlapDOF1(), bindFastfstPackage().getbFlapDOF1_Value())).observe(document);
		bindingContext.bindValue(a, av, null, null);
		//
		IObservableValue b = WidgetProperties.selection().observe(FlapDOF2);
		IObservableValue bv = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_FlapDOF2(), bindFastfstPackage().getbFlapDOF2_Value())).observe(document);
		bindingContext.bindValue(b, bv, null, null);
		//
		IObservableValue c = WidgetProperties.selection().observe(EdgeDOF);
		IObservableValue cv = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_EdgeDOF(), bindFastfstPackage().getbEdgeDOF_Value())).observe(document);
		bindingContext.bindValue(c, cv, null, null);
		//

		IObservableValue observeSelectionTwFADOF1ObserveWidget = WidgetProperties.selection().observe(TwFADOF1);
		IObservableValue modelValueObserveValue_38 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TwFADOF1(), bindFastfstPackage().getbTwFADOF1_Value())).observe(document);
		bindingContext.bindValue(observeSelectionTwFADOF1ObserveWidget, modelValueObserveValue_38, null, null);
		//
		IObservableValue observeSelectionTwFADOF2ObserveWidget = WidgetProperties.selection().observe(TwFADOF2);
		IObservableValue modelValueObserveValue_39 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TwFADOF2(), bindFastfstPackage().getbTwFADOF2_Value())).observe(document);
		bindingContext.bindValue(observeSelectionTwFADOF2ObserveWidget, modelValueObserveValue_39, null, null);
		//
		IObservableValue observeSelectionTwSSDOF1ObserveWidget = WidgetProperties.selection().observe(TwSSDOF1);
		IObservableValue modelValueObserveValue_40 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TwSSDOF1(), bindFastfstPackage().getbTwSSDOF1_Value())).observe(document);
		bindingContext.bindValue(observeSelectionTwSSDOF1ObserveWidget, modelValueObserveValue_40, null, null);
		//
		IObservableValue observeSelectionTwSSDOF2ObserveWidget = WidgetProperties.selection().observe(TwSSDOF2);
		IObservableValue modelValueObserveValue_41 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TwSSDOF2(), bindFastfstPackage().getbTwSSDOF2_Value())).observe(document);
		bindingContext.bindValue(observeSelectionTwSSDOF2ObserveWidget, modelValueObserveValue_41, null, null);
		//
		IObservableValue observeSelectionDrTrDOFObserveWidget = WidgetProperties.selection().observe(DrTrDOF);
		IObservableValue modelValueObserveValue_42 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_DrTrDOF(), bindFastfstPackage().getbDrTrDOF_Value())).observe(document);
		bindingContext.bindValue(observeSelectionDrTrDOFObserveWidget, modelValueObserveValue_42, null, null);
		//
		IObservableValue observeSelectionGenDOFObserveWidget = WidgetProperties.selection().observe(GenDOF);
		IObservableValue modelValueObserveValue_43 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_GenDOF(), bindFastfstPackage().getbGenDOF_Value())).observe(document);
		bindingContext.bindValue(observeSelectionGenDOFObserveWidget, modelValueObserveValue_43, null, null);
		//
		IObservableValue observeSelectionYawDOFObserveWidget = WidgetProperties.selection().observe(YawDOF);
		IObservableValue modelValueObserveValue_44 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_YawDOF(), bindFastfstPackage().getbYawDOF_Value())).observe(document);
		bindingContext.bindValue(observeSelectionYawDOFObserveWidget, modelValueObserveValue_44, null, null);
		//
		IObservableValue observeSelectionTeetDOFObserveWidget = WidgetProperties.selection().observe(TeetDOF);
		IObservableValue modelValueObserveValue_45 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TeetDOF(), bindFastfstPackage().getbTeetDOF_Value())).observe(document);
		bindingContext.bindValue(observeSelectionTeetDOFObserveWidget, modelValueObserveValue_45, null, null);
		//
		IObservableValue observeSelectionCompAeroObserveWidget = WidgetProperties.selection().observe(CompAero);
		IObservableValue modelValueObserveValue_46 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_CompAero(), bindFastfstPackage().getbCompAero_Value())).observe(document);
		bindingContext.bindValue(observeSelectionCompAeroObserveWidget, modelValueObserveValue_46, null, null);
		//
		IObservableValue observeSelectionCompNoiseObserveWidget = WidgetProperties.selection().observe(CompNoise);
		IObservableValue modelValueObserveValue_47 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_CompNoise(), bindFastfstPackage().getbCompNoise_Value())).observe(document);
		bindingContext.bindValue(observeSelectionCompNoiseObserveWidget, modelValueObserveValue_47, null, null);

		return bindingContext;
	}
	protected DataBindingContext initXDB_InitialConditions (DataBindingContext bindingContext) {

		//
		IObservableValue observeTextOoPDeflObserveWidget = WidgetProperties.text(SWT.Modify).observe(OoPDefl);
		IObservableValue modelValueObserveValue_49 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_OoPDefl(), bindFastfstPackage().getnOoPDefl_Value())).observe(document);
		bindingContext.bindValue(observeTextOoPDeflObserveWidget, modelValueObserveValue_49, null, null);
		//
		IObservableValue observeTextIPDeflObserveWidget = WidgetProperties.text(SWT.Modify).observe(IPDefl);
		IObservableValue modelValueObserveValue_50 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_IPDefl(), bindFastfstPackage().getnIPDefl_Value())).observe(document);
		bindingContext.bindValue(observeTextIPDeflObserveWidget, modelValueObserveValue_50, null, null);
		//
		IObservableValue observeTextTeetDeflObserveWidget = WidgetProperties.text(SWT.Modify).observe(TeetDefl);
		IObservableValue modelValueObserveValue_51 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TeetDefl(), bindFastfstPackage().getnTeetDefl_Value())).observe(document);
		bindingContext.bindValue(observeTextTeetDeflObserveWidget, modelValueObserveValue_51, null, null);
		//
		IObservableValue observeTextAzimuthObserveWidget = WidgetProperties.text(SWT.Modify).observe(Azimuth);
		IObservableValue modelValueObserveValue_52 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_Azimuth(), bindFastfstPackage().getnAzimuth_Value())).observe(document);
		bindingContext.bindValue(observeTextAzimuthObserveWidget, modelValueObserveValue_52, null, null);
		//
		IObservableValue observeTextRotSpeedObserveWidget = WidgetProperties.text(SWT.Modify).observe(RotSpeed);
		IObservableValue modelValueObserveValue_53 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_RotSpeed(), bindFastfstPackage().getnRotSpeed_Value())).observe(document);
		bindingContext.bindValue(observeTextRotSpeedObserveWidget, modelValueObserveValue_53, null, null);
		//
		IObservableValue observeTextNacYawObserveWidget = WidgetProperties.text(SWT.Modify).observe(NacYaw);
		IObservableValue modelValueObserveValue_54 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NacYaw(), bindFastfstPackage().getnNacYaw_Value())).observe(document);
		bindingContext.bindValue(observeTextNacYawObserveWidget, modelValueObserveValue_54, null, null);
		//
		IObservableValue observeTextTTDspFAObserveWidget = WidgetProperties.text(SWT.Modify).observe(TTDspFA);
		IObservableValue modelValueObserveValue_55 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TTDspFA(), bindFastfstPackage().getnTTDspFA_Value())).observe(document);
		bindingContext.bindValue(observeTextTTDspFAObserveWidget, modelValueObserveValue_55, null, null);
		//
		IObservableValue observeTextTTDspSSObserveWidget = WidgetProperties.text(SWT.Modify).observe(TTDspSS);
		IObservableValue modelValueObserveValue_56 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TTDspSS(), bindFastfstPackage().getnTTDspSS_Value())).observe(document);
		bindingContext.bindValue(observeTextTTDspSSObserveWidget, modelValueObserveValue_56, null, null);

		return bindingContext;
	}
	protected DataBindingContext initXDB_Output (DataBindingContext bindingContext) {
		//
		IObservableValue observeSelectionSumPrintObserveWidget = WidgetProperties.selection().observe(SumPrint);
		IObservableValue modelValueObserveValue_57 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_SumPrint(), bindFastfstPackage().getbSumPrint_Value())).observe(document);
		bindingContext.bindValue(observeSelectionSumPrintObserveWidget, modelValueObserveValue_57, null, null);
		//
		IObservableValue observeSelectionTabDelimObserveWidget = WidgetProperties.selection().observe(TabDelim);
		IObservableValue modelValueObserveValue_58 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TabDelim(), bindFastfstPackage().getbTabDelim_Value())).observe(document);
		bindingContext.bindValue(observeSelectionTabDelimObserveWidget, modelValueObserveValue_58, null, null);
		//
		IObservableValue observeTextOutFmtObserveWidget = WidgetProperties.text(SWT.Modify).observe(OutFmt);
		IObservableValue modelValueObserveValue_59 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_OutFmt(), bindFastfstPackage().getsOutFmt_Value())).observe(document);
		bindingContext.bindValue(observeTextOutFmtObserveWidget, modelValueObserveValue_59, null, null);
		//
		IObservableValue observeTextTStartObserveWidget = WidgetProperties.text(SWT.Modify).observe(TStart);
		IObservableValue modelValueObserveValue_60 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TStart(), bindFastfstPackage().getnTStart_Value())).observe(document);
		bindingContext.bindValue(observeTextTStartObserveWidget, modelValueObserveValue_60, null, null);
		//
		IObservableValue observeTextDecFactObserveWidget = WidgetProperties.text(SWT.Modify).observe(DecFact);
		IObservableValue modelValueObserveValue_61 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_DecFact(), bindFastfstPackage().getiDecFact_Value())).observe(document);
		bindingContext.bindValue(observeTextDecFactObserveWidget, modelValueObserveValue_61, null, null);
		//
		IObservableValue observeTextSttsTimeObserveWidget = WidgetProperties.text(SWT.Modify).observe(SttsTime);
		IObservableValue modelValueObserveValue_62 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_SttsTime(), bindFastfstPackage().getnSttsTime_Value())).observe(document);
		bindingContext.bindValue(observeTextSttsTimeObserveWidget, modelValueObserveValue_62, null, null);
		//
		IObservableValue observeTextNcIMUxnObserveWidget = WidgetProperties.text(SWT.Modify).observe(NcIMUxn);
		IObservableValue modelValueObserveValue_63 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NcIMUxn(), bindFastfstPackage().getnNcIMUxn_Value())).observe(document);
		bindingContext.bindValue(observeTextNcIMUxnObserveWidget, modelValueObserveValue_63, null, null);
		//
		IObservableValue observeTextNcIMUynObserveWidget = WidgetProperties.text(SWT.Modify).observe(NcIMUyn);
		IObservableValue modelValueObserveValue_64 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NcIMUyn(), bindFastfstPackage().getnNcIMUyn_Value())).observe(document);
		bindingContext.bindValue(observeTextNcIMUynObserveWidget, modelValueObserveValue_64, null, null);
		//
		IObservableValue observeTextNcIMUznObserveWidget = WidgetProperties.text(SWT.Modify).observe(NcIMUzn);
		IObservableValue modelValueObserveValueZ = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NcIMUzn(), bindFastfstPackage().getnNcIMUzn_Value())).observe(document);
		bindingContext.bindValue(observeTextNcIMUznObserveWidget, modelValueObserveValueZ, null, null);
		//
		IObservableValue observeTextShftGagLObserveWidget = WidgetProperties.text(SWT.Modify).observe(ShftGagL);
		IObservableValue modelValueObserveValue_1Z = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_ShftGagL(), bindFastfstPackage().getnShftGagL_Value())).observe(document);
		bindingContext.bindValue(observeTextShftGagLObserveWidget, modelValueObserveValue_1Z, null, null);
		//
		IObservableValue observeTextNTwGagesObserveWidget = WidgetProperties.text(SWT.Modify).observe(NTwGages);
		IObservableValue modelValueObserveValue_2Z = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NTwGages(), bindFastfstPackage().getiNTwGages_Value())).observe(document);
		bindingContext.bindValue(observeTextNTwGagesObserveWidget, modelValueObserveValue_2Z, null, null);
		//
		IObservableValue a = WidgetProperties.text(SWT.Modify).observe(TwrGagNd);
		IObservableValue b = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TwrGagNd(), bindFastfstPackage().getaTwrGagNd_Value())).observe(document);
		bindingContext.bindValue(a, b, null, null);
		//
		IObservableValue c = WidgetProperties.text(SWT.Modify).observe(NBlGages);
		IObservableValue d = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NBlGages(), bindFastfstPackage().getiNBlGages_Value())).observe(document);
		bindingContext.bindValue(c, d, null, null);
		//
		IObservableValue e = WidgetProperties.text(SWT.Modify).observe(BldGagNd);
		IObservableValue f = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_BldGagNd(), bindFastfstPackage().getaBldGagNd_Value())).observe(document);
		bindingContext.bindValue(e, f, null, null);
		
		return bindingContext;
	}
	protected DataBindingContext initXDB_GeneratorSI(DataBindingContext bindingContext) {

		IObservableValue observeTextSIG_SlPcObserveWidget = WidgetProperties.text(SWT.Modify).observe(SIG_SlPc);
		IObservableValue modelValueObserveValue = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_SIG_SlPc(), bindFastfstPackage().getnSIG_SlPc_Value())).observe(document);
		bindingContext.bindValue(observeTextSIG_SlPcObserveWidget, modelValueObserveValue, null, null);
		//
		IObservableValue observeTextSIG_SySpObserveWidget = WidgetProperties.text(SWT.Modify).observe(SIG_SySp);
		IObservableValue modelValueObserveValue_1 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_SIG_SySp(), bindFastfstPackage().getnSIG_SySp_Value())).observe(document);
		bindingContext.bindValue(observeTextSIG_SySpObserveWidget, modelValueObserveValue_1, null, null);
		//
		IObservableValue observeTextSIG_RtTqObserveWidget = WidgetProperties.text(SWT.Modify).observe(SIG_RtTq);
		IObservableValue modelValueObserveValue_3 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_SIG_RtTq(), bindFastfstPackage().getnSIG_RtTq_Value())).observe(document);
		bindingContext.bindValue(observeTextSIG_RtTqObserveWidget, modelValueObserveValue_3, null, null);
		//
		IObservableValue observeTextSIG_PORtObserveWidget = WidgetProperties.text(SWT.Modify).observe(SIG_PORt);
		IObservableValue modelValueObserveValue_4 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_SIG_PORt(), bindFastfstPackage().getnSIG_PORt_Value())).observe(document);
		bindingContext.bindValue(observeTextSIG_PORtObserveWidget, modelValueObserveValue_4, null, null);
		
		return bindingContext;
	}
	protected DataBindingContext initXDB_GeneratorTEC (DataBindingContext bindingContext) {

		//
		IObservableValue observeTextTEC_FreqObserveWidget = WidgetProperties.text(SWT.Modify).observe(TEC_Freq);
		IObservableValue modelValueObserveValue_2 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TEC_Freq(), bindFastfstPackage().getnTEC_Freq_Value())).observe(document);
		bindingContext.bindValue(observeTextTEC_FreqObserveWidget, modelValueObserveValue_2, null, null);
		//
		IObservableValue observeTextTEC_NpolObserveWidget = WidgetProperties.text(SWT.Modify).observe(TEC_Npol);
		IObservableValue modelValueObserveValue_5 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TEC_Npol(), bindFastfstPackage().getnTEC_Npol_Value())).observe(document);
		bindingContext.bindValue(observeTextTEC_NpolObserveWidget, modelValueObserveValue_5, null, null);
		//
		IObservableValue observeTextTEC_SresObserveWidget = WidgetProperties.text(SWT.Modify).observe(TEC_Sres);
		IObservableValue modelValueObserveValue_6 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TEC_Sres(), bindFastfstPackage().getnTEC_Sres_Value())).observe(document);
		bindingContext.bindValue(observeTextTEC_SresObserveWidget, modelValueObserveValue_6, null, null);
		//
		IObservableValue observeTextTEC_RresObserveWidget = WidgetProperties.text(SWT.Modify).observe(TEC_Rres);
		IObservableValue modelValueObserveValue_7 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TEC_Rres(), bindFastfstPackage().getnTEC_Rres_Value())).observe(document);
		bindingContext.bindValue(observeTextTEC_RresObserveWidget, modelValueObserveValue_7, null, null);
		//
		IObservableValue observeTextTEC_VLLObserveWidget = WidgetProperties.text(SWT.Modify).observe(TEC_VLL);
		IObservableValue modelValueObserveValue_8 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TEC_VLL(), bindFastfstPackage().getnTEC_VLL_Value())).observe(document);
		bindingContext.bindValue(observeTextTEC_VLLObserveWidget, modelValueObserveValue_8, null, null);
		//
		IObservableValue observeTextTEC_SLRObserveWidget = WidgetProperties.text(SWT.Modify).observe(TEC_SLR);
		IObservableValue modelValueObserveValue_9 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TEC_SLR(), bindFastfstPackage().getnTEC_SLR_Value())).observe(document);
		bindingContext.bindValue(observeTextTEC_SLRObserveWidget, modelValueObserveValue_9, null, null);
		//
		IObservableValue observeTextTEC_RLRObserveWidget = WidgetProperties.text(SWT.Modify).observe(TEC_RLR);
		IObservableValue modelValueObserveValue_10 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TEC_RLR(), bindFastfstPackage().getnTEC_RLR_Value())).observe(document);
		bindingContext.bindValue(observeTextTEC_RLRObserveWidget, modelValueObserveValue_10, null, null);
		//
		IObservableValue observeTextText_11ObserveWidget = WidgetProperties.text(SWT.Modify).observe(TEC_MR);
		IObservableValue modelValueObserveValue_11 = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_TEC_MR(), bindFastfstPackage().getnTEC_MR_Value())).observe(document);
		bindingContext.bindValue(observeTextText_11ObserveWidget, modelValueObserveValue_11, null, null);

		return bindingContext;
	}
	protected DataBindingContext initXDB_Noise(DataBindingContext bindingContext) {

		//
		IObservableValue observeTextADFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(NoiseFile);
		IObservableValue modelValueObserveValue = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_NoiseFile(), bindFastfstPackage().getfNoiseFile_Value())).observe(document);
		bindingContext.bindValue(observeTextADFileObserveWidget, modelValueObserveValue,
				new UpdateValueStrategy().setAfterConvertValidator(
						new FileValidator("File doesn't exist",cdNoiseFile,uri)
						), 
						null);

		return bindingContext;

	}
	protected DataBindingContext initXDB_ADAMS(DataBindingContext bindingContext) {

		//
		IObservableValue observeTextADFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(ADAMSFile);
		IObservableValue modelValueObserveValue = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_ADAMSFile(), bindFastfstPackage().getfADAMSFile_Value())).observe(document);
		bindingContext.bindValue(observeTextADFileObserveWidget, modelValueObserveValue,
				new UpdateValueStrategy().setAfterConvertValidator(
						new FileValidator("File doesn't exist",cdADAMSFile,uri)
						), 
						null);

		return bindingContext;

	}
	protected DataBindingContext initXDB_Linearization(DataBindingContext bindingContext) {

		//
		IObservableValue observeTextADFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(LinFile);
		IObservableValue modelValueObserveValue = XtextProperties.value(FeaturePath.fromList(bindFastfstPackage().getModelFastfst_LinFile(), bindFastfstPackage().getfLinFile_Value())).observe(document);
		bindingContext.bindValue(observeTextADFileObserveWidget, modelValueObserveValue,
				new UpdateValueStrategy().setAfterConvertValidator(
						new FileValidator("File doesn't exist",cdLinFile,uri)
						), 
						null);

		return bindingContext;

	}
	
	public IContentOutlinePage getContentOutline() {
		// TODO Auto-generated method stub
		return null;
	}


	// TODO
	private void addStatusSupport(ObservablesManager mgr, final DataBindingContext ctx) {
		AggregateValidationStatus aggregateStatus =
				new AggregateValidationStatus(
						ctx.getValidationStatusProviders(),
						AggregateValidationStatus.MAX_SEVERITY
						);

		aggregateStatus.addValueChangeListener(
				new IValueChangeListener() {
					public void handleValueChange(ValueChangeEvent event) {
						handleStateChange(
								(IStatus)event.diff.getNewValue(), ctx
								);
					}
				});
		mgr.addObservable(aggregateStatus);
	}

	private void handleStateChange(IStatus currentStatus, DataBindingContext ctx) {

		if (currentStatus != null && currentStatus.getSeverity() != IStatus.OK) {
			// TODO int type = convertType(currentStatus.getSeverity());

			ArrayList<IMessage> list = new ArrayList<IMessage>();
			Iterator< ? > it = ctx.getValidationStatusProviders().iterator();

			while (it.hasNext()) {
				ValidationStatusProvider validationStatusProvider = (ValidationStatusProvider)it.next();
				final IStatus status = (IStatus)validationStatusProvider.getValidationStatus().getValue();

				if (!status.isOK()){
					list.add(new IMessage()	{
						public Control getControl() {
							return null;
						}

						public Object getData()	{
							return null;
						}

						public Object getKey() {
							return null;
						}

						public String getPrefix() {
							return null;
						}

						public String getMessage() {
							return status.getMessage();
						}

						public int getMessageType() {
							return 0; //convertType(status.getSeverity());
						}
					});
				}
			}
			//form.setMessage("Data invalid", type, list.toArray(new IMessage [0]));
			form.setMessage("This is an error message", IMessageProvider.ERROR);	// NEW LINE
		} else {
			form.setMessage(null,0);
		}
	}

	// see
	// http://www.toedter.com/blog/?p=36
	class FileValidator implements IValidator {
		
		int err;
		
	    private final String errorText;
	    private final ControlDecoration controlDecoration;
	    private final URI resURI;
	    
	    public FileValidator(String errorText, ControlDecoration controlDecoration,URI resURI) {
	        super();
	        this.errorText = errorText;
	        this.controlDecoration = controlDecoration;
	        this.resURI = resURI;
	    }
	 
	    public IStatus validate(Object value) {
	        if (value instanceof String) {
	            String text = (String) value;
	            URI uri = URI.createFileURI(text).resolve(resURI);
	            err = checkURI(uri);
	    		switch (err) {
	    			case 1:
	    			case 2:
	    				controlDecoration.show();
	    				controlDecoration.setDescriptionText(errorText);
		                return ValidationStatus.error(errorText);	                
	            }
	        }
	        controlDecoration.hide();
	        return Status.OK_STATUS;
	    }
	    
		
		
		private int checkURI(URI uri) {

			// see
			// http://www.eclipsezone.com/eclipse/forums/t59128.html
			// http://lmap.blogspot.it/2008/03/platform-scheme-uri.html

			IWorkspaceRoot wsr = ResourcesPlugin.getWorkspace().getRoot();

			String scheme = uri.scheme();
			if ("platform".equals(scheme) && uri.segmentCount() > 1
					&& "resource".equals(uri.segment(0))) {
				StringBuffer platformResourcePath = new StringBuffer();
				for (int j = 1, size = uri.segmentCount(); j < size; ++j) {
					platformResourcePath.append('/');
					platformResourcePath.append(uri.segment(j));
				}

				Path pth = new Path(platformResourcePath.toString());
				if (pth.segmentCount() < 2)
					return 1;

				IFile file = wsr.getFile(pth);
				if (file.exists() == false)
					return 2;
			}
			return 0; // no error
		}
		
	}
	
}







///// DRAGONS HAED !!!!!!!! TEEEESSTTTTTT

//Add some decorations to the control
//ControlDecorationSupport.create(bindValue1, SWT.TOP | SWT.LEFT);



/*
		IObservableList itemsTwrGagNdObserveWidget = WidgetProperties.items().observe(TwrGagNd);
		IObservableList valueModelgetTwrGagNdObserveList = PojoProperties.list("value").observe(model.getTwrGagNd());
		m_bindingContext.bindList(itemsTwrGagNdObserveWidget, valueModelgetTwrGagNdObserveList, null, null);
 */

//// TOWER GAUGE

//input = new WritableList(model.getTwrGagNd().getValue(), Person.class);

/*
		IObservableList input = EMFProperties.list(FastfstPackage.Literals.MODEL_FASTFST__TWR_GAG_ND).observe(model);
		IValueProperty labelProperty = EMFProperties.value(FastfstPackage.Literals.VAR_NUM__VALUE);
		// Instead of the following, we'll use an ViewerSupport below...				
		//tableViewer.setContentProvider(new ObservableListContentProvider());
		//tableViewer.setLabelProvider(labelProvider);
		//tableViewer.setInput(input);
		ViewerSupport.bind(tableViewer, input, labelProperty);

		// Use ObservableListContentProvider
		//tableViewer.setContentProvider(new ObservableListContentProvider());

 */

///////// TEST AREA //////////////////////7

/*// TODO http://swik.net/Eclipse/Planet+Eclipse/Tom+Schindl:+Disable+parts+SWT-Table%2FTree+with+SWT.CHECK/cg522
		Databinding ctx = 

				IObservableSet mObs = ....

				Tree tree = new Tree(parent,SWT.BORDER|SWT.V_SCROLL|SWT.H_SCROLL);
				CheckBoxTreeViewer v = new CheckBoxTreeViewer(tree);
				IObservableSet uiOs = ViewerObservables.observeCheckedElements(v,OutCh.class);
				ctx.bindSet(uiObs,mObs,null,null);
 */

//Button[] ba = { ADAMSPrep_0_FAST, ADAMSPrep_1_ADAMS, ADAMSPrep_2_BOTH};
//RadioButtonGroupObservableValue rdb = new RadioButtonGroupObservableValue(ba, 0);
//RadioGroup rdb = new RadioGroup(ba, new String[] { "1", "2", "3" });

//ExtWidgetProperties xwp = new ExtWidgetProperties();

/*IObservableValue obs_A = new RadioGroupObservableValue(rdb);
		IObservableValue obs_B = XtextProperties.value(FeaturePath.fromList(Literals.MODEL_FASTFST__ADAMS_PREP, Literals.VAR_NUM__VALUE)).observe(document);
		m_bindingContext.bindValue(obs_A, obs_B, null, null);
		//*/

/*static class RadioGroupObservableValue extends AbstractObservableValue {
		private RadioGroup group;
		private Object selection = null;

		public RadioGroupObservableValue(RadioGroup group) {
			this.group = group;
			group.addSelectionListener(selectionListener);
		}

		public synchronized void dispose() {
			group.removeSelectionListener(selectionListener);
		}

		protected void doSetValue(Object value) {
			group.setSelection(value);
			selection = value;
		}

		protected Object doGetValue() {
			return group.getSelection();
		}

		public Object getValueType() {
			return Object.class;
		}

		SelectionListener selectionListener = new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}

			public void widgetSelected(SelectionEvent e) {
				final Object newSelection = group.getSelection();
				fireValueChange(new ValueDiff() {
					public Object getNewValue() {
						return newSelection;
					}

					public Object getOldValue() {
						return selection;
					}
				});
				selection = newSelection;
			}

		};
	}
 */
