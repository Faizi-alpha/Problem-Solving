// Hoare's Partition technique is another algorithm which is used in QuickSort Algorithm.

import java.io.*;
import java.util.*;
public class HoarePartition {
  public static void main(String args[]) 
  {
	  int arr[] = {5,3,8,4,2,7,1,10};
	  
	  hoares(arr,0,arr.length-1);
	  for(int i=0;i<arr.length;i++)
		  System.out.print(arr[i]+" ");
	  
	  // Output: 1 3 2 4 5 7 8 10 
  }

  // Hoare's Partition technique is more efficient than Lomuto Partition
  // Time and Space: O(n) and O(1) respectively
  // On Average, Hoare's Partition is three times faster than Lomuto partition
  
 public static void hoares(int[] arr, int l, int h) {
	
	 // Here we assume pivot to be first element of the array
	 
	 int pivot = arr[l];
	 int left = l;
	 int right = h;
	 
	 while(true)
	 {
		 while(arr[left]<pivot)
			 left++;
		 while(arr[right]>pivot)
			 right--;
		 
		 if(left>=right) break;
		 
		 // swap arr[left] and arr[right]
		 int temp = arr[left];
		 arr[left] = arr[right];
		 arr[right] = temp;
	 }

  }
  
}
