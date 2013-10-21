package sc.ndt.editor.serializer;

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
import sc.ndt.editor.services.TurbsimtbsGrammarAccess;
import sc.ndt.editor.turbsimtbs.Header;
import sc.ndt.editor.turbsimtbs.ModelTurbsimtbs;
import sc.ndt.editor.turbsimtbs.Section;
import sc.ndt.editor.turbsimtbs.TurbsimtbsPackage;
import sc.ndt.editor.turbsimtbs.bClockwise;
import sc.ndt.editor.turbsimtbs.bRandomize;
import sc.ndt.editor.turbsimtbs.bWrACT;
import sc.ndt.editor.turbsimtbs.bWrADFF;
import sc.ndt.editor.turbsimtbs.bWrADHH;
import sc.ndt.editor.turbsimtbs.bWrADTWR;
import sc.ndt.editor.turbsimtbs.bWrBHHTP;
import sc.ndt.editor.turbsimtbs.bWrBLFF;
import sc.ndt.editor.turbsimtbs.bWrFHHTP;
import sc.ndt.editor.turbsimtbs.bWrFMTFF;
import sc.ndt.editor.turbsimtbs.iNumGrid_Y;
import sc.ndt.editor.turbsimtbs.iNumGrid_Z;
import sc.ndt.editor.turbsimtbs.iScaleIEC;
import sc.ndt.editor.turbsimtbs.nAnalysisTime;
import sc.ndt.editor.turbsimtbs.nCTLy;
import sc.ndt.editor.turbsimtbs.nCTLz;
import sc.ndt.editor.turbsimtbs.nCTStartTime;
import sc.ndt.editor.turbsimtbs.nCohExp;
import sc.ndt.editor.turbsimtbs.nDistScl;
import sc.ndt.editor.turbsimtbs.nGridHeight;
import sc.ndt.editor.turbsimtbs.nGridWidth;
import sc.ndt.editor.turbsimtbs.nHFlowAng;
import sc.ndt.editor.turbsimtbs.nHubHt;
import sc.ndt.editor.turbsimtbs.nIncDec1;
import sc.ndt.editor.turbsimtbs.nIncDec2;
import sc.ndt.editor.turbsimtbs.nIncDec3;
import sc.ndt.editor.turbsimtbs.nLocation;
import sc.ndt.editor.turbsimtbs.nPC_UV;
import sc.ndt.editor.turbsimtbs.nPC_UW;
import sc.ndt.editor.turbsimtbs.nPC_VW;
import sc.ndt.editor.turbsimtbs.nPLExp;
import sc.ndt.editor.turbsimtbs.nRICH_NO;
import sc.ndt.editor.turbsimtbs.nRandSeed1;
import sc.ndt.editor.turbsimtbs.nRandSeed2;
import sc.ndt.editor.turbsimtbs.nRefHt;
import sc.ndt.editor.turbsimtbs.nTimeStep;
import sc.ndt.editor.turbsimtbs.nUStar;
import sc.ndt.editor.turbsimtbs.nUref;
import sc.ndt.editor.turbsimtbs.nUsableTime;
import sc.ndt.editor.turbsimtbs.nVFlowAng;
import sc.ndt.editor.turbsimtbs.nZ0;
import sc.ndt.editor.turbsimtbs.nZI;
import sc.ndt.editor.turbsimtbs.nZJetMax;
import sc.ndt.editor.turbsimtbs.sCTEventFile;
import sc.ndt.editor.turbsimtbs.sCTEventPath;
import sc.ndt.editor.turbsimtbs.sETMc;
import sc.ndt.editor.turbsimtbs.sIEC_WindType;
import sc.ndt.editor.turbsimtbs.sIECstandard;
import sc.ndt.editor.turbsimtbs.sIECturbc;
import sc.ndt.editor.turbsimtbs.sTurbModel;
import sc.ndt.editor.turbsimtbs.sWindProfileType;

