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
import sc.ndt.editor.fast.fasttwr.AdjFASt;
import sc.ndt.editor.fast.fasttwr.AdjSSSt;
import sc.ndt.editor.fast.fasttwr.AdjTwMa;
import sc.ndt.editor.fast.fasttwr.FasttwrPackage;
import sc.ndt.editor.fast.fasttwr.Header;
import sc.ndt.editor.fast.fasttwr.ModelFasttwr;
import sc.ndt.editor.fast.fasttwr.Section;
import sc.ndt.editor.fast.fasttwr.aTwrStat;
import sc.ndt.editor.fast.fasttwr.bCalcTMode;
import sc.ndt.editor.fast.fasttwr.nFAStTunr1;
import sc.ndt.editor.fast.fasttwr.nFAStTunr2;
import sc.ndt.editor.fast.fasttwr.nNTwInpSt;
import sc.ndt.editor.fast.fasttwr.nSSStTunr1;
import sc.ndt.editor.fast.fasttwr.nSSStTunr2;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh2;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh3;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh4;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh5;
import sc.ndt.editor.fast.fasttwr.nTwFAM1Sh6;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh2;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh3;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh4;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh5;
import sc.ndt.editor.fast.fasttwr.nTwFAM2Sh6;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh2;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh3;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh4;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh5;
import sc.ndt.editor.fast.fasttwr.nTwSSM1Sh6;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh2;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh3;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh4;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh5;
import sc.ndt.editor.fast.fasttwr.nTwSSM2Sh6;
import sc.ndt.editor.fast.fasttwr.nTwrFADmp1;
import sc.ndt.editor.fast.fasttwr.nTwrFADmp2;
import sc.ndt.editor.fast.fasttwr.nTwrSSDmp1;
import sc.ndt.editor.fast.fasttwr.nTwrSSDmp2;
import sc.ndt.editor.fast.services.FasttwrGrammarAccess;

