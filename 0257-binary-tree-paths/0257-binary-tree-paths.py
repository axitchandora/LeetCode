# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        res = []
        
        def dfs(currNode,currPath):
            if not currNode: return
            if not currNode.left and not currNode.right:
                res.append(currPath+"->"+str(currNode.val) if len(currPath) else str(currNode.val))
                return
            dfs(currNode.left,currPath+"->"+str(currNode.val) if len(currPath) else str(currNode.val))
            dfs(currNode.right,currPath+"->"+str(currNode.val) if len(currPath) else str(currNode.val))
            
        dfs(root,"")
        return res
        