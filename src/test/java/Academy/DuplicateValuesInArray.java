package Academy;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		System.out.println("Duplicate values are:");

		int[] a = { 1, 3, 4, 5, 4, 3, 2, 1 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					System.out.println(a[j]);
				}

			}
		}

	}

}
