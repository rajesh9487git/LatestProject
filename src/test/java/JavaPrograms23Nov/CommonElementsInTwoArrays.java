package JavaPrograms23Nov;

import java.util.HashSet;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {

		int[] a = { 1, 4, 7, 9, 4, 3, 100, 22 };
		int[] b = { 2, 3, 4, 7, 8, 3, 100, 22 };

		HashSet<Integer> h = new HashSet<Integer>();
		HashSet<Integer> h1 = new HashSet<Integer>();

		for (int i : a)
			h.add(i);

		for (int k : b)
			h1.add(k);

		for (int j : h1) {

			if (h.add(j) == false) {

				System.out.println(j);
			}
		}

	}

}
