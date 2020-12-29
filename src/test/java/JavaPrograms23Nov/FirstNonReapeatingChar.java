package JavaPrograms23Nov;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonReapeatingChar {

	public static void main(String[] args) {

		String s = "shettys";

		char[] a = s.toCharArray();

		LinkedHashMap<Character, Integer> h = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < a.length; i++) {

			if (h.containsKey(a[i])) {

				h.put(a[i], h.get(a[i]) + 1);

			} else {

				h.put(a[i], 1);
				
			}

		}

		for (Map.Entry<Character, Integer> k : h.entrySet()) {

			if (k.getValue() == 1) {

				System.out.println(k.getKey());
				
				
				break;
			}

		}

	}

}
