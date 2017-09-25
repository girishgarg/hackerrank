import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class GradingStudents {
	static int[] solve(int[] grades){
        // Complete this function
		int i,j,k;
		for(i=0;i<grades.length;i++){
			if(grades[i]>=38){
				j=(grades[i] + 4) / 5 * 5;
				//System.out.println(j);
				k=j-grades[i];
				if(k<3){
					grades[i]=j;
				}
			}
		}
		return grades;
		//return ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
