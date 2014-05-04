package sc.ndt.commons.model;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.eclipse.ui.views.properties.IPropertySource;

import sc.ndt.commons.Activator;
import sc.ndt.commons.model.properties.OutChPropertySource;

public final class OutCh {
		
	// TODO: 
	// - manage duplicated channels
	// - BUG: in source editor, alternate name replaced with main one when edited in Form editor
	
	// ALTERNATE NAMES
	// FAST channels have an official name and optionally one or more alternate/friendly name
	
	public  String		usedName;	// TODO proposed to manage name and alternate names
	
	public 	String 		name;
	public 	String[]	other;
	public 	String 		desc;
	public 	String 		convention;
	public 	String 		unit;
	private float[] 	data;
	
	private boolean 	available;
	
	public int 			otherIndex = 0;		// name currently in use, 0:name 1:other[0] 2:other[1] etc...
	
	DescriptiveStatistics	descStats;
	
	public OutCh(String name, String[] other, String desc, String conv, String unit) {
		
		this(other, desc, conv, unit);
		this.name 	= name;
		
		// by default we set the usedName to be the official one
		this.usedName = name;
		
	}
	
	public OutCh(String[] other, String description, String convention, String unit) {
		
		// clean alternate names
		for(int i=0; i<other.length; i++)
			other[i] = other[i].trim();
			
		this.other 			= other;
		this.desc 			= description;
		this.convention 	= convention;
		this.unit 			= unit;
		this.available 		= false;
		
		descStats = new DescriptiveStatistics();
		
	}
	
	// SC see:
	// http://code.google.com/p/google-gson/
	// https://sites.google.com/site/gson/gson-user-guide#TOC-Overview
	// http://www.mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/
	public String toJson() {
		return Activator.getGson().toJson(this);
	}
	
	
	public Object getAdapter(Class adapter) {
		if (adapter == IPropertySource.class) {
			return new OutChPropertySource(this);
		}
		return null;
	}

	public DescriptiveStatistics getStat() {
		return descStats;
	}
	
	public float[] getData() {
		return data;
	}

	public void setData(float[] data, boolean doStat) {
		
		this.data = data;
		
		int l = data.length;
		for(int i=0; i<l; i++)
			descStats.addValue(data[i]);
		
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isAvailable() {
		return available;
	}
	
	
}
