package sc.ndt.commons.model;

import java.util.HashMap;

import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Length;
import javax.measure.quantity.Quantity;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.jscience.physics.amount.Amount;

public final class TowerNodeStruct extends NodeStruct {
		
	private HashMap<String,Amount<?>> prop = new HashMap<String,Amount<?>>();
		
	public TowerNodeStruct(float HtAgl, float d, float thick) {
		
		super(MaterialLibrary.getSteel());
		
		init();
		
		prop.put("HtAgl", 	Amount.valueOf(HtAgl, 	SI.METER));
		prop.put("d", 		Amount.valueOf(d, 		SI.METER));
		prop.put("thick", 	Amount.valueOf(thick, 	SI.MILLIMETER));
		
		calcNodeStruct();
		
	}

	private void init() {
		// FAST, BModes
		prop.put("HtFract", 	Amount.valueOf(0, Dimensionless.UNIT));
		prop.put("TMassDen", 	Amount.valueOf(0, SI.KILOGRAM.divide(SI.METER)) );
		prop.put("TwFAStif", 	Amount.valueOf(0, SI.NEWTON.times(SI.SQUARE_METRE)));
		prop.put("TwSSStif", 	Amount.valueOf(0, SI.NEWTON.times(SI.SQUARE_METRE)));
		prop.put("TwGJStif", 	Amount.valueOf(0, SI.NEWTON.times(SI.SQUARE_METRE)));
		prop.put("TwEAStif", 	Amount.valueOf(0, SI.NEWTON.times(SI.SQUARE_METRE)));
		prop.put("TwFAIner", 	Amount.valueOf(0, SI.KILOGRAM.times(SI.METER)));
		prop.put("TwSSIner", 	Amount.valueOf(0, SI.KILOGRAM.times(SI.METER)));
		prop.put("TwFAcgOf", 	Amount.valueOf(0, SI.METER));
		prop.put("TwSScgOf", 	Amount.valueOf(0, SI.METER));
		// BModes
		prop.put("str_tw", 		Amount.valueOf(0, NonSI.DEGREE_ANGLE));
		prop.put("tw_iner", 	Amount.valueOf(0, NonSI.DEGREE_ANGLE));
		prop.put("sc_offst", 	Amount.valueOf(0, SI.METER));
		prop.put("tc_offst", 	Amount.valueOf(0, SI.METER));
		// Section descriptor, Calculated
		prop.put("HtAgl", 		Amount.valueOf(0, SI.METER));
		prop.put("d", 			Amount.valueOf(0, SI.METER));
		prop.put("thick", 		Amount.valueOf(0, SI.MILLIMETER));
		prop.put("Area", 		Amount.valueOf(0, SI.SQUARE_METRE));
		prop.put("Ixx", 		Amount.valueOf(0, SI.SQUARE_METRE.times(SI.SQUARE_METRE)));
	}
	
	// used when *.tsp file is read (Bmodes, side-side offset of CG is not there)
	public TowerNodeStruct(float HtFract, float TMassDen, float TwFAStif,
			float TwSSStif, float TwGJStif, float TwEAStif, float TwFAIner,
			float TwSSIner, float TwFAcgOf) {
		
		this(HtFract, TMassDen, TwFAStif, TwSSStif, TwGJStif, TwEAStif,
				TwFAIner, TwSSIner, TwFAcgOf, 0);
	
	}

	// used when *.twr file is read (all the properties are already there)
	public TowerNodeStruct(float HtFract, float TMassDen, float TwFAStif, float TwSSStif, 
			float TwGJStif, float TwEAStif, float TwFAIner, float TwSSIner, 
			float TwFAcgOf, float TwSScgOf) {
		
		super(MaterialLibrary.getSteel());

	}
	
	public void calcNodeStruct() {
		
		float d 	= (float) prop.get("d").getEstimatedValue();
		float thick = (float) prop.get("thick").to(SI.METER).getEstimatedValue();
		
		float area = (float) (Math.PI*(Math.pow(d/2,2)-Math.pow((d/2)-thick,2)));
		prop.put("Area", 
				Amount.valueOf(area, SI.SQUARE_METRE) );
		
		float Ixx	= (float) (Math.PI/4*(Math.pow(d/2,4)-Math.pow((d/2)-thick,4)));
		float Iyy	= Ixx;
		prop.put("Ixx", 
				Amount.valueOf( Ixx, SI.SQUARE_METRE.times(SI.SQUARE_METRE) ));
		prop.put("TMassDen", 
				Amount.valueOf( area*mat.rho, SI.KILOGRAM.divide(SI.METER) ));
		prop.put("TwEAStif", 
				Amount.valueOf( area*mat.E, SI.NEWTON ));
		prop.put("TwFAStif", 
				Amount.valueOf( Ixx*mat.E, SI.NEWTON.times(SI.SQUARE_METRE) ));
		prop.put("TwSSStif", 
				Amount.valueOf( Iyy*mat.E, SI.NEWTON.times(SI.SQUARE_METRE) ));
		prop.put("TwGJStif", 
				Amount.valueOf( (Ixx+Iyy)*mat.G, SI.NEWTON.times(SI.SQUARE_METRE) ));
		prop.put("TwFAIner", 
				Amount.valueOf( Ixx*mat.rho, SI.KILOGRAM.times(SI.METRE) ));
		prop.put("TwSSIner", 
				Amount.valueOf( Iyy*mat.rho, SI.KILOGRAM.times(SI.METRE) ));
		
	}
	
	public String getProperty(String property) {
		return String.format("%.2f", prop.get(property).getEstimatedValue() );
	}
	
	public float getPropertyFloat(String property) {
		return (float) prop.get(property).getEstimatedValue();
	}
	
	
	public void setProperty(String property, double value ) {
		prop.put(property, Amount.valueOf(value,Dimensionless.UNIT));
	}
	public void setProperty(String property, String value, String unit ) {
		prop.put(property, Amount.valueOf(value + " " + unit ));
	}

	
	/*
	public static EditingSupport getHtAglEditingSupport(TableViewer viewer) {
		return new HtAglEditingSupport(viewer);
	}
	public static EditingSupport getDEditingSupport(TableViewer viewer) {
		return new DEditingSupport(viewer);
	}
	public static EditingSupport getThickEditingSupport(TableViewer viewer) {
		return new ThickEditingSupport(viewer);
	}
	*/
	
}

