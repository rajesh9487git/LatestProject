package JavaPrograms;

public class SingletonDemo {

	private static SingletonDemo t = null;
	
	String s;

	private SingletonDemo() {

		s="hello world";
	}

	public static SingletonDemo getInstance() {

		if (t == null) {

			t = new SingletonDemo();
			System.out.println("Object is created");

		}

		return t;
	}

}
