import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class BigSorting {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] unsorted = new String[n];
	        BigInteger[] series = new BigInteger[n];
	        Long[] result = new Long[n];
	        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	            unsorted[unsorted_i] = in.next();
	            BigInteger number = new BigInteger(unsorted[unsorted_i]);
	            series[unsorted_i] = number;
	            }
	        
	        
	        
	        
	        BigSorting ob = new BigSorting();
	        ob.sort(series, 0, n-1);
	        
	        // your code goes here
	        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	        System.out.println(series[unsorted_i]);
	        }
	}
	 
	 int partition(BigInteger[] series, int low, int high)
	    {
	        BigInteger pivot = series[high]; 
	        int i = (low-1); // index of smaller element
	        for (int j=low; j<high; j++)
	        {
	            // If current element is smaller than or
	            // equal to pivot
	            if (series[j].compareTo(pivot) <=0)
	            {
	                i++;
	 
	                // swap arr[i] and arr[j]
	                BigInteger temp = series[i];
	                series[i] = series[j];
	                series[j] = temp;
	            }
	        }
	 
	        // swap arr[i+1] and arr[high] (or pivot)
	        BigInteger temp = series[i+1];
	        series[i+1] = series[high];
	        series[high] = temp;
	 
	        return i+1;
	    }
	 
	 
	    /* The main function that implements QuickSort()
	      arr[] --> Array to be sorted,
	      low  --> Starting index,
	      high  --> Ending index */
	    void sort(BigInteger[] series, int low, int high)
	    {
	        if (low < high)
	        {
	            /* pi is partitioning index, arr[pi] is 
	              now at right place */
	            int pi = partition(series, low, high);
	 
	            // Recursively sort elements before
	            // partition and after partition
	            sort(series, low, pi-1);
	            sort(series, pi+1, high);
	        }
	    } 
}


/*
 * 
 * 
  #include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
// Use of comparator
//comparing function only sorts if string size is equal and keeps the larger integgers at last.
bool myfunction (string i,string j) 
{ 
    int n=i.length();
    int m=j.length();
    if(n==m)
        return (i<j);
    
    return n<m;   
}


int main() {
    int n;
    cin>>n;
    vector <string> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    
    
    sort(arr.begin(),arr.end(),myfunction);
    
    for(int i=0;i<n;i++)
        cout<<arr[i]<<endl;
    
    return 0;
}
 * 
 * 
 * */

//161578
