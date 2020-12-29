package ProgramPractice;

public class ArrayMaxAndMin {

	public static void main(String[] args) {

		int[] a = { 22, 33, 1, 6, 7, 0, 65 };

		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {

				max = a[i];
			} else if (min > a[i]) {

				min = a[i];

			}
		}

		System.out.println("Max no is " + max);
		System.out.println("Min no is " + min);
	}

}
