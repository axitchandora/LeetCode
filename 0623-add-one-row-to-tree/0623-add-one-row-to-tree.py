# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def addOneRow(self, root: Optional[TreeNode], val: int, depth: int) -> Optional[TreeNode]:
        if depth == 1 :
            return TreeNode(val, root, None)
        
        curr_depth = 1
         
        queue = collections.deque([root])
        
        while queue:
            if curr_depth == depth - 1 :
                break
            
            for _ in range(len(queue)):
                cur_node = queue.popleft()
                
                if cur_node.left:
                    queue.append(cur_node.left)
                    
                if cur_node.right:
                    queue.append(cur_node.right)
                    
            curr_depth += 1
            
        for node in queue:
            curr_left = node.left
            node.left = TreeNode(val, curr_left, None)
            
            curr_right = node.right
            node.right = TreeNode(val, None, curr_right)            
            
        return root
            
            
            
                
            
        