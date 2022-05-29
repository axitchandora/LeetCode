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
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode p=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }        
        ListNode mid=reverse(slow);
        ListNode savedMid=mid;
        boolean ans=true;
        ListNode curr=head;
        while(curr!=null && mid!=null){
            if(curr.val!=mid.val){
                ans=false;
            }
            curr=curr.next;
            mid=mid.next;
        }
        reverse(savedMid);
        return ans;
    }
}