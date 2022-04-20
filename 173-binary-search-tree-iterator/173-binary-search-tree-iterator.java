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
class BSTIterator {
    private int index;
    private List<Integer> notesSorted;

    public BSTIterator(TreeNode root) {
        this.index=-1;
        this.notesSorted=new ArrayList<Integer>();
        inorder(root);
    }
    private void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        notesSorted.add(root.val);
        inorder(root.right);
    }
    
    public int next() {
        return this.notesSorted.get(++index);
    }
    
    public boolean hasNext() {
        return this.index+1 < this.notesSorted.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */