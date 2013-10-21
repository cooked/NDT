package sc.ndt.commons.model;

import java.util.ArrayList;
import java.util.List;

public class BladeNodeAeroList extends ArrayList<BladeNodeAero> {
	
	private static final long serialVersionUID = 1L;
	
	public BladeNodeAeroList getAirfoilList() {
		return this;
	}
	
	
	// usato x canali disponibili in FAST.out
	public BladeNodeAeroList(List<String> avail) {
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
	
	public BladeNodeAeroList() {
		
	}
	

}
