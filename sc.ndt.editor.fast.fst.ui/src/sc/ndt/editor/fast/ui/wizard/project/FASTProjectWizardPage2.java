package sc.ndt.editor.fast.ui.wizard.project;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class FASTProjectWizardPage2 extends WizardPage {

	private Text NumBl;
	private Text TowerHt;
	private Text RotDiam;
	private Text WindIn;
	private Text WindRated;
	private Text WindOut;
	private Combo IECClass;
	private Combo WindTurb;

	/**
	 * Create the wizard.
	 */
	public FASTProjectWizardPage2(IStructuredSelection selection) {
        super("NewConfigFileWizardPage");
        setTitle("FAST Simulation Details");
        setDescription("Setup FAST simulation");
    }

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		RowLayout rl_container = new RowLayout(SWT.VERTICAL);
		rl_container.fill = true;
		container.setLayout(rl_container);
		
		Group grpSiting = new Group(container, SWT.NONE);
		grpSiting.setText("Siting");
		grpSiting.setLayout(new GridLayout(1, false));
		
		Composite composite_2 = new Composite(grpSiting, SWT.NONE);
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite_2.setSize(289, 24);
		RowLayout rl_composite_2 = new RowLayout(SWT.HORIZONTAL);
		rl_composite_2.justify = true;
		rl_composite_2.fill = true;
		composite_2.setLayout(rl_composite_2);
		
		Button btnRadioButton_1 = new Button(composite_2, SWT.RADIO);
		btnRadioButton_1.setSelection(true);
		btnRadioButton_1.setText("none");
		
		Button btnOnshore = new Button(composite_2, SWT.RADIO);
		btnOnshore.setText("onshore");
		
		Button btnOffshore = new Button(composite_2, SWT.RADIO);
		btnOffshore.setText("offshore");
		
		Group grpTurbineConfiguration = new Group(container, SWT.NONE);
		grpTurbineConfiguration.setText("Wind Turbine");
		grpTurbineConfiguration.setLayout(new GridLayout(2, false));
		
		Label lblBladesNr = new Label(grpTurbineConfiguration, SWT.NONE);
		lblBladesNr.setText("Number of Blades");
		
		NumBl = new Text(grpTurbineConfiguration, SWT.BORDER | SWT.CENTER);
		GridData gd_NumBl = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_NumBl.widthHint = 50;
		NumBl.setLayoutData(gd_NumBl);
		NumBl.setText("3");
		
		Label lblHeight = new Label(grpTurbineConfiguration, SWT.NONE);
		lblHeight.setText("Tower Height");
		
		TowerHt = new Text(grpTurbineConfiguration, SWT.BORDER);
		GridData gd_TowerHt = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_TowerHt.widthHint = 50;
		TowerHt.setLayoutData(gd_TowerHt);
		TowerHt.setText("10");
		
		Label lblNewLabel = new Label(grpTurbineConfiguration, SWT.NONE);
		lblNewLabel.setText("Rotor diameter");
		
		RotDiam = new Text(grpTurbineConfiguration, SWT.BORDER);
		GridData gd_RotDiam = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_RotDiam.widthHint = 50;
		RotDiam.setLayoutData(gd_RotDiam);
		RotDiam.setText("10");
		
		Label lblTransmission = new Label(grpTurbineConfiguration, SWT.NONE);
		lblTransmission.setText("Drive");
		
		Composite composite = new Composite(grpTurbineConfiguration, SWT.NONE);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Button btnRadioButton = new Button(composite, SWT.RADIO);
		btnRadioButton.setSelection(true);
		btnRadioButton.setText("direct");
		
		Button btnGearBox = new Button(composite, SWT.RADIO);
		btnGearBox.setText("gearbox");
		
		Group grpWind = new Group(container, SWT.NONE);
		grpWind.setText("Wind");
		grpWind.setLayout(new GridLayout(3, false));
		
		Label lblIecClass = new Label(grpWind, SWT.NONE);
		lblIecClass.setText("IEC Wind Turbine Class");
		new Label(grpWind, SWT.NONE);
		
		IECClass = new Combo(grpWind, SWT.NONE);
		GridData gd_IECClass = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_IECClass.widthHint = 50;
		IECClass.setLayoutData(gd_IECClass);
		IECClass.setItems(new String[] {"1", "2", "3"});
		IECClass.select(0);
		
		Label lblWindTurbulenceCategory = new Label(grpWind, SWT.NONE);
		lblWindTurbulenceCategory.setText("Wind Turbulence Category");
		new Label(grpWind, SWT.NONE);
		
		WindTurb = new Combo(grpWind, SWT.NONE);
		GridData gd_WindTurb = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_WindTurb.widthHint = 50;
		WindTurb.setLayoutData(gd_WindTurb);
		WindTurb.setItems(new String[] {"A", "B", "C"});
		WindTurb.select(0);
		
		Label lblWindRange = new Label(grpWind, SWT.NONE);
		lblWindRange.setText("Wind Range");
		
		Label lblCutin = new Label(grpWind, SWT.NONE);
		lblCutin.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCutin.setText("Cut-in");
		
		WindIn = new Text(grpWind, SWT.BORDER);
		WindIn.setText("2");
		WindIn.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		new Label(grpWind, SWT.NONE);
		
		Label lblRated = new Label(grpWind, SWT.NONE);
		lblRated.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRated.setText("Rated");
		
		WindRated = new Text(grpWind, SWT.BORDER);
		WindRated.setText("10");
		WindRated.setToolTipText("");
		WindRated.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		new Label(grpWind, SWT.NONE);
		
		Label lblCutout = new Label(grpWind, SWT.NONE);
		lblCutout.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCutout.setText("Cut-out");
		
		WindOut = new Text(grpWind, SWT.BORDER);
		WindOut.setText("20");
		WindOut.setToolTipText("");
		WindOut.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Composite composite_3 = new Composite(grpWind, SWT.NONE);
		composite_3.setLayout(new RowLayout(SWT.HORIZONTAL));
		composite_3.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		
		Button btnCheckButton_1 = new Button(composite_3, SWT.CHECK);
		btnCheckButton_1.setText("ECD");
		
		Button btnCheckButton_2 = new Button(composite_3, SWT.CHECK);
		btnCheckButton_2.setText("EWS(V/H)");
		
		Button btnCheckButton_3 = new Button(composite_3, SWT.CHECK);
		btnCheckButton_3.setSelection(true);
		btnCheckButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnCheckButton_3.setText("EOG");
		
		Button btnCheckButton_4 = new Button(composite_3, SWT.CHECK);
		btnCheckButton_4.setText("EDC");
		
		Button btnCheckButton_5 = new Button(composite_3, SWT.CHECK);
		btnCheckButton_5.setSelection(true);
		btnCheckButton_5.setText("NWP");
		
		Label label = new Label(grpWind, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
		
		Composite composite_4 = new Composite(grpWind, SWT.NONE);
		composite_4.setLayout(new RowLayout(SWT.HORIZONTAL));
		composite_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
		
		Button btnNtm = new Button(composite_4, SWT.CHECK);
		btnNtm.setText("NTM");
		
		Button btnEtm = new Button(composite_4, SWT.CHECK);
		btnEtm.setText("ETM1");
		
		Button btnEtm_1 = new Button(composite_4, SWT.CHECK);
		btnEtm_1.setText("ETM50");
		new Label(grpWind, SWT.NONE);
		new Label(grpWind, SWT.NONE);
		new Label(grpWind, SWT.NONE);
		
		Composite composite_1 = new Composite(container, SWT.NONE);
		composite_1.setLayout(new GridLayout(1, false));
		
		Button btnCheckButton = new Button(composite_1, SWT.CHECK);
		btnCheckButton.setSelection(true);
		btnCheckButton.setText("Generate wind");
	}
	
	public Text getNumBl() {
		return NumBl;
	}

	public void setNumBl(Text numBl) {
		NumBl = numBl;
	}

	public Text getTowerHt() {
		return TowerHt;
	}

	public void setTowerHt(Text towerHt) {
		TowerHt = towerHt;
	}

	public Text getRotDiam() {
		return RotDiam;
	}

	public void setRotDiam(Text tipRad) {
		RotDiam = tipRad;
	}
	
	public String getIECClass() {
		return IECClass.getText();
	}

	public String getWindTurb() {
		return WindTurb.getText();
	}
	
	public String getWindIn() {
		return WindIn.getText();
	}
	public String getWindRated() {
		return WindRated.getText();
	}
	public String getWindOut() {
		return WindOut.getText();
	}
	
}
