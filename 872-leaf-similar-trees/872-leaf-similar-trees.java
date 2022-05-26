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
    private void helper(TreeNode root,List<Integer> leaves){
        if(root==null)return;
        if(root.left==null && root.right==null)
            leaves.add(root.val);
        helper(root.left,leaves);
        helper(root.right,leaves);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leavesOfRoot1=new ArrayList();
        List<Integer> leavesOfRoot2=new ArrayList();
        helper(root1,leavesOfRoot1);
        helper(root2,leavesOfRoot2);
        if(leavesOfRoot1.size()!=leavesOfRoot2.size())
            return false;
        for(int i=0;i<leavesOfRoot1.size();i++){
            if(leavesOfRoot1.get(i)!=leavesOfRoot2.get(i))
                return false;
        }
        return true;
    }
}