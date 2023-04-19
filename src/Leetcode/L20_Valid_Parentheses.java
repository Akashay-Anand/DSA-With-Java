package Leetcode;
import java.util.*;
public class L20_Valid_Parentheses {
    
// Solution 1; using Stack class 
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char ch = '0';
        for(int i=0; i< s.length();i++){
            ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[' ) stk.push(ch);
            else{
                if(stk.empty()) return false;
                if(ch - stk.peek() > -3 && ch - stk.peek() < 3) stk.pop();
                else return false;
            }
        }
        return stk.empty();
    }

// Brute Force approach using arrays 
    public boolean isValid_2(String s) {
    int[] arr = new int[s.length()];  // () == 1, -1 ; [] == 2, -2; {} == 3, -3;
    int count = 1 ;
    arr[0] = (s.charAt(0) == '(' )?1:(s.charAt(0) == '[')?2:3;
    for(int i=1;i<s.length();i++){
        if (count != 0){
            if(s.charAt(i) == '(' || s.charAt(i) == ')'){
                if(s.charAt(i) == ')'){
                    if(arr[count-1] == 1){
                        arr[count - 1] = 0;
                        count--;
                    }else {
                        // arr[count] == -1
                        return false;
                    }
                }else{
                    arr[count] = 1;
                    count++;
                }
            }
            else if(s.charAt(i) == '[' || s.charAt(i) == ']'){
                if(s.charAt(i) == ']'){
                    if(arr[count-1] == 2){
                        arr[count - 1] = 0;
                        count--;
                    }else {
                        // arr[count] == -1
                        return false;
                    }
                }else{
                    arr[count] = 2;
                    count++;
                }

            }
            else if(s.charAt(i) == '{' || s.charAt(i) == '}'){
                if(s.charAt(i) == '}'){
                    if(arr[count-1] == 3){
                        arr[count - 1] = 0;
                        count--;
                    }else {
                        // arr[count] == -1
                        return false;
                    }
                }else{
                    arr[count] = 3;
                    count++;
                }
            }
        }else {
            arr[count] = (s.charAt(i) == '(' )?1:(s.charAt(i) == '[')?2:3;
            count++;
        }
    }
    return (arr[0] == 0)?true:false;
    }
}
