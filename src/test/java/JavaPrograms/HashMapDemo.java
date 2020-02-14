package JavaPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

import Academy.EmployeeDemo;

public class HashMapDemo {

	public static void main(String[] args) {

		/*HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Rajesh");
		hm.put(3, "DK");
		hm.put(4, "Mithun");

		for (Entry m : hm.entrySet()) {

			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}*/

		EmployeeDemo e1 = new EmployeeDemo("Rajesh", 22, "IT");
		EmployeeDemo e2 = new EmployeeDemo("Ravi", 23, "CSE");
		EmployeeDemo e3 = new EmployeeDemo("Mithun", 24, "EEE");
		
		
		
		HashMap<Integer, EmployeeDemo> hm1= new HashMap<Integer, EmployeeDemo>();
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		
		for (Entry<Integer, EmployeeDemo> m: hm1.entrySet()) {
			
			int keyValue=m.getKey();
			EmployeeDemo Value1=m.getValue();
			
			
			System.out.println(keyValue);
			System.out.println(Value1.name + " "+ Value1.age+ " "+ Value1.dept );
			
		}
		

	}

}
