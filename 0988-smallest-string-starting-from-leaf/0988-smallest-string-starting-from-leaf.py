# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def smallestFromLeaf(self, root: Optional[TreeNode]) -> str:
        
        def preOrderdfs(root, curr):
            if not root:
                return
            
            curr = chr(ord('a')+ root.val) + curr
            if root.left and root.right:
                return min(preOrderdfs(root.left, curr), preOrderdfs(root.right, curr))
            if root.left:
                return preOrderdfs(root.left, curr)
            if root.right:
                return preOrderdfs(root.right, curr)
            return curr
        return preOrderdfs(root, "")