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

class MinHeapify
{
  void min(int i)
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
    
    min(smallest);
    
  }
 }
}
