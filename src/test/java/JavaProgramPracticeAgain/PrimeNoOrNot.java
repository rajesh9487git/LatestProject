package JavaProgramPracticeAgain;

public class PrimeNoOrNot {

	public static void main(String[] args) {

		int n = 9;

		int temp = 0;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {

				temp = 1;
				break;
			}

		}

		if (temp > 0) {

			System.out.println("Not a Prime no");
		} else {

			System.out.println("It is a Prime no");
		}
	}

}
