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
                return [0,0]
            l_size, l_coins = dfs(root.left)
            r_size, r_coins = dfs(root.right)
            
            size = 1 + l_size + r_size
            coins = root.val + l_coins + r_coins
            self.res += abs(size-coins)
            
            return [size, coins]
        dfs(root)
        return self.res
        