// This program is for inserting an item in Binary Heap.
// In memory, Heaps are represented as an array.

Class MinheapClass
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

// We are maintaing a Min heap here , however Max Heap is also similar
class Insert_MinHeap
{
void Insert(int x)
{
 if(size == cap) return;
 size++;
 arr[size-1] = x;
 for(int i = size-1;i>=0 && arr[parent(i)] > arr[i])
 {
    // swap using xor
    arr[parent(i)]^=arr[i];
    arr[i]^=arr[parent(i)];
    arr[parent(i)]^=arr[i];
    i = parent(i);
 }
}
}
