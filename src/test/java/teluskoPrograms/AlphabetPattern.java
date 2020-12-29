package teluskoPrograms;

public class AlphabetPattern {

	public static void main(String[] args) {

		char A = 'A'-1;

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				char c = (char) (A + j);
				System.out.print(c);
			}

			System.out.println();
		}

	}

}
