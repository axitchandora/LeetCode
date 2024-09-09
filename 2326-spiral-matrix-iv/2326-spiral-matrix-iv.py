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
        
        directions = [[0,1],[1,0],[0,-1],[-1,0]]
        r ,c , d= 0, 0 , 0 # current row, col & direction
        
        while head:
            dr , dc = directions[d]
            
            while (
                head and
                left <= c < right and
                top <= r < bottom and
                grid[r][c] == -1
            ):
                grid[r][c] = head.val
                head = head.next
                r , c = r + dr, c + dc
            r , c = r - dr, c - dc
            d = (d + 1) % 4            
            dr , dc = directions[d]
            r , c = r + dr, c + dc
        return grid
        