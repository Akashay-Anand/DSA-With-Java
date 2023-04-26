package Leetcode;
import java.util.*;
public class L01_TwoSUm {
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(nums[0]);
        int[] ans = new int[2];
        for(int i=1;i<nums.length;i++){
            int x = target - nums[i];
            if(hs.contains(x)){
                ans[1] = i;
                i--;
                while(i>=0 && nums[i] != x){
                    i--;
                }
                ans[0] = i;
                break;
            }
            hs.add(nums[i]);
        }
        return ans;
    }
}