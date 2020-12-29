package JavaProgramPracticeAgain;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String s = "abcecdabdef";

		char[] c = s.toCharArray();

		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

		for (char k : c) {

			if (hm.containsKey(k)) {
				hm.put(k, hm.get(k) + 1);
			} else {

				hm.put(k, 1);
			}

		}

		Set<Map.Entry<Character, Integer>> i = hm.entrySet();

		for (Map.Entry<Character, Integer> j : i) {

			if (j.getValue() == 1) {

				System.out.println(j.getKey());
				break;
			}
		}

	}
}
