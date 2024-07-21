class Solution:
    def restoreMatrix(self, rowSum: List[int], colSum: List[int]) -> List[List[int]]:
        ROWS, COLS = len(rowSum) , len(colSum)
        
        res = [[0] * COLS for _ in range(ROWS)]
        
        for r in range(ROWS):
            res[r][0] = rowSum[r]
            
        for c in range(COLS):
            cur_col_sum = 0
            #cur_col_sum = sum([res[r][c] for r in range(ROWS)])
            for r in range(ROWS):
                cur_col_sum += res[r][c]
                
            r = 0
            while cur_col_sum > colSum[c]:
                diff = cur_col_sum - colSum[c]
                max_shift = min(res[r][c], diff)
            
                res[r][c] -= max_shift
                res[r][c+1] += max_shift
                cur_col_sum -= max_shift
                r += 1
                
        return res