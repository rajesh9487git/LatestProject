package JavaPrograms;

import java.util.Scanner;

public class StringDemo1 {

	public static void main(String[] args) {
		 String evenValues="";
	       String oddValues="";
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("enter no");
	        int T=scan.nextInt();
	        
	        
	        for(int i=1;i<=T;i++){
	           
	            String s =scan.nextLine();
	             
	             for(int j=0;j<s.length();i++){

	                 if(s.indexOf(s.charAt(j))%2==0){
	                    evenValues=evenValues+s.charAt(j);

	                 }else{
	                     oddValues=oddValues+s.charAt(j);
	                 }
	             }

	             
	             
	        }

	        System.out.println(evenValues+"  "+oddValues);
	}

}
