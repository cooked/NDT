package sc.ndt.commons.ui.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Injector;

public interface IXtextFormEditor {

	public Injector getXtextInjector(String key);
	
	public XtextEditor getXtextEditor(String key);
	
	public EObject getModelFromXtextEditor(XtextEditor editor);
	
}
