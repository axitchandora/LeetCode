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
    private Integer result,prev;
    public int minDiffInBST(TreeNode root) {
        result=Integer.MAX_VALUE;
        prev=null;
        findMinimumDistance(root);
        return result;        
    }
    private void findMinimumDistance(TreeNode root){
        if(root==null)return;
        findMinimumDistance(root.left);
        if(prev!=null)
            result=Math.min(result,root.val-prev);
        prev=root.val;
        findMinimumDistance(root.right);
    }
}