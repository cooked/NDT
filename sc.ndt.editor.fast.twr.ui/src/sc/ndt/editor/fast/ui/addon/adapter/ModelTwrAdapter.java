package sc.ndt.editor.fast.ui.addon.adapter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;

import sc.ndt.editor.fast.fasttwr.ModelFasttwr;
import sc.ndt.editor.fast.ui.internal.FasttwrActivator;

import com.google.inject.Injector;

@SuppressWarnings("rawtypes")
public class ModelTwrAdapter implements IAdapterFactory {
	
	final private static Injector injector = FasttwrActivator
			.getInstance().getInjector(FasttwrActivator.SC_NDT_EDITOR_FAST_FASTTWR);
	
    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adapterType == ModelFasttwr.class) {
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
            if (adaptableObject instanceof IFile) {
                final IFile file = (IFile)adaptableObject;
                
                XtextResourceSet resourceSet = (XtextResourceSet) injector
                    .getInstance(XtextResourceSetProvider.class)
                    .get(file.getProject());
                resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
                Resource resource = resourceSet.getResource(URI.createURI(file.getLocationURI().toString()),true);
                ModelFasttwr model = (ModelFasttwr) resource.getContents().get(0);
                return model;
            }
            if (adaptableObject instanceof IFileEditorInput) {
            	return injector.getInstance(XtextEditor.class);
            }
        } 
 
        return null;
    }
 
    @Override
    public Class[] getAdapterList() {
        return new Class[] { ModelFasttwr.class };
    }
}
