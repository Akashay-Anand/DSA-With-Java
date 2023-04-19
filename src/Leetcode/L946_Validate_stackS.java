package Leetcode;

import java.util.*;
/**
 * L946_Validate_stackS
 */
public class L946_Validate_stackS {

    // java solution
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk = new Stack<>();

        int pus = 0, pop = 0;

        while(pus != pushed.length && pop != popped.length){
            
            if(pushed[pus] != popped[pop]){
                stk.push(pushed[pus]);
                pus++;
            }else{
                pop++;
                // if(stk.empty()) return false;
                while(!stk.empty() && stk.peek() == popped[pop]){
                    stk.pop();
                    pop++;
                }
                pus++;
            }
            
        }
        return stk.empty();

    }
    
}