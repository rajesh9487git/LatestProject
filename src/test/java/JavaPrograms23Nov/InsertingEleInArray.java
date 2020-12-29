package JavaPrograms23Nov;

public class InsertingEleInArray {

	public static void main(String[] args) {

		int[] a = { 1, 3, 6, 88, 90, 100 };

		int index = 3;
		int ele = 8;

		for (int i = a.length - 1; i > index; i--) {

			a[i] = a[i - 1];
		}

		a[index] = ele;

		for (int k : a)
			System.out.println(k);
	}

}
