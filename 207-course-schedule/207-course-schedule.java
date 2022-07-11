class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        ArrayList<Integer>[] adjacencyList=new ArrayList[n];
        for(int i=0;i<n;i++){
            adjacencyList[i]=new ArrayList<Integer>();
        }
        for(int[] pre:prerequisites){
            adjacencyList[pre[1]].add(pre[0]);
        }       
        boolean [] visited=new boolean[n];
        boolean [] currvisited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(dfs(adjacencyList,i,visited,currvisited)) return false;
            }
        }
        return true;
    }
    private boolean dfs(ArrayList<Integer>[] adjList,int src,boolean [] visited,boolean [] currvisited){
        visited[src]=true;
        currvisited[src]=true;
        for(int k:adjList[src]){
            if(!visited[k]){
                if(dfs(adjList,k,visited,currvisited))return true;
            }else if(visited[k] && currvisited[k]){
                return true;
            }
        }        
        currvisited[src]=false;
        return false;
    }
}