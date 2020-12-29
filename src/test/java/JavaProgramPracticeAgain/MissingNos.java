package JavaProgramPracticeAgain;



public class MissingNos {

	public static void main(String[] args) {

		int[] a = { 3, 7, 9, 7, 9 ,12};

		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {

				max = a[i];
			} else if (min > a[i]) {

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
			}
		}
	}

}
