public class J08_Doubly_LL {

    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public static void printN(Node he){
        while (he != null) {
            System.out.println(he.data);
            he = he.next;
        }
    }
    
    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.prev = head;
        head.next.next = new Node(2);
        head.next.next.prev = head.next;

        // printN(head);
        head = pushS(head, -1);
        // printN(head);
        System.out.println("Reverese DLL");
        head = revDLL(head);
        printN(head);
        System.out.println("Delete Head Node = ");
        head = delethead(head);

        printN(head);

    }

    static Node pushS(Node he, int data){
        he.prev = new Node(data);
        he.prev.next = he;
        return he.prev;
    }

    static Node revDLL(Node he){
        Node temp = null;
        while (he.next != null) {   
            temp = he.next;
            he.next = he.prev;
            he.prev = he.next;
            he = temp;            
        }
        temp = he.next;
        he.next = he.prev;
        he.prev = he.next;
        return he;
    }

    static Node delethead(Node he){

        he = he.next;
        he.prev = null;
        return he;
    }
}
