package acprogram;
import java.util.Scanner;
public class ac {
	
	    public static void main(String [] args) {
	        double p,q;
            Scanner s=new Scanner(System.in);
	        System.out.println("enter any two numbers of your own choice");
	        p=s.nextDouble();
	        q=s.nextDouble();
	        System.out.println("enter the operation you want to perform (+,-,/,*)");
	        char op=s.next().charAt(0);
	        double output =0;
	        switch(op) {
	            case '+':
	                output =p+q;
	                break;
	                
	            case '-':
	                output=p-q;
	                break;
	                
	            case '/':
	                output =p/q;
	                break;
	                
	            case '*':
	                output =p*q;
	                break;
	                
	            default:
	            	System.out.println("syntax error");
	            	break;
	        }
	        System.out.println("your result is  :");
	        System.out.println(p+" "+op+" "+q+"=" + output);
	    }
	}


