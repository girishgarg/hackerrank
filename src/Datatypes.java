import java.io.*;
import java.util.Scanner;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
	
	

public class Datatypes {
	
		
	    public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	       // Scanner scannew = new Scanner(System.in);
	        
	        /* Declare second integer, double, and String variables. */
	         int x=scan.nextInt();
	         double y=scan.nextDouble();
	         scan.nextLine();
	        String n=scan.nextLine();
	        /* Read and save an integer, double, and String to your variables.*/
	        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
	        int e=x+i;
	        double f=d+y;
	        String g=s+n;
	        /* Print the sum of both integer variables on a new line. */
	        
	 System.out.println("Int: "+e); 
	System.out.println("Double: "+f);
	System.out.println("String: "+g);
	       
	        /* Print the sum of the double variables on a new line. */
			
	        /* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */
	 scan.close();
	        
}
}
