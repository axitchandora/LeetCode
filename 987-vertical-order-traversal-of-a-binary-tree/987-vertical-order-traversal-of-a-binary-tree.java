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
// vd - Vertical Distance
// hd - Horizontal Distance
class Pair{
    int hd;
    int vd;
    TreeNode node;
    public Pair(int hd,int vd,TreeNode node){
        this.vd=vd;
        this.hd=hd;
        this.node=node;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> verticalTraversalNodes=new ArrayList();
        if(root==null) return verticalTraversalNodes;
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(0,0,root));
        TreeMap<Integer,List<Pair>> map=new TreeMap<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                Pair pair=queue.poll();
                if(map.containsKey(pair.hd)){
                    map.get(pair.hd).add(pair);                    
                }else{
                    map.put(pair.hd,new ArrayList<Pair>()
                            {{add(pair);}});
                }
                if(pair.node.left!=null)
                    queue.add(new Pair(pair.hd-1,pair.vd+1,pair.node.left));
                if(pair.node.right!=null)
                    queue.add(new Pair(pair.hd+1,pair.vd+1,pair.node.right));
            }
        }
        for(int i:map.keySet()){
            Collections.sort(map.get(i),(a,b)->{
                if(a.hd==b.hd && a.vd==b.vd){
                    return a.node.val - b.node.val;
                }else{
                    return a.hd-b.hd;
                }
            });
            List<Integer> currVerticalNodes=new ArrayList();
            for(Pair pair:map.get(i)){
                currVerticalNodes.add(pair.node.val);
            }
            verticalTraversalNodes.add(currVerticalNodes);
        }
        
        return verticalTraversalNodes;
    }
}