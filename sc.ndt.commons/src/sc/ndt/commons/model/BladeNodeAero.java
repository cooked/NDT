package sc.ndt.commons.model;

public final class BladeNodeAero {
		
	public float 	R;
	public float 	Twist;
	public float 	dR;
	public float 	Chord;
	public int 		AirfoilID;
	public String 	print;
	
	public BladeNodeAero() {
		
	}
		
	public BladeNodeAero(float R, float Twist, float dR, float Chord, int AirfoilID, String print) {
		this.R = R;
		this.Twist = Twist;
		this.dR = dR;
		this.Chord = Chord;
		this.AirfoilID = AirfoilID;
		this.print = print;
	}
	
	
}
