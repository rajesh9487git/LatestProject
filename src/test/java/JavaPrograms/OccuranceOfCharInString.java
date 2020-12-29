package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
		
		String str="shetty";
		
		
        HashMap<Character, Integer> occrCount = new HashMap<Character, Integer>();



        for (int i = 0; i < str.length(); i++)
        {
            if (occrCount.containsKey(str.charAt(i)))
            { 
            
            	occrCount.replace(str.charAt(i), occrCount.get(str.charAt(i)) + 1);
            	
            	
            }
            else
            {
                occrCount.put(str.charAt(i), 1);
            }
        }


System.out.println(occrCount);
for(Map.Entry<Character, Integer> k: occrCount.entrySet()) {
	
	System.out.println(k.getKey()+"="+k.getValue());
}

        

	}

}
