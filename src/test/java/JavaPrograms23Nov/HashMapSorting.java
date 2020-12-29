package JavaPrograms23Nov;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapSorting {

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

			System.out.println(k.getValue());
		}

	}

}
