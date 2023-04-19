// import java.util.ArrayList;

public class Atest {
    static Atest obj = new Atest();
    /**
     * InnerAtest
     */
    public static class Node {
        int data;
        Node next;
        Node(int d){ data = d; next = null;}
        Node(){next = null;}
    }
    public static void main(String[] args) {
        

        Node list1 = new Node(2);
        list1.next = new Node(4);
        list1.next.next = new Node(3);
        
        Node list2 = new Node(5);
        list2.next = new Node(6);
        list2.next.next = new Node(4);

        Node ans = obj.AddNum(list1, list2);
        obj.printNode(ans);
    }
    
    public void printNode(Node list){
        while(list != null) {
            System.out.println(list.data);
            list = list.next;
        }
    }
    // reverse node
    public Node ReverseNode(Node list ){
        Node prev = list;
        Node nx = list.next;
        list.next = null;
        list = nx;
        while(list != null){
            nx = list.next;
            list.next = prev;
            prev = list;
            list = nx;
        }
        return prev;
    }

    // solution
    public Node AddNum(Node list1, Node list2){
        Node ans = new Node();
        // Node head = ans;
        list1 = obj.ReverseNode(list1);
        list2 = obj.ReverseNode(list2);
        int carry = 0;

        while(list1 != null || list2 != null || carry != 0){
            if(list1 != null){
                carry += list1.data;
                list1 = list1.next;
            }if(list2 != null){
                carry += list2.data;
                list2 = list2.next;
            }
            ans.data = carry%10;
            Node newNode = new Node();
            newNode.next = ans;
            ans = newNode;            

            carry = carry/10;
        }
    
        return ans.next;
    }

    
}

