package ProgramPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(1);
		a.add(22);
		a.add(11);
		
		
		Collections.sort(a);
		
		for(int k:a)
			System.out.println(k);

	}

}
