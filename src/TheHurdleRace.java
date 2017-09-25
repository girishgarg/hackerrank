import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TheHurdleRace {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result;
        int max;
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        Arrays.sort(height);
        max=height[height.length-1];
        if(max>k){
            result = max-k;
            System.out.println(result);
        }else{
            result=0;
            System.out.println(result);
        }
        // your code goes here
    }
}


//329347