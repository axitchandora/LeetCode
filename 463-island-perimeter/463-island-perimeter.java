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
  private static int islandPerimeterDFS(int[][] matrix, boolean[][] visited, int x, int y) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length)
          return 1; // returning 1, since this a boundary cell initiated this DFS call
        if (matrix[x][y] == 0)
          return 1; // returning 1, because of the shared side b/w a water and a land cell

        if (visited[x][y])
          return 0; // we have already taken care of this cell

        visited[x][y] = true; // mark the cell visited

        int edgeCount = 0;
        // recursively visit all neighboring cells (horizontally & vertically)
        edgeCount += islandPerimeterDFS(matrix, visited, x + 1, y); // lower cell
        edgeCount += islandPerimeterDFS(matrix, visited, x - 1, y); // upper cell
        edgeCount += islandPerimeterDFS(matrix, visited, x, y + 1); // right cell
        edgeCount += islandPerimeterDFS(matrix, visited, x, y - 1); // left cell

        return edgeCount;
  }
}