class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        dfs(rooms,0,visited);
        visited[0]=true;
        for(boolean vi:visited){
            if(!vi) return false;
        }
        return true;
    }
    private void dfs(List<List<Integer>> rooms,int src,boolean[] visited){      
        
        for(Integer r:rooms.get(src)){
            if(visited[r]==false){
                visited[r]=true;
                dfs(rooms,r,visited);                
            }
        }
    }
}