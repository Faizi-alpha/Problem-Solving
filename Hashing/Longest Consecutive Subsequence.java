// Problem link :- https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1/?track=SPCF-Hashing&batchId=189
// Company Tag : - Amazon, Walmart


// Function to find Longest Consecutive Subsequence
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   // add your code here
	   HashSet<Integer> hm = new HashSet<Integer> ();
	   for(int i=0;i<n;i++)
	   {
	       hm.add(arr[i]);
	   }
	   
	   
	   int res =1;
	   for(int i=0;i<n;i++)
	   {
	       if(!hm.contains(arr[i]-1))
	       {   int count =1;
	           while(hm.contains(arr[i]+count))
	                count++;
	        res = Math.max(res,count);
	       }
	   }
	   
	   return res;
	   
	   
	   
	}
