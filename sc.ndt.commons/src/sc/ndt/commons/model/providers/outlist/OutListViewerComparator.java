package sc.ndt.commons.model.providers.outlist;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

import sc.ndt.commons.model.OutBlock;
import sc.ndt.commons.model.OutCh;

public class OutListViewerComparator extends ViewerComparator {
	public int compare(Viewer viewer, Object e1, Object e2) {
		int result;
		if(e1 instanceof OutBlock){
			OutBlock b1 = (OutBlock) e1;
			OutBlock b2 = (OutBlock) e2;
			result = b1.name.compareTo(b2.name);
			return result;
		} else {
			OutCh c1 = (OutCh) e1;
			OutCh c2 = (OutCh) e2;
			result = c1.name.compareTo(c2.name);
			return result;
		}
	}
}