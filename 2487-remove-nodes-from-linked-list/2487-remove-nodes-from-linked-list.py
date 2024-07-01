# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        stack = []
        curr = head
        
        while curr:
            while len(stack)>0 and stack[-1].val < curr.val:
                stack.pop()
            if stack:
                stack[-1].next = curr
            stack.append(curr)
            curr = curr.next
        return stack[0] if stack else None
        