package sc.ndt.commons.model;

import java.util.ArrayList;
import java.util.List;

public class AirfoilList extends ArrayList<AirfoilFile> {
	
	private static final long serialVersionUID = 1L;
	
	public AirfoilList getAirfoilList() {
		return this;
	}
	
	
	// usato x canali disponibili in FAST.out
	public AirfoilList(List<String> avail) {
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
	
	public AirfoilList() {
		
	}
	
	public void setAirfoilList(String[] values) {
		for(int i=0; i<values.length; i++)
			this.add(i,new AirfoilFile(values[i]));
	}
	
	public void setAirfoilList(String values) {
		String[] vals = values.split(",");
		setAirfoilList(vals);
	}

}
