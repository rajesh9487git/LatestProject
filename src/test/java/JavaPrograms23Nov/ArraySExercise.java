package JavaPrograms23Nov;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySExercise {

	public static void main(String[] args) {

		/*
		 * "2: Given array [""A"";""B"";""C"";""D"";""E"";""F"";""G""] A: Add item ""NOW
		 * I KNOW MY ABCs"" at the end. Output should be
		 * [""A"";""B"";""C"";""D"";""E"";""F"";""G"";""NOW I KNOW MY ABCs""] B: Add
		 * item ""123456"" at the beginning. Output should
		 * be[""123456"";""A"";""B"";""C"";""D"";""E"";""F"";""G"";""NOW I KNOW MY
		 * ABCs""] C: Remove [""D"";""E"";""F"";""G""] from the array; Output should be
		 * [""123456"";""A"";""B"";""C"";""NOW I KNOW MY ABCs""] D: Remove [""123456""]
		 * from the array; Output should be [""A"";""B"";""C"";""NOW I KNOW MY ABCs""]
		 * NOTE : Make sure the original array
		 * [""A"";""B"";""C"";""D"";""E"";""F"";""G""]should be intact and not modified.
		 * you can create any no. of new arrays."
		 */

		String[] s = { "A", "B", "C", "D", "E", "F", "G" };

		// converting arrays into array list
		ArrayList<String> s1 = new ArrayList<String>(Arrays.asList(s));

		s1.add("NOW I KNOW MY ABCs");

		for (String a : s1) {

			System.out.println(a);

		}
		
		s1.add(0, "123456");
		for (String b : s1) {

			System.out.println(b);

		}
		
		s1.subList(4, 8).clear();
		
		for (String c : s1) {

			System.out.println(c);

		}
		
		s1.remove(0);
		for (String d : s1) {

			System.out.println(d);

		}

	}

}
