package JavaPrograms;

public class MainMethodForAnonymousDemo {

	public static void main(String[] args) {
	
		AnonymousClassDemo a = new AnonymousClassDemo() {

			public void show() {
				
				System.out.println("Demo ");
				
			}
			
			
		};
		
		a.show();

	}
}
