/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }
    
    private int dfs(TreeNode subTree, boolean isLeft){
        if(subTree==null) return 0;
        if(subTree.left == null && subTree.right == null){
                return isLeft?subTree.val:0;
        }
        int total = 0;
        if(subTree.left != null)
            total += dfs(subTree.left, true);
        if(subTree.right != null)
            total += dfs(subTree.right, false);
        return total;
    }
}