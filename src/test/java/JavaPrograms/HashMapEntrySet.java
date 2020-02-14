package JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEntrySet {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Rajesh");
		hm.put(2, "Niki");
		hm.put(4, "Kaira");
		
	for(Map.Entry<Integer, String> entry: hm.entrySet()) {
		
		Integer key=entry.getKey();
		String value=entry.getValue();
		
		System.out.println(key);	
		System.out.println(value);
	}

	}

}
