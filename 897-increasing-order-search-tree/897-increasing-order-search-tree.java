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
    // Using In-Order Traversal Approach
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        inorderTrav(root,result);
        TreeNode newRoot=new TreeNode(-1);
        TreeNode prev=newRoot;
        for(int i=0;i<result.size();i++){
            prev.left=null;
            prev.right=new TreeNode(result.get(i));
            prev=prev.right;
        }
        return newRoot.right;
    }
    public void inorderTrav(TreeNode root,List<Integer> result){
        if(root==null)
            return;
        inorderTrav(root.left,result);
        result.add(root.val);
        inorderTrav(root.right,result);
    }
    // Time Complexity - O(N), N is number of nodes
    // Space Compexity - O(N)
}