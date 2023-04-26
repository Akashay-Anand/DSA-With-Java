package Leetcode;

/**
 * L02_AddTwoNo
 */
public class L02_AddTwoNo {
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode itrate = ans;
        if(l1 == null && l2 != null) return l2;
        if(l2 == null && l1 != null) return l1;
        if(l2 == null && l1 == null) return l1;

        int carry = 0;
        int sum = 0;
        while(l1 != null || l2 != null || carry != 0){
            // Listnode
            sum = (l1 != null ? l1.val:0) + (l2 != null ? l2.val:0) + carry;
            if(sum>9){
                carry = sum/10;
                sum = sum%10;
            }else carry = 0;

            itrate.next = new ListNode(sum);
            itrate = itrate.next;
            l1 = (l1 != null) ? l1.next:null;
            l2 = (l2 != null) ? l2.next:null;
        }
        return ans.next;
    }
}


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 