package JavaPrograms23Nov;

public class MultiDimeArray {

	public static void main(String[] args) {

		int[][] a = new int[2][3];

		a[0][0] = 1;
		a[0][1] = 3;
		a[0][2] = 6;

		a[1][0] = 7;
		a[1][1] = 5;
		a[1][2] = 9;

		//System.out.println(a[1][2]);

		// another way initializing 2d array

		// int [][] b = {{1,3,6}, {7,5,9}};

		// 2 for loops need, one for rows and another for columns

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.println(a[i][j]);
			}
		}

	}

}
