package JavaPrograms23Nov;

public class Logical2DArrayProgram {

	public static void main(String[] args) {
		
		
		// find the minimum value and find the max value of that column
		
		/* 1  3  6
		   7  -1  9
		   0 10  1 */
		
		// first find the min value and then identify the column
		
		int [] [] a = {{1,3,6}, {7,-1,9}, {0,10,1}};
		
		int min= a[0][0];
		int col = 0;
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				if(min>a[i][j]) {
					
					min=a[i][j];
					col=j;
				}
				
				}
		
			}
		
		// after identifying the coulm, traverse through the rows and identifed col to find the max no
		int max=a[0][col];
		
		for(int k=0;k<3;k++) {
			
			if(a[k][col]>max) {
				
				max=a[k][col];
			}
		}
		
		System.out.println(max);

}}
