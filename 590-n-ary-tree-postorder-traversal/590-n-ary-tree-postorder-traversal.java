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
    public List<Integer> postorder(Node root) {
        List<Integer> result=new ArrayList();
        if(root==null) return result;
        traversePostOrder(root,result);
        return result;
    }
    private void traversePostOrder(Node root, List<Integer> result){
        if(root==null)return;
        root.children.forEach(node->traversePostOrder(node,result));
        result.add(root.val);
    }
}