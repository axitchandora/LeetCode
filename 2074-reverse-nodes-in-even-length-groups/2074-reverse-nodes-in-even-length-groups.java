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
        
        int lengthList=0;
        ListNode tmp=head;
        while(tmp!=null){
            lengthList++;
            tmp=tmp.next;
        }
        ListNode current=head,previous=null;
        int k=1;
        while(current!=null){
            if((k%2==0 && k<=lengthList)|| (k>lengthList && lengthList%2==0)){
                ListNode lastNodeOfPreviousPart=previous;            
                ListNode lastNodeOfSubList=current;
                ListNode next=null;
                for(int i=0;i<k && current!=null;i++){
                    next=current.next;
                    current.next=previous;
                    previous=current;
                    current=next;
                    lengthList--;
                }
                if(lastNodeOfPreviousPart!=null)
                    lastNodeOfPreviousPart.next=previous;
                else
                    head=previous;
                k++;
                lastNodeOfSubList.next=current;
                previous=lastNodeOfSubList;
            }else{
                for(int i=0;i<k && current!=null;i++){
                    previous=current;
                    current=current.next;
                    lengthList--;
                }
                k++;
            }
            
        }
        return head;
    }
}