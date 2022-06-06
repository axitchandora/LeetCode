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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        
        Queue<TreeNode> queue=new LinkedList();
        queue.offer(root);
        int minimumTreeDepth=0;
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            minimumTreeDepth++;
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode=queue.poll();
                
                // check if this is a leaf node
                if(currentNode.left==null && currentNode.right==null)
                    return minimumTreeDepth;
                // insert the children of current node in the queue
                if(currentNode.left!=null)
                    queue.offer(currentNode.left);
                if(currentNode.right!=null)
                    queue.offer(currentNode.right);                    
            }
        }
        return minimumTreeDepth;
    }
}