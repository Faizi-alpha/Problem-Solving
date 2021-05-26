class pair{
    
  int n1;
  int n2;

  public pair(int n1,int n2)
  {
    this.n1 = n1;
    this.n2 = n2;
  }

	public Integer getKey() 
    { 
        return n1; 
    } 
    
  public int getValue(){
    return n2;
  }
}


class sol
{
  public void printKClosest(int arr[],int n,int k,int x){
      
    PriorityQueue<pair> pq = new PriorityQueue<>(new Comparator<pair>()
    {
        public int compare(pair p1 , pair p2){
            return p1.get().compareTo(p2.getValue());          
        }
    });
    
    for(int i=0;i<k;i++)
    {
      pq.offer(new pair(arr[i],Math.abs(arr[i]-x)));
    }
    
    for(int i = k;i<n;i++)
    {
      int diff = Math.abs(arr[i]-x);
      if(p1.peek().getValue() > diff)
      {
        pq.poll();
        pq.offer(new pair(arr[i],diff));
      }
    }
    
    while(!pq.isEmpty())
    {
      System.out.print(pq.poll().getKey() + " ");
    }
    
  }
  
  
  public static void main (String[] args)
{
	int arr[] = { 10,30,5,40,38,80,70 };

	int size = arr.length;

	int x=35; int k = 3;

	printKClosest(arr,size,k,x);
}
  
}
