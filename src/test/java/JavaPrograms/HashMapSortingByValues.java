package JavaPrograms;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSortingByValues {

	public static void main(String[] args) {
	
		
		HashMap<Integer, String>hm = new HashMap<Integer, String>();
		hm.put(1,"Raje");
		hm.put(3, "Ravi");
		hm.put(5, "A");
		
		List<Map.Entry<Integer, String>> list1 = new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());
		
		
		Collections.sort(list1, new Comparator <Map.Entry<Integer, String>>(){

			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				
				return (o1.getValue()).compareTo(o2.getValue());
			}
			
		});
		
		Map<Integer, String> sorted = new LinkedHashMap<Integer, String>();
		for(Map.Entry<Integer,String> e: list1) {
			
			sorted.put(e.getKey(), e.getValue());
		}
		
		for(Map.Entry<Integer,String> en: sorted.entrySet()) {
			System.out.println(en.getValue());
			
		}

	}

}
