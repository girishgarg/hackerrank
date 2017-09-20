import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Array2D {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
	        int l=0,max=-63,r = 0;
	        for(int k=0; k < 4; k++){
	            int c=0;
	        	for(int i=l; i < l+3; i++){
	        		for(int j=k; j < k+3; j++){
	                   
	        			if(j==k&&i==l+1){
	                     continue;
	        			}
	                    if(j==k+2&&i==l+1){
	                        continue;
	        			}
	        	
	        			c=c+arr[i][j]; 
	        			
	        		}
	               
	        	}
	        	r=c;
	        	if(k==3){
	        		l++;
	        		k=-1;
	        	}
	        	if(l==4){
	        		break;
	        	}
	        	if (max<c){ 
	                max=c;
	                    }
	        }
	        if(max<r){
	        	max=r;
	        }
	        System.out.println(max);
    }
}
