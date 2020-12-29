package JavaPrograms23Nov;

public class RecursiveFibnocci {

	int a = 0;
	int b = 1;
	int c;

	public static void main(String[] args) {

		RecursiveFibnocci d = new RecursiveFibnocci();

		d.getFib(20);

	}

	public void getFib(int n) {

		if (n > 0) {

			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			getFib(n - 1);
		}

	}

}
