class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        if(grid2==null || grid1==null || grid1.length==0 || grid2.length==0) return 0;
        int m=grid1.length;
        int n=grid1[0].length;
        int countOfIslands=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid2[i][j]==1){
                    if(dfs(grid1,grid2,i,j))countOfIslands++;
                }
            }
        }
        return countOfIslands;
    }
    private boolean dfs(int[][] grid1,int[][] grid2,int i,int j){
        if(i<0 || j<0 || i>=grid2.length || j>=grid2[0].length || grid2[i][j]==0)
            return true;        
        if(grid1[i][j]==0) return false;   
        grid2[i][j]=0;
        boolean up = dfs(grid1, grid2, i - 1 , j);
        boolean down = dfs(grid1, grid2, i + 1 , j);
        boolean left = dfs(grid1, grid2, i , j - 1);
        boolean right = dfs(grid1, grid2, i , j + 1);
        if(up && down && left && right) return true;
        else return false;
    }
}