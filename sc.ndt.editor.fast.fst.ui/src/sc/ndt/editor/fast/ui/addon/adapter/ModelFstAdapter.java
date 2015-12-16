package sc.ndt.editor.fast.ui.addon.adapter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;

import sc.ndt.editor.fast.fastfst.ModelFastfst;
import sc.ndt.editor.fast.ui.internal.FastfstActivator;

import com.google.inject.Injector;

@SuppressWarnings("rawtypes")
public class ModelFstAdapter implements IAdapterFactory {
	
	final private static Injector injector = FastfstActivator
			.getInstance().getInjector(FastfstActivator.SC_NDT_EDITOR_FAST_FASTFST);
	
	ModelFastfst model;
	
    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adapterType == ModelFastfst.class) {
            if (injector==null)
                return null;
            
            if (adaptableObject instanceof ISelection) {
                final ISelection sel = (ISelection)adaptableObject;
                if (!(sel instanceof IStructuredSelection)) return null;
                final IStructuredSelection selection = (IStructuredSelection) sel;
                if (!(selection.getFirstElement() instanceof IFile))
                    return null;
                adaptableObject = (IFile)selection.getFirstElement();
            }
            
            // adapt IFile to return the model
            if (adaptableObject instanceof IFile) {
                final IFile file = (IFile)adaptableObject;
                
                XtextResourceSet resourceSet = (XtextResourceSet) injector
                    .getInstance(XtextResourceSetProvider.class)
                    .get(file.getProject());
                resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
                Resource resource = resourceSet.getResource(URI.createURI(file.getLocationURI().toString()),true);
                ModelFastfst model = (ModelFastfst) resource.getContents().get(0);
                return model;
            }
            
            // adapt IFileEditorInput to return the editor
            if (adaptableObject instanceof IFileEditorInput) {
            	return injector.getInstance(XtextEditor.class);
            }
            
            // adapt IContentOutline to return the OutChannel from the model
            /*if (adaptableObject instanceof IContentOutlinePage) {
            	Fastinjector.getInstance(XtextEditor.class)
            	fxe.outList.getAllOutBlocks());
            }*/
            
            
        } 
 
        return null;
    }
 
    @Override
    public Class[] getAdapterList() {
        return new Class[] { ModelFastfst.class };
    }
}
