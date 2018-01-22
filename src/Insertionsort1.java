import java.util.Scanner;

public class Insertionsort1 {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
    	int a=ar[ar.length-1];
        int j=ar.length-1;
        if(ar[j]<ar[j-1]){
    			ar[j]=ar[j-1];
    			printArray(ar);
    		}
    	for(int i=ar.length-2;i>0;i--){
    		if(ar[i]>ar[i-1]&&ar[i-1]>a){
    			ar[i]=ar[i-1];
    			printArray(ar);
                if(i==1){
                   ar[i-1]=a;
    			   printArray(ar);
    			   break; 
                }
    		}else{
    			ar[i]=a;
    			printArray(ar);
    			break;
    		}
    	}
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}

//136697