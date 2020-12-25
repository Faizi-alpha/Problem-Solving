// Bubble Sort is a sorting algorithm in which adjacent elements are swapped repeatedly
// Bubble Sort is an Stable Sorting Algorithm
// Performance:
// Time: Best = O(n) Worst and Average Case = O(n*n)
// Aux Space = O(1) (Inplace Sorting Algorithm)

import java.io.*;
import java.util.*;
public class BubbleSort {
  public static void main(String args[]) 
  {
	int arr[] = {4,3,8,10,2,11,0};
	bubble(arr);
	
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
  }

private static void bubble(int[] arr) {
	
	boolean flag = true; // flag is used to save some computations if remaining array is already sorted
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				flag = false;
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		if(flag == true) break;
		flag = true;
	}
	
   }  
}
