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
    public boolean helper(TreeNode root,int prev){
        if(root==null) return true;
        if(root.val!=prev)
            return false;
        if(!helper(root.left,root.val))
            return false;
        return helper(root.right,root.val);
    }    
    public boolean isUnivalTree(TreeNode root) {
        return helper(root,root.val);
    }
}