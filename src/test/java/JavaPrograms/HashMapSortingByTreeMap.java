package JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSortingByTreeMap {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("drream", "Rajesh");
		hm.put("school", "Niki");
		hm.put("bat", "Kaira");
		
		//TreeMap will sort on the basis of key 
		Map<String, String> tm = new TreeMap<String, String>(hm);
		for(Map.Entry<String, String> sorted: tm.entrySet()) {
			
			System.out.println(sorted.getKey());
		}

	}

}
