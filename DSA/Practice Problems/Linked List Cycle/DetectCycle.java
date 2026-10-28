/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode l = head, h = head;
        int pos = -1;//assume that there is not cycles 
        
        while(h != null && h.next != null){
            l = l.next;//move to the next node
                h = h.next.next;//moves it twice -> one step ahead of l
            if(l == h){
                //cycle was found
                return true;
            }
            //head = head.next;//traverse the list
        }
        return false;

    }
}
