# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def evaluateTree(self, root: Optional[TreeNode]) -> bool:
        stack = [root]
        value = {} # map node -> value
        while stack:
            node = stack.pop()
            # Leaf Node
            if not node.left:
                value[node] = node.val == 1
            #Non-leaf Node
            else:
                # Children visited
                if node.left in value:
                    if node.val == 2:
                        value[node] = value[node.left] or value[node.right]
                    if node.val == 3:
                        value[node] = value[node.left] and value[node.right]
                # Otherwise add children
                else:
                    stack.extend([node, node.left, node.right])
        return value[root]
        
        