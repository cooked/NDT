package sc.ndt.commons.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import sc.ndt.commons.Activator;

public class OutList extends HashMap<String,OutCh> {
	
	private static final long serialVersionUID = 1L;
	private HashMap<String, ArrayList<String>> outBlocksMap = new HashMap<String, ArrayList<String>>();
	
	
	public OutList(HashMap<String,OutCh>  outList) {
		
		// go default to OutListRegistry 
		putAll(outList);
		//outBlocksMap.putAll(OutListRegistry.getOutBlocks());

	}

	public OutList(HashMap<String,OutCh>  outList, HashMap<String, ArrayList<String>> outBlock) {
		
		putAll(outList);
		outBlocksMap.putAll(outBlock);

	}

	// SC see:
	// http://code.google.com/p/google-gson/
	// https://sites.google.com/site/gson/gson-user-guide#TOC-Overview
	// http://www.mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/
	public String toJson() {
		return Activator.getGson().toJson(this);
	}
		
	// usato x canali disponibili in FAST.out
	public void setAvailable(List<String> avail) {
		
		String nm;
		String n;
		// set available channels
		Iterator<String> it = avail.iterator();
		while(it.hasNext()) {
			nm 	= it.next();
			n 	= OutListRegistry.filterAlterName(nm);
			OutCh ch = this.get(n);
			if(ch!=null) {
				ch.usedName = nm;
				ch.setAvailable(true);
			}
		}
		
	}
	
	public void setAllSelected(String[] values) {
		
		for(int i=0; i<values.length; i++) {
			OutCh oc = get(OutListRegistry.filterAlterName(values[i]));
			if(oc != null)
				oc.setAvailable(true);
		}
			
	}
	public void setAllSelected(String values) {
		String[] vals = values.split(",");
		setAllSelected(vals);
	}
	
	public void setBlockSelected(OutBlock block,boolean selected) {
		
		Iterator<String> it = block.keySet().iterator();
		
		while(it.hasNext())
			get(it.next()).setAvailable(selected);
		
	}
	
	/*public String[] getAllSelected() {
		return null;
	}*/
	
	public Map<String,ArrayList<String>> getOutBlocks() {
		
		return outBlocksMap;
		
	}

	public ArrayList<OutBlock> getAllOutBlocks() {
		
		ArrayList<OutBlock> out = new ArrayList<OutBlock>();
		
		Iterator<String> it = outBlocksMap.keySet().iterator();
		
		while(it.hasNext())
			out.add(getOutBlock(it.next()));
		
		return out;
		
	}
	
	
	public ArrayList<OutBlock> getAvailableOutBlocks() {
		
		ArrayList<OutBlock> out = new ArrayList<OutBlock>();
		
		Iterator<String> it = outBlocksMap.keySet().iterator();
		
		while(it.hasNext()) {
			OutBlock ob = getOutBlock(it.next()).getAvailableOutChs();
			if(ob.size()>0)
				out.add(ob);
		}
		return out;
		
	}

	public OutBlock getOutBlock(String name) {
		
		OutBlock out = new OutBlock();
		out.name = name;
		
		Iterator<String> it = outBlocksMap.get(name).iterator();
		
		while(it.hasNext()) {
			String ch = it.next();
			out.put(ch, get(ch));
		}
		
		return out;
		
	}
			
	public boolean getSelected(String name) {
		
		return get(OutListRegistry.filterAlterName(name)).isAvailable();

	}

	public String getAllSelectedByBlock() {
		
		StringBuffer rows;
		StringBuffer row;
		
		ArrayList<OutBlock> outBlocks 	= getAllOutBlocks();
		Iterator<OutBlock> 	itOutBlocks = outBlocks.iterator();
		
		rows = new StringBuffer("");
		
		while(itOutBlocks.hasNext()) {
			
			row = new StringBuffer("");
			
			Iterator<String> itOutCh = 
					itOutBlocks.next().keySet().iterator();
			
			while(itOutCh.hasNext()) {
				OutCh oc = get(itOutCh.next());
				if(oc.isAvailable())
					row.append(oc.name).append(",");
			}
			if(row.length()==0){
			} else
				rows.append("\"").append(row.deleteCharAt(row.length()-1)).append("\"\n");
		}
			
		return rows.toString();

	}
		
	/*public void setOutBlockMap(String name, ArrayList<String> block) {
		outBlocksMap.put(name,block);
	}*/
	
	/*public void setAltNameMap(String alter, String name) {
		altNamesMap.put(alter,name);
	}
	
	public LinkedHashMap<String, String> getAltNameMap() {
		return altNamesMap;
	}
	*/
	
	
	
}
