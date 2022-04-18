/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return head;
        Node curr=head;
        // Add New Node in List
        while(curr!=null){
            Node n=new Node(curr.val,curr.next,null);
            curr.next=n;
            curr=curr.next.next;
        }
        // Now Assgining the Random pointers to new Nodes
        curr=head;
        while(curr!=null){
            curr.next.random= (curr.random !=null) ? curr.random.next:null;
            //curr.next.random=curr.random.next;
            curr=curr.next.next;
        }
        // Separating the List
        curr=head;
        Node res=new Node(-1,null,null);
        Node prev=res;
        while(curr!=null){
            prev.next=curr.next;
            curr.next=curr.next.next;
            curr=curr.next;
            prev=prev.next;
        }
        return res.next;
    }
}