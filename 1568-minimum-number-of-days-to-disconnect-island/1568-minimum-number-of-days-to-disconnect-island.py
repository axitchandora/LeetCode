class Solution:
    def minDays(self, grid: List[List[int]]) -> int:
        ROWS, COLS = len(grid), len(grid[0])
        
        def dfs(r, c, visit):
            if(r < 0 or c < 0 or r == ROWS or c == COLS
              or grid[r][c] == 0 or (r,c) in visit):
                return
            visit.add((r,c))
            neighbors = [[r+1,c],[r,c+1],[r-1,c],[r,c-1]]
            for nr, nc in neighbors:
                dfs(nr, nc, visit)
         
        visit = set()
        count = 0
        for r in range(ROWS):
            for c in range(COLS):
                if grid[r][c] and (r,c) not in visit:
                    dfs(r,c , visit)
                    count += 1
                    
        if count != 1:
            return 0
        
        land = list(visit)
        for r, c in land:
            grid[r][c] = 0
            
            visit = set()
            count = 0
            for r2 in range(ROWS):
                for c2 in range(COLS):
                    if grid[r2][c2] and (r2,c2) not in visit:
                        dfs(r2,c2 , visit)
                        count += 1

            if count != 1:
                return 1
            grid[r][c] = 1
        return 2
            
            
        