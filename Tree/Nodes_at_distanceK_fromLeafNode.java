// Count DISTINCT Node from a leaf node which is at a distance k.
// problem link :- https://practice.geeksforgeeks.org/problems/node-at-distance/1
//(Must Do)

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution{
    int c;
    int printKDistantfromLeaf(Node root, int k)
    {
        // Write your code here
        if(root == null) return 0;
        c=0;
        boolean visited[] = new boolean[1000];
        int path[] = new int[1000];
        helper(root,k, 0 , path , visited);
        return c;
        
    }
    void helper(Node root , int k , int index , int path[] , boolean visited[])
    {
        
        if(root == null) return;
        
        path[index] = root.data;
        visited[index++] = false;
        
        if(root.left == null && root.right == null && index-k-1 >=0 && visited[index-k-1] == false)
        {
            c++;
            visited[index - k - 1] = true; //this will mark true that node which is counted i.e, node which is at a distance k from leaf node
            return;
        }
        helper(root.left , k , index , path , visited);
        helper(root.right , k , index , path, visited);
    }
    

}
