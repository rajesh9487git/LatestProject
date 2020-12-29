package JavaPrograms23Nov;

import java.util.Random;
import java.util.Scanner;

public class GeneratingRandomNos {

	public static void main(String[] args) {

		/*
		 * "2: Generate a random number between 1 and 9 (including 1 and 9). Ask the
		 * user to guess the number, then tell them whether they guessed too low, too
		 * high, or exactly right Exp: If random no is 6 and user input 5 (print
		 * ""Low""), if user enter 8 (print High), if user input 6 then print ('Right
		 * Guess')."
		 */

		Random r = new Random();

		int rand = r.nextInt(10);
		
		

		System.out.println(rand);

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the no");

		int n = scan.nextInt();

		if (n == rand) {

			System.out.println("Correct guess");
		} else if (n > rand) {

			System.out.println("too high");
		} else {

			System.out.println("too low");
		}

	}

}
