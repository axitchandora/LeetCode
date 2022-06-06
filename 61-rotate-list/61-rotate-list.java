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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k<=0) return head;
        
        // find the length and the last node of the list
        ListNode lastNode=head;
        int listLength=1;
        while(lastNode.next!=null){
            listLength++;
            lastNode=lastNode.next;
        }
        lastNode.next=head; // connect the last node with the head to make it a circular list
        k%=listLength; // no need to do rotations more than the length of the list
        int skipLength=listLength-k;
        ListNode lastNodeOfRotatedList=head;
        for(int i=0;i<skipLength-1 && lastNodeOfRotatedList!=null;i++)
            lastNodeOfRotatedList=lastNodeOfRotatedList.next;
        
        // 'lastNodeOfRotatedList.next' is pointing to the sub-list of 'k' ending nodes
        head=lastNodeOfRotatedList.next;
        lastNodeOfRotatedList.next=null;
        return head;
        // Time Complexity -BIG O(N)
        // Space Compexity - BIG O(1)
    }
}