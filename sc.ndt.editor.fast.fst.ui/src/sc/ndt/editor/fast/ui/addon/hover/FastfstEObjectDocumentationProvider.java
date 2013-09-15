package sc.ndt.editor.fast.ui.addon.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

import sc.ndt.editor.fast.fastfst.*;

public class FastfstEObjectDocumentationProvider implements IEObjectDocumentationProvider {
 
	// TODO complete with all cases
	// TODO find clever way to do this, eg. using annotations
			
    @Override
    public String getDocumentation(EObject o) {
        if (o instanceof bEcho)
            return "Echo input data to \"echo.out\"";
        return null;
    }
    
}
