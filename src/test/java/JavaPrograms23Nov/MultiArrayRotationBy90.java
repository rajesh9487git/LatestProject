package JavaPrograms23Nov;

import Academy.A;

public class MultiArrayRotationBy90 {
	
	
	public static void main(String[] args) {
	/* 1  3  6
	   7  -1  9
	   0 10  1 */
		
		//https://www.youtube.com/watch?v=IdZlsG6P17w
	
		
	int temp;
	int [] [] a = {{1,3,6}, {7,-1,9}, {0,10,1}};
	int n =a.length;
	
	for (int i=0;i<a.length;i++) {
		
		for(int j=i;j<a[0].length;j++) {
			
			temp=a[i][j];
			a[i][j]=a[j][i];
			a[j][i]=temp;
			
			
		}
	}
	
	
	for(int i=0;i<a.length;i++) {
		
		for(int j=0;j<n/2;j++) {
			
			int temp1=a[i][n-1-j];
			temp=a[i][j];
			a[i][j]= a[i][n-1-j];
			a[i][n-1-j]=temp;
		}
	}
	
for (int i=0;i<a.length;i++) {
		
		for(int j=0;j<a[0].length;j++) {
			
			System.out.println(a[i][j]);
			
			
		}
	}
	
}
}
