class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int m=grid.length;
        int n=grid[0].length;
        boolean [][] visited=new boolean[m][n];
        int maxArea=0;
        int curArea=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]==false){
                    curArea=dfs(grid,i,j,visited);
                    maxArea=Math.max(maxArea,curArea);
                }
            }
        }
        return maxArea;
    }
    private int dfs(int[][] grid,int i,int j,boolean [][] visited){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]==true || grid[i][j]==0)
            return 0;
        visited[i][j]=true;
        return 1+dfs(grid,i-1,j,visited)+dfs(grid,i,j+1,visited)+dfs(grid,i,j-1,visited)+dfs(grid,i+1,j,visited);
    }
}