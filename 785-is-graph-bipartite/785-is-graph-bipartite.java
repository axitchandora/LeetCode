class Solution {
    // 0 - Not Colored
    // 1 - Blue
    // 2 - Red
    public boolean isBipartite(int[][] graph) {
        int[] color= new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(color[i]==0 && !validColor(graph,i,1,color)) return false;
        }
        return true;
    }
    private boolean validColor(int[][] graph,int src,int curColor,int[] color){
        if(color[src]!=0){
            return color[src]==curColor;
        }
        color[src]=curColor;
        for(int i:graph[src]){
            if(!validColor(graph,i,-curColor,color)) return false;
        }
        return true;
    }
}