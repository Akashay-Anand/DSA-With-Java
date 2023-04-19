public class J08_LinkedList_Insertion {
    
    static Node head; // global variable
    // Node Templet
    static class Node{
        int data; // store data of current node oject
        Node next; // store address of next node object
        // constructor 
        Node(int d){this.data = d; next = null;}
    }
    static void printN(Node hp){
        while(hp != null) {
            System.out.println(hp.data);
            hp = hp.next;
        }
    }
    // Inserting at the start of list
    static void in_start(Node pos, int data){
        Node newNode = new Node(data);
        newNode.next = pos;
        pos = newNode;
    }

    // insert at given position
    static void in_beetween(Node pos, int data){
        Node newNode = new Node(data);
        newNode.next = pos.next;
        pos.next = newNode;
    }
    // at end
    static void at_end(Node h, int data){
        Node newNode = new Node(data);
        while(h.next != null){
            h = h.next;
        }
        h.next = newNode;
    }

    public static void main(String[] args) {
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);

        // // print directly 
        // System.out.println(head.data);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
        // System.out.println(head.next.next.next.data + " hfb");

        // Insert in Linked List
        System.out.println("Insertion = ");
        in_start(head, 0);
        in_beetween(head.next.next.next, 9);
        at_end(head, 19);

        // itrate through loop
        printN(head);


        // Delete form Lnked list
        System.out.println("deletion = ");
        f_delete(head);
        printN(head);
        del_last(head);
        printN(head);
        
    }   
    static void f_delete(Node h){
        // h = h.next;
        head = head.next;
    } 
    static void del_last(Node h){
        if(h == null || h.next == null){
            // return null ; or do nothing
        }
        else{
            while(h.next.next != null )
        h = h.next;
            
            h.next = null;
        }

    }
}
