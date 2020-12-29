package JavaPrograms;

import java.util.HashSet;

public class CommonElementsInTwoArrays1 {

	public static void main(String[] args) {
		
		int [] a= {1,4,7,9,4,3};
		int [] b= {2,3,4,7,8,3};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				
				if(a[i]==b[j]) {
					hs.add(a[i]);
				}
			}
		}

		
			for(int no:hs)
				System.out.println(no);
	}

}
