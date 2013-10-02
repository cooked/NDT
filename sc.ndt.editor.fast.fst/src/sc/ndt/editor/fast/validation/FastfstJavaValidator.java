/*******************************************************************************
 * Copyright (C) 2013 Stefano Cottafavi - All Rights Reserved
 ******************************************************************************/
package sc.ndt.editor.fast.validation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import sc.ndt.editor.fast.fastfst.*;

public class FastfstJavaValidator extends AbstractFastfstJavaValidator {

	// used here and by quickfix
	public static final String INVALID_NAME = "sc.ndt.editor.fast.fst.validator.InvalidTypeName";

	FastfstPackage fp = FastfstPackage.eINSTANCE;
	private float val;
	private EAttribute ea;
	
	private boolean isInt(Float val) {
		if (val - val.intValue() == 0)
			return true;
		return false;
	}

	private boolean isPositive(Float val) {
		if (val >= 0)
			return true;
		return false;
	}

	private boolean isRange(int val, int min, int max) {
		if (val >= min && val <= max)
			return true;
		return false;
	}
	
	private boolean isRangeGT(float val, float min, float max) {
		if (val > min && val <= max)
			return true;
		return false;
	}
	
	private boolean isLinearization() {
		return m.getAnalMode().getValue()==2;
	}
	
	private boolean isADAMSPrep() {
		return m.getADAMSPrep().getValue()>1;
	}
	
	// checker
	private void checkNotUsed(String controller, EAttribute atr, String opt) {
		info("Not used when " + controller + " " + opt, atr);
	}

	private void checkInt(Float val, EAttribute atr) {
		if (!isInt(val))
			error("Value must be an integer.", atr);
	}
	
	private void checkPos(Float val, EAttribute atr) {
		if (!isPositive(val))
			error("Value cannot be less than 0.", atr);
	}

	private void check02(Float val, EAttribute atr) {
		int min = 0, max = 2;
		if (!isRange(val.intValue(), min, max))
			error("Value must be greater/equal than " + min
					+ " and less/equal than " + max + ".", atr);
	}

	private void check03(Float val, EAttribute atr) {
		int min = 0, max = 3;
		if (!isRange(val.intValue(), min, max))
			error("Value must be greater/equal than " + min
					+ " and less/equal than " + max + ".", atr);
	}

	private void check0100(Float val, EAttribute atr) {
		int min = 0, max = 100;
		if (!isRangeGT(val.floatValue(), min, max))
			error("Value must be greater than " + min
					+ " and less/equal than " + max + ".", atr);
	}

	private void check12(Float val, EAttribute atr) {
		int min = 1, max = 2;
		if (!isRange(val.intValue(), min, max))
			error("Value must be greater/equal than " + min
					+ " and less/equal than " + max + ".", atr);
	}

	private void check13(Number val, EAttribute atr) {
		int min = 1, max = 3;
		if (!isRange(val.intValue(), min, max))
			error("Value must be greater/equal than " + min
					+ " and less/equal than " + max + ".", atr);
	}

	private void check23(Number val, EAttribute atr) {
		int min = 2, max = 3;
		if (!isRange(val.intValue(), min, max))
			error("Value must be greater/equal than " + min
					+ " and less/equal than " + max + ".", atr);
	}

	private void check9090(Float val, EAttribute atr) {
		int min = -90, max = 90;
		if (!isRange(val.intValue(), min, max))
			error("Value must be greater/equal than " + min
					+ " and less/equal than " + max + ".", atr);
	}

	private void check0180(Float val, EAttribute atr) {
		int min = 0, max = 180;
		if (!isRange(val.intValue(), min, max))
			error("Value must be greater/equal than " + min
					+ " and less/equal than " + max + ".", atr);
	}

	private void check180180(Float val, EAttribute atr) {
		int min = -180, max = 180;
		if (!isRange(val.intValue(), min, max))
			error("Value must be greater/equal than " + min
					+ " and less/equal than " + max + ".", atr);
	}

