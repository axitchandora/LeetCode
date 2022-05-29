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
    private void helper(TreeNode root,int currSum){
        if(root==null) return;
        currSum=currSum*10+root.val;
        if(root.left==null && root.right==null)
            ans+=currSum;
        helper(root.left,currSum);
        helper(root.right,currSum);
    }
    public int sumNumbers(TreeNode root) {
        helper(root,0);
        return ans;
    }
}