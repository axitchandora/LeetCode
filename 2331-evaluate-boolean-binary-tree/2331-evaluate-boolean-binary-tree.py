# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def evaluateTree(self, root: Optional[TreeNode]) -> bool:
        def evaluateT(root):
            if(root.val == 0):
                return False
            elif(root.val == 1):
                return True
            left = evaluateT(root.left)        
            right = evaluateT(root.right)
            if(root.val == 2):
                return (left or right)
            elif(root.val == 3):
                return (left and right)
        return evaluateT(root)
        
        