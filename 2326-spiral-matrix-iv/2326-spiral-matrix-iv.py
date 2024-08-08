# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def spiralMatrix(self, m: int, n: int, head: Optional[ListNode]) -> List[List[int]]:
        left, right = 0 , n
        top, bottom = 0 , m
        res = [[-1 for i in range(n)] for j in range(m)]
        tmp = head
        while left < right and top < bottom and tmp:
            
            for i in range(left, right):
                if tmp:
                    res[top][i] = tmp.val
                else:
                    return res
                tmp = tmp.next
            top += 1
            
            for i in range(top, bottom):
                if tmp:
                    res[i][right-1] = tmp.val
                else:
                    return res
                tmp = tmp.next
            right -= 1
            
            if not (left < right and top < bottom):
                break
                
            for i in range(right - 1 , left - 1, -1):
                if tmp:
                    res[bottom-1][i] = tmp.val
                else:
                    return res
                tmp = tmp.next
            bottom -= 1
            
            for i in range(bottom -1, top - 1, -1):
                if tmp:
                    res[i][left] = tmp.val
                else:
                    return res
                tmp = tmp.next
            left += 1
            
        return res
        