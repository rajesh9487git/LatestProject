package JavaPrograms;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortingHashMap {
	
	 public static HashMap<Integer, String> sortByValue(HashMap<Integer, String> hm) 
	    { 
	        // Create a list from elements of HashMap 
	        List<Map.Entry<Integer, String> > list = 
	               new LinkedList<Map.Entry<Integer, String> >(hm.entrySet()); 
	  
	        // Sort the list 
	        Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() { 
	            public int compare(Map.Entry<Integer, String> o1,  
	                               Map.Entry<Integer, String> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        }); 
	          
	        // put data from sorted list to hashmap  
	        HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>(); 
	        for (Map.Entry<Integer, String> aa : list) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        System.out.println(temp);
	        return temp;
	    } 
	  
	    // Driver Code 
	    public static void main(String[] args) 
	    { 
	  
	        HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
	        // enter data into hashmap 
	        hm.put(98, "Rajesh"); 
	        hm.put(99, "Niki"); 
	        hm.put(95, "Kaira"); 
	      
	        Map<Integer, String> hm1 = sortByValue(hm); 
	  
	        // print the sorted hashmap 
	        for (Map.Entry<Integer, String> en : hm1.entrySet()) { 
	        	
	            System.out.println("Key = " + en.getKey() +  
	                          ", Value = " + en.getValue()); 
	        } 
	    } 

}
