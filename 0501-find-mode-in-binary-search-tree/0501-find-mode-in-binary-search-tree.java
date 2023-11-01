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
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> freqMap = new HashMap();
        dfs(root, freqMap);
        int maxFreq = 0;
        
        for(int key : freqMap.keySet()){
            maxFreq = Math.max(maxFreq, freqMap.get(key));
        }
        
        List<Integer> ans = new ArrayList();
        for( int key : freqMap.keySet()){
            if(freqMap.get(key) == maxFreq){
                ans.add(key);
            }
        }
        //int[] res =ans.stream().mapToInt(i -> i).toArray();
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
    
    public void dfs(TreeNode root, Map<Integer, Integer> freqMap) {
        if(root == null) return;
        
        freqMap.put(root.val, freqMap.getOrDefault(root.val, 0) + 1);
        dfs(root.left, freqMap);
        dfs(root.right, freqMap);
    }
    
}