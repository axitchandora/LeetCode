# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
        nums = set(nums)
        dummy = ListNode(0, head)
        
        prev = dummy
        cur = head
        while cur:
            if cur.val in nums:
                prev.next = cur.next
            else:
                prev = prev.next
            cur = cur.next            
            
        return dummy.next