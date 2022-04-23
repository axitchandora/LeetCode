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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList();
        if(root==null)
            return result;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList();
            for(int i=0;i<size;i++){
                TreeNode ele=q.poll();
                level.add(ele.val);
                if(ele.left!=null)
                    q.add(ele.left);
                if(ele.right!=null)
                    q.add(ele.right);
            }
            result.add(level);
        }
        return result;
        // Time Complexity -O(N)
        // Space Complexity -O(N)
    }
}
