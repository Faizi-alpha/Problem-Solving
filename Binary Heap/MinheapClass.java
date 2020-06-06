/* We need
1. An array for storing heap elements
2. size variable (integer)
3. capacity variable (integer)
*/
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
   
   int left(int i)    // this is helpful in getting left of root using array index
   {
     return (2*i+1);
   }
   
   int right(int i)  // this is helpful in getting right of root using array index
   {
    return (2*i+2);
   }
   
   int parent(int i)  // similarly, for parent
   {
     return Math.floor((i-1)/2);
   }
   
   
}
