import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LetsReview {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 Scanner sc = new Scanner(System.in);
		 int Test = sc.nextInt();
		  for(int i=0;i<Test;i++){
			 
			 String s = sc.next();
			 char[] x = s.toCharArray();
			 for(int j=0;j<x.length;j++){
				 int k=j+1;
				 if(k%2==1){
					 System.out.print(x[j]);
				 }
			 }
			System.out.print(" ");
			 for(int j=0;j<x.length;j++){
				 int k=j+1;
				 if(k%2==0){
					 System.out.print(x[j]);
				 }
			 }
			 
		 }
		 // System.out.println(); 
		 sc.close();
	 }
}
