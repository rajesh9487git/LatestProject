package JavaProgramPracticeAgain;

public class MergingTwoArrays {

	public static void main(String[] args) {

		int[] a = { 2, 6, 9, 1, 8 };
		int[] b = { 66, 78, 93, 3 };

		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {

			c[i] = a[i];
		}

		for (int j = 0; j < b.length; j++) {

			c[a.length + j] = b[j];
		}

		for (int k : c)
			System.out.println(k);
	}

}
