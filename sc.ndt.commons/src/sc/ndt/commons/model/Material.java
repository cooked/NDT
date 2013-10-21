package sc.ndt.commons.model;

public class Material {
	
	public float E;
	public float G;
	public float rho;
	
	public Material(float E, float G, float rho) {
		this.rho 	= rho;
		this.E		= E;
		this.G		= G;
	}

}