@SuppressWarnings("all")
public class TurbsimtbsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TurbsimtbsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TurbsimtbsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TurbsimtbsPackage.HEADER:
				if(context == grammarAccess.getHeaderRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.MODEL_TURBSIMTBS:
				if(context == grammarAccess.getModelTurbsimtbsRule()) {
					sequence_ModelTurbsimtbs(context, (ModelTurbsimtbs) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.SECTION:
				if(context == grammarAccess.getSectionRule()) {
					sequence_Section(context, (Section) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.BCLOCKWISE:
				if(context == grammarAccess.getBClockwiseRule()) {
					sequence_bClockwise(context, (bClockwise) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.BRANDOMIZE:
				if(context == grammarAccess.getBRandomizeRule()) {
					sequence_bRandomize(context, (bRandomize) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.BWR_ACT:
				if(context == grammarAccess.getBWrACTRule()) {
					sequence_bWrACT(context, (bWrACT) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.BWR_ADFF:
				if(context == grammarAccess.getBWrADFFRule()) {
					sequence_bWrADFF(context, (bWrADFF) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.BWR_ADHH:
				if(context == grammarAccess.getBWrADHHRule()) {
					sequence_bWrADHH(context, (bWrADHH) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.BWR_ADTWR:
				if(context == grammarAccess.getBWrADTWRRule()) {
					sequence_bWrADTWR(context, (bWrADTWR) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.BWR_BHHTP:
				if(context == grammarAccess.getBWrBHHTPRule()) {
					sequence_bWrBHHTP(context, (bWrBHHTP) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.BWR_BLFF:
				if(context == grammarAccess.getBWrBLFFRule()) {
					sequence_bWrBLFF(context, (bWrBLFF) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.BWR_FHHTP:
				if(context == grammarAccess.getBWrFHHTPRule()) {
					sequence_bWrFHHTP(context, (bWrFHHTP) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.BWR_FMTFF:
				if(context == grammarAccess.getBWrFMTFFRule()) {
					sequence_bWrFMTFF(context, (bWrFMTFF) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.INUM_GRID_Y:
				if(context == grammarAccess.getINumGrid_YRule()) {
					sequence_iNumGrid_Y(context, (iNumGrid_Y) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.INUM_GRID_Z:
				if(context == grammarAccess.getINumGrid_ZRule()) {
					sequence_iNumGrid_Z(context, (iNumGrid_Z) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.ISCALE_IEC:
				if(context == grammarAccess.getIScaleIECRule()) {
					sequence_iScaleIEC(context, (iScaleIEC) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NANALYSIS_TIME:
				if(context == grammarAccess.getNAnalysisTimeRule()) {
					sequence_nAnalysisTime(context, (nAnalysisTime) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NCT_LY:
				if(context == grammarAccess.getNCTLyRule()) {
					sequence_nCTLy(context, (nCTLy) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NCT_LZ:
				if(context == grammarAccess.getNCTLzRule()) {
					sequence_nCTLz(context, (nCTLz) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NCT_START_TIME:
				if(context == grammarAccess.getNCTStartTimeRule()) {
					sequence_nCTStartTime(context, (nCTStartTime) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NCOH_EXP:
				if(context == grammarAccess.getNCohExpRule()) {
					sequence_nCohExp(context, (nCohExp) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NDIST_SCL:
				if(context == grammarAccess.getNDistSclRule()) {
					sequence_nDistScl(context, (nDistScl) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NGRID_HEIGHT:
				if(context == grammarAccess.getNGridHeightRule()) {
					sequence_nGridHeight(context, (nGridHeight) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NGRID_WIDTH:
				if(context == grammarAccess.getNGridWidthRule()) {
					sequence_nGridWidth(context, (nGridWidth) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NH_FLOW_ANG:
				if(context == grammarAccess.getNHFlowAngRule()) {
					sequence_nHFlowAng(context, (nHFlowAng) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NHUB_HT:
				if(context == grammarAccess.getNHubHtRule()) {
					sequence_nHubHt(context, (nHubHt) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NINC_DEC1:
				if(context == grammarAccess.getNIncDec1Rule()) {
					sequence_nIncDec1(context, (nIncDec1) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NINC_DEC2:
				if(context == grammarAccess.getNIncDec2Rule()) {
					sequence_nIncDec2(context, (nIncDec2) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NINC_DEC3:
				if(context == grammarAccess.getNIncDec3Rule()) {
					sequence_nIncDec3(context, (nIncDec3) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NLOCATION:
				if(context == grammarAccess.getNLocationRule()) {
					sequence_nLocation(context, (nLocation) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NPC_UV:
				if(context == grammarAccess.getNPC_UVRule()) {
					sequence_nPC_UV(context, (nPC_UV) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NPC_UW:
				if(context == grammarAccess.getNPC_UWRule()) {
					sequence_nPC_UW(context, (nPC_UW) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NPC_VW:
				if(context == grammarAccess.getNPC_VWRule()) {
					sequence_nPC_VW(context, (nPC_VW) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NPL_EXP:
				if(context == grammarAccess.getNPLExpRule()) {
					sequence_nPLExp(context, (nPLExp) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NRICH_NO:
				if(context == grammarAccess.getNRICH_NORule()) {
					sequence_nRICH_NO(context, (nRICH_NO) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NRAND_SEED1:
				if(context == grammarAccess.getNRandSeed1Rule()) {
					sequence_nRandSeed1(context, (nRandSeed1) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NRAND_SEED2:
				if(context == grammarAccess.getNRandSeed2Rule()) {
					sequence_nRandSeed2(context, (nRandSeed2) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NREF_HT:
				if(context == grammarAccess.getNRefHtRule()) {
					sequence_nRefHt(context, (nRefHt) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NTIME_STEP:
				if(context == grammarAccess.getNTimeStepRule()) {
					sequence_nTimeStep(context, (nTimeStep) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NU_STAR:
				if(context == grammarAccess.getNUStarRule()) {
					sequence_nUStar(context, (nUStar) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NUREF:
				if(context == grammarAccess.getNUrefRule()) {
					sequence_nUref(context, (nUref) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NUSABLE_TIME:
				if(context == grammarAccess.getNUsableTimeRule()) {
					sequence_nUsableTime(context, (nUsableTime) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NV_FLOW_ANG:
				if(context == grammarAccess.getNVFlowAngRule()) {
					sequence_nVFlowAng(context, (nVFlowAng) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NZ0:
				if(context == grammarAccess.getNZ0Rule()) {
					sequence_nZ0(context, (nZ0) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NZI:
				if(context == grammarAccess.getNZIRule()) {
					sequence_nZI(context, (nZI) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.NZ_JET_MAX:
				if(context == grammarAccess.getNZJetMaxRule()) {
					sequence_nZJetMax(context, (nZJetMax) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.SCT_EVENT_FILE:
				if(context == grammarAccess.getSCTEventFileRule()) {
					sequence_sCTEventFile(context, (sCTEventFile) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.SCT_EVENT_PATH:
				if(context == grammarAccess.getSCTEventPathRule()) {
					sequence_sCTEventPath(context, (sCTEventPath) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.SET_MC:
				if(context == grammarAccess.getSETMcRule()) {
					sequence_sETMc(context, (sETMc) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.SIEC_WIND_TYPE:
				if(context == grammarAccess.getSIEC_WindTypeRule()) {
					sequence_sIEC_WindType(context, (sIEC_WindType) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.SIE_CSTANDARD:
				if(context == grammarAccess.getSIECstandardRule()) {
					sequence_sIECstandard(context, (sIECstandard) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.SIE_CTURBC:
				if(context == grammarAccess.getSIECturbcRule()) {
					sequence_sIECturbc(context, (sIECturbc) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.STURB_MODEL:
				if(context == grammarAccess.getSTurbModelRule()) {
					sequence_sTurbModel(context, (sTurbModel) semanticObject); 
					return; 
				}
				else break;
			case TurbsimtbsPackage.SWIND_PROFILE_TYPE:
				if(context == grammarAccess.getSWindProfileTypeRule()) {
					sequence_sWindProfileType(context, (sWindProfileType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     rows=SL_COMMENT
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.HEADER__ROWS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.HEADER__ROWS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderAccess().getRowsSL_COMMENTTerminalRuleCall_0_0(), semanticObject.getRows());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         Head=Header 
	 *         sections+=Section 
	 *         RandSeed1=nRandSeed1 
	 *         RandSeed2=nRandSeed2 
	 *         WrBHHTP=bWrBHHTP 
	 *         WrFHHTP=bWrFHHTP 
	 *         WrADHH=bWrADHH 
	 *         WrADFF=bWrADFF 
	 *         WrBLFF=bWrBLFF 
	 *         WrADTWR=bWrADTWR 
	 *         WrFMTFF=bWrFMTFF 
	 *         WrACT=bWrACT 
	 *         Clockwise=bClockwise 
	 *         ScaleIEC=iScaleIEC 
	 *         sections+=Section 
	 *         NumGrid_Z=iNumGrid_Z 
	 *         NumGrid_Y=iNumGrid_Y 
	 *         TimeStep=nTimeStep 
	 *         AnalysisTime=nAnalysisTime 
	 *         UsableTime=nUsableTime 
	 *         HubHt=nHubHt 
	 *         GridHeight=nGridHeight 
	 *         GridWidth=nGridWidth 
	 *         VFlowAng=nVFlowAng 
	 *         HFlowAng=nHFlowAng 
	 *         sections+=Section 
	 *         TurbModel=sTurbModel 
	 *         IECstandard=sIECstandard 
	 *         IECturbc=sIECturbc 
	 *         IEC_WindType=sIEC_WindType 
	 *         ETMc=sETMc 
	 *         WindProfileType=sWindProfileType 
	 *         RefHt=nRefHt 
	 *         Uref=nUref 
	 *         ZJetMax=nZJetMax 
	 *         PLExp=nPLExp 
	 *         Z0=nZ0 
	 *         sections+=Section 
	 *         Location=nLocation 
	 *         RICH_NO=nRICH_NO 
	 *         UStar=nUStar 
	 *         ZI=nZI 
	 *         PC_UW=nPC_UW 
	 *         PC_UV=nPC_UV 
	 *         PC_VW=nPC_VW 
	 *         IncDec1=nIncDec1 
	 *         IncDec2=nIncDec2 
	 *         IncDec3=nIncDec3 
	 *         CohExp=nCohExp 
	 *         sections+=Section 
	 *         CTEventPath=sCTEventPath 
	 *         CTEventFile=sCTEventFile 
	 *         Randomize=bRandomize 
	 *         DistScl=nDistScl 
	 *         CTLy=nCTLy 
	 *         CTLz=nCTLz 
	 *         CTStartTime=nCTStartTime
	 *     )
	 */
	protected void sequence_ModelTurbsimtbs(EObject context, ModelTurbsimtbs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=SL_COMMENT
	 */
	protected void sequence_Section(EObject context, Section semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SECTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SECTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSectionAccess().getNameSL_COMMENTTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='Clockwise')
	 */
	protected void sequence_bClockwise(EObject context, bClockwise semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BCLOCKWISE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BCLOCKWISE__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BCLOCKWISE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BCLOCKWISE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBClockwiseAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBClockwiseAccess().getNameClockwiseKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='Randomize')
	 */
	protected void sequence_bRandomize(EObject context, bRandomize semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BRANDOMIZE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BRANDOMIZE__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BRANDOMIZE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BRANDOMIZE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBRandomizeAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBRandomizeAccess().getNameRandomizeKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='WrACT')
	 */
	protected void sequence_bWrACT(EObject context, bWrACT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_ACT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_ACT__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_ACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_ACT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBWrACTAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBWrACTAccess().getNameWrACTKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='WrADFF')
	 */
	protected void sequence_bWrADFF(EObject context, bWrADFF semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_ADFF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_ADFF__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_ADFF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_ADFF__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBWrADFFAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBWrADFFAccess().getNameWrADFFKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='WrADHH')
	 */
	protected void sequence_bWrADHH(EObject context, bWrADHH semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_ADHH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_ADHH__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_ADHH__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_ADHH__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBWrADHHAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBWrADHHAccess().getNameWrADHHKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='WrADTWR')
	 */
	protected void sequence_bWrADTWR(EObject context, bWrADTWR semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_ADTWR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_ADTWR__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_ADTWR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_ADTWR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBWrADTWRAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBWrADTWRAccess().getNameWrADTWRKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='WrBHHTP')
	 */
	protected void sequence_bWrBHHTP(EObject context, bWrBHHTP semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_BHHTP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_BHHTP__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_BHHTP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_BHHTP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBWrBHHTPAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBWrBHHTPAccess().getNameWrBHHTPKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='WrBLFF')
	 */
	protected void sequence_bWrBLFF(EObject context, bWrBLFF semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_BLFF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_BLFF__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_BLFF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_BLFF__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBWrBLFFAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBWrBLFFAccess().getNameWrBLFFKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='WrFHHTP')
	 */
	protected void sequence_bWrFHHTP(EObject context, bWrFHHTP semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_FHHTP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_FHHTP__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_FHHTP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_FHHTP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBWrFHHTPAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBWrFHHTPAccess().getNameWrFHHTPKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='WrFMTFF')
	 */
	protected void sequence_bWrFMTFF(EObject context, bWrFMTFF semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_FMTFF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_FMTFF__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.BWR_FMTFF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.BWR_FMTFF__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBWrFMTFFAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBWrFMTFFAccess().getNameWrFMTFFKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='NumGrid_Y')
	 */
	protected void sequence_iNumGrid_Y(EObject context, iNumGrid_Y semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.INUM_GRID_Y__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.INUM_GRID_Y__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.INUM_GRID_Y__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.INUM_GRID_Y__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getINumGrid_YAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getINumGrid_YAccess().getNameNumGrid_YKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='NumGrid_Z')
	 */
	protected void sequence_iNumGrid_Z(EObject context, iNumGrid_Z semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.INUM_GRID_Z__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.INUM_GRID_Z__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.INUM_GRID_Z__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.INUM_GRID_Z__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getINumGrid_ZAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getINumGrid_ZAccess().getNameNumGrid_ZKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='ScaleIEC')
	 */
	protected void sequence_iScaleIEC(EObject context, iScaleIEC semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.ISCALE_IEC__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.ISCALE_IEC__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.ISCALE_IEC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.ISCALE_IEC__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIScaleIECAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getIScaleIECAccess().getNameScaleIECKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='AnalysisTime')
	 */
	protected void sequence_nAnalysisTime(EObject context, nAnalysisTime semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NANALYSIS_TIME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NANALYSIS_TIME__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NANALYSIS_TIME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NANALYSIS_TIME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNAnalysisTimeAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNAnalysisTimeAccess().getNameAnalysisTimeKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='CTLy')
	 */
	protected void sequence_nCTLy(EObject context, nCTLy semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NCT_LY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NCT_LY__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NCT_LY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NCT_LY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNCTLyAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNCTLyAccess().getNameCTLyKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='CTLz')
	 */
	protected void sequence_nCTLz(EObject context, nCTLz semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NCT_LZ__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NCT_LZ__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NCT_LZ__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NCT_LZ__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNCTLzAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNCTLzAccess().getNameCTLzKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='CTStartTime')
	 */
	protected void sequence_nCTStartTime(EObject context, nCTStartTime semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NCT_START_TIME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NCT_START_TIME__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NCT_START_TIME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NCT_START_TIME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNCTStartTimeAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNCTStartTimeAccess().getNameCTStartTimeKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='CohExp')
	 */
	protected void sequence_nCohExp(EObject context, nCohExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NCOH_EXP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NCOH_EXP__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NCOH_EXP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NCOH_EXP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNCohExpAccess().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNCohExpAccess().getNameCohExpKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='DistScl')
	 */
	protected void sequence_nDistScl(EObject context, nDistScl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NDIST_SCL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NDIST_SCL__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NDIST_SCL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NDIST_SCL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNDistSclAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNDistSclAccess().getNameDistSclKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='GridHeight')
	 */
	protected void sequence_nGridHeight(EObject context, nGridHeight semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NGRID_HEIGHT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NGRID_HEIGHT__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NGRID_HEIGHT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NGRID_HEIGHT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNGridHeightAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNGridHeightAccess().getNameGridHeightKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='GridWidth')
	 */
	protected void sequence_nGridWidth(EObject context, nGridWidth semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NGRID_WIDTH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NGRID_WIDTH__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NGRID_WIDTH__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NGRID_WIDTH__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNGridWidthAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNGridWidthAccess().getNameGridWidthKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='HFlowAng')
	 */
	protected void sequence_nHFlowAng(EObject context, nHFlowAng semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NH_FLOW_ANG__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NH_FLOW_ANG__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NH_FLOW_ANG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NH_FLOW_ANG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNHFlowAngAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNHFlowAngAccess().getNameHFlowAngKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='HubHt')
	 */
	protected void sequence_nHubHt(EObject context, nHubHt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NHUB_HT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NHUB_HT__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NHUB_HT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NHUB_HT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNHubHtAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNHubHtAccess().getNameHubHtKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='IncDec(1)')
	 */
	protected void sequence_nIncDec1(EObject context, nIncDec1 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NINC_DEC1__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NINC_DEC1__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NINC_DEC1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NINC_DEC1__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNIncDec1Access().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNIncDec1Access().getNameIncDec1Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='IncDec(2)')
	 */
	protected void sequence_nIncDec2(EObject context, nIncDec2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NINC_DEC2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NINC_DEC2__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NINC_DEC2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NINC_DEC2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNIncDec2Access().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNIncDec2Access().getNameIncDec2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='IncDec(3)')
	 */
	protected void sequence_nIncDec3(EObject context, nIncDec3 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NINC_DEC3__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NINC_DEC3__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NINC_DEC3__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NINC_DEC3__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNIncDec3Access().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNIncDec3Access().getNameIncDec3Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='Latitude')
	 */
	protected void sequence_nLocation(EObject context, nLocation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NLOCATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NLOCATION__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NLOCATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NLOCATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNLocationAccess().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNLocationAccess().getNameLatitudeKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='PC_UV')
	 */
	protected void sequence_nPC_UV(EObject context, nPC_UV semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NPC_UV__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NPC_UV__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NPC_UV__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NPC_UV__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNPC_UVAccess().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNPC_UVAccess().getNamePC_UVKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='PC_UW')
	 */
	protected void sequence_nPC_UW(EObject context, nPC_UW semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NPC_UW__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NPC_UW__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NPC_UW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NPC_UW__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNPC_UWAccess().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNPC_UWAccess().getNamePC_UWKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='PC_VW')
	 */
	protected void sequence_nPC_VW(EObject context, nPC_VW semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NPC_VW__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NPC_VW__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NPC_VW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NPC_VW__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNPC_VWAccess().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNPC_VWAccess().getNamePC_VWKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='PLExp')
	 */
	protected void sequence_nPLExp(EObject context, nPLExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NPL_EXP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NPL_EXP__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NPL_EXP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NPL_EXP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNPLExpAccess().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNPLExpAccess().getNamePLExpKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='RICH_NO')
	 */
	protected void sequence_nRICH_NO(EObject context, nRICH_NO semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NRICH_NO__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NRICH_NO__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NRICH_NO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NRICH_NO__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNRICH_NOAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNRICH_NOAccess().getNameRICH_NOKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tSEED1 name='RandSeed(1)')
	 */
	protected void sequence_nRandSeed1(EObject context, nRandSeed1 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NRAND_SEED1__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NRAND_SEED1__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NRAND_SEED1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NRAND_SEED1__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNRandSeed1Access().getValueTSEED1ParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNRandSeed1Access().getNameRandSeed1Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tSEED2 name='RandSeed(2)')
	 */
	protected void sequence_nRandSeed2(EObject context, nRandSeed2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NRAND_SEED2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NRAND_SEED2__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NRAND_SEED2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NRAND_SEED2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNRandSeed2Access().getValueTSEED2ParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNRandSeed2Access().getNameRandSeed2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='RefHt')
	 */
	protected void sequence_nRefHt(EObject context, nRefHt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NREF_HT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NREF_HT__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NREF_HT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NREF_HT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNRefHtAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNRefHtAccess().getNameRefHtKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TimeStep')
	 */
	protected void sequence_nTimeStep(EObject context, nTimeStep semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NTIME_STEP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NTIME_STEP__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NTIME_STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NTIME_STEP__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTimeStepAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTimeStepAccess().getNameTimeStepKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='UStar')
	 */
	protected void sequence_nUStar(EObject context, nUStar semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NU_STAR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NU_STAR__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NU_STAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NU_STAR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNUStarAccess().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNUStarAccess().getNameUStarKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='Uref')
	 */
	protected void sequence_nUref(EObject context, nUref semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NUREF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NUREF__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NUREF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NUREF__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNUrefAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNUrefAccess().getNameUrefKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='UsableTime')
	 */
	protected void sequence_nUsableTime(EObject context, nUsableTime semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NUSABLE_TIME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NUSABLE_TIME__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NUSABLE_TIME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NUSABLE_TIME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNUsableTimeAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNUsableTimeAccess().getNameUsableTimeKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='VFlowAng')
	 */
	protected void sequence_nVFlowAng(EObject context, nVFlowAng semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NV_FLOW_ANG__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NV_FLOW_ANG__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NV_FLOW_ANG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NV_FLOW_ANG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNVFlowAngAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNVFlowAngAccess().getNameVFlowAngKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='Z0')
	 */
	protected void sequence_nZ0(EObject context, nZ0 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NZ0__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NZ0__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NZ0__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NZ0__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNZ0Access().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNZ0Access().getNameZ0Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='ZI')
	 */
	protected void sequence_nZI(EObject context, nZI semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NZI__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NZI__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NZI__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NZI__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNZIAccess().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNZIAccess().getNameZIKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='ZJetMax')
	 */
	protected void sequence_nZJetMax(EObject context, nZJetMax semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NZ_JET_MAX__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NZ_JET_MAX__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.NZ_JET_MAX__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.NZ_JET_MAX__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNZJetMaxAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNZJetMaxAccess().getNameZJetMaxKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((value='LES' | value='DNS' | value='RANDOM') name='CTEventFile')
	 */
	protected void sequence_sCTEventFile(EObject context, sCTEventFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING name='CTEventPath')
	 */
	protected void sequence_sCTEventPath(EObject context, sCTEventPath semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SCT_EVENT_PATH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SCT_EVENT_PATH__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SCT_EVENT_PATH__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SCT_EVENT_PATH__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSCTEventPathAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSCTEventPathAccess().getNameCTEventPathKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUM name='ETMc')
	 */
	protected void sequence_sETMc(EObject context, sETMc semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SET_MC__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SET_MC__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SET_MC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SET_MC__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSETMcAccess().getValueTNUMParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSETMcAccess().getNameETMcKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=WIND name='IEC_WindType')
	 */
	protected void sequence_sIEC_WindType(EObject context, sIEC_WindType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SIEC_WIND_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SIEC_WIND_TYPE__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SIEC_WIND_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SIEC_WIND_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSIEC_WindTypeAccess().getValueWINDTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSIEC_WindTypeAccess().getNameIEC_WindTypeKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=IEC name='IECstandard')
	 */
	protected void sequence_sIECstandard(EObject context, sIECstandard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SIE_CSTANDARD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SIE_CSTANDARD__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SIE_CSTANDARD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SIE_CSTANDARD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSIECstandardAccess().getValueIECTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSIECstandardAccess().getNameIECstandardKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=TURB name='IECturbc')
	 */
	protected void sequence_sIECturbc(EObject context, sIECturbc semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SIE_CTURBC__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SIE_CTURBC__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SIE_CTURBC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SIE_CTURBC__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSIECturbcAccess().getValueTURBTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSIECturbcAccess().getNameIECturbcKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=MODEL name='TurbModel')
	 */
	protected void sequence_sTurbModel(EObject context, sTurbModel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.STURB_MODEL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.STURB_MODEL__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.STURB_MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.STURB_MODEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSTurbModelAccess().getValueMODELTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSTurbModelAccess().getNameTurbModelKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=PROF name='WindProfileType')
	 */
	protected void sequence_sWindProfileType(EObject context, sWindProfileType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SWIND_PROFILE_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SWIND_PROFILE_TYPE__VALUE));
			if(transientValues.isValueTransient(semanticObject, TurbsimtbsPackage.Literals.SWIND_PROFILE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurbsimtbsPackage.Literals.SWIND_PROFILE_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSWindProfileTypeAccess().getValuePROFTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSWindProfileTypeAccess().getNameWindProfileTypeKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
}
