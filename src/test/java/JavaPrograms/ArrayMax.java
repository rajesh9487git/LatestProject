package JavaPrograms;

public class ArrayMax {

	public static void main(String[] args) {
		 int[] arr = {1, 4, 0, 2, 0, 0, 7, 5, 0, 9};

		 int max = arr[0];
		 
         for (int i = 1; i < arr.length; i++)
         {
        	 if(max > arr[i])
        		 max = arr[i];
         }
         System.out.println(max);
         }
	}


