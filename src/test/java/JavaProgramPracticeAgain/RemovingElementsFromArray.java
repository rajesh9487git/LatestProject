package JavaProgramPracticeAgain;

public class RemovingElementsFromArray {

	public static void main(String[] args) {

		int a[] = { 3, 88, 66, 5, 8, 1, 87 };
		int n = 66;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == n) {

				for (int j = i; j < a.length - 1; j++) {

					a[j] = a[j + 1];
				}
			}
		}

		for (int i = 0; i < a.length -1; i++) {

			System.out.println(a[i]);
		}
	}

}
