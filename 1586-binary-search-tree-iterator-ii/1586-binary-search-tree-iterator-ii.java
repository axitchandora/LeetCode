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
    private List<Integer> sortedNodes;
    private int index;

    public BSTIterator(TreeNode root) {
        this.index=-1;
        this.sortedNodes=new ArrayList<Integer>();
        inorder(root);
    }
    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        sortedNodes.add(root.val);
        inorder(root.right);
    }
    
    public boolean hasNext() {
        return this.index<this.sortedNodes.size()-1;
    }
    
    public int next() {
        return this.sortedNodes.get(++index);
    }
    
    public boolean hasPrev() {
        return this.index>0;
    }
    
    public int prev() {
        return this.sortedNodes.get(--index);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * boolean param_1 = obj.hasNext();
 * int param_2 = obj.next();
 * boolean param_3 = obj.hasPrev();
 * int param_4 = obj.prev();
 */