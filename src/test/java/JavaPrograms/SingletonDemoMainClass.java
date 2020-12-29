package JavaPrograms;

public class SingletonDemoMainClass {

	public static void main(String[] args) {

		SingletonDemo x = SingletonDemo.getInstance();

		x.s = x.s.toUpperCase();
		

		SingletonDemo y = SingletonDemo.getInstance();
		y.s=y.s.toLowerCase();

		System.out.println(x.s);
		System.out.println(y.s);

	}

}
