package JavaPrograms;

public class CharOccuranceAgain {

	public static void main(String[] args) {
		
		String str = "rajeshr";
		char[] ch= str.toCharArray();
		int count=0;
		int sz=ch.length;
		
		for(int i=0;i<sz;i++) {
			
			count=0;
			for(int j=0;j<sz;j++) {
				
				if(j<i &&ch[i]==ch[j]) {
					break;
				}
				
				if(ch[j]==ch[i]) {
					count++;
				}
				
				if(j==sz-1) {
					
					System.out.println(ch[i] +"="+ count);
				}
			}
			
			
		}

	}

}
