package sc.ndt.commons.model;

import org.eclipse.core.resources.IFile;

public class EditorInputFASTOut extends EditorInputFileTabOut {

	// references:
	// where to store model? not here! see http://www.eclipsezone.com/eclipse/forums/t105950.html
	
	public EditorInputFASTOut(IFile file) {
		super(file);
	}
			
	public ModelFileFASTOut load() {
		return new ModelFileFASTOut(getFile());
	}
	
}
