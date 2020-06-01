class Tree
{ 
    Node head ;  //global node for head of linkedlist
    Node prev ;  // global node for prev of linkedlist (which will be last node of linkedlist when list formation is over by convertToDLL)
    Node bTreeToClist(Node root)
    {
        //your code here
        convertToDLL(root);  
        head.left = prev;  // make head point to last node.
        prev.right = head;  // make last node point to head.
        return head;
    }
    
     //Code to convert tree to DLL
    void convertToDLL(Node root)
    {
        if(root == null) return;
        
        convertToDLL(root.left);
        if(prev == null)
        {
            head = root;
        }
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convertToDLL(root.right);
    }
    
}
