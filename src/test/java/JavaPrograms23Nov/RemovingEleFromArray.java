package JavaPrograms23Nov;

public class RemovingEleFromArray {

	public static void main(String[] args) {

		int[] a = { 3, 88, 66, 5, 8, 1, 87 };

		int n = 66;
		int k = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == n) {

				k = i;
				break;
			}
		}

		for (int i = k; i < a.length - 1; i++) {

			a[i] = a[i + 1];

		}

		for (int i = 0; i < a.length-1; i++) {

			System.out.println(a[i]);
		}

	}

}
