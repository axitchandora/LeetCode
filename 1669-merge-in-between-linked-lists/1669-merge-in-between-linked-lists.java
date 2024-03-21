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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tmp=list1;
        ListNode prev=null;
        ListNode nodea=null;
        ListNode nodeb=null;
        int count = 0;
        while(tmp!=null){
            if(count == a){
                nodea=prev;
            }
            if(count == b){
                nodeb=tmp.next;
                break;
            }
            prev=tmp;
            tmp=tmp.next;
            count++;
        }
        nodea.next=list2;
        tmp=list2;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=nodeb;
        return list1;
    }
}