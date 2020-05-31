
class Tree
{

// This soln works only if n1 and n2 both are present or none of them is present.
// So we assume the above 

	Node lca(Node root, int n1,int n2)
	{
		
		if(root == null) return null;
		//Case:1
		if(root.data == n1 || root.data == n2) return root;
		
		// Call for left and right subtree
		Node lca1 = lca(root.left,n1,n2);
		Node lca2 = lca(root.right,n1,n2);
		
		// Case:2 where left and right subtrees have n1 and n2 which means this is our lca
		
		if(lca1 != null && lca2 != null) return root;
		
		// Case:3 
		if(lca1 != null) 
		{
		return lca1;
		}
		// Case:4
		else
		{
		    return lca2;
		}
	}
}
