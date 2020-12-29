package ProgramPractice;

public class CharacterOccuranceWithoutUsingCollection {

	public static void main(String[] args) {

		String s = "apptio";
		
		char[] a = s.toCharArray();
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			count = 0;

			for (int j = 0; j < a.length; j++) {

				if (j < i && a[j] == a[i]) {
					break;
				}

				if (a[i] == a[j]) {

					count++;
				}

				if (j == a.length - 1) {

					System.out.println(a[i] +"="+ count);
				}
			}
		}

	}

}
