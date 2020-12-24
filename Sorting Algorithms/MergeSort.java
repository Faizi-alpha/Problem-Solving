// MergeSort Algorithm
// Performance:
// Time Complexity: Best,Average,Worst : O(nlogn)
// Aux Space: O(n)

import java.io.*;
import java.util.*;
public class hello_World {
	public static void main(String args[])
	{
		int arr[] = {5,3,10,1,4,7,0};
		
		MergeSort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
  
  // MergeSort
  
	public static void MergeSort(int arr[],int l,int r)
	{
		if(l<r)
		{
			int mid = l+(r-l)/2;
			MergeSort(arr,l,mid);
			MergeSort(arr,mid+1,r);
			
			Merge(arr,l,mid,r);
			
		}
	}

  // Merge Two Sorted Arrays function
  
	public static void Merge(int[] arr, int l, int mid, int r) {
		
		int size1 = mid-l+1;
		int size2 = r-mid;
		
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		
		for(int i=0;i<size1;i++)
		{
			arr1[i] = arr[i+l];
		}
		
		for(int i=0;i<size2;i++)
		{
			arr2[i] = arr[mid+1+i];
		}
		
		int p1 = 0;
		int p2 = 0;
		int resInd = l;
		while(p1 <size1 && p2 < size2)
		{
			if(arr1[p1] >= arr2[p2])
			{
			   arr[resInd] = arr2[p2];
			   p2++;
			}
			else
			{
				arr[resInd] = arr1[p1];
				p1++;
			}
			resInd++;
		}
		
		while(p1<size1)
		{
			arr[resInd] = arr1[p1];
			p1++;
			resInd++;
		}
		
		while(p2<size2)
		{
			arr[resInd] = arr2[p2];
			p2++;
			resInd++;
		}
		
		
	}
		
}
