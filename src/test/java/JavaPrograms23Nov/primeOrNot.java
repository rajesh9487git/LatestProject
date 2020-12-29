package JavaPrograms23Nov;

public class primeOrNot {

	public static void main(String[] args) {

		int n = 24;

		int temp = 0;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {

				temp = 1;
			}

		}

		if (temp == 0) {

			System.out.println(" Prime No ");
		} else {

			System.out.println("Not a Prime no");
		}

	}

}
