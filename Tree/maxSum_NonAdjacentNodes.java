// Difficulty :- Hard

// Problem link :- https://practice.geeksforgeeks.org/problems/maximum-sum-of-non-adjacent-nodes/

class Pair
{
    int included; //sum included
    int excluded; // sum excluded
    Pair(int included , int excluded)
    {
        this.included = included;
        this.excluded = excluded;
    }
    
}
class GFG
{
    static int getMaxSum(Node root)
    {
        // add your code here
        Pair p = helper(root);
        return Math.max(p.included , p.excluded);
        
    }
    
    static Pair helper(Node root)
    {
        if(root == null)
        {
            Pair curr = new Pair(0,0);
            return curr;
        }
        
        Pair l = helper(root.left);
        Pair r = helper(root.right);
        
        Pair sum = new Pair(0,0);
        
        // in this root itself is included and left and right children are not included
        sum.included = l.excluded + r.excluded + root.data;
         // in this root in excluded
         sum.excluded = Math.max(l.included , l.excluded) + Math.max(r.included , r.excluded);
         
         return sum;
         
        
    }
    
}
