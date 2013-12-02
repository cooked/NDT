package sc.ndt.editor.fast.ui.addon.coloring;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.impl.KeywordImpl;
import org.eclipse.xtext.impl.RuleCallImpl;
import org.eclipse.xtext.impl.TerminalRuleImpl;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSyntaxError;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.impl.LeafNode;
import org.eclipse.xtext.nodemodel.impl.RootNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;


import static sc.ndt.editor.fast.ui.addon.coloring.FastadnHighlightingConfiguration.*;


public class FastadnSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	private EObject 		se;
	private List<INode> 	lv;
	private RuleCallImpl 	rc;
	
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {

		if (resource == null || resource.getParseResult() == null)
			return;

		INode root = resource.getParseResult().getRootNode();
		BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
				
		while(it.hasNext()){
			
			INode node = it.next();
					
			if( node instanceof RootNode )  {
			
			} else if( node instanceof CompositeNodeWithSemanticElement  )  {
				
				se = node.getSemanticElement();
				
				EStructuralFeature esfValue = se.eClass().getEStructuralFeature(VALUE);
				if(esfValue!=null) {
					lv = NodeModelUtils.findNodesForFeature(se, se.eClass().getEStructuralFeature(VALUE));
				
					if(	lv!=null && lv.size()>0 && !(lv.get(0) instanceof CompositeNodeWithSyntaxError)) {
						
						INode n = lv.get(0);
						rc = (RuleCallImpl)n.getGrammarElement();
				
						if(rc.getRule().getName().equalsIgnoreCase(BOOL)) {
							EObject cn = ((CompositeNode)n).getFirstChild().getGrammarElement();
							if( cn instanceof KeywordImpl) {
								KeywordImpl ki = (KeywordImpl)cn;
								String kk = ki.getValue().toLowerCase();
								if(kk.startsWith("t"))
									kk="true";
								else if(kk.startsWith("f"))
									kk="false";
								if( Boolean.parseBoolean(kk.toLowerCase()) )
									acceptor.addPosition( n.getOffset(), n.getLength(), BOOL);
								else
									acceptor.addPosition( n.getOffset(), n.getLength(), BOOL_F);
							}
						} else if(rc.getRule().getName().equalsIgnoreCase(NUMBER))
							acceptor.addPosition( n.getOffset(), n.getLength(), NUMBER);
						else if( rc.getRule().getName().equalsIgnoreCase(STRING))
							acceptor.addPosition( n.getOffset(), n.getLength(), STRING);
						else if( rc.getRule().getName().equalsIgnoreCase(NODES))
							acceptor.addPosition( n.getOffset(), n.getLength(), NODES);
						
					}
				}
				
				EStructuralFeature esfName = se.eClass().getEStructuralFeature(NAME);
				if(esfName!=null) {
					lv = NodeModelUtils.findNodesForFeature(se, se.eClass().getEStructuralFeature(NAME));
					
					if(lv!=null && lv.size()>0) {
						INode n = lv.get(0);
						acceptor.addPosition( n.getOffset(), n.getLength(), NAME );
					} 
				}
				
				EStructuralFeature esfURI = se.eClass().getEStructuralFeature(URI);
				if(esfURI!=null) {
					lv = NodeModelUtils.findNodesForFeature(se, se.eClass().getEStructuralFeature(URI));
					
					if(lv!=null && lv.size()>0) {
						INode n = lv.get(0);
						acceptor.addPosition( n.getOffset(), n.getLength(), URI );
					} 
				}
				
			} else if( node instanceof LeafNode && node.getGrammarElement() instanceof RuleCallImpl )  {
				
				rc = (RuleCallImpl)node.getGrammarElement();
			
				if( rc.getRule().getName().equalsIgnoreCase(SL_COMMENT) ) 
					acceptor.addPosition( node.getOffset(), node.getLength(), SL_COMMENT );
			
			} else if ( node.getGrammarElement() instanceof TerminalRuleImpl ) {
				
				TerminalRuleImpl ge = (TerminalRuleImpl) node.getGrammarElement();
				if( ge.getName().equalsIgnoreCase(SL_COMMENT) ) 
					acceptor.addPosition( node.getOffset(), node.getLength(), SL_COMMENT );
			
			} else if ( node instanceof HiddenLeafNode && node.getGrammarElement() instanceof TerminalRuleImpl ) {
				
				TerminalRuleImpl ge = (TerminalRuleImpl) node.getGrammarElement();
				if( ge.getName().equalsIgnoreCase( SL_COMMENT )); 
					acceptor.addPosition( node.getOffset(), node.getLength(), SL_COMMENT );
				
			}
		}
		
	}

}
