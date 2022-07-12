class Solution {
    // Nodes 
    // 0 - UnVisited
    // 1 - Processing
    // 2 - Completed
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<Integer> result=new ArrayList();
        int[] visited=new int[n];
        boolean[] isCyclePresent=new boolean[n];
        for(int v=0;v<n;v++){
            if(visited[v]!=2){
                dfs(graph,v,visited,isCyclePresent);
            }
        }
        for(int i=0;i<n;i++){
            if(!isCyclePresent[i])
                result.add(i);
        }
        return result;
    }
    
    private boolean dfs(int[][] graph,int src,int[] visited,boolean[] isCyclePresent){
        if(visited[src]==1) return isCyclePresent[src]=true;
        visited[src]=1;
        for(int v:graph[src]){
            if(visited[v]!=2){
                if(dfs(graph,v,visited,isCyclePresent))return isCyclePresent[src]=true;
            }
        }
        visited[src]=2;
        return false;
    }
}