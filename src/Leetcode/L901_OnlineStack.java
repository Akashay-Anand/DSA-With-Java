package Leetcode;
import java.util.*;
public class L901_OnlineStack {   
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(5);
        System.out.println(al.get(1));
        System.out.println(al.size()); 
    }
}

// corect code is also riten billow 

//// TLE on billow solution ; becouse of the stack we are traversing twice to maintain the elements ; which cost more time
class StockSpanner1 {
    Stack<Integer> stok;
    public StockSpanner1() {
        stok = new Stack<>();
    }
    public int next(int price) {
        int count = 1;
        if(stok.empty()){
            stok.push(price);
            return count;
        }
        Stack<Integer> temp = new Stack<>();
        temp.push(price);
        while(!stok.empty() && stok.peek() <= price){
            temp.push(stok.pop());
            count++;
        }
        while(!temp.empty()){
            stok.push(temp.pop());
        }
        return count;
    }
}

//// by implementing Doubly Linked list, we can prevent the 2nd itration ; and this code work without TLE ;
class StockSpanner2 {
    // Stack<Integer> stok;
    class LinkedList{
        int data =1000000; // defoult value more than condition for 1st node so that it wont compare this.
        LinkedList next = null;
        LinkedList prev = null;
        LinkedList(int x){ this.data = x; } // constructor
        LinkedList(){};
    }
    LinkedList stock;
    LinkedList itrate;
    public StockSpanner2() {
        // stok = new Stack<>();
        stock = new LinkedList();
        itrate = stock;
    }
    public int next(int price) {
        int count = 1;

        while(itrate.prev != null && itrate.data <= price){
            count++;
            itrate = itrate.prev;
        }
        stock.next = new LinkedList(price);
        stock.next.prev = stock;
        stock = stock.next;
        itrate = stock;

        return count;
    }
}

//// using ArrayList library for dynamic size array, and index traversal feature
class StockSpanner {
    ArrayList<Integer> al;
    public StockSpanner() {
        al = new ArrayList<>();
    }
    public int next(int price) {
        al.add(price);
        int count = 0;
        int i =  al.size() - 1;
        while(i>=0 && al.get(i)<=price){
            count++;
            i--;
        }
        return count;
    }
}

// Better sollution // using stack to store previous grater  // arraylist to store price // fastest
class StockSpanner3 {
    Stack<Integer> s ;
    ArrayList<Integer> al = new ArrayList<>();
    public StockSpanner3() {
        s = new Stack<>();
    }

    int i = 0;
    
    public int next(int price) {
        int count = 0;
        al.add(price);
        if(i==0){
            s.add(i);
            i += 1;
            count = i;
        }
        else{
            while(s.isEmpty()==false && al.get(s.peek())<=al.get(i)){
                s.pop();
            }
            count = s.isEmpty() ? i+1 : i-s.peek();
            s.push(i);
            i++;
        }
        return count;
    }
}