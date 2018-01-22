import java.util.ArrayList;
import java.util.Scanner;

public class Quicksort1Partition {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] ar = new int[n];
    for(int i=0;i<n;i++){
        ar[i]=in.nextInt();
    }
    int p = ar[0];
    ArrayList<Integer> left = new ArrayList<Integer>();
    ArrayList<Integer> equal = new ArrayList<Integer>();
    ArrayList<Integer> rigth = new ArrayList<Integer>(); 
    for(int i=0;i<n;i++){
        if(ar[i]>p){
            rigth.add(ar[i]);
        }else if(ar[i]<p){
            left.add(ar[i]);
        }else{
            equal.add(ar[i]);
        }
        
    }
      for(int i=0;i<left.size();i++){
     System.out.print(left.get(i)+" ");
      }
     for(int i=0;i<equal.size();i++){
     System.out.print(equal.get(i)+" ");
      }
     for(int i=0;i<rigth.size();i++){
     System.out.print(rigth.get(i)+" ");
      }
     
      }
}

//103423