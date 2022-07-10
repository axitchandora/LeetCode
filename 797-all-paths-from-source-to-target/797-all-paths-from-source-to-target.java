class Solution {
    private List<List<Integer>> result;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result=new LinkedList<List<Integer>>();
        boolean[] visited=new boolean[graph.length];
        List<Integer> currPath=new LinkedList<>();
        dfs(graph,0,currPath,visited);
        return result; 
    }
    private void dfs(int[][] graph,int src,List<Integer> currPath,boolean[] visited){
        if(src==graph.length-1){
            currPath.add(src);
            result.add(new LinkedList(currPath));
            currPath.remove(currPath.size()-1);
            return;
        }
        currPath.add(src);
        visited[src]=true;
        for(int v:graph[src]){
            if(visited[v]==false){
                dfs(graph,v,currPath,visited);
            }
        }
        visited[src]=false;
        currPath.remove(currPath.size()-1);
    }
}