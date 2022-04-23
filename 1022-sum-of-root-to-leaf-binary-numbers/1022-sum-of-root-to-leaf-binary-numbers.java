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
    private int res = 0;
    public void preorder(TreeNode root, int currNumber) {
        if (root == null) return;
        currNumber = (currNumber << 1) | root.val;
        if (root.left == null && root.right == null) {
            res += currNumber;
        }
        preorder(root.left, currNumber);
        preorder(root.right, currNumber);
    }

    public int sumRootToLeaf(TreeNode root) {
        preorder(root, 0);
        return res;
    }
    //Time complexity: O(N)
    // Space Complexity - O(H)
}
