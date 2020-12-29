package ProgramPractice;

public class SingletomMain {

	public static void main(String[] args) {
	
		SingletonClass x=SingletonClass.getInstance();
		SingletonClass y=SingletonClass.getInstance();
		y.s=y.s.toUpperCase();
		System.out.println(x.s);

	}

}
