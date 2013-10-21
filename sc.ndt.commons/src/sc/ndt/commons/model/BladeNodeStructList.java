package sc.ndt.commons.model;

import java.util.ArrayList;
import java.util.List;

public class BladeNodeStructList extends ArrayList<BladeNodeStruct> {
	
	private static final long serialVersionUID = 1L;
	
	public BladeNodeStructList getStructuralList() {
		return this;
	}
	
	
	// usato x canali disponibili in FAST.out
	public BladeNodeStructList(List<String> avail) {
		this();
		
		/*
		// define available channels
		Iterator<String> it = avail.iterator();
		while(it.hasNext()) {
			OutCh ch = (OutCh)this.get(it.next());
			if(ch!=null)
				ch.setAvailable(true);
		}
		*/
		
	}
	
	public BladeNodeStructList() {
		
	}
	

}
