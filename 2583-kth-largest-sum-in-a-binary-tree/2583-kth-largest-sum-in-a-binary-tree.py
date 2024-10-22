# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthLargestLevelSum(self, root: Optional[TreeNode], k: int) -> int:
        q = deque([root])
        min_heap = [] # at most size = k 
        
        while q:
            level_sum = 0
            for i in range(len(q)):
                node = q.popleft()
                level_sum += node.val
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            heapq.heappush(min_heap, level_sum)
            if len(min_heap) > k:
                heapq.heappop(min_heap)
                
        return -1 if len(min_heap) < k else min_heap[0]
        