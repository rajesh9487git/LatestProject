package JavaPrograms23Nov;

public class StringArraySorting {

	public static void main(String[] args) {

		String[] s = { "Rajesh", "Bhavesh", "Kaira", "Ziki", "Aebra" };

		String temp;

		for (int i = 0; i < s.length; i++) {

			for (int k = 0; k < s.length - 1; k++) {

				if (s[k].compareTo(s[k + 1]) > 0) {

					temp = s[k];
					s[k] = s[k + 1];
					s[k + 1] = temp;
				}
			}
		}

		for (String j : s)
			System.out.println(j);

	}

}
