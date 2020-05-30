//User function Template for Java

/*class Node
{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/

// CODE STARTS FROM HERE

// Below is a Method of Level Order Traversal

// Make a Pair Class

class Pair
{
    int level;
    Node node;
    Pair(int level, Node node)
    {
        this.level = level;
        this.node = node;
    }
    
    int getLevel()
    {
        return this.level;
    }
    Node getNode()
    {
        return this.node;
    }
}


class BinaryTree
{
    static void verticalOrder(Node root)
    {
        if(root == null) return;
        
       Map<Integer,List<Integer>> m = new TreeMap<>();  // We take map in which level and list of nodes of that level are stored
	    Queue<Pair> q = new LinkedList<>();        // We use Pair to map level and respective nodes
	    q.add(new Pair(0,root));
	    while(!q.isEmpty())
	    {
	    	int qs = q.size();
	    	while(qs-->0)
	    	{
	    		Pair p = q.poll();     // We take out pair
	    		Node node = p.getNode();   // Node of that pair 
	    		int level = p.getLevel();  // level 
	    		
	    		if(m.containsKey(level))    // If map m already contains a particular level, means which have already visited the particular level
	    		{
	    			m.get(level).add(node.data);   // then add node.data to already mapped list to that particular level
	    		}
	    		else
	    		{
	    			List<Integer> l = new LinkedList<Integer>();   // Else create a list
	    			l.add(node.data);   // add node.data
	    			m.put(level,l);     // PUT Back in map
	    		}
	    		
	    		if(node.left!=null)
	    		{
	    				q.add(new Pair(level-1,node.left));    // level-1 for left side of node
	    		}
	    		if(node.right!=null)
	    		{
	    			q.add(new Pair(level+1,node.right));     // level+1 for right side of node
	    		}
	    	}
	    }
	    
	    for(Map.Entry i:m.entrySet())          // We print here
	    {
	        List list = (List)i.getValue();    // for all elements of a particular level , we get its elements in a list (casting list is important) i.e, (List)i.getValue(); 
	        for(int k= 0;k < list.size();k++)
	        {
	        	System.out.print(list.get(k)+" ");
	        }
	    }
    }
}
