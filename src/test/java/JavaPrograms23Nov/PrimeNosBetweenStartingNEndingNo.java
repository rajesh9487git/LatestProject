package JavaPrograms23Nov;

import java.util.Scanner;

public class PrimeNosBetweenStartingNEndingNo {

	public static void main(String[] args) {

		// Ask user to enter the starting number and ending number and Print all the
		// prime numbers between starting and ending number.
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter starting no");

		int a = scan.nextInt();

		System.out.println("Enter ending no");
		int count = 0;

		int b = scan.nextInt();

		for (int i = a; i <= b; i++) {

			for (int j = 2; j < i; j++) {

				if ((i % j) == 0) {
					count = 0;
					break;

				} else {

					count = 1;
				}
			}

			if (count == 1) {

				System.out.println(i);
			}
		}

	}

}
