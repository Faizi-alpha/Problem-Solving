// QuickSort Algorithm is another Divide and Conquer Algorithm
// Performance: 
// Best Case Time = O(nlogn)
// Average Case: O(nlogn)
// Worst Case : O(n*n)

// Aux Space : Worst Case: O(n) and Best Case: O(logn)

import java.io.*;
import java.util.*;
public class quickSort {
  public static void main(String args[]) 
  {
	  int arr[] = {5,3,8,4,2,7,1,10};
	  
	 QuickSort(arr,0,arr.length-1);
	  for(int i=0;i<arr.length;i++)
		  System.out.print(arr[i]+" ");
	  
	  
  }

private static void QuickSort(int[] arr, int i, int j) {
	
	if(i<j)
	{
		int p = Partition(arr,i,j); 
		
		// if we are using hoare's partition then QuickSort(arr,l,p)
		// If we are using lomuto partition then QuickSort(arr,l,p-1)
	
		QuickSort(arr,l,p);  // Here we considered Hoare's partition technique therefore till p. 
		QuickSort(arr,p+1,j);
	
    }

  }

private static int Partition(int[] arr, int i, int j) {
	
	// Use any lomuto or Hoare's Partition technique
	
	return 0;
}

  
  
}
