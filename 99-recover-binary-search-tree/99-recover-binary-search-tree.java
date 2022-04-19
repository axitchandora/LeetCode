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
    TreeNode x=null, y= null, prev=null;
    private void swap(TreeNode a,TreeNode b){
        int tmp=a.val;
        a.val=b.val;
        b.val=tmp;
    }
    private void findTwoSwapped(TreeNode root){
        if(root==null) return;
        findTwoSwapped(root.left);
        if(prev != null && root.val< prev.val){
            y=root;
            if(x==null) x=prev;
            else return;
        }
        prev=root;
        findTwoSwapped(root.right);
    }
    
    public void recoverTree(TreeNode root) {
        findTwoSwapped(root);
        swap(x,y);
    }
    
}