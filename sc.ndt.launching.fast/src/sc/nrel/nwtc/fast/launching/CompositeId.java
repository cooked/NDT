package sc.nrel.nwtc.fast.launching;

import java.util.ArrayList;

/**
 * Utility class for id's made of multiple Strings
 */
public class CompositeId {
	private String[] fParts;
	
	public CompositeId(String[] parts) {
		fParts= parts;
	}
	
	public static CompositeId fromString(String idString) {
		ArrayList<String> parts= new ArrayList<String>();
		int commaIndex= idString.indexOf(',');
		while (commaIndex > 0) {
			int length= Integer.valueOf(idString.substring(0, commaIndex)).intValue();
			String part= idString.substring(commaIndex+1, commaIndex+1+length);
			parts.add(part);
			idString= idString.substring(commaIndex+1+length);
			commaIndex= idString.indexOf(',');
		}
		String[] result= parts.toArray(new String[parts.size()]);
		return new CompositeId(result);
	}
	
	@Override
	public String toString() {
		StringBuffer buf= new StringBuffer();
		for (int i= 0; i < fParts.length; i++) {
			buf.append(fParts[i].length());
			buf.append(',');
			buf.append(fParts[i]);
		}
		return buf.toString();
	}
	
	public String get(int index) {
		return fParts[index];
	}
	
	public int getPartCount() {
		return fParts.length;
	}
}
