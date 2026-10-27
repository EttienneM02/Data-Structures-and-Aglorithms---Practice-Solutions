/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //1 -> 2 -> 3 -> 4 -> 5 -> 6
    // null <- 1 <- 2 <- 3 <- 4 <- 5 <- 6  
    // 6 5 4 3 2 1
    //curr, prev, next
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        //advance the next node to curr.next
        
        while(curr != null){
        next = curr.next;
        curr.next = prev;
        //advance nodes
        prev = curr;
        curr = next;
        }

        return prev;//return the new head
        
    }
}
