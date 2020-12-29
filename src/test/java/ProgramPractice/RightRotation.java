package ProgramPractice;

public class RightRotation {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 6, 5 };
		int n = 3;
		int last;

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
