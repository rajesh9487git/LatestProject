package JavaPrograms23Nov;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordOccurance {

	public static void main(String[] args) {

		//String s = "shetty shetty, is a bad guy. shetty";
				String s = "shetty shetty is a bad guy shetty";

				//String[] s1 = s.replace(",", "").replace(".", "").split(" ");
				String [] s1=s.split(" ");
				

				LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();

				for (int i = 0; i < s1.length; i++) {

					if (hm.containsKey(s1[i])) {

						hm.put(s1[i], hm.get(s1[i]) + 1);

					} else {

						hm.put(s1[i], 1);
					}

				}

				for (Map.Entry<String, Integer> k : hm.entrySet()) {

					System.out.println(k.getKey() + "=" + k.getValue());
				}


	}

}
