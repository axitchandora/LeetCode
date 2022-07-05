class Solution {
    public int closedIsland(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i*j==0 || i==m-1 || j==n-1){
                    dfs(grid,i,j);
                }
            }
        }
        int countOfIslands=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    dfs(grid,i,j);
                    countOfIslands++;
                }
            }
        }
        return countOfIslands;
    }
    private void dfs(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || grid[i][j]==1)
            return;
        
        grid[i][j]=1;
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
    }
}