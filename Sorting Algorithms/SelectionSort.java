// Selection Sort is a Sorting Algorithm in which we can either choose to put greater elements or smaller elements to their correct positions.
// Time Complexity in all cases : O(n*n)
// Auxiliary Space: O(1)
// Inplace and Stable Sorting Algorithm

// This algorithm is used for sorting files with large values and small keys.
// This algorithm is useful when memory writes are costly.



import java.io.*;
import java.util.*;
public class SelectionSort {
  public static void main(String args[]) 
  {
	int arr[] = {4,3,8,10,2,11,0};
	Selection(arr);
	
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
  }

private static void Selection(int[] arr) {
	
	
	for(int i=0;i<arr.length-1;i++)
	{
		int min = arr[i];
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j] < min)
				min = j;
		}
		
		// Put minimum element to its correct position
		int temp = arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
	}
	
   }  
}
