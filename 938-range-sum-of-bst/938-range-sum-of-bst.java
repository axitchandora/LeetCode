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
    private void findthesum(TreeNode root,int low,int high){
        if(root==null) return;
        findthesum(root.left,low,high);
        if(low <= root.val && root.val <= high){
            ans+=root.val;
        }
        findthesum(root.right,low,high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        findthesum(root,low,high);
        return ans;
    }
}