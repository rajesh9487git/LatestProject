package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class RepeatedOccuranceDemo {

	public static void main(String[] args) {
	
		String str="Hellol";
		
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			
			if(hm.containsKey(str.charAt(i))) {
				
				hm.replace(str.charAt(i), hm.get(str.charAt(i))+1);
				
			} else {
				
				hm.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(hm);
		for(Map.Entry<Character, Integer> k: hm.entrySet()) {
			
			System.out.println(k.getKey()+"="+k.getValue());
		}

	}

}
