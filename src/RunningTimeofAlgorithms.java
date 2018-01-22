import java.io.*;
import java.util.*;
public class RunningTimeofAlgorithms {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
	       int s = in.nextInt();
	       int[] A = new int[s];
	       for(int i=0;i<s;i++){
	            A[i]=in.nextInt(); 
	       }
         int temp;
        int count=0;
       if(A[0]>A[1]){
               temp=A[0];
               A[0]=A[1];
               A[1]=temp;
           count++;
           }
        //   printArray(A);
       //System.out.println();
       for(int i = 1; i < A.length; i++){
           int value = A[i];
           int j = i - 1;
          
           
           while(j >= 0 && A[j] > value){
               A[j + 1] = A[j];
               count++;
               j = j - 1;
           }
           A[j + 1] = value;
       }
        System.out.println(count);
       //printArray(A);
    }
}
