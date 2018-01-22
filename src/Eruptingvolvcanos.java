import java.util.Scanner;

public class Eruptingvolvcanos {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][n];
       // int d=1;
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		matrix[i][j]=0;
        	}
        }
        for(int a0 = 0; a0 < m; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int w = in.nextInt();
            // Write Your Code Here
           
            int r=w;
            int e=x;
            int k,s,count=1,c=1;
            s=r;
            int h=0;
            while(e>=0){
            	k=y;
            	while(k>=0){
            		//r--;
            		while(c>=1){
            			if(r>=0&&k>=0){
            			matrix[e][k]=matrix[e][k]+r;
            			}
            			k--;
            			c--;
            		}
            		if(h!=y){
                		r--;
                		}
            		if(r>=0&&k>=0){
            			matrix[e][k]=matrix[e][k]+r;
            			}
            		k--;
            	}
            	count++;
            	c=count;
            	if(c>=y+1){
            		c=y;
            		h=y;
            	}
            	r=s-1;
            	s--;
            	e--;
            }
            
            e=x+1;
            c=2;
            r=w-1;
            s=r;
            count=2;
             h=0;
            while(e<=n-1){
            	k=y;
            	while(k>=0){
            		
            		while(c>=1){
            			if(r>=0&&k>=0){
                			matrix[e][k]=matrix[e][k]+r;
                			}
            			k--;
            			c--;
            		}
            		if(h!=y){
            		r--;
            		}
            		if(r>=0&&k>=0){
            			matrix[e][k]=matrix[e][k]+r;
            			}
            		k--;
            	}
            	count++;
            	
            	c=count;
            	if(c>=y+1){
            		c=y;
            		h=y;
            	}
            	r=s-1;
            	s--;
            	e++;
            	}
            
            
            e=x;
            c=1;
            count=c;
            r=w-1;
            s=r;
            h=0;
            while(e>=0){
            k=y+1;
            while(k<n){
            	while(c>=1){
            		if(r>=0&&k<n){
            			matrix[e][k]=matrix[e][k]+r;
            			}
            		c--;
            		k++;
            	}
            	
            	if(h!=n-y-2){
            		r--;
            	}
            	if(r>=0&&k>=0){
        			matrix[e][k]=matrix[e][k]+r;
        			}
            	k++;
            }
            if(e==x){
            	r=s;
            	c=1;
            }else{
            r=s-1;
        	s--;
            count++;
        	c=count;
        	if(c>n-y-2){
        		c=n-y-2;
        		h=c;
        	}
            }
            e--;
            }
            
            e=x+1;
            c=1;
            r=w-1;
            s=r;
            count=c;
             h=0;
            while(e<=n-1){
            	k=y+1;
                while(k<n){
                	while(c>=1){
                		if(r>=0&&k<n){
                			matrix[e][k]=matrix[e][k]+r;
                			}
                		c--;
                		k++;
                	}
                	if(h!=n-y-2){
                		r--;
                	}
                	if(r>=0&&k>=0){
            			matrix[e][k]=matrix[e][k]+r;
            			}
                	k++;
                }
                r=s-1;
            	s--;
                count++;
            	c=count;
            	if(c>n-y-2){
            		c=n-y-2;
            		h=c;
            	}
            	e++;
            }
            
           
        }
        int max=0;
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        	if(max<matrix[i][j]){
        		max=matrix[i][j];
        	}
        	}	
        	}
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		System.out.print(matrix[i][j]);
        	}
        	System.out.println();
        }
        System.out.println(max);
        in.close();
    }
}
