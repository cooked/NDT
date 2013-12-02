package sc.ndt.editor.fast.serializer;

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
import sc.ndt.editor.fast.fastadn.FastadnPackage;
import sc.ndt.editor.fast.fastadn.Header;
import sc.ndt.editor.fast.fastadn.ModelFastadn;
import sc.ndt.editor.fast.fastadn.aAirStat;
import sc.ndt.editor.fast.fastadn.aAirfoilList;
import sc.ndt.editor.fast.fastadn.bCalcTwrAero;
import sc.ndt.editor.fast.fastadn.bTwrPot;
import sc.ndt.editor.fast.fastadn.bTwrShd;
import sc.ndt.editor.fast.fastadn.fTwrFile;
import sc.ndt.editor.fast.fastadn.fWindFile;
import sc.ndt.editor.fast.fastadn.iBldNodes;
import sc.ndt.editor.fast.fastadn.iNumFoil;
import sc.ndt.editor.fast.fastadn.nAtoler;
import sc.ndt.editor.fast.fastadn.nDTAero;
import sc.ndt.editor.fast.fastadn.nHH;
import sc.ndt.editor.fast.fastadn.nKinVisc;
import sc.ndt.editor.fast.fastadn.nRho;
import sc.ndt.editor.fast.fastadn.nShadHWid;
import sc.ndt.editor.fast.fastadn.nTShadRefPt;
import sc.ndt.editor.fast.fastadn.nTwrShad;
import sc.ndt.editor.fast.fastadn.sHLModel;
import sc.ndt.editor.fast.fastadn.sIndModel;
import sc.ndt.editor.fast.fastadn.sInfModel;
import sc.ndt.editor.fast.fastadn.sStallMod;
import sc.ndt.editor.fast.fastadn.sTLModel;
import sc.ndt.editor.fast.fastadn.sUnits;
import sc.ndt.editor.fast.fastadn.sUseCm;
import sc.ndt.editor.fast.services.FastadnGrammarAccess;

