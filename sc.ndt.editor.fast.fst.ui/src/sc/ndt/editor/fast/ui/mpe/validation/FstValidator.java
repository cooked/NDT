package sc.ndt.editor.fast.ui.mpe.validation;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;

public class FstValidator implements IValidator {

	@Override
	public IStatus validate(Object value) {
		// TODO Auto-generated method stub
		if(value instanceof String)
			if ( Float.parseFloat((String)value) < 0)
				return null;
		return null;
	}

}
