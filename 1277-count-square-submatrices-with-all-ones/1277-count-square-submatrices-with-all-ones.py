class Solution:
    def countSquares(self, matrix: List[List[int]]) -> int:
        ROWS, COLS = len(matrix), len(matrix[0])
        dp = defaultdict(int)
        
        res = 0
        
        for r in range(ROWS):
            for c in range(COLS):
                if matrix[r][c]:
                    dp[(r,c)] = 1 + min(
                        dp[(r - 1,c)],
                        dp[(r,c - 1)],
                        dp[(r - 1,c - 1)]
                    )
                    res += dp[(r,c)]
        return res