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
    private Integer prev;
    public boolean inorder(TreeNode root){
        if(root==null) return true;        
        if(!inorder(root.left))
            return false;
        if(prev!=null && root.val <=prev)
            return false;
        prev=root.val;
        return inorder(root.right);        
    }
    public boolean isValidBST(TreeNode root) {
        prev=null;
        return inorder(root);
        
    }
}