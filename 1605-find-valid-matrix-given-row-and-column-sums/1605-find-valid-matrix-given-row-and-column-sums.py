class Solution:
    def restoreMatrix(self, rowSum, colSum):
        N = len(rowSum)
        M = len(colSum)

        curr_row_sum = [0] * N
        curr_col_sum = [0] * M

        orig_matrix = [[0] * M for _ in range(N)]
        for i in range(N):
            for j in range(M):
                orig_matrix[i][j] = min(
                    rowSum[i] - curr_row_sum[i], colSum[j] - curr_col_sum[j]
                )

                curr_row_sum[i] += orig_matrix[i][j]
                curr_col_sum[j] += orig_matrix[i][j]

        return orig_matrix