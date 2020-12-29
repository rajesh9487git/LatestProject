package Academy;

public class ExceptionDemo {

	public static void main(String[] args) {
		int i=5;
	
		try {
			
			int k=i/0;
		}catch(Exception e){
			
			System.out.println("Exception");
			e.printStackTrace();
		}

	}

}
