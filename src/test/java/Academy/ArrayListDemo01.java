package Academy;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo01 {

	public static void main(String[] args) {
		
		
		EmployeeDemo e1= new EmployeeDemo("Rajesh", 22, "IT");
		EmployeeDemo e2= new EmployeeDemo("Mithun", 23, "QA");
		EmployeeDemo e3= new EmployeeDemo("Langda", 19, "DEV");
		EmployeeDemo e4= new EmployeeDemo("Ravi", 25, "CSE");
		EmployeeDemo e5= new EmployeeDemo("Anand", 26, "EEE");
		EmployeeDemo e6= new EmployeeDemo("Sri", 27, "COG");
		
		ArrayList<EmployeeDemo> ar1=new ArrayList<EmployeeDemo>();
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
		
		Iterator<EmployeeDemo> it=ar1.iterator();
		
		while(it.hasNext()) {
			
			EmployeeDemo ED=it.next();
			System.out.println(ED.name);
			System.out.println(ED.age);
			System.out.println(ED.dept);
			
		}
		
	System.out.println("****************************************************");
	
	
		ArrayList<EmployeeDemo> ar2=new ArrayList<EmployeeDemo>();
		ar2.add(e4);
		ar2.add(e5);
		ar2.add(e6);
		
		
		
		ar1.addAll(ar2);
		Iterator<EmployeeDemo> it2=ar1.iterator();
		
while(it2.hasNext()) {
			
			EmployeeDemo ED=it2.next();
			System.out.println(ED.name);
			System.out.println(ED.age);
			System.out.println(ED.dept);
			
		}

	}

}
