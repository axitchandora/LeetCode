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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return ;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode secondHalfHead=reverse(slow);
        ListNode firstHalfHead=head;
        
        while(firstHalfHead!=null && secondHalfHead!=null){
            ListNode tmp=firstHalfHead.next;
            firstHalfHead.next=secondHalfHead;
            firstHalfHead=tmp;
            
            ListNode tmp2=secondHalfHead.next;
            secondHalfHead.next=firstHalfHead;
            secondHalfHead=tmp2;
        }  
        if(firstHalfHead!=null)
            firstHalfHead.next=null;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode nextNode=head.next;
            head.next=prev;
            prev=head;
            head=nextNode;
        }
        return prev;
    }
}