import java.util.Scanner;

public class Countingsort2 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] ar = new int[n];
     int[] result = new int[100];
    for(int i=0;i<n;i++){
        ar[i]=in.nextInt();
    }
     
     for(int i=0;i<100;i++){
        int count=0;
     for(int j=0;j<n;j++){
         if(ar[j]==i){
             count++;
         }
         result[i]=count;
         //ar[i]=in.nextInt();
    }
     }
    // for(int i=0;i<100;i++){
      //  System.out.print(result[i]+" ");
   // }
        
    for(int j=0;j<100;j++){
        if(result[j]>0){
            for(int k=0;k<result[j];k++){
                System.out.print(j+" ");
            }
        }
    } 
    }
}

//89273
