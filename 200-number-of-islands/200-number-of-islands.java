class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int m=grid.length;
        int n=grid[0].length;
        boolean [][] visited=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    drawTreeforComponent(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }
    private void drawTreeforComponent(char[][] grid,int i,int j,boolean [][] visited){        
        if(i<0 || j<0 || i>= grid.length || j>= grid[0].length || grid[i][j]=='0' || visited[i][j] == true)
            return;
        
        visited[i][j] = true;
        drawTreeforComponent(grid,i-1,j,visited);
        drawTreeforComponent(grid,i,j+1,visited);
        drawTreeforComponent(grid,i,j-1,visited);
        drawTreeforComponent(grid,i+1,j,visited);
    }
    // Time Complexity - O(4*n^2)
    // Space Complexity - O(n^2)
}