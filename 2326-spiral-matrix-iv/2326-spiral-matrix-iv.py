# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def spiralMatrix(self, m: int, n: int, head: Optional[ListNode]) -> List[List[int]]:
        left, right = 0 , n
        top, bottom = 0, m
        grid = [[-1] * n for _ in range(m)]
        
        while head:
            # left to right
            for i in range(left, right):
                if not head:
                    return grid
                grid[top][i] = head.val
                head = head.next
            top += 1
            
            # top to bottom
            for i in range(top, bottom):
                if not head:
                    return grid
                grid[i][right-1] = head.val
                head = head.next
            right -= 1
            
            # right to left
            
            for i in range(right - 1 , left - 1, -1):
                if not head:
                    return grid
                grid[bottom - 1][i] = head.val
                head = head.next
            bottom -= 1
            
            # bottom to top
            
            for i in range(bottom - 1 , top - 1, -1):
                if not head:
                    return grid
                grid[i][left] = head.val
                head = head.next
            left += 1
        
        return grid
        