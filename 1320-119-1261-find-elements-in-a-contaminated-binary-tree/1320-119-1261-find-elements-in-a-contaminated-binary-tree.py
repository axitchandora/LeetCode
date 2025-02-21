# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class FindElements:
    root = TreeNode() 

    def __init__(self, root: Optional[TreeNode]):
        self.root = root
        root.val = 0
        def contaminated(root):
            if not root:
                return
            if root.left:
                root.left.val = 2 * root.val + 1
            if root.right:
                root.right.val = 2 * root.val + 2
            contaminated(root.left)
            contaminated(root.right)  
        contaminated(self.root) 

    def find(self, target: int) -> bool:
        def dfs(root, target):
            if not root:
                return False
            if root.val == target:
                return True
            return dfs(root.left, target) or dfs(root.right, target)
        return dfs(self.root, target)


# Your FindElements object will be instantiated and called as such:
# obj = FindElements(root)
# param_1 = obj.find(target)