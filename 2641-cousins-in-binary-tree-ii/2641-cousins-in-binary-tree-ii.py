# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def replaceValueInTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        level_sum = []
        
        q = deque([root])
        while q:
            cur_sum = 0
            for i in range(len(q)):
                node = q.popleft()
                cur_sum += node.val
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            level_sum.append(cur_sum)
            
        q = deque([(root, root.val)]) #(node, child_sum)
        level = 0
        while q:
            for i in range(len(q)):
                node, val = q.popleft()
                node.val = level_sum[level] - val
                
                child_sum = 0
                if node.left:
                    child_sum += node.left.val
                if node.right:
                    child_sum += node.right.val
                
                if node.left:
                    q.append((node.left, child_sum))
                if node.right:
                    q.append((node.right, child_sum))
                    
            level += 1
        return root;