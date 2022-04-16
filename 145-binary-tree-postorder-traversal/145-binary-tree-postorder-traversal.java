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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList();
        postorderTrav(root,result);
        return result;
        
    }
    void postorderTrav(TreeNode root,List<Integer> res){
        if(root==null)
            return;
        postorderTrav(root.left,res);
        postorderTrav(root.right,res);
        res.add(root.val);
    }
    // Time Complexity - O(N)
    // Space Complexity - O(depth of the tree)
}