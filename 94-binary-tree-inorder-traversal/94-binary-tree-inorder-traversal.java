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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList();
        inorderTrav(root,result);
        return result;
    }
    void inorderTrav(TreeNode root,List<Integer> res){
        if(root==null)
            return;
        inorderTrav(root.left,res);
        res.add(root.val);
        inorderTrav(root.right,res);
    }
    // Time Complexity - O(N)
    // Space Complexity - O(depth of the tree)
}