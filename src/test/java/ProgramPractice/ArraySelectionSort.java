package ProgramPractice;

public class ArraySelectionSort {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 1, 2, 0, 0, 7, 5, 0, 9 };

		int temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[i]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k : arr)
			System.out.println(k);
	}

}
