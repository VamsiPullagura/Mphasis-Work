package mailProgram;
import java.util.Scanner;
import java.util.ArrayList;

public class mail {
	public static void main (String [] args) {
		
    	ArrayList<String> email = new ArrayList<String>();
    	
    	email.add("vamsi@gmail.com");
    	email.add("siri@gmail.com");
    	email.add("chinna@gmail.com");
    	email.add("chandu@gmail.com");
    	email.add("vennela@gmail.com");
    	
    	while(true) {
    		Scanner s= new Scanner (System.in);
    		System.out.println("enter mail id ");
    		String searchElement = s.nextLine();
    		
    		if (email.contains(searchElement)) {
    			System.out.println("email " + searchElement + " is found ");
    		
    		}
    		
    		else {
    			System.out.println("email " + searchElement  +" is not found ");
    		}
    		
    	}
	}
}
 
   
