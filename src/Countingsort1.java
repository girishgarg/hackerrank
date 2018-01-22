import java.util.Scanner;

public class Countingsort1 {
	public static void main(String[] args) {
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
     for(int i=0;i<100;i++){
        System.out.print(result[i]+" ");
    }
 }
}

//95903