	private void check0360(Float val, EAttribute atr) {
		int min = 0, max = 360;
		if (!isRange(val.intValue(), min, max))
			error("Value must be greater/equal than " + min
					+ " and less/equal than " + max + ".", atr);
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

	
	@Inject
	IContainer.Manager containerManager;

	@Inject
	ResourceDescriptionsProvider resourceDescriptionsProvider;

	private boolean bValue;

	ModelFastfst m;

	private URI fstURI;
	private URI uri;
	
	private int err;
	
	
	private void refreshModel(EObject var) {
		m = (ModelFastfst)var.eContainer();
	}
	
	
	// global model validation
	@Check
	public void checkModelFastfst(ModelFastfst var) {

		if(m==null || EcoreUtil.getURI(m).equals(EcoreUtil.getURI(var))) 
			m = var;
		
		fstURI = var.eResource().getURI();
		
		
		// / TODO TEST: NB here it comes dependant on ADN models!!!!!!!
		/*
		 * IResourceDescriptions index = resourceDescriptionsProvider
		 * .getResourceDescriptions(var.eResource()); IResourceDescription
		 * resourceDescription = index
		 * .getResourceDescription(var.eResource().getURI()); for (IContainer
		 * visibleContainer : containerManager
		 * .getVisibleContainers(resourceDescription, index)) { /*TODO for
		 * (IEObjectDescription od : visibleContainer.getExportedObjectsByType(
		 * FastadnPackage.eINSTANCE.getModelFastadn())) {
		 * 
		 * //@SuppressWarnings("unused") //ModelFastadn fastmodel =
		 * (ModelFastadn) var.eResource().getResourceSet().getEObject( //
		 * od.getEObjectURI(), true);
		 * 
		 * } }
		 */			
		
	}

	@Check
	public void checkCompAero(bCompAero var) {
		bValue = var.isValue();
		ea = fp.getbCompAero_Value();
		if (bValue == false && m.getCompNoise().isValue())
			warning("CompAero must be enabled when CompNoise is enabled",ea);

	}
	@Check
	public void checkCompNoise(bCompNoise var) {
		bValue = var.isValue();
		ea = fp.getbCompNoise_Value();
		if (isLinearization() && bValue)
			warning("CompNoise must be disabled during linearization",ea);
	}
	
	
	// // SIMULATION CONTROL
	@Check
	public void checkEcho(bEcho var) {

	}

	@Check
	public void checkADAMSPrep(iADAMSPrep var) {
		int val = var.getValue();
		check13(val, fp.getiADAMSPrep_Value());
	}

	@Check
	public void checkAnalMode(iAnalMode var) {
		val = var.getValue();
		checkInt(val, fp.getiAnalMode_Value());
		check12(val, fp.getiAnalMode_Value());
		
		/*if (val>1 && m.getYCMode().getValue() != 0)
			warning("YCMode must be 0 during linearization.", 
					fp.getiYCMode_Value());
		*/
	}

	@Check
	public void checkNumBl(iNumBl var) {
		val = var.getValue();
		checkInt(val, fp.getiNumBl_Value());
		check23(val, fp.getiNumBl_Value());
	}

	@Check
	public void checkTMax(nTMax var) {
		Float val = var.getValue();
		checkPos(val, fp.getnTMax_Value());
		checkInt(val, fp.getnTMax_Value());
	}

	@Check
	public void checkDT(nDT var) {
		Float val = var.getValue();
		checkPos(val, fp.getnDT_Value());
	}

	///////////////

	@Check
	public void checkYCMode(iYCMode var) {
		val = var.getValue();
		ea = fp.getiYCMode_Value();
		checkInt(val, ea);
		check02(val, ea);

		if(isLinearization() && val!=0)
			warning("YCMode must be 0 during linearization.", ea);
	}
			
	@Check
	public void checkTYCOn(nTYCOn var) {
		val = var.getValue();
		ea = fp.getnTYCOn_Value();
		
		switch ((int)m.getYCMode().getValue()) {
		case 0:
			checkNotUsed(m.getYCMode().getName(), ea, "is 0");
			break;
		case 2:
			checkPos(val, ea);
		}
	}

	@Check
	public void checkPCMode(iPCMode var) {
		val = var.getValue();
		ea = fp.getiPCMode_Value();

		checkInt(val, ea);
		check02(val, ea);
		
		if (isLinearization() && val != 0)
			warning("PCMode must be 0 during linearization.", ea);
		
	}

	@Check
	public void checkTPCOn(nTPCOn var) {
		val = var.getValue();
		ea = fp.getnTPCOn_Value();
		
		switch ((int)m.getPCMode().getValue()) {
			case 0:
				checkNotUsed(m.getPCMode().getName(), ea, "is 0");
				break;
			case 2:
				checkPos(val, ea);
		}
		
	}

	@Check
	public void checkVSContrl(iVSContrl var) {
		
		val = var.getValue();
		EAttribute ea = fp.getiVSContrl_Value();

		check03(val, ea);
		
	}
			
	@Check
	public void checkVS_RtGnSp(nVS_RtGnSp var) {
		
		refreshModel(var);
		
		val = var.getValue();
		ea = fp.getnVS_RtGnSp_Value();
		
		if(m.getVSContrl().getValue()==1)
			checkPos(val, ea);
		else
			checkNotUsed(m.getVSContrl().getName(), ea, " is not 1.");
	}

	@Check
	public void checkVS_RtTq(nVS_RtTq var) {
		
		refreshModel(var);
		
		val = var.getValue();
		ea = fp.getnVS_RtTq_Value();

		if(m.getVSContrl().getValue()==1) {
			
			checkPos(val, ea);
			if (val < m.getVS_Rgn2K().getValue()*Math.pow(m.getVS_RtGnSp().getValue(),2) )
				error("VS_RtTq must be greater than VS_Rgn2K*VS_RtGnSp^2.", ea);
			
		} else
			checkNotUsed(m.getVSContrl().getName(), ea, " is not 1.");
	}

	@Check
	public void checkVS_Rgn2K(nVS_Rgn2K var) {
		
		refreshModel(var);
		
		val = var.getValue();
		ea = fp.getnVS_Rgn2K_Value();

		if(m.getVSContrl().getValue()==1)
			checkPos(val, ea);
		else
			checkNotUsed(m.getVSContrl().getName(), ea, " is not 1.");
	}

	@Check
	public void checkVS_SlPc(nVS_SlPc var) {
		
		refreshModel(var);
		
		val = var.getValue();
		ea = fp.getnVS_SlPc_Value();

		if(m.getVSContrl().getValue()==1)
			check0100(val, ea);
		else
			checkNotUsed(m.getVSContrl().getName(), ea, " is not 1.");
		
	}

	@Check
	public void checkGenModel(iGenModel var) {
		
		refreshModel(var);
		
		val = var.getValue();
		ea = fp.getiGenModel_Value();

		if(m.getVSContrl().getValue()==0)
			check13(val, ea);
		else
			checkNotUsed(m.getVSContrl().getName(), ea, " is 0");
		
	}

	@Check
	public void checkGenTiStr(bGenTiStr var) {
	
		bValue = var.isValue();
		ea = fp.getbGenTiStr_Value();
		
		if(isLinearization() && bValue==false)
			warning("GenTiStr must be True during linearization.", ea);
		
	
	}
	@Check
	public void checkGenTiStp(bGenTiStp var) {
		bValue = var.isValue();
		ea = fp.getbGenTiStp_Value();
		
		if(isLinearization() && bValue==false)
			warning("GenTiStp must be True during linearization.", ea);
		
	}

	@Check
	public void checkSpdGenOn(nSpdGenOn var) {
		val = var.getValue();
		ea = fp.getnSpdGenOn_Value();

		if(m.getGenTiStr().isValue()==false)
			checkPos(val, ea);
		else
			checkNotUsed(m.getGenTiStr().getName(), ea, " is \"false\"");
	}

	@Check
	public void checkTimGenOn(nTimGenOn var) {
		val = var.getValue();
		ea = fp.getnTimGenOn_Value();

		if(m.getGenTiStr().isValue()) {
			checkPos(val, ea);
			if (isLinearization() && val!=0)
				warning("TimGenOn must be 0 during linearization.", ea);
		} else
			checkNotUsed(m.getGenTiStr().getName(), ea, " is \"false\"");
		
		
		
	}
	
	@Check
	public void checkTimGenOff(nTimGenOf var) {
		
		refreshModel(var);
		
		val = var.getValue();
		ea = fp.getnTimGenOf_Value();

		checkPos(val, ea);
		
		// global check
		if(m.getGenTiStp().isValue()) {
			// TODO check on the manual if OK
			if(m.getAnalMode().getValue()==2 && val!=0)
				warning("TimGenOf must be 0 during linearization.", ea);
			if(val<m.getTimGenOn().getValue())
				warning("TimGenOf must be greater than TimGenOn", ea);
		} else 
			info("TimGenOf not used when GenTiStp is \"false\".", ea);

	}

	@Check
	public void checkHSSBrMode(iHSSBrMode var) {
		val = var.getValue();
		ea = fp.getiHSSBrMode_Value();

		check12(val, ea);
	}

	@Check
	public void checkTHSSBrDp(nTHSSBrDp var) {
		val = var.getValue();
		ea = fp.getnTHSSBrDp_Value();

		checkPos(val, ea);
		
		if(isLinearization() && val<m.getTMax().getValue())
			warning("THSSBrDp must be greater than TMax during linearization.", ea);
	}

	@Check
	public void checkTiDynBrk(nTiDynBrk var) {
		// NOTE: CURRENTLY IGNORED, see FAST manual
		val = var.getValue();
		ea = fp.getnTiDynBrk_Value();

		checkPos(val, ea);
		
		if (isLinearization() && val<m.getTMax().getValue())
			warning("TiDynBrk must be greater than TMax during linearization.",ea);
		
	}

	@Check
	public void checkTTpBrDp1(nTTpBrDp_1_ var) {
		val = var.getValue();
		ea = fp.getnTTpBrDp_1__Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getTMax().getValue())
			warning("TTpBrDp(1) must be greater than TMax during linearization.",ea);
		
	}

