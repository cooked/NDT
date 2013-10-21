package sc.ndt.editor.fast.ui.addon.nature;

import org.eclipse.xtext.ui.editor.AbstractDirtyStateAwareEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class NatureAddingEditorCallback extends AbstractDirtyStateAwareEditorCallback {
	
	//@Inject
	//private ToggleXtextNatureAction toggleNature;

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		super.afterCreatePartControl(editor);
		
		// add no nature
		
		/*IResource resource = editor.getResource();
		if (resource!=null && !toggleNature.hasNature(resource.getProject()) && resource.getProject().isAccessible() && !resource.getProject().isHidden()) {
			String title = Messages.NatureAddingEditorCallback_MessageDialog_Title;
			String message = Messages.NatureAddingEditorCallback_MessageDialog_Msg0 + resource.getProject().getName() + Messages.NatureAddingEditorCallback_MessageDialog_Msg1;
			Image image = null;
			MessageDialog dialog = new MessageDialog(editor.getEditorSite().getShell(), title, image, message, MessageDialog.QUESTION, 
					new String[] { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL, IDialogConstants.CANCEL_LABEL }, 0);
			int open = dialog.open();
			if (open==0) {
				toggleNature.toggleNature(resource.getProject());
			}
		}*/
	}

}