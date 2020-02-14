package JavaPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapTrialandError {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Rajesh");
		hm.put(9,"Niki");
		hm.put(8, "Kaira");
		
		List<Map.Entry<Integer, String>> list1= new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());
		

	}

}
