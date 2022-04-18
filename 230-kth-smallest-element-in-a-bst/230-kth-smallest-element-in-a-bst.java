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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> allnodes=new ArrayList();
        inordertraversal(root,allnodes);
        return allnodes.get(k-1);
    }
    public void inordertraversal(TreeNode root,List<Integer> allnodes){
        if(root==null)
            return;
        inordertraversal(root.left,allnodes);
        allnodes.add(root.val);
        inordertraversal(root.right,allnodes);
    }
}