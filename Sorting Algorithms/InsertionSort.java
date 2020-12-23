// In Insertion Sort, We assume the first element to be already sorted.
// We compare elements with the previous ones and insert each element at their proper position in array

import java.io.*;
import java.util.*;
public class InsertionSort {
	public static void main(String args[])
	{
	
		// Taking Input
		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = s.nextInt();
		}
		
		// Insertion Sort Algo
    
		for(int i=1;i<size;i++)
		{
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		
	}
}

