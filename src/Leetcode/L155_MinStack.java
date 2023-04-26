package Leetcode;
import java.util.*;

// Using LinkedList and Stack for this implementation
public class L155_MinStack {
    // int min = Integer.MAX_VALUE;
    Stack<Integer> mins = new Stack<>();
    class Node{
        int data;
        Node prev = null;
        Node(int x) {this.data = x;}
        Node(){}
    }
    Node head ;
    public L155_MinStack() {
        head = new Node(-1); // -1 means this node is not considered  
    }
    public void push(int val) {
        Node temp = new Node(val);
        temp.prev = head;
        head = temp;
        // min = val < min?val:min;
        if(mins.empty()) mins.push(val);
        else if(mins.peek() >= val) mins.push(val);
    }
    public void pop() {
        if(head.data == mins.peek())mins.pop();
        head = head.prev;   
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return mins.peek();
    }
    
}