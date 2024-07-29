# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        res = [0]
        def helper(root):
            if not root:
                return -1
            
            left = helper(root.left)
            right = helper(root.right)
            res[0] = max(res[0], left + 2 + right)
            
            return 1 + max(left, right)
        
        helper(root)
        return res[0]