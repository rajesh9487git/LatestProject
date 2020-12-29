package JavaPrograms;

public class OccuranceAgainAgain {

	public static void main(String[] args) {

		String str = "Apptio";
		char[] c = str.toCharArray();
		int count = 0;
		int sz = c.length;

		for (int i = 0; i < sz; i++) {
			count = 0;
			for (int j = 0; j < sz; j++) {
				if (j < i && c[i] == c[j]) {
					break;
				}
				if (c[i] == c[j]) {
					count++;
				}
				if (j == sz - 1) {
					System.out.println(c[i] + "=" + count);
				}
			}

		}

	}

}
