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
    private int answer;
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        answer=Integer.MIN_VALUE;
        findMaximumPathSum(root);
        return answer;
    }
    private int findMaximumPathSum(TreeNode root){
        if(root==null)return 0;
        int leftMax=Math.max(findMaximumPathSum(root.left),0);
        int rightMax=Math.max(findMaximumPathSum(root.right),0);        
        int currSum=leftMax+rightMax+root.val;        
        answer=Math.max(answer,currSum);        
        return root.val+Math.max(leftMax,rightMax);        
    }
}