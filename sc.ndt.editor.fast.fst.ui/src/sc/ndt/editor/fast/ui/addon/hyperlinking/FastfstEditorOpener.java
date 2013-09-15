package sc.ndt.editor.fast.ui.addon.hyperlinking;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import sc.ndt.editor.fast.fastfst.*;

public class FastfstEditorOpener extends LanguageSpecificURIEditorOpener {

	private static final Logger logger = Logger.getLogger(FastfstEditorOpener.class);

	/*@Inject
	@Named(Constants.LANGUAGE_NAME)
	private String editorID;
	*/
	
	private String toEditorID;

	private IFile loadURI(URI uri) {
		
		// see 
		// http://www.eclipsezone.com/eclipse/forums/t59128.html
		// http://lmap.blogspot.it/2008/03/platform-scheme-uri.html
				
		IWorkspaceRoot wsr = ResourcesPlugin.getWorkspace().getRoot();

		StringBuffer platformResourcePath = new StringBuffer();
			for (int j = 1, size = uri.segmentCount(); j < size; ++j)
				platformResourcePath.append('/').append(uri.segment(j));
			
			// TODO check differently 
			Path pth = new Path(platformResourcePath.toString());
			if(pth.segmentCount()<2)
				return null;
			IFile file = wsr.getFile(pth);
			if(file.exists()==false)
				return null;
		
		return file; // no error
	}
	
	public IEditorPart open(URI uri, EObject element, boolean select) {
	
		// see http://www.eclipse.org/forums/index.php/mv/tree/166360/#page_top
		if(element instanceof fADFile)
			toEditorID = "sc.ndt.editor.fast.Fastadn";
		else if (element instanceof fTwrFile)
			toEditorID = "sc.ndt.editor.fast.Fasttwr";
		else if (element instanceof fBldFile_1_ ||
				 element instanceof fBldFile_2_ ||
				 element instanceof fBldFile_3_)
			toEditorID = "sc.ndt.editor.fast.Fastbld";
				
		return open(uri, null, -1, select);
	}
	
	@Override
	public IEditorPart open(URI uri, EReference crossReference,
			int indexInList, boolean select) {

		IFile file = null;
		try {
			
			file = loadURI(uri); 
						
			if (file != null) {
				IEditorInput editorInput = new FileEditorInput(file);
				if (getWorkbench() != null) {
					IWorkbenchPage activePage = getWorkbench()
							.getActiveWorkbenchWindow().getActivePage();
					IEditorPart editor = IDE.openEditor(
							activePage,
							editorInput, 
							toEditorID);
					selectAndReveal(editor, uri, crossReference, indexInList,
							select);
					return EditorUtils.getXtextEditor(editor);
				}
				return null;
			}
		} catch (WrappedException e) {
			logger.error("Error while opening editor part for EMF URI '" +
			uri
			+ "'", e.getCause());
		} catch (PartInitException partInitException) {
			logger.error("Error while opening editor part for EMF URI '" +
			uri
			+ "'", partInitException);
		}
		return null;
	}
	
	protected IWorkbench getWorkbench() {
		return PlatformUI.getWorkbench();
	}

}