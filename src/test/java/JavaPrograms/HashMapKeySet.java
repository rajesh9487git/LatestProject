package JavaPrograms;

import java.util.HashMap;
import java.util.Set;

public class HashMapKeySet {

	public static void main(String[] args) {
		
		HashMap <Integer, String> hm = new HashMap <Integer, String>();
		hm.put(1, "Rajesh");
		hm.put(2, "Niki");
		hm.put(null, "Ravi");
		hm.put(4, null);
		
		
		Set<Integer> keys =hm.keySet();
		
		for(Integer key: keys) {
			
			System.out.println(hm.get(key));
		}
		
	}

}
