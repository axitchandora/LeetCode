class Solution {
    static int[] parent;
    private int findParent(int u){
        if(parent[u]==u) return u;
        return parent[u]=findParent(parent[u]);
    }
    
    public int makeConnected(int n, int[][] connections) {
        if(n-1>connections.length)return -1;
        parent=new int[n];
        for(int i=0;i<n;i++)
            parent[i]=i;
        for(int [] connection:connections){
            int u=connection[0];
            int v=connection[1];            
            int p1=findParent(u);
            int p2=findParent(v);
            if(p1!=p2) parent[p2]=p1;
        }
        int comp=0;
        for(int i=0;i<n;i++){
            int p=findParent(i);
            if(p==i) comp++;
        }
        return comp-1;
    }
}