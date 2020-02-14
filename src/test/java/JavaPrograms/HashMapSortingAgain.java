package JavaPrograms;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSortingAgain {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Rajesh");
		hm.put(5,"Niki");
		hm.put(8, "Kaira");
		
		List<Map.Entry<Integer, String>> list1= new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());
		
		Collections.sort(list1, new Comparator<Map.Entry<Integer, String>>(){

			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				
				return (o1.getValue()).compareTo(o2.getValue());
			}
			});
		
		HashMap<Integer, String> temp= new LinkedHashMap<Integer, String>();
		
		for(Map.Entry<Integer,String> arr : list1) {
			
			temp.put(arr.getKey(),arr.getValue());
		}

		for(Map.Entry<Integer, String> eng : temp.entrySet()) {
			
			System.out.println(eng.getValue());
		}
		
		
	}

}
