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
    private void helper(TreeNode root,int level,HashMap<Integer,Integer> rightViewNodesMap){
        if(root==null)return;
        rightViewNodesMap.put(level,root.val);
        helper(root.left,level+1,rightViewNodesMap);
        helper(root.right,level+1,rightViewNodesMap);
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        HashMap<Integer,Integer> rightViewNodesMap=new HashMap();
        List<Integer> res=new ArrayList();
        helper(root,0,rightViewNodesMap);
        for(int i=0;i<rightViewNodesMap.size();i++){
            res.add(rightViewNodesMap.get(i));
        }
        return res;
    }
}