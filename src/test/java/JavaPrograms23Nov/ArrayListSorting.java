package JavaPrograms23Nov;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();

		a.add(1);
		a.add(3);
		a.add(0);
		a.add(82);

		Collections.sort(a);

		for (int i : a)
			System.out.println(i);

	}

}
