package JavaProgramPracticeAgain;

public class RecursiveFact {
	int fact = 1;

	public static void main(String[] args) {

		RecursiveFact r = new RecursiveFact();
		int facto = r.recursive(6);
		System.out.println(facto);

	}

	public int recursive(int no) {

		if (no >= 1) {

			fact = fact * no;
			recursive(no - 1);
		}

		return fact;
	}

}
