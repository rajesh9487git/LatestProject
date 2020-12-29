package JavaPrograms23Nov;

public class RemDupEleWithoutUsingCollection {

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

		int[] b = new int[a.length];

		int k = 0;

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] != a[i + 1]) {

				b[k] = a[i];
				k++;

			}
		}

		b[k] = a[a.length - 1];

		for (int i = 0; i <= k; i++) {

			System.out.println(b[i]);
		}

	}

}
