package ProgramPractice;

public class MergingTwoArrays {

	public static void main(String[] args) {

		int[] a = { 2, 6, 9, 1, 8 };
		int[] b = { 66, 78, 93, 3 };

		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		for (int k : c)
			System.out.println(k);
	}

}
