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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        preorderTrav(root,result);
        return result;
    }
    
    public void preorderTrav(TreeNode root,List<Integer> res){
        if(root==null)
            return;
        res.add(root.val);
        preorderTrav(root.left,res);
        preorderTrav(root.right,res);
    }
    // Time Complexity - O(N)
    // Space Complexity - O(Depth of the Tree)
}