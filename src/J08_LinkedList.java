public class J08_LinkedList {

    Node head; // head of the list
    static Node head2;

    // static so that main() can access it directly
    static class Node {
        int data;
        Node next;
        Node(int d){ data = d; next=null; }
    }
    public static void main(String[] args) {

        // creating basick Linked list
         J08_LinkedList list = new J08_LinkedList();  // class object
         list.head = new Node(1);  // head pointer
         Node second = new Node(2);  
         Node third = new Node(3);

        //  list,head
        list.head.next = second; // head next will point to the second node
        second.next = third;
        
        head2 = list.head;
        while(list.head != null){
            System.out.println(list.head.data);
            list.head = list.head.next;
        }

        while(head2 != null){
            System.out.println(head2.data);
            head2 = head2.next;
        }
    }
}

/*
 * 
 * 
 * 
 */