@SuppressWarnings("all")
public class FastadnSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FastadnGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FastadnPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FastadnPackage.HEADER:
				if(context == grammarAccess.getHeaderRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.MODEL_FASTADN:
				if(context == grammarAccess.getModelFastadnRule()) {
					sequence_ModelFastadn(context, (ModelFastadn) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.AAIR_STAT:
				if(context == grammarAccess.getAAirStatRule()) {
					sequence_aAirStat(context, (aAirStat) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.AAIRFOIL_LIST:
				if(context == grammarAccess.getAAirfoilListRule()) {
					sequence_aAirfoilList(context, (aAirfoilList) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.BCALC_TWR_AERO:
				if(context == grammarAccess.getBCalcTwrAeroRule()) {
					sequence_bCalcTwrAero(context, (bCalcTwrAero) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.BTWR_POT:
				if(context == grammarAccess.getBTwrPotRule()) {
					sequence_bTwrPot(context, (bTwrPot) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.BTWR_SHD:
				if(context == grammarAccess.getBTwrShdRule()) {
					sequence_bTwrShd(context, (bTwrShd) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.FTWR_FILE:
				if(context == grammarAccess.getFTwrFileRule()) {
					sequence_fTwrFile(context, (fTwrFile) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.FWIND_FILE:
				if(context == grammarAccess.getFWindFileRule()) {
					sequence_fWindFile(context, (fWindFile) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.IBLD_NODES:
				if(context == grammarAccess.getIBldNodesRule()) {
					sequence_iBldNodes(context, (iBldNodes) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.INUM_FOIL:
				if(context == grammarAccess.getINumFoilRule()) {
					sequence_iNumFoil(context, (iNumFoil) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.NATOLER:
				if(context == grammarAccess.getNAtolerRule()) {
					sequence_nAtoler(context, (nAtoler) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.NDT_AERO:
				if(context == grammarAccess.getNDTAeroRule()) {
					sequence_nDTAero(context, (nDTAero) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.NHH:
				if(context == grammarAccess.getNHHRule()) {
					sequence_nHH(context, (nHH) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.NKIN_VISC:
				if(context == grammarAccess.getNKinViscRule()) {
					sequence_nKinVisc(context, (nKinVisc) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.NRHO:
				if(context == grammarAccess.getNRhoRule()) {
					sequence_nRho(context, (nRho) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.NSHAD_HWID:
				if(context == grammarAccess.getNShadHWidRule()) {
					sequence_nShadHWid(context, (nShadHWid) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.NT_SHAD_REF_PT:
				if(context == grammarAccess.getNTShadRefPtRule()) {
					sequence_nTShadRefPt(context, (nTShadRefPt) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.NTWR_SHAD:
				if(context == grammarAccess.getNTwrShadRule()) {
					sequence_nTwrShad(context, (nTwrShad) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.SHL_MODEL:
				if(context == grammarAccess.getSHLModelRule()) {
					sequence_sHLModel(context, (sHLModel) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.SIND_MODEL:
				if(context == grammarAccess.getSIndModelRule()) {
					sequence_sIndModel(context, (sIndModel) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.SINF_MODEL:
				if(context == grammarAccess.getSInfModelRule()) {
					sequence_sInfModel(context, (sInfModel) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.SSTALL_MOD:
				if(context == grammarAccess.getSStallModRule()) {
					sequence_sStallMod(context, (sStallMod) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.STL_MODEL:
				if(context == grammarAccess.getSTLModelRule()) {
					sequence_sTLModel(context, (sTLModel) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.SUNITS:
				if(context == grammarAccess.getSUnitsRule()) {
					sequence_sUnits(context, (sUnits) semanticObject); 
					return; 
				}
				else break;
			case FastadnPackage.SUSE_CM:
				if(context == grammarAccess.getSUseCmRule()) {
					sequence_sUseCm(context, (sUseCm) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=SL_COMMENT
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.HEADER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.HEADER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderAccess().getNameSL_COMMENTTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         Head=Header 
	 *         SIUnits=sUnits 
	 *         StallMod=sStallMod 
	 *         UseCm=sUseCm 
	 *         InfModel=sInfModel 
	 *         IndModel=sIndModel 
	 *         Atoler=nAtoler 
	 *         TLModel=sTLModel 
	 *         HLModel=sHLModel 
	 *         WindFile=fWindFile 
	 *         HH=nHH 
	 *         TwrShad=nTwrShad 
	 *         ShadHWid=nShadHWid 
	 *         TShadRefPt=nTShadRefPt 
	 *         Rho=nRho 
	 *         KinVisc=nKinVisc 
	 *         DTAero=nDTAero 
	 *         NumFoil=iNumFoil 
	 *         FoilNm=aAirfoilList 
	 *         BldNodes=iBldNodes 
	 *         AirStat=aAirStat
	 *     )
	 */
	protected void sequence_ModelFastadn(EObject context, ModelFastadn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__HEAD));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__SI_UNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__SI_UNITS));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__STALL_MOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__STALL_MOD));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__USE_CM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__USE_CM));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__INF_MODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__INF_MODEL));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__IND_MODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__IND_MODEL));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__ATOLER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__ATOLER));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__TL_MODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__TL_MODEL));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__HL_MODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__HL_MODEL));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__WIND_FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__WIND_FILE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__HH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__HH));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__TWR_SHAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__TWR_SHAD));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__SHAD_HWID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__SHAD_HWID));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__TSHAD_REF_PT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__TSHAD_REF_PT));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__RHO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__RHO));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__KIN_VISC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__KIN_VISC));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__DT_AERO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__DT_AERO));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__NUM_FOIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__NUM_FOIL));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__FOIL_NM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__FOIL_NM));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__BLD_NODES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__BLD_NODES));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__AIR_STAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.MODEL_FASTADN__AIR_STAT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelFastadnAccess().getHeadHeaderParserRuleCall_0_0(), semanticObject.getHead());
		feeder.accept(grammarAccess.getModelFastadnAccess().getSIUnitsSUnitsParserRuleCall_1_0(), semanticObject.getSIUnits());
		feeder.accept(grammarAccess.getModelFastadnAccess().getStallModSStallModParserRuleCall_2_0(), semanticObject.getStallMod());
		feeder.accept(grammarAccess.getModelFastadnAccess().getUseCmSUseCmParserRuleCall_3_0(), semanticObject.getUseCm());
		feeder.accept(grammarAccess.getModelFastadnAccess().getInfModelSInfModelParserRuleCall_4_0(), semanticObject.getInfModel());
		feeder.accept(grammarAccess.getModelFastadnAccess().getIndModelSIndModelParserRuleCall_5_0(), semanticObject.getIndModel());
		feeder.accept(grammarAccess.getModelFastadnAccess().getAtolerNAtolerParserRuleCall_6_0(), semanticObject.getAtoler());
		feeder.accept(grammarAccess.getModelFastadnAccess().getTLModelSTLModelParserRuleCall_7_0(), semanticObject.getTLModel());
		feeder.accept(grammarAccess.getModelFastadnAccess().getHLModelSHLModelParserRuleCall_8_0(), semanticObject.getHLModel());
		feeder.accept(grammarAccess.getModelFastadnAccess().getWindFileFWindFileParserRuleCall_9_0(), semanticObject.getWindFile());
		feeder.accept(grammarAccess.getModelFastadnAccess().getHHNHHParserRuleCall_10_0(), semanticObject.getHH());
		feeder.accept(grammarAccess.getModelFastadnAccess().getTwrShadNTwrShadParserRuleCall_11_0(), semanticObject.getTwrShad());
		feeder.accept(grammarAccess.getModelFastadnAccess().getShadHWidNShadHWidParserRuleCall_12_0_0(), semanticObject.getShadHWid());
		feeder.accept(grammarAccess.getModelFastadnAccess().getTShadRefPtNTShadRefPtParserRuleCall_12_1_0(), semanticObject.getTShadRefPt());
		feeder.accept(grammarAccess.getModelFastadnAccess().getRhoNRhoParserRuleCall_13_0(), semanticObject.getRho());
		feeder.accept(grammarAccess.getModelFastadnAccess().getKinViscNKinViscParserRuleCall_14_0(), semanticObject.getKinVisc());
		feeder.accept(grammarAccess.getModelFastadnAccess().getDTAeroNDTAeroParserRuleCall_15_0(), semanticObject.getDTAero());
		feeder.accept(grammarAccess.getModelFastadnAccess().getNumFoilINumFoilParserRuleCall_16_0(), semanticObject.getNumFoil());
		feeder.accept(grammarAccess.getModelFastadnAccess().getFoilNmAAirfoilListParserRuleCall_17_0(), semanticObject.getFoilNm());
		feeder.accept(grammarAccess.getModelFastadnAccess().getBldNodesIBldNodesParserRuleCall_18_0(), semanticObject.getBldNodes());
		feeder.accept(grammarAccess.getModelFastadnAccess().getAirStatAAirStatParserRuleCall_19_0(), semanticObject.getAirStat());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         rnodes+=tNUMBER 
	 *         aerotwst+=tNUMBER 
	 *         drnodes+=tNUMBER 
	 *         chord+=tNUMBER 
	 *         nfoil+=INT 
	 *         prnelm+=PRINT
	 *     )+
	 */
	protected void sequence_aAirStat(EObject context, aAirStat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value+=STRING name='FoilNm' value+=STRING*)
	 */
	protected void sequence_aAirfoilList(EObject context, aAirfoilList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='CalcTwrAero')
	 */
	protected void sequence_bCalcTwrAero(EObject context, bCalcTwrAero semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.BCALC_TWR_AERO__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.BCALC_TWR_AERO__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.BCALC_TWR_AERO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.BCALC_TWR_AERO__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBCalcTwrAeroAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBCalcTwrAeroAccess().getNameCalcTwrAeroKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='TwrPotent')
	 */
	protected void sequence_bTwrPot(EObject context, bTwrPot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.BTWR_POT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.BTWR_POT__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.BTWR_POT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.BTWR_POT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBTwrPotAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBTwrPotAccess().getNameTwrPotentKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='TwrShadow')
	 */
	protected void sequence_bTwrShd(EObject context, bTwrShd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.BTWR_SHD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.BTWR_SHD__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.BTWR_SHD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.BTWR_SHD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBTwrShdAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBTwrShdAccess().getNameTwrShadowKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING name='TwrFile')
	 */
	protected void sequence_fTwrFile(EObject context, fTwrFile semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.FTWR_FILE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.FTWR_FILE__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.FTWR_FILE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.FTWR_FILE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFTwrFileAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getFTwrFileAccess().getNameTwrFileKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING name='WindFile')
	 */
	protected void sequence_fWindFile(EObject context, fWindFile semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.FWIND_FILE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.FWIND_FILE__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.FWIND_FILE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.FWIND_FILE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFWindFileAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getFWindFileAccess().getNameWindFileKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='BldNodes')
	 */
	protected void sequence_iBldNodes(EObject context, iBldNodes semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.IBLD_NODES__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.IBLD_NODES__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.IBLD_NODES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.IBLD_NODES__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIBldNodesAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getIBldNodesAccess().getNameBldNodesKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='NumFoil')
	 */
	protected void sequence_iNumFoil(EObject context, iNumFoil semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.INUM_FOIL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.INUM_FOIL__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.INUM_FOIL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.INUM_FOIL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getINumFoilAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getINumFoilAccess().getNameNumFoilKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER (name='Atoler' | name='AToler'))
	 */
	protected void sequence_nAtoler(EObject context, nAtoler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='DTAero')
	 */
	protected void sequence_nDTAero(EObject context, nDTAero semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.NDT_AERO__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.NDT_AERO__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.NDT_AERO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.NDT_AERO__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNDTAeroAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNDTAeroAccess().getNameDTAeroKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='HH')
	 */
	protected void sequence_nHH(EObject context, nHH semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.NHH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.NHH__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.NHH__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.NHH__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNHHAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNHHAccess().getNameHHKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='KinVisc')
	 */
	protected void sequence_nKinVisc(EObject context, nKinVisc semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.NKIN_VISC__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.NKIN_VISC__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.NKIN_VISC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.NKIN_VISC__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNKinViscAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNKinViscAccess().getNameKinViscKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER (name='Rho' | name='AirDens'))
	 */
	protected void sequence_nRho(EObject context, nRho semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='ShadHWid')
	 */
	protected void sequence_nShadHWid(EObject context, nShadHWid semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.NSHAD_HWID__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.NSHAD_HWID__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.NSHAD_HWID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.NSHAD_HWID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNShadHWidAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNShadHWidAccess().getNameShadHWidKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='T_Shad_Refpt')
	 */
	protected void sequence_nTShadRefPt(EObject context, nTShadRefPt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.NT_SHAD_REF_PT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.NT_SHAD_REF_PT__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.NT_SHAD_REF_PT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.NT_SHAD_REF_PT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTShadRefPtAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTShadRefPtAccess().getNameT_Shad_RefptKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwrShad')
	 */
	protected void sequence_nTwrShad(EObject context, nTwrShad semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.NTWR_SHAD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.NTWR_SHAD__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.NTWR_SHAD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.NTWR_SHAD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwrShadAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwrShadAccess().getNameTwrShadKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=PRANDTL name='HLModel')
	 */
	protected void sequence_sHLModel(EObject context, sHLModel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.SHL_MODEL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.SHL_MODEL__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.SHL_MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.SHL_MODEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSHLModelAccess().getValuePRANDTLTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSHLModelAccess().getNameHLModelKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INDMODEL name='IndModel')
	 */
	protected void sequence_sIndModel(EObject context, sIndModel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.SIND_MODEL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.SIND_MODEL__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.SIND_MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.SIND_MODEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSIndModelAccess().getValueINDMODELTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSIndModelAccess().getNameIndModelKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INFMODEL name='InfModel')
	 */
	protected void sequence_sInfModel(EObject context, sInfModel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.SINF_MODEL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.SINF_MODEL__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.SINF_MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.SINF_MODEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSInfModelAccess().getValueINFMODELTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSInfModelAccess().getNameInfModelKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=STALL name='StallMod')
	 */
	protected void sequence_sStallMod(EObject context, sStallMod semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.SSTALL_MOD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.SSTALL_MOD__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.SSTALL_MOD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.SSTALL_MOD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSStallModAccess().getValueSTALLTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSStallModAccess().getNameStallModKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=PRANDTL name='TLModel')
	 */
	protected void sequence_sTLModel(EObject context, sTLModel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.STL_MODEL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.STL_MODEL__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.STL_MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.STL_MODEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSTLModelAccess().getValuePRANDTLTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSTLModelAccess().getNameTLModelKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=UNITS name='SysUnits')
	 */
	protected void sequence_sUnits(EObject context, sUnits semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.SUNITS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.SUNITS__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.SUNITS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.SUNITS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSUnitsAccess().getValueUNITSTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSUnitsAccess().getNameSysUnitsKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=CM name='UseCm')
	 */
	protected void sequence_sUseCm(EObject context, sUseCm semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.SUSE_CM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.SUSE_CM__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastadnPackage.Literals.SUSE_CM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastadnPackage.Literals.SUSE_CM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSUseCmAccess().getValueCMTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSUseCmAccess().getNameUseCmKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
}
