package JavaPrograms23Nov;

public class ZerosToEnd {

	public static void main(String[] args) {

		int[] a = { 1, 6, 7, 0, 9, 0, 0, 9, 0 };

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {

				a[count] = a[i];
				count++;
			}
		}

		while (count < a.length) {

			a[count] = 0;
			count++;
		}

		for (int k : a)
			System.out.println(k);
	}

}
