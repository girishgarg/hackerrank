import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cutthesticks {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int[] input = new int[test];
        for(int i=0;i<test;i++){
        	input[i] = in.nextInt();
        }
        int min=1000,count=3;
        while(count>0){
        min=1000;
        count=0;	
        for(int i=0;i<input.length;i++){
        	if(input[i]!=0){
        		if(input[i]<min){
        			min=input[i];
        		}
        	}
        }
        for(int i=0;i<input.length;i++){
        	if(input[i]!=0){
        		input[i]=input[i]-min;
        		count++;
        	}
        }
        if(count>0){
        	System.out.println(count);
        }
        
        }
	}
}

//223343