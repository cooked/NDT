package sc.ndt.editor.bmodes.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import sc.ndt.editor.bmodes.services.BmodesoutGrammarAccess;

@SuppressWarnings("all")
public class BmodesoutSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BmodesoutGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Header_EqualsSignKeyword_13_p;
	protected AbstractElementAlias match_Mode_EqualsSignKeyword_18_a;
	protected AbstractElementAlias match_Mode_NEWLINETerminalRuleCall_19_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BmodesoutGrammarAccess) access;
		match_Header_EqualsSignKeyword_13_p = new TokenAlias(true, false, grammarAccess.getHeaderAccess().getEqualsSignKeyword_13());
		match_Mode_EqualsSignKeyword_18_a = new TokenAlias(true, true, grammarAccess.getModeAccess().getEqualsSignKeyword_18());
		match_Mode_NEWLINETerminalRuleCall_19_q = new TokenAlias(false, true, grammarAccess.getModeAccess().getNEWLINETerminalRuleCall_19());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getDATERule())
			return getDATEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNEWLINERule())
			return getNEWLINEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTIMERule())
			return getTIMEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVERRule())
			return getVERToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal DATE					: INT'-'MONTH'-'INT;
	 */
	protected String getDATEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "--";
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
	 * terminal TIME					: INT':'INT':'INT;
	 */
	protected String getTIMEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "::";
	}
	
	/**
	 * terminal VER					: 'v'INT'.'INT'.'INT;
	 */
	protected String getVERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "v..";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Header_EqualsSignKeyword_13_p.equals(syntax))
				emit_Header_EqualsSignKeyword_13_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Mode_EqualsSignKeyword_18_a.equals(syntax))
				emit_Mode_EqualsSignKeyword_18_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Mode_NEWLINETerminalRuleCall_19_q.equals(syntax))
				emit_Mode_NEWLINETerminalRuleCall_19_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '='+
	 */
	protected void emit_Header_EqualsSignKeyword_13_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '='*
	 */
	protected void emit_Mode_EqualsSignKeyword_18_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NEWLINE?
	 */
	protected void emit_Mode_NEWLINETerminalRuleCall_19_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
