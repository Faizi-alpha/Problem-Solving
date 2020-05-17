import java.util.*;

// Tree Structure 

class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int x)
	{
		data = x;
	}
}



public class BFS_Tree {
	public static void main(String args[]) {
		Node root = new Node(10);
	    root.left = new Node(12);
	    root.right = new Node(14);
	    root.left.left = new Node(16);
	    root.left.right = new Node(20);
	    root.right.left = new Node(24);
	    root.right.right = new Node(30);
	    
	    // For BFS or Level Order traversal
	    // We have 3 methods 
	    // Method 1 : Calculate height of tree and run a while loop at print nodes at distance k each time with k varying from 1 to height
	    
	    int h = height(root);  // We get height
	    for(int i=0;i<h;i++)
	    {
	    	PrintK(root,i);  // Now we call PrintK to print each level of tree
	    }
	    
	    // Method 1 takes O(h*n) time complexity where h is height of tree and n is number of nodes in a tree
	    // 
	    
	    System.out.println();
	    // Method 2 is using a Queue Data structure
	    
	    QueueBFS(root);
	    
	    // Method 2 takes Theta(n) time and O(width of tree) space 
	    System.out.println();
	    
	    // When we are required to print Level of tree line by line in BFS manner
	       
	    BFS_LineByLine(root);
	    
	    
	    
	}
	
	// Method 1
	
	static int height(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		
		return Math.max(height(node.left), height(node.right))+1;
	}
	
	static void PrintK(Node node,int k)
	{
		if(node == null)
		{
			return;
		}
		if(k == 0)
		{
			System.out.print(node.data+" ");
		}
		PrintK(node.left,k-1);
		PrintK(node.right,k-1);
		
		
	}
	
	// Method 2
	static void QueueBFS(Node node)
	{
		
		if(node == null)
		{
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty())
		{
			Node current = q.poll();
			System.out.print(current.data+" ");  // We print the current node
			if(current.left!=null)
			{
				q.add(current.left);
			}
			if(current.right!=null)
			{
				q.add(current.right);
			}
		}
		
	}
	
	static void BFS_LineByLine(Node node)
	{
		if(node == null)
		{
			return;
		}
		Queue<Node> q1 = new LinkedList<Node>();
		q1.add(node);  // Constant work O(1) operation
		// We Use 2 loops now
		while(!q1.isEmpty())
		{
			int Qsize = q1.size();
			for(int i=0 ; i < Qsize ; i++)   // Remember dont directly use q1.size() inplace of Qsize because everytime size of queue is increasing
			{
				Node curr = (q1.poll());     // O(1) operation
				System.out.print(curr.data+" ");
				if(curr.left!=null)
					q1.add(curr.left);          // O(1) operation
				if(curr.right!=null)
					q1.add(curr.right);         // O(1) operation
				
			}
			System.out.println();  // we change line now when the whole level gets printed
		}
		// Time complexity of BFS_LineByLine is O(n) because entering in queue and coming out are O(1) operations therefore we did constant work for each node.
	    // Space complexity is O(width of tree) for level order traversals e.
	}

}
