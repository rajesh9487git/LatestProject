package JavaPrograms23Nov;

public class CharOccursWithoutCollections {

	public static void main(String[] args) {

		String s = "shettys";

		char[] a = s.toCharArray();

		for (int i = 0; i < a.length; i++) {

			int count = 0;

			for (int j = 0; j < a.length; j++) {

				if (j < i && a[j] == a[i]) {

					break;
				}

				if (a[i] == a[j]) {

					count++;
				}

				/*
				 * if (j == a.length - 1) {
				 * 
				 * System.out.println(a[i] + "=" + count); }
				 */

				
			}
			
			if (count > 1) {

				System.out.println(a[i]);
			}
		}

	}

}
