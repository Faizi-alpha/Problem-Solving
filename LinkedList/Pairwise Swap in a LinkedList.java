// Problem Link :-https://practice.geeksforgeeks.org/problems/pairwise-swap-of-nodes-in-linkelist/1/?track=PC-W5-LL&batchId=189


// Function for the problems


 public static Node pairwise_swap(Node node)
    {
        // your code here
        
        // This is just for swapping the first two nodes of linkedlist
        Node n1 = node.next.next;
        Node prev = node;
        node = node.next;
        node.next = prev;
        
        // Now we swap the remaining of linkedlist
        while(n1!=null && n1.next!=null)
        {
            prev.next = n1.next;https://practice.geeksforgeeks.org/problems/pairwise-swap-of-nodes-in-linkelist/1/?track=PC-W5-LL&batchId=189
            prev = n1;

           
            Node nxt = n1.next.next;
            n1.next.next = prev;
            n1 = nxt;
            
        }
        
        prev.next = n1;
        
        return node;
        
    }