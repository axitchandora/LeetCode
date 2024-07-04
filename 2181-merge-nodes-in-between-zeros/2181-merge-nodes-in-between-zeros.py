# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cur = head

        while cur.next:
            node = cur = cur.next            
            while cur.next.val != 0:
                node.val += cur.next.val
                cur = cur.next

            cur = cur.next
            node.next = cur.next
        return head.next
            
        