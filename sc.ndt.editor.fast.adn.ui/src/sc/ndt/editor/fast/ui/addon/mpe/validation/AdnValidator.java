package sc.ndt.editor.fast.ui.addon.mpe.validation;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;

public class AdnValidator implements IValidator {

	public IStatus validate(Object value) {
		// TODO Auto-generated method stub
		if(value instanceof String)
			if ( Float.parseFloat((String)value) < 0)
				return null;
		return null;
	}

}
