package JavaPrograms23Nov;

import java.util.Scanner;

public class PrintTableOfTheGivenNo {

	public static void main(String[] args) {

		// Ask user to enter a number and then print the multiplication table of the
		// input number.

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the no");

		int n = scan.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(n * i);
		}

	}

}
