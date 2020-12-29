package JavaPrograms23Nov;

import java.util.Scanner;

public class AlphabetOrChar {

	public static void main(String[] args) {

		/*
		 * "Ask the user to input a character and check whether it is an alphabet or
		 * not, then display the output on the screen. If input character is an
		 * Alphabets, print ""AN ALPHABET! I can read your mind"" and if its a number
		 * print ""A NUMBER! I can read your mind""."
		 */

		/*
		 * ASCII value ranges-
		 * 
		 * For capital alphabets 65 – 90 For small alphabets 97 – 122 For digits 48 – 57
		 * All other cases are Special Characters.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a character");

		char c = scan.next().charAt(0);

		if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {

			System.out.println("It is alphabet");

		} else if (c >= 48 && c <= 57) {

			System.out.println("It is a no");

		} else {

			System.out.println("It is a special char");
		}

	}

}
