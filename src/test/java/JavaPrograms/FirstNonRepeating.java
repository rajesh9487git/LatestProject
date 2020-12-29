package JavaPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

	public static void main(String[] args) {

		String[] str = { "apple", "racecars", "abcdabd" };
		String temp;
		ArrayList<Character> a = new ArrayList<Character>();

		for (int i = 0; i < str.length; i++) {
			temp = str[i];
			char[] ch = temp.toCharArray();
			LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
			for (int j = 0; j < ch.length; j++) {

				if (hm.containsKey(ch[j])) {

					hm.replace(ch[j], hm.get(ch[j]) + 1);

				} else {
					hm.put(ch[j], 1);

				}
			}
			for (Map.Entry<Character, Integer> k : hm.entrySet()) {
				if (k.getValue() == 1) {

					a.add(k.getKey());
					//System.out.println(k.getKey());

					break;

				}

			}
		}

		System.out.println(a);

	}
}
