package ProgramPractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingHashMapByValues {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(2, "Ravi");
		hm.put(1, "Anish");
		hm.put(0, "Zebra");
		hm.put(3, "Bhava");

		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}
		});

		Map<Integer, String> hm1 = new LinkedHashMap<Integer, String>();

		for (Map.Entry<Integer, String> k : list) {

			hm1.put(k.getKey(), k.getValue());
		}

		//System.out.println(hm1);
		
		for (Map.Entry<Integer, String> i : hm1.entrySet()) {

			System.out.println(i.getValue());
		}

	}

}
