package ProgramPractice;

public class FactorialRecursive {

	int fact = 1;

	public static void main(String[] args) {

		FactorialRecursive n = new FactorialRecursive();
		int factorial = n.recursive(5);
		System.out.println(factorial);

	}

	public int recursive(int no) {

		if (no >= 1) {

			fact = fact * no;
			recursive(no - 1);
		}

		return fact;
	}

}
