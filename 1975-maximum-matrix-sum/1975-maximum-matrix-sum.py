class Solution:
    def maxMatrixSum(self, matrix: List[List[int]]) -> int:
        res = 0
        neg_cnt = 0
        mat_min = float("inf")
        for row in matrix:
            for n in row:
                res += abs(n)
                mat_min = min(abs(n),mat_min)
                if n < 0:
                    neg_cnt += 1
        if neg_cnt & 1:
            res -= 2 * mat_min
            
        return res