package JavaProgramPracticeAgain;

public class ArraySelectionSort {

	public static void main(String[] args) {

		int[] a = { 3, 4, 1, 2, 5, 0, 7, 5, 0, 9 };

		int temp;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[i]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int k : a)
			System.out.println(k);
	}

}
