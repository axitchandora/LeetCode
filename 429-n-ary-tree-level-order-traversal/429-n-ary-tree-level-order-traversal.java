/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> levels=new ArrayList();
            for(int i=0;i<size;i++){
                Node currNode=queue.poll();
                for(Node nextNode:currNode.children){
                    queue.add(nextNode);
                }
                levels.add(currNode.val);
            }
            result.add(levels);
        }
        return result;
    }
}