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
import sc.ndt.editor.fast.fastbld.AdjBlMs;
import sc.ndt.editor.fast.fastbld.AdjEdSt;
import sc.ndt.editor.fast.fastbld.AdjFlSt;
import sc.ndt.editor.fast.fastbld.FastbldPackage;
import sc.ndt.editor.fast.fastbld.Header;
import sc.ndt.editor.fast.fastbld.ModelFastbld;
import sc.ndt.editor.fast.fastbld.Section;
import sc.ndt.editor.fast.fastbld.aAirStat;
import sc.ndt.editor.fast.fastbld.bCalcBMode;
import sc.ndt.editor.fast.fastbld.nBldEdDmp1;
import sc.ndt.editor.fast.fastbld.nBldEdgSh2;
import sc.ndt.editor.fast.fastbld.nBldEdgSh3;
import sc.ndt.editor.fast.fastbld.nBldEdgSh4;
import sc.ndt.editor.fast.fastbld.nBldEdgSh5;
import sc.ndt.editor.fast.fastbld.nBldEdgSh6;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh2;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh3;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh4;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh5;
import sc.ndt.editor.fast.fastbld.nBldFl1Sh6;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh2;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh3;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh4;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh5;
import sc.ndt.editor.fast.fastbld.nBldFl2Sh6;
import sc.ndt.editor.fast.fastbld.nBldFlDmp1;
import sc.ndt.editor.fast.fastbld.nBldFlDmp2;
import sc.ndt.editor.fast.fastbld.nFlStTunr1;
import sc.ndt.editor.fast.fastbld.nFlStTunr2;
import sc.ndt.editor.fast.fastbld.nNblInpSt;
import sc.ndt.editor.fast.services.FastbldGrammarAccess;

