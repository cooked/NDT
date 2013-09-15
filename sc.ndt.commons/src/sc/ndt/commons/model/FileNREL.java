package sc.ndt.commons.model;

import java.util.ArrayList;
import java.util.List;

abstract public class FileNREL {
	
	protected static List<String> FILE_EXT = new ArrayList<String>();
	
	public int 			nHeadLines 	= 0; 	
	public String 		name		= "";
	public String 		path		= "";
	
	public StringBuffer	header;
	
	abstract String getHeader();
	
	abstract String getContent();
	
}
