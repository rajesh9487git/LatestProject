package JavaProgramPracticeAgain;

public class RecursiveFibnocci {

	int a = 0;
	int b = 1;
	int c;

	public static void main(String[] args) {

		RecursiveFibnocci r = new RecursiveFibnocci();
		r.recusriveFib(20);

	}

	public void recusriveFib(int no) {

		if (no >= 1) {

			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			recusriveFib(no - 1);
		}
	}

}
