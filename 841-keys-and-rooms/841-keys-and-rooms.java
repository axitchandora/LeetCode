class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        dfs(rooms,0,visited);
        for(boolean vi:visited){
            if(!vi) return false;
        }
        return true;
    }
    private void dfs(List<List<Integer>> rooms,int src,boolean[] visited){        
        visited[src]=true;
        for(Integer r:rooms.get(src)){
            if(visited[r]==false){
                dfs(rooms,r,visited);
            }
        }
    }
}