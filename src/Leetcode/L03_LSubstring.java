package Leetcode;
import java.util.*;
public class L03_LSubstring {
    
}

// time consuming 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int i = 0 ;
        int n = s.length();

        while(i<n){
            int j, count = 0;
            HashSet<Character> hs = new HashSet<>();
            for(j = i;j<n;j++){
                if(hs.contains(s.charAt(j))){
                    ans = (ans>count)?ans:count;
                    break;
                }else{
                    hs.add(s.charAt(j));
                    count++;
                }
            }
            ans = (ans>count)?ans:count;
            i++;
        }
        return ans;
        
    }
}