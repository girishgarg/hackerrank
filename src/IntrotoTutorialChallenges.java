import java.util.Scanner;

public class IntrotoTutorialChallenges {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k= in.nextInt();
		int[] array = new int[n];
        for(int grades_i=0; grades_i < k; grades_i++){
            array[grades_i] = in.nextInt();
        }
        
        for(int i=0;i<k;i++){
        	if(array[i]==n){
        		System.out.println(i);
        	}
        }
    }
}

//150488