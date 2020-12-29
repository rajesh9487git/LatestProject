package JavaProgramPracticeAgain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(2, "Ravi");
		hm.put(1, "Anish");
		hm.put(0, "Zebra");
		hm.put(3, "Bhavesh");

		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}

		});

		for (Map.Entry<Integer, String> k : list) {

			// LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>();
			// hm1.put(k.getKey(), k.getValue());

			System.out.println(k.getValue());

		}

	}

}
