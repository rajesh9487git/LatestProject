package JavaPrograms23Nov;

public class PrimeNosBetween {

	public static void main(String[] args) {

		int n = 55;

		for (int i = 1; i <= n; i++) {

			int temp = 0;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					temp = 1;

				}
			}

			if (temp == 0) {

				System.out.println(i);
			}
		}

	}

}
