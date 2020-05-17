
//Implementing Tree Data Structure

import java.util.*;
import java.lang.Math;

class Node
{
/* Tree structure is like	
	  root
	  left child of root
	  right child of root
	   and then their subsequent childrens.
	
	*/
	int key;
	Node left;
	Node right;
	
	Node(int x)
	{
		key = x;
	}
	
}
// Tree structure code / class code ends

public class BinaryTree {
	public static void main(String args[]) {
		Node root = new Node(10);
	    root.left = new Node(12);
	    root.right = new Node(14);
	    root.left.left = new Node(16);
	    root.left.right = new Node(20);
	    root.right.left = new Node(24);
	    root.right.right = new Node(30);
	    // We have created a tree above
	    
	    // now lets look at tree traversal
	    
	    // BFS brute force approach where we first calculate height of tree and then print each level of tree
	    
	   int hgt = height(root);
	   for(int i = 0;i<hgt;i++)
	   {
		   level(root,i);
      /* Add  "System.out.println();" if you want to print level order line by line
		     like this :- 
		     10 
          12 14 
          16 20 24 30 
		   */
	   }
	   // BFS Brute force code end
	   
	   System.out.println();
	   
	   // Efficient BFS using queue
	   lQ(root); 
		
	}
	
	public static void print(Node node)
	{
		if(node!=null)
		{ // PostOrder
			print(node.left);
			print(node.right);
			System.out.println(node.key+" ");
			
		}
		
	}
	
	static int c = 0;
	static int c1 = 0;
	
	// Size of binary tree
	public static int Size(Node node)
	{
		
		
	   if(node!=null)
		{   
		   
			
			c = c+1;
			Size(node.left);
			Size(node.right);

		}
		
		return c;
	}
	// Max Element in Binary Tree
	public static int MaxElement(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		
		c1 = Math.max(node.key,Math.max(MaxElement(node.left),MaxElement(node.right)));
		return c1;
		
	}
	// Print Nodes at distance k from root
	public static void PrintK(Node node,int k)
	{
		
		if(node == null)
		{
			return;
		}
		
		if(k == 0)
		{
			System.out.print(node.key+" ");			
		}
		
		PrintK(node.left,k-1);
		PrintK(node.right,k-1);
		
		
		
	}
	// Height of a Binary Tree
	public static int height(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		
		return Math.max(height(node.left), height(node.right))+1;
	}
	
	
	

	// Level Order Traversal OR BFS 
	// this is a approach of O(h*n) where h is height of binary tree and n is no of nodes
	public static void level(Node node,int h)
	{
		if(node == null)
		{
			return;
		}
		
		if(h==0)
		{
		System.out.print(node.key+" ");
		}
		
		level(node.left,h-1);
		level(node.right,h-1);
		
		
	}
	
	// Efficient Level Order traversal using Queue
	// O(n) with O(n) Space but specifically time will be Theta (n)
	
	public static void lQ(Node node)
	{
		
		if(node == null)
		{
		    return;
		}
		Queue <Node> q= new LinkedList<>();
		q.add(node);
		while(!q.isEmpty())
		{
			Node curr = q.poll();
			System.out.print(curr.key+" ");
			if(curr.left != null)
			{
				q.add(curr.left);
			}
			if(curr.right!=null)
			{
				q.add(curr.right);
			}
				
		}
		
		
		
	}
	
	
	

}

