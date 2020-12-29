package JavaPrograms;

public class SwitchDemo {

	public static void main(String[] args) {

		int i = 3;
		
		// switch keyword is used to writre multiple conditions and code for the same instead of using multiple "if" and "else if" statements
		// here i value is 3 hence it matches with "case 3" and will print that execution, String values also can be used for switch from 1.7 and above version of java
		// we need use break statement after other wise it will execute all below execution also after matching with its value
		
		// eg for String in switch 
		/*// String s ="abc";
		switch(s) {
		
		case "bbc":
			System.out.println("match found");
			break;
			
		case "abc":
			System.out.println("match found");
			break;
		
		}*/
		
		

		switch (i) {

		case 1:
			System.out.println("one");
			break;

		case 3: {

			System.out.println("three");
			break;
		}

		case 4:
			System.out.println("four");
			break;

		default:
			System.out.println("no match");

		}

	}

}
