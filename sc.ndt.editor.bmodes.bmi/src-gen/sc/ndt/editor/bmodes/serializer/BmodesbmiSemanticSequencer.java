package sc.ndt.editor.bmodes.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import sc.ndt.editor.bmodes.bmodesbmi.BmodesbmiPackage;
import sc.ndt.editor.bmodes.bmodesbmi.Header;
import sc.ndt.editor.bmodes.bmodesbmi.ModelBmodesbmi;
import sc.ndt.editor.bmodes.bmodesbmi.Section;
import sc.ndt.editor.bmodes.bmodesbmi.aElLoc;
import sc.ndt.editor.bmodes.bmodesbmi.aNodeAttach;
import sc.ndt.editor.bmodes.bmodesbmi.aTwrWires;
import sc.ndt.editor.bmodes.bmodesbmi.aWireAngle;
import sc.ndt.editor.bmodes.bmodesbmi.aWireStiff;
import sc.ndt.editor.bmodes.bmodesbmi.bEcho;
import sc.ndt.editor.bmodes.bmodesbmi.bMidNodeTw;
import sc.ndt.editor.bmodes.bmodesbmi.bTabDelim;
import sc.ndt.editor.bmodes.bmodesbmi.iBeamType;
import sc.ndt.editor.bmodes.bmodesbmi.iHubConn;
import sc.ndt.editor.bmodes.bmodesbmi.iIdMat;
import sc.ndt.editor.bmodes.bmodesbmi.iModePr;
import sc.ndt.editor.bmodes.bmodesbmi.iNSelt;
import sc.ndt.editor.bmodes.bmodesbmi.iSecFile;
import sc.ndt.editor.bmodes.bmodesbmi.iTwrAttach;
import sc.ndt.editor.bmodes.bmodesbmi.iTwrSupport;
import sc.ndt.editor.bmodes.bmodesbmi.nAxiStfMult;
import sc.ndt.editor.bmodes.bmodesbmi.nBlThp;
import sc.ndt.editor.bmodes.bmodesbmi.nCgOffsMult;
import sc.ndt.editor.bmodes.bmodesbmi.nCmAxial;
import sc.ndt.editor.bmodes.bmodesbmi.nCmLoc;
import sc.ndt.editor.bmodes.bmodesbmi.nEdgStfMult;
import sc.ndt.editor.bmodes.bmodesbmi.nFlpInrMult;
import sc.ndt.editor.bmodes.bmodesbmi.nFlpstfMult;
import sc.ndt.editor.bmodes.bmodesbmi.nHubRad;
import sc.ndt.editor.bmodes.bmodesbmi.nIxxTip;
import sc.ndt.editor.bmodes.bmodesbmi.nIxyTip;
import sc.ndt.editor.bmodes.bmodesbmi.nIyyTip;
import sc.ndt.editor.bmodes.bmodesbmi.nIyzTip;
import sc.ndt.editor.bmodes.bmodesbmi.nIzxTip;
import sc.ndt.editor.bmodes.bmodesbmi.nIzzTip;
import sc.ndt.editor.bmodes.bmodesbmi.nLagInrMult;
import sc.ndt.editor.bmodes.bmodesbmi.nPrecone;
import sc.ndt.editor.bmodes.bmodesbmi.nRadius;
import sc.ndt.editor.bmodes.bmodesbmi.nRotRpm;
import sc.ndt.editor.bmodes.bmodesbmi.nRpmMult;
import sc.ndt.editor.bmodes.bmodesbmi.nScOffsMult;
import sc.ndt.editor.bmodes.bmodesbmi.nSecMasMult;
import sc.ndt.editor.bmodes.bmodesbmi.nTcOffsMult;
import sc.ndt.editor.bmodes.bmodesbmi.nTipMass;
import sc.ndt.editor.bmodes.bmodesbmi.nTorStfMult;
import sc.ndt.editor.bmodes.services.BmodesbmiGrammarAccess;

