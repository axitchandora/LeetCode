class Solution {
    private List<List<Integer>> result;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result=new ArrayList<List<Integer>>();
        List<Integer> currPath=new ArrayList<>();
        dfs(graph,0,currPath);
        return result; 
    }
    private void dfs(int[][] graph,int src,List<Integer> currPath){
        if(src==graph.length-1){
            currPath.add(src);
            result.add(new ArrayList(currPath));
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