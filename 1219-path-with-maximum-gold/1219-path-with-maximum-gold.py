class Solution:
    def getMaximumGold(self, grid: List[List[int]]) -> int:
        ROWS, COLS = len(grid), len(grid[0])
        
        def dfs(r,c):
            if( min(r,c) < 0 or r == ROWS or c == COLS or grid[r][c] == 0):
                return 0
            tmp = grid[r][c]
            grid[r][c] = 0
            res = grid[r][c]
            neighbour = [[r+1,c],[r-1,c],[r,c+1],[r,c-1]]
            for r2,c2 in neighbour:
                res = max( res ,tmp+dfs(r2,c2))    
            grid[r][c] = tmp
            return res
            
        res = 0
        for r in range(ROWS):
            for c in range(COLS):
                res = max(res,dfs(r,c))
        return res
        