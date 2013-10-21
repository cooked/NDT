package sc.ndt.commons.model;

import java.util.ArrayList;
import java.util.List;

public class TowerNodeStructList extends ArrayList<TowerNodeStruct> {
	
	private static final long serialVersionUID = 1L;
	
	public TowerNodeStructList getStructuralList() {
		return this;
	}
	
	
	// usato x canali disponibili in FAST.out
	public TowerNodeStructList(List<String> avail) {
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
	
	public TowerNodeStructList() {
		
	}
	

}
