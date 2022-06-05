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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null)
          return head;
        int length=0;
        ListNode tmp=head;
        while(tmp!=null) {
            tmp=tmp.next;
            length++;
        }        
        ListNode current = head, previous = null;
        while (true) {
            if(k>length)
                break;
            ListNode lastNodeOfPreviousPart = previous;
            // after reversing the LinkedList 'current' will become the last node of the sub-list
            ListNode lastNodeOfSubList = current;
            ListNode next = null; // will be used to temporarily store the next node
            // reverse 'k' nodes
            for (int i = 0; current != null && i < k; i++) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
                length--;
              }
             // connect with the previous part
             if (lastNodeOfPreviousPart != null)
                lastNodeOfPreviousPart.next = previous; // 'previous' is now the first node of the sub-list
             else // this means we are changing the first node (head) of the LinkedList
                head = previous;
             // connect with the next part
             lastNodeOfSubList.next = current;

             if (current == null) // break, if we've reached the end of the LinkedList
                break;
             // prepare for the next sub-list
             previous = lastNodeOfSubList;          
        }
        return head;
    }
}