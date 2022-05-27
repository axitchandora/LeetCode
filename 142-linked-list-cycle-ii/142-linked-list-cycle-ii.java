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
    public ListNode findStartofLinkedListCycle(ListNode head,ListNode slow){
        ListNode start=head;
        while(start!=slow){
            start=start.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return findStartofLinkedListCycle(head,slow);
        }
        return null;
    }
}