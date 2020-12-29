package JavaProgramPracticeAgain;

public class ArrayBubbleSort {

	public static void main(String[] args) {

		int[] a = { 23, 66, 12, 2, 9, 76, 0 };

		int temp;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}

		for (int k : a)
			System.out.println(k);
	}

}
