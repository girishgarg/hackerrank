import java.io.*;
import java.util.*;


public class RealEstateBroker {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	 Scanner in = new Scanner(System.in);
	 int a = in.nextInt();
	int b = in.nextInt();
	
	 long[] m = new long[b];
	 long[] mp = new long[b];
        long[] n = new long[a];
        long[] np = new long[a];
    long[] ps = new long[a];
   int msize=m.length;
    int nsize=n.length;
        int propercount = 0;
        for(int i=0;i<nsize;i++){
        	n[i]=in.nextInt();
        	np[i]=in.nextInt();
            ps[i]=0;
        }
        for(int i=0;i<msize;i++){
        	m[i]=in.nextInt();
        	mp[i]=in.nextInt();
        }
        
        for(int i=0;i<msize;i++){
        	int k=-1;
        	for(int j=0;j<nsize;j++){
        		if(m[i]>n[j]&&mp[i]<=np[j]){
        			ps[j]=np[j];
        			k=i;
        		}
        	}
        	if(k!=-1){
        	long max=-1;
        	int r=0;
        	for(int j=0;j<nsize;j++){
        		if(ps[j]!=0){
        		if(max<ps[j]){
        			max=ps[j];
        			r=j;
        		}
        		}
        	}
        	for(int j=r;j<nsize-1;j++){
        		n[j]=n[j+1];
        		np[j]=np[j+1];
        		
        	}
        	for(int i1=k;i1<msize-1;i1++){
        		m[i1]=m[i1+1];
        		mp[i1+1]=mp[i1+1];
        	}
        	propercount++;
        	nsize=nsize-1;
            msize=msize-1;
            i--;
            
        	}
        	
        }
System.out.println(propercount);
        }
	    }



//177231