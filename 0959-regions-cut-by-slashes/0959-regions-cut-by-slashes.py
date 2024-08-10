class Solution:
    def regionsBySlashes(self, grid: List[str]) -> int:
        ROWS1, COLS1 = len(grid), len(grid[0])
        ROWS2, COLS2 = 3 * ROWS1, 3* ROWS1
        grid2= [[0] * COLS2 for _ in range(ROWS2)]
        
        for r in range(ROWS1):
            for c in range(COLS1):
                r2, c2 = r * 3, c * 3
                if grid[r][c] == "/":
                    grid2[r2][c2+2] = 1 
                    grid2[r2+1][c2+1] = 1 
                    grid2[r2+2][c2] = 1                    
                elif grid[r][c] == "\\":
                    grid2[r2][c2] = 1 
                    grid2[r2+1][c2+1] = 1 
                    grid2[r2+2][c2+2] = 1 
        def dfs(r, c , visit):
            if (r < 0 or c < 0 or r == ROWS2 or c == COLS2 or
                grid2[r][c] !=0 or (r,c)in visit):
                return
            visit.add((r,c))
            neighors = [[r+1,c],[r,c+1],[r-1,c],[r,c-1]]
            
            
            for nr, nc in neighors:
                dfs(nr,nc, visit)
            
        visit = set()
        res = 0
        for r in range(ROWS2):
            for c in range(COLS2):
                if grid2[r][c] == 0 and (r,c) not in visit:
                    dfs(r,c, visit)
                    res += 1
        return res
                    