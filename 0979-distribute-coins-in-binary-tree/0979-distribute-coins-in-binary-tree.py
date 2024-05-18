# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def distributeCoins(self, root: Optional[TreeNode]) -> int:
        self.res = 0
        def dfs(root):
            if not root:
                return 0 # Extra coins
            l_extra = dfs(root.left)
            r_extra = dfs(root.right)
            extra_coins = l_extra + r_extra + (root.val - 1)
           
            self.res += abs(extra_coins)
            
            return extra_coins
        dfs(root)
        return self.res
        