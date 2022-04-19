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
    private TreeNode getNodes(TreeNode root, List<Integer> res){
        if(root==null) return root;
        TreeNode l=getNodes(root.left,res);
        TreeNode r=getNodes(root.right,res);
        if(l==null && r!=null)
            res.add(root.right.val);
        if(l!=null && r==null)
            res.add(root.left.val);
        return root;
    }
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> res=new ArrayList();
        getNodes(root,res);
        return res;
    }
}