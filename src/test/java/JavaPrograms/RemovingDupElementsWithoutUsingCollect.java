package JavaPrograms;

public class RemovingDupElementsWithoutUsingCollect {

	public static void main(String[] args) {

		// Removing dup elements from an unsorted array without using collection

		int[] a = { 5, 5, 4, 3, 6, 6, 1, 1, 3,3 };
		int temp;

		//sorting the aray
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[i]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		/*
		 * for(int k:a) System.out.println(k);
		 */

		int[] ar = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] != a[i + 1]) {
				ar[j] = a[i];
				j++;

			}
		}

		ar[j] = a[a.length - 1];
		for (int i = 0; i <=j; i++) {
			System.out.println(ar[i]);
		}
	}

}
