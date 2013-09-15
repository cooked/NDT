package sc.ndt.commons.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import com.google.common.collect.Lists;

public class OutList extends HashMap<String,OutCh> {
	
	private static final long serialVersionUID = 1L;
	
	//// test POJO binding
	public String value;
	/////
	
	private LinkedHashMap<String,ArrayList<String>> outBlocksMap = 
			new LinkedHashMap<String,ArrayList<String>>();
				
			
	private ArrayList<String> WindMotions 	= new ArrayList<String>( 
			Lists.newArrayList("WindVxi","WindVyi","WindVzi", "TotWindV","HorWindV","HorWndDir","VerWndDir") );
	private ArrayList<String> Blade1TipMotions 		= new ArrayList<String>( 
			Lists.newArrayList(
					"TipDxc1","TipDyc1","TipDzc1", "TipDxb1","TipDyb1", "TipALxb1","TipALyb1","TipALzb1", "TipRDxb1","TipRDyb1","TipRDzc1", "TipClrnc1" ) );
	private ArrayList<String> Blade2TipMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"TipDxc2","TipDyc2","TipDzc2", "TipDxb2","TipDyb2", "TipALxb2","TipALyb2","TipALzb2", "TipRDxb2","TipRDyb2","TipRDzc2", "TipClrnc2" ) );
	private ArrayList<String> Blade3TipMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"TipDxc3","TipDyc3","TipDzc3", "TipDxb3","TipDyb3", "TipALxb3","TipALyb3","TipALzb3", "TipRDxb3","TipRDyb3","TipRDzc3", "TipClrnc3" ) );
	private ArrayList<String> Blade1LocalSpanMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"Spn1ALxb1","Spn1ALyb1","Spn1ALzb1", "Spn2ALxb1","Spn2ALyb1","Spn2ALzb1", "Spn3ALxb1","Spn3ALyb1","Spn3ALzb1", 
					"Spn4ALxb1","Spn4ALyb1","Spn4ALzb1", "Spn5ALxb1","Spn5ALyb1","Spn5ALzb1", "Spn6ALxb1","Spn6ALyb1","Spn6ALzb1",
					"Spn7ALxb1","Spn7ALyb1","Spn7ALzb1", "Spn8ALxb1","Spn8ALyb1","Spn8ALzb1", "Spn9ALxb1","Spn9ALyb1","Spn9ALzb1") );
	private ArrayList<String> Blade2LocalSpanMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"Spn1ALxb2","Spn1ALyb2","Spn1ALzb2", "Spn2ALxb2","Spn2ALyb2","Spn2ALzb2", "Spn3ALxb2","Spn3ALyb2","Spn3ALzb2", 
					"Spn4ALxb2","Spn4ALyb2","Spn4ALzb2", "Spn5ALxb2","Spn5ALyb2","Spn5ALzb2", "Spn6ALxb2","Spn6ALyb2","Spn6ALzb2",
					"Spn7ALxb2","Spn7ALyb2","Spn7ALzb2", "Spn8ALxb2","Spn8ALyb2","Spn8ALzb2", "Spn9ALxb2","Spn9ALyb2","Spn9ALzb2") );
	private ArrayList<String> Blade3LocalSpanMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"Spn1ALxb3","Spn1ALyb3","Spn1ALzb3", "Spn2ALxb3","Spn2ALyb3","Spn2ALzb3", "Spn3ALxb3","Spn3ALyb3","Spn3ALzb3", 
					"Spn4ALxb3","Spn4ALyb3","Spn4ALzb3", "Spn5ALxb3","Spn5ALyb3","Spn5ALzb3", "Spn6ALxb3","Spn6ALyb3","Spn6ALzb3",
					"Spn7ALxb3","Spn7ALyb3","Spn7ALzb3", "Spn8ALxb3","Spn8ALyb3","Spn8ALzb3", "Spn9ALxb3","Spn9ALyb3","Spn9ALzb3") );
	private ArrayList<String> BladePitchMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"PtchPMzc1","PtchPMzc2","PtchPMzc3") );
	private ArrayList<String> TeeterMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"TeetPya","TeetVya","TeetAya") );
	private ArrayList<String> ShaftMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"LSSTipPxa","LSSTipVxa","LSSTipAxa","LSSGagPxa","LSSGagVxa","LSSGagAxa","HSShftV","HSShftA","TipSpdRat") );
	private ArrayList<String> NacellIMUMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"NclMUTVxs","NclMUTVys","NclMUTVzs","NclMUTAxs","NclMUTAys","NclMUTAzs",
					"NclMURVxs","NclMURVys","NclMURVzs","NclMURAxs","NclMURAys","NclMURAzs") );
	private ArrayList<String> RotorFurlMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RotFurlP","RotFurlV","RotFurlA") );
	private ArrayList<String> TailFurlMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"TailFurlP","TailFurlV","TailFurlA") );
	private ArrayList<String> NacelleYawMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"YawPzn","YawVzn","YawAzn","NacYawErr") );
	private ArrayList<String> TowerTopYawBearingMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"YawBrTDxp","YawBrTDyp","YawBrTDzp", "YawBrTDxt","YawBrTDyt","YawBrTDzt", "YawBrTAxp","YawBrTAyp","YawBrTAzp",	
					"YawBrRDxt","YawBrRDyt","YawBrRDzt", "YawBrRVxp","YawBrRVyp","YawBrRVzp", "YawBrRAxp","YawBrRAyp","YawBrRAzp") );
	private ArrayList<String> LocalTowerMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"Spn1ALxb1","Spn1ALyb1","Spn1ALzb1", "Spn2ALxb1","Spn2ALyb1","Spn2ALzb1", "Spn3ALxb1","Spn3ALyb1","Spn3ALzb1", 
					"Spn4ALxb1","Spn4ALyb1","Spn4ALzb1", "Spn5ALxb1","Spn5ALyb1","Spn5ALzb1", "Spn6ALxb1","Spn6ALyb1","Spn6ALzb1",
					"Spn7ALxb1","Spn7ALyb1","Spn7ALzb1", "Spn8ALxb1","Spn8ALyb1","Spn8ALzb1", "Spn9ALxb1","Spn9ALyb1","Spn9ALzb1") );
	private ArrayList<String> PlatformMotions 	= new ArrayList<String>( 
			Lists.newArrayList(
					"PtfmTDxt","PtfmTDyt","PtfmTDzt", "PtfmTDxi","PtfmTDyi","PtfmTDzi", 
					"PtfmTVxt","PtfmTVyt","PtfmTVzt", "PtfmTVxi","PtfmTVyi","PtfmTVzi", 
					"PtfmTAxt","PtfmTAyt","PtfmTAzt", "PtfmTAxi","PtfmTAyi","PtfmTAzi", 
					
					"PtfmRDxi","PtfmRDyi","PtfmRDzi", "PtfmRVxt","PtfmRVyt","PtfmRVzt", 
					"PtfmRVxi","PtfmRVyi","PtfmRVzi", "PtfmRAxt","PtfmRAyt","PtfmRAzt", 
					"PtfmRAxi","PtfmRAyi","PtfmRAzi" ) );
	private ArrayList<String> Blade1RootLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc1","RootFyc1","RootFzc1",
					"RootFxb1","RootFyb1",
					
					"RootMxc1","RootMyc1","RootMzc1",
					"RootMxb1","RootMyb1") );
	private ArrayList<String> Blade2RootLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc2","RootFyc2","RootFzc2",
					"RootFxb2","RootFyb2",
					
					"RootMxc2","RootMyc2","RootMzc2",
					"RootMxb2","RootMyb2") );
	private ArrayList<String> Blade3RootLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );

	//TODO
	private ArrayList<String> Blade1LocalSpanLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );
	private ArrayList<String> Blade2LocalSpanLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );
	private ArrayList<String> Blade3LocalSpanLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );
	private ArrayList<String> HubAndRotorLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );
	private ArrayList<String> ShaftStrainGagesLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );
	private ArrayList<String> GeneratorAndHSSShaftLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );
	private ArrayList<String> RotorFurlBearingLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );
	private ArrayList<String> TailFinAerodynamicLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );
	private ArrayList<String> TowerTopYawBearingLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );
	private ArrayList<String> TowerBaseLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );
	private ArrayList<String> LocalTowerLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );
	private ArrayList<String> PlatformLoads 	= new ArrayList<String>( 
			Lists.newArrayList(
					"RootFxc3","RootFyc3","RootFzc3",
					"RootFxb3","RootFyb3",
					
					"RootMxc3","RootMyc3","RootMzc3",
					"RootMxb3","RootMyb3") );
	
	public void setAllSelected(String[] values) {
		for(int i=0; i<values.length; i++) {
			if(get(values[i]) != null)
				get(values[i]).setAvailable(true);
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
	
	public String[] getAllSelected() {
		return null;
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
		
		return get(name).isAvailable();

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
	// usato x canali disponibili in FAST.out
	public OutList(List<String> avail) {
		this();
		
		// define available channels
		Iterator<String> it = avail.iterator();
		while(it.hasNext()) {
			OutCh ch = (OutCh)this.get(it.next());
			if(ch!=null)
				ch.setAvailable(true);
		}
		
	}
	
	public OutList() {
		
		outBlocksMap.put("Wind Motions",					WindMotions					);
		outBlocksMap.put("Blade 1 Tip Motions",				Blade1TipMotions			);
		outBlocksMap.put("Blade 2 Tip Motions",				Blade2TipMotions			);
		outBlocksMap.put("Blade 3 Tip Motions",				Blade3TipMotions			);
		outBlocksMap.put("Blade 1 Local Span Motions",		Blade1LocalSpanMotions		);
		outBlocksMap.put("Blade 2 Local Span Motions",		Blade2LocalSpanMotions		);
		outBlocksMap.put("Blade 3 Local Span Motions",		Blade3LocalSpanMotions		);
		
		outBlocksMap.put("Blade Pitch Motions",				BladePitchMotions			);
		outBlocksMap.put("Teeter Motions",					TeeterMotions				);
		outBlocksMap.put("Shaft Motions",					ShaftMotions				);
		outBlocksMap.put("Nacell IMU Motions",				NacellIMUMotions			);
		outBlocksMap.put("RotorFurl Motions",				RotorFurlMotions			);
		outBlocksMap.put("Tail Furl Motions",				TailFurlMotions				);
		outBlocksMap.put("Nacelle Yaw Motions",				NacelleYawMotions			);
		outBlocksMap.put("Tower-Top Yaw Bearing Motions",	TowerTopYawBearingMotions	);
		outBlocksMap.put("Local Tower Motions",				LocalTowerMotions			);
		
		outBlocksMap.put("Platform Motions",				PlatformMotions			);
		outBlocksMap.put("Blade 1 Root Loads",				Blade1RootLoads		);
		outBlocksMap.put("Blade 2 Root Loads",				Blade2RootLoads		);
		outBlocksMap.put("Blade 3 Root Loads",				Blade3RootLoads		);
		
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//This table gives the Name(s), Descriptions, Conventions, and Units of all of the available output channels in FAST.
		//Compatible with FAST v7.00.00.
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Name       | Other Name(s)                  | Description                                                     | Convention                                         | Units       
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		//
		// Wind Motion: 
		//
		put("WindVxi",	new OutCh("WindVxi",new String[]{"uWind"}, 
				"Nominally downwind component of the hub-height wind velocity (unavailable if CompAero = False)",
				"Directed along the xi-axis", "(m/sec)"));
		put("WindVyi", 	new OutCh("WindVyi",new String[]{"vWind"},
				"Cross-wind component of the hub-height wind velocity (unavailable if CompAero = False)",
				"Directed along the yi-axis", "(m/sec)"));     
		put("WindVzi",	new OutCh("WindVzi",new String[]{"wWind"},
				"Vertical component of the hub-height wind velocity (unavailable if CompAero = False)",
				"Directed along the zi-axis", "(m/sec)"));     
		put("TotWindV",	new OutCh("TotWindV",new String[]{""},
				"Total hub-height wind velocity magnitude (unavailable if CompAero = False)",
				"N/A", "(m/sec)"));     
		put("HorWindV", new OutCh("HorWindV",new String[]{""},
				"Horizontal hub-height wind velocity magnitude (unavailable if CompAero = False)",
				"In the xi- and yi-plane", "(m/sec)"));     
		put("HorWndDir",new OutCh("HorWndDir",new String[]{""},
				"Horizontal hub-height wind direction. Please note that FAST uses the opposite sign convention that AeroDyn uses. Put a '-', '_', 'm', or 'M' character in front of this variable name if you want to use the AeroDyn convention. (unavailable if CompAero = False)",
				"About the zi-axis", "(deg)"));       
		put("VerWndDir",new OutCh("VerWndDir",new String[]{""},
				"Vertical hub-height wind direction (unavailable if CompAero = False)",
				"About an axis orthogonal to the zi-axis and the HorWindV-vector", "(deg)"));       
		//
		// Blade 1 Tip Motions:
		//
		put("TipDxc1", new OutCh("TipDxc1",new String[]{"OoPDefl1"},	
				"Blade 1 out-of-plane tip deflection (relative to the pitch axis)", 
				"Directed along the xc1-axis", "(m)"));         
		put("TipDyc1",	new OutCh("TipDyc1",new String[]{"IPDefl1"}, 
				"Blade 1 in-plane tip deflection (relative to the pitch axis)", 
				"Directed along the yc1-axis", "(m)"));         
		put("TipDzc1",	new OutCh("TipDzc1",new String[]{"TipDzb1"}, 
				"Blade 1 axial tip deflection (relative to the pitch axis)",
				"Directed along the zc1- and zb1-axes","(m)"));         
		put("TipDxb1",	new OutCh("TipDxb1",new String[]{""},
				"Blade 1 flapwise tip deflection (relative to the pitch axis)",
				"Directed along the xb1-axis","(m)"));         
		put("TipDyb1", 	new OutCh("TipDyb1",new String[]{""}, 
				"Blade 1 edgewise tip deflection (relative to the pitch axis)", 
				"Directed along the yb1-axis","(m)"));         
		put("TipALxb1",	new OutCh("TipALxb1",new String[]{""},
				"Blade 1 local flapwise tip acceleration (absolute)",
				"Directed along the local xb1-axis","(m/sec^2)"));   
		put("TipALyb1", new OutCh("TipALyb1",new String[]{""},
				"Blade 1 local edgewise tip acceleration (absolute)",
				"Directed along the local yb1-axis","(m/sec^2)"));   
		put("TipALzb1",	new OutCh("TipALzb1",new String[]{""},
				"Blade 1 local axial tip acceleration (absolute)",
				"Directed along the local zb1-axis","(m/sec^2)"));   
		put("TipRDxb1",	new OutCh("TipRDxb1",new String[]{"RollDefl1"},
				"Blade 1 roll (angular/rotational) tip deflection (relative to the undeflected position).  In ADAMS, it is output as an " +          
	           	"Euler angle computed as the 3rd rotation in the yaw-pitch-roll rotation sequence.  It is not output as an Euler angle in FAST, " +
				"which assumes small blade deflections, so that the rotation sequence does not matter.",
				"About the xb1-axis","(deg)"));  
		put("TipRDyb1",	new OutCh("TipRDxb1",new String[]{"PtchDefl1"},
				"Blade 1 pitch (angular/rotational) tip deflection (relative to the undeflected position).  In ADAMS, it is output as an " +
				"Euler angle computed as the 2nd rotation in the yaw-pitch-roll rotation sequence.  It is not output as an Euler angle in FAST, " +
				"which assumes small blade deflections, so that the rotation sequence does not matter.",
				"About the yb1-axis","(deg)"));
		put("TipRDzc1",	new OutCh("TipRDzc1",new String[]{"TipRDzb1, TwstDefl1"},
				"Blade 1 torsional tip deflection (relative to the undeflected  position).  This output will always be zero for FAST " +
				"simulation results.  Use it for examining blade torsional deflections of ADAMS simulations run using ADAMS datasets " + 
				"created using the FAST-to-ADAMS preprocessor.  In ADAMS, it is output as an Euler angle computed as the 1st rotation in " + 
				"the yaw-pitch-roll rotation sequence. Please note that this output uses the opposite of the sign convention used for blade pitch angles.",
				"About the zc1- and zb1-axes","(deg)"));              
		put("TipClrnc1",new OutCh("TipClrnc1",new String[]{"TwrClrnc1, Tip2Twr1"},
				"Blade 1 tip-to-tower clearance estimate.  This is computed as the perpendicular distance from the yaw axis to the tip of " + 
				"blade 1 when the blade tip is below the yaw bearing. When the tip of blade 1 is above the yaw bearing, it is computed " +  
				"as the absolute distance from the yaw bearing to the blade 2 tip. Please note that you should reduce this value by the " + 
				"tower radius to obtain the actual tower clearance.",
				"N/A","(m)")); 
		
		//
		// Blade 2 Tip Motions:
		//
		put("TipDxc2", new OutCh("TipDxc2",new String[]{"OoPDefl2"},	
				"Blade 2 out-of-plane tip deflection (relative to the pitch axis)", 
				"Directed along the xc2-axis", "(m)"));         
		put("TipDyc2",	new OutCh("TipDyc2",new String[]{"IPDefl2"}, 
				"Blade 2 in-plane tip deflection (relative to the pitch axis)", 
				"Directed along the yc2-axis", "(m)"));         
		put("TipDzc2",	new OutCh("TipDzc2",new String[]{"TipDzb2"}, 
				"Blade 2 axial tip deflection (relative to the pitch axis)",
				"Directed along the zc2- and zb2-axes","(m)"));         
		put("TipDxb2",	new OutCh("TipDxb2",new String[]{""},
				"Blade 2 flapwise tip deflection (relative to the pitch axis)",
				"Directed along the xb2-axis","(m)"));         
		put("TipDyb2", 	new OutCh("TipDyb2",new String[]{""}, 
				"Blade 2 edgewise tip deflection (relative to the pitch axis)", 
				"Directed along the yb2-axis","(m)"));         
		put("TipALxb2",	new OutCh("TipALxb2",new String[]{""},
				"Blade 2 local flapwise tip acceleration (absolute)",
				"Directed along the local xb2-axis","(m/sec^2)"));   
		put("TipALyb2", new OutCh("TipALyb2",new String[]{""},
				"Blade 2 local edgewise tip acceleration (absolute)",
				"Directed along the local yb2-axis","(m/sec^2)"));   
		put("TipALzb2",	new OutCh("TipALzb2",new String[]{""},
				"Blade 2 local axial tip acceleration (absolute)",
				"Directed along the local zb2-axis","(m/sec^2)"));   
		put("TipRDxb2",	new OutCh("TipRDxb2",new String[]{"RollDefl2"},
				"Blade 2 roll (angular/rotational) tip deflection (relative to the undeflected position).  In ADAMS, it is output as an " +          
	           	"Euler angle computed as the 3rd rotation in the yaw-pitch-roll rotation sequence.  It is not output as an Euler angle in FAST, " +
				"which assumes small blade deflections, so that the rotation sequence does not matter.",
				"About the xb2-axis","(deg)"));  
		put("TipRDyb2",	new OutCh("TipRDxb2",new String[]{"PtchDefl2"},
				"Blade 2 pitch (angular/rotational) tip deflection (relative to the undeflected position).  In ADAMS, it is output as an " +
				"Euler angle computed as the 2nd rotation in the yaw-pitch-roll rotation sequence.  It is not output as an Euler angle in FAST, " +
				"which assumes small blade deflections, so that the rotation sequence does not matter.",
				"About the yb2-axis","(deg)"));
		put("TipRDzc2",	new OutCh("TipRDzc2",new String[]{"TipRDzb2, TwstDefl2"},
				"Blade 2 torsional tip deflection (relative to the undeflected  position).  This output will always be zero for FAST " +
				"simulation results.  Use it for examining blade torsional deflections of ADAMS simulations run using ADAMS datasets " + 
				"created using the FAST-to-ADAMS preprocessor.  In ADAMS, it is output as an Euler angle computed as the 2st rotation in " + 
				"the yaw-pitch-roll rotation sequence. Please note that this output uses the opposite of the sign convention used for blade pitch angles.",
				"About the zc2- and zb2-axes","(deg)"));              
		put("TipClrnc2",new OutCh("TipClrnc2",new String[]{"TwrClrnc2, Tip2Twr2"},
				"Blade 2 tip-to-tower clearance estimate.  This is computed as the perpendicular distance from the yaw axis to the tip of " + 
				"blade 2 when the blade tip is below the yaw bearing. When the tip of blade 2 is above the yaw bearing, it is computed " +  
				"as the absolute distance from the yaw bearing to the blade 2 tip. Please note that you should reduce this value by the " + 
				"tower radius to obtain the actual tower clearance.",
				"N/A","(m)"));
		
		//
		// Blade 3 Tip Motions:
		//
		put("TipDxc3", new OutCh("TipDxc3",new String[]{"OoPDefl3"},	
				"Blade 3 out-of-plane tip deflection (relative to the pitch axis)", 
				"Directed along the xc3-axis", "(m)"));         
		put("TipDyc3",	new OutCh("TipDyc3",new String[]{"IPDefl3"}, 
				"Blade 3 in-plane tip deflection (relative to the pitch axis)", 
				"Directed along the yc3-axis", "(m)"));         
		put("TipDzc3",	new OutCh("TipDzc3",new String[]{"TipDzb3"}, 
				"Blade 3 axial tip deflection (relative to the pitch axis)",
				"Directed along the zc3- and zb3-axes","(m)"));         
		put("TipDxb3",	new OutCh("TipDxb3",new String[]{""},
				"Blade 3 flapwise tip deflection (relative to the pitch axis)",
				"Directed along the xb3-axis","(m)"));         
		put("TipDyb3", 	new OutCh("TipDyb3",new String[]{""}, 
				"Blade 3 edgewise tip deflection (relative to the pitch axis)", 
				"Directed along the yb3-axis","(m)"));         
		put("TipALxb3",	new OutCh("TipALxb3",new String[]{""},
				"Blade 3 local flapwise tip acceleration (absolute)",
				"Directed along the local xb3-axis","(m/sec^2)"));   
		put("TipALyb3", new OutCh("TipALyb3",new String[]{""},
				"Blade 3 local edgewise tip acceleration (absolute)",
				"Directed along the local yb3-axis","(m/sec^2)"));   
		put("TipALzb3",	new OutCh("TipALzb3",new String[]{""},
				"Blade 3 local axial tip acceleration (absolute)",
				"Directed along the local zb3-axis","(m/sec^2)"));   
		put("TipRDxb3",	new OutCh("TipRDxb3",new String[]{"RollDefl3"},
				"Blade 3 roll (angular/rotational) tip deflection (relative to the undeflected position).  In ADAMS, it is output as an " +          
				"Euler angle computed as the 3rd rotation in the yaw-pitch-roll rotation sequence.  It is not output as an Euler angle in FAST, " +
				"which assumes small blade deflections, so that the rotation sequence does not matter.",
				"About the xb3-axis","(deg)"));  
		put("TipRDyb3",	new OutCh("TipRDxb3",new String[]{"PtchDefl3"},
				"Blade 3 pitch (angular/rotational) tip deflection (relative to the undeflected position).  In ADAMS, it is output as an " +
				"Euler angle computed as the 3nd rotation in the yaw-pitch-roll rotation sequence.  It is not output as an Euler angle in FAST, " +
				"which assumes small blade deflections, so that the rotation sequence does not matter.",
				"About the yb3-axis","(deg)"));
		put("TipRDzc3",	new OutCh("TipRDzc3",new String[]{"TipRDzb3, TwstDefl3"},
				"Blade 3 torsional tip deflection (relative to the undeflected  position).  This output will always be zero for FAST " +
				"simulation results.  Use it for examining blade torsional deflections of ADAMS simulations run using ADAMS datasets " + 
				"created using the FAST-to-ADAMS preprocessor.  In ADAMS, it is output as an Euler angle computed as the 1st rotation in " + 
				"the yaw-pitch-roll rotation sequence. Please note that this output uses the opposite of the sign convention used for blade pitch angles.",
				"About the zc3- and zb3-axes","(deg)"));              
		put("TipClrnc3",new OutCh("TipClrnc3",new String[]{"TwrClrnc3, Tip3Twr3"},
				"Blade 3 tip-to-tower clearance estimate.  This is computed as the perpendicular distance from the yaw axis to the tip of " + 
				"blade 3 when the blade tip is below the yaw bearing. When the tip of blade 3 is above the yaw bearing, it is computed " +  
				"as the absolute distance from the yaw bearing to the blade 3 tip. Please note that you should reduce this value by the " + 
				"tower radius to obtain the actual tower clearance.",
				"N/A","(m)"));
	
		//
		// Blade 1 Local Span Motions: 
		//
		put("Spn1ALxb1",new OutCh("Spn1ALxb1",new String[]{""},"","",""));
		put("Spn1ALyb1",new OutCh("Spn1ALyb1",new String[]{""},"","",""));
		put("Spn1ALzb1",new OutCh("Spn1ALzb1",new String[]{""},"","",""));
		
		put("Spn2ALxb1",new OutCh("Spn2ALxb1",new String[]{""},"","",""));
		put("Spn2ALyb1",new OutCh("Spn2ALyb1",new String[]{""},"","",""));
		put("Spn2ALzb1",new OutCh("Spn2ALzb1",new String[]{""},"","",""));
		
		put("Spn3ALxb1",new OutCh("Spn3ALxb1",new String[]{""},"","",""));
		put("Spn3ALyb1",new OutCh("Spn3ALyb1",new String[]{""},"","",""));
		put("Spn3ALzb1",new OutCh("Spn3ALzb1",new String[]{""},"","",""));
		
		put("Spn4ALxb1",new OutCh("Spn4ALxb1",new String[]{""},"","",""));
		put("Spn4ALyb1",new OutCh("Spn4ALyb1",new String[]{""},"","",""));
		put("Spn4ALzb1",new OutCh("Spn4ALzb1",new String[]{""},"","",""));
		
		put("Spn5ALxb1",new OutCh("Spn5ALxb1",new String[]{""},"","",""));
		put("Spn5ALyb1",new OutCh("Spn5ALyb1",new String[]{""},"","",""));
		put("Spn5ALzb1",new OutCh("Spn5ALzb1",new String[]{""},"","",""));
		
		put("Spn6ALxb1",new OutCh("Spn6ALxb1",new String[]{""},"","",""));
		put("Spn6ALyb1",new OutCh("Spn6ALyb1",new String[]{""},"","",""));
		put("Spn6ALzb1",new OutCh("Spn6ALzb1",new String[]{""},"","",""));
		
		put("Spn7ALxb1",new OutCh("Spn7ALxb1",new String[]{""},"","",""));
		put("Spn7ALyb1",new OutCh("Spn7ALyb1",new String[]{""},"","",""));
		put("Spn7ALzb1",new OutCh("Spn7ALzb1",new String[]{""},"","",""));
		
		put("Spn8ALxb1",new OutCh("Spn8ALxb1",new String[]{""},"","",""));
		put("Spn8ALyb1",new OutCh("Spn8ALyb1",new String[]{""},"","",""));
		put("Spn8ALzb1",new OutCh("Spn8ALzb1",new String[]{""},"","",""));
		
		put("Spn9ALxb1",new OutCh("Spn9ALxb1",new String[]{""},"","",""));
		put("Spn9ALyb1",new OutCh("Spn9ALyb1",new String[]{""},"","",""));
		put("Spn9ALzb1",new OutCh("Spn9ALzb1",new String[]{""},"","",""));
		
		/*
	Spn1ALxb1  |                                | Blade 1 local flapwise acceleration (absolute) of span          | Directed along the local xb1-axis                  | (m/sec^2)   
	           |                                |   station 1 (unavailable if NBlGages = 0)                       |                                                    |             
	Spn1ALyb1  |                                | Blade 1 local edgewise acceleration (absolute) of span          | Directed along the local yb1-axis                  | (m/sec^2)   
	           |                                |   station 1 (unavailable if NBlGages = 0)                       |                                                    |             
	Spn1ALzb1  |                                | Blade 1 local axial acceleration (absolute) of span station 1   | Directed along the local zb1-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages = 0)                                 |                                                    |             
	Spn2ALxb1  |                                | Blade 1 local flapwise acceleration (absolute) of span          | Directed along the local xb1-axis                  | (m/sec^2)   
	           |                                |   station 2 (unavailable if NBlGages < 2)                       |                                                    |             
	Spn2ALyb1  |                                | Blade 1 local edgewise acceleration (absolute) of span          | Directed along the local yb1-axis                  | (m/sec^2)   
	           |                                |   station 2 (unavailable if NBlGages < 2)                       |                                                    |             
	Spn2ALzb1  |                                | Blade 1 local axial acceleration (absolute) of span station 2   | Directed along the local zb1-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 2)                                 |                                                    |             
	Spn3ALxb1  |                                | Blade 1 local flapwise acceleration (absolute) of span          | Directed along the local xb1-axis                  | (m/sec^2)   
	           |                                |   station 3 (unavailable if NBlGages < 3)                       |                                                    |             
	Spn3ALyb1  |                                | Blade 1 local edgewise acceleration (absolute) of span          | Directed along the local yb1-axis                  | (m/sec^2)   
	           |                                |   station 3 (unavailable if NBlGages < 3)                       |                                                    |             
	Spn3ALzb1  |                                | Blade 1 local axial acceleration (absolute) of span station 3   | Directed along the local zb1-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 3)                                 |                                                    |             
	Spn4ALxb1  |                                | Blade 1 local flapwise acceleration (absolute) of span          | Directed along the local xb1-axis                  | (m/sec^2)   
	           |                                |   station 4 (unavailable if NBlGages < 4)                       |                                                    |             
	Spn4ALyb1  |                                | Blade 1 local edgewise acceleration (absolute) of span          | Directed along the local yb1-axis                  | (m/sec^2)   
	           |                                |   station 4 (unavailable if NBlGages < 4)                       |                                                    |             
	Spn4ALzb1  |                                | Blade 1 local axial acceleration (absolute) of span station 4   | Directed along the local zb1-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 4)                                 |                                                    |             
	Spn5ALxb1  |                                | Blade 1 local flapwise acceleration (absolute) of span          | Directed along the local xb1-axis                  | (m/sec^2)   
	           |                                |   station 5 (unavailable if NBlGages < 5)                       |                                                    |             
	Spn5ALyb1  |                                | Blade 1 local edgewise acceleration (absolute) of span          | Directed along the local yb1-axis                  | (m/sec^2)   
	           |                                |   station 5 (unavailable if NBlGages < 5)                       |                                                    |             
	Spn5ALzb1  |                                | Blade 1 local axial acceleration (absolute) of span station 5   | Directed along the local zb1-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 5)                                 |                                                    |             
	Spn6ALxb1  |                                | Blade 1 local flapwise acceleration (absolute) of span          | Directed along the local xb1-axis                  | (m/sec^2)   
	           |                                |   station 6 (unavailable if NBlGages < 6)                       |                                                    |             
	Spn6ALyb1  |                                | Blade 1 local edgewise acceleration (absolute) of span          | Directed along the local yb1-axis                  | (m/sec^2)   
	           |                                |   station 6 (unavailable if NBlGages < 6)                       |                                                    |             
	Spn6ALzb1  |                                | Blade 1 local axial acceleration (absolute) of span station 6   | Directed along the local zb1-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 6)                                 |                                                    |             
	Spn7ALxb1  |                                | Blade 1 local flapwise acceleration (absolute) of span          | Directed along the local xb1-axis                  | (m/sec^2)   
	           |                                |   station 7 (unavailable if NBlGages < 7)                       |                                                    |             
	Spn7ALyb1  |                                | Blade 1 local edgewise acceleration (absolute) of span          | Directed along the local yb1-axis                  | (m/sec^2)   
	           |                                |   station 7 (unavailable if NBlGages < 7)                       |                                                    |             
	Spn7ALzb1  |                                | Blade 1 local axial acceleration (absolute) of span station 7   | Directed along the local zb1-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 7)                                 |                                                    |             
	Spn8ALxb1  |                                | Blade 1 local flapwise acceleration (absolute) of span          | Directed along the local xb1-axis                  | (m/sec^2)   
	           |                                |   station 8 (unavailable if NBlGages < 8)                       |                                                    |             
	Spn8ALyb1  |                                | Blade 1 local edgewise acceleration (absolute) of span          | Directed along the local yb1-axis                  | (m/sec^2)   
	           |                                |   station 8 (unavailable if NBlGages < 8)                       |                                                    |             
	Spn8ALzb1  |                                | Blade 1 local axial acceleration (absolute) of span station 8   | Directed along the local zb1-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 8)                                 |                                                    |             
	Spn9ALxb1  |                                | Blade 1 local flapwise acceleration (absolute) of span          | Directed along the local xb1-axis                  | (m/sec^2)   
	           |                                |   station 9 (unavailable if NBlGages < 9)                       |                                                    |             
	Spn9ALyb1  |                                | Blade 1 local edgewise acceleration (absolute) of span          | Directed along the local yb1-axis                  | (m/sec^2)   
	           |                                |   station 9 (unavailable if NBlGages < 9)                       |                                                    |             
	Spn9ALzb1  |                                | Blade 1 local axial acceleration (absolute) of span station 9   | Directed along the local zb1-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 9)                                 |                                                    |             
		*/
		
		//
		// Blade 2 Local Span Motions: 
		//
		put("Spn1ALxb2",new OutCh("Spn1ALxb2",new String[]{""},"","",""));
		put("Spn1ALyb2",new OutCh("Spn1ALyb2",new String[]{""},"","",""));
		put("Spn1ALzb2",new OutCh("Spn1ALzb2",new String[]{""},"","",""));

		put("Spn2ALxb2",new OutCh("Spn2ALxb2",new String[]{""},"","",""));
		put("Spn2ALyb2",new OutCh("Spn2ALyb2",new String[]{""},"","",""));
		put("Spn2ALzb2",new OutCh("Spn2ALzb2",new String[]{""},"","",""));

		put("Spn3ALxb2",new OutCh("Spn3ALxb2",new String[]{""},"","",""));
		put("Spn3ALyb2",new OutCh("Spn3ALyb2",new String[]{""},"","",""));
		put("Spn3ALzb2",new OutCh("Spn3ALzb2",new String[]{""},"","",""));

		put("Spn4ALxb2",new OutCh("Spn4ALxb2",new String[]{""},"","",""));
		put("Spn4ALyb2",new OutCh("Spn4ALyb2",new String[]{""},"","",""));
		put("Spn4ALzb2",new OutCh("Spn4ALzb2",new String[]{""},"","",""));

		put("Spn5ALxb2",new OutCh("Spn5ALxb2",new String[]{""},"","",""));
		put("Spn5ALyb2",new OutCh("Spn5ALyb2",new String[]{""},"","",""));
		put("Spn5ALzb2",new OutCh("Spn5ALzb2",new String[]{""},"","",""));

		put("Spn6ALxb2",new OutCh("Spn6ALxb2",new String[]{""},"","",""));
		put("Spn6ALyb2",new OutCh("Spn6ALyb2",new String[]{""},"","",""));
		put("Spn6ALzb2",new OutCh("Spn6ALzb2",new String[]{""},"","",""));

		put("Spn7ALxb2",new OutCh("Spn7ALxb2",new String[]{""},"","",""));
		put("Spn7ALyb2",new OutCh("Spn7ALyb2",new String[]{""},"","",""));
		put("Spn7ALzb2",new OutCh("Spn7ALzb2",new String[]{""},"","",""));

		put("Spn8ALxb2",new OutCh("Spn8ALxb2",new String[]{""},"","",""));
		put("Spn8ALyb2",new OutCh("Spn8ALyb2",new String[]{""},"","",""));
		put("Spn8ALzb2",new OutCh("Spn8ALzb2",new String[]{""},"","",""));

		put("Spn9ALxb2",new OutCh("Spn9ALxb2",new String[]{""},"","",""));
		put("Spn9ALyb2",new OutCh("Spn9ALyb2",new String[]{""},"","",""));
		put("Spn9ALzb2",new OutCh("Spn9ALzb2",new String[]{""},"","",""));
		
		/*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	Blade 2 Local Span Motions:                                                                                                                                                      
	Spn1ALxb2  |                                | Blade 2 local flapwise acceleration (absolute) of span          | Directed along the local xb2-axis                  | (m/sec^2)   
	           |                                |   station 1 (unavailable if NBlGages = 0)                       |                                                    |             
	Spn1ALyb2  |                                | Blade 2 local edgewise acceleration (absolute) of span          | Directed along the local yb2-axis                  | (m/sec^2)   
	           |                                |   station 1 (unavailable if NBlGages = 0)                       |                                                    |             
	Spn1ALzb2  |                                | Blade 2 local axial acceleration (absolute) of span station 1   | Directed along the local zb2-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages = 0)                                 |                                                    |             
	Spn2ALxb2  |                                | Blade 2 local flapwise acceleration (absolute) of span          | Directed along the local xb2-axis                  | (m/sec^2)   
	           |                                |   station 2 (unavailable if NBlGages < 2)                       |                                                    |             
	Spn2ALyb2  |                                | Blade 2 local edgewise acceleration (absolute) of span          | Directed along the local yb2-axis                  | (m/sec^2)   
	           |                                |   station 2 (unavailable if NBlGages < 2)                       |                                                    |             
	Spn2ALzb2  |                                | Blade 2 local axial acceleration (absolute) of span station 2   | Directed along the local zb2-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 2)                                 |                                                    |             
	Spn3ALxb2  |                                | Blade 2 local flapwise acceleration (absolute) of span          | Directed along the local xb2-axis                  | (m/sec^2)   
	           |                                |   station 3 (unavailable if NBlGages < 3)                       |                                                    |             
	Spn3ALyb2  |                                | Blade 2 local edgewise acceleration (absolute) of span          | Directed along the local yb2-axis                  | (m/sec^2)   
	           |                                |   station 3 (unavailable if NBlGages < 3)                       |                                                    |             
	Spn3ALzb2  |                                | Blade 2 local axial acceleration (absolute) of span station 3   | Directed along the local zb2-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 3)                                 |                                                    |             
	Spn4ALxb2  |                                | Blade 2 local flapwise acceleration (absolute) of span          | Directed along the local xb2-axis                  | (m/sec^2)   
	           |                                |   station 4 (unavailable if NBlGages < 4)                       |                                                    |             
	Spn4ALyb2  |                                | Blade 2 local edgewise acceleration (absolute) of span          | Directed along the local yb2-axis                  | (m/sec^2)   
	           |                                |   station 4 (unavailable if NBlGages < 4)                       |                                                    |             
	Spn4ALzb2  |                                | Blade 2 local axial acceleration (absolute) of span station 4   | Directed along the local zb2-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 4)                                 |                                                    |             
	Spn5ALxb2  |                                | Blade 2 local flapwise acceleration (absolute) of span          | Directed along the local xb2-axis                  | (m/sec^2)   
	           |                                |   station 5 (unavailable if NBlGages < 5)                       |                                                    |             
	Spn5ALyb2  |                                | Blade 2 local edgewise acceleration (absolute) of span          | Directed along the local yb2-axis                  | (m/sec^2)   
	           |                                |   station 5 (unavailable if NBlGages < 5)                       |                                                    |             
	Spn5ALzb2  |                                | Blade 2 local axial acceleration (absolute) of span station 5   | Directed along the local zb2-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 5)                                 |                                                    |             
	Spn6ALxb2  |                                | Blade 2 local flapwise acceleration (absolute) of span          | Directed along the local xb2-axis                  | (m/sec^2)   
	           |                                |   station 6 (unavailable if NBlGages < 6)                       |                                                    |             
	Spn6ALyb2  |                                | Blade 2 local edgewise acceleration (absolute) of span          | Directed along the local yb2-axis                  | (m/sec^2)   
	           |                                |   station 6 (unavailable if NBlGages < 6)                       |                                                    |             
	Spn6ALzb2  |                                | Blade 2 local axial acceleration (absolute) of span station 6   | Directed along the local zb2-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 6)                                 |                                                    |             
	Spn7ALxb2  |                                | Blade 2 local flapwise acceleration (absolute) of span          | Directed along the local xb2-axis                  | (m/sec^2)   
	           |                                |   station 7 (unavailable if NBlGages < 7)                       |                                                    |             
	Spn7ALyb2  |                                | Blade 2 local edgewise acceleration (absolute) of span          | Directed along the local yb2-axis                  | (m/sec^2)   
	           |                                |   station 7 (unavailable if NBlGages < 7)                       |                                                    |             
	Spn7ALzb2  |                                | Blade 2 local axial acceleration (absolute) of span station 7   | Directed along the local zb2-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 7)                                 |                                                    |             
	Spn8ALxb2  |                                | Blade 2 local flapwise acceleration (absolute) of span          | Directed along the local xb2-axis                  | (m/sec^2)   
	           |                                |   station 8 (unavailable if NBlGages < 8)                       |                                                    |             
	Spn8ALyb2  |                                | Blade 2 local edgewise acceleration (absolute) of span          | Directed along the local yb2-axis                  | (m/sec^2)   
	           |                                |   station 8 (unavailable if NBlGages < 8)                       |                                                    |             
	Spn8ALzb2  |                                | Blade 2 local axial acceleration (absolute) of span station 8   | Directed along the local zb2-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 8)                                 |                                                    |             
	Spn9ALxb2  |                                | Blade 2 local flapwise acceleration (absolute) of span          | Directed along the local xb2-axis                  | (m/sec^2)   
	           |                                |   station 9 (unavailable if NBlGages < 9)                       |                                                    |             
	Spn9ALyb2  |                                | Blade 2 local edgewise acceleration (absolute) of span          | Directed along the local yb2-axis                  | (m/sec^2)   
	           |                                |   station 9 (unavailable if NBlGages < 9)                       |                                                    |             
	Spn9ALzb2  |                                | Blade 2 local axial acceleration (absolute) of span station 9   | Directed along the local zb2-axis                  | (m/sec^2)   
	           |                                |   (unavailable if NBlGages < 9)                                 |                                                    |             
	---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		*/
		
		//
		// Blade 3 Local Span Motions: 
		//
		put("Spn1ALxb3",new OutCh("Spn1ALxb3",new String[]{""},"","",""));
		put("Spn1ALyb3",new OutCh("Spn1ALyb3",new String[]{""},"","",""));
		put("Spn1ALzb3",new OutCh("Spn1ALzb3",new String[]{""},"","",""));
		
		put("Spn2ALxb3",new OutCh("Spn2ALxb3",new String[]{""},"","",""));
		put("Spn2ALyb3",new OutCh("Spn2ALyb3",new String[]{""},"","",""));
		put("Spn2ALzb3",new OutCh("Spn2ALzb3",new String[]{""},"","",""));
		
		put("Spn3ALxb3",new OutCh("Spn3ALxb3",new String[]{""},"","",""));
		put("Spn3ALyb3",new OutCh("Spn3ALyb3",new String[]{""},"","",""));
		put("Spn3ALzb3",new OutCh("Spn3ALzb3",new String[]{""},"","",""));
		
		put("Spn4ALxb3",new OutCh("Spn4ALxb3",new String[]{""},"","",""));
		put("Spn4ALyb3",new OutCh("Spn4ALyb3",new String[]{""},"","",""));
		put("Spn4ALzb3",new OutCh("Spn4ALzb3",new String[]{""},"","",""));
		
		put("Spn5ALxb3",new OutCh("Spn5ALxb3",new String[]{""},"","",""));
		put("Spn5ALyb3",new OutCh("Spn5ALyb3",new String[]{""},"","",""));
		put("Spn5ALzb3",new OutCh("Spn5ALzb3",new String[]{""},"","",""));
		
		put("Spn6ALxb3",new OutCh("Spn6ALxb3",new String[]{""},"","",""));
		put("Spn6ALyb3",new OutCh("Spn6ALyb3",new String[]{""},"","",""));
		put("Spn6ALzb3",new OutCh("Spn6ALzb3",new String[]{""},"","",""));
		
		put("Spn7ALxb3",new OutCh("Spn7ALxb3",new String[]{""},"","",""));
		put("Spn7ALyb3",new OutCh("Spn7ALyb3",new String[]{""},"","",""));
		put("Spn7ALzb3",new OutCh("Spn7ALzb3",new String[]{""},"","",""));
		
		put("Spn8ALxb3",new OutCh("Spn8ALxb3",new String[]{""},"","",""));
		put("Spn8ALyb3",new OutCh("Spn8ALyb3",new String[]{""},"","",""));
		put("Spn8ALzb3",new OutCh("Spn8ALzb3",new String[]{""},"","",""));
		
		put("Spn9ALxb3",new OutCh("Spn9ALxb3",new String[]{""},"","",""));
		put("Spn9ALyb3",new OutCh("Spn9ALyb3",new String[]{""},"","",""));
		put("Spn9ALzb3",new OutCh("Spn9ALzb3",new String[]{""},"","",""));
		
		/*
	Blade 3 Local Span Motions:                                                                                                                                                      
	Spn1ALxb3  |                                | Blade 3 local flapwise acceleration (absolute) of span          | Directed along the local xb3-axis                  | (m/sec^2)   
	           |                                |   station 1 (unavailable for 2-blader or if NBlGages = 0)       |                                                    |             
	Spn1ALyb3  |                                | Blade 3 local edgewise acceleration (absolute) of span          | Directed along the local yb3-axis                  | (m/sec^2)   
	           |                                |   station 1 (unavailable for 2-blader or if NBlGages = 0)       |                                                    |             
	Spn1ALzb3  |                                | Blade 3 local axial acceleration (absolute) of span station 1   | Directed along the local zb3-axis                  | (m/sec^2)   
	           |                                |   (unavailable for 2-blader or if NBlGages = 0)                 |                                                    |             
	Spn2ALxb3  |                                | Blade 3 local flapwise acceleration (absolute) of span          | Directed along the local xb3-axis                  | (m/sec^2)   
	           |                                |   station 2 (unavailable for 2-blader or if NBlGages < 2)       |                                                    |             
	Spn2ALyb3  |                                | Blade 3 local edgewise acceleration (absolute) of span          | Directed along the local yb3-axis                  | (m/sec^2)   
	           |                                |   station 2 (unavailable for 2-blader or if NBlGages < 2)       |                                                    |             
	Spn2ALzb3  |                                | Blade 3 local axial acceleration (absolute) of span station 2   | Directed along the local zb3-axis                  | (m/sec^2)   
	           |                                |   (unavailable for 2-blader or if NBlGages < 2)                 |                                                    |             
	Spn3ALxb3  |                                | Blade 3 local flapwise acceleration (absolute) of span          | Directed along the local xb3-axis                  | (m/sec^2)   
	           |                                |   station 3 (unavailable for 2-blader or if NBlGages < 3)       |                                                    |             
	Spn3ALyb3  |                                | Blade 3 local edgewise acceleration (absolute) of span          | Directed along the local yb3-axis                  | (m/sec^2)   
	           |                                |   station 3 (unavailable for 2-blader or if NBlGages < 3)       |                                                    |             
	Spn3ALzb3  |                                | Blade 3 local axial acceleration (absolute) of span station 3   | Directed along the local zb3-axis                  | (m/sec^2)   
	           |                                |   (unavailable for 2-blader or if NBlGages < 3)                 |                                                    |             
	Spn4ALxb3  |                                | Blade 3 local flapwise acceleration (absolute) of span          | Directed along the local xb3-axis                  | (m/sec^2)   
	           |                                |   station 4 (unavailable for 2-blader or if NBlGages < 4)       |                                                    |             
	Spn4ALyb3  |                                | Blade 3 local edgewise acceleration (absolute) of span          | Directed along the local yb3-axis                  | (m/sec^2)   
	           |                                |   station 4 (unavailable for 2-blader or if NBlGages < 4)       |                                                    |             
	Spn4ALzb3  |                                | Blade 3 local axial acceleration (absolute) of span station 4   | Directed along the local zb3-axis                  | (m/sec^2)   
	           |                                |   (unavailable for 2-blader or if NBlGages < 4)                 |                                                    |             
	Spn5ALxb3  |                                | Blade 3 local flapwise acceleration (absolute) of span          | Directed along the local xb3-axis                  | (m/sec^2)   
	           |                                |   station 5 (unavailable for 2-blader or if NBlGages < 5)       |                                                    |             
	Spn5ALyb3  |                                | Blade 3 local edgewise acceleration (absolute) of span          | Directed along the local yb3-axis                  | (m/sec^2)   
	           |                                |   station 5 (unavailable for 2-blader or if NBlGages < 5)       |                                                    |             
	Spn5ALzb3  |                                | Blade 3 local axial acceleration (absolute) of span station 5   | Directed along the local zb3-axis                  | (m/sec^2)   
	           |                                |   (unavailable for 2-blader or if NBlGages < 5)                 |                                                    |             
	Spn6ALxb3  |                                | Blade 3 local flapwise acceleration (absolute) of span          | Directed along the local xb3-axis                  | (m/sec^2)   
	           |                                |   station 6 (unavailable for 2-blader or if NBlGages < 6)       |                                                    |             
	Spn6ALyb3  |                                | Blade 3 local edgewise acceleration (absolute) of span          | Directed along the local yb3-axis                  | (m/sec^2)   
	           |                                |   station 6 (unavailable for 2-blader or if NBlGages < 6)       |                                                    |             
	Spn6ALzb3  |                                | Blade 3 local axial acceleration (absolute) of span station 6   | Directed along the local zb3-axis                  | (m/sec^2)   
	           |                                |   (unavailable for 2-blader or if NBlGages < 6)                 |                                                    |             
	Spn7ALxb3  |                                | Blade 3 local flapwise acceleration (absolute) of span          | Directed along the local xb3-axis                  | (m/sec^2)   
	           |                                |   station 7 (unavailable for 2-blader or if NBlGages < 7)       |                                                    |             
	Spn7ALyb3  |                                | Blade 3 local edgewise acceleration (absolute) of span          | Directed along the local yb3-axis                  | (m/sec^2)   
	           |                                |   station 7 (unavailable for 2-blader or if NBlGages < 7)       |                                                    |             
	Spn7ALzb3  |                                | Blade 3 local axial acceleration (absolute) of span station 7   | Directed along the local zb3-axis                  | (m/sec^2)   
	           |                                |   (unavailable for 2-blader or if NBlGages < 7)                 |                                                    |             
	Spn8ALxb3  |                                | Blade 3 local flapwise acceleration (absolute) of span          | Directed along the local xb3-axis                  | (m/sec^2)   
	           |                                |   station 8 (unavailable for 2-blader or if NBlGages < 8)       |                                                    |             
	Spn8ALyb3  |                                | Blade 3 local edgewise acceleration (absolute) of span          | Directed along the local yb3-axis                  | (m/sec^2)   
	           |                                |   station 8 (unavailable for 2-blader or if NBlGages < 8)       |                                                    |             
	Spn8ALzb3  |                                | Blade 3 local axial acceleration (absolute) of span station 8   | Directed along the local zb3-axis                  | (m/sec^2)   
	           |                                |   (unavailable for 2-blader or if NBlGages < 8)                 |                                                    |             
	Spn9ALxb3  |                                | Blade 3 local flapwise acceleration (absolute) of span          | Directed along the local xb3-axis                  | (m/sec^2)   
	           |                                |   station 9 (unavailable for 2-blader or if NBlGages < 9)       |                                                    |             
	Spn9ALyb3  |                                | Blade 3 local edgewise acceleration (absolute) of span          | Directed along the local yb3-axis                  | (m/sec^2)   
	           |                                |   station 9 (unavailable for 2-blader or if NBlGages < 9)       |                                                    |             
	Spn9ALzb3  |                                | Blade 3 local axial acceleration (absolute) of span station 9   | Directed along the local zb3-axis                  | (m/sec^2)   
	           |                                |   (unavailable for 2-blader or if NBlGages < 9)                 |                                                    |             
		*/
		
		//
		// Blade Pitch Motions: 
		//
		put("PtchPMzc1",new OutCh("PtchPMzc1",new String[]{""},"","",""));
		put("PtchPMzc2",new OutCh("PtchPMzc2",new String[]{""},"","",""));
		put("PtchPMzc3",new OutCh("PtchPMzc3",new String[]{""},"","",""));
		
		/*                                                                                                                                                           
	PtchPMzc1  | PtchPMzb1, BldPitch1, BlPitch1 | Blade 1 pitch angle (position)                                  | Positive towards feather about the minus zc1- and  | (deg)       
	           |                                |                                                                 |    minus zb1-axes                                  |             
	PtchPMzc2  | PtchPMzb2, BldPitch2, BlPitch2 | Blade 2 pitch angle (position)                                  | Positive towards feather about the minus zc2- and  | (deg)       
	           |                                |                                                                 |    minus zb2-axes                                  |             
	PtchPMzc3  | PtchPMzb3, BldPitch3, BlPitch3 | Blade 3 pitch angle (position) (unavailable for 2-blader)       | Positive towards feather about the minus zc3- and  | (deg)       
               |                                |                                                                 |    minus zb3-axes                                  |             
		 */
		
		//
		// Teeter Motions: 
		//
		put("TeetPya",new OutCh("TeetPya",new String[]{""},"","",""));
		put("TeetVya",new OutCh("TeetVya",new String[]{""},"","",""));
		put("TeetAya",new OutCh("TeetAya",new String[]{""},"","",""));
		
		/*                                                                                                                                                                 
	TeetPya    | RotTeetP, TeetDefl             | Rotor teeter angle (position) (unavailable for 3-blader)        | About the ya-axis                                  | (deg)       
	TeetVya    | RotTeetV                       | Rotor teeter angular velocity (unavailable for 3-blader)        | About the ya-axis                                  | (deg/sec)   
	TeetAya    | RotTeetA                       | Rotor teeter angular acceleration (unavailable for 3-blader)    | About the ya-axis                                  | (deg/sec^2) 
		 */
		
		//
		// Shaft Motions: 
		//
		put("LSSTipPxa",new OutCh("LSSTipPxa",new String[]{""},"","",""));
		put("LSSTipVxa",new OutCh("LSSTipVxa",new String[]{""},"","",""));
		put("LSSTipAxa",new OutCh("LSSTipAxa",new String[]{""},"","",""));
		
		put("LSSGagPxa",new OutCh("LSSGagPxa",new String[]{""},"","",""));
		put("LSSGagVxa",new OutCh("LSSGagVxa",new String[]{""},"","",""));
		put("LSSGagAxa",new OutCh("LSSGagAxa",new String[]{""},"","",""));
		
		put("HSShftV",	new OutCh("HSShftV",	new String[]{""},"","",""));
		put("HSShftA",	new OutCh("HSShftA",	new String[]{""},"","",""));
		put("TipSpdRat",new OutCh("TipSpdRat",	new String[]{""},"","",""));
		
		/*                                                                                                                                                                   
	LSSTipPxa  | LSSTipPxs, LSSTipP, Azimuth    | Rotor azimuth angle (position)                                  | About the xa- and xs-axes                          | (deg)       
	LSSTipVxa  | LSSTipVxs, LSSTipV, RotSpeed   | Rotor azimuth angular speed                                     | About the xa- and xs-axes                          | (rpm)       
	LSSTipAxa  | LSSTipAxs, LSSTipA, RotAccel   | Rotor azimuth angular acceleration                              | About the xa- and xs-axes                          | (deg/sec^2) 
	LSSGagPxa  | LSSGagPxs, LSSGagP             | Low-speed shaft strain gage azimuth angle (position)            | About the xa- and xs-axes                          | (deg)       
	           |                                |   (on the gearbox side of the low-speed shaft)                  |                                                    |             
	LSSGagVxa  | LSSGagVxs, LSSGagV             | Low-speed shaft strain gage angular speed                       | About the xa- and xs-axes                          | (rpm)       
	           |                                |   (on the gearbox side of the low-speed shaft)                  |                                                    |             
	LSSGagAxa  | LSSGagAxs, LSSGagA             | Low-speed shaft strain gage angular acceleration                | About the xa- and xs-axes                          | (deg/sec^2) 
	           |                                |   (on the gearbox side of the low-speed shaft)                  |                                                    |             
	HSShftV    | GenSpeed                       | Angular speed of the high-speed shaft and generator             | Same sign as LSSGagVxa / LSSGagVxs / LSSGagV       | (rpm)       
	HSShftA    | GenAccel                       | Angular acceleration of the high-speed shaft and generator      | Same sign as LSSGagAxa / LSSGagAxs / LSSGagA       | (deg/sec^2) 
	TipSpdRat  | TSR                            | Rotor blade tip speed ratio (unavailable if CompAero = False)   | N/A                                                | (-)         
		 */
	
		//
		// Nacelle IMU Motions: 
		//
		put("NclMUTVxs",new OutCh("NclMUTVxs",new String[]{""},"","",""));
		put("NclMUTVys",new OutCh("NclMUTVys",new String[]{""},"","",""));
		put("NclMUTVzs",new OutCh("NclMUTVzs",new String[]{""},"","",""));
		
		put("NclMUTAxs",new OutCh("NclMUTAxs",new String[]{""},"","",""));
		put("NclMUTAys",new OutCh("NclMUTAys",new String[]{""},"","",""));
		put("NclMUTAzs",new OutCh("NclMUTAzs",new String[]{""},"","",""));
		
		put("NclMURVxs",new OutCh("NclMURVxs",new String[]{""},"","",""));
		put("NclMURVys",new OutCh("NclMURVys",new String[]{""},"","",""));
		put("NclMURVzs",new OutCh("NclMURVzs",new String[]{""},"","",""));
		
		put("NclMURAxs",new OutCh("NclMURAxs",new String[]{""},"","",""));
		put("NclMURAys",new OutCh("NclMURAys",new String[]{""},"","",""));
		put("NclMURAzs",new OutCh("NclMURAzs",new String[]{""},"","",""));
		
		/*
	NcIMUTVxs  |                                | Nacelle inertial measurement unit translational velocity        | Directed along the xs-axis                         | (m/sec)     
	           |                                |   (absolute)                                                    |                                                    |             
	NcIMUTVys  |                                | Nacelle inertial measurement unit translational velocity        | Directed along the ys-axis                         | (m/sec)     
	           |                                |   (absolute)                                                    |                                                    |             
	NcIMUTVzs  |                                | Nacelle inertial measurement unit translational velocity        | Directed along the zs-axis                         | (m/sec)     
	           |                                |   (absolute)                                                    |                                                    |             
	NcIMUTAxs  |                                | Nacelle inertial measurement unit translational acceleration    | Directed along the xs-axis                         | (m/sec^2)   
	           |                                |   (absolute)                                                    |                                                    |             
	NcIMUTAys  |                                | Nacelle inertial measurement unit translational acceleration    | Directed along the ys-axis                         | (m/sec^2)   
	           |                                |   (absolute)                                                    |                                                    |             
	NcIMUTAzs  |                                | Nacelle inertial measurement unit translational acceleration    | Directed along the zs-axis                         | (m/sec^2)   
	           |                                |   (absolute)                                                    |                                                    |             
	NcIMURVxs  |                                | Nacelle inertial measurement unit angular (rotational) velocity | About the xs-axis                                  | (deg/sec)   
	           |                                |   (absolute)                                                    |                                                    |             
	NcIMURVys  |                                | Nacelle inertial measurement unit angular (rotational) velocity | About the ys-axis                                  | (deg/sec)   
	           |                                |   (absolute)                                                    |                                                    |             
	NcIMURVzs  |                                | Nacelle inertial measurement unit angular (rotational) velocity | About the zs-axis                                  | (deg/sec)   
	           |                                |   (absolute)                                                    |                                                    |             
	NcIMURAxs  |                                | Nacelle inertial measurement unit angular (rotational)          | About the xs-axis                                  | (deg/sec^2) 
	           |                                |   acceleration (absolute)                                       |                                                    |             
	NcIMURAys  |                                | Nacelle inertial measurement unit angular (rotational)          | About the ys-axis                                  | (deg/sec^2) 
	           |                                |   acceleration (absolute)                                       |                                                    |             
	NcIMURAzs  |                                | Nacelle inertial measurement unit angular (rotational)          | About the zs-axis                                  | (deg/sec^2) 
	           |                                |   acceleration (absolute)                                       |                                                    |             
		*/
	
		//
		// Rotor-Furl Motions:    
		//
		put("RotFurlP",new OutCh("RotFurlP",new String[]{""},"","",""));
		put("RotFurlV",new OutCh("RotFurlV",new String[]{""},"","",""));
		put("RotFurlA",new OutCh("RotFurlA",new String[]{""},"","",""));
		/*
	RotFurlP   | RotFurl                        | Rotor-furl angle (position)                                     | About the rotor-furl axis                          | (deg)       
	RotFurlV   |                                | Rotor-furl angular velocity                                     | About the rotor-furl axis                          | (deg/sec)   
	RotFurlA   |                                | Rotor-furl angular acceleration                                 | About the rotor-furl axis                          | (deg/sec^2) 
		*/
		
		//
		// Tail-Furl Motions:                                                                                                                                                               
		//
		put("TailFurlP",new OutCh("TailFurlP",new String[]{""},"","",""));
		put("TailFurlV",new OutCh("TailFurlV",new String[]{""},"","",""));
		put("TailFurlA",new OutCh("TailFurlA",new String[]{""},"","",""));
		/*
	TailFurlP  | TailFurl                       | Tail-furl angle (position)                                      | About the tail-furl axis                           | (deg)       
	TailFurlV  |                                | Tail-furl angular velocity                                      | About the tail-furl axis                           | (deg/sec)   
	TailFurlA  |                                | Tail-furl angular acceleration                                  | About the tail-furl axis                           | (deg/sec^2) 
		*/
		
		//
		//Nacelle Yaw Motions:                                                                                                                                                             
		//
		put("YawPzn",new OutCh("YawPzn",new String[]{""},"","",""));
		put("YawVzn",new OutCh("YawVzn",new String[]{""},"","",""));
		put("YawAzn",new OutCh("YawAzn",new String[]{""},"","",""));
		put("NacYawErr",new OutCh("NacYawErr",new String[]{""},"","",""));
		/*
	YawPzn     | YawPzp, NacYawP, NacYaw,       | Nacelle yaw angle (position)                                    | About the zn- and zp-axes                          | (deg)       
	           |   YawPos                       |                                                                 |                                                    |             
	YawVzn     | YawVzp, NacYawV, YawRate       | Nacelle yaw angular velocity                                    | About the zn- and zp-axes                          | (deg/sec)   
	YawAzn     | YawAzp, NacYawA, YawAccel      | Nacelle yaw angular acceleration                                | About the zn- and zp-axes                          | (deg/sec^2) 
	NacYawErr  |                                | Nacelle yaw error estimate.  This is computed as follows:       | About the zi-axis                                  | (deg)       
	           |                                |   NacYawErr = HorWndDir - YawPzn - YawBrRDzt - PtfmRDzi.  This  |                                                    |             
	           |                                |   estimate is not accurate instantaneously in the presence of   |                                                    |             
	           |                                |   significant tower deflection or platform angular (rotational) |                                                    |             
	           |                                |   displacement since the angles used in the computation are not |                                                    |             
	           |                                |   all defined about the same axis of rotation.  However, the    |                                                    |             
	           |                                |   estimate should be useful in a yaw controller if averaged     |                                                    |             
	           |                                |   over a time scale long enough to diminish the effects of      |                                                    |             
	           |                                |   tower and platform motions (i.e., much longer than the period |                                                    |             
	           |                                |   of oscillation).  (unavailable if CompAero = False)           |                                                    |             
		*/
	
		//
		//Tower-Top / Yaw Bearing Motions:                                                                                                                                                 
		//
		put("YawBrTDxp",new OutCh("YawBrTDxp",new String[]{""},"","",""));
		put("YawBrTDyp",new OutCh("YawBrTDyp",new String[]{""},"","",""));
		put("YawBrTDzp",new OutCh("YawBrTDzp",new String[]{""},"","",""));
		
		put("YawBrTDxt",new OutCh("YawBrTDxt",new String[]{""},"","",""));
		put("YawBrTDyt",new OutCh("YawBrTDyt",new String[]{""},"","",""));
		put("YawBrTDzt",new OutCh("YawBrTDzt",new String[]{""},"","",""));
		
		put("YawBrTAxp",new OutCh("YawBrTAxp",new String[]{""},"","",""));
		put("YawBrTAyp",new OutCh("YawBrTAyp",new String[]{""},"","",""));
		put("YawBrTAzp",new OutCh("YawBrTAzp",new String[]{""},"","",""));
		
		put("YawBrRDxt",new OutCh("YawBrRDxt",new String[]{""},"","",""));
		put("YawBrRDyt",new OutCh("YawBrRDyt",new String[]{""},"","",""));
		put("YawBrRDzt",new OutCh("YawBrRDzt",new String[]{""},"","",""));
		
		put("YawBrRVxp",new OutCh("YawBrRVxp",new String[]{""},"","",""));
		put("YawBrRVyp",new OutCh("YawBrRVyp",new String[]{""},"","",""));
		put("YawBrRVzp",new OutCh("YawBrRVzp",new String[]{""},"","",""));
		
		put("YawBrRAxp",new OutCh("YawBrRAxp",new String[]{""},"","",""));
		put("YawBrRAyp",new OutCh("YawBrRAyp",new String[]{""},"","",""));
		put("YawBrRAzp",new OutCh("YawBrRAzp",new String[]{""},"","",""));
		/*
	YawBrTDxp  |                                | Tower-top / yaw bearing fore-aft (translational) deflection     | Directed along the xp-axis                         | (m)         
	           |                                |   (relative to the undeflected position)                        |                                                    |             
	YawBrTDyp  |                                | Tower-top / yaw bearing side-to-side (translational) deflection | Directed along the yp-axis                         | (m)         
	           |                                |   (relative to the undeflected position)                        |                                                    |             
	YawBrTDzp  |                                | Tower-top / yaw bearing axial (translational) deflection        | Directed along the zp-axis                         | (m)         
	           |                                |   (relative to the undeflected position)                        |                                                    |             
	YawBrTDxt  | TTDspFA                        | Tower-top / yaw bearing fore-aft (translational) deflection     | Directed along the xt-axis                         | (m)         
	           |                                |   (relative to the undeflected position)                        |                                                    |             
	YawBrTDyt  | TTDspSS                        | Tower-top / yaw bearing side-to-side (translation) deflection   | Directed along the yt-axis                         | (m)         
	           |                                |   (relative to the undeflected position)                        |                                                    |             
	YawBrTDzt  | TTDspAx                        | Tower-top / yaw bearing axial (translational) deflection        | Directed along the zt-axis                         | (m)         
	           |                                |   (relative to the undeflected position)                        |                                                    |             
	YawBrTAxp  |                                | Tower-top / yaw bearing fore-aft (translational) acceleration   | Directed along the xp-axis                         | (m/sec^2)   
	           |                                |   (absolute)                                                    |                                                    |             
	YawBrTAyp  |                                | Tower-top / yaw bearing side-to-side (translational)            | Directed along the yp-axis                         | (m/sec^2)   
	           |                                |   acceleration (absolute)                                       |                                                    |             
	YawBrTAzp  |                                | Tower-top / yaw bearing axial (translational) acceleration      | Directed along the zp-axis                         | (m/sec^2)   
	           |                                |   (absolute)                                                    |                                                    |             
	YawBrRDxt  | TTDspRoll                      | Tower-top / yaw bearing angular (rotational) roll deflection    | About the xt-axis                                  | (deg)       
	           |                                |   (relative to the undeflected position).  In ADAMS, it is      |                                                    |             
	           |                                |   output as an Euler angle computed as the 3rd rotation in the  |                                                    |             
	           |                                |   yaw-pitch-roll rotation sequence.  It is not output as an     |                                                    |             
	           |                                |   Euler angle in FAST, which assumes small tower deflections,   |                                                    |             
	           |                                |   so that the rotation sequence does not matter.                |                                                    |             
	YawBrRDyt  | TTDspPtch                      | Tower-top / yaw bearing angular (rotational) pitch deflection   | About the yt-axis                                  | (deg)       
	           |                                |   (relative to the undeflected position).  In ADAMS, it is      |                                                    |             
	           |                                |   output as an Euler angle computed as the 2nd rotation in the  |                                                    |             
	           |                                |   yaw-pitch-roll rotation sequence.  It is not output as an     |                                                    |             
	           |                                |   Euler angle in FAST, which assumes small tower deflections,   |                                                    |             
	           |                                |   so that the rotation sequence does not matter.                |                                                    |             
	YawBrRDzt  | TTDspTwst                      | Tower-top / yaw bearing torsional deflection (relative to the   | About the zt-axis                                  | (deg)       
	           |                                |   undeflected position).  This output will always be zero for   |                                                    |             
	           |                                |   FAST simulation results.  Use it for examining tower          |                                                    |             
	           |                                |   torsional deflections of ADAMS simulations run using ADAMS    |                                                    |             
	           |                                |   datasets created using the FAST-to-ADAMS preprocessor.  In    |                                                    |             
	           |                                |   ADAMS, it is output as an Euler angle computed as the 1st     |                                                    |             
	           |                                |   rotation in the yaw-pitch-roll rotation sequence.             |                                                    |             
	YawBrRVxp  |                                | Tower-top / yaw bearing angular (rotational) roll velocity      | About the xp-axis                                  | (deg/sec)   
	           |                                |   (absolute)                                                    |                                                    |             
	YawBrRVyp  |                                | Tower-top / yaw bearing angular (rotational) pitch velocity     | About the yp-axis                                  | (deg/sec)   
	           |                                |   (absolute)                                                    |                                                    |             
	YawBrRVzp  |                                | Tower-top / yaw bearing angular (rotational) torsion velocity.  | About the zp-axis                                  | (deg/sec)   
	           |                                |   This output will always be very close to zero for FAST        |                                                    |             
	           |                                |   simulation results.  Use it for examining tower torsional     |                                                    |             
	           |                                |   deflections of ADAMS simulations run using ADAMS datasets     |                                                    |             
	           |                                |   created using the FAST-to-ADAMS preprocessor.  (absolute)     |                                                    |             
	YawBrRAxp  |                                | Tower-top / yaw bearing angular (rotational) roll acceleration  | About the xp-axis                                  | (deg/sec^2) 
	           |                                |   (absolute)                                                    |                                                    |             
	YawBrRAyp  |                                | Tower-top / yaw bearing angular (rotational) pitch acceleration | About the yp-axis                                  | (deg/sec^2) 
	           |                                |   (absolute)                                                    |                                                    |             
	YawBrRAzp  |                                | Tower-top / yaw bearing angular (rotational) torsion            | About the zp-axis                                  | (deg/sec^2) 
	           |                                |   acceleration.  This output will always be very close to zero  |                                                    |             
	           |                                |   for FAST simulation results.  Use it for examining tower      |                                                    |             
	           |                                |   torsional deflections of ADAMS simulations run using ADAMS    |                                                    |             
	           |                                |   datasets created using the FAST-to-ADAMS preprocessor.        |                                                    |             
	           |                                |   (absolute)                                                    |                                                    |             
		*/
		
		//
		//Local Tower Motions:   
		//
		put("TwHt1ALxt",new OutCh("TwHt1ALxt",new String[]{""},"","",""));
		put("TwHt1ALyt",new OutCh("TwHt1ALyt",new String[]{""},"","",""));
		put("TwHt1ALzt",new OutCh("TwHt1ALzt",new String[]{""},"","",""));
		
		put("TwHt2ALxt",new OutCh("TwHt2ALxt",new String[]{""},"","",""));
		put("TwHt2ALyt",new OutCh("TwHt2ALyt",new String[]{""},"","",""));
		put("TwHt2ALzt",new OutCh("TwHt2ALzt",new String[]{""},"","",""));
		
		put("TwHt3ALxt",new OutCh("TwHt3ALxt",new String[]{""},"","",""));
		put("TwHt3ALyt",new OutCh("TwHt3ALyt",new String[]{""},"","",""));
		put("TwHt3ALzt",new OutCh("TwHt3ALzt",new String[]{""},"","",""));
		
		put("TwHt4ALxt",new OutCh("TwHt4ALxt",new String[]{""},"","",""));
		put("TwHt4ALyt",new OutCh("TwHt4ALyt",new String[]{""},"","",""));
		put("TwHt4ALzt",new OutCh("TwHt4ALzt",new String[]{""},"","",""));
		
		put("TwHt5ALxt",new OutCh("TwHt5ALxt",new String[]{""},"","",""));
		put("TwHt5ALyt",new OutCh("TwHt5ALyt",new String[]{""},"","",""));
		put("TwHt5ALzt",new OutCh("TwHt5ALzt",new String[]{""},"","",""));
		
		put("TwHt6ALxt",new OutCh("TwHt6ALxt",new String[]{""},"","",""));
		put("TwHt6ALyt",new OutCh("TwHt6ALyt",new String[]{""},"","",""));
		put("TwHt6ALzt",new OutCh("TwHt6ALzt",new String[]{""},"","",""));
		
		put("TwHt7ALxt",new OutCh("TwHt7ALxt",new String[]{""},"","",""));
		put("TwHt7ALyt",new OutCh("TwHt7ALyt",new String[]{""},"","",""));
		put("TwHt7ALzt",new OutCh("TwHt7ALzt",new String[]{""},"","",""));
		
		put("TwHt8ALxt",new OutCh("TwHt8ALxt",new String[]{""},"","",""));
		put("TwHt8ALyt",new OutCh("TwHt8ALyt",new String[]{""},"","",""));
		put("TwHt8ALzt",new OutCh("TwHt8ALzt",new String[]{""},"","",""));
		
		put("TwHt9ALxt",new OutCh("TwHt9ALxt",new String[]{""},"","",""));
		put("TwHt9ALyt",new OutCh("TwHt9ALyt",new String[]{""},"","",""));
		put("TwHt9ALzt",new OutCh("TwHt9ALzt",new String[]{""},"","",""));
		/*
	TwHt1ALxt  |                                | Local tower fore-aft (translational) acceleration (absolute) of | Directed along the local xt-axis                   | (m/sec^2)   
	           |                                |   tower gage 1 (unavailable if NTwGages = 0)                    |                                                    |             
	TwHt1ALyt  |                                | Local tower side-to-side (translational) acceleration (absolute)| Directed along the local yt-axis                   | (m/sec^2)   
	           |                                |   of tower gage 1 (unavailable if NTwGages = 0)                 |                                                    |             
	TwHt1ALzt  |                                | Local tower axial (translational) acceleration (absolute) of    | Directed along the local zt-axis                   | (m/sec^2)   
	           |                                |   tower gage 1 (unavailable if NTwGages = 0)                    |                                                    |             
	TwHt2ALxt  |                                | Local tower fore-aft (translational) acceleration (absolute) of | Directed along the local xt-axis                   | (m/sec^2)   
	           |                                |   tower gage 2 (unavailable if NTwGages < 2)                    |                                                    |             
	TwHt2ALyt  |                                | Local tower side-to-side (translational) acceleration (absolute)| Directed along the local yt-axis                   | (m/sec^2)   
	           |                                |   of tower gage 2 (unavailable if NTwGages < 2)                 |                                                    |             
	TwHt2ALzt  |                                | Local tower axial (translational) acceleration (absolute) of    | Directed along the local zt-axis                   | (m/sec^2)   
	           |                                |   tower gage 2 (unavailable if NTwGages < 2)                    |                                                    |             
	TwHt3ALxt  |                                | Local tower fore-aft (translational) acceleration (absolute) of | Directed along the local xt-axis                   | (m/sec^2)   
	           |                                |   tower gage 3 (unavailable if NTwGages < 3)                    |                                                    |             
	TwHt3ALyt  |                                | Local tower side-to-side (translational) acceleration (absolute)| Directed along the local yt-axis                   | (m/sec^2)   
	           |                                |   of tower gage 3 (unavailable if NTwGages < 3)                 |                                                    |             
	TwHt3ALzt  |                                | Local tower axial (translational) acceleration (absolute) of    | Directed along the local zt-axis                   | (m/sec^2)   
	           |                                |   tower gage 3 (unavailable if NTwGages < 3)                    |                                                    |             
	TwHt4ALxt  |                                | Local tower fore-aft (translational) acceleration (absolute) of | Directed along the local xt-axis                   | (m/sec^2)   
	           |                                |   tower gage 4 (unavailable if NTwGages < 4)                    |                                                    |             
	TwHt4ALyt  |                                | Local tower side-to-side (translational) acceleration (absolute)| Directed along the local yt-axis                   | (m/sec^2)   
	           |                                |   of tower gage 4 (unavailable if NTwGages < 4)                 |                                                    |             
	TwHt4ALzt  |                                | Local tower axial (translational) acceleration (absolute) of    | Directed along the local zt-axis                   | (m/sec^2)   
	           |                                |   tower gage 4 (unavailable if NTwGages < 4)                    |                                                    |             
	TwHt5ALxt  |                                | Local tower fore-aft (translational) acceleration (absolute) of | Directed along the local xt-axis                   | (m/sec^2)   
	           |                                |   tower gage 5 (unavailable if NTwGages < 5)                    |                                                    |             
	TwHt5ALyt  |                                | Local tower side-to-side (translational) acceleration (absolute)| Directed along the local yt-axis                   | (m/sec^2)   
	           |                                |   of tower gage 5 (unavailable if NTwGages < 5)                 |                                                    |             
	TwHt5ALzt  |                                | Local tower axial (translational) acceleration (absolute) of    | Directed along the local zt-axis                   | (m/sec^2)   
	           |                                |   tower gage 5 (unavailable if NTwGages < 5)                    |                                                    |             
	TwHt6ALxt  |                                | Local tower fore-aft (translational) acceleration (absolute) of | Directed along the local xt-axis                   | (m/sec^2)   
	           |                                |   tower gage 6 (unavailable if NTwGages < 6)                    |                                                    |             
	TwHt6ALyt  |                                | Local tower side-to-side (translational) acceleration (absolute)| Directed along the local yt-axis                   | (m/sec^2)   
	           |                                |   of tower gage 6 (unavailable if NTwGages < 6)                 |                                                    |             
	TwHt6ALzt  |                                | Local tower axial (translational) acceleration (absolute) of    | Directed along the local zt-axis                   | (m/sec^2)   
	           |                                |   tower gage 6 (unavailable if NTwGages < 6)                    |                                                    |             
	TwHt7ALxt  |                                | Local tower fore-aft (translational) acceleration (absolute) of | Directed along the local xt-axis                   | (m/sec^2)   
	           |                                |   tower gage 7 (unavailable if NTwGages < 7)                    |                                                    |             
	TwHt7ALyt  |                                | Local tower side-to-side (translational) acceleration (absolute)| Directed along the local yt-axis                   | (m/sec^2)   
	           |                                |   of tower gage 7 (unavailable if NTwGages < 7)                 |                                                    |             
	TwHt7ALzt  |                                | Local tower axial (translational) acceleration (absolute) of    | Directed along the local zt-axis                   | (m/sec^2)   
	           |                                |   tower gage 7 (unavailable if NTwGages < 7)                    |                                                    |             
	TwHt8ALxt  |                                | Local tower fore-aft (translational) acceleration (absolute) of | Directed along the local xt-axis                   | (m/sec^2)   
	           |                                |   tower gage 8 (unavailable if NTwGages < 8)                    |                                                    |             
	TwHt8ALyt  |                                | Local tower side-to-side (translational) acceleration (absolute)| Directed along the local yt-axis                   | (m/sec^2)   
	           |                                |   of tower gage 8 (unavailable if NTwGages < 8)                 |                                                    |             
	TwHt8ALzt  |                                | Local tower axial (translational) acceleration (absolute) of    | Directed along the local zt-axis                   | (m/sec^2)   
	           |                                |   tower gage 8 (unavailable if NTwGages < 8)                    |                                                    |             
	TwHt9ALxt  |                                | Local tower fore-aft (translational) acceleration (absolute) of | Directed along the local xt-axis                   | (m/sec^2)   
	           |                                |   tower gage 9 (unavailable if NTwGages < 9)                    |                                                    |             
	TwHt9ALyt  |                                | Local tower side-to-side (translational) acceleration (absolute)| Directed along the local yt-axis                   | (m/sec^2)   
	           |                                |   of tower gage 9 (unavailable if NTwGages < 9)                 |                                                    |             
	TwHt9ALzt  |                                | Local tower axial (translational) acceleration (absolute) of    | Directed along the local zt-axis                   | (m/sec^2)   
	           |                                |   tower gage 9 (unavailable if NTwGages < 9)                    |                                                    |             
		*/
		
		//
		// Platform Motions:
		//
		put("PtfmTDxt",new OutCh("PtfmTDxt",new String[]{""},"","",""));
		put("PtfmTDyt",new OutCh("PtfmTDyt",new String[]{""},"","",""));
		put("PtfmTDzt",new OutCh("PtfmTDzt",new String[]{""},"","",""));
			put("PtfmTDxi",new OutCh("PtfmTDxi",new String[]{""},"","",""));
			put("PtfmTDyi",new OutCh("PtfmTDyi",new String[]{""},"","",""));
			put("PtfmTDzi",new OutCh("PtfmTDzi",new String[]{""},"","",""));
		put("PtfmTVxt",new OutCh("PtfmTVxt",new String[]{""},"","",""));
		put("PtfmTVyt",new OutCh("PtfmTVyt",new String[]{""},"","",""));
		put("PtfmTVzt",new OutCh("PtfmTVzt",new String[]{""},"","",""));
			put("PtfmTVxi",new OutCh("PtfmTVxi",new String[]{""},"","",""));
			put("PtfmTVyi",new OutCh("PtfmTVyi",new String[]{""},"","",""));
			put("PtfmTVzi",new OutCh("PtfmTVzi",new String[]{""},"","",""));
		put("PtfmTAxt",new OutCh("PtfmTAxt",new String[]{""},"","",""));
		put("PtfmTAyt",new OutCh("PtfmTAyt",new String[]{""},"","",""));
		put("PtfmTAzt",new OutCh("PtfmTAzt",new String[]{""},"","",""));
			put("PtfmTAxi",new OutCh("PtfmTAxi",new String[]{""},"","",""));
			put("PtfmTAyi",new OutCh("PtfmTAyi",new String[]{""},"","",""));
			put("PtfmTAzi",new OutCh("PtfmTAzi",new String[]{""},"","",""));
		put("PtfmTAxi",new OutCh("PtfmTAxi",new String[]{""},"","",""));
		put("PtfmTAyi",new OutCh("PtfmTAyi",new String[]{""},"","",""));
		put("PtfmTAzi",new OutCh("PtfmTAzi",new String[]{""},"","",""));
		
		put("PtfmRDxi",new OutCh("PtfmRDxi",new String[]{""},"","",""));
		put("PtfmRDyi",new OutCh("PtfmRDyi",new String[]{""},"","",""));
		put("PtfmRDzi",new OutCh("PtfmRDzi",new String[]{""},"","",""));
			put("PtfmRVxt",new OutCh("PtfmRVxt",new String[]{""},"","",""));
			put("PtfmRVyt",new OutCh("PtfmRVyt",new String[]{""},"","",""));
			put("PtfmRVzt",new OutCh("PtfmRVzt",new String[]{""},"","",""));
		put("PtfmRVxi",new OutCh("PtfmRVxi",new String[]{""},"","",""));
		put("PtfmRVyi",new OutCh("PtfmRVyi",new String[]{""},"","",""));
		put("PtfmRVzi",new OutCh("PtfmRVzi",new String[]{""},"","",""));
			put("PtfmRAxt",new OutCh("PtfmRAxt",new String[]{""},"","",""));
			put("PtfmRAyt",new OutCh("PtfmRAyt",new String[]{""},"","",""));
			put("PtfmRAzt",new OutCh("PtfmRAzt",new String[]{""},"","",""));
		put("PtfmRAxi",new OutCh("PtfmRAxi",new String[]{""},"","",""));
		put("PtfmRAyi",new OutCh("PtfmRAyi",new String[]{""},"","",""));
		put("PtfmRAzi",new OutCh("PtfmRAzi",new String[]{""},"","",""));
		/*                                                                                                                                                               
	PtfmTDxt   |                                | Platform horizontal surge (translational) displacement          | Directed along the xt-axis                         | (m)         
	PtfmTDyt   |                                | Platform horizontal sway (translational) displacement           | Directed along the yt-axis                         | (m)         
	PtfmTDzt   |                                | Platform vertical heave (translational) displacement            | Directed along the zt-axis                         | (m)         
	PtfmTDxi   | PtfmSurge                      | Platform horizontal surge (translational) displacement          | Directed along the xi-axis                         | (m)         
	PtfmTDyi   | PtfmSway                       | Platform horizontal sway (translational) displacement           | Directed along the yi-axis                         | (m)         
	PtfmTDzi   | PtfmHeave                      | Platform vertical heave (translational) displacement            | Directed along the zi-axis                         | (m)         
	PtfmTVxt   |                                | Platform horizontal surge (translational) velocity              | Directed along the xt-axis                         | (m/sec)     
	PtfmTVyt   |                                | Platform horizontal sway (translational) velocity               | Directed along the yt-axis                         | (m/sec)     
	PtfmTVzt   |                                | Platform vertical heave (translational) velocity                | Directed along the zt-axis                         | (m/sec)     
	PtfmTVxi   |                                | Platform horizontal surge (translational) velocity              | Directed along the xi-axis                         | (m/sec)     
	PtfmTVyi   |                                | Platform horizontal sway (translational) velocity               | Directed along the yi-axis                         | (m/sec)     
	PtfmTVzi   |                                | Platform vertical heave (translational) velocity                | Directed along the zi-axis                         | (m/sec)     
	PtfmTAxt   |                                | Platform horizontal surge (translational) acceleration          | Directed along the xt-axis                         | (m/sec^2)   
	PtfmTAyt   |                                | Platform horizontal sway (translational) acceleration           | Directed along the yt-axis                         | (m/sec^2)   
	PtfmTAzt   |                                | Platform vertical heave (translational) acceleration            | Directed along the zt-axis                         | (m/sec^2)   
	PtfmTAxi   |                                | Platform horizontal surge (translational) acceleration          | Directed along the xi-axis                         | (m/sec^2)   
	PtfmTAyi   |                                | Platform horizontal sway (translational) acceleration           | Directed along the yi-axis                         | (m/sec^2)   
	PtfmTAzi   |                                | Platform vertical heave (translational) acceleration            | Directed along the zi-axis                         | (m/sec^2)   
	PtfmRDxi   | PtfmRoll                       | Platform roll tilt angular (rotational) displacement.  In       | About the xi-axis                                  | (deg)       
	           |                                |   ADAMS, it is output as an Euler angle computed as the 3rd     |                                                    |             
	           |                                |   rotation in the yaw-pitch-roll rotation sequence.  It is not  |                                                    |             
	           |                                |   output as an Euler angle in FAST, which assumes small         |                                                    |             
	           |                                |   rotational platform displacements, so that the rotation       |                                                    |             
	           |                                |   sequence does not matter.                                     |                                                    |             
	PtfmRDyi   | PtfmPitch                      | Platform pitch tilt angular (rotational) displacement.  In      | About the yi-axis                                  | (deg)       
	           |                                |   ADAMS, it is output as an Euler angle computed as the 2nd     |                                                    |             
	           |                                |   rotation in the yaw-pitch-roll rotation sequence.  It is not  |                                                    |             
	           |                                |   output as an Euler angle in FAST, which assumes small         |                                                    |             
	           |                                |   rotational platform displacements, so that the rotation       |                                                    |             
	           |                                |   sequence does not matter.                                     |                                                    |             
	PtfmRDzi   | PtfmYaw                        | Platform yaw angular (rotational) displacement.  In ADAMS, it   | About the zi-axis                                  | (deg)       
	           |                                |   is output as an Euler angle computed as the 1st rotation in   |                                                    |             
	           |                                |   the yaw-pitch-roll rotation sequence.  It is not output as an |                                                    |             
	           |                                |   Euler angle in FAST, which assumes small rotational platform  |                                                    |             
	           |                                |   displacements, so that the rotation sequence does not matter. |                                                    |             
	PtfmRVxt   |                                | Platform roll tilt angular (rotational) velocity                | About the xt-axis                                  | (deg/sec)   
	PtfmRVyt   |                                | Platform pitch tilt angular (rotational) velocity               | About the yt-axis                                  | (deg/sec)   
	PtfmRVzt   |                                | Platform yaw angular (rotational) velocity                      | About the zt-axis                                  | (deg/sec)   
	PtfmRVxi   |                                | Platform roll tilt angular (rotational) velocity                | About the xi-axis                                  | (deg/sec)   
	PtfmRVyi   |                                | Platform pitch tilt angular (rotational) velocity               | About the yi-axis                                  | (deg/sec)   
	PtfmRVzi   |                                | Platform yaw angular (rotational) velocity                      | About the zi-axis                                  | (deg/sec)   
	PtfmRAxt   |                                | Platform roll tilt angular (rotational) acceleration            | About the xt-axis                                  | (deg/sec^2) 
	PtfmRAyt   |                                | Platform pitch tilt angular (rotational) acceleration           | About the yt-axis                                  | (deg/sec^2) 
	PtfmRAzt   |                                | Platform yaw angular (rotational) acceleration                  | About the zt-axis                                  | (deg/sec^2) 
	PtfmRAxi   |                                | Platform roll tilt angular (rotational) acceleration            | About the xi-axis                                  | (deg/sec^2) 
	PtfmRAyi   |                                | Platform pitch tilt angular (rotational) acceleration           | About the yi-axis                                  | (deg/sec^2) 
	PtfmRAzi   |                                | Platform yaw angular (rotational) acceleration                  | About the zi-axis                                  | (deg/sec^2) 
		*/
		
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//
		// Blade 1 Root Loads:
		//
		put("RootFxc1",new OutCh("RootFxc1",new String[]{""},"","",""));
		put("RootFyc1",new OutCh("RootFyc1",new String[]{""},"","",""));
		put("RootFzc1",new OutCh("RootFzc1",new String[]{""},"","",""));
			put("RootFxb1",new OutCh("RootFxb1",new String[]{""},"","",""));
			put("RootFyb1",new OutCh("RootFyb1",new String[]{""},"","",""));
		
		put("RootMxc1",new OutCh("RootMxc1",new String[]{""},"","",""));
		put("RootMyc1",new OutCh("RootMyc1",new String[]{""},"","",""));
		put("RootMzc1",new OutCh("RootMzc1",new String[]{""},"","",""));
			put("RootMxb1",new OutCh("RootMxb1",new String[]{""},"","",""));
			put("RootMyb1",new OutCh("RootMyb1",new String[]{""},"","",""));
		/*                                                                                                                                                            
	RootFxc1   |                                | Blade 1 out-of-plane shear force at the blade root              | Directed along the xc1-axis                        | (kN)        
	RootFyc1   |                                | Blade 1 in-plane shear force at the blade root                  | Directed along the yc1-axis                        | (kN)        
	RootFzc1   | RootFzb1                       | Blade 1 axial force at the blade root                           | Directed along the zc1- and zb1-axes               | (kN)        
	RootFxb1   |                                | Blade 1 flapwise shear force at the blade root                  | Directed along the xb1-axis                        | (kN)        
	RootFyb1   |                                | Blade 1 edgewise shear force at the blade root                  | Directed along the yb1-axis                        | (kN)        
	RootMxc1   | RootMIP1                       | Blade 1 in-plane moment (i.e., the moment caused by in-plane    | About the xc1-axis                                 | (kN·m)      
	           |                                |   forces) at the blade root                                     |                                                    |             
	RootMyc1   | RootMOoP1                      | Blade 1 out-of-plane moment (i.e., the moment caused by out-    | About the yc1-axis                                 | (kN·m)      
	           |                                |   of-plane forces) at the blade root                            |                                                    |             
	RootMzc1   | RootMzb1                       | Blade 1 pitching moment at the blade root                       | About the zc1- and zb1-axes                        | (kN·m)      
	RootMxb1   | RootMEdg1                      | Blade 1 edgewise moment (i.e., the moment caused by edgewise    | About the xb1-axis                                 | (kN·m)      
	           |                                |   forces) at the blade root                                     |                                                    |             
	RootMyb1   | RootMFlp1                      | Blade 1 flapwise moment (i.e., the moment caused by flapwise    | About the yb1-axis                                 | (kN·m)      
	           |                                |   forces) at the blade root                                     |                                                    |             
		*/
		
		//
		//Blade 2 Root Loads:     
		//
		put("RootFxc2",new OutCh("RootFxc2",new String[]{""},"","",""));
		put("RootFyc2",new OutCh("RootFyc2",new String[]{""},"","",""));
		put("RootFzc2",new OutCh("RootFzc2",new String[]{""},"","",""));
			put("RootFxb2",new OutCh("RootFxb2",new String[]{""},"","",""));
			put("RootFyb2",new OutCh("RootFyb2",new String[]{""},"","",""));
			
		put("RootMxc2",new OutCh("RootMxc2",new String[]{""},"","",""));
		put("RootMyc2",new OutCh("RootMyc2",new String[]{""},"","",""));
		put("RootMzc2",new OutCh("RootMzc2",new String[]{""},"","",""));
			put("RootMxb2",new OutCh("RootMxb2",new String[]{""},"","",""));
			put("RootMyb2",new OutCh("RootMyb2",new String[]{""},"","",""));
		/*
	RootFxc2   |                                | Blade 2 out-of-plane shear force at the blade root              | Directed along the xc2-axis                        | (kN)        
	RootFyc2   |                                | Blade 2 in-plane shear force at the blade root                  | Directed along the yc2-axis                        | (kN)        
	RootFzc2   | RootFzb2                       | Blade 2 axial force at the blade root                           | Directed along the zc2- and zb2-axes               | (kN)        
	RootFxb2   |                                | Blade 2 flapwise shear force at the blade root                  | Directed along the xb2-axis                        | (kN)        
	RootFyb2   |                                | Blade 2 edgewise shear force at the blade root                  | Directed along the yb2-axis                        | (kN)        
	RootMxc2   | RootMIP2                       | Blade 2 in-plane moment (i.e., the moment caused by in-plane    | About the xc2-axis                                 | (kN·m)      
	           |                                |   forces) at the blade root                                     |                                                    |             
	RootMyc2   | RootMOoP2                      | Blade 2 out-of-plane moment (i.e., the moment caused by out-    | About the yc2-axis                                 | (kN·m)      
	           |                                |   of-plane forces) at the blade root                            |                                                    |             
	RootMzc2   | RootMzb2                       | Blade 2 pitching moment at the blade root                       | About the zc2- and zb2-axes                        | (kN·m)      
	RootMxb2   | RootMEdg2                      | Blade 2 edgewise moment (i.e., the moment caused by edgewise    | About the xb2-axis                                 | (kN·m)      
	           |                                |   forces) at the blade root                                     |                                                    |             
	RootMyb2   | RootMFlp2                      | Blade 2 flapwise moment (i.e., the moment caused by flapwise    | About the yb2-axis                                 | (kN·m)      
	           |                                |   forces) at the blade root                                     |                                                    |             
		*/
		
		//
		//Blade 3 Root Loads:  
		//
		put("RootFxc3",new OutCh("RootFxc3",new String[]{""},"","",""));
		put("RootFyc3",new OutCh("RootFyc3",new String[]{""},"","",""));
		put("RootFzc3",new OutCh("RootFzc3",new String[]{""},"","",""));
		
		put("RootFxb3",new OutCh("RootFxb3",new String[]{""},"","",""));
		put("RootFyb3",new OutCh("RootFyb3",new String[]{""},"","",""));
			
		put("RootMxc3",new OutCh("RootMxc3",new String[]{""},"","",""));
		put("RootMyc3",new OutCh("RootMyc3",new String[]{""},"","",""));
		put("RootMzc3",new OutCh("RootMzc3",new String[]{""},"","",""));
		
		put("RootMxb3",new OutCh("RootMxb3",new String[]{""},"","",""));
		put("RootMyb3",new OutCh("RootMyb3",new String[]{""},"","",""));
		/*
	RootFxc3   |                                | Blade 3 out-of-plane shear force at the blade root              | Directed along the xc3-axis                        | (kN)        
	           |                                |   (unavailable for 2-blader)                                    |                                                    |             
	RootFyc3   |                                | Blade 3 in-plane shear force at the blade root                  | Directed along the yc3-axis                        | (kN)        
	           |                                |   (unavailable for 2-blader)                                    |                                                    |             
	RootFzc3   | RootFzb3                       | Blade 3 axial force at the blade root                           | Directed along the zc3- and zb3-axes               | (kN)        
	           |                                |   (unavailable for 2-blader)                                    |                                                    |             
	RootFxb3   |                                | Blade 3 flapwise shear force at the blade root                  | Directed along the xb3-axis                        | (kN)        
	           |                                |   (unavailable for 2-blader)                                    |                                                    |             
	RootFyb3   |                                | Blade 3 edgewise shear force at the blade root                  | Directed along the yb3-axis                        | (kN)        
	           |                                |   (unavailable for 2-blader)                                    |                                                    |             
	RootMxc3   | RootMIP3                       | Blade 3 in-plane moment (i.e., the moment caused by in-plane    | About the xc3-axis                                 | (kN·m)      
	           |                                |   forces) at the blade root (unavailable for 2-blader)          |                                                    |             
	RootMyc3   | RootMOoP3                      | Blade 3 out-of-plane moment (i.e., the moment caused by out-    | About the yc3-axis                                 | (kN·m)      
	           |                                |   of-plane forces) at the blade root (unavailable for 2-blader) |                                                    |             
	RootMzc3   | RootMzb3                       | Blade 3 pitching moment at the blade root                       | About the zc3- and zb3-axes                        | (kN·m)      
	           |                                |   (unavailable for 2-blader)                                    |                                                    |             
	RootMxb3   | RootMEdg3                      | Blade 3 edgewise moment (i.e., the moment caused by edgewise    | About the xb3-axis                                 | (kN·m)      
	           |                                |   forces) at the blade root (unavailable for 2-blader)          |                                                    |             
	RootMyb3   | RootMFlp3                      | Blade 3 flapwise moment (i.e., the moment caused by flapwise    | About the yb3-axis                                 | (kN·m)      
	           |                                |   forces) at the blade root (unavailable for 2-blader)          |                                                    |             
		*/
		
		//
		//Blade 1 Local Span Loads:
		//
		put("Spn1MLxb1",new OutCh("Spn1MLxb1",new String[]{""},"","",""));
		put("Spn1MLyb1",new OutCh("Spn1MLyb1",new String[]{""},"","",""));
		put("Spn1MLzb1",new OutCh("Spn1MLzb1",new String[]{""},"","",""));

		put("Spn2MLxb1",new OutCh("Spn2MLxb1",new String[]{""},"","",""));
		put("Spn2MLyb1",new OutCh("Spn2MLyb1",new String[]{""},"","",""));
		put("Spn2MLzb1",new OutCh("Spn2MLzb1",new String[]{""},"","",""));

		put("Spn3MLxb1",new OutCh("Spn3MLxb1",new String[]{""},"","",""));
		put("Spn3MLyb1",new OutCh("Spn3MLyb1",new String[]{""},"","",""));
		put("Spn3MLzb1",new OutCh("Spn3MLzb1",new String[]{""},"","",""));

		put("Spn4MLxb1",new OutCh("Spn4MLxb1",new String[]{""},"","",""));
		put("Spn4MLyb1",new OutCh("Spn4MLyb1",new String[]{""},"","",""));
		put("Spn4MLzb1",new OutCh("Spn4MLzb1",new String[]{""},"","",""));

		put("Spn5MLxb1",new OutCh("Spn5MLxb1",new String[]{""},"","",""));
		put("Spn5MLyb1",new OutCh("Spn5MLyb1",new String[]{""},"","",""));
		put("Spn5MLzb1",new OutCh("Spn5MLzb1",new String[]{""},"","",""));

		put("Spn6MLxb1",new OutCh("Spn6MLxb1",new String[]{""},"","",""));
		put("Spn6MLyb1",new OutCh("Spn6MLyb1",new String[]{""},"","",""));
		put("Spn6MLzb1",new OutCh("Spn6MLzb1",new String[]{""},"","",""));

		put("Spn7MLxb1",new OutCh("Spn7MLxb1",new String[]{""},"","",""));
		put("Spn7MLyb1",new OutCh("Spn7MLyb1",new String[]{""},"","",""));
		put("Spn7MLzb1",new OutCh("Spn7MLzb1",new String[]{""},"","",""));

		put("Spn8MLxb1",new OutCh("Spn8MLxb1",new String[]{""},"","",""));
		put("Spn8MLyb1",new OutCh("Spn8MLyb1",new String[]{""},"","",""));
		put("Spn8MLzb1",new OutCh("Spn8MLzb1",new String[]{""},"","",""));

		put("Spn9MLxb1",new OutCh("Spn9MLxb1",new String[]{""},"","",""));
		put("Spn9MLyb1",new OutCh("Spn9MLyb1",new String[]{""},"","",""));
		put("Spn9MLzb1",new OutCh("Spn9MLzb1",new String[]{""},"","",""));
		/*
	Spn1MLxb1  |                                | Blade 1 local edgewise moment at span station 1                 | About the local xb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages = 0)                                 |                                                    |             
	Spn1MLyb1  |                                | Blade 1 local flapwise moment at span station 1                 | About the local yb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages = 0)                                 |                                                    |             
	Spn1MLzb1  |                                | Blade 1 local pitching moment at span station 1                 | About the local zb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages = 0)                                 |                                                    |             
	Spn2MLxb1  |                                | Blade 1 local edgewise moment at span station 2                 | About the local xb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 2)                                 |                                                    |             
	Spn2MLyb1  |                                | Blade 1 local flapwise moment at span station 2                 | About the local yb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 2)                                 |                                                    |             
	Spn2MLzb1  |                                | Blade 1 local pitching moment at span station 2                 | About the local zb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 2)                                 |                                                    |             
	Spn3MLxb1  |                                | Blade 1 local edgewise moment at span station 3                 | About the local xb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 3)                                 |                                                    |             
	Spn3MLyb1  |                                | Blade 1 local flapwise moment at span station 3                 | About the local yb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 3)                                 |                                                    |             
	Spn3MLzb1  |                                | Blade 1 local pitching moment at span station 3                 | About the local zb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 3)                                 |                                                    |             
	Spn4MLxb1  |                                | Blade 1 local edgewise moment at span station 4                 | About the local xb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 4)                                 |                                                    |             
	Spn4MLyb1  |                                | Blade 1 local flapwise moment at span station 4                 | About the local yb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 4)                                 |                                                    |             
	Spn4MLzb1  |                                | Blade 1 local pitching moment at span station 4                 | About the local zb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 4)                                 |                                                    |             
	Spn5MLxb1  |                                | Blade 1 local edgewise moment at span station 5                 | About the local xb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 5)                                 |                                                    |             
	Spn5MLyb1  |                                | Blade 1 local flapwise moment at span station 5                 | About the local yb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 5)                                 |                                                    |             
	Spn5MLzb1  |                                | Blade 1 local pitching moment at span station 5                 | About the local zb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 5)                                 |                                                    |             
	Spn6MLxb1  |                                | Blade 1 local edgewise moment at span station 6                 | About the local xb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 6)                                 |                                                    |             
	Spn6MLyb1  |                                | Blade 1 local flapwise moment at span station 6                 | About the local yb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 6)                                 |                                                    |             
	Spn6MLzb1  |                                | Blade 1 local pitching moment at span station 6                 | About the local zb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 6)                                 |                                                    |             
	Spn7MLxb1  |                                | Blade 1 local edgewise moment at span station 7                 | About the local xb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 7)                                 |                                                    |             
	Spn7MLyb1  |                                | Blade 1 local flapwise moment at span station 7                 | About the local yb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 7)                                 |                                                    |             
	Spn7MLzb1  |                                | Blade 1 local pitching moment at span station 7                 | About the local zb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 7)                                 |                                                    |             
	Spn8MLxb1  |                                | Blade 1 local edgewise moment at span station 8                 | About the local xb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 8)                                 |                                                    |             
	Spn8MLyb1  |                                | Blade 1 local flapwise moment at span station 8                 | About the local yb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 8)                                 |                                                    |             
	Spn8MLzb1  |                                | Blade 1 local pitching moment at span station 8                 | About the local zb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 8)                                 |                                                    |             
	Spn9MLxb1  |                                | Blade 1 local edgewise moment at span station 9                 | About the local xb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 9)                                 |                                                    |             
	Spn9MLyb1  |                                | Blade 1 local flapwise moment at span station 9                 | About the local yb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 9)                                 |                                                    |             
	Spn9MLzb1  |                                | Blade 1 local pitching moment at span station 9                 | About the local zb1-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 9)                                 |                                                    |             
		*/
		
		//
		//Blade 2 Local Span Loads:   
		//
		put("Spn1MLxb2",new OutCh("Spn1MLxb2",new String[]{""},"","",""));
		put("Spn1MLyb2",new OutCh("Spn1MLyb2",new String[]{""},"","",""));
		put("Spn1MLzb2",new OutCh("Spn1MLzb2",new String[]{""},"","",""));

		put("Spn2MLxb2",new OutCh("Spn2MLxb2",new String[]{""},"","",""));
		put("Spn2MLyb2",new OutCh("Spn2MLyb2",new String[]{""},"","",""));
		put("Spn2MLzb2",new OutCh("Spn2MLzb2",new String[]{""},"","",""));

		put("Spn3MLxb2",new OutCh("Spn3MLxb2",new String[]{""},"","",""));
		put("Spn3MLyb2",new OutCh("Spn3MLyb2",new String[]{""},"","",""));
		put("Spn3MLzb2",new OutCh("Spn3MLzb2",new String[]{""},"","",""));

		put("Spn4MLxb2",new OutCh("Spn4MLxb2",new String[]{""},"","",""));
		put("Spn4MLyb2",new OutCh("Spn4MLyb2",new String[]{""},"","",""));
		put("Spn4MLzb2",new OutCh("Spn4MLzb2",new String[]{""},"","",""));

		put("Spn5MLxb2",new OutCh("Spn5MLxb2",new String[]{""},"","",""));
		put("Spn5MLyb2",new OutCh("Spn5MLyb2",new String[]{""},"","",""));
		put("Spn5MLzb2",new OutCh("Spn5MLzb2",new String[]{""},"","",""));

		put("Spn6MLxb2",new OutCh("Spn6MLxb2",new String[]{""},"","",""));
		put("Spn6MLyb2",new OutCh("Spn6MLyb2",new String[]{""},"","",""));
		put("Spn6MLzb2",new OutCh("Spn6MLzb2",new String[]{""},"","",""));

		put("Spn7MLxb2",new OutCh("Spn7MLxb2",new String[]{""},"","",""));
		put("Spn7MLyb2",new OutCh("Spn7MLyb2",new String[]{""},"","",""));
		put("Spn7MLzb2",new OutCh("Spn7MLzb2",new String[]{""},"","",""));

		put("Spn8MLxb2",new OutCh("Spn8MLxb2",new String[]{""},"","",""));
		put("Spn8MLyb2",new OutCh("Spn8MLyb2",new String[]{""},"","",""));
		put("Spn8MLzb2",new OutCh("Spn8MLzb2",new String[]{""},"","",""));

		put("Spn9MLxb2",new OutCh("Spn9MLxb2",new String[]{""},"","",""));
		put("Spn9MLyb2",new OutCh("Spn9MLyb2",new String[]{""},"","",""));
		put("Spn9MLzb2",new OutCh("Spn9MLzb2",new String[]{""},"","",""));
		/*
	Spn1MLxb2  |                                | Blade 2 local edgewise moment at span station 1                 | About the local xb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages = 0)                                 |                                                    |             
	Spn1MLyb2  |                                | Blade 2 local flapwise moment at span station 1                 | About the local yb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages = 0)                                 |                                                    |             
	Spn1MLzb2  |                                | Blade 2 local pitching moment at span station 1                 | About the local zb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages = 0)                                 |                                                    |             
	Spn2MLxb2  |                                | Blade 2 local edgewise moment at span station 2                 | About the local xb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 2)                                 |                                                    |             
	Spn2MLyb2  |                                | Blade 2 local flapwise moment at span station 2                 | About the local yb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 2)                                 |                                                    |             
	Spn2MLzb2  |                                | Blade 2 local pitching moment at span station 2                 | About the local zb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 2)                                 |                                                    |             
	Spn3MLxb2  |                                | Blade 2 local edgewise moment at span station 3                 | About the local xb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 3)                                 |                                                    |             
	Spn3MLyb2  |                                | Blade 2 local flapwise moment at span station 3                 | About the local yb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 3)                                 |                                                    |             
	Spn3MLzb2  |                                | Blade 2 local pitching moment at span station 3                 | About the local zb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 3)                                 |                                                    |             
	Spn4MLxb2  |                                | Blade 2 local edgewise moment at span station 4                 | About the local xb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 4)                                 |                                                    |             
	Spn4MLyb2  |                                | Blade 2 local flapwise moment at span station 4                 | About the local yb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 4)                                 |                                                    |             
	Spn4MLzb2  |                                | Blade 2 local pitching moment at span station 4                 | About the local zb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 4)                                 |                                                    |             
	Spn5MLxb2  |                                | Blade 2 local edgewise moment at span station 5                 | About the local xb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 5)                                 |                                                    |             
	Spn5MLyb2  |                                | Blade 2 local flapwise moment at span station 5                 | About the local yb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 5)                                 |                                                    |             
	Spn5MLzb2  |                                | Blade 2 local pitching moment at span station 5                 | About the local zb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 5)                                 |                                                    |             
	Spn6MLxb2  |                                | Blade 2 local edgewise moment at span station 6                 | About the local xb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 6)                                 |                                                    |             
	Spn6MLyb2  |                                | Blade 2 local flapwise moment at span station 6                 | About the local yb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 6)                                 |                                                    |             
	Spn6MLzb2  |                                | Blade 2 local pitching moment at span station 6                 | About the local zb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 6)                                 |                                                    |             
	Spn7MLxb2  |                                | Blade 2 local edgewise moment at span station 7                 | About the local xb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 7)                                 |                                                    |             
	Spn7MLyb2  |                                | Blade 2 local flapwise moment at span station 7                 | About the local yb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 7)                                 |                                                    |             
	Spn7MLzb2  |                                | Blade 2 local pitching moment at span station 7                 | About the local zb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 7)                                 |                                                    |             
	Spn8MLxb2  |                                | Blade 2 local edgewise moment at span station 8                 | About the local xb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 8)                                 |                                                    |             
	Spn8MLyb2  |                                | Blade 2 local flapwise moment at span station 8                 | About the local yb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 8)                                 |                                                    |             
	Spn8MLzb2  |                                | Blade 2 local pitching moment at span station 8                 | About the local zb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 8)                                 |                                                    |             
	Spn9MLxb2  |                                | Blade 2 local edgewise moment at span station 9                 | About the local xb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 9)                                 |                                                    |             
	Spn9MLyb2  |                                | Blade 2 local flapwise moment at span station 9                 | About the local yb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 9)                                 |                                                    |             
	Spn9MLzb2  |                                | Blade 2 local pitching moment at span station 9                 | About the local zb2-axis                           | (kN·m)      
	           |                                |   (unavailable if NBlGages < 9)                                 |                                                    |             
		*/
		
		//
		//Blade 3 Local Span Loads:
		//
		put("Spn1MLxb3",new OutCh("Spn1MLxb3",new String[]{""},"","",""));
		put("Spn1MLyb3",new OutCh("Spn1MLyb3",new String[]{""},"","",""));
		put("Spn1MLzb3",new OutCh("Spn1MLzb3",new String[]{""},"","",""));

		put("Spn2MLxb3",new OutCh("Spn2MLxb3",new String[]{""},"","",""));
		put("Spn2MLyb3",new OutCh("Spn2MLyb3",new String[]{""},"","",""));
		put("Spn2MLzb3",new OutCh("Spn2MLzb3",new String[]{""},"","",""));

		put("Spn3MLxb3",new OutCh("Spn3MLxb3",new String[]{""},"","",""));
		put("Spn3MLyb3",new OutCh("Spn3MLyb3",new String[]{""},"","",""));
		put("Spn3MLzb3",new OutCh("Spn3MLzb3",new String[]{""},"","",""));

		put("Spn4MLxb3",new OutCh("Spn4MLxb3",new String[]{""},"","",""));
		put("Spn4MLyb3",new OutCh("Spn4MLyb3",new String[]{""},"","",""));
		put("Spn4MLzb3",new OutCh("Spn4MLzb3",new String[]{""},"","",""));

		put("Spn5MLxb3",new OutCh("Spn5MLxb3",new String[]{""},"","",""));
		put("Spn5MLyb3",new OutCh("Spn5MLyb3",new String[]{""},"","",""));
		put("Spn5MLzb3",new OutCh("Spn5MLzb3",new String[]{""},"","",""));

		put("Spn6MLxb3",new OutCh("Spn6MLxb3",new String[]{""},"","",""));
		put("Spn6MLyb3",new OutCh("Spn6MLyb3",new String[]{""},"","",""));
		put("Spn6MLzb3",new OutCh("Spn6MLzb3",new String[]{""},"","",""));

		put("Spn7MLxb3",new OutCh("Spn7MLxb3",new String[]{""},"","",""));
		put("Spn7MLyb3",new OutCh("Spn7MLyb3",new String[]{""},"","",""));
		put("Spn7MLzb3",new OutCh("Spn7MLzb3",new String[]{""},"","",""));

		put("Spn8MLxb3",new OutCh("Spn8MLxb3",new String[]{""},"","",""));
		put("Spn8MLyb3",new OutCh("Spn8MLyb3",new String[]{""},"","",""));
		put("Spn8MLzb3",new OutCh("Spn8MLzb3",new String[]{""},"","",""));

		put("Spn9MLxb3",new OutCh("Spn9MLxb3",new String[]{""},"","",""));
		put("Spn9MLyb3",new OutCh("Spn9MLyb3",new String[]{""},"","",""));
		put("Spn9MLzb3",new OutCh("Spn9MLzb3",new String[]{""},"","",""));
		/*
	Spn1MLxb3  |                                | Blade 3 local edgewise moment at span station 1                 | About the local xb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages = 0)                 |                                                    |             
	Spn1MLyb3  |                                | Blade 3 local flapwise moment at span station 1                 | About the local yb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages = 0)                 |                                                    |             
	Spn1MLzb3  |                                | Blade 3 local pitching moment at span station 1                 | About the local zb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages = 0)                 |                                                    |             
	Spn2MLxb3  |                                | Blade 3 local edgewise moment at span station 2                 | About the local xb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 2)                 |                                                    |             
	Spn2MLyb3  |                                | Blade 3 local flapwise moment at span station 2                 | About the local yb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 2)                 |                                                    |             
	Spn2MLzb3  |                                | Blade 3 local pitching moment at span station 2                 | About the local zb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 2)                 |                                                    |             
	Spn3MLxb3  |                                | Blade 3 local edgewise moment at span station 3                 | About the local xb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 3)                 |                                                    |             
	Spn3MLyb3  |                                | Blade 3 local flapwise moment at span station 3                 | About the local yb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 3)                 |                                                    |             
	Spn3MLzb3  |                                | Blade 3 local pitching moment at span station 3                 | About the local zb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 3)                 |                                                    |             
	Spn4MLxb3  |                                | Blade 3 local edgewise moment at span station 4                 | About the local xb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 4)                 |                                                    |             
	Spn4MLyb3  |                                | Blade 3 local flapwise moment at span station 4                 | About the local yb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 4)                 |                                                    |             
	Spn4MLzb3  |                                | Blade 3 local pitching moment at span station 4                 | About the local zb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 4)                 |                                                    |             
	Spn5MLxb3  |                                | Blade 3 local edgewise moment at span station 5                 | About the local xb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 5)                 |                                                    |             
	Spn5MLyb3  |                                | Blade 3 local flapwise moment at span station 5                 | About the local yb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 5)                 |                                                    |             
	Spn5MLzb3  |                                | Blade 3 local pitching moment at span station 5                 | About the local zb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 5)                 |                                                    |             
	Spn6MLxb3  |                                | Blade 3 local edgewise moment at span station 6                 | About the local xb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 6)                 |                                                    |             
	Spn6MLyb3  |                                | Blade 3 local flapwise moment at span station 6                 | About the local yb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 6)                 |                                                    |             
	Spn6MLzb3  |                                | Blade 3 local pitching moment at span station 6                 | About the local zb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 6)                 |                                                    |             
	Spn7MLxb3  |                                | Blade 3 local edgewise moment at span station 7                 | About the local xb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 7)                 |                                                    |             
	Spn7MLyb3  |                                | Blade 3 local flapwise moment at span station 7                 | About the local yb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 7)                 |                                                    |             
	Spn7MLzb3  |                                | Blade 3 local pitching moment at span station 7                 | About the local zb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 7)                 |                                                    |             
	Spn8MLxb3  |                                | Blade 3 local edgewise moment at span station 8                 | About the local xb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 8)                 |                                                    |             
	Spn8MLyb3  |                                | Blade 3 local flapwise moment at span station 8                 | About the local yb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 8)                 |                                                    |             
	Spn8MLzb3  |                                | Blade 3 local pitching moment at span station 8                 | About the local zb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 8)                 |                                                    |             
	Spn9MLxb3  |                                | Blade 3 local edgewise moment at span station 9                 | About the local xb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 9)                 |                                                    |             
	Spn9MLyb3  |                                | Blade 3 local flapwise moment at span station 9                 | About the local yb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 9)                 |                                                    |             
	Spn9MLzb3  |                                | Blade 3 local pitching moment at span station 9                 | About the local zb3-axis                           | (kN·m)      
	           |                                |   (unavailable for 2-blader or if NBlGages < 9)                 |                                                    |             
		*/
		
		//
		// Hub and Rotor Loads:    
		//
		put("LSShftFxa",new OutCh("LSShftFxa",new String[]{""},"","",""));
		put("LSShftFya",new OutCh("LSShftFya",new String[]{""},"","",""));
		put("LSShftFza",new OutCh("LSShftFza",new String[]{""},"","",""));
		
		put("LSShftFys",new OutCh("LSShftFys",new String[]{""},"","",""));
		put("LSShftFzs",new OutCh("LSShftFzs",new String[]{""},"","",""));
		
		put("LSShftMxa",new OutCh("LSShftMxa",new String[]{""},"","",""));
		put("LSSTipMya",new OutCh("LSSTipMya",new String[]{""},"","",""));
		put("LSSTipMza",new OutCh("LSSTipMza",new String[]{""},"","",""));
		
		put("LSSTipMys",new OutCh("LSSTipMys",new String[]{""},"","",""));
		put("LSSTipMzs",new OutCh("LSSTipMzs",new String[]{""},"","",""));
		
		put("CThrstAzm",new OutCh("CThrstAzm",new String[]{""},"","",""));
		put("CThrstRad",new OutCh("CThrstRad",new String[]{""},"","",""));
		
		put("RotPwr",new OutCh("RotPwr",new String[]{""},"","",""));
		put("RotCq",new OutCh("RotCq",new String[]{""},"","",""));
		put("RotCp",new OutCh("RotCp",new String[]{""},"","",""));
		put("RotCt",new OutCh("RotCt",new String[]{""},"","",""));
		/*
	LSShftFxa  | LSShftFxs, LSSGagFxa,          | Low-speed shaft thrust force (this is constant along the        | Directed along the xa- and xs-axes                 | (kN)        
	           |   LSSGagFxs, RotThrust         |   shaft and is equivalent to the rotor thrust force)            |                                                    |             
	LSShftFya  | LSSGagFya                      | Rotating low-speed shaft shear force (this is constant along    | Directed along the ya-axis                         | (kN)        
	           |                                |   the shaft)                                                    |                                                    |             
	LSShftFza  | LSSGagFza                      | Rotating low-speed shaft shear force (this is constant along    | Directed along the za-axis                         | (kN)        
	           |                                |   the shaft)                                                    |                                                    |             
	LSShftFys  | LSSGagFys                      | Nonrotating low-speed shaft shear force (this is constant       | Directed along the ys-axis                         | (kN)        
	           |                                |   along the shaft)                                              |                                                    |             
	LSShftFzs  | LSSGagFzs                      | Nonrotating low-speed shaft shear force (this is constant       | Directed along the zs-axis                         | (kN)        
	           |                                |   along the shaft)                                              |                                                    |             
	LSShftMxa  | LSShftMxs, LSSGagMxa,          | Low-speed shaft torque (this is constant along the shaft and    | About the xa- and xs-axes                          | (kN·m)      
	           |   LSSGagMxs, RotTorq, LSShftTq |   is equivalent to the rotor torque)                            |                                                    |             
	LSSTipMya  |                                | Rotating low-speed shaft bending moment at the shaft tip        | About the ya-axis                                  | (kN·m)      
	           |                                |   (teeter pin for 2-blader, apex of rotation for 3-blader)      |                                                    |             
	LSSTipMza  |                                | Rotating low-speed shaft bending moment at the shaft tip        | About the za-axis                                  | (kN·m)      
	           |                                |   (teeter pin for 2-blader, apex of rotation for 3-blader)      |                                                    |             
	LSSTipMys  |                                | Nonrotating low-speed shaft bending moment at the shaft tip     | About the ys-axis                                  | (kN·m)      
	           |                                |   (teeter pin for 2-blader, apex of rotation for 3-blader)      |                                                    |             
	LSSTipMzs  |                                | Nonrotating low-speed shaft bending moment at the shaft tip     | About the zs-axis                                  | (kN·m)      
	           |                                |   (teeter pin for 2-blader, apex of rotation for 3-blader)      |                                                    |             
	CThrstAzm  |                                | Azimuth location of the center of thrust.  This is estimated    | About the xa- and xs-axes                          | (deg)       
	           |                                |   using values of LSSTipMys, LSSTipMzs, and RotThrust.          |                                                    |             
	CThrstRad  | CThrstArm                      | Dimensionless radial (arm) location of the center of thrust.    | Always positive (directed radially outboard at     | (-)         
	           |                                |   This is estimated using values of LSSTipMys, LSSTipMzs, and   |   azimuth angle CThrstAzm)                         |             
	           |                                |   RotThrust.  (nondimensionalized using the undeflected tip     |                                                    |             
	           |                                |   radius normal to the shaft and limited to values between 0    |                                                    |             
	           |                                |   and 1 (inclusive))                                            |                                                    |             
	RotPwr     | LSShftPwr                      | Rotor power (this is equivalent to the low-speed shaft power)   | N/A                                                | (kW)        
	RotCq      | LSShftCq                       | Rotor torque coefficient (this is equivalent to the low-speed   | N/A                                                | (-)         
	           |                                |   shaft torque coefficient) (unavailable if CompAero = False)   |                                                    |             
	RotCp      | LSShftCp                       | Rotor power coefficient (this is equivalent to the low-speed    | N/A                                                | (-)         
	           |                                |   shaft power coefficient) (unavailable if CompAero = False)    |                                                    |             
	RotCt      | LSShftCt                       | Rotor thrust coefficient (this is equivalent to the low-speed   | N/A                                                | (-)         
	           |                                |   shaft thrust coefficient) (unavailable if CompAero = False)   |                                                    |             
		*/
		
		//
		// Shaft Strain Gage Loads:
		//
		put("LSSGagMya",new OutCh("LSSGagMya",new String[]{""},"","",""));
		put("LSSGagMza",new OutCh("LSSGagMza",new String[]{""},"","",""));
		
		put("LSSGagMys",new OutCh("LSSGagMys",new String[]{""},"","",""));
		put("LSSGagMzs",new OutCh("LSSGagMzs",new String[]{""},"","",""));
		/*
	LSSGagMya  |                                | Rotating low-speed shaft bending moment at the shaft's          | About the ya-axis                                  | (kN·m)      
	           |                                |   strain gage (shaft strain gage located by input ShftGagL)     |                                                    |             
	LSSGagMza  |                                | Rotating low-speed shaft bending moment at the shaft's          | About the za-axis                                  | (kN·m)      
	           |                                |   strain gage (shaft strain gage located by input ShftGagL)     |                                                    |             
	LSSGagMys  |                                | Nonrotating low-speed shaft bending moment at the shaft's       | About the ys-axis                                  | (kN·m)      
	           |                                |   strain gage (shaft strain gage located by input ShftGagL)     |                                                    |             
	LSSGagMzs  |                                | Nonrotating low-speed shaft bending moment at the shaft's       | About the zs-axis                                  | (kN·m)      
	           |                                |   strain gage (shaft strain gage located by input ShftGagL)     |                                                    |             
		*/
		
		//
		// Generator and High-Speed Shaft Loads:
		//
		put("HSShftTq",new OutCh("HSShftTq",new String[]{""},"","",""));
		put("HSShftPwr",new OutCh("HSShftPwr",new String[]{""},"","",""));
		put("HSShftCq",new OutCh("HSShftCq",new String[]{""},"","",""));
		put("HSShftCp",new OutCh("HSShftCp",new String[]{""},"","",""));
		
		put("GenTq",new OutCh("GenTq",new String[]{""},"","",""));
		put("GenPwr",new OutCh("GenPwr",new String[]{""},"","",""));
		put("GenCq",new OutCh("GenCq",new String[]{""},"","",""));
		put("GenCp",new OutCh("GenCp",new String[]{""},"","",""));
		
		put("HSSBrTq",new OutCh("HSSBrTq",new String[]{""},"","",""));
		/*
	HSShftTq   |                                | High-speed shaft torque (this is constant along the shaft)      | Same sign as LSShftTq / RotTorq / LSShftMxa /      | (kN·m)      
	           |                                |                                                                 |   LSShftMxs / LSSGagMxa / LSSGagMxs                |             
	HSShftPwr  |                                | High-speed shaft power                                          | Same sign as HSShftTq                              | (kW)        
	HSShftCq   |                                | High-speed shaft torque coefficient (unavailable if CompAero    | N/A                                                | (-)         
	           |                                |   = False)                                                      |                                                    |             
	HSShftCp   |                                | High-speed shaft power coefficient (unavailable if CompAero =   | N/A                                                | (-)         
	           |                                |   False)                                                        |                                                    |             
	GenTq      |                                | Electrical generator torque                                     | Positive reflects power extracted and negative     | (kN·m)      
	           |                                |                                                                 |   represents a motoring-up situation (power input) |             
	GenPwr     |                                | Electrical generator power                                      | Same sign as GenTq                                 | (kW)        
	GenCq      |                                | Electrical generator torque coefficient (unavailable if         | N/A                                                | (-)         
	           |                                |   CompAero = False)                                             |                                                    |             
	GenCp      |                                | Electrical generator power coefficient (unavailable if          | N/A                                                | (-)         
	           |                                |   CompAero = False)                                             |                                                    |             
	HSSBrTq    |                                | High-speed shaft brake torque (i.e., the moment applied to the  | Always positive (indicating dissipation of power)  | (kN·m)      
	           |                                |   high-speed shaft by the brake)                                |                                                    |             
		*/
		
		//
		// Rotor-Furl Bearing Loads:
		//
		put("RFrlBrM",new OutCh("RFrlBrM",new String[]{""},"","",""));
		/*
	RFrlBrM    |                                | Rotor-furl bearing moment                                       | About the rotor-furl axis                          | (kN·m)      
		*/
		
		//
		// Tail-Furl Bearing Loads:
		//
		put("TFrlBrM",new OutCh("TFrlBrM",new String[]{""},"","",""));
		/*
	TFrlBrM    |                                | Tail-furl bearing moment                                        | About the tail-furl axis                           | (kN·m)      
		*/

		//
		// Tail Fin Aerodynamic Loads:
		//
		put("TFinAlpha",new OutCh("TFinAlpha",new String[]{""},"","",""));
		put("TFinCLift",new OutCh("TFinCLift",new String[]{""},"","",""));
		put("TFinCDrag",new OutCh("TFinCDrag",new String[]{""},"","",""));
		put("TFinDnPrs",new OutCh("TFinDnPrs",new String[]{""},"","",""));
		put("TFinCPFx",new OutCh("TFinCPFx",new String[]{""},"","",""));
		put("TFinCPFy",new OutCh("TFinCPFy",new String[]{""},"","",""));
		/*
	TFinAlpha  |                                | Tail fin angle of attack.  This is the angle between the        | About the tail fin z-axis, which is the axis in    | (deg)       
	           |                                |   relative velocity of the wind-inflow at the tail fin center-  |   the tail fin plane normal to the chordline       |             
	           |                                |   of-pressure and the tail fin chordline.  (unavailable if      |                                                    |             
	           |                                |   CompAero = False)                                             |                                                    |             
	TFinCLift  |                                | Tail fin dimensionless lift coefficient (unavailable if         | N/A                                                ! (-)         
	           |                                |   CompAero = False)                                             |                                                    |             
	TFinCDrag  |                                | Tail fin dimensionless drag coefficient (unavailable if         | N/A                                                ! (-)         
	           |                                |   CompAero = False)                                             |                                                    |             
	TFinDnPrs  |                                | Tail fin dynamic pressure, equal to 1/2*AirDens*Vrel^2 where    | N/A                                                | (Pa)        
	           |                                |   Vrel is the relative velocity of the wind-inflow at the tail  |                                                    |             
	           |                                |   fin center-of-pressure (unavailable if CompAero = False)      |                                                    |             
	TFinCPFx   |                                | Tangential aerodynamic force at the tail fin center-of-pressure | Directed along the tail fin x-axis, which is the   | (kN)        
	           |                                |   (unavailable if CompAero = False)                             |   axis along the chordline, positive towards the   |             
	           |                                |                                                                 |   trailing edge                                    |             
	TFinCPFy   |                                | Normal aerodynamic force at the tail fin center-of-pressure     | Directed along the tail fin y-axis, which          | (kN)        
	           |                                |   (unavailable if CompAero = False)                             |   orthogonal to the tail fin plane                 |             
		*/
		
		//
		//Tower-Top / Yaw Bearing Loads:
		//
		put("YawBrFxn",new OutCh("YawBrFxn",new String[]{""},"","",""));
		put("YawBrFyn",new OutCh("YawBrFyn",new String[]{""},"","",""));
		put("YawBrFzn",new OutCh("YawBrFzn",new String[]{""},"","",""));
		put("YawBrFxp",new OutCh("YawBrFxp",new String[]{""},"","",""));
		put("YawBrFyp",new OutCh("YawBrFyp",new String[]{""},"","",""));
		
		put("YawBrMxn",new OutCh("YawBrMxn",new String[]{""},"","",""));
		put("YawBrMyn",new OutCh("YawBrMyn",new String[]{""},"","",""));
		put("YawBrMzn",new OutCh("YawBrMzn",new String[]{""},"","",""));
		put("YawBrMxp",new OutCh("YawBrMxp",new String[]{""},"","",""));
		put("YawBrMyp",new OutCh("YawBrMyp",new String[]{""},"","",""));
		/*
	YawBrFxn   |                                | Rotating (with nacelle) tower-top / yaw bearing shear force     | Directed along the xn-axis                         | (kN)        
	YawBrFyn   |                                | Rotating (with nacelle) tower-top / yaw bearing shear force     | Directed along the yn-axis                         | (kN)        
	YawBrFzn   | YawBrFzp                       | Tower-top / yaw bearing axial force                             | Directed along the zn- and zp-axes                 | (kN)        
	YawBrFxp   |                                | Tower-top / yaw bearing fore-aft (nonrotating) shear force      | Directed along the xp-axis                         | (kN)        
	YawBrFyp   |                                | Tower-top / yaw bearing side-to-side (nonrotating) shear        | Directed along the yp-axis                         | (kN)        
	           |                                |   force                                                         |                                                    |             
	YawBrMxn   |                                | Rotating (with nacelle) tower-top / yaw bearing roll moment     | About the xn-axis                                  | (kN·m)      
	YawBrMyn   |                                | Rotating (with nacelle) tower-top / yaw bearing pitch moment    | About the yn-axis                                  | (kN·m)      
	YawBrMzn   | YawBrMzp, YawMom               | Tower-top / yaw bearing yaw moment                              | About the zn- and zp-axes                          | (kN·m)      
	YawBrMxp   |                                | Nonrotating tower-top / yaw bearing roll moment                 | About the xp-axis                                  | (kN·m)      
	YawBrMyp   |                                | Nonrotating tower-top / yaw bearing pitch moment                | About the yp-axis                                  | (kN·m)      
		*/
		
		//
		// Tower Base Loads:
		//
		put("TwrBsFxt",new OutCh("TwrBsFxt",new String[]{""},"","",""));
		put("TwrBsFyt",new OutCh("TwrBsFyt",new String[]{""},"","",""));
		put("TwrBsFzt",new OutCh("TwrBsFzt",new String[]{""},"","",""));
		
		put("TwrBsMxt",new OutCh("TwrBsMxt",new String[]{""},"","",""));
		put("TwrBsMyt",new OutCh("TwrBsMyt",new String[]{""},"","",""));
		put("TwrBsMzt",new OutCh("TwrBsMzt",new String[]{""},"","",""));
		/*
	TwrBsFxt   |                                | Tower base fore-aft shear force                                 | Directed along the xt-axis                         | (kN)        
	TwrBsFyt   |                                | Tower base side-to-side shear force                             | Directed along the yt-axis                         | (kN)        
	TwrBsFzt   |                                | Tower base axial force                                          | Directed along the zt-axis                         | (kN)        
	TwrBsMxt   |                                | Tower base roll (or side-to-side) moment (i.e., the moment      | About the xt-axis                                  | (kN·m)      
	           |                                |   caused by side-to-side forces)                                |                                                    |             
	TwrBsMyt   |                                | Tower base pitching (or fore-aft) moment (i.e., the moment      | About the yt-axis                                  | (kN·m)      
	           |                                |   caused by fore-aft forces)                                    |                                                    |             
	TwrBsMzt   |                                | Tower base yaw (or torsional) moment                            | About the zt-axis                                  | (kN·m)      
		*/
		
		//
		// Local Tower Loads:
		//
		put("TwHt1MLxt",new OutCh("TwHt1MLxt",new String[]{""},"","",""));
		put("TwHt1MLyt",new OutCh("TwHt1MLyt",new String[]{""},"","",""));
		put("TwHt1MLzt",new OutCh("TwHt1MLzt",new String[]{""},"","",""));

		put("TwHt2MLxt",new OutCh("TwHt2MLxt",new String[]{""},"","",""));
		put("TwHt2MLyt",new OutCh("TwHt2MLyt",new String[]{""},"","",""));
		put("TwHt2MLzt",new OutCh("TwHt2MLzt",new String[]{""},"","",""));

		put("TwHt3MLxt",new OutCh("TwHt3MLxt",new String[]{""},"","",""));
		put("TwHt3MLyt",new OutCh("TwHt3MLyt",new String[]{""},"","",""));
		put("TwHt3MLzt",new OutCh("TwHt3MLzt",new String[]{""},"","",""));

		put("TwHt4MLxt",new OutCh("TwHt4MLxt",new String[]{""},"","",""));
		put("TwHt4MLyt",new OutCh("TwHt4MLyt",new String[]{""},"","",""));
		put("TwHt4MLzt",new OutCh("TwHt4MLzt",new String[]{""},"","",""));

		put("TwHt5MLxt",new OutCh("TwHt5MLxt",new String[]{""},"","",""));
		put("TwHt5MLyt",new OutCh("TwHt5MLyt",new String[]{""},"","",""));
		put("TwHt5MLzt",new OutCh("TwHt5MLzt",new String[]{""},"","",""));

		put("TwHt6MLxt",new OutCh("TwHt6MLxt",new String[]{""},"","",""));
		put("TwHt6MLyt",new OutCh("TwHt6MLyt",new String[]{""},"","",""));
		put("TwHt6MLzt",new OutCh("TwHt6MLzt",new String[]{""},"","",""));

		put("TwHt7MLxt",new OutCh("TwHt7MLxt",new String[]{""},"","",""));
		put("TwHt7MLyt",new OutCh("TwHt7MLyt",new String[]{""},"","",""));
		put("TwHt7MLzt",new OutCh("TwHt7MLzt",new String[]{""},"","",""));

		put("TwHt8MLxt",new OutCh("TwHt8MLxt",new String[]{""},"","",""));
		put("TwHt8MLyt",new OutCh("TwHt8MLyt",new String[]{""},"","",""));
		put("TwHt8MLzt",new OutCh("TwHt8MLzt",new String[]{""},"","",""));

		put("TwHt9MLxt",new OutCh("TwHt9MLxt",new String[]{""},"","",""));
		put("TwHt9MLyt",new OutCh("TwHt9MLyt",new String[]{""},"","",""));
		put("TwHt9MLzt",new OutCh("TwHt9MLzt",new String[]{""},"","",""));
		/*
	TwHt1MLxt  |                                | Local tower roll (or side-to-side) moment of tower gage 1       | About the local xt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages = 0)                                 |                                                    |             
	TwHt1MLyt  |                                | Local tower pitching (or fore-aft) moment of tower gage 1       | About the local yt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages = 0)                                 |                                                    |             
	TwHt1MLzt  |                                | Local tower yaw (or torsional) moment of tower gage 1           | About the local zt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages = 0)                                 |                                                    |             
	TwHt2MLxt  |                                | Local tower roll (or side-to-side) moment of tower gage 2       | About the local xt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 2)                                 |                                                    |             
	TwHt2MLyt  |                                | Local tower pitching (or fore-aft) moment of tower gage 2       | About the local yt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 2)                                 |                                                    |             
	TwHt2MLzt  |                                | Local tower yaw (or torsional) moment of tower gage 2           | About the local zt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 2)                                 |                                                    |             
	TwHt3MLxt  |                                | Local tower roll (or side-to-side) moment of tower gage 3       | About the local xt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 3)                                 |                                                    |             
	TwHt3MLyt  |                                | Local tower pitching (or fore-aft) moment of tower gage 3       | About the local yt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 3)                                 |                                                    |             
	TwHt3MLzt  |                                | Local tower yaw (or torsional) moment of tower gage 3           | About the local zt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 3)                                 |                                                    |             
	TwHt4MLxt  |                                | Local tower roll (or side-to-side) moment of tower gage 4       | About the local xt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 4)                                 |                                                    |             
	TwHt4MLyt  |                                | Local tower pitching (or fore-aft) moment of tower gage 4       | About the local yt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 4)                                 |                                                    |             
	TwHt4MLzt  |                                | Local tower yaw (or torsional) moment of tower gage 4           | About the local zt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 4)                                 |                                                    |             
	TwHt5MLxt  |                                | Local tower roll (or side-to-side) moment of tower gage 5       | About the local xt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 5)                                 |                                                    |             
	TwHt5MLyt  |                                | Local tower pitching (or fore-aft) moment of tower gage 5       | About the local yt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 5)                                 |                                                    |             
	TwHt5MLzt  |                                | Local tower yaw (or torsional) moment of tower gage 5           | About the local zt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 5)                                 |                                                    |             
	TwHt6MLxt  |                                | Local tower roll (or side-to-side) moment of tower gage 6       | About the local xt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 6)                                 |                                                    |             
	TwHt6MLyt  |                                | Local tower pitching (or fore-aft) moment of tower gage 6       | About the local yt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 6)                                 |                                                    |             
	TwHt6MLzt  |                                | Local tower yaw (or torsional) moment of tower gage 6           | About the local zt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 6)                                 |                                                    |             
	TwHt7MLxt  |                                | Local tower roll (or side-to-side) moment of tower gage 7       | About the local xt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 7)                                 |                                                    |             
	TwHt7MLyt  |                                | Local tower pitching (or fore-aft) moment of tower gage 7       | About the local yt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 7)                                 |                                                    |             
	TwHt7MLzt  |                                | Local tower yaw (or torsional) moment of tower gage 7           | About the local zt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 7)                                 |                                                    |             
	TwHt8MLxt  |                                | Local tower roll (or side-to-side) moment of tower gage 8       | About the local xt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 8)                                 |                                                    |             
	TwHt8MLyt  |                                | Local tower pitching (or fore-aft) moment of tower gage 8       | About the local yt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 8)                                 |                                                    |             
	TwHt8MLzt  |                                | Local tower yaw (or torsional) moment of tower gage 8           | About the local zt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 8)                                 |                                                    |             
	TwHt9MLxt  |                                | Local tower roll (or side-to-side) moment of tower gage 9       | About the local xt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 9)                                 |                                                    |             
	TwHt9MLyt  |                                | Local tower pitching (or fore-aft) moment of tower gage 9       | About the local yt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 9)                                 |                                                    |             
	TwHt9MLzt  |                                | Local tower yaw (or torsional) moment of tower gage 9           | About the local zt-axis                            | (kN·m)      
	           |                                |   (unavailable if NTwGages < 9)                                 |                                                    |             
		*/
		
		//
		// Platform Loads:
		//
		put("PtfmFxt",new OutCh("PtfmFxt",new String[]{""},"","",""));
		put("PtfmFyt",new OutCh("PtfmFyt",new String[]{""},"","",""));
		put("PtfmFzt",new OutCh("PtfmFzt",new String[]{""},"","",""));
			put("PtfmFxi",new OutCh("PtfmFxi",new String[]{""},"","",""));
			put("PtfmFyi",new OutCh("PtfmFyi",new String[]{""},"","",""));
			put("PtfmFzi",new OutCh("PtfmFzi",new String[]{""},"","",""));
		put("PtfmMxt",new OutCh("PtfmMxt",new String[]{""},"","",""));
		put("PtfmMyt",new OutCh("PtfmMyt",new String[]{""},"","",""));
		put("PtfmMzt",new OutCh("PtfmMzt",new String[]{""},"","",""));
			put("PtfmMxi",new OutCh("PtfmMxi",new String[]{""},"","",""));
			put("PtfmMyi",new OutCh("PtfmMyi",new String[]{""},"","",""));
			put("PtfmMzi",new OutCh("PtfmMzi",new String[]{""},"","",""));
		/*
	PtfmFxt    |                                | Platform horizontal surge shear force                           | Directed along the xt-axis                         | (kN)        
	PtfmFyt    |                                | Platform horizontal sway shear force                            | Directed along the yt-axis                         | (kN)        
	PtfmFzt    |                                | Platform vertical heave force                                   | Directed along the zt-axis                         | (kN)        
	PtfmFxi    |                                | Platform horizontal surge shear force                           | Directed along the xi-axis                         | (kN)        
	PtfmFyi    |                                | Platform horizontal sway shear force                            | Directed along the yi-axis                         | (kN)        
	PtfmFzi    |                                | Platform vertical heave force                                   | Directed along the zi-axis                         | (kN)        
	PtfmMxt    |                                | Platform roll tilt moment                                       | About the xt-axis                                  | (kN·m)      
	PtfmMyt    |                                | Platform pitch tilt moment                                      | About the yt-axis                                  | (kN·m)      
	PtfmMzt    |                                | Platform yaw moment                                             | About the zt-axis                                  | (kN·m)      
	PtfmMxi    |                                | Platform roll tilt moment                                       | About the xi-axis                                  | (kN·m)      
	PtfmMyi    |                                | Platform pitch tilt moment                                      | About the yi-axis                                  | (kN·m)      
	PtfmMzi    |                                | Platform yaw moment                                             | About the zi-axis                                  | (kN·m)      
		 */
		
	}

}