@SuppressWarnings("all")
public class BmodesbmiSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BmodesbmiGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BmodesbmiPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BmodesbmiPackage.HEADER:
				if(context == grammarAccess.getHeaderRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.MODEL_BMODESBMI:
				if(context == grammarAccess.getModelBmodesbmiRule()) {
					sequence_ModelBmodesbmi(context, (ModelBmodesbmi) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.SECTION:
				if(context == grammarAccess.getSectionRule()) {
					sequence_Section(context, (Section) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.AEL_LOC:
				if(context == grammarAccess.getAElLocRule()) {
					sequence_aElLoc(context, (aElLoc) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.ANODE_ATTACH:
				if(context == grammarAccess.getANodeAttachRule()) {
					sequence_aNodeAttach(context, (aNodeAttach) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.ATWR_WIRES:
				if(context == grammarAccess.getATwrWiresRule()) {
					sequence_aTwrWires(context, (aTwrWires) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.AWIRE_ANGLE:
				if(context == grammarAccess.getAWireAngleRule()) {
					sequence_aWireAngle(context, (aWireAngle) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.AWIRE_STIFF:
				if(context == grammarAccess.getAWireStiffRule()) {
					sequence_aWireStiff(context, (aWireStiff) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.BECHO:
				if(context == grammarAccess.getBEchoRule()) {
					sequence_bEcho(context, (bEcho) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.BMID_NODE_TW:
				if(context == grammarAccess.getBMidNodeTwRule()) {
					sequence_bMidNodeTw(context, (bMidNodeTw) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.BTAB_DELIM:
				if(context == grammarAccess.getBTabDelimRule()) {
					sequence_bTabDelim(context, (bTabDelim) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.IBEAM_TYPE:
				if(context == grammarAccess.getIBeamTypeRule()) {
					sequence_iBeamType(context, (iBeamType) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.IHUB_CONN:
				if(context == grammarAccess.getIHubConnRule()) {
					sequence_iHubConn(context, (iHubConn) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.IID_MAT:
				if(context == grammarAccess.getIIdMatRule()) {
					sequence_iIdMat(context, (iIdMat) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.IMODE_PR:
				if(context == grammarAccess.getIModePrRule()) {
					sequence_iModePr(context, (iModePr) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.IN_SELT:
				if(context == grammarAccess.getINSeltRule()) {
					sequence_iNSelt(context, (iNSelt) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.ISEC_FILE:
				if(context == grammarAccess.getISecFileRule()) {
					sequence_iSecFile(context, (iSecFile) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.ITWR_ATTACH:
				if(context == grammarAccess.getITwrAttachRule()) {
					sequence_iTwrAttach(context, (iTwrAttach) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.ITWR_SUPPORT:
				if(context == grammarAccess.getITwrSupportRule()) {
					sequence_iTwrSupport(context, (iTwrSupport) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NAXI_STF_MULT:
				if(context == grammarAccess.getNAxiStfMultRule()) {
					sequence_nAxiStfMult(context, (nAxiStfMult) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NBL_THP:
				if(context == grammarAccess.getNBlThpRule()) {
					sequence_nBlThp(context, (nBlThp) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NCG_OFFS_MULT:
				if(context == grammarAccess.getNCgOffsMultRule()) {
					sequence_nCgOffsMult(context, (nCgOffsMult) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NCM_AXIAL:
				if(context == grammarAccess.getNCmAxialRule()) {
					sequence_nCmAxial(context, (nCmAxial) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NCM_LOC:
				if(context == grammarAccess.getNCmLocRule()) {
					sequence_nCmLoc(context, (nCmLoc) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NEDG_STF_MULT:
				if(context == grammarAccess.getNEdgStfMultRule()) {
					sequence_nEdgStfMult(context, (nEdgStfMult) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NFLP_INR_MULT:
				if(context == grammarAccess.getNFlpInrMultRule()) {
					sequence_nFlpInrMult(context, (nFlpInrMult) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NFLPSTF_MULT:
				if(context == grammarAccess.getNFlpstfMultRule()) {
					sequence_nFlpstfMult(context, (nFlpstfMult) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NHUB_RAD:
				if(context == grammarAccess.getNHubRadRule()) {
					sequence_nHubRad(context, (nHubRad) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NIXX_TIP:
				if(context == grammarAccess.getNIxxTipRule()) {
					sequence_nIxxTip(context, (nIxxTip) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NIXY_TIP:
				if(context == grammarAccess.getNIxyTipRule()) {
					sequence_nIxyTip(context, (nIxyTip) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NIYY_TIP:
				if(context == grammarAccess.getNIyyTipRule()) {
					sequence_nIyyTip(context, (nIyyTip) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NIYZ_TIP:
				if(context == grammarAccess.getNIyzTipRule()) {
					sequence_nIyzTip(context, (nIyzTip) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NIZX_TIP:
				if(context == grammarAccess.getNIzxTipRule()) {
					sequence_nIzxTip(context, (nIzxTip) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NIZZ_TIP:
				if(context == grammarAccess.getNIzzTipRule()) {
					sequence_nIzzTip(context, (nIzzTip) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NLAG_INR_MULT:
				if(context == grammarAccess.getNLagInrMultRule()) {
					sequence_nLagInrMult(context, (nLagInrMult) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NPRECONE:
				if(context == grammarAccess.getNPreconeRule()) {
					sequence_nPrecone(context, (nPrecone) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NRADIUS:
				if(context == grammarAccess.getNRadiusRule()) {
					sequence_nRadius(context, (nRadius) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NROT_RPM:
				if(context == grammarAccess.getNRotRpmRule()) {
					sequence_nRotRpm(context, (nRotRpm) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NRPM_MULT:
				if(context == grammarAccess.getNRpmMultRule()) {
					sequence_nRpmMult(context, (nRpmMult) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NSC_OFFS_MULT:
				if(context == grammarAccess.getNScOffsMultRule()) {
					sequence_nScOffsMult(context, (nScOffsMult) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NSEC_MAS_MULT:
				if(context == grammarAccess.getNSecMasMultRule()) {
					sequence_nSecMasMult(context, (nSecMasMult) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NTC_OFFS_MULT:
				if(context == grammarAccess.getNTcOffsMultRule()) {
					sequence_nTcOffsMult(context, (nTcOffsMult) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NTIP_MASS:
				if(context == grammarAccess.getNTipMassRule()) {
					sequence_nTipMass(context, (nTipMass) semanticObject); 
					return; 
				}
				else break;
			case BmodesbmiPackage.NTOR_STF_MULT:
				if(context == grammarAccess.getNTorStfMultRule()) {
					sequence_nTorStfMult(context, (nTorStfMult) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=SL_COMMENT desc=SL_COMMENT)
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.HEADER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.HEADER__NAME));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.HEADER__DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.HEADER__DESC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderAccess().getNameSL_COMMENTTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHeaderAccess().getDescSL_COMMENTTerminalRuleCall_2_0(), semanticObject.getDesc());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         Head=Header 
	 *         sec+=Section 
	 *         Echo=bEcho 
	 *         BeamType=iBeamType 
	 *         RotRpm=nRotRpm 
	 *         RpmMult=nRpmMult 
	 *         Radius=nRadius 
	 *         HubRad=nHubRad 
	 *         PreCone=nPrecone 
	 *         BlThp=nBlThp 
	 *         HubConn=iHubConn 
	 *         ModePr=iModePr 
	 *         TabDelim=bTabDelim 
	 *         MidNodeTw=bMidNodeTw 
	 *         sec+=Section 
	 *         TipMass=nTipMass 
	 *         CmLoc=nCmLoc 
	 *         CmAxial=nCmAxial 
	 *         IxxTip=nIxxTip 
	 *         IyyTip=nIyyTip 
	 *         IzzTip=nIzzTip 
	 *         IxyTip=nIxyTip 
	 *         IzxTip=nIzxTip 
	 *         IyzTip=nIyzTip 
	 *         sec+=Section 
	 *         IdMat=iIdMat 
	 *         SecFile=iSecFile 
	 *         sec+=Section 
	 *         SecMasMult=nSecMasMult 
	 *         FlpInrMult=nFlpInrMult 
	 *         LagInrMult=nLagInrMult 
	 *         FlpstfMult=nFlpstfMult 
	 *         EdgStfMult=nEdgStfMult 
	 *         TorStfMult=nTorStfMult 
	 *         AxiStfMult=nAxiStfMult 
	 *         CgOffsMult=nCgOffsMult 
	 *         ScOffsMult=nScOffsMult 
	 *         TcOffsMult=nTcOffsMult 
	 *         sec+=Section 
	 *         NSelt=iNSelt 
	 *         sec+=Section 
	 *         ElLoc=aElLoc 
	 *         sec+=Section 
	 *         TwrSupport=iTwrSupport 
	 *         sec+=Section 
	 *         TwrAttach=iTwrAttach 
	 *         TwrWires=aTwrWires 
	 *         NodeAttach=aNodeAttach 
	 *         WireStiff=aWireStiff 
	 *         WireAngle=aWireAngle
	 *     )
	 */
	protected void sequence_ModelBmodesbmi(EObject context, ModelBmodesbmi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=SL_COMMENT
	 */
	protected void sequence_Section(EObject context, Section semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.SECTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.SECTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSectionAccess().getNameSL_COMMENTTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (el_loc+=tNUMBER+ el_loc+=tNUMBER)
	 */
	protected void sequence_aElLoc(EObject context, aElLoc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (el_loc+=INT+ name='node_attach')
	 */
	protected void sequence_aNodeAttach(EObject context, aNodeAttach semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (el_loc+=INT+ name='n_wires')
	 */
	protected void sequence_aTwrWires(EObject context, aTwrWires semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (el_loc+=tNUMBER+ name='th_wire')
	 */
	protected void sequence_aWireAngle(EObject context, aWireAngle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (el_loc+=tNUMBER+ name='wire_stfness')
	 */
	protected void sequence_aWireStiff(EObject context, aWireStiff semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='Echo')
	 */
	protected void sequence_bEcho(EObject context, bEcho semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.BECHO__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.BECHO__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.BECHO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.BECHO__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBEchoAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBEchoAccess().getNameEchoKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='mid_node_tw')
	 */
	protected void sequence_bMidNodeTw(EObject context, bMidNodeTw semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.BMID_NODE_TW__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.BMID_NODE_TW__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.BMID_NODE_TW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.BMID_NODE_TW__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBMidNodeTwAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBMidNodeTwAccess().getNameMid_node_twKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='TabDelim')
	 */
	protected void sequence_bTabDelim(EObject context, bTabDelim semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.BTAB_DELIM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.BTAB_DELIM__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.BTAB_DELIM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.BTAB_DELIM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBTabDelimAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBTabDelimAccess().getNameTabDelimKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='beam_type')
	 */
	protected void sequence_iBeamType(EObject context, iBeamType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.IBEAM_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.IBEAM_TYPE__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.IBEAM_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.IBEAM_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIBeamTypeAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getIBeamTypeAccess().getNameBeam_typeKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='hub_conn')
	 */
	protected void sequence_iHubConn(EObject context, iHubConn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.IHUB_CONN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.IHUB_CONN__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.IHUB_CONN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.IHUB_CONN__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIHubConnAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getIHubConnAccess().getNameHub_connKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='id_mat')
	 */
	protected void sequence_iIdMat(EObject context, iIdMat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.IID_MAT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.IID_MAT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.IID_MAT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.IID_MAT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIIdMatAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getIIdMatAccess().getNameId_matKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='modepr')
	 */
	protected void sequence_iModePr(EObject context, iModePr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.IMODE_PR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.IMODE_PR__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.IMODE_PR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.IMODE_PR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIModePrAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getIModePrAccess().getNameModeprKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='nselt')
	 */
	protected void sequence_iNSelt(EObject context, iNSelt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.IN_SELT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.IN_SELT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.IN_SELT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.IN_SELT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getINSeltAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getINSeltAccess().getNameNseltKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING name='sec_props_file')
	 */
	protected void sequence_iSecFile(EObject context, iSecFile semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.ISEC_FILE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.ISEC_FILE__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.ISEC_FILE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.ISEC_FILE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getISecFileAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getISecFileAccess().getNameSec_props_fileKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='n_attachments')
	 */
	protected void sequence_iTwrAttach(EObject context, iTwrAttach semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.ITWR_ATTACH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.ITWR_ATTACH__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.ITWR_ATTACH__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.ITWR_ATTACH__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getITwrAttachAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getITwrAttachAccess().getNameN_attachmentsKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='tow_support')
	 */
	protected void sequence_iTwrSupport(EObject context, iTwrSupport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.ITWR_SUPPORT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.ITWR_SUPPORT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.ITWR_SUPPORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.ITWR_SUPPORT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getITwrSupportAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getITwrSupportAccess().getNameTow_supportKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='axial_stff_mult')
	 */
	protected void sequence_nAxiStfMult(EObject context, nAxiStfMult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NAXI_STF_MULT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NAXI_STF_MULT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NAXI_STF_MULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NAXI_STF_MULT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNAxiStfMultAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNAxiStfMultAccess().getNameAxial_stff_multKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='bl_thp')
	 */
	protected void sequence_nBlThp(EObject context, nBlThp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NBL_THP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NBL_THP__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NBL_THP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NBL_THP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBlThpAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBlThpAccess().getNameBl_thpKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='cg_offst_mult')
	 */
	protected void sequence_nCgOffsMult(EObject context, nCgOffsMult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NCG_OFFS_MULT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NCG_OFFS_MULT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NCG_OFFS_MULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NCG_OFFS_MULT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNCgOffsMultAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNCgOffsMultAccess().getNameCg_offst_multKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='cm_axial')
	 */
	protected void sequence_nCmAxial(EObject context, nCmAxial semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NCM_AXIAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NCM_AXIAL__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NCM_AXIAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NCM_AXIAL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNCmAxialAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNCmAxialAccess().getNameCm_axialKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='cm_loc')
	 */
	protected void sequence_nCmLoc(EObject context, nCmLoc semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NCM_LOC__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NCM_LOC__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NCM_LOC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NCM_LOC__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNCmLocAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNCmLocAccess().getNameCm_locKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='edge_stff_mult')
	 */
	protected void sequence_nEdgStfMult(EObject context, nEdgStfMult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NEDG_STF_MULT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NEDG_STF_MULT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NEDG_STF_MULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NEDG_STF_MULT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNEdgStfMultAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNEdgStfMultAccess().getNameEdge_stff_multKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='flp_iner_mult')
	 */
	protected void sequence_nFlpInrMult(EObject context, nFlpInrMult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NFLP_INR_MULT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NFLP_INR_MULT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NFLP_INR_MULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NFLP_INR_MULT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNFlpInrMultAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNFlpInrMultAccess().getNameFlp_iner_multKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='flp_stff_mult')
	 */
	protected void sequence_nFlpstfMult(EObject context, nFlpstfMult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NFLPSTF_MULT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NFLPSTF_MULT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NFLPSTF_MULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NFLPSTF_MULT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNFlpstfMultAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNFlpstfMultAccess().getNameFlp_stff_multKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='hub_rad')
	 */
	protected void sequence_nHubRad(EObject context, nHubRad semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NHUB_RAD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NHUB_RAD__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NHUB_RAD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NHUB_RAD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNHubRadAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNHubRadAccess().getNameHub_radKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='ixx_tip')
	 */
	protected void sequence_nIxxTip(EObject context, nIxxTip semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NIXX_TIP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NIXX_TIP__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NIXX_TIP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NIXX_TIP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNIxxTipAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNIxxTipAccess().getNameIxx_tipKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='ixy_tip')
	 */
	protected void sequence_nIxyTip(EObject context, nIxyTip semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NIXY_TIP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NIXY_TIP__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NIXY_TIP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NIXY_TIP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNIxyTipAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNIxyTipAccess().getNameIxy_tipKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='iyy_tip')
	 */
	protected void sequence_nIyyTip(EObject context, nIyyTip semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NIYY_TIP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NIYY_TIP__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NIYY_TIP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NIYY_TIP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNIyyTipAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNIyyTipAccess().getNameIyy_tipKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='iyz_tip')
	 */
	protected void sequence_nIyzTip(EObject context, nIyzTip semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NIYZ_TIP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NIYZ_TIP__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NIYZ_TIP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NIYZ_TIP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNIyzTipAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNIyzTipAccess().getNameIyz_tipKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='izx_tip')
	 */
	protected void sequence_nIzxTip(EObject context, nIzxTip semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NIZX_TIP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NIZX_TIP__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NIZX_TIP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NIZX_TIP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNIzxTipAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNIzxTipAccess().getNameIzx_tipKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='izz_tip')
	 */
	protected void sequence_nIzzTip(EObject context, nIzzTip semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NIZZ_TIP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NIZZ_TIP__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NIZZ_TIP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NIZZ_TIP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNIzzTipAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNIzzTipAccess().getNameIzz_tipKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='lag_iner_mult')
	 */
	protected void sequence_nLagInrMult(EObject context, nLagInrMult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NLAG_INR_MULT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NLAG_INR_MULT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NLAG_INR_MULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NLAG_INR_MULT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNLagInrMultAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNLagInrMultAccess().getNameLag_iner_multKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='precone')
	 */
	protected void sequence_nPrecone(EObject context, nPrecone semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NPRECONE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NPRECONE__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NPRECONE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NPRECONE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNPreconeAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNPreconeAccess().getNamePreconeKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='radius')
	 */
	protected void sequence_nRadius(EObject context, nRadius semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NRADIUS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NRADIUS__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NRADIUS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NRADIUS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNRadiusAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNRadiusAccess().getNameRadiusKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='rot_rpm')
	 */
	protected void sequence_nRotRpm(EObject context, nRotRpm semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NROT_RPM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NROT_RPM__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NROT_RPM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NROT_RPM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNRotRpmAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNRotRpmAccess().getNameRot_rpmKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='rpm_mult')
	 */
	protected void sequence_nRpmMult(EObject context, nRpmMult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NRPM_MULT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NRPM_MULT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NRPM_MULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NRPM_MULT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNRpmMultAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNRpmMultAccess().getNameRpm_multKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='sc_offst_mult')
	 */
	protected void sequence_nScOffsMult(EObject context, nScOffsMult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NSC_OFFS_MULT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NSC_OFFS_MULT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NSC_OFFS_MULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NSC_OFFS_MULT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNScOffsMultAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNScOffsMultAccess().getNameSc_offst_multKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='sec_mass_mult')
	 */
	protected void sequence_nSecMasMult(EObject context, nSecMasMult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NSEC_MAS_MULT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NSEC_MAS_MULT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NSEC_MAS_MULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NSEC_MAS_MULT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNSecMasMultAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNSecMasMultAccess().getNameSec_mass_multKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='tc_offst_mult')
	 */
	protected void sequence_nTcOffsMult(EObject context, nTcOffsMult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NTC_OFFS_MULT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NTC_OFFS_MULT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NTC_OFFS_MULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NTC_OFFS_MULT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTcOffsMultAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTcOffsMultAccess().getNameTc_offst_multKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='tip_mass')
	 */
	protected void sequence_nTipMass(EObject context, nTipMass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NTIP_MASS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NTIP_MASS__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NTIP_MASS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NTIP_MASS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTipMassAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTipMassAccess().getNameTip_massKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='tor_stff_mult')
	 */
	protected void sequence_nTorStfMult(EObject context, nTorStfMult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NTOR_STF_MULT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NTOR_STF_MULT__VALUE));
			if(transientValues.isValueTransient(semanticObject, BmodesbmiPackage.Literals.NTOR_STF_MULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BmodesbmiPackage.Literals.NTOR_STF_MULT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTorStfMultAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTorStfMultAccess().getNameTor_stff_multKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
}
