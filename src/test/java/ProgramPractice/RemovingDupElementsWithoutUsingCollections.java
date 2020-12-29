package ProgramPractice;

public class RemovingDupElementsWithoutUsingCollections {

	public static void main(String[] args) {

		int[] a = { 5, 5, 4, 3, 6, 6, 1, 1, 3, 3 };
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

		for(int k:a)
		System.out.println(k);
		
		System.out.println("--------------------------------------------------------");

		int[] b = new int[a.length];
		int j = 0;

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] != a[i + 1]) {
				b[j] = a[i];
				j++;
			}
		}
		
		System.out.println(j);
		System.out.println("-----------------------------------------------------------------");

		b[j] = a[a.length - 1];
		for (int i = 0; i <=j; i++) {
			System.out.println(b[i]);
		}
	}

}
