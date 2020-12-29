package ProgramPractice;

public class RightNotation {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6, 5 };

		int last;

		int n = 4;

		for (int i = 0; i < n; i++) {

			last = a[a.length - 1];

			for (int j = a.length - 1; j > 0; j--) {

				a[j] = a[j - 1];
			}

			a[0] = last;
		}

		for (int k : a)
			System.out.println(k);

	}

}
