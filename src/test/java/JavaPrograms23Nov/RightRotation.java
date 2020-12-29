package JavaPrograms23Nov;

public class RightRotation {

	public static void main(String[] args) {

		int[] a = { 33, 22, 1, 35, 0, 6, 98 };

		int n = 3;

		for (int i = 1; i <= n; i++) {

			int last = a[a.length - 1];

			for (int j = a.length - 1; j >0; j--) {

				a[j] = a[j - 1];
				
			}
			
			a[0]=last;
		}

		for (int k : a)
			System.out.println(k);

	}

}
