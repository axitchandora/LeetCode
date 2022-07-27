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
    public void flatten(TreeNode root) {
        if(root==null) return;
        
        TreeNode lefttmp=root.left;
        TreeNode righttmp=root.right;
        
        root.left=null;
        flatten(lefttmp);
        flatten(righttmp);
        root.right=lefttmp;
        TreeNode current=root;
        while(current.right!=null) current=current.right;
        current.right=righttmp;        
    }
}