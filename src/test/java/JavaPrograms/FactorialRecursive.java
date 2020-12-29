package JavaPrograms;

import org.testng.annotations.Test;

public class FactorialRecursive {

	int fact = 1;

	@Test
	public void factorialNo() {
		FactorialRecursive fr = new FactorialRecursive();
		int result = fr.calFact(5);
		System.out.println(result);

	}

	public int calFact(int no) {

		if (no >= 1) {
			fact = fact * no;
			calFact(no - 1);
		}
		return fact;
	}

}
