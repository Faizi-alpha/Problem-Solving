// Problem link : - https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k/0
// Company Tag : Amazon

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[]) 
    {
      Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        GFG obj = new GFG();
        
        
        while(T-->0)
        {
            int n = s.nextInt();
            int arr[] = new int[n];
            int k = s.nextInt();
            for(int j=0;j<n;j++)
            {
                arr[j] = s.nextInt();
            }
            
            
            System.out.println(obj.CountOfSub(arr,n,k));
            
        }
        
        
    }
    
    // Solution from video lectures
    
    public static int CountOfSub(int arr[],int n,int sum)
    {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        int res = 0;
        int prefix_sum = 0;
        for(int i=0;i<n;i++)
        {
            prefix_sum = prefix_sum+arr[i];
            
            if(prefix_sum == sum)
                 res = i+1;
            if(hm.containsKey(prefix_sum-sum))
            {
                res = Math.max(res,i-(hm.get(prefix_sum-sum)));
            }
            
            if(!hm.containsKey(prefix_sum))
            {
                hm.put(prefix_sum,i);
            }
        }
        
        
        return res;
    }
    
    
}
