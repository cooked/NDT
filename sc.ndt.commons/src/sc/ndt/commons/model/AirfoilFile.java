package sc.ndt.commons.model;

public final class AirfoilFile {
		
	public 	int 	ID;
	public 	String 	name;
	private String 	location;
	
	public AirfoilFile() {
		
		this.name 		= "";
		this.location 	= "";
		
	}
		
	public AirfoilFile(String location) {
		
		this.name 		= "";
		this.location 	= location;
		
	}
	
	public AirfoilFile(String name, String location) {
		
		this.name 		= name;
		this.location 	= location;
		
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}
	
}
