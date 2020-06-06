// Heap class

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
   int left(int i)
   {
      return (2*i+1);
   }
   int right(int i)
   {
   return (2*i+2);
   }
   
   int parent(int i) 
   {
     return Math.floor((i-1)/2);
   }
}

class decreaseKey()
{
  void decrease(int arr[] ,int i,int x)
  {
    arr[i] = x;  // replaced x at index i
    // Now since it would have violated the min heap property therefore we heapify
    
    while(i!=0 && arr[parent(i)] > arr[i])
    {
      // swap arr[parent(i)] and arr[i];
      arr[parent(i)]^ = arr[i];
      arr[i]^=arr[parent(i)];
      arr[parent(i)]^ = arr[i];
      
      i=parent(i);
      
    }
  
  }
 }
