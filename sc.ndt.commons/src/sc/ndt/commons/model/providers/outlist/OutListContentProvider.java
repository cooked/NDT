package sc.ndt.commons.model.providers.outlist;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import sc.ndt.commons.model.OutBlock;


//ContentProvider class
public class OutListContentProvider implements ITreeContentProvider {

	private final Object[] EMPTY_ARRAY = new Object[0];

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getElements(Object inputElement) {

		// chiamata nodi di primo livello non espansi

		if(inputElement instanceof List)
			return ((List<?>) inputElement).toArray();

		return (Object[])inputElement;
	}

	@Override
	public Object[] getChildren(Object parentElement) {

		if (parentElement instanceof OutBlock) {
			OutBlock outBlock = (OutBlock) parentElement;
			return outBlock.values().toArray();
		}
		return EMPTY_ARRAY;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {

		if(element instanceof OutBlock)
			return true;
		else
			return false;
	}
}
