package JavaPrograms;

public class ArraySortDemo {

	public static void main(String[] args) {
		
		//selection sort

		 int[] arr = {3, 4, 1, 2, 0, 0, 7, 5, 0, 9};

         for (int i = 0; i < arr.length; i++)
         {
             for (int j = i + 1; j < arr.length; j++)
             {
                     if (arr[j] < arr[i])
                     {
                         int temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                     }
             }
         }



         for (int i = 0; i < arr.length; i++)
             System.out.println(arr[i]);
         
         System.out.println("Max =" + arr[arr.length-1]);
	}

}
