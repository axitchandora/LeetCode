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
    public ListNode removeElements(ListNode head, int val) {
        //Using Sentienl Node Approach
        if(head==null)
            return head;
        ListNode current=head;
        ListNode sentinel=new ListNode(0);
        sentinel.next=head;
        ListNode prev=sentinel;
        while(current!=null){
            if(current.val==val){                
                prev.next=current.next;
            }
            else
                prev=current;
            current=current.next;
        }
        return sentinel.next;
        //Time Complexity - O(N)
        //Space Complexity - O(1)
    }
}