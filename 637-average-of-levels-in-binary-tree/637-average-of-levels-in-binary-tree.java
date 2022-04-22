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
    private void helper(TreeNode root,int level,List<Double> sum,List<Integer> count){
        if(root==null) return;
        if(level<sum.size()){
            sum.set(level,sum.get(level)+root.val);
            count.set(level,count.get(level)+1);
        }else{
            sum.add((double)root.val);
            count.add(1);
        }
        helper(root.left,level+1,sum,count);
        helper(root.right,level+1,sum,count);
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avg=new ArrayList();
        List<Integer> count=new ArrayList();
        helper(root,0,avg,count);
        for(int i=0;i<avg.size();i++)
            avg.set(i,avg.get(i)/count.get(i));
        return avg;
    }
}