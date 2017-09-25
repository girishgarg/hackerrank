import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesignerPDFViewer {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int width = word.length();
        
        char[] ch = word.toCharArray();
        int[] ascii = new int[26];
        int[] asciif = new int[26];
        int[] word1 = new int[10]; 
        for(int i=0;i<word.length();i++){
        ascii[i] = (int) ch[i];
        asciif[i] = ascii[i]-97;
        word1[i] = h[asciif[i]];
        }
        Arrays.sort(word1);
        int max = word1[word1.length-1];
        int area = width*max;
        System.out.println(area);
    }
}

//286389
