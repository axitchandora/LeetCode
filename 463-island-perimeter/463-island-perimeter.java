class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1 && !visited[i][j]) // only if the cell is a land and not visited
                    return islandPerimeterDFS(grid, visited, i, j);
            }
        }
        return 0;
    }
    private int[][] dirs={{0,1},{1,0},{0,-1},{-1,0}};
    private int islandPerimeterDFS(int[][] matrix,boolean[][] visited, int x,int y){
        if(x<0 || x>= matrix.length || y<0 || y>= matrix[0].length)
            return 1;
        if(matrix[x][y]==0)
            return 1;
        if(visited[x][y])
            return 0;
        visited[x][y]=true;
        int edgeCount=0;
        for(int[] z:dirs){
            edgeCount+=islandPerimeterDFS(matrix, visited, x+z[0], y+z[1]);
        }
        return edgeCount;
    }
}