package sc.ndt.editor.iecwind.serializer;

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
import sc.ndt.editor.iecwind.services.IecwindiecGrammarAccess;

@SuppressWarnings("all")
public class IecwindiecSyntacticSequencer extends AbstractSyntacticSequencer {

	protected IecwindiecGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ModelIecwindiec___NEWLINETerminalRuleCall_17_1_or_SL_COMMENTTerminalRuleCall_17_2_or_WSTerminalRuleCall_17_0__a;
	protected AbstractElementAlias match_iIECClass_SL_COMMENTTerminalRuleCall_3_q;
	protected AbstractElementAlias match_iIECClass_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_iIECStd_SL_COMMENTTerminalRuleCall_3_q;
	protected AbstractElementAlias match_iIECStd_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_iStart_SL_COMMENTTerminalRuleCall_3_q;
	protected AbstractElementAlias match_iStart_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nHubHeight_SL_COMMENTTerminalRuleCall_3_q;
	protected AbstractElementAlias match_nHubHeight_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nRotDiam_SL_COMMENTTerminalRuleCall_3_q;
	protected AbstractElementAlias match_nRotDiam_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nWindIn_SL_COMMENTTerminalRuleCall_3_q;
	protected AbstractElementAlias match_nWindIn_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nWindNom_SL_COMMENTTerminalRuleCall_3_q;
	protected AbstractElementAlias match_nWindNom_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nWindOut_SL_COMMENTTerminalRuleCall_3_q;
	protected AbstractElementAlias match_nWindOut_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nWindSlope_SL_COMMENTTerminalRuleCall_3_q;
	protected AbstractElementAlias match_nWindSlope_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_sWindTurb_SL_COMMENTTerminalRuleCall_3_q;
	protected AbstractElementAlias match_sWindTurb_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_siUnits_SL_COMMENTTerminalRuleCall_3_q;
	protected AbstractElementAlias match_siUnits_WSTerminalRuleCall_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IecwindiecGrammarAccess) access;
		match_ModelIecwindiec___NEWLINETerminalRuleCall_17_1_or_SL_COMMENTTerminalRuleCall_17_2_or_WSTerminalRuleCall_17_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getModelIecwindiecAccess().getNEWLINETerminalRuleCall_17_1()), new TokenAlias(false, false, grammarAccess.getModelIecwindiecAccess().getSL_COMMENTTerminalRuleCall_17_2()), new TokenAlias(false, false, grammarAccess.getModelIecwindiecAccess().getWSTerminalRuleCall_17_0()));
		match_iIECClass_SL_COMMENTTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getIIECClassAccess().getSL_COMMENTTerminalRuleCall_3());
		match_iIECClass_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getIIECClassAccess().getWSTerminalRuleCall_0());
		match_iIECStd_SL_COMMENTTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getIIECStdAccess().getSL_COMMENTTerminalRuleCall_3());
		match_iIECStd_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getIIECStdAccess().getWSTerminalRuleCall_0());
		match_iStart_SL_COMMENTTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getIStartAccess().getSL_COMMENTTerminalRuleCall_3());
		match_iStart_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getIStartAccess().getWSTerminalRuleCall_0());
		match_nHubHeight_SL_COMMENTTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getNHubHeightAccess().getSL_COMMENTTerminalRuleCall_3());
		match_nHubHeight_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNHubHeightAccess().getWSTerminalRuleCall_0());
		match_nRotDiam_SL_COMMENTTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getNRotDiamAccess().getSL_COMMENTTerminalRuleCall_3());
		match_nRotDiam_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNRotDiamAccess().getWSTerminalRuleCall_0());
		match_nWindIn_SL_COMMENTTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getNWindInAccess().getSL_COMMENTTerminalRuleCall_3());
		match_nWindIn_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNWindInAccess().getWSTerminalRuleCall_0());
		match_nWindNom_SL_COMMENTTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getNWindNomAccess().getSL_COMMENTTerminalRuleCall_3());
		match_nWindNom_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNWindNomAccess().getWSTerminalRuleCall_0());
		match_nWindOut_SL_COMMENTTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getNWindOutAccess().getSL_COMMENTTerminalRuleCall_3());
		match_nWindOut_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNWindOutAccess().getWSTerminalRuleCall_0());
		match_nWindSlope_SL_COMMENTTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getNWindSlopeAccess().getSL_COMMENTTerminalRuleCall_3());
		match_nWindSlope_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNWindSlopeAccess().getWSTerminalRuleCall_0());
		match_sWindTurb_SL_COMMENTTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getSWindTurbAccess().getSL_COMMENTTerminalRuleCall_3());
		match_sWindTurb_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getSWindTurbAccess().getWSTerminalRuleCall_0());
		match_siUnits_SL_COMMENTTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getSiUnitsAccess().getSL_COMMENTTerminalRuleCall_3());
		match_siUnits_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getSiUnitsAccess().getWSTerminalRuleCall_0());
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
	 * terminal SL_COMMENT	: "!" !('\r'|'\n'|'\r\n')*;
	 */
	protected String getSL_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "!";
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
			if(match_ModelIecwindiec___NEWLINETerminalRuleCall_17_1_or_SL_COMMENTTerminalRuleCall_17_2_or_WSTerminalRuleCall_17_0__a.equals(syntax))
				emit_ModelIecwindiec___NEWLINETerminalRuleCall_17_1_or_SL_COMMENTTerminalRuleCall_17_2_or_WSTerminalRuleCall_17_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iIECClass_SL_COMMENTTerminalRuleCall_3_q.equals(syntax))
				emit_iIECClass_SL_COMMENTTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iIECClass_WSTerminalRuleCall_0_q.equals(syntax))
				emit_iIECClass_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iIECStd_SL_COMMENTTerminalRuleCall_3_q.equals(syntax))
				emit_iIECStd_SL_COMMENTTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iIECStd_WSTerminalRuleCall_0_q.equals(syntax))
				emit_iIECStd_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iStart_SL_COMMENTTerminalRuleCall_3_q.equals(syntax))
				emit_iStart_SL_COMMENTTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iStart_WSTerminalRuleCall_0_q.equals(syntax))
				emit_iStart_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nHubHeight_SL_COMMENTTerminalRuleCall_3_q.equals(syntax))
				emit_nHubHeight_SL_COMMENTTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nHubHeight_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nHubHeight_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nRotDiam_SL_COMMENTTerminalRuleCall_3_q.equals(syntax))
				emit_nRotDiam_SL_COMMENTTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nRotDiam_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nRotDiam_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nWindIn_SL_COMMENTTerminalRuleCall_3_q.equals(syntax))
				emit_nWindIn_SL_COMMENTTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nWindIn_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nWindIn_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nWindNom_SL_COMMENTTerminalRuleCall_3_q.equals(syntax))
				emit_nWindNom_SL_COMMENTTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nWindNom_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nWindNom_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nWindOut_SL_COMMENTTerminalRuleCall_3_q.equals(syntax))
				emit_nWindOut_SL_COMMENTTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nWindOut_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nWindOut_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nWindSlope_SL_COMMENTTerminalRuleCall_3_q.equals(syntax))
				emit_nWindSlope_SL_COMMENTTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nWindSlope_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nWindSlope_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sWindTurb_SL_COMMENTTerminalRuleCall_3_q.equals(syntax))
				emit_sWindTurb_SL_COMMENTTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_sWindTurb_WSTerminalRuleCall_0_q.equals(syntax))
				emit_sWindTurb_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_siUnits_SL_COMMENTTerminalRuleCall_3_q.equals(syntax))
				emit_siUnits_SL_COMMENTTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_siUnits_WSTerminalRuleCall_0_q.equals(syntax))
				emit_siUnits_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (SL_COMMENT | WS | NEWLINE)*
	 */
	protected void emit_ModelIecwindiec___NEWLINETerminalRuleCall_17_1_or_SL_COMMENTTerminalRuleCall_17_2_or_WSTerminalRuleCall_17_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_iIECClass_SL_COMMENTTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_iIECClass_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_iIECStd_SL_COMMENTTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_iIECStd_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_iStart_SL_COMMENTTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_iStart_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nHubHeight_SL_COMMENTTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nHubHeight_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nRotDiam_SL_COMMENTTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nRotDiam_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nWindIn_SL_COMMENTTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nWindIn_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nWindNom_SL_COMMENTTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nWindNom_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nWindOut_SL_COMMENTTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nWindOut_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nWindSlope_SL_COMMENTTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nWindSlope_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_sWindTurb_SL_COMMENTTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_sWindTurb_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_siUnits_SL_COMMENTTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_siUnits_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
