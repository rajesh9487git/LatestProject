package Academy;

public class StringReverseDemo {

	public static void main(String[] args) {

String s= "madam";
String p = "";


for (int i=s.length()-1; i>=0;i--) {
	
	p=p+s.charAt(i);
	
}
		
		System.out.println(p);
		

if(s.equalsIgnoreCase(p)) {
	
	System.out.println("Given String which is:" + s+ " is a palendrom:" );
}
else {
	
	System.out.println("Given String is not a palendrom");
}

	}

}
