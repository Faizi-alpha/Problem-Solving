//Problem Link :- https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
// Company Tag:- Amazon,MakemyTrip

// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub {

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends
class GfG {

   // Main Logic is within this function
    int maxLen(int arr[], int n) {
        // Your code here
    // 15 -2 2 -8 1 7 10 23
    int curr_sum = 0;
    int res =0;
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    for(int i=0;i<n;i++)
    {
        curr_sum = curr_sum+arr[i];
        
        
        if(arr[i] == 0 && res == 0)
            res = 0;
        
        
        if(curr_sum == 0)
             res = i+1;
        
        if(hm.containsKey(curr_sum))
        {
            res = Math.max(res,i-hm.get(curr_sum));
        }
        
        
        if(!hm.containsKey(curr_sum))
        {
            hm.put(curr_sum,i);
        }
        
        
    }
    return res;
    
}
}
