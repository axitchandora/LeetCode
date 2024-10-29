class Solution:       
    
    def maxMoves(self, grid: List[List[int]]) -> int:
        ROWS, COLS = len(grid), len(grid[0])
        
        dp = defaultdict(int)
        
        dirs = [-1, 0, 1]
        def dfs(r, c):
            if min(r,c) < 0 or c >= COLS or r >= ROWS:
                return 0
            if (r,c) in dp:
                return dp[(r,c)]
            
            move = 0
            for d in dirs:
                n_r, n_c = r + d, c + 1
                if (min(n_r,n_c) < 0 or n_c >= COLS or n_r >= ROWS 
                    or grid[r][c] >= grid[n_r][n_c]):
                    continue
                move = max(move, 1 + dfs(n_r,n_c))
            dp[(r,c)] = move
            return dp[(r,c)]
        max_moves = 0
        
        for i in range(ROWS):
            moves_required = dfs(i, 0)
            max_moves = max(max_moves, moves_required)
            
        return max_moves