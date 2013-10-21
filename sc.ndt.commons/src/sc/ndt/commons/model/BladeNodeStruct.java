package sc.ndt.commons.model;

public final class BladeNodeStruct {
		
	public float 	BlFract;
	public float 	AeroCent;
	public float 	StrcTwst;
	public float 	BMassDen;
	public float 	FlpStff;
	public float 	EdgStff;
	public float 	GJStff;
	public float 	EAStff;
	public float 	Alpha;
	public float 	FlpIner;
	public float 	EdgIner;
	public float 	PrecrvRef;
	public float 	PreswpRef;
	public float 	FlpcgOf;
	public float 	EdgcgOf;
	public float 	FlpEAOf;
	public float 	EdgEAOf;
	
	public BladeNodeStruct() {
		
	}
	
	public BladeNodeStruct(float R, float Twist, float dR, float Chord, float AirfoilID, float print) {
		this.BlFract 	= R;
		this.AeroCent 	= Twist;
		this.StrcTwst 	= dR;
		this.BMassDen 	= Chord;
		this.FlpStff 	= 0;
		this.EdgStff 	= 0;
		this.GJStff 	= 0;
		this.EAStff 	= 0;
		this.Alpha 		= 0;
		this.FlpIner 	= 0;
		this.EdgIner 	= 0;
		this.PrecrvRef 	= 0;
		this.PreswpRef 	= 0;
		this.FlpcgOf 	= 0;
		this.EdgcgOf 	= 0;
		this.FlpEAOf 	= 0;
		this.EdgEAOf 	= 0;
	}
	
	
}
