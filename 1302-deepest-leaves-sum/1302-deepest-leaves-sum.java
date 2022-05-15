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
    private int currDepth=0,sumOfLeaves=0;
    private void findSumOfDeepestLeaves(TreeNode root,int depth){
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(currDepth==depth){
                sumOfLeaves+=root.val;
            }
            else if(currDepth<depth){
                currDepth=depth;
                sumOfLeaves=root.val;
            }
        }
        findSumOfDeepestLeaves(root.left,depth+1);
        findSumOfDeepestLeaves(root.right,depth+1);
    }
    
    public int deepestLeavesSum(TreeNode root) {
        findSumOfDeepestLeaves(root,0);
        return sumOfLeaves;
    }
    // Time Complexity - Big O(N)
    // Space Complexity[Recursion Stack] - Big O(N) 
}