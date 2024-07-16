# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getDirections(self, root: Optional[TreeNode], startValue: int, destValue: int) -> str:
        
        def dfs(node, path, target):
            if not node:
                return ""
            if node.val == target:
                return path
            
            path.append("L")
            res = dfs(node.left, path, target)
            if res: return res
                
            path.pop()
            path.append("R")
            res = dfs(node.right, path, target)
            if res: return res
            
            path.pop()
            return ""
        
        start_path = dfs(root, [], startValue)
        dest_path = dfs(root, [], destValue)
        i = 0 
        print(start_path,dest_path)
        while i < min(len(start_path), len(dest_path)):
            if start_path[i] != dest_path[i]:
                break
            i += 1   
        res = ["U"] * len(start_path[i:]) + dest_path[i:]
        return "".join(res)