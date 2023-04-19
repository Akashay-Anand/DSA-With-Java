public class J09_StackArray {
    public static void main(String[] args) {
        StackA stk = new StackA();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		System.out.println(stk.pop() + " Popped from stack");
		// System.out.println("Top element is :" + s.peek());
		System.out.print("Elements present in stack :");
		stk.print();
    }
}

class StackA {
    static final int max = 1000; // max size of stack
    int top ;
    int arr[] = new int[max];
    
    boolean isEmpty(){
        return (top < 0);
    }
    int size(){
        return top+1;
    }
    StackA(){
        top = -1;
    }
    boolean push(int data){
        if (top >= (max - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			arr[++top] = data;
			System.out.println(data + " pushed into stack");
			return true;
		}
    }
    int pop(){
        if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int data = arr[top--];
			return data;
		}
    }
    void print(){
        for(int i = top;i>-1;i--){
        System.out.print(" "+ arr[i]);
        }
    }
}
