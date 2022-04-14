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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Handling Base Conditions
        if(list1==null && list2==null)
            return null;
        if(list1!=null && list2==null)
            return list1;
        if(list2!=null && list1==null)
            return list2;
        
        //Using Two pointer Apporach
        ListNode result=new ListNode(-1);
        ListNode prev=result;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val){
                prev.next=list1;
                list1=list1.next;
            }
            else{
                prev.next=list2;
                list2=list2.next;
            } 
            prev=prev.next;
        }

        prev.next = list1 == null ? list2:list1;
        return result.next;   
        //Time Complexity - O(N+K)
        //Space Complexity - O(1)
    }
}