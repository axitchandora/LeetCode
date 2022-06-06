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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        if(head==null || head.next==null) return head;
        // find the length and the last node of the list
        int lengthList=0;
        ListNode tmp=head;
        while(tmp!=null){
            lengthList++;
            tmp=tmp.next;
        }
        ListNode current=head,previous=null;
        int k=1;
        while(current!=null){
            // If k is Even and k <= Remaining Length of LinkedList OR
            // (Remaining Length of LinkedList) is even and k is greater than (Remaining Length of LinkedList)
            // we will reverse the kth Sub-Linked List
            // Else we will skip the k elements in Linked List
            if((k%2==0 && k<=lengthList)|| (k>lengthList && lengthList%2==0)){
                ListNode lastNodeOfPreviousPart=previous; 
                // after reversing the LinkedList 'current' will become the last node of the sub-list
                ListNode lastNodeOfSubList=current;
                ListNode next=null; // will be used to temporarily store the next node
                for(int i=0;i<k && current!=null;i++){
                    next=current.next;
                    current.next=previous;
                    previous=current;
                    current=next;
                    lengthList--;
                }
                 // connect with the previous part
                if(lastNodeOfPreviousPart!=null)
                    lastNodeOfPreviousPart.next=previous; // 'previous' is now the first node of the sub-list
                else // this means we are changing the first node (head) of the LinkedList
                    head=previous;
                // connect with the next part
                lastNodeOfSubList.next=current;
                // prepare for the next sub-list
                previous=lastNodeOfSubList;
            }else{
                // Skiping the k elements in LinkedList
                for(int i=0;i<k && current!=null;i++){
                    previous=current;
                    current=current.next;
                    lengthList--;
                }
            }
            // incrementing the k 
            k++;            
        }
        return head;
    }
}