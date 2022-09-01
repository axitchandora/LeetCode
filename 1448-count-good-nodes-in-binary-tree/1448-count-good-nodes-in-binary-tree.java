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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
    private int dfs(TreeNode node,int maxValue){
        if(node==null) return 0;
        int res=0;
        if(node.val>=maxValue) res+=1;
        res+=dfs(node.left,Math.max(maxValue,node.val));
        res+=dfs(node.right,Math.max(maxValue,node.val));
        return res;
    }
}