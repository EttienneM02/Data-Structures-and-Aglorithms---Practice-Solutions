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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //base case
        if(list1 == null){
            //return the rest of list2
            return list2;
        }
        if(list2 == null){
            //return the rest of list1
            return list1;
        }
        //figure out where to point our head
        ListNode head;
        if(list1.val < list2.val){
            head = list1;
            list1 = list1.next;//treverse to the next value of the list -> shrinks the list 
        }else{
            head = list2;
            list2 = list2.next;
        }
        //define the recursive call
        head.next = mergeTwoLists(list1,list2);//get the last values from the callstack
        return head; 
    }
}
