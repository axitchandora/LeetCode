# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def createBinaryTree(self, descriptions: List[List[int]]) -> Optional[TreeNode]:
        nodes = {}
        children = set()
        
        for par, child, is_left in descriptions:
            children.add(child)
            if par not in nodes:
                nodes[par] = TreeNode(par)
                
            if child not in nodes:
                nodes[child] = TreeNode(child)
            
            if is_left:
                nodes[par].left = nodes[child]
            else:
                nodes[par].right = nodes[child]
                
        for p , c ,l in descriptions:
            if p not in children:
                return nodes[p]