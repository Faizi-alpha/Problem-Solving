/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/
class Index   // Manually Implented class to get pass by refrence
{ 
    int index;
}
// Function should construct tree and return
// root of it.  in[] stores inorder traversal
// post[] stores postorder traversal.  n is
// size of these arrays
class GfG {
    // Complete the function
   
    Node buildTree(int in[], int post[], int n) {
        // Your code here
        if(n < 0) return null;
        if( n == 1) return new Node(post[0]);
        
       Index pIndex = new Index();  // implenting index to make it work as pass by refrence
        pIndex.index = n-1;            // have a look at how its written
        
        return actual(in,post,0,n-1,pIndex);
        
    }
    
     Node actual(int in[] , int post[] , int st,int end , Index pIndex )  // see how index is passed here
    {
        if(st > end) return null;
        
        Node root = new Node(post[pIndex.index]);
        (pIndex.index)--; // see .var name is important
        
        
        int i;
        for(i = st;i<=end;i++)
        {
            if(in[i] == root.data)
            {
                break;
            }
        }
        
        root.right = actual(in,post,i+1,end,pIndex);
        root.left = actual(in,post,st,i-1,pIndex);
        return root;
    }
    
}
