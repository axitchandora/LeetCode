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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right)return head;
        
        // after skipping 'p-1' nodes, current will point to 'p'th node
        ListNode current = head, previous = null;
        
        for(int i = 0; current != null && i < left - 1; ++i) {
            previous = current;
            current = current.next;
        }
        
        ListNode lastNodeOfFirstPart=previous;
        
        ListNode lastNodeOfSubPart=current;
        ListNode next=null;
        for(int i=0;current!=null && i< right-left+1;i++){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        if(lastNodeOfFirstPart!=null)
            lastNodeOfFirstPart.next=previous;
        else
            head=previous;
        lastNodeOfSubPart.next=current;
        return head;
    }
}