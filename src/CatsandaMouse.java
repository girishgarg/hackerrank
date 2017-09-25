import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CatsandaMouse {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int distca,distcb;
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            distca = z - x;
            distcb = z - y;
            
            if(distca<0){
            	distca = distca*-1;
            }
            if(distcb<0){
            	distcb = distcb*-1;
            }
            if(distcb>distca){
            	System.out.print("Cat A");
            }else if(distca>distcb){
            	System.out.print("Cat B");
            }else{
            	System.out.print("Mouse C");
            }
            System.out.println();
        }
       
    }
}

//365144