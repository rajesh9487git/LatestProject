package JavaPrograms23Nov;

public class NextPalindrome {

	public static void main(String[] args) {

		int n = 1000789;

		for (int i = n + 1; i >= n; i++) {

			int rev = 0;
			int rem;
			int temp = i;

			while (temp != 0) {

				rem = temp % 10;
				rev = rev * 10 + rem;
				temp = temp / 10;
			}

			if (rev == i) {

				System.out.println(rev);
				break;

			}
		}

	}

}
