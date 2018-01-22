import java.util.Scanner;

public class TheFullCountingSort {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	      Scanner in = new Scanner(System.in);
	      int n = in.nextInt();
	          int[] A = new int[n];
	       String[] B = new String[n];
	          int[] result = new int[100];
	      for(int i=0;i<n;i++){
	          A[i]=in.nextInt();
	          B[i]=in.nextLine();
	          
	      }
	         int count;
	          for(int i=0;i<100;i++){
	              count=0;
	              for(int j=0;j<n;j++){
	                  if(A[j]==i){
	                      count++;
	                  }
	              }
	              result[i]=count;
	          }
	          for(int i=0;i<100;i++){
	          for(int j=0;j<n;j++){
	          if(result[i]>0){
	              if(A[j]==i&&j<n/2){
	                  System.out.print("-");
	              }else if(A[j]==i&&j>=n/2){
	                  System.out.print(B[j]+"");
	              }else{
	                  continue;
	              }
	          }else{
	              break;
	          }
	          }
	          }
    }
}


//86492