package sc.ndt.commons.model;

public final class BladeNode {
		
	public float 	R;
	public float 	Twist;
	public float 	dR;
	public float 	Chord;
	public int 		AirfoilID;
	public String 	print;
	
	public BladeNode() {
		
	}
		
	public BladeNode(float R, float Twist, float dR, float Chord, int AirfoilID, String print) {
		this.R = R;
		this.Twist = Twist;
		this.dR = dR;
		this.Chord = Chord;
		this.AirfoilID = AirfoilID;
		this.print = print;
	}
	
	
}
