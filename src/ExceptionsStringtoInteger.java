import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionsStringtoInteger {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int i;
        try{
            i = Integer.parseInt(S);
            System.out.println(i);
        }catch(NumberFormatException e) { 
         System.out.println("Bad String");   
        //return false; 
        }    
    }
}
