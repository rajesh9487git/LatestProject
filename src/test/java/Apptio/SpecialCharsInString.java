package Apptio;

public class SpecialCharsInString {

	public static void main(String[] args) {
	
		String s = "Geeksf!@orgeek@s A#$ c%o^mputer s****cience p#o@rtal fo@r ge%eks";
		String s1="";
		String s2="";
		
		String regex ="[^a-zA-Z0-9\\s+]";
		
		for(int i=0;i<s.length();i++) {
			
			char c=s.charAt(i);
			
			
			
		 if(s.valueOf(c).matches(regex)) {
			 
			 s1=s1+c;
		 }else {
			 
			 s2=s2+c;
		 }
			
		}

		System.out.println(s1+s2);
	}

}