@SuppressWarnings("all")
public class FasttwrSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FasttwrGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FasttwrPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FasttwrPackage.ADJ_FA_ST:
				if(context == grammarAccess.getAdjFAStRule()) {
					sequence_AdjFASt(context, (AdjFASt) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.ADJ_SS_ST:
				if(context == grammarAccess.getAdjSSStRule()) {
					sequence_AdjSSSt(context, (AdjSSSt) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.ADJ_TW_MA:
				if(context == grammarAccess.getAdjTwMaRule()) {
					sequence_AdjTwMa(context, (AdjTwMa) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.HEADER:
				if(context == grammarAccess.getHeaderRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.MODEL_FASTTWR:
				if(context == grammarAccess.getModelFasttwrRule()) {
					sequence_ModelFasttwr(context, (ModelFasttwr) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.SECTION:
				if(context == grammarAccess.getSectionRule()) {
					sequence_Section(context, (Section) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.ATWR_STAT:
				if(context == grammarAccess.getATwrStatRule()) {
					sequence_aTwrStat(context, (aTwrStat) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.BCALC_TMODE:
				if(context == grammarAccess.getBCalcTModeRule()) {
					sequence_bCalcTMode(context, (bCalcTMode) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NFA_ST_TUNR1:
				if(context == grammarAccess.getNFAStTunr1Rule()) {
					sequence_nFAStTunr1(context, (nFAStTunr1) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NFA_ST_TUNR2:
				if(context == grammarAccess.getNFAStTunr2Rule()) {
					sequence_nFAStTunr2(context, (nFAStTunr2) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NN_TW_INP_ST:
				if(context == grammarAccess.getNNTwInpStRule()) {
					sequence_nNTwInpSt(context, (nNTwInpSt) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NSS_ST_TUNR1:
				if(context == grammarAccess.getNSSStTunr1Rule()) {
					sequence_nSSStTunr1(context, (nSSStTunr1) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NSS_ST_TUNR2:
				if(context == grammarAccess.getNSSStTunr2Rule()) {
					sequence_nSSStTunr2(context, (nSSStTunr2) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_FAM1_SH2:
				if(context == grammarAccess.getNTwFAM1Sh2Rule()) {
					sequence_nTwFAM1Sh2(context, (nTwFAM1Sh2) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_FAM1_SH3:
				if(context == grammarAccess.getNTwFAM1Sh3Rule()) {
					sequence_nTwFAM1Sh3(context, (nTwFAM1Sh3) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_FAM1_SH4:
				if(context == grammarAccess.getNTwFAM1Sh4Rule()) {
					sequence_nTwFAM1Sh4(context, (nTwFAM1Sh4) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_FAM1_SH5:
				if(context == grammarAccess.getNTwFAM1Sh5Rule()) {
					sequence_nTwFAM1Sh5(context, (nTwFAM1Sh5) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_FAM1_SH6:
				if(context == grammarAccess.getNTwFAM1Sh6Rule()) {
					sequence_nTwFAM1Sh6(context, (nTwFAM1Sh6) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_FAM2_SH2:
				if(context == grammarAccess.getNTwFAM2Sh2Rule()) {
					sequence_nTwFAM2Sh2(context, (nTwFAM2Sh2) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_FAM2_SH3:
				if(context == grammarAccess.getNTwFAM2Sh3Rule()) {
					sequence_nTwFAM2Sh3(context, (nTwFAM2Sh3) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_FAM2_SH4:
				if(context == grammarAccess.getNTwFAM2Sh4Rule()) {
					sequence_nTwFAM2Sh4(context, (nTwFAM2Sh4) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_FAM2_SH5:
				if(context == grammarAccess.getNTwFAM2Sh5Rule()) {
					sequence_nTwFAM2Sh5(context, (nTwFAM2Sh5) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_FAM2_SH6:
				if(context == grammarAccess.getNTwFAM2Sh6Rule()) {
					sequence_nTwFAM2Sh6(context, (nTwFAM2Sh6) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_SSM1_SH2:
				if(context == grammarAccess.getNTwSSM1Sh2Rule()) {
					sequence_nTwSSM1Sh2(context, (nTwSSM1Sh2) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_SSM1_SH3:
				if(context == grammarAccess.getNTwSSM1Sh3Rule()) {
					sequence_nTwSSM1Sh3(context, (nTwSSM1Sh3) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_SSM1_SH4:
				if(context == grammarAccess.getNTwSSM1Sh4Rule()) {
					sequence_nTwSSM1Sh4(context, (nTwSSM1Sh4) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_SSM1_SH5:
				if(context == grammarAccess.getNTwSSM1Sh5Rule()) {
					sequence_nTwSSM1Sh5(context, (nTwSSM1Sh5) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_SSM1_SH6:
				if(context == grammarAccess.getNTwSSM1Sh6Rule()) {
					sequence_nTwSSM1Sh6(context, (nTwSSM1Sh6) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_SSM2_SH2:
				if(context == grammarAccess.getNTwSSM2Sh2Rule()) {
					sequence_nTwSSM2Sh2(context, (nTwSSM2Sh2) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_SSM2_SH3:
				if(context == grammarAccess.getNTwSSM2Sh3Rule()) {
					sequence_nTwSSM2Sh3(context, (nTwSSM2Sh3) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_SSM2_SH4:
				if(context == grammarAccess.getNTwSSM2Sh4Rule()) {
					sequence_nTwSSM2Sh4(context, (nTwSSM2Sh4) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_SSM2_SH5:
				if(context == grammarAccess.getNTwSSM2Sh5Rule()) {
					sequence_nTwSSM2Sh5(context, (nTwSSM2Sh5) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTW_SSM2_SH6:
				if(context == grammarAccess.getNTwSSM2Sh6Rule()) {
					sequence_nTwSSM2Sh6(context, (nTwSSM2Sh6) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTWR_FA_DMP1:
				if(context == grammarAccess.getNTwrFADmp1Rule()) {
					sequence_nTwrFADmp1(context, (nTwrFADmp1) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTWR_FA_DMP2:
				if(context == grammarAccess.getNTwrFADmp2Rule()) {
					sequence_nTwrFADmp2(context, (nTwrFADmp2) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTWR_SS_DMP1:
				if(context == grammarAccess.getNTwrSSDmp1Rule()) {
					sequence_nTwrSSDmp1(context, (nTwrSSDmp1) semanticObject); 
					return; 
				}
				else break;
			case FasttwrPackage.NTWR_SS_DMP2:
				if(context == grammarAccess.getNTwrSSDmp2Rule()) {
					sequence_nTwrSSDmp2(context, (nTwrSSDmp2) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='AdjFASt')
	 */
	protected void sequence_AdjFASt(EObject context, AdjFASt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.ADJ_FA_ST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.ADJ_FA_ST__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.ADJ_FA_ST__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.ADJ_FA_ST__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdjFAStAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getAdjFAStAccess().getNameAdjFAStKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='AdjSSSt')
	 */
	protected void sequence_AdjSSSt(EObject context, AdjSSSt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.ADJ_SS_ST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.ADJ_SS_ST__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.ADJ_SS_ST__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.ADJ_SS_ST__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdjSSStAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getAdjSSStAccess().getNameAdjSSStKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='AdjTwMa')
	 */
	protected void sequence_AdjTwMa(EObject context, AdjTwMa semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.ADJ_TW_MA__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.ADJ_TW_MA__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.ADJ_TW_MA__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.ADJ_TW_MA__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdjTwMaAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getAdjTwMaAccess().getNameAdjTwMaKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=SL_COMMENT
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.HEADER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.HEADER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderAccess().getNameSL_COMMENTTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         Head=Header 
	 *         sections+=Section 
	 *         NTwInpSt=nNTwInpSt 
	 *         CalcTMode=bCalcTMode 
	 *         BldFlDmp1=nTwrFADmp1 
	 *         BldFlDmp2=nTwrFADmp2 
	 *         BldEdDmp1=nTwrSSDmp1 
	 *         BldEdDmp2=nTwrSSDmp2 
	 *         sections+=Section 
	 *         FAStTunr1=nFAStTunr1 
	 *         FAStTunr2=nFAStTunr2 
	 *         SSStTunr1=nSSStTunr1 
	 *         SSStTunr2=nSSStTunr2 
	 *         AdjTwMa=AdjTwMa 
	 *         AdjFASt=AdjFASt 
	 *         AdjSSSt=AdjSSSt 
	 *         sections+=Section 
	 *         TwrStat=aTwrStat 
	 *         sections+=Section 
	 *         TwFAM1Sh2=nTwFAM1Sh2 
	 *         TwFAM1Sh3=nTwFAM1Sh3 
	 *         TwFAM1Sh4=nTwFAM1Sh4 
	 *         TwFAM1Sh5=nTwFAM1Sh5 
	 *         TwFAM1Sh6=nTwFAM1Sh6 
	 *         TwFAM2Sh2=nTwFAM2Sh2 
	 *         TwFAM2Sh3=nTwFAM2Sh3 
	 *         TwFAM2Sh4=nTwFAM2Sh4 
	 *         TwFAM2Sh5=nTwFAM2Sh5 
	 *         TwFAM2Sh6=nTwFAM2Sh6 
	 *         sections+=Section 
	 *         TwSSM1Sh2=nTwSSM1Sh2 
	 *         TwSSM1Sh3=nTwSSM1Sh3 
	 *         TwSSM1Sh4=nTwSSM1Sh4 
	 *         TwSSM1Sh5=nTwSSM1Sh5 
	 *         TwSSM1Sh6=nTwSSM1Sh6 
	 *         TwSSM2Sh2=nTwSSM2Sh2 
	 *         TwSSM2Sh3=nTwSSM2Sh3 
	 *         TwSSM2Sh4=nTwSSM2Sh4 
	 *         TwSSM2Sh5=nTwSSM2Sh5 
	 *         TwSSM2Sh6=nTwSSM2Sh6
	 *     )
	 */
	protected void sequence_ModelFasttwr(EObject context, ModelFasttwr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=SL_COMMENT
	 */
	protected void sequence_Section(EObject context, Section semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.SECTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.SECTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSectionAccess().getNameSL_COMMENTTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         HtFract+=tNUMBER 
	 *         TMassDen+=tNUMBER 
	 *         TwFAStif+=tNUMBER 
	 *         TwSSStif+=tNUMBER 
	 *         TwGJStif+=tNUMBER 
	 *         TwEAStif+=tNUMBER 
	 *         TwFAIner+=tNUMBER 
	 *         TwSSIner+=tNUMBER 
	 *         TwFAcgOf+=tNUMBER 
	 *         TwSScgOf+=tNUMBER
	 *     )+
	 */
	protected void sequence_aTwrStat(EObject context, aTwrStat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='CalcTMode')
	 */
	protected void sequence_bCalcTMode(EObject context, bCalcTMode semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.BCALC_TMODE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.BCALC_TMODE__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.BCALC_TMODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.BCALC_TMODE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBCalcTModeAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBCalcTModeAccess().getNameCalcTModeKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='FAStTunr(1)')
	 */
	protected void sequence_nFAStTunr1(EObject context, nFAStTunr1 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NFA_ST_TUNR1__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NFA_ST_TUNR1__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NFA_ST_TUNR1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NFA_ST_TUNR1__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNFAStTunr1Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNFAStTunr1Access().getNameFAStTunr1Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='FAStTunr(2)')
	 */
	protected void sequence_nFAStTunr2(EObject context, nFAStTunr2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NFA_ST_TUNR2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NFA_ST_TUNR2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NFA_ST_TUNR2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NFA_ST_TUNR2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNFAStTunr2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNFAStTunr2Access().getNameFAStTunr2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='NTwInpSt')
	 */
	protected void sequence_nNTwInpSt(EObject context, nNTwInpSt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NN_TW_INP_ST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NN_TW_INP_ST__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NN_TW_INP_ST__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NN_TW_INP_ST__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNNTwInpStAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNNTwInpStAccess().getNameNTwInpStKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='SSStTunr(1)')
	 */
	protected void sequence_nSSStTunr1(EObject context, nSSStTunr1 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NSS_ST_TUNR1__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NSS_ST_TUNR1__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NSS_ST_TUNR1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NSS_ST_TUNR1__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNSSStTunr1Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNSSStTunr1Access().getNameSSStTunr1Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='SSStTunr(2)')
	 */
	protected void sequence_nSSStTunr2(EObject context, nSSStTunr2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NSS_ST_TUNR2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NSS_ST_TUNR2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NSS_ST_TUNR2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NSS_ST_TUNR2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNSSStTunr2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNSSStTunr2Access().getNameSSStTunr2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwFAM1Sh(2)')
	 */
	protected void sequence_nTwFAM1Sh2(EObject context, nTwFAM1Sh2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwFAM1Sh2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwFAM1Sh2Access().getNameTwFAM1Sh2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwFAM1Sh(3)')
	 */
	protected void sequence_nTwFAM1Sh3(EObject context, nTwFAM1Sh3 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH3__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH3__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH3__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH3__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwFAM1Sh3Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwFAM1Sh3Access().getNameTwFAM1Sh3Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwFAM1Sh(4)')
	 */
	protected void sequence_nTwFAM1Sh4(EObject context, nTwFAM1Sh4 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH4__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH4__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH4__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH4__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwFAM1Sh4Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwFAM1Sh4Access().getNameTwFAM1Sh4Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwFAM1Sh(5)')
	 */
	protected void sequence_nTwFAM1Sh5(EObject context, nTwFAM1Sh5 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH5__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH5__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH5__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH5__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwFAM1Sh5Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwFAM1Sh5Access().getNameTwFAM1Sh5Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwFAM1Sh(6)')
	 */
	protected void sequence_nTwFAM1Sh6(EObject context, nTwFAM1Sh6 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH6__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH6__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH6__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM1_SH6__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwFAM1Sh6Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwFAM1Sh6Access().getNameTwFAM1Sh6Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwFAM2Sh(2)')
	 */
	protected void sequence_nTwFAM2Sh2(EObject context, nTwFAM2Sh2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwFAM2Sh2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwFAM2Sh2Access().getNameTwFAM2Sh2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwFAM2Sh(3)')
	 */
	protected void sequence_nTwFAM2Sh3(EObject context, nTwFAM2Sh3 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH3__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH3__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH3__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH3__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwFAM2Sh3Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwFAM2Sh3Access().getNameTwFAM2Sh3Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwFAM2Sh(4)')
	 */
	protected void sequence_nTwFAM2Sh4(EObject context, nTwFAM2Sh4 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH4__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH4__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH4__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH4__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwFAM2Sh4Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwFAM2Sh4Access().getNameTwFAM2Sh4Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwFAM2Sh(5)')
	 */
	protected void sequence_nTwFAM2Sh5(EObject context, nTwFAM2Sh5 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH5__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH5__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH5__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH5__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwFAM2Sh5Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwFAM2Sh5Access().getNameTwFAM2Sh5Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwFAM2Sh(6)')
	 */
	protected void sequence_nTwFAM2Sh6(EObject context, nTwFAM2Sh6 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH6__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH6__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH6__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_FAM2_SH6__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwFAM2Sh6Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwFAM2Sh6Access().getNameTwFAM2Sh6Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwSSM1Sh(2)')
	 */
	protected void sequence_nTwSSM1Sh2(EObject context, nTwSSM1Sh2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwSSM1Sh2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwSSM1Sh2Access().getNameTwSSM1Sh2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwSSM1Sh(3)')
	 */
	protected void sequence_nTwSSM1Sh3(EObject context, nTwSSM1Sh3 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH3__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH3__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH3__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH3__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwSSM1Sh3Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwSSM1Sh3Access().getNameTwSSM1Sh3Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwSSM1Sh(4)')
	 */
	protected void sequence_nTwSSM1Sh4(EObject context, nTwSSM1Sh4 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH4__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH4__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH4__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH4__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwSSM1Sh4Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwSSM1Sh4Access().getNameTwSSM1Sh4Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwSSM1Sh(5)')
	 */
	protected void sequence_nTwSSM1Sh5(EObject context, nTwSSM1Sh5 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH5__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH5__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH5__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH5__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwSSM1Sh5Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwSSM1Sh5Access().getNameTwSSM1Sh5Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwSSM1Sh(6)')
	 */
	protected void sequence_nTwSSM1Sh6(EObject context, nTwSSM1Sh6 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH6__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH6__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH6__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM1_SH6__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwSSM1Sh6Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwSSM1Sh6Access().getNameTwSSM1Sh6Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwSSM2Sh(2)')
	 */
	protected void sequence_nTwSSM2Sh2(EObject context, nTwSSM2Sh2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwSSM2Sh2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwSSM2Sh2Access().getNameTwSSM2Sh2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwSSM2Sh(3)')
	 */
	protected void sequence_nTwSSM2Sh3(EObject context, nTwSSM2Sh3 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH3__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH3__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH3__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH3__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwSSM2Sh3Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwSSM2Sh3Access().getNameTwSSM2Sh3Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwSSM2Sh(4)')
	 */
	protected void sequence_nTwSSM2Sh4(EObject context, nTwSSM2Sh4 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH4__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH4__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH4__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH4__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwSSM2Sh4Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwSSM2Sh4Access().getNameTwSSM2Sh4Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwSSM2Sh(5)')
	 */
	protected void sequence_nTwSSM2Sh5(EObject context, nTwSSM2Sh5 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH5__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH5__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH5__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH5__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwSSM2Sh5Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwSSM2Sh5Access().getNameTwSSM2Sh5Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwSSM2Sh(6)')
	 */
	protected void sequence_nTwSSM2Sh6(EObject context, nTwSSM2Sh6 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH6__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH6__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH6__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTW_SSM2_SH6__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwSSM2Sh6Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwSSM2Sh6Access().getNameTwSSM2Sh6Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwrFADmp(1)')
	 */
	protected void sequence_nTwrFADmp1(EObject context, nTwrFADmp1 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTWR_FA_DMP1__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTWR_FA_DMP1__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTWR_FA_DMP1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTWR_FA_DMP1__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwrFADmp1Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwrFADmp1Access().getNameTwrFADmp1Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwrFADmp(2)')
	 */
	protected void sequence_nTwrFADmp2(EObject context, nTwrFADmp2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTWR_FA_DMP2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTWR_FA_DMP2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTWR_FA_DMP2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTWR_FA_DMP2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwrFADmp2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwrFADmp2Access().getNameTwrFADmp2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwrSSDmp(1)')
	 */
	protected void sequence_nTwrSSDmp1(EObject context, nTwrSSDmp1 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTWR_SS_DMP1__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTWR_SS_DMP1__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTWR_SS_DMP1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTWR_SS_DMP1__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwrSSDmp1Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwrSSDmp1Access().getNameTwrSSDmp1Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='TwrSSDmp(2)')
	 */
	protected void sequence_nTwrSSDmp2(EObject context, nTwrSSDmp2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTWR_SS_DMP2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTWR_SS_DMP2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FasttwrPackage.Literals.NTWR_SS_DMP2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FasttwrPackage.Literals.NTWR_SS_DMP2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNTwrSSDmp2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNTwrSSDmp2Access().getNameTwrSSDmp2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
}
