import java.io.*;
import java.util.*;

public class NonDivisibleSubset {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		 	int n = sc.nextInt();
		 int k = sc.nextInt();
		 long[] inp = new long[n];
		 int[] out = new int[n];
		 for(int i=0;i<n;i++){
			 inp[i] = sc.nextLong();
		 }
		 int max=0,max1=1;
		 int r = 0;
		 
		 int count = 0;
		 for(int i=0;i<n-1;i++){
			 long[] temp = new long[n];
			 for(int c=0;c<n;c++){
				 temp[c]=0;
			 }
			count=1;
			 for(int j=i+1;j<n;j++){
				 long add = inp[i]+inp[j];
				 if(add%k!=0){
					 temp[0]=inp[i];
					 temp[1]=inp[j];
					 count++;
					 r=1;
					 max=j;
					 break;
					}
			 }
		
		 if(r==1){
			 for(int j=max+1;j<n;j++){
				 int count1=0;
				 for(int t=0;t<count;t++){
					 long add = inp[j] + temp[t];
					 if(add%k!=0){
						 count1++;
					 }
				 }
				
				 if(count1==count){
					 temp[count]=inp[j];
					 count++;
					
				 }
			 }
		 }
	
		 if(r==1){
			 for(int j=0;j<max;j++){
				 if(j==i){
					 continue;
				 }
				 int count1=0;
				 for(int t=0;t<count;t++){
					 long add = inp[j] + temp[t];
					 if(add%k!=0){
						 count1++;
					 }
				 }
				 if(count1==count){
					 temp[count]=inp[j];
					 count++;
					
				 }
			 }
		 }
		 
		 
		 
		 /*for(int t=0;t<count;t++){
			 System.out.print(temp[t]+" ");

		 }
		 System.out.println();*/
		 if(max1<count){
			 max1=count;
		 }
		 
		 }
		
		 System.out.println(max1);
    }
}

//173047