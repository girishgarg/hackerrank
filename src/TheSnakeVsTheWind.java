import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TheSnakeVsTheWind {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char d = in.next().charAt(0);
        int x = in.nextInt();
        int y = in.nextInt();
        // Write Your Code Here
        int count=1;
        int[][] matp1 = new int[n][n];
        int[][] matp2 = new int[n][n];
        
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        			matp1[i][j]=count;
        			count++;
        	}
        }
        int temp;
        for(int i=1;i<n;i=i+2){
        	int k=n-1;
        	for(int j=0;j<n/2;j++){
        		temp = matp1[i][j];   
                matp1[i][j] = matp1[i][k];
                matp1[i][k] = temp;
                k--;
        	}
        }
        
         count=1;
        	for(int j=0;j<n;j++){
        			matp2[0][j]=count;
        			count++;
        	}
        
        	for(int j=n-1;j>=0;j--){
            	for(int i=1;i<n;i++){
            		matp2[i][j]=count;
            		count++;
            	}
            	}
        	
        	for(int j=n-2;j>=0;j=j-2){
        		int k=n-1;
        		for(int i=1;i<=n/2;i++){
        			temp = matp2[i][j];   
                    matp2[i][j] = matp2[k][j];
                    matp2[k][j] = temp;
                    k--;
        		}
        	}
        
        if(d=='e'){
        	if(x==0&&y==0){
        		for(int i=0;i<n;i++){
                	for(int j=0;j<n;j++){
                			System.out.print(matp2[i][j]+" ");
                	}
                	System.out.println();;
                }
        	}else if(x==0&&y==n-1){
        		for(int i=0;i<n;i++){
        	for(int j=n-1;j>=0;j--){
        			System.out.print(matp1[j][i]+" ");
        	}
        	System.out.println();;
        }
        	}else if(x==n-1&&y==0){
        		for(int i=n-1;i>=0;i--){
                	for(int j=0;j<n;j++){
                			System.out.print(matp2[i][j]+" ");
                	}
                	System.out.println();;
                }
        	}else{
        		for(int i=n-1;i>=0;i--){
        	for(int j=n-1;j>=0;j--){
        			System.out.print(matp1[j][i]+" ");
        	}
        	System.out.println();;
        }
        	}
        }
        
        
        if(d=='w'){
        	if(x==0&&y==0){
        		for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        			System.out.print(matp1[j][i]+" ");
        	}
        	System.out.println();;
        }
        	}else if(x==0&&y==n-1){
        		for(int i=0;i<n;i++){
                	for(int j=n-1;j>=0;j--){
                			System.out.print(matp2[i][j]+" ");
                	}
                	System.out.println();;
                }
        	}else if(x==n-1&&y==0){
        		for(int i=n-1;i>=0;i--){
        	for(int j=0;j<n;j++){
        			System.out.print(matp1[j][i]+" ");
        	}
        	System.out.println();;
        }
        	}else{
        		for(int i=n-1;i>=0;i--){
                	for(int j=n-1;j>=0;j--){
                			System.out.print(matp2[i][j]+" ");
                	}
                	System.out.println();;
                }
        	}
        }
        
        if(d=='n'){
        	if(x==0&&y==0){
        		for(int i=0;i<n;i++){
            	for(int j=0;j<n;j++){
            			System.out.print(matp1[i][j]+" ");
            	}
            	System.out.println();;
            }
        	}else if(x==0&&y==n-1){
        		for(int i=0;i<n;i++){
            	for(int j=n-1;j>=0;j--){
            			System.out.print(matp1[i][j]+" ");
            	}
            	System.out.println();;
            }
        	}else if(x==n-1&&y==0){
        		for(int i=n-1;i>=0;i--){
                	for(int j=0;j<n;j++){
                			System.out.print(matp2[j][i]+" ");
                	}
                	System.out.println();;
                }
        	}else{
        		for(int i=n-1;i>=0;i--){
                	for(int j=n-1;j>=0;j--){
                			System.out.print(matp2[j][i]+" ");
                	}
                	System.out.println();;
                }
        	}
        }
        
        if(d=='s'){
        	if(x==0&&y==0){
        		for(int i=0;i<n;i++){
                	for(int j=0;j<n;j++){
                			System.out.print(matp2[j][i]+" ");
                	}
                	System.out.println();;
                }
        	}else if(x==0&&y==n-1){
        		for(int i=0;i<n;i++){
                	for(int j=n-1;j>=0;j--){
                			System.out.print(matp2[j][i]+" ");
                	}
                	System.out.println();;
                }
        	}else if(x==n-1&&y==0){
        		for(int i=n-1;i>=0;i--){
            	for(int j=0;j<n;j++){
            			System.out.print(matp1[i][j]+" ");
            	}
            	System.out.println();;
            }
        	}else{
        		for(int i=n-1;i>=0;i--){
            	for(int j=n-1;j>=0;j--){
            			System.out.print(matp1[i][j]+" ");
            	}
            	System.out.println();;
            }
        	}
        }
        
        //to print the matrix

        in.close();
    }
}
