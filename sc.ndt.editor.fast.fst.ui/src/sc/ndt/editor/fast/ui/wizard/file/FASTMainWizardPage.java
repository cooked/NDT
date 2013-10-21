package sc.ndt.editor.fast.ui.wizard.file;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.osgi.framework.Bundle;

public class FASTMainWizardPage extends WizardNewFileCreationPage {

	static Bundle commonsBundle;
		
	/**
	 * Create the wizard.
	 */
	public FASTMainWizardPage(IStructuredSelection selection) {
        super("NewConfigFileWizardPage",selection);
        setTitle("FAST Main File");
        setDescription("Creates a new FAST main file for time-marching simulation");
        setFileExtension("fst");
	}
	
	@Override
    protected InputStream getInitialContents() {
		
		commonsBundle = Platform.getBundle("sc.ndt.commons");
		
        try {
        	InputStream inputStream = 
        			commonsBundle.getEntry("templates/FAST.fst").openStream();
        	return inputStream;
        } catch (IOException e) {
            return null;
        }
        
    }

}
