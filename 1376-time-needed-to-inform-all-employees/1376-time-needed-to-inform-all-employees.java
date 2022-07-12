class Solution {
    int ans=0,max=0;
    ArrayList<Integer>[] adjList;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        adjList=new ArrayList[n];
        for(int i=0;i<n;i++){
            adjList[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<n;i++){
            if(manager[i]!=-1)
                adjList[manager[i]].add(i);
        }
        dfs(headID,informTime);
        return max;
    }
    private void dfs(int manager,int[] informTime){
        max=Math.max(max,ans);
        for(int v:adjList[manager]){
            ans+=informTime[manager];
            dfs(v,informTime);
            ans-=informTime[manager];
        }
    }
}