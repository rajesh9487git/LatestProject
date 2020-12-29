package JavaPrograms;

import java.util.HashSet;

public class CommonEleInTwoArraysUsingHashSet {

	public static void main(String[] args) {
		int[] a = { 1, 4, 7, 9, 4, 3, 100 };
		int[] b = { 2, 3, 4, 7, 8, 3, 100 };

		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<Integer> hs1 = new HashSet<Integer>();

		for (int no : a)
			hs.add(no);

		for (int no : b)
			hs1.add(no);

		for (int no : hs1) {
			boolean c = hs.add(no);
			if (c == false) {
				System.out.println(no);
			}
		}
	}

}
