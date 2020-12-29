package JavaPrograms23Nov;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccuraUsingCollections {

	public static void main(String[] args) {

		String s = "shettys";

		char[] c = s.toCharArray();

		LinkedHashMap<Character, Integer> h = new LinkedHashMap<Character, Integer>();
		
		

		for (int i = 0; i < c.length; i++) {

			if (h.containsKey(c[i])) {

				h.put(c[i], h.get(c[i]) + 1);

			} else {

				h.put(c[i], 1);
			}
		}

		for (Map.Entry<Character, Integer> k : h.entrySet()) {

			System.out.println(k.getKey() + "=" + k.getValue());

		}
	}

}
