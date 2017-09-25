import java.io.*;
import java.util.*;

public class FindDigits {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int[] input = new int[test]; 
        for(int j=0;j<test;j++){
            input[j]=in.nextInt();
        }
        for(int i=0;i<test;i++){
            //int x = in.nextInt();
            int d = input[i];
            //System.out.println(d);
            int x = input[i];
            int count=0;
            while(x>0){
                int r = x%10;
                //System.out.println("r="+r);
                x = x/10;
                //System.out.println("x="+x);
                if(r!=0){
                if(d%r==0){
                    count++;
                    //System.out.println("count="+count);
                }
                }
                
            }
             System.out.println(count);
        }
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

//250825