	
	// Target Sum
  // Problem Link : https://www.youtube.com/watch?v=zNxDJJW40_k&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=48
  
import java.io.*;
import java.util.*;


class TargetSum{
	public static void main(String args[]) throws IOException {
		
//	    Use this for user input.
//	    Scanner sc = new Scanner(System.in);

		int arr[] = {10,2,1,5,4,25,9,12,8};
		targetSum(arr,0,"",0,9);
		
	}
  
  // sos is sum of subset
  // set is subset
  // idx is index
  // tar is target

	public static void targetSum(int[] arr, int idx, String set, int sos, int tar)
	{
		if(sos == tar)
		{
			System.out.println(set);
			return;
		}
		
		if(idx == arr.length || sos > tar)
			return;
		
		
		String curr = String.valueOf(arr[idx]);
		targetSum(arr,idx+1,set+" "+curr,sos+arr[idx],tar);
		targetSum(arr,idx+1,set,sos,tar);
	}
}
