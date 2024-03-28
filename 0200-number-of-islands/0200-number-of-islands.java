class Solution {
    public int numIslands(char[][] grid) {
        int noOfIslands = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    noOfIslands++;
                    islandDFS(grid,i,j);
                }
            }
        }
        
        return noOfIslands;        
    }
    private void islandDFS(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == '0')
            return;
        grid[i][j]='0';
        islandDFS(grid,i+1,j);
        islandDFS(grid,i-1,j);
        islandDFS(grid,i,j+1);
        islandDFS(grid,i,j-1);
    }
}