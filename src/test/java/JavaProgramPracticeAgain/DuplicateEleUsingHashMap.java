package JavaProgramPracticeAgain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateEleUsingHashMap {

	public static void main(String[] args) {

		int a[] = { 1, 3, 3, 4, 5, 7, 8, 8, 8, 9, 7, 3, 8, 8, 8 };

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int j : a) {

			if (hm.containsKey(j)) {

				hm.put(j, hm.get(j) + 1);

			} else {

				hm.put(j, 1);
			}
		}

		Set<Map.Entry<Integer, Integer>> s = hm.entrySet();

		for (Map.Entry<Integer, Integer> i : s) {

			if (i.getValue() > 1) {

				System.out.println(i.getKey());
			}
		}

	}
}
