package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class DupValuesinArrayAgainAg {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,3,4};
		
		Set<Integer> s = new HashSet<Integer>();
		
		for(int no:a) {
			
			if(s.add(no)==false) {
				
				System.out.println(no);
			}
		}
	}

}
