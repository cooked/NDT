package sc.ndt.commons.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

public class TowerNodeStructList extends ArrayList<TowerNodeStruct> {
	
	private static final long serialVersionUID = 1L;
	
	public TowerNodeStructList getStructuralList() {
		return this;
	}
	
	
	// usato x canali disponibili in FAST.out
	public TowerNodeStructList(List<String> avail) {
		this();
		
		/*
		// define available channels
		Iterator<String> it = avail.iterator();
		while(it.hasNext()) {
			OutCh ch = (OutCh)this.get(it.next());
			if(ch!=null)
				ch.setAvailable(true);
		}
		*/
		
	}
	
	public TowerNodeStructList() {
		
	}
	
	private EList<Float> getList(String property) {
		EList<Float> nList = new BasicEList<Float>();
		
		Iterator<TowerNodeStruct> itTowerNodes = iterator();
		
		while(itTowerNodes.hasNext())
			nList.add(itTowerNodes.next().getPropertyFloat(property));
			
		return nList;
	}
	
	public void calcHtFract() {
		
		float top = this.get(this.size()-1).getPropertyFloat("HtAgl");
		TowerNodeStruct sec;
		float val;
		Iterator<TowerNodeStruct> itTowerNodes = iterator();
		while(itTowerNodes.hasNext()){
			sec = itTowerNodes.next();
			val = sec.getPropertyFloat("HtAgl");
			sec.setProperty("HtFract", val/top);
		}
		
	}
	
	public EList<Float> getListHtFract() {
		return getList("HtFract");
	}
	public EList<Float> getListTMassDen() {
		return getList("TMassDen");
	}
	public EList<Float> getListTwFAStif() {
		return getList("TwFAStif");
	}
	public EList<Float> getListTwSSStif() {
		return getList("TwSSStif");
	}
	public EList<Float> getListTwGJStif() {
		return getList("TwGJStif");
	}
	public EList<Float> getListTwEAStif() {
		return getList("TwEAStif");
	}
	public EList<Float> getListTwFAIner() {
		return getList("TwFAIner");
	}
	public EList<Float> getListTwSSIner() {
		return getList("TwSSIner");
	}
	public EList<Float> getListTwFAcgOf() {
		return getList("TwFAcgOf");
	}
	public EList<Float> getListTwSScgOf() {
		return getList("TwSScgOf");
	}
	
	public EList<Float> getListStrTw() {
		return getList("str_tw");
	}
	public EList<Float> getListTwIner() {
		return getList("tw_iner");
	}
	public EList<Float> getListScOffst() {
		return getList("sc_offst");
	}
	public EList<Float> getListTcOffst() {
		return getList("tc_offst");
	}
	
	public String getTowerNodes4FAST() {
		
		// TODO 
		
		StringBuffer rows;
		StringBuffer row;
		
		Iterator<TowerNodeStruct> itTowerNodes = iterator();
		
		rows = new StringBuffer("");
		
		while(itTowerNodes.hasNext()) {
			
			row = new StringBuffer("");
			
			TowerNodeStruct node = itTowerNodes.next();
			
			row.append(node.getProperty("HtFract")).append("\t");
			row.append(node.getProperty("TMassDens")).append("\t");
			row.append(node.getProperty("TwFAStif")).append("\t");
			row.append(node.getProperty("TwSSStif")).append("\t");
			row.append(node.getProperty("TwGJStif")).append("\t");
			row.append(node.getProperty("TwEAStif")).append("\t");
			row.append(node.getProperty("TwFAIner")).append("\t");
			row.append(node.getProperty("TwSSIner")).append("\t");
			row.append(node.getProperty("TwFAcgOf")).append("\t");
			row.append(node.getProperty("TwSScgOf"));
			
			rows.append(row).append("\n");
			
		}
			
		return rows.toString();

	}
}
