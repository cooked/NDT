package sc.ndt.editor.fast.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import sc.ndt.editor.fast.services.FastadnGrammarAccess;

@SuppressWarnings("all")
public class FastadnSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FastadnGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ModelFastadn___NEWLINETerminalRuleCall_20_1_or_SL_COMMENTTerminalRuleCall_20_2_or_WSTerminalRuleCall_20_0__a;
	protected AbstractElementAlias match_aAirStat_SL_COMMENTTerminalRuleCall_13_q;
	protected AbstractElementAlias match_aAirStat_SL_COMMENTTerminalRuleCall_15_13_q;
	protected AbstractElementAlias match_aAirStat_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_aAirStat_WSTerminalRuleCall_12_q;
	protected AbstractElementAlias match_aAirStat_WSTerminalRuleCall_15_0_q;
	protected AbstractElementAlias match_aAirStat_WSTerminalRuleCall_15_12_q;
	protected AbstractElementAlias match_aAirfoilList_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_aAirfoilList_SL_COMMENTTerminalRuleCall_7_3_q;
	protected AbstractElementAlias match_aAirfoilList_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_aAirfoilList_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_aAirfoilList_WSTerminalRuleCall_7_0_q;
	protected AbstractElementAlias match_aAirfoilList_WSTerminalRuleCall_7_2_q;
	protected AbstractElementAlias match_bCalcTwrAero_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_bCalcTwrAero_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_bCalcTwrAero_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_bTwrPot_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_bTwrPot_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_bTwrPot_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_bTwrShd_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_bTwrShd_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_bTwrShd_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_fTwrFile_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_fTwrFile_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_fTwrFile_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_fWindFile_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_fWindFile_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_fWindFile_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_iBldNodes_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_iBldNodes_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_iBldNodes_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_iNumFoil_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_iNumFoil_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_iNumFoil_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nAtoler_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nAtoler_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nAtoler_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nDTAero_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nDTAero_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nDTAero_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nHH_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nHH_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nHH_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nKinVisc_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nKinVisc_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nKinVisc_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nRho_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nRho_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nRho_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nShadHWid_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nShadHWid_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nShadHWid_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTShadRefPt_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTShadRefPt_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTShadRefPt_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwrShad_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwrShad_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwrShad_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_sHLModel_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_sHLModel_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_sHLModel_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_sIndModel_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_sIndModel_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_sIndModel_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_sInfModel_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_sInfModel_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_sInfModel_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_sStallMod_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_sStallMod_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_sStallMod_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_sTLModel_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_sTLModel_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_sTLModel_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_sUnits_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_sUnits_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_sUnits_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_sUseCm_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_sUseCm_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_sUseCm_WSTerminalRuleCall_4_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FastadnGrammarAccess) access;
		match_ModelFastadn___NEWLINETerminalRuleCall_20_1_or_SL_COMMENTTerminalRuleCall_20_2_or_WSTerminalRuleCall_20_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getModelFastadnAccess().getNEWLINETerminalRuleCall_20_1()), new TokenAlias(false, false, grammarAccess.getModelFastadnAccess().getSL_COMMENTTerminalRuleCall_20_2()), new TokenAlias(false, false, grammarAccess.getModelFastadnAccess().getWSTerminalRuleCall_20_0()));
		match_aAirStat_SL_COMMENTTerminalRuleCall_13_q = new TokenAlias(false, true, grammarAccess.getAAirStatAccess().getSL_COMMENTTerminalRuleCall_13());
		match_aAirStat_SL_COMMENTTerminalRuleCall_15_13_q = new TokenAlias(false, true, grammarAccess.getAAirStatAccess().getSL_COMMENTTerminalRuleCall_15_13());
		match_aAirStat_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getAAirStatAccess().getWSTerminalRuleCall_0());
		match_aAirStat_WSTerminalRuleCall_12_q = new TokenAlias(false, true, grammarAccess.getAAirStatAccess().getWSTerminalRuleCall_12());
		match_aAirStat_WSTerminalRuleCall_15_0_q = new TokenAlias(false, true, grammarAccess.getAAirStatAccess().getWSTerminalRuleCall_15_0());
		match_aAirStat_WSTerminalRuleCall_15_12_q = new TokenAlias(false, true, grammarAccess.getAAirStatAccess().getWSTerminalRuleCall_15_12());
		match_aAirfoilList_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getAAirfoilListAccess().getSL_COMMENTTerminalRuleCall_5());
		match_aAirfoilList_SL_COMMENTTerminalRuleCall_7_3_q = new TokenAlias(false, true, grammarAccess.getAAirfoilListAccess().getSL_COMMENTTerminalRuleCall_7_3());
		match_aAirfoilList_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getAAirfoilListAccess().getWSTerminalRuleCall_0());
		match_aAirfoilList_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getAAirfoilListAccess().getWSTerminalRuleCall_4());
		match_aAirfoilList_WSTerminalRuleCall_7_0_q = new TokenAlias(false, true, grammarAccess.getAAirfoilListAccess().getWSTerminalRuleCall_7_0());
		match_aAirfoilList_WSTerminalRuleCall_7_2_q = new TokenAlias(false, true, grammarAccess.getAAirfoilListAccess().getWSTerminalRuleCall_7_2());
		match_bCalcTwrAero_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getBCalcTwrAeroAccess().getSL_COMMENTTerminalRuleCall_5());
		match_bCalcTwrAero_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getBCalcTwrAeroAccess().getWSTerminalRuleCall_0());
		match_bCalcTwrAero_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getBCalcTwrAeroAccess().getWSTerminalRuleCall_4());
		match_bTwrPot_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getBTwrPotAccess().getSL_COMMENTTerminalRuleCall_5());
		match_bTwrPot_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getBTwrPotAccess().getWSTerminalRuleCall_0());
		match_bTwrPot_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getBTwrPotAccess().getWSTerminalRuleCall_4());
		match_bTwrShd_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getBTwrShdAccess().getSL_COMMENTTerminalRuleCall_5());
		match_bTwrShd_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getBTwrShdAccess().getWSTerminalRuleCall_0());
		match_bTwrShd_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getBTwrShdAccess().getWSTerminalRuleCall_4());
		match_fTwrFile_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getFTwrFileAccess().getSL_COMMENTTerminalRuleCall_5());
		match_fTwrFile_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getFTwrFileAccess().getWSTerminalRuleCall_0());
		match_fTwrFile_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getFTwrFileAccess().getWSTerminalRuleCall_4());
		match_fWindFile_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getFWindFileAccess().getSL_COMMENTTerminalRuleCall_5());
		match_fWindFile_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getFWindFileAccess().getWSTerminalRuleCall_0());
		match_fWindFile_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getFWindFileAccess().getWSTerminalRuleCall_4());
		match_iBldNodes_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getIBldNodesAccess().getSL_COMMENTTerminalRuleCall_5());
		match_iBldNodes_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getIBldNodesAccess().getWSTerminalRuleCall_0());
		match_iBldNodes_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getIBldNodesAccess().getWSTerminalRuleCall_4());
		match_iNumFoil_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getINumFoilAccess().getSL_COMMENTTerminalRuleCall_5());
		match_iNumFoil_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getINumFoilAccess().getWSTerminalRuleCall_0());
		match_iNumFoil_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getINumFoilAccess().getWSTerminalRuleCall_4());
		match_nAtoler_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNAtolerAccess().getSL_COMMENTTerminalRuleCall_5());
		match_nAtoler_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNAtolerAccess().getWSTerminalRuleCall_0());
		match_nAtoler_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNAtolerAccess().getWSTerminalRuleCall_4());
		match_nDTAero_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNDTAeroAccess().getSL_COMMENTTerminalRuleCall_5());
		match_nDTAero_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNDTAeroAccess().getWSTerminalRuleCall_0());
		match_nDTAero_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNDTAeroAccess().getWSTerminalRuleCall_4());
		match_nHH_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNHHAccess().getSL_COMMENTTerminalRuleCall_5());
		match_nHH_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNHHAccess().getWSTerminalRuleCall_0());
		match_nHH_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNHHAccess().getWSTerminalRuleCall_4());
		match_nKinVisc_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNKinViscAccess().getSL_COMMENTTerminalRuleCall_5());
		match_nKinVisc_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNKinViscAccess().getWSTerminalRuleCall_0());
		match_nKinVisc_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNKinViscAccess().getWSTerminalRuleCall_4());
		match_nRho_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNRhoAccess().getSL_COMMENTTerminalRuleCall_5());
		match_nRho_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNRhoAccess().getWSTerminalRuleCall_0());
		match_nRho_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNRhoAccess().getWSTerminalRuleCall_4());
		match_nShadHWid_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNShadHWidAccess().getSL_COMMENTTerminalRuleCall_5());
		match_nShadHWid_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNShadHWidAccess().getWSTerminalRuleCall_0());
		match_nShadHWid_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNShadHWidAccess().getWSTerminalRuleCall_4());
		match_nTShadRefPt_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTShadRefPtAccess().getSL_COMMENTTerminalRuleCall_5());
		match_nTShadRefPt_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTShadRefPtAccess().getWSTerminalRuleCall_0());
		match_nTShadRefPt_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTShadRefPtAccess().getWSTerminalRuleCall_4());
		match_nTwrShad_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwrShadAccess().getSL_COMMENTTerminalRuleCall_5());
		match_nTwrShad_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwrShadAccess().getWSTerminalRuleCall_0());
		match_nTwrShad_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwrShadAccess().getWSTerminalRuleCall_4());
		match_sHLModel_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getSHLModelAccess().getSL_COMMENTTerminalRuleCall_5());
		match_sHLModel_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getSHLModelAccess().getWSTerminalRuleCall_0());
		match_sHLModel_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getSHLModelAccess().getWSTerminalRuleCall_4());
		match_sIndModel_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getSIndModelAccess().getSL_COMMENTTerminalRuleCall_5());
		match_sIndModel_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getSIndModelAccess().getWSTerminalRuleCall_0());
		match_sIndModel_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getSIndModelAccess().getWSTerminalRuleCall_4());
		match_sInfModel_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getSInfModelAccess().getSL_COMMENTTerminalRuleCall_5());
		match_sInfModel_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getSInfModelAccess().getWSTerminalRuleCall_0());
		match_sInfModel_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getSInfModelAccess().getWSTerminalRuleCall_4());
		match_sStallMod_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getSStallModAccess().getSL_COMMENTTerminalRuleCall_5());
		match_sStallMod_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getSStallModAccess().getWSTerminalRuleCall_0());
		match_sStallMod_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getSStallModAccess().getWSTerminalRuleCall_4());
		match_sTLModel_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getSTLModelAccess().getSL_COMMENTTerminalRuleCall_5());
		match_sTLModel_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getSTLModelAccess().getWSTerminalRuleCall_0());
		match_sTLModel_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getSTLModelAccess().getWSTerminalRuleCall_4());
		match_sUnits_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getSUnitsAccess().getSL_COMMENTTerminalRuleCall_5());
		match_sUnits_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getSUnitsAccess().getWSTerminalRuleCall_0());
		match_sUnits_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getSUnitsAccess().getWSTerminalRuleCall_4());
		match_sUseCm_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getSUseCmAccess().getSL_COMMENTTerminalRuleCall_5());
		match_sUseCm_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getSUseCmAccess().getWSTerminalRuleCall_0());
		match_sUseCm_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getSUseCmAccess().getWSTerminalRuleCall_4());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getNEWLINERule())
			return getNEWLINEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal NEWLINE	: '\r'|'\n'|'\r\n';
	 */
	protected String getNEWLINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\r";
	}
	
	/**
	 * terminal SL_COMMENT	: '-' !('0'..'9') !('\r'|'\n'|'\r\n')*;
	 */
	protected String getSL_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	/**
	 * terminal WS			: (' '|'\t')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ModelFastadn___NEWLINETerminalRuleCall_20_1_or_SL_COMMENTTerminalRuleCall_20_2_or_WSTerminalRuleCall_20_0__a.equals(syntax))
				emit_ModelFastadn___NEWLINETerminalRuleCall_20_1_or_SL_COMMENTTerminalRuleCall_20_2_or_WSTerminalRuleCall_20_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aAirStat_SL_COMMENTTerminalRuleCall_13_q.equals(syntax))
				emit_aAirStat_SL_COMMENTTerminalRuleCall_13_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aAirStat_SL_COMMENTTerminalRuleCall_15_13_q.equals(syntax))
				emit_aAirStat_SL_COMMENTTerminalRuleCall_15_13_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aAirStat_WSTerminalRuleCall_0_q.equals(syntax))
				emit_aAirStat_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aAirStat_WSTerminalRuleCall_12_q.equals(syntax))
				emit_aAirStat_WSTerminalRuleCall_12_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aAirStat_WSTerminalRuleCall_15_0_q.equals(syntax))
				emit_aAirStat_WSTerminalRuleCall_15_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aAirStat_WSTerminalRuleCall_15_12_q.equals(syntax))
				emit_aAirStat_WSTerminalRuleCall_15_12_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aAirfoilList_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_aAirfoilList_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aAirfoilList_SL_COMMENTTerminalRuleCall_7_3_q.equals(syntax))
				emit_aAirfoilList_SL_COMMENTTerminalRuleCall_7_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aAirfoilList_WSTerminalRuleCall_0_q.equals(syntax))
				emit_aAirfoilList_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aAirfoilList_WSTerminalRuleCall_4_q.equals(syntax))
				emit_aAirfoilList_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aAirfoilList_WSTerminalRuleCall_7_0_q.equals(syntax))
				emit_aAirfoilList_WSTerminalRuleCall_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aAirfoilList_WSTerminalRuleCall_7_2_q.equals(syntax))
				emit_aAirfoilList_WSTerminalRuleCall_7_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bCalcTwrAero_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_bCalcTwrAero_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bCalcTwrAero_WSTerminalRuleCall_0_q.equals(syntax))
				emit_bCalcTwrAero_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bCalcTwrAero_WSTerminalRuleCall_4_q.equals(syntax))
				emit_bCalcTwrAero_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bTwrPot_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_bTwrPot_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bTwrPot_WSTerminalRuleCall_0_q.equals(syntax))
				emit_bTwrPot_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bTwrPot_WSTerminalRuleCall_4_q.equals(syntax))
				emit_bTwrPot_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bTwrShd_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_bTwrShd_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bTwrShd_WSTerminalRuleCall_0_q.equals(syntax))
				emit_bTwrShd_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bTwrShd_WSTerminalRuleCall_4_q.equals(syntax))
				emit_bTwrShd_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_fTwrFile_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_fTwrFile_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_fTwrFile_WSTerminalRuleCall_0_q.equals(syntax))
				emit_fTwrFile_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_fTwrFile_WSTerminalRuleCall_4_q.equals(syntax))
				emit_fTwrFile_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_fWindFile_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_fWindFile_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_fWindFile_WSTerminalRuleCall_0_q.equals(syntax))
				emit_fWindFile_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_fWindFile_WSTerminalRuleCall_4_q.equals(syntax))
				emit_fWindFile_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iBldNodes_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_iBldNodes_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iBldNodes_WSTerminalRuleCall_0_q.equals(syntax))
				emit_iBldNodes_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iBldNodes_WSTerminalRuleCall_4_q.equals(syntax))
				emit_iBldNodes_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iNumFoil_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_iNumFoil_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iNumFoil_WSTerminalRuleCall_0_q.equals(syntax))
				emit_iNumFoil_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iNumFoil_WSTerminalRuleCall_4_q.equals(syntax))
				emit_iNumFoil_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nAtoler_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nAtoler_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nAtoler_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nAtoler_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nAtoler_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nAtoler_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nDTAero_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nDTAero_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nDTAero_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nDTAero_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nDTAero_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nDTAero_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nHH_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nHH_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nHH_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nHH_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nHH_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nHH_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nKinVisc_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nKinVisc_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nKinVisc_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nKinVisc_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nKinVisc_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nKinVisc_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nRho_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nRho_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nRho_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nRho_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nRho_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nRho_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nShadHWid_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nShadHWid_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nShadHWid_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nShadHWid_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nShadHWid_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nShadHWid_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTShadRefPt_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTShadRefPt_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTShadRefPt_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTShadRefPt_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTShadRefPt_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTShadRefPt_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrShad_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwrShad_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrShad_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwrShad_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrShad_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwrShad_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sHLModel_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_sHLModel_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sHLModel_WSTerminalRuleCall_0_q.equals(syntax))
				emit_sHLModel_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sHLModel_WSTerminalRuleCall_4_q.equals(syntax))
				emit_sHLModel_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sIndModel_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_sIndModel_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sIndModel_WSTerminalRuleCall_0_q.equals(syntax))
				emit_sIndModel_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sIndModel_WSTerminalRuleCall_4_q.equals(syntax))
				emit_sIndModel_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sInfModel_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_sInfModel_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sInfModel_WSTerminalRuleCall_0_q.equals(syntax))
				emit_sInfModel_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sInfModel_WSTerminalRuleCall_4_q.equals(syntax))
				emit_sInfModel_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sStallMod_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_sStallMod_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sStallMod_WSTerminalRuleCall_0_q.equals(syntax))
				emit_sStallMod_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sStallMod_WSTerminalRuleCall_4_q.equals(syntax))
				emit_sStallMod_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sTLModel_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_sTLModel_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sTLModel_WSTerminalRuleCall_0_q.equals(syntax))
				emit_sTLModel_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sTLModel_WSTerminalRuleCall_4_q.equals(syntax))
				emit_sTLModel_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sUnits_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_sUnits_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sUnits_WSTerminalRuleCall_0_q.equals(syntax))
				emit_sUnits_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sUnits_WSTerminalRuleCall_4_q.equals(syntax))
				emit_sUnits_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sUseCm_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_sUseCm_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sUseCm_WSTerminalRuleCall_0_q.equals(syntax))
				emit_sUseCm_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sUseCm_WSTerminalRuleCall_4_q.equals(syntax))
				emit_sUseCm_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (SL_COMMENT | NEWLINE | WS)*
	 */
	protected void emit_ModelFastadn___NEWLINETerminalRuleCall_20_1_or_SL_COMMENTTerminalRuleCall_20_2_or_WSTerminalRuleCall_20_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_aAirStat_SL_COMMENTTerminalRuleCall_13_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_aAirStat_SL_COMMENTTerminalRuleCall_15_13_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aAirStat_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aAirStat_WSTerminalRuleCall_12_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aAirStat_WSTerminalRuleCall_15_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aAirStat_WSTerminalRuleCall_15_12_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_aAirfoilList_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_aAirfoilList_SL_COMMENTTerminalRuleCall_7_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aAirfoilList_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aAirfoilList_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aAirfoilList_WSTerminalRuleCall_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aAirfoilList_WSTerminalRuleCall_7_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_bCalcTwrAero_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_bCalcTwrAero_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_bCalcTwrAero_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_bTwrPot_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_bTwrPot_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_bTwrPot_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_bTwrShd_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_bTwrShd_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_bTwrShd_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_fTwrFile_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_fTwrFile_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_fTwrFile_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_fWindFile_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_fWindFile_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_fWindFile_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_iBldNodes_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_iBldNodes_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_iBldNodes_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_iNumFoil_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_iNumFoil_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_iNumFoil_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nAtoler_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nAtoler_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nAtoler_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nDTAero_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nDTAero_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nDTAero_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nHH_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nHH_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nHH_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nKinVisc_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nKinVisc_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nKinVisc_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nRho_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nRho_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nRho_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nShadHWid_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nShadHWid_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nShadHWid_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTShadRefPt_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTShadRefPt_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTShadRefPt_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwrShad_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwrShad_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwrShad_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_sHLModel_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sHLModel_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sHLModel_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_sIndModel_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sIndModel_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sIndModel_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_sInfModel_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sInfModel_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sInfModel_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_sStallMod_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sStallMod_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sStallMod_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_sTLModel_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sTLModel_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sTLModel_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_sUnits_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sUnits_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sUnits_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_sUseCm_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sUseCm_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sUseCm_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
