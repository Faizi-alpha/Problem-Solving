// For comparing objects where you comparable in Java , where we have compareTo function.

// Here we implement comparable on PriorityQueue

// Our Priority Queue is :- PriorityQueue<Triplet> pq = new PriorityQueue<Triplet>();

class Triplet implements Comparable<Triplet>
{
    // Below are our objects
    int val; // value
    int ar_pos; // position of array, i.e which array out of k
    int val_pos; // position of value/array element in array
    
    Triplet(int val,int ar_pos,int val_pos)  // constructor
    {
        this.val = val;
        this.ar_pos = ar_pos;
        this.val_pos = val_pos;
    }
     // function for comparing objects
     public int compareTo(Triplet t)
     {
       if(this.val <= t.val) return -1;  // out of 3 objects we are comparing on basis of val
        else return 1;
     }
    
}
