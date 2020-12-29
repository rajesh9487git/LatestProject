package Academy;

public class FindingDigitsInString {

	public static void main(String[] args) {
		
		String str= "sap1i2en";


		char[] a = str.toCharArray();

		for(char c: a){

		if(Character.isDigit(c)){
		System.out.println(c);
		}
		}

	}

}
