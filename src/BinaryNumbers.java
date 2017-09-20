import java.io.*;

import java.util.*;
public class BinaryNumbers {
	public static void main(String[] args) {
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int r=0,i=0;
        int n = in.nextInt();
        List<Integer> unindexedVectors = new ArrayList<Integer>();
      //System.out.println("unindexedVectors"); 
         while(n>1){
        	int d = n%2;
        	unindexedVectors.add(d);
        	
        	n = n/2;
        	}
        unindexedVectors.add(1);
           unindexedVectors.add(0);
        //System.out.println(unindexedVectors);
        r=unindexedVectors.size();
      
        int count=0;
        List<Integer> myIntArray = new ArrayList<Integer>();
        //int[] myIntArray = new int[r];
        Integer[] arr = new Integer[r];
        arr = unindexedVectors.toArray(arr);
        for(i=0;i<arr.length;i++){
               if(arr[i]==1){
                   count++;
               }else{
                   //System.out.println(count);
                   myIntArray.add(count);
                   count=0;
               }
        }
        int e = Collections.max(myIntArray);
        System.out.println(e);
    }
}
