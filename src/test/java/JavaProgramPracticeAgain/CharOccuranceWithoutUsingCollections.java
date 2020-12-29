package JavaProgramPracticeAgain;

public class CharOccuranceWithoutUsingCollections {

	public static void main(String[] args) {

		String s = "rajeshrr";

		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {

			int count = 0;

			for (int j = 0; j < c.length; j++) {

				if (j < i && c[j] == c[i]) {
					break;
				}

				if (c[i] == c[j]) {

					count++;
				}

				if (j == c.length - 1) {

					System.out.println(c[i] + "=" + count);

				}

			}
		}
	}

}
