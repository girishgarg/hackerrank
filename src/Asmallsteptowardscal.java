import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Asmallsteptowardscal {
	static int solve(String opr) {
        
       char a = opr.charAt(0);
       String a1 = String.valueOf(a);
       int a2=Integer.parseInt(a1);  
       char b = opr.charAt(2);
       String b1 = String.valueOf(b);
       int b2=Integer.parseInt(b1);
       char opertn = opr.charAt(1);
       int c = 0;
       if(opertn=='+'){
    	   c=a2+b2;
       }else{
    	   b2=b2*-1;
    	   c=a2+b2;
       }
       return c;
}

public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   String opr = in.next();
   int result = solve(opr);
   System.out.println(result);
   in.close();
}
}
