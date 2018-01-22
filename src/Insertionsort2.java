import java.util.Scanner;

public class Insertionsort2 {
	 public static void insertionSortPart2(int[] ar)
	    {       
	           // Fill up the code for the required logic here
	           // Manipulate the array as required
	           // The code for Input/Output is already provided
		// Fill up this function
		 int temp;
	        if(ar[1]<ar[0]){
	            temp=ar[1];
	            ar[1]=ar[0];
	              ar[0]=temp; 
	        }        
		 for(int j=1;j<ar.length;j++){	
			 int a=ar[j];
		        int k=j;
		        if(ar[k]<ar[k-1]){
		    			ar[k]=ar[k-1];
		    			//printArray(ar);
		    		}else{
	                printArray(ar);
	                continue;
	            }
		    	for(int i=j-1;i>0;i--){
		    		if(ar[i]>ar[i-1]&&ar[i-1]>a){
		    			ar[i]=ar[i-1];
		    			//printArray(ar);
		                if(i==1){
		                   ar[i-1]=a;
		    			//printArray(ar);
		    			   break; 
		                }
		    		}else{
		    			ar[i]=a;
		    			//printArray(ar);
		    			break;
		    		}
		    	}
		    	printArray(ar);
		    }
	    }  
	    
	    
	      
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	       int s = in.nextInt();
	       int[] ar = new int[s];
	       for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	       }
	       insertionSortPart2(ar);    
	                    
	    }    
	    private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
}

//124929
