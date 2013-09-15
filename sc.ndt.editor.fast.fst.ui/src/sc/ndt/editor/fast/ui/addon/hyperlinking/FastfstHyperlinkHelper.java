package sc.ndt.editor.fast.ui.addon.hyperlinking;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.common.types.xtext.ui.TypeAwareHyperlinkHelper;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class FastfstHyperlinkHelper extends TypeAwareHyperlinkHelper  {

	// ABOUT
	// see (OLD) http://www.eclipse.org/forums/index.php/mv/tree/158247/#page_top
			
	// cross reference
	// http://stackoverflow.com/questions/5789012/xtext-custom-cross-references
		
	// HYPERLINKING
	// http://www.eclipse.org/forums/index.php/m/648711/
	// http://code.google.com/a/eclipselabs.org/p/spray/source/browse/plugins/org.eclipselabs.spray.runtime.xtext.ui/src/org/eclipselabs/spray/runtime/xtext/ui/linking/DSLLinkingHelper.java?spec=svndd8dfbf3ff933b819040543f37976c3992a24840&r=dd8dfbf3ff933b819040543f37976c3992a24840
		
	// XText help :
	//The hyperlinks are provided by the HyperlinkHelper (src) which will create links for 
	// cross-referenced objects by default. Clients may want to override 
	// createHyperlinksByOffset(XtextResource, int, IHyperlinkAcceptor) to provide additional 
	// links or supersede the default implementation. 
	
	@Inject
	protected Provider<XtextHyperlink> hyperlinkProvider;

	@Inject
	FastfstEditorOpener fstEdtrOpnr;
	
	private ILeafNode leaf;
	
	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset, IHyperlinkAcceptor acceptor) {
	
		IParseResult parseResult = resource.getParseResult();
		if (parseResult != null && parseResult.getRootNode() != null) {
			leaf = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
			
			AbstractRule ar = ((RuleCall)leaf.getParent().getGrammarElement()).getRule();
			
			if( ar.getName().startsWith("f") &&
					leaf.getGrammarElement() instanceof RuleCall) {
				RuleCall rc = (RuleCall)leaf.getGrammarElement();
				AbstractRule rule = rc.getRule();
				if (rule.getName().equalsIgnoreCase("STRING")) {
					String text = leaf.getText().substring(1, leaf.getText().length()-1);
					
					/*XtextHyperlink result = hyperlinkProvider.get();
					result.setHyperlinkRegion(new Region(leaf.getOffset()+1, leaf.getLength()-2)); // omit ""
					 
					URI uri = resource.getURI();
					result.setURI(uri);
					result.setHyperlinkText(text);
					acceptor.accept(result);
					*/
					//final URIConverter uriConverter = resource.getResourceSet().getURIConverter();
					//final URI uri = EcoreUtil.getURI(text);
                    
					URI fstURI = resource.getURI();
					final URI uri = URI.createFileURI(text).resolve(fstURI);
						
						
					// get project
					//final URI normalized = uriConverter.normalize(URI.createPlatformResourceURI("aaa/"+text,true));
                    
					XtextHyperlink result = new XtextHyperlink() {

						@Override
						public void open() {

                            boolean select = true;
                            fstEdtrOpnr.open(
                            		uri, 
                            		leaf.getParent().getSemanticElement(),
                            		select);
                        }

	                };
	                result.setHyperlinkRegion(new Region(leaf.getOffset()+1, leaf.getLength()-2));
	                result.setURI(uri);
	                result.setHyperlinkText("prova");
	                acceptor.accept(result);
				}
			}
		}
				
		super.createHyperlinksByOffset(resource, offset, acceptor);
		
	}
		
}
