package sc.ndt.commons.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class OutBlock extends HashMap<String, OutCh> {

	private static final long serialVersionUID = 1L;

	public String name;

	public OutBlock getAvailableOutChs() {
				
		//ArrayList<OutCh> out 	= new ArrayList<OutCh>();
		Iterator<String> it 	= keySet().iterator();
		
		OutBlock ob = new OutBlock();
		ob.name = this.name;
		
		while(it.hasNext()) {
			OutCh oc = get(OutListRegistry.filterAlterName(it.next())); 
			if(oc.isAvailable())
				ob.put(oc.name,oc);
		}
		return ob;
		
	}

	public String getAvailableNames() {
		String 				tmp; 
		ArrayList<String> 	out = new ArrayList<String>();
		Iterator<String> 	it 	= keySet().iterator();
		while(it.hasNext()) {
			tmp = it.next();
			if(get(tmp).isAvailable())
				out.add(tmp);
		}
		return toCommaSeparatedString(out);
				
	}

	
	// arraylist/list to string see
	// http://eclipsesource.com/blogs/2012/07/26/having-fun-with-guavas-string-helpers/
	public static String toCommaSeparatedString(List<String> strings) {
		Joiner joiner = Joiner.on(",").skipNulls();
		return joiner.join(strings);
	}

	public static List<String> fromCommaSeparatedString(String string) {
		Iterable<String> split = Splitter.on(",").omitEmptyStrings().trimResults().split(string);
		return Lists.newArrayList(split);
	}

}
