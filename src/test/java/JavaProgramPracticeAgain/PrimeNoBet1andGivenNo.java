package JavaProgramPracticeAgain;

public class PrimeNoBet1andGivenNo {

	public static void main(String[] args) {

		int n = 63;

		for (int i = 1; i <= n; i++) {

			int temp = 0;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					temp = 1;
					break;
				}
			}

			if (temp == 0) {

				System.out.println(i);
			}

		}

	}

}
