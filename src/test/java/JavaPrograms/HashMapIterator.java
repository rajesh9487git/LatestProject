package JavaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterator {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Rajesh");
		hm.put(2, "Niki");
		hm.put(4, "Kaira");
		
		Iterator it=hm.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry map=(Map.Entry)it.next();
			System.out.println(map.getValue());
			System.out.println(map.getKey());
		}

	}

}
