import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	int i,j,d;
    Difference(int[] element){
        this.elements = element;
    }
    int m=0; 
    void computeDifference(){
        for(i=0;i<elements.length;i++){
            for(j=i+1;j<elements.length;j++){
                d=elements[j]-elements[i];
                if(d<0){
                    d=d*-1;                    
                }
                if(m<d){
                    m=d;
                }
            }
        }
        maximumDifference=m;
    }
  	
}	
public class Scope {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	        sc.close();

	        Difference difference = new Difference(a);

	        difference.computeDifference();

	        System.out.print(difference.maximumDifference);
	    }
}
