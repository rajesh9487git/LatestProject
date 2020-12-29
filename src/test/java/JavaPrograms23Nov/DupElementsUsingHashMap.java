package JavaPrograms23Nov;

import java.util.HashMap;
import java.util.Map;

public class DupElementsUsingHashMap {

	public static void main(String[] args) {

		int[] a = { 1, 1, 3, 3, 4, 5, 7, 8, 8, 8, 9, 7, 3, 8, 8, 8 };

		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {

			if (h.containsKey(a[i])) {

				h.put(a[i], h.get(a[i]) + 1);

			} else {

				h.put(a[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> k : h.entrySet()) {

			if (k.getValue() > 1) {

				System.out.println(k.getKey());
			}
		}

	}

}
