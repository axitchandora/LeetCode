class Solution:
    def countSquares(self, matrix: List[List[int]]) -> int:
        ROWS, COLS = len(matrix), len(matrix[0])
        cache = {}
        
        def dfs(r,c):
            if r == ROWS or c == COLS or not matrix[r][c]:
                return 0
            
            if (r, c) in cache:
                return cache[(r,c)]
            
            cache[(r,c)] = 1 + min(
                dfs(r + 1, c),
                dfs(r, c + 1),
                dfs(r + 1, c + 1)
            )
            
            return cache[(r,c)]
            
        res = 0
        for r in range(ROWS):
            for c in range(COLS):
                res += dfs(r, c)
        
        return res