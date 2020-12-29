package JavaPrograms;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapSortByValue {

	public static HashMap<Integer, String> sortedbyValue(HashMap<Integer, String> hm) {

		/*
		 * HashMap<Integer, String> hm = new HashMap<Integer, String>(); hm.put(2,
		 * "Rajesh"); hm.put(3,"kaira"); hm.put(6, "Niki");
		 */

		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());
		
		// compare method from Comparator interface accepts two args to compare, when you pass list to sort method Comparator interface will have key and value pair
		// now in compare method you need to specify as to on what basis you need to sort i.e. key or value, compreTo method takes first 2 values n then so on from the sorting parameter u provide 

		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>();

		for (Map.Entry<Integer, String> arr : list) {

			temp.put(arr.getKey(), arr.getValue());

		}

		return temp;

	}

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(2, "Rajesh");
		hm.put(3, "kaira");
		hm.put(6, "Niki");

		Map<Integer, String> hm1 = sortedbyValue(hm);

		for (Map.Entry<Integer, String> en : hm1.entrySet()) {

			System.out.println(en.getValue());
		}

	}

}
