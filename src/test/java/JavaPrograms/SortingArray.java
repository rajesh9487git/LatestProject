package JavaPrograms;

public class SortingArray {

	public static void main(String[] args) {
		
	
	            int[] arr = {1, 0, 0, 2, 0, 7};

	            for (int i = 0; i < arr.length; i++)
	            {
	                for (int j = i; j < arr.length; j++)
	                {
	                   // if(arr[i] == 0)
	                       // break;
	                    
	                    //else
	                    {
	                        if (arr[j] == 0)
	                        {
	                            int temp = arr[i];
	                            arr[i] = arr[j];
	                            arr[j] = temp;
	                        }
	                    }
	                }
	            }

	 

	            for (int i = 0; i < arr.length; i++)
	                System.out.println(arr[i]);

	}

}
