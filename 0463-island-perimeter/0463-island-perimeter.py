class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        visited = set()
        
        def dfs(grid, i, j):
            if i<0 or j<0 or i>= len(grid) or j>= len(grid[0]) or \
            grid[i][j]==0 :
                return 1
            if (i,j) in visited:
                return 0
            visited.add((i,j))
            premi = dfs(grid,i+1,j)
            premi += dfs(grid,i-1,j)
            premi += dfs(grid,i,j+1)
            premi += dfs(grid,i,j-1)
            
            return premi
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if(grid[i][j]==1):
                    return dfs(grid,i,j)
        