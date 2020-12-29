package JavaPrograms23Nov;

public class BinaryNo {

	public static void main(String[] args) {

		// convert numbers into binary

		int n = 25;
		String b="";

		int count = 0;

		while (n > 0) {

			int a = n % 2;

			if (a == 1) {

				count++;
			}

			b = a + b;

			n = n / 2;

		}

		System.out.println(b);

		System.out.println("no of 1s is " + count);
	}

}
