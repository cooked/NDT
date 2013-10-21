package sc.ndt.commons.model.providers.outlist;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.viewers.ICheckStateProvider;

import sc.ndt.commons.model.OutBlock;
import sc.ndt.commons.model.OutCh;

//CheckStateProvider class
public class OutListCheckStateProvider implements ICheckStateProvider {

	// TODO
	// http://pastebin.com/vVEdU2Cj

	@Override
	public boolean isChecked(Object element) {

		ArrayList<OutCh> outCh;
		Iterator<OutCh> outChIt;

		if(element instanceof OutBlock) {

			outCh 	= new ArrayList<OutCh>(((OutBlock)element).values());
			outChIt	= outCh.iterator();

			while(outChIt.hasNext()) {
				if(outChIt.next().isAvailable())
					return true;
			}
			return false;

		} else if(element instanceof OutCh && !isGrayed(element))

			return ((OutCh)element).isAvailable();

		return false;

	}

	@Override
	public boolean isGrayed(Object element) {

		ArrayList<OutCh> 	outCh;
		Iterator<OutCh> 	outChIt;

		if(element instanceof OutBlock && isChecked(element)) {
			
			outCh = new ArrayList<OutCh>(((OutBlock)element).values());
			outChIt = outCh.iterator();

			while(outChIt.hasNext())
				if(outChIt.next().isAvailable()==false)
					return true;
			return false;

		}

		return false;

	}

}
