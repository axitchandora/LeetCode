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
    private int ans=0;
    public int helper(TreeNode root){
        if(root==null) return 0;
        int l=helper(root.left);
        int r=helper(root.right);
        ans= Math.max(ans,l+r);
        return Math.max(l+1,r+1);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return ans;
    }
}