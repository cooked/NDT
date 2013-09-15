package sc.ndt.editor.fast.ui.addon.folding;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.FoldedPosition;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.ITextRegion;
import sc.ndt.editor.fast.fastfst.Section;
import sc.ndt.editor.fast.fastfst.vOutList;


public class FastfstFoldingRegionProvider extends DefaultFoldingRegionProvider {

	// SC see
	// http://www.eclipse.org/forums/index.php/mv/tree/170825/#page_top
	
	@Override
	public Collection<FoldedPosition> getFoldingRegions(IXtextDocument xtextDocument) {
		// TODO Auto-generated method stub
		return super.getFoldingRegions(xtextDocument);
	}

	@Override
	protected Collection<FoldedPosition> doGetFoldingRegions(
			IXtextDocument xtextDocument, XtextResource xtextResource) {
		// TODO Auto-generated method stub
		return super.doGetFoldingRegions(xtextDocument, xtextResource);
	}
	
	
	ArrayList<ICompositeNode> nodes = new ArrayList<ICompositeNode>();
	
	@Override
	protected void computeObjectFolding(XtextResource xtextResource, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		IParseResult parseResult = xtextResource.getParseResult();
		if(parseResult != null){
			EObject rootASTElement = parseResult.getRootASTElement();
			if(rootASTElement != null){
				TreeIterator<EObject> contents = rootASTElement.eAllContents();
				while(contents.hasNext()) {
					EObject eObject = contents.next();
					
					if(eObject instanceof Section || eObject instanceof vOutList)
						nodes.add(NodeModelUtils.findActualNodeFor(eObject));
				}
				
				Object[] na = nodes.toArray();
				for(int i=1; i<na.length; i++) {
					//ITextRegion reg0 = getLocationInFileProvider().getSignificantTextRegion(((ICompositeNode)na[i-1]).getGrammarElement());
					//ITextRegion reg1 = getLocationInFileProvider().getSignificantTextRegion(((ICompositeNode)na[i]).getGrammarElement());
					int n0 = ((ICompositeNode)na[i-1]).getOffset();
					int n1 = ((ICompositeNode)na[i]).getOffset();
					int diff = n1-n0;
					if(diff>=0)
						foldingRegionAcceptor.accept(n0,(diff==1)?1:diff-1);
				}
				
			}
		}
	}
	
	/*protected void computeObjectFolding(EObject eObject, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		ITextRegion region = getLocationInFileProvider().getFullTextRegion(eObject);
		if (region != null) {
			ITextRegion significant = getLocationInFileProvider().getSignificantTextRegion(eObject);
			if(significant == null)
				throw new NullPointerException("significant region may not be null");
			int offset = region.getOffset();
			foldingRegionAcceptor.accept(offset, region.getLength(), significant);
		}
		
		/*if(eObject instanceof Section) {
		      
			ICompositeNode node = NodeModelUtils.findActualNodeFor(eObject);
			
			ITextRegion region = new TextRegion(node.getOffset(), node.getText().trim().length());
			  
			  
		      int offset = region.getOffset();
				foldingRegionAcceptor.accept(offset, region.getLength(), significant);
				
		   
	}*/
	
}
