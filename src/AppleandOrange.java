import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class AppleandOrange {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int appcount=0;
        int orgcount=0;
        int[] apple = new int[m];
        int[] distance = new int[m];
        int[] distance1 = new int[n];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        for(int apple_i=0; apple_i < m; apple_i++){
        	distance[apple_i] = a + apple[apple_i];
        	//System.out.println(distance[apple_i]);
        	if(distance[apple_i]>=s&&distance[apple_i]<=t){
        		appcount++;
        	}
        }
        for(int orange_i=0; orange_i < n; orange_i++){
        	distance1[orange_i] = b + orange[orange_i];
        	//System.out.println(distance1[orange_i]);
        	if(distance1[orange_i]>=s&&distance1[orange_i]<=t){
        		orgcount++;
        	}
        }
        System.out.println(appcount);
        System.out.println(orgcount);
    }
}
