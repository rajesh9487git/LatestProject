package JavaPrograms;

public class StringSwapping {

	public static void main(String[] args) {
		
		String a ="Hellos";
		String b = "World";
		
		a=a+b;
		
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);

	}

}
