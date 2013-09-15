package sc.ndt.commons.model;

public final class OutCh {
		
	public 	String 		name;
	public 	String[]	other;
	public 	String 		description;
	public 	String 		convention;
	public 	String 		unit;
	private boolean 	available;
	//private boolean 	visible;
	
	public OutCh(String name, String[] other, String desc, String conv, String unit) {
		
		this(other, desc, conv, unit);
		this.name 	= name;
		
		
	}
	
	public OutCh(String[] other, String description, String convention, String unit) {
		
		this.other 			= other;
		this.description 	= description;
		this.convention 	= convention;
		this.unit 			= unit;
		// default to not available + not visible
		this.available 		= false;
		//this.visible 		= false;
		
	}
		
	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isAvailable() {
		return available;
	}
	
	/*public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean isVisible() {
		return visible;
	}*/
}
