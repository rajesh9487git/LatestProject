package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		
		//sorting arraylist
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Rajesh");
		arr.add("Niki");
		arr.add("Kaira");
		
		Collections.sort(arr);
		
		for(String sorted: arr)
			System.out.println(sorted);

	}

}
