package ProgramPractice;

public class FibnocciUsingRecursive {

	int a = 0;
	int b = 1;
	int c;

	public static void main(String[] args) {

		FibnocciUsingRecursive fb = new FibnocciUsingRecursive();
		fb.recursive(10);

	}

	public void recursive(int n) {

		if (n >= 1) {

			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			recursive(n-1);
		}
	}

}
