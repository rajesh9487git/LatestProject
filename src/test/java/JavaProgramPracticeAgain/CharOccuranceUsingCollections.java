package JavaProgramPracticeAgain;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharOccuranceUsingCollections {

	public static void main(String[] args) {

		String s = "shetty";
		char[] c = s.toCharArray();

		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < c.length; i++) {

			if (hm.containsKey(c[i])) {

				hm.put(c[i], hm.get(c[i]) + 1);

			} else {

				hm.put(c[i], 1);
			}
		}

		for (Map.Entry<Character, Integer> k : hm.entrySet()) {

			System.out.println(k.getKey() + "=" + k.getValue());
		}
	}

}
