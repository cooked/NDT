package sc.ndt.commons.ui.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.XtextEditor;

public interface IXtextFormEditor {

	//public Injector getXtextInjector(String key);
	
	public XtextEditor getXtextEditor(String key);
	
	public EObject getModelFromXtextEditor(XtextEditor editor);
	
	public EObject getXtextEditorModel(String key);
	
}
