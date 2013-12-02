package sc.ndt.commons.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import au.com.bytecode.opencsv.CSVReader;

// this registry is initiali<ed in the plugin Activator class
public class OutListRegistry {

	private Bundle commonsBundle;
	
	static OutListRegistry 						instance;
	static HashMap<String,OutCh>  				outList;
	static HashMap<String,ArrayList<String>>	outBlocksMap;
	static OutListNames							altNamesMap;
	
	public static OutListRegistry getInstance() {
		if(instance==null) {
			instance = new OutListRegistry();
			instance.init();
		}
		return instance;
	}

	// input: official or alternate name -> output: official name 
	public static String filterAlterName(String alter) {
		String name = getAltNamesMap().get(alter);
		if(name==null || name.matches(""))
			name = alter;
		return name;
	}

	public static HashMap<String,ArrayList<String>> getOutBlocks() {
		return outBlocksMap;
	}
	
	public static OutListNames getAltNamesMap() {
		return altNamesMap;
	}
	
	private void init() {
		outList		 = new HashMap<String,OutCh>();
		outBlocksMap = new HashMap<String,ArrayList<String>>();	
		altNamesMap  = new OutListNames();
		readOutListFile();
	}
		
	public OutList getNewOutList() {
		return new OutList(outList, outBlocksMap);
	}
	
	// TODO: prepare and implement ALL the Sheets from OutList.xlsx of NREL
	// actually only the ElastDyn is read here
	// TODO: also adapt the reading to support legacy versions of FAST
	
	private void readOutListFile() {

		InputStream inputStream;
		final CSVReader reader;
		String[] line;
		String[] nextLine;
		
		//if(outList == null)
		//	outList = new OutList();
		
		commonsBundle = Platform.getBundle("sc.ndt.commons");
		URL url = commonsBundle.getEntry("templates/OutListParameters.csv");
		
		try {
			inputStream = url.openConnection().getInputStream();
			
			// prepare file reader
			try {

				reader = new CSVReader(new BufferedReader(new InputStreamReader(inputStream)), ',');

				// parse header
				reader.readNext();
				
				// parse data
				nextLine = reader.readNext();
				while (nextLine != null) {

					// if 1st cell full => section
					if(nextLine[0].length()!=0) {
						
						String 				name 	= nextLine[0];
						ArrayList<String> 	block 	= new ArrayList<String>();
						
						// if 1st cell empty == channel
						while ((line = reader.readNext())!=null && line[0].trim().length()==0) {
							String[] alter = line[2].split(",");
							OutCh ch = new OutCh(line[1],alter, line[3], line[4], line[5]);
							outList.put(line[1],ch);
							block.add(line[1]);
							
							// mapping principal name <-> alternate names
							for(int i=0; i<alter.length; i++)
								altNamesMap.put(alter[i], line[1]);
							
						}
						outBlocksMap.put(name,block);
						
						nextLine = line;
					}
					
					
				}

				if (reader instanceof CSVReader && reader != null)
					reader.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
	
}
