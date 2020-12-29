package Academy;

import java.util.HashSet;

public class RemovingDupElementsUsingCollection {

	public static void main(String[] args) {
		
		int[] a= {4,8,9,9,0,6,4,8};
		
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			h.add(a[i]);
		}
        for(int k:h)
		System.out.println(k);
	}

}
