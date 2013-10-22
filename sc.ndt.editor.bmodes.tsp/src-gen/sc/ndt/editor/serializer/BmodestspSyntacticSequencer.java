package sc.ndt.editor.serializer;

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
import sc.ndt.editor.services.BmodestspGrammarAccess;

@SuppressWarnings("all")
public class BmodestspSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BmodestspGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ModelBmodestsp___NEWLINETerminalRuleCall_4_1_or_SL_COMMENTTerminalRuleCall_4_2_or_WSTerminalRuleCall_4_0__a;
	protected AbstractElementAlias match_aSec_SL_COMMENTTerminalRuleCall_27_q;
	protected AbstractElementAlias match_aSec_SL_COMMENTTerminalRuleCall_56_q;
	protected AbstractElementAlias match_aSec_SL_COMMENTTerminalRuleCall_58_27_q;
	protected AbstractElementAlias match_aSec_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_aSec_WSTerminalRuleCall_26_q;
	protected AbstractElementAlias match_aSec_WSTerminalRuleCall_29_q;
	protected AbstractElementAlias match_aSec_WSTerminalRuleCall_55_q;
	protected AbstractElementAlias match_aSec_WSTerminalRuleCall_58_0_q;
	protected AbstractElementAlias match_aSec_WSTerminalRuleCall_58_26_q;
	protected AbstractElementAlias match_iNodes_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_iNodes_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_iNodes_WSTerminalRuleCall_4_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BmodestspGrammarAccess) access;
		match_ModelBmodestsp___NEWLINETerminalRuleCall_4_1_or_SL_COMMENTTerminalRuleCall_4_2_or_WSTerminalRuleCall_4_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getModelBmodestspAccess().getNEWLINETerminalRuleCall_4_1()), new TokenAlias(false, false, grammarAccess.getModelBmodestspAccess().getSL_COMMENTTerminalRuleCall_4_2()), new TokenAlias(false, false, grammarAccess.getModelBmodestspAccess().getWSTerminalRuleCall_4_0()));
		match_aSec_SL_COMMENTTerminalRuleCall_27_q = new TokenAlias(false, true, grammarAccess.getASecAccess().getSL_COMMENTTerminalRuleCall_27());
		match_aSec_SL_COMMENTTerminalRuleCall_56_q = new TokenAlias(false, true, grammarAccess.getASecAccess().getSL_COMMENTTerminalRuleCall_56());
		match_aSec_SL_COMMENTTerminalRuleCall_58_27_q = new TokenAlias(false, true, grammarAccess.getASecAccess().getSL_COMMENTTerminalRuleCall_58_27());
		match_aSec_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getASecAccess().getWSTerminalRuleCall_0());
		match_aSec_WSTerminalRuleCall_26_q = new TokenAlias(false, true, grammarAccess.getASecAccess().getWSTerminalRuleCall_26());
		match_aSec_WSTerminalRuleCall_29_q = new TokenAlias(false, true, grammarAccess.getASecAccess().getWSTerminalRuleCall_29());
		match_aSec_WSTerminalRuleCall_55_q = new TokenAlias(false, true, grammarAccess.getASecAccess().getWSTerminalRuleCall_55());
		match_aSec_WSTerminalRuleCall_58_0_q = new TokenAlias(false, true, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_0());
		match_aSec_WSTerminalRuleCall_58_26_q = new TokenAlias(false, true, grammarAccess.getASecAccess().getWSTerminalRuleCall_58_26());
		match_iNodes_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getINodesAccess().getSL_COMMENTTerminalRuleCall_5());
		match_iNodes_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getINodesAccess().getWSTerminalRuleCall_0());
		match_iNodes_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getINodesAccess().getWSTerminalRuleCall_4());
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
			if(match_ModelBmodestsp___NEWLINETerminalRuleCall_4_1_or_SL_COMMENTTerminalRuleCall_4_2_or_WSTerminalRuleCall_4_0__a.equals(syntax))
				emit_ModelBmodestsp___NEWLINETerminalRuleCall_4_1_or_SL_COMMENTTerminalRuleCall_4_2_or_WSTerminalRuleCall_4_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aSec_SL_COMMENTTerminalRuleCall_27_q.equals(syntax))
				emit_aSec_SL_COMMENTTerminalRuleCall_27_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aSec_SL_COMMENTTerminalRuleCall_56_q.equals(syntax))
				emit_aSec_SL_COMMENTTerminalRuleCall_56_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aSec_SL_COMMENTTerminalRuleCall_58_27_q.equals(syntax))
				emit_aSec_SL_COMMENTTerminalRuleCall_58_27_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aSec_WSTerminalRuleCall_0_q.equals(syntax))
				emit_aSec_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aSec_WSTerminalRuleCall_26_q.equals(syntax))
				emit_aSec_WSTerminalRuleCall_26_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aSec_WSTerminalRuleCall_29_q.equals(syntax))
				emit_aSec_WSTerminalRuleCall_29_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aSec_WSTerminalRuleCall_55_q.equals(syntax))
				emit_aSec_WSTerminalRuleCall_55_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aSec_WSTerminalRuleCall_58_0_q.equals(syntax))
				emit_aSec_WSTerminalRuleCall_58_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aSec_WSTerminalRuleCall_58_26_q.equals(syntax))
				emit_aSec_WSTerminalRuleCall_58_26_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iNodes_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_iNodes_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iNodes_WSTerminalRuleCall_0_q.equals(syntax))
				emit_iNodes_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_iNodes_WSTerminalRuleCall_4_q.equals(syntax))
				emit_iNodes_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (SL_COMMENT | WS | NEWLINE)*
	 */
	protected void emit_ModelBmodestsp___NEWLINETerminalRuleCall_4_1_or_SL_COMMENTTerminalRuleCall_4_2_or_WSTerminalRuleCall_4_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_aSec_SL_COMMENTTerminalRuleCall_27_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_aSec_SL_COMMENTTerminalRuleCall_56_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_aSec_SL_COMMENTTerminalRuleCall_58_27_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aSec_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aSec_WSTerminalRuleCall_26_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aSec_WSTerminalRuleCall_29_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aSec_WSTerminalRuleCall_55_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aSec_WSTerminalRuleCall_58_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aSec_WSTerminalRuleCall_58_26_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_iNodes_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_iNodes_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_iNodes_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
