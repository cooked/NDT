package sc.ndt.commons.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;

import au.com.bytecode.opencsv.CSVReader;

//import Jama.Matrix;

public class ModelFileFASTOut extends FileNRELOutput {
	
	public String[] 			channels;
	public String[] 			units;
	//public Matrix 				mData;
	//public String[][]			data;
	public ArrayList<float[]> 	data = new ArrayList<float[]>();
	
	public ArrayList<ArrayList<Float>> 	rowData = new ArrayList<ArrayList<Float>>();
	public ArrayList<ArrayList<Float>> 	colData = new ArrayList<ArrayList<Float>>(); 
	public HashMap<String,float[][]> 	xySeries;	// float[][] of size[timesteps,2]
		
	public OutList outList;
	
	public ModelFileFASTOut(IFile file) {
		super();
		nHeadLines = 6;
		
		Path path = new Path(file.getFullPath().toOSString());
		IFile file2 = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		String s = file2.getRawLocation().toOSString();
		
		parse(s);
		init();
		
	}
		
	public String[] getChannelsName() {
		return channels;
	}
	public String getChannelsInvisible() {
		
		String v = "[";
		for(int i=0; i<channels.length-2;i++)
			v = v.concat("false,");
		v = v.concat("false]");
		return v;
		
	}
	
	public String getChannelsNameString() {
		
		String names = "[";
		for(int i=0; i<channels.length-1;i++)
			names = names.concat("\""+channels[i].toString()+"\",");
		names = names.concat("\""+channels[channels.length-1].toString()+"\"]");
		
		return names;
	
	}
	
	public String[] getChannelsUnit() {
		return units;
	}
	
	public String getChannelsData() {
		float[][] fl2 = data.toArray(new float[0][0]);
		//String s = ArrayUtils.toString(fl2);
		String t = Arrays.deepToString(fl2);
		
		return t;
	}
	
	
	public float[][] getChannel(String chName) {
		return xySeries.get(chName);
	}
	
	private void parse(String file) {
		
		final CSVReader reader;
						
		// prepare file reader
		try {
			
			reader = new CSVReader(new FileReader(file), '\t');
			
			// parse header
			for(int i=0; i<nHeadLines; i++)
				header.append(reader.readNext());	
			
			// parse names
			channels = reader.readNext();				
			for(int i=0; i<channels.length; i++)
				channels[i] = channels[i].trim();
			
			// parse units
			units = reader.readNext();	
			for(int i=0; i<units.length; i++)
				units[i] = units[i].trim();
			
			// init col data structure
			for(int i=0; i<channels.length; i++)
				colData.add(new ArrayList<Float>());
			
			// parse data
			String[] nextLine;
		    while((nextLine = reader.readNext()) != null) {
		    	
		    	
		    	
		    	ArrayList<Float> row = new ArrayList<Float>();
		    	
		    	Iterator<String> 			ilf = Arrays.asList(nextLine).iterator();
		    	Iterator<ArrayList<Float>> 	ifd = colData.iterator();
		    	while(ifd.hasNext() && ilf.hasNext()) {
		    		Float f = Float.parseFloat(ilf.next());
		    		ifd.next().add(f);	// col
		    		row.add(f);			// row
		    	}
		    	
		    	Float[] fl = row.toArray(new Float[0]);
		    	float[] fla = ArrayUtils.toPrimitive(fl);
		    	data.add(fla);
		    	
		    	rowData.add(row);
		    	
		    }
		    
		    if(reader instanceof CSVReader && reader!=null)
				reader.close();
		    
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	private void init() {
		
		if(colData!=null) {
			
			xySeries = new HashMap<String, float[][]>();
						
			Iterator<ArrayList<Float>> 	ifd = colData.iterator();
			Float[] 					time = ifd.next().toArray(new Float[0]);
		    
			// loop all the channel
			int index = 1;
			while(ifd.hasNext()) { 
		    	Float[] ch = ifd.next().toArray(new Float[0]);
		    	
		    	// loop all the timesteps 
				float[][] chXY = new float[colData.get(0).size()][2];
		    	for(int i=0; i<ch.length; i++)
		    		chXY[i] = new float[]{ time[i].floatValue(), ch[i].floatValue() };
		    
		    	xySeries.put(channels[index], chXY);
		    	index++;
			}
	
			// init OutList with available channels
			outList = new OutList(Arrays.asList(channels));
						
		}	
			
	}
}
