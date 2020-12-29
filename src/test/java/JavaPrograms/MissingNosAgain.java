package JavaPrograms;

public class MissingNosAgain {

	public static void main(String[] args) {

		int a[] = { 3, 7, 9, 7, 9 };
		int min = a[0];
		int max = a[0];
		int b[] = new int[a.length];
		String sss = new String();
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}

		for (int i = min; i <= max; i++) {
			boolean found = false;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					found = true;
					break;
				}

			}
			if (!found) {
				System.out.println(i);
				sss += i + " ";
			}
		}

		System.out.println(sss);

	}

}
