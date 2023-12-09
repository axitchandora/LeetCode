class Solution {
    public void btree(StringBuilder st , TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        st.append("(");
        st.append(root.val);
        if(root.left==null && root.right!=null)
        {
             st.append("()");
        }
        else{
            btree(st,root.left);
        }
        btree(st,root.right);
        st.append(")");
    }
    public String tree2str(TreeNode root) {
        StringBuilder st = new StringBuilder();
        btree(st,root);
        st.deleteCharAt(0);
        st.deleteCharAt(st.length() - 1);
        return new String(st);
    }
}