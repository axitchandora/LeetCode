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
    public int pathSum(TreeNode root, int targetSum) {
        List<Integer> currentPath=new LinkedList<>();
        return countPathsRecursive(root,targetSum,currentPath);    
    }
    private int countPathsRecursive(TreeNode currentNode, int targetSum, List<Integer> currentPath){
        if(currentNode==null)return 0;
        
        // add the current node to the path
        currentPath.add(currentNode.val);
        int pathSum=0, pathCount=0;
        // find the sums of all sub-paths in the current path list
        ListIterator<Integer> pathIterator=currentPath.listIterator(currentPath.size());
        while(pathIterator.hasPrevious()){
            pathSum+=pathIterator.previous();
            // if the sum of any sub-path is equal to 'S' we increment our path count.
            if(pathSum==targetSum) pathCount++;
        }
        // traverse the left sub-tree
        pathCount+=countPathsRecursive(currentNode.left,targetSum,currentPath); 
        // traverse the right sub-tree
        pathCount+=countPathsRecursive(currentNode.right,targetSum,currentPath); 
        
        // remove the current node from the path to backtrack, 
        // we need to remove the current node while we are going up the recursive call stack.
        currentPath.remove(currentPath.size()-1);
        
        return pathCount;
    }
}