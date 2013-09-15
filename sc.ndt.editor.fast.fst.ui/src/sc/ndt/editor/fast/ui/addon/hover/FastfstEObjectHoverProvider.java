package sc.ndt.editor.fast.ui.addon.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import sc.ndt.editor.fast.fastfst.*;

public class FastfstEObjectHoverProvider extends DefaultEObjectHoverProvider {
 
	// TODO complete with all cases
	// TODO find clever way to do this, eg. using annotations
	
    @Override
    protected String getFirstLine(EObject o) {
        if (o instanceof bEcho) {
            return "Type: flag [-]";
        }
        return super.getFirstLine(o);
    }

}
