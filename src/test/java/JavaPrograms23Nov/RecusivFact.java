package JavaPrograms23Nov;

public class RecusivFact {
	int fact = 1;

	public static void main(String[] args) {

		RecusivFact a = new RecusivFact();
		System.out.println(a.getFact(8));
	}

	public int getFact(int n) {

		if (n >0) {

			fact = fact * n;
			getFact(n - 1);

		}

		return fact;
	}

}
