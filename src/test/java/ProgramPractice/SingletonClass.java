package ProgramPractice;

public class SingletonClass {

	
	private static SingletonClass t = null;
	String s;
	
	private SingletonClass() {
		
		this.s="Hellow World";
	}
	
	
	public static SingletonClass getInstance() {
		
		if(t==null) {
			
			t=new SingletonClass();
			System.out.println("Object is created");
		}
		
		return t;
	}
}
