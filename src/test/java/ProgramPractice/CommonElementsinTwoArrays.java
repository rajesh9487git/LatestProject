package ProgramPractice;

import java.util.HashSet;

public class CommonElementsinTwoArrays {

	public static void main(String[] args) {

		int[] a = { 1, 4, 7, 9, 4, 3, 100 };
		int[] b = { 2, 3, 4, 7, 8, 3, 100 };

		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<Integer> hs1 = new HashSet<Integer>();

		for (int k : a)
			hs.add(k);

		for (int j : b)
			hs1.add(j);

		for (int i : hs1) {

			if (hs.add(i) == false) {

				System.out.println(i);
			}
		}

	}

}
