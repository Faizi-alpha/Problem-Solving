class MinheapClass
{ 
   int arr[];
   int size;
   int cap;
   
   MinheapClass(int c)
   {
    arr = new int[c];
    size = 0;
    capacity = c;
   }
   int parent(int i) 
   {
     return Math.floor((i-1)/2);
   }
}

// Extract Min is an operation in which the node having minimum element is extracted (removed) from heap.
// Again, we have a Min Heap .

class extractMin
{
  int Extract()
  {
    if(size == 0) return Integer.MAX_VALUE;
    if(size == 1)
    {
       size--;
       return arr[0];
    }
    
    // swap root with last most node in the heap and decrease the size .
    
    arr[0] = arr[size-1];
    size--;
    
    // Call MinHeapify
    MinHeapify();
    return arr[size];
    
  }
  
  void MinHeapify(int i)
  {
  int l = left(i);
  int r = right(i);
  int smallest = i;
  
  if(l < size && arr[l] < arr[i])  smallest = i;
  if(r < size && arr[r] < arr[i]) smallest =i;
  
  if(smallest!=i)
  { 
    //swap
    int temp = arr[smallest];
    arr[smallest]=arr[i];
    arr[i] = temp;
    
    MinHeapify(smallest);
    
  }
 }
 }
  
