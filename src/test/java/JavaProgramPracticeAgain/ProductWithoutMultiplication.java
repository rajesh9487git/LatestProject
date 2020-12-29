package JavaProgramPracticeAgain;

import java.util.Scanner;

public class ProductWithoutMultiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first no");

		int n1 = sc.nextInt();

		System.out.println("Enter second no");

		int n2 = sc.nextInt();

		int product = product(n1, n2);

		System.out.println("product of " + n1 + " and " + n2 + " is " + product);

	}

	public static int product(int n1, int n2) {

		int product = 0;

		for (int i = 0; i < n2; i++) {

			product = product + n1;
		}

		return product;
	}

}
