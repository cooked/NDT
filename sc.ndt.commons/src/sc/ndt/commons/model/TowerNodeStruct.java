package sc.ndt.commons.model;

import java.util.HashMap;

import javax.measure.unit.SI;

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
		prop.put("HtFract", 	Amount.ZERO);
		prop.put("TMassDen", 	Amount.valueOf(0, SI.KILOGRAM.divide(SI.METER)) );
		prop.put("TwFAStif", 	Amount.valueOf(0, SI.NEWTON.times(SI.SQUARE_METRE)));
		prop.put("TwSSStif", 	Amount.valueOf(0, SI.NEWTON.times(SI.SQUARE_METRE)));
		prop.put("TwGJStif", 	Amount.valueOf(0, SI.NEWTON.times(SI.SQUARE_METRE)));
		prop.put("TwEAStif", 	Amount.valueOf(0, SI.NEWTON.times(SI.SQUARE_METRE)));
		prop.put("TwFAIner", 	Amount.valueOf(0, SI.KILOGRAM.times(SI.METER)));
		prop.put("TwSSIner", 	Amount.valueOf(0, SI.KILOGRAM.times(SI.METER)));
		prop.put("TwFAcgOf", 	Amount.valueOf(0, SI.METER));
		prop.put("TwSScgOf", 	Amount.valueOf(0, SI.METER));
		
		prop.put("HtAgl", 		Amount.valueOf(0, SI.METER));
		prop.put("d", 			Amount.valueOf(0, SI.METER));
		prop.put("thick", 		Amount.valueOf(0, SI.MILLIMETER));
		prop.put("Area", 		Amount.valueOf(0, SI.SQUARE_METRE));
		prop.put("Ixx", 		Amount.valueOf(0, SI.SQUARE_METRE.times(SI.SQUARE_METRE)));
	}
	
	// used when *.twr file is read (all the properties are already there)
	public TowerNodeStruct(float HtFract, float TMassDen, float TwFAStif, float TwSSStif, 
			float TwGJStif, float TwEAStif, float TwFAIner, float TwSSIner, 
			float TwFAcgOf, float TwSScgOf) {
		
		super(MaterialLibrary.getSteel());
		
		//this.HtFract 	= Amount.valueOf(HtFract, Dimensionless.UNIT);
		//this.TMassDen 	= Amount.valueOf(TMassDen, SI.KILOGRAM.divide(SI.METER));
		/*this.TwFAStif 	= Amount.valueOf(HtAgl, SI.METER);TwFAStif;
		this.TwSSStif 	= TwSSStif;
		this.TwGJStif 	= TwGJStif;
		this.TwEAStif 	= TwEAStif;
		this.TwFAIner 	= TwFAIner;
		this.TwSSIner 	= TwSSIner;
		this.TwFAcgOf 	= TwFAcgOf;
		this.TwSScgOf 	= TwSScgOf;*/

	}
	
	private void calcNodeStruct() {
		
		float d 	= (float) prop.get("d").getEstimatedValue();
		float thick = (float) prop.get("thick").to(SI.METER).getEstimatedValue();
		
		float area = (float) (Math.PI*(Math.pow(d/2,2)-Math.pow((d/2)-thick,2)));
		prop.put("Area", 
				Amount.valueOf(area,
						SI.SQUARE_METRE) );
		
		float Ixx	= (float) (Math.PI/4*(Math.pow(d/2,4)-Math.pow((d/2)-thick,4)));
		float Iyy	= Ixx;
		prop.put("Ixx", 
				Amount.valueOf( Ixx,
						SI.SQUARE_METRE.times(SI.SQUARE_METRE) ));
	
		prop.put("TMassDen", 
				Amount.valueOf( area*mat.rho, 
						SI.KILOGRAM.divide(SI.METER) ));
		prop.put("TwEAStif", 
				Amount.valueOf( area*mat.E, 
						SI.NEWTON ));
		prop.put("TwFAStif", 
				Amount.valueOf( Ixx*mat.E, 
						SI.NEWTON.times(SI.SQUARE_METRE) ));
		prop.put("TwSSStif", 
				Amount.valueOf( Iyy*mat.E, 
						SI.NEWTON.times(SI.SQUARE_METRE) ));
		prop.put("TwGJStif", 
				Amount.valueOf( (Ixx+Iyy)*mat.G, 
						SI.NEWTON.times(SI.SQUARE_METRE) ));
		prop.put("TwFAIner", 
				Amount.valueOf( Ixx*mat.rho, 
						SI.KILOGRAM.times(SI.METRE) ));
		prop.put("TwSSIner", 
				Amount.valueOf( Iyy*mat.rho, 
						SI.KILOGRAM.times(SI.METRE) ));
		
	}
	
	public String getProperty(String property) {
		return Double.toString(prop.get(property).getEstimatedValue());
	}
	
	public void setProperty(String property, String value, String unit ) {
		prop.put(property, Amount.valueOf(value + " " + unit ));
	}
	
	public static EditingSupport getHtAglEditingSupport(TableViewer viewer) {
		return new HtAglEditingSupport(viewer);
	}
	public static EditingSupport getDEditingSupport(TableViewer viewer) {
		return new DEditingSupport(viewer);
	}
	public static EditingSupport getThickEditingSupport(TableViewer viewer) {
		return new ThickEditingSupport(viewer);
	}
	
}

