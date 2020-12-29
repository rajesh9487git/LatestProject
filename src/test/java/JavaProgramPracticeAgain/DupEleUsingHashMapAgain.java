package JavaProgramPracticeAgain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupEleUsingHashMapAgain {

	public static void main(String[] args) {
		int a[] = { 1,1, 3, 3, 4, 5, 7, 8, 8, 8, 9, 7, 3, 8, 8, 8 };

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int k : a) {

			if (hm.containsKey(k)) {
				hm.put(k, hm.get(k) + 1);

			} else {

				hm.put(k, 1);
			}

		}

		//Set<Map.Entry<Integer, Integer>> b = hm.entrySet();

		for (Map.Entry<Integer, Integer> i : hm.entrySet()) {

			if (i.getValue() > 1) {

				System.out.println(i.getKey());
			}
		}
	}

}
