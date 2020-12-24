	// Function to merge two Sorted Arrays
  // This function is used in MergeSort Algorithm
  
  public static void Merge(int[] arr, int l, int mid, int r) 
  {
		
		int size1 = mid-l+1;
		int size2 = r-mid;
		
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		
		for(int i=0;i<size1;i++)
		{
			arr1[i] = arr[i+l];   // i+l
		}
		
		for(int i=0;i<size2;i++)
		{
			arr2[i] = arr[mid+1+i];   // mid+i+1
		}
		
		int p1 = 0;  // pointer for first array
		int p2 = 0;  // pointer for second array
		int resInd = l;   // pointer l for the resultant array
    
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
		
    // If one of the arrays get filled up then we fill remaining in the resultant array
    
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

