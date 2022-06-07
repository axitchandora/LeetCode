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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode current=head,oddNodeListHead=null,evenNodeListHead=null;
        ListNode oddNodeListTail=null,evenNodeListTail=null;
        int idx=1;
        while(current!=null){
            if(idx%2==1){
                if(oddNodeListHead==null){
                    oddNodeListHead=oddNodeListTail=current;
                }else{
                    oddNodeListTail.next=current;
                    oddNodeListTail=oddNodeListTail.next;
                }
            }else{
                if(evenNodeListHead==null){
                    evenNodeListHead=evenNodeListTail=current;
                }else{
                    evenNodeListTail.next=current;
                    evenNodeListTail=evenNodeListTail.next;
                }
            }
            current=current.next;
            idx++;
        }
        ListNode newHead=null;
        if(oddNodeListHead==null)
            return evenNodeListTail;
        newHead=oddNodeListHead;
        oddNodeListTail.next=evenNodeListHead; 
        evenNodeListTail.next=null;
        return newHead;
    }
}