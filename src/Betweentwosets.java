import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Betweentwosets {
	static int getTotalX(int[] a, int[] b) {
        // Complete this function
		int t=0;
		Arrays.sort(a);
		Arrays.sort(b);
		int max=b[0];
		int min=a[a.length-1];
		//System.out.println(min+" "+max);
		while(min<=max){
		int count=0,count2=0;	
		for(int i=0;i<a.length;i++){
			if(min%a[i]==0){
				count++;
				//continue;
			}else{
				break;
			}
		}
		for(int j=0;j<b.length;j++){
			if(b[j]%min==0){
				count2++;
				//continue;
			}else{
				break;
			}
		}
		//System.out.println(count+" "+count2);
		if(count==a.length&&count2==b.length){
			t++;
		}
		min++;
		}
        return t;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
        
        
    }
}

//412733