@SuppressWarnings("all")
public class FastbldSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FastbldGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FastbldPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FastbldPackage.ADJ_BL_MS:
				if(context == grammarAccess.getAdjBlMsRule()) {
					sequence_AdjBlMs(context, (AdjBlMs) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.ADJ_ED_ST:
				if(context == grammarAccess.getAdjEdStRule()) {
					sequence_AdjEdSt(context, (AdjEdSt) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.ADJ_FL_ST:
				if(context == grammarAccess.getAdjFlStRule()) {
					sequence_AdjFlSt(context, (AdjFlSt) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.HEADER:
				if(context == grammarAccess.getHeaderRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.MODEL_FASTBLD:
				if(context == grammarAccess.getModelFastbldRule()) {
					sequence_ModelFastbld(context, (ModelFastbld) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.SECTION:
				if(context == grammarAccess.getSectionRule()) {
					sequence_Section(context, (Section) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.AAIR_STAT:
				if(context == grammarAccess.getAAirStatRule()) {
					sequence_aAirStat(context, (aAirStat) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.BCALC_BMODE:
				if(context == grammarAccess.getBCalcBModeRule()) {
					sequence_bCalcBMode(context, (bCalcBMode) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_ED_DMP1:
				if(context == grammarAccess.getNBldEdDmp1Rule()) {
					sequence_nBldEdDmp1(context, (nBldEdDmp1) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_EDG_SH2:
				if(context == grammarAccess.getNBldEdgSh2Rule()) {
					sequence_nBldEdgSh2(context, (nBldEdgSh2) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_EDG_SH3:
				if(context == grammarAccess.getNBldEdgSh3Rule()) {
					sequence_nBldEdgSh3(context, (nBldEdgSh3) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_EDG_SH4:
				if(context == grammarAccess.getNBldEdgSh4Rule()) {
					sequence_nBldEdgSh4(context, (nBldEdgSh4) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_EDG_SH5:
				if(context == grammarAccess.getNBldEdgSh5Rule()) {
					sequence_nBldEdgSh5(context, (nBldEdgSh5) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_EDG_SH6:
				if(context == grammarAccess.getNBldEdgSh6Rule()) {
					sequence_nBldEdgSh6(context, (nBldEdgSh6) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_FL1_SH2:
				if(context == grammarAccess.getNBldFl1Sh2Rule()) {
					sequence_nBldFl1Sh2(context, (nBldFl1Sh2) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_FL1_SH3:
				if(context == grammarAccess.getNBldFl1Sh3Rule()) {
					sequence_nBldFl1Sh3(context, (nBldFl1Sh3) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_FL1_SH4:
				if(context == grammarAccess.getNBldFl1Sh4Rule()) {
					sequence_nBldFl1Sh4(context, (nBldFl1Sh4) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_FL1_SH5:
				if(context == grammarAccess.getNBldFl1Sh5Rule()) {
					sequence_nBldFl1Sh5(context, (nBldFl1Sh5) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_FL1_SH6:
				if(context == grammarAccess.getNBldFl1Sh6Rule()) {
					sequence_nBldFl1Sh6(context, (nBldFl1Sh6) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_FL2_SH2:
				if(context == grammarAccess.getNBldFl2Sh2Rule()) {
					sequence_nBldFl2Sh2(context, (nBldFl2Sh2) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_FL2_SH3:
				if(context == grammarAccess.getNBldFl2Sh3Rule()) {
					sequence_nBldFl2Sh3(context, (nBldFl2Sh3) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_FL2_SH4:
				if(context == grammarAccess.getNBldFl2Sh4Rule()) {
					sequence_nBldFl2Sh4(context, (nBldFl2Sh4) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_FL2_SH5:
				if(context == grammarAccess.getNBldFl2Sh5Rule()) {
					sequence_nBldFl2Sh5(context, (nBldFl2Sh5) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_FL2_SH6:
				if(context == grammarAccess.getNBldFl2Sh6Rule()) {
					sequence_nBldFl2Sh6(context, (nBldFl2Sh6) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_FL_DMP1:
				if(context == grammarAccess.getNBldFlDmp1Rule()) {
					sequence_nBldFlDmp1(context, (nBldFlDmp1) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NBLD_FL_DMP2:
				if(context == grammarAccess.getNBldFlDmp2Rule()) {
					sequence_nBldFlDmp2(context, (nBldFlDmp2) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NFL_ST_TUNR1:
				if(context == grammarAccess.getNFlStTunr1Rule()) {
					sequence_nFlStTunr1(context, (nFlStTunr1) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NFL_ST_TUNR2:
				if(context == grammarAccess.getNFlStTunr2Rule()) {
					sequence_nFlStTunr2(context, (nFlStTunr2) semanticObject); 
					return; 
				}
				else break;
			case FastbldPackage.NNBL_INP_ST:
				if(context == grammarAccess.getNNblInpStRule()) {
					sequence_nNblInpSt(context, (nNblInpSt) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='AdjBlMs')
	 */
	protected void sequence_AdjBlMs(EObject context, AdjBlMs semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.ADJ_BL_MS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.ADJ_BL_MS__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.ADJ_BL_MS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.ADJ_BL_MS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdjBlMsAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getAdjBlMsAccess().getNameAdjBlMsKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='AdjEdSt')
	 */
	protected void sequence_AdjEdSt(EObject context, AdjEdSt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.ADJ_ED_ST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.ADJ_ED_ST__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.ADJ_ED_ST__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.ADJ_ED_ST__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdjEdStAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getAdjEdStAccess().getNameAdjEdStKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='AdjFlSt')
	 */
	protected void sequence_AdjFlSt(EObject context, AdjFlSt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.ADJ_FL_ST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.ADJ_FL_ST__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.ADJ_FL_ST__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.ADJ_FL_ST__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdjFlStAccess().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getAdjFlStAccess().getNameAdjFlStKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=SL_COMMENT
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.HEADER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.HEADER__NAME));
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
	 *         NblInpSt=nNblInpSt 
	 *         CalcBMode=bCalcBMode 
	 *         BldFlDmp1=nBldFlDmp1 
	 *         BldFlDmp2=nBldFlDmp2 
	 *         BldEdDmp1=nBldEdDmp1 
	 *         sections+=Section 
	 *         FlStTunr1=nFlStTunr1 
	 *         FlStTunr2=nFlStTunr2 
	 *         AdjBlMs=AdjBlMs 
	 *         AdjFlSt=AdjFlSt 
	 *         AdjEdSt=AdjEdSt 
	 *         sections+=Section 
	 *         AirStat=aAirStat 
	 *         sections+=Section 
	 *         BldFl1Sh2=nBldFl1Sh2 
	 *         BldFl1Sh3=nBldFl1Sh3 
	 *         BldFl1Sh4=nBldFl1Sh4 
	 *         BldFl1Sh5=nBldFl1Sh5 
	 *         BldFl1Sh6=nBldFl1Sh6 
	 *         BldFl2Sh2=nBldFl2Sh2 
	 *         BldFl2Sh3=nBldFl2Sh3 
	 *         BldFl2Sh4=nBldFl2Sh4 
	 *         BldFl2Sh5=nBldFl2Sh5 
	 *         BldFl2Sh6=nBldFl2Sh6 
	 *         BldEdgSh2=nBldEdgSh2 
	 *         BldEdgSh3=nBldEdgSh3 
	 *         BldEdgSh4=nBldEdgSh4 
	 *         BldEdgSh5=nBldEdgSh5 
	 *         BldEdgSh6=nBldEdgSh6
	 *     )
	 */
	protected void sequence_ModelFastbld(EObject context, ModelFastbld semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=SL_COMMENT
	 */
	protected void sequence_Section(EObject context, Section semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.SECTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.SECTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSectionAccess().getNameSL_COMMENTTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         bldfrac+=tNUMBER 
	 *         AeroCent+=tNUMBER 
	 *         StrcTwst+=tNUMBER 
	 *         BMassDen+=tNUMBER 
	 *         FlpStff+=tNUMBER 
	 *         EdgStff+=tNUMBER 
	 *         GJStff+=tNUMBER 
	 *         EAStff+=tNUMBER 
	 *         Alpha+=tNUMBER 
	 *         FlpIner+=tNUMBER 
	 *         EdgIner+=tNUMBER 
	 *         PrecrvRef+=tNUMBER 
	 *         PreswpRef+=tNUMBER 
	 *         FlpcgOf+=tNUMBER 
	 *         EdgcgOf+=tNUMBER 
	 *         FlpEAOf+=tNUMBER 
	 *         EdgEAOf+=tNUMBER
	 *     )+
	 */
	protected void sequence_aAirStat(EObject context, aAirStat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=tBOOL name='CalcBMode')
	 */
	protected void sequence_bCalcBMode(EObject context, bCalcBMode semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.BCALC_BMODE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.BCALC_BMODE__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.BCALC_BMODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.BCALC_BMODE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBCalcBModeAccess().getValueTBOOLParserRuleCall_1_0(), semanticObject.isValue());
		feeder.accept(grammarAccess.getBCalcBModeAccess().getNameCalcBModeKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldEdDmp(1)')
	 */
	protected void sequence_nBldEdDmp1(EObject context, nBldEdDmp1 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_ED_DMP1__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_ED_DMP1__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_ED_DMP1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_ED_DMP1__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldEdDmp1Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldEdDmp1Access().getNameBldEdDmp1Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldEdgSh(2)')
	 */
	protected void sequence_nBldEdgSh2(EObject context, nBldEdgSh2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldEdgSh2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldEdgSh2Access().getNameBldEdgSh2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldEdgSh(3)')
	 */
	protected void sequence_nBldEdgSh3(EObject context, nBldEdgSh3 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH3__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH3__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH3__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH3__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldEdgSh3Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldEdgSh3Access().getNameBldEdgSh3Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldEdgSh(4)')
	 */
	protected void sequence_nBldEdgSh4(EObject context, nBldEdgSh4 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH4__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH4__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH4__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH4__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldEdgSh4Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldEdgSh4Access().getNameBldEdgSh4Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldEdgSh(5)')
	 */
	protected void sequence_nBldEdgSh5(EObject context, nBldEdgSh5 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH5__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH5__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH5__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH5__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldEdgSh5Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldEdgSh5Access().getNameBldEdgSh5Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldEdgSh(6)')
	 */
	protected void sequence_nBldEdgSh6(EObject context, nBldEdgSh6 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH6__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH6__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH6__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_EDG_SH6__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldEdgSh6Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldEdgSh6Access().getNameBldEdgSh6Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldFl1Sh(2)')
	 */
	protected void sequence_nBldFl1Sh2(EObject context, nBldFl1Sh2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldFl1Sh2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldFl1Sh2Access().getNameBldFl1Sh2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldFl1Sh(3)')
	 */
	protected void sequence_nBldFl1Sh3(EObject context, nBldFl1Sh3 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH3__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH3__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH3__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH3__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldFl1Sh3Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldFl1Sh3Access().getNameBldFl1Sh3Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldFl1Sh(4)')
	 */
	protected void sequence_nBldFl1Sh4(EObject context, nBldFl1Sh4 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH4__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH4__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH4__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH4__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldFl1Sh4Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldFl1Sh4Access().getNameBldFl1Sh4Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldFl1Sh(5)')
	 */
	protected void sequence_nBldFl1Sh5(EObject context, nBldFl1Sh5 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH5__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH5__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH5__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH5__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldFl1Sh5Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldFl1Sh5Access().getNameBldFl1Sh5Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldFl1Sh(6)')
	 */
	protected void sequence_nBldFl1Sh6(EObject context, nBldFl1Sh6 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH6__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH6__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH6__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL1_SH6__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldFl1Sh6Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldFl1Sh6Access().getNameBldFl1Sh6Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldFl2Sh(2)')
	 */
	protected void sequence_nBldFl2Sh2(EObject context, nBldFl2Sh2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldFl2Sh2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldFl2Sh2Access().getNameBldFl2Sh2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldFl2Sh(3)')
	 */
	protected void sequence_nBldFl2Sh3(EObject context, nBldFl2Sh3 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH3__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH3__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH3__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH3__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldFl2Sh3Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldFl2Sh3Access().getNameBldFl2Sh3Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldFl2Sh(4)')
	 */
	protected void sequence_nBldFl2Sh4(EObject context, nBldFl2Sh4 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH4__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH4__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH4__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH4__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldFl2Sh4Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldFl2Sh4Access().getNameBldFl2Sh4Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldFl2Sh(5)')
	 */
	protected void sequence_nBldFl2Sh5(EObject context, nBldFl2Sh5 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH5__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH5__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH5__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH5__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldFl2Sh5Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldFl2Sh5Access().getNameBldFl2Sh5Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldFl2Sh(6)')
	 */
	protected void sequence_nBldFl2Sh6(EObject context, nBldFl2Sh6 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH6__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH6__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH6__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL2_SH6__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldFl2Sh6Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldFl2Sh6Access().getNameBldFl2Sh6Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldFlDmp(1)')
	 */
	protected void sequence_nBldFlDmp1(EObject context, nBldFlDmp1 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL_DMP1__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL_DMP1__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL_DMP1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL_DMP1__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldFlDmp1Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldFlDmp1Access().getNameBldFlDmp1Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='BldFlDmp(2)')
	 */
	protected void sequence_nBldFlDmp2(EObject context, nBldFlDmp2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL_DMP2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL_DMP2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NBLD_FL_DMP2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NBLD_FL_DMP2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNBldFlDmp2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNBldFlDmp2Access().getNameBldFlDmp2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='FlStTunr(1)')
	 */
	protected void sequence_nFlStTunr1(EObject context, nFlStTunr1 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NFL_ST_TUNR1__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NFL_ST_TUNR1__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NFL_ST_TUNR1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NFL_ST_TUNR1__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNFlStTunr1Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNFlStTunr1Access().getNameFlStTunr1Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=tNUMBER name='FlStTunr(2)')
	 */
	protected void sequence_nFlStTunr2(EObject context, nFlStTunr2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NFL_ST_TUNR2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NFL_ST_TUNR2__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NFL_ST_TUNR2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NFL_ST_TUNR2__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNFlStTunr2Access().getValueTNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNFlStTunr2Access().getNameFlStTunr2Keyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT name='NBlInpSt')
	 */
	protected void sequence_nNblInpSt(EObject context, nNblInpSt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NNBL_INP_ST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NNBL_INP_ST__VALUE));
			if(transientValues.isValueTransient(semanticObject, FastbldPackage.Literals.NNBL_INP_ST__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FastbldPackage.Literals.NNBL_INP_ST__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNNblInpStAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getNNblInpStAccess().getNameNBlInpStKeyword_3_0(), semanticObject.getName());
		feeder.finish();
	}
}
