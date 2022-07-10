class Solution {
    private List<List<Integer>> result;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result=new LinkedList<List<Integer>>();
        List<Integer> currPath=new LinkedList<>();
        dfs(graph,0,currPath);
        return result; 
    }
    private void dfs(int[][] graph,int src,List<Integer> currPath){
        if(src==graph.length-1){
            currPath.add(src);
            result.add(new LinkedList(currPath));
            currPath.remove(currPath.size()-1);
            return;
        }
        currPath.add(src);
        for(int v:graph[src]){
                dfs(graph,v,currPath);
        }
        currPath.remove(currPath.size()-1);
    }
}