# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        
        def dfs(curr, num):
            if not curr:
                return 0
            num = num * 10 + curr.val
            if not curr.left and not curr.right:
                return num
            return dfs(curr.left, num)+ dfs(curr.right, num)
        
        return dfs(root,0)
                                           
                                           
        