/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    private TreeNode result,target;
    private void inorder(TreeNode original,TreeNode cloned)
    {
        if(original==null)return;
        inorder(original.left,cloned.left);
        if(original==target) result=cloned;
        inorder(original.right,cloned.right);
    }
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target)     {
        this.target=target;
        inorder(original,cloned);
        return result;
    }
    // Time Complexity: BIG O(N)
    // Space Complexity: BIG O(N)
}