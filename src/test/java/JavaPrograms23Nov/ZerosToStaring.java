package JavaPrograms23Nov;

public class ZerosToStaring {

	public static void main(String[] args) {

		int[] a = { 0, 1, 66, 6, 7, 0, 9, 0, 0, 9, 0 };

		int count = a.length - 1;

		for (int i = a.length - 1; i >= 0; i--) {

			if (a[i] != 0) {

				a[count] = a[i];
				count--;
			}
		}

		while (count >= 0) {

			a[count] = 0;
			count--;
		}

		for (int k : a)
			System.out.println(k);

	}

}