class HtAglEditingSupport extends EditingSupport {

	  private final TableViewer viewer;

	  public HtAglEditingSupport(TableViewer viewer) {
	    super(viewer);
	    this.viewer = viewer;
	  }

	  @Override
	  protected CellEditor getCellEditor(Object element) {
	    return new TextCellEditor(viewer.getTable());
	  }

	  @Override
	  protected boolean canEdit(Object element) {
	    return true;
	  }

	  @Override
	  protected Object getValue(Object element) {
	    return ((TowerNodeStruct) element).getProperty("HtAgl");
	  }

	  @Override
	  protected void setValue(Object element, Object userInputValue) {
	    ((TowerNodeStruct)element).setProperty(
	    		"HtAgl", 
	    		(String)userInputValue, 
	    		"m");
	    viewer.update(element, null);
	  }
}

class DEditingSupport extends EditingSupport {

	  private final TableViewer viewer;

	  public DEditingSupport(TableViewer viewer) {
	    super(viewer);
	    this.viewer = viewer;
	  }

	  @Override
	  protected CellEditor getCellEditor(Object element) {
	    return new TextCellEditor(viewer.getTable());
	  }

	  @Override
	  protected boolean canEdit(Object element) {
	    return true;
	  }

	  @Override
	  protected Object getValue(Object element) {
	    return ((TowerNodeStruct) element).getProperty("d");
	  }

	  @Override
	  protected void setValue(Object element, Object userInputValue) {
	    ((TowerNodeStruct)element).setProperty(
	    		"d", 
	    		(String)userInputValue, 
	    		"m");
	    viewer.update(element, null);
	  }
	  
}

class ThickEditingSupport extends EditingSupport {

	  private final TableViewer viewer;

	  public ThickEditingSupport(TableViewer viewer) {
	    super(viewer);
	    this.viewer = viewer;
	  }

	  @Override
	  protected CellEditor getCellEditor(Object element) {
	    return new TextCellEditor(viewer.getTable());
	  }

	  @Override
	  protected boolean canEdit(Object element) {
	    return true;
	  }

	  @Override
	  protected Object getValue(Object element) {
	    return ((TowerNodeStruct) element).getProperty("thick");
	  }

	  @Override
	  protected void setValue(Object element, Object userInputValue) {
	    ((TowerNodeStruct)element).setProperty(
	    		"thick", 
	    		(String)userInputValue, 
	    		"mm");
	    viewer.update(element, null);
	  }
	  
}