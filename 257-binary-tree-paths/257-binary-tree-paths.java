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
    private void helper(TreeNode root,String path,List<String> res){
        if(root==null) return;
        if(root.left==null && root.right==null){
            path+=""+root.val+"";
            res.add(path);
        }
        path+=""+root.val+"";
        path+="->";
        helper(root.left,path,res);
        helper(root.right,path,res);
    } 
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList();
        helper(root,"",res);
        return res;
    }
}