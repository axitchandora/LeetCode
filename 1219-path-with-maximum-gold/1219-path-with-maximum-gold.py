class Solution:
    def getMaximumGold(self, grid: List[List[int]]) -> int:
        ROWS, COLS = len(grid), len(grid[0])
        
        def dfs(r,c,visit):
            if( min(r,c) < 0 or r == ROWS or c == COLS or grid[r][c] == 0 or (r,c) in visit ):
                return 0
            visit.add((r,c))
            res = grid[r][c]
            neighbour = [[r+1,c],[r-1,c],[r,c+1],[r,c-1]]
            for r2,c2 in neighbour:
                res = max( res ,grid[r][c]+dfs(r2,c2,visit))    
            visit.remove((r,c))
            return res
            
        res = 0
        for r in range(ROWS):
            for c in range(COLS):
                res = max(res,dfs(r,c,set()))
        return res
        