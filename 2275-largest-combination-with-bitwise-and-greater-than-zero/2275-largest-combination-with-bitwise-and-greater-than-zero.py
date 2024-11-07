class Solution:
    def largestCombination(self, candidates: List[int]) -> int:
        res = 0
        for i in range(32):
            cnt = 0
            
            for n in candidates:                
                cnt += 1 if (1 << i) & n else 0
            res = max(res, cnt)

        return res