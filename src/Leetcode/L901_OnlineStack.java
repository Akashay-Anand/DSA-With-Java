package Leetcode;
import java.util.*;
public class L901_OnlineStack {
    
}





// TLE on billow solution
class StockSpanner {
    Stack<Integer> stok;
    public StockSpanner() {
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
