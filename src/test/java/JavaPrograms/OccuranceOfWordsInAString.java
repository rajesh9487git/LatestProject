package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWordsInAString {

	public static void main(String[] args) {
		
		String str2="shetty shetty, is a bad guy. shetty";
		
		String[] str = str2.replace(",","").replace(".","").split(" ");
		
		
        HashMap<String, Integer> occrCount = new HashMap<String, Integer>();



        for (int i = 0; i < str.length; i++)
        {
            if (occrCount.containsKey(str[i]))
            { 
            
            	occrCount.replace(str[i], occrCount.get(str[i]) + 1);
            	
            }
            else
            {
                occrCount.put(str[i], 1);
            }
        }


System.out.println(occrCount);
/*for(Map.Entry<Character, Integer> k: occrCount.entrySet()) {
	
	System.out.println(k.getKey()+"="+k.getValue());
}*/

        

	}

}
