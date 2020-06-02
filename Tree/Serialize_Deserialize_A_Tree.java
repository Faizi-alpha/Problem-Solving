class Tree {
	public void serialize(Node root, ArrayList<Integer> A) {
	    
	    
	    if(root == null) 
	    {
	        // Adding -1 would indicate a null or simply that node has no childrens.
	        A.add(-1);
	        return;
	    }
	    
	    // Store in Preorder Fashion
	    
	    A.add(root.data);
	    serialize(root.left , A);
	    serialize(root.right , A);
	    
	}
	  int index = 0;
    // More focus to pay on Deserialize function
    public Node deSerialize(ArrayList<Integer> A){
        
        if(index == A.size()) return null;
        
        int getVal = A.get(index);
        index++;
        if(getVal == -1) return null;
        Node curr = new Node(getVal);
        curr.left = deSerialize(A);
        curr.right = deSerialize(A);
        
        return curr;
        
    }
}
