package JavaPrograms23Nov;

public class MinNoFrom2DArray {

	public static void main(String[] args) {
		
	/* 1  3  6
	   7  5  9
	   0 -1  1 */
		

		int[][] a = { { 1, 3, 6 }, { 7, 5, 9 }, { 0, -1, 1 } };

		int min = a[0][0];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (min > a[i][j]) {

					min = a[i][j];
				}
			}
		}

		System.out.println(min);
	}

}
