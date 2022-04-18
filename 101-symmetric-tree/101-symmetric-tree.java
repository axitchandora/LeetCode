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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        
        return (r1.val==r2.val) && isMirror(r1.left,r2.right) &&
            isMirror(r1.right,r2.left);
    }
    // Time Complexity - O(N)
    // Space Complexity - O(N)
}