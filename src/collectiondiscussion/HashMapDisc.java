package collectiondiscussion;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDisc {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(50, "Pune");
		
		hm.put(800, "Delhi");
		
		hm.put(5, "Mumbai");
		
		hm.put(900, "Nagpur");
		
		hm.put(5, "Bangaluru");
		
		hm.put(5, "Chennai");
		
		hm.put(null, null);
		
		hm.put(null, "Pune");
		
		hm.put(500, null);
		
		System.out.println(hm);
		
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String> ();
		
         lhm.put(50, "Pune");
		
		lhm.put(800, "Delhi");
		
		lhm.put(15, "Mumbai");
		
		lhm.put(900, "Nagpur");
		
		lhm.put(25, "Bangaluru");
		
		lhm.put(5, "Chennai");
		
		lhm.put(null, null);
		
		lhm.put(null, "Pune");
		
		lhm.put(500, null);
		
		System.out.println(lhm);
		
		
	}

}
