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
    public TreeNode pruneTree(TreeNode root) {
        return helper(root)?root:null;
    }
    private boolean helper(TreeNode root){
        if(root==null)return false;
        
        boolean leftTree=helper(root.left);
        boolean rightTree=helper(root.right);
        
        if(!leftTree) root.left=null;
        if(!rightTree) root.right=null;
        
        return root.val==1 || leftTree || rightTree;
    }
}