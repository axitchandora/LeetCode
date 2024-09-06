# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
        num_set = set(nums)
        dummy_node = ListNode(-1)
        dummy_node.next = head
        tmp_head = dummy_node
        while tmp_head and tmp_head.next:
            while tmp_head.next and tmp_head.next.val in num_set:
                tmp_head.next = tmp_head.next.next            
            tmp_head = tmp_head.next
            
        return dummy_node.next