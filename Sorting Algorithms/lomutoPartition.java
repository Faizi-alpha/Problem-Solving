// Lomuto Partition is an partitioning technique used in QuickSort Algorithm

import java.io.*;
import java.util.*;
public class lomutoPartition {
  public static void main(String args[]) 
  {
	  int arr[] = {4,2,9,8,5,6,7};
	  LomutoPartition(arr,0,arr.length-1);
	  
	  for(int i=0;i<arr.length;i++)
		  System.out.print(arr[i]+" ");
      
      // Output : 4 2 5 6 7 8 9 
      // All elements smaller than 7 are on left of it and greater one's are on right side
  }
  
  // Lomuto Partition is a unstable partitioning technique
  // Here we assume the pivot to be last element
  // Time Complexity: O(n)
  // Aux Space: O(1)
  
  public static void LomutoPartition(int arr[],int l,int h)
  {
	  int pivot = arr[h];
	  int i = l-1;
	  for(int j=l;j<arr.length-1;j++)
	  {
		  if(arr[j] < pivot)
		  {
			  i++;
			  int temp = arr[j];
			  arr[j] = arr[i];
			  arr[i] = temp;
		  }
	  }
	  int t = arr[i+1];
	  arr[i+1] = arr[h];
	  arr[h] = t;
  }

}
