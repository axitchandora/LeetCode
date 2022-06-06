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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result=new ArrayList();
        if(root==null)
            return result;
        Queue<TreeNode> queue=new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            int maxValue = Integer.MIN_VALUE;
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode=queue.poll();
                maxValue=Math.max(maxValue,currentNode.val);
                if(currentNode.left!=null)
                    queue.offer(currentNode.left);
                if(currentNode.right!=null)
                    queue.offer(currentNode.right);
            }
            result.add(maxValue);
        }
        return result;
    }
}