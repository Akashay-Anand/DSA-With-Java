import static java.lang.System.exit;

public class J09_StackLL {
    public static void main(String[] args) {

        StackLL obj = new StackLL();

        obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);
        obj.pop();

        obj.print();

    }
}

class StackLL{
    private class Node{
        int val;
        Node next;
    }
    Node Top;
    int count = 0;
    StackLL(){this.Top = null;}

    public boolean isEmpty(){
        return(Top == null);
    }
    
    public void push(int data){
        Node temp = new Node();

        // Edge case (check wether new node is created or not ; is Heap full?)
        if(temp == null){
            System.out.println("\n Heap Overflow");
            return;
        }

        temp.val = data;
        temp.next = Top;
        Top = temp;
        count++;
    }

    public int pop(){
        if(Top == null){
            System.out.println("Underflow condition: stack is empty");
            return -1;
        }else{
            int temp = Top.val;
            Top = Top.next;
            count--;

            return temp;
        }
    }

    public int size(){
        return count;
    }

    public void print(){
        if (Top == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		}
		else {
			Node temp = Top;
			while (temp != null) {

				// print node data
				System.out.print(temp.val);

				// assign temp link to temp
				temp = temp.next;
				if(temp != null)
					System.out.print(" -> ");
			}
		}
    }


}