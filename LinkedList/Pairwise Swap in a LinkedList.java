// Problem Link :-https://practice.geeksforgeeks.org/problems/pairwise-swap-of-nodes-in-linkelist/1/?track=PC-W5-LL&batchId=189


// Function for the problem


 public static Node pairwise_swap(Node node)
    {
        
        // This is just for swapping the first two nodes of linkedlist
        Node n1 = node.next.next;
        Node prev = node;
        node = node.next;
        node.next = prev;
        
        // Now we swap the remaining of linkedlist
        while(n1!=null && n1.next!=null)
        {
            prev.next = n1.next;
            prev = n1;
            Node nxt = n1.next.next;  // New node so that we dont loose the next node which right after the element whose refrence we are changing.
            n1.next.next = prev;
            n1 = nxt;
            
        }
        
        prev.next = n1;
        
        return node;
        
    }
