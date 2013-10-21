package sc.ndt.commons.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

// this deal with additional file for the tower's section description
// csv which contains table with HtAgl, diameter and thickness rows for every tower section

public class ModelFileTowerSec extends FileNREL {
		
	private TowerNodeStructList twrList = new TowerNodeStructList();
	
	IFile 	file;
	String 	sFile;
	
	public ModelFileTowerSec(IFile ifile) {
		super();
		
		nHeadLines = 0;
		
		Path path 	= new Path(ifile.getFullPath().toOSString());
		IPath p2 	= path.removeFileExtension().addFileExtension("sec");
		file 		= ResourcesPlugin.getWorkspace().getRoot().getFile(p2);
		sFile 		= file.getRawLocation().toOSString();
		
		parse(sFile);
		
	}
		
	public TowerNodeStructList getTower() {
		return twrList;
	}
	
	private void parse(String f) {
		
		final CSVReader reader;
						
		// prepare file reader
		try {
			
			reader = new CSVReader(new FileReader(f), '\t');
			
			// parse data
			String[] nextLine;
		    while((nextLine = reader.readNext()) != null) {

		    	Iterator<String> ilf = Arrays.asList(nextLine).iterator();
		    	twrList.add(new TowerNodeStruct(
		    			Float.parseFloat(ilf.next()),
		    			Float.parseFloat(ilf.next()),
		    			Float.parseFloat(ilf.next())
		    			));

		    }
		    
		    if(reader instanceof CSVReader && reader!=null)
				reader.close();
		    
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	public void save(TowerNodeStructList model) {
		saveAs(sFile,model);
	}
	
	public void saveAs(String file, TowerNodeStructList model) {
		
		CSVWriter writer;
		String[] entries;
		
		try {
			writer = new CSVWriter(new FileWriter(file), '\t', CSVWriter.NO_QUOTE_CHARACTER);
			
			ListIterator<TowerNodeStruct> it = model.listIterator();
			while(it.hasNext()) {
				TowerNodeStruct tsn = it.next();
				entries = new String[]{
						tsn.getProperty("HtAgl"),
						tsn.getProperty("d"),
						tsn.getProperty("thick")
						};
				writer.writeNext(entries);
			}
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	String getHeader() {
		return "";
	}

	@Override
	String getContent() {
		return "";
	}
}
