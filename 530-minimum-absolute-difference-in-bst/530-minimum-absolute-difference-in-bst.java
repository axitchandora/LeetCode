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
    public int getMinimumDifference(TreeNode root) {
        prev=null;
        result=Integer.MAX_VALUE;
        findMinimumAbsoluteDifference(root);
        return result;
    }
    private void findMinimumAbsoluteDifference(TreeNode root){
        if(root==null) return;
        findMinimumAbsoluteDifference(root.left);
        if(prev!=null)
            result=Math.min(result,root.val-prev);
        prev=root.val;
        findMinimumAbsoluteDifference(root.right);
    }
}