	@Check
	public void checkTTpBrDp2(nTTpBrDp_2_ var) {
		val = var.getValue();
		ea = fp.getnTTpBrDp_2__Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getTMax().getValue())
			warning("TTpBrDp(2) must be greater than TMax during linearization.",ea);
		
	}

	@Check
	public void checkTTpBrDp3(nTTpBrDp_3_ var) {
		val = var.getValue();
		ea = fp.getnTTpBrDp_3__Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getTMax().getValue())
			warning("TTpBrDp(3) must be greater than TMax during linearization.",ea);
		
	}

	@Check
	public void checkTBDeplSp1(nTBDepISp_1_ var) {
		val = var.getValue();
		ea = fp.getnTBDepISp_1__Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getRotSpeed().getValue())
			warning("TBDepISp(1) must be greater than RotSpeed during linearization.",ea);
		
	}

	@Check
	public void checkTBDeplSp2(nTBDepISp_2_ var) {
		val = var.getValue();
		ea = fp.getnTBDepISp_2__Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getRotSpeed().getValue())
			warning("TBDepISp(2) must be greater than RotSpeed during linearization.",ea);
				
	}

	@Check
	public void checkTBDeplSp3(nTBDepISp_3_ var) {
		val = var.getValue();
		ea = fp.getnTBDepISp_3__Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getRotSpeed().getValue())
			warning("TBDepISp(3) must be greater than RotSpeed during linearization.",ea);
	}

	@Check
	public void checkTYawManS(nTYawManS var) {
		val = var.getValue();
		ea = fp.getnTYawManS_Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getTMax().getValue())
			warning("TYawManS must be greater than TMax during linearization.",ea);
		
	}

	@Check
	public void checkTYawManE(nTYawManE var) {
		val = var.getValue();
		ea = fp.getnTYawManE_Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getTYawManS().getValue())
			warning("TYawManE must be greater or equal to TYawManS during linearization.",ea);
		
	}

	@Check
	public void checkNacYawF(nNacYawF var) {
		val = var.getValue();
		ea = fp.getnNacYawF_Value();

		check180180(val, ea);
	}

	@Check
	public void checkTPitManS_1_(nTPitManS_1_ var) {
		val = var.getValue();
		ea = fp.getnTPitManS_1__Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getTMax().getValue())
			warning("TPitManS(1) must be greater or equal to TMax during linearization.",ea);
		
	}

	@Check
	public void checkTPitManS_2_(nTPitManS_2_ var) {
		val = var.getValue();
		ea = fp.getnTPitManS_2__Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getTMax().getValue())
			warning("TPitManS(2) must be greater or equal to TMax during linearization.",ea);
		
	}

	@Check
	public void checkTPitManS_3_(nTPitManS_3_ var) {
		val = var.getValue();
		ea = fp.getnTPitManS_3__Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getTMax().getValue())
			warning("TPitManS(3) must be greater or equal to TMax during linearization.",ea);
		
	}

	@Check
	public void checkTPitManE_1_(nTPitManE_1_ var) {
		val = var.getValue();
		ea = fp.getnTPitManE_1__Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getTMax().getValue())
			warning("TPitManE(1) must be greater or equal to TPitManE(1) during linearization.",ea);
				
	}

	@Check
	public void checkTPitManE_2_(nTPitManE_2_ var) {
		val = var.getValue();
		ea = fp.getnTPitManE_2__Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getTMax().getValue())
			warning("TPitManE(2) must be greater or equal to TPitManE(2) during linearization.",ea);
		
	}

	@Check
	public void checkTPitManE_3_(nTPitManE_3_ var) {
		val = var.getValue();
		ea = fp.getnTPitManE_3__Value();

		checkPos(val, ea);
		
		if (isLinearization() && val < m.getTMax().getValue())
			warning("TPitManE(3) must be greater or equal to TPitManE(3) during linearization.",ea);
		
	}

	@Check
	public void checkBlPitch_1_(nBlPitch_1_ var) {
		val = var.getValue();
		ea = fp.getnBlPitch_1__Value();

		check180180(val, ea);
	}

	@Check
	public void checkBlPitch_2_(nBlPitch_2_ var) {
		val = var.getValue();
		ea = fp.getnBlPitch_2__Value();

		check180180(val, ea);
	}

	@Check
	public void checkBlPitch_3_(nBlPitch_3_ var) {
		val = var.getValue();
		ea = fp.getnBlPitch_3__Value();

		check180180(val, ea);
	}

	@Check
	public void checkBlPitchF_1_(nBlPitchF_1_ var) {
		val = var.getValue();
		ea = fp.getnBlPitchF_1__Value();

		check180180(val, ea);
	}

	@Check
	public void checkBlPitchF_2_(nBlPitchF_2_ var) {
		val = var.getValue();
		ea = fp.getnBlPitchF_2__Value();

		check180180(val, ea);
	}

	@Check
	public void checkBlPitchF_3_(nBlPitchF_3_ var) {
		val = var.getValue();
		ea = fp.getnBlPitchF_3__Value();

		check180180(val, ea);
	}

	// ENVIRONMENT
	@Check
	public void checkGravity(nGravity var) {
		val = var.getValue();
		ea = fp.getnGravity_Value();

		checkPos(val, ea);
	}

	// FEATURE FLAGS
	@Check
	public void checkTwFADOF1(bTwFADOF1 var) {
		bValue = var.isValue();
		ea = fp.getbTwFADOF1_Value();

		if (isADAMSPrep() && bValue != m.getTwSSDOF1().isValue())
			warning("TwFADOF1 must be equal to TwSSDOF1 when ADAMS pre-processor is active",ea);
	}
	

	// INITIAL CONDITIONS
	@Check
	public void checkOoPDefl(nOoPDefl var) {
		val = var.getValue();
		ea = fp.getnOoPDefl_Value();
		
		if (isADAMSPrep() && m.getOoPDefl().getValue() != 0)
			warning("OoPDefl must be 0 when ADAMS pre-processor is active.",ea);

	}

	@Check
	public void checkIPDefl(nIPDefl var) {
		val = var.getValue();
		ea = fp.getnIPDefl_Value();

		if (isADAMSPrep() && m.getIPDefl().getValue() != 0)
			warning("IPDefl must be 0 when ADAMS pre-processor is active.",ea);
	}

	@Check
	public void checkTeetDefl(nTeetDefl var) {
		val = var.getValue();
		ea = fp.getnTeetDefl_Value();

		check180180(val, ea);
		
		if (isADAMSPrep() && m.getTeetDefl().getValue() != 0)
			warning("TeetDefl must be 0 when ADAMS pre-processor is active.",ea);
	}

	@Check
	public void checkAzimuth(nAzimuth var) {
		val = var.getValue();
		ea = fp.getnAzimuth_Value();

		check0360(val, ea);
	}

	@Check
	public void checkRotSpeed(nRotSpeed var) {
		val = var.getValue();
		ea = fp.getnRotSpeed_Value();

		checkPos(val, ea);
	}

	@Check
	public void checkNacYaw(nNacYaw var) {
		val = var.getValue();
		ea = fp.getnNacYaw_Value();

		// check0360(val, ea);
	}

	@Check
	public void checkTTDspFA(nTTDspFA var) {
		val = var.getValue();
		ea = fp.getnTTDspFA_Value();
		
		if (isADAMSPrep() && val != 0)
			warning("TTDspFA must be 0 when ADAMS pre-processor is active.",ea);

	}

	@Check
	public void checkTTDspSS(nTTDspSS var) {
		val = var.getValue();
		ea = fp.getnTTDspSS_Value();

		if (isADAMSPrep() && val != 0)
			warning("TTDspSS must be 0 when ADAMS pre-processor is active.",ea);
		
	}

	// TURBINE CONFIGURATION
	@Check
	public void checkTipRad(nTipRad var) {
		val = var.getValue();
		ea = fp.getnTipRad_Value();

		checkPos(val, ea);
	}

	@Check
	public void checkHubRad(nHubRad var) {
		val = var.getValue();
		ea = fp.getnHubRad_Value();

		checkPos(val, ea);
		
		// HubRad
		if (val >= m.getTipRad().getValue())
			warning("HubRad must be less than TipRad", ea);
		
	}

	@Check
	public void checkPSpnElN(nPSpnElN var) {
		// NOTE: CURRENTLY IGNORED by FAST
		val = var.getValue();
		ea = fp.getnPSpnElN_Value();

		// TODO integer between 1 and BldNodes
		// TODO Aerodyn required (for BldNodes)
		// if(val >= m_adn.get.getBldNodes.getValue())
		// warning("HubRad must be less than TipRad",ea);

	}

	@Check
	public void checkUndSling(nUndSling var) {
		val = var.getValue();
		ea = fp.getnUndSling_Value();

	}

	@Check
	public void checkHubCM(nHubCM var) {
		val = var.getValue();
		ea = fp.getnHubCM_Value();

	}

	@Check
	public void checkOverHang(nOverHang var) {
		val = var.getValue();
		ea = fp.getnOverHang_Value();

	}

	@Check
	public void checkNacCMxn(nNacCMxn var) {
		val = var.getValue();
		ea = fp.getnNacCMxn_Value();

	}

	@Check
	public void checkNacCMyn(nNacCMyn var) {
		val = var.getValue();
		ea = fp.getnNacCMyn_Value();

	}

	@Check
	public void checkNacCMzn(nNacCMzn var) {
		val = var.getValue();
		ea = fp.getnNacCMzn_Value();

	}

	@Check
	public void checkTowerHt(nTowerHt var) {
		val = var.getValue();
		ea = fp.getnTowerHt_Value();

		checkPos(val, ea);
		// TODO: add =0 error
	}

	@Check
	public void checkTwr2Shft(nTwr2Shft var) {
		val = var.getValue();
		ea = fp.getnTwr2Shft_Value();

		checkPos(val, ea);
	}

	@Check
	public void checkTwrRBHt(nTwrRBHt var) {
		val = var.getValue();
		ea = fp.getnTwrRBHt_Value();

		checkPos(val, ea);

		// TODO this check requires tower and platform file editor
		// if(val >= m_twr.getTowerHt().getValue()+m_ptf.getTwrDraft.getValue())
		// warning("HubRad must be less than TipRad", ea);

	}

	@Check
	public void checkShftTilt(nShftTilt var) {
		val = var.getValue();
		ea = fp.getnShftTilt_Value();

		check180180(val, ea);
	}

	@Check
	public void checkDelta3(nDelta3 var) {
		val = var.getValue();
		ea = fp.getnDelta3_Value();

		check9090(val, ea);
		// TODO: add exclusive -90 / 90
	}

	@Check
	public void checkPreCone1(nPreCone_1_ var) {
		val = var.getValue();
		ea = fp.getnPreCone_1__Value();

		check180180(val, ea);
	}

	@Check
	public void checkPreCone2(nPreCone_2_ var) {
		val = var.getValue();
		ea = fp.getnPreCone_2__Value();

		check180180(val, ea);
	}

	@Check
	public void checkPreCone3(nPreCone_3_ var) {
		val = var.getValue();
		ea = fp.getnPreCone_3__Value();

		check180180(val, ea);
	}

	@Check
	public void checkAzimB1Up(nAzimB1Up var) {
		val = var.getValue();
		ea = fp.getnAzimB1Up_Value();

		check0360(val, ea);
	}

	// MASSES
	@Check
	public void checkYawBrMass(nYawBrMass var) {
		val = var.getValue();
		ea = fp.getnYawBrMass_Value();

		checkPos(val, ea);
	}

	@Check
	public void checkNacMass(nNacMass var) {
		val = var.getValue();
		ea = fp.getnNacMass_Value();

		checkPos(val, ea);
	}

	@Check
	public void checkHubMass(nHubMass var) {
		val = var.getValue();
		ea = fp.getnHubMass_Value();

		checkPos(val, ea);
	}

	@Check
	public void checkTipMass1(nTipMass_1_ var) {
		val = var.getValue();
		ea = fp.getnTipMass_1__Value();

		checkPos(val, ea);
	}

	@Check
	public void checkTipMass2(nTipMass_2_ var) {
		val = var.getValue();
		ea = fp.getnTipMass_2__Value();

		checkPos(val, ea);
	}

	@Check
	public void checkTipMass3(nTipMass_3_ var) {
		val = var.getValue();
		ea = fp.getnTipMass_3__Value();

		checkPos(val, ea);
	}

	@Check
	public void checkNacYIner(nNacYIner var) {
		val = var.getValue();
		ea = fp.getnNacYIner_Value();

		checkPos(val, ea);
		
		if (val <= m.getNacMass().getValue()* (Math.pow(m.getNacCMxn().getValue(), 2) + Math.pow(m.getNacCMyn().getValue(), 2)))
			warning("NacYIner must be greater than NacMass*(NacCMxn^2+NacCMyn^2)",ea);

	}

	@Check
	public void checkGenIner(nGenIner var) {
		val = var.getValue();
		ea = fp.getnGenIner_Value();

		checkPos(val, ea);
	}

	@Check
	public void checkHubIner(nHubIner var) {
		val = var.getValue();
		ea = fp.getnHubIner_Value();

		checkPos(val, ea);
		
		// HubIner
		if (m.getNumBl().getValue() == 2 && val <= m.getHubMass().getValue()* Math.pow(m.getUndSling().getValue() - m.getHubCM().getValue(), 2))
			warning("HubIner must be greater than HubMass*(UndSling-HubCm)^2 for 2 blades wind turbines", ea);

	}

	// DRIVETRAIN
	@Check
	public void checkGBoxEff(nGBoxEff var) {
		val = var.getValue();
		ea = fp.getnGBoxEff_Value();

		check0100(val, ea);
		
		if (isADAMSPrep() && val != 100)
			warning("GBoxEff must be 100% when ADAMS pre-processor is active.",ea);
		
	}

	@Check
	public void checkGenEff(nGenEff var) {
		val = var.getValue();
		ea = fp.getnGenEff_Value();

		check0100(val, ea);
	}

	@Check
	public void checkGBRatio(nGBRatio var) {
		val = var.getValue();
		ea = fp.getnGBRatio_Value();

		checkPos(val, ea);
	}

	@Check
	public void checkGBRevers(bGBRevers var) {
		bValue = var.isValue();
		ea = fp.getnGBRatio_Value();
		if (isADAMSPrep() && bValue)
			warning("GBoxEff must be FALSE when ADAMS pre-processor is active.",ea);

	}	
	@Check
	public void checkHSSBrTqF(nHSSBrTqF var) {
		val = var.getValue();
		ea = fp.getnHSSBrTqF_Value();

		checkPos(val, ea);
	}

	@Check
	public void checkHSSBrDT(nHSSBrDT var) {
		val = var.getValue();
		ea = fp.getnHSSBrDT_Value();

		checkPos(val, ea);
	}

	@Check
	public void checkDynBrkFi(fDynBrkFi var) {
		// NOTE: CURRENTLY IGNORED by FAST
	}

	@Check
	public void checkDTTorSpr(nDTTorSpr var) {
		val = var.getValue();
		ea = fp.getnDTTorSpr_Value();

		checkPos(val, ea);
	}

	@Check
	public void checkDTTorDmp(nDTTorDmp var) {
		val = var.getValue();
		ea = fp.getnDTTorDmp_Value();
		checkPos(val, ea);
	}

	// SIMPLE INDUCTION GENERATOR
	@Check
	public void checkSIG_SlPc(nSIG_SlPc var) {
		val = var.getValue();
		ea = fp.getnSIG_SlPc_Value();
		check0100(val, ea);
	}

	@Check
	public void checkSIG_SySp(nSIG_SySp var) {
		val = var.getValue();
		ea = fp.getnSIG_SySp_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkSIG_RtTq(nSIG_RtTq var) {
		val = var.getValue();
		ea = fp.getnSIG_RtTq_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkSIG_PORt(nSIG_PORt var) {
		val = var.getValue();
		ea = fp.getnSIG_PORt_Value();
		//
	}

	// THEVENIN-EQUIVALENT, 3-PHASE, INDUCTION GENERATOR
	@Check
	public void checkTEC_Freq(nTEC_Freq var) {
		val = var.getValue();
		ea = fp.getnTEC_Freq_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkTEC_NPol(nTEC_Npol var) {
		val = var.getValue();
		ea = fp.getnTEC_Npol_Value();
		checkPos(val, ea);
		// TODO chechInt(val, ea);
		// TODO check EVEN
	}

	@Check
	public void checkTEC_SRes(nTEC_Sres var) {
		val = var.getValue();
		ea = fp.getnTEC_Sres_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkTEC_RRes(nTEC_Rres var) {
		val = var.getValue();
		ea = fp.getnTEC_Rres_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkTEC_VLL(nTEC_VLL var) {
		val = var.getValue();
		ea = fp.getnTEC_VLL_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkTEC_SLR(nTEC_SLR var) {
		val = var.getValue();
		ea = fp.getnTEC_SLR_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkTEC_RLR(nTEC_RLR var) {
		val = var.getValue();
		ea = fp.getnTEC_RLR_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkTEC_MR(nTEC_MR var) {
		val = var.getValue();
		ea = fp.getnTEC_MR_Value();
		checkPos(val, ea);
	}

	// PLATFORM MODEL
	@Check
	public void checkPtfmModel(iPtfmModel var) {
		val = var.getValue();
		ea = fp.getiPtfmModel_Value();
		check03(val, ea);
	}

	@Check
	public void checkPtfmFile(fPtfmFile var) {
		// PtfmFile
		if (m.getPtfmModel().getValue() > 0) {
			ea = fp.getfPtfmFile_Value();
			uri = URI.createFileURI(var.getValue()).resolve(fstURI);
			err = checkURI(uri);
			switch (err) {
				case 1:
					error("Path is pointing outside the project folder.", ea);
					break;
				case 2:
					error("File doesn't exist.", ea);
					break;
			}
		}
	}

	// TOWER
	@Check
	public void checkTwrNodes(iTwrNodes var) {
		val = var.getValue();
		ea = fp.getiTwrNodes_Value();
		checkPos(val, ea);
		
		if (isADAMSPrep() && val > 99)
			warning("TwrNodes must be less than 100 when ADAMS pre-processor is active.",ea);
		
	}

	// TwrFile
	@Check
	public void checkTwrFile(fTwrFile var) {
		ea = fp.getfTwrFile_Value();
		uri = URI.createFileURI(var.getValue()).resolve(fstURI);
		err = checkURI(uri);
		switch (err) {
			case 1:
				error("Path is pointing outside the project folder.", ea);
				break;
			case 2:
				error("File doesn't exist.", ea);
				break;
		}
	}

	// NACELLE YAW
	@Check
	public void checkYawSpr(nYawSpr var) {
		val = var.getValue();
		ea = fp.getnYawSpr_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkYawDamp(nYawDamp var) {
		val = var.getValue();
		ea = fp.getnYawDamp_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkYawNeut(nYawNeut var) {
		val = var.getValue();
		ea = fp.getnYawNeut_Value();
		check180180(val, ea);
	}

	// FURLING
	@Check
	public void checkFurling(bFurling var) {
	}

	@Check
	public void checkFurlFile(fFurlFile var) {
		if (m.getFurling().isValue()) {
			uri = URI.createFileURI(var.getValue()).resolve(fstURI);
			err = checkURI(uri);
			ea = fp.getfFurlFile_Value();
			switch (err) {
				case 1:
					error("Path is pointing outside the project folder.", ea);
					break;
				case 2:
					error("File doesn't exist.", ea);
					break;
			}
		}
	}

	// ROTOR TEETER
	@Check
	public void checkTeetMod(iTeetMod var) {
		val = var.getValue();
		ea = fp.getiTeetMod_Value();
		check02(val, ea);
	}

	@Check
	public void checkTeetDmpP(nTeetDmpP var) {
		val = var.getValue();
		ea = fp.getnTeetDmpP_Value();
		check0180(val, ea);
	}

	@Check
	public void checkTeetDmp(nTeetDmp var) {
		val = var.getValue();
		ea = fp.getnTeetDmp_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkTeetCDmp(nTeetCDmp var) {
		val = var.getValue();
		ea = fp.getnTeetCDmp_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkTeetSStP(nTeetSStP var) {
		val = var.getValue();
		ea = fp.getnTeetSStP_Value();
		check0180(val, ea);
	}

	@Check
	public void checkTeetHStP(nTeetHStP var) {
		val = var.getValue();
		ea = fp.getnTeetHStP_Value();
		// TODO global check
	}

	@Check
	public void checkTeetSSSp(nTeetSSSp var) {
		val = var.getValue();
		ea = fp.getnTeetSSSp_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkTeetHSSp(nTeetHSSp var) {
		val = var.getValue();
		ea = fp.getnTeetHSSp_Value();
		checkPos(val, ea);
	}

	// TIP BRAKES
	@Check
	public void checkTBDrConN(nTBDrConN var) {
		val = var.getValue();
		ea = fp.getnTBDrConN_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkTBDrConD(nTBDrConD var) {
		val = var.getValue();
		ea = fp.getnTBDrConD_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkTpBrDT(nTpBrDT var) {
		val = var.getValue();
		ea = fp.getnTpBrDT_Value();
		checkPos(val, ea);
	}

	// BLADES
	@Check
	public void checkBldFile1(fBldFile_1_ var) {
				uri = URI.createFileURI(var.getValue()).resolve(fstURI);
				err = checkURI(uri);
				ea = fp.getfBldFile_1__Value();
				switch (err) {
				case 1:
					error("Path is pointing outside the project folder.", ea);
					break;
				case 2:
					error("File doesn't exist.", ea);
					break;
				}
				
				
	}

	@Check
	public void checkBldFile2(fBldFile_2_ var) {
		uri = URI.createFileURI(var.getValue()).resolve(fstURI);
		err = checkURI(uri);
		ea = fp.getfBldFile_2__Value();
		switch (err) {
		case 1:
			error("Path is pointing outside the project folder.",ea);
			break;
		case 2:
			error("File doesn't exist.", ea);
			break;
		}
	}

	@Check
	public void checkBldFile3(fBldFile_3_ var) {
		uri = URI.createFileURI(var.getValue()).resolve(fstURI);
		err = checkURI(uri);
		ea = fp.getfBldFile_3__Value();
		switch (err) {
		case 1:
			error("Path is pointing outside the project folder.", ea);
			break;
		case 2:
			error("File doesn't exist.", ea);
			break;
		}
	}

	// AERODYN
	@Check
	public void checkADFile(fADFile var) {
		if (m.getCompAero().isValue()) {
			uri = URI.createFileURI(var.getValue()).resolve(fstURI);
			err = checkURI(uri);
			ea = fp.getfADFile_Value();
			switch (err) {
				case 1:
					error("Path is pointing outside the project folder.", ea);
					break;
				case 2:
					error("File doesn't exist.", ea);
					break;
			}
		}
	}

	// NOISE
	@Check
	public void checkNoiseFile(fNoiseFile var) {
		if (m.getCompNoise().isValue()) {
			uri = URI.createFileURI(var.getValue()).resolve(fstURI);
			err = checkURI(uri);
			ea = fp.getfNoiseFile_Value();
			switch (err) {
			case 1:
				error("Path is pointing outside the project folder.", ea);
				break;
			case 2:
				error("File doesn't exist.", ea);
				break;
			}
		}

	}

	// ADAMS
	@Check
	public void checkADAMSFile(fADAMSFile var) {
		if (m.getADAMSPrep().getValue() > 1) {
			uri = URI.createFileURI(var.getValue()).resolve(fstURI);
			err = checkURI(uri);
			ea = fp.getfADAMSFile_Value();
			switch (err) {
				case 1:
					error("Path is pointing outside the project folder.", ea);
					break;
				case 2:
					error("File doesn't exist.", ea);
					break;
			}
		}
	}

	// LINEARIZATION
	@Check
	public void checkLinFile(fLinFile var) {
		
		if (m.getAnalMode().getValue() > 1) {
			uri = URI.createFileURI(var.getValue()).resolve(fstURI);
			err = checkURI(uri);
			ea = fp.getfLinFile_Value();
			switch (err) {
			case 1:
				error("Path is pointing outside the project folder.", ea);
				break;
			case 2:
				error("File doesn't exist.", ea);
				break;
			}
		}
	}

	// OUTPUT
	@Check
	public void checkSumPrint(bSumPrint var) {
	}

	@Check
	public void checkTabDelim(bTabDelim var) {
	}

	@Check
	public void checkOutFmt(sOutFmt var) {
		// TODO
	}

	@Check
	public void checkTStart(nTStart var) {
		val = var.getValue();
		ea = fp.getnTStart_Value();
		checkPos(val, ea);
		
		if (val > m.getTMax().getValue())
			warning("TStart must be less than TMax",ea);
	}

	@Check
	public void checkDecFact(iDecFact var) {
		val = var.getValue();
		ea = fp.getiDecFact_Value();
		checkPos(val, ea);
		checkInt(val, ea);
	}

	@Check
	public void checkSttsTime(nSttsTime var) {
		val = var.getValue();
		ea = fp.getnSttsTime_Value();
		checkPos(val, ea);
	}

	@Check
	public void checkNcIMUxn(nNcIMUxn var) {
	}

	@Check
	public void checkNcIMUyn(nNcIMUyn var) {
	}

	@Check
	public void checkNcIMUzn(nNcIMUzn var) {
	}

	@Check
	public void checkShftGagL(nShftGagL var) {
	}

	@Check
	public void checkNTwGages(iNTwGages var) {
		ea = fp.getiNTwGages_Value();
		// TODO check05(val, ea);
	}

	@Check
	public void checkTwGagNd(aTwrGagNd var) {
		ea = fp.getaTwrGagNd_Value();
		// TODO check array or string
	}

	@Check
	public void checkNBlGages(iNBlGages var) {
		val = var.getValue();
		ea = fp.getiNBlGages_Value();
		// TODO check05(val, ea);
	}

	@Check
	public void checkBldGagNd(aBldGagNd var) {
		// String val = var.getValue();
		ea = fp.getaBldGagNd_Value();
		// TODO check array or string
	}

	@Check
	public void checkOutList(vOutList var) {
		// String val = var.getValue();
		ea = fp.getvOutList_Value();
		// TODO check array or string
		// TODO: add check for duplicates, add all channels

	}
}
