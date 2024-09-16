class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:        
        def time_to_min(t):
            h, m = map(int, t.split(":"))
            return 60 * h + m
        
        exists = [False] * (60 * 24)
        first_m, last_m = 60 * 24, 0
        for t in timePoints:
            m = time_to_min(t)
            if exists[m]:
                return 0
            exists[m] = True
            first_m = min(first_m, m)
            last_m = max(last_m, m)
            
        res = (
            60 * 24 -
            last_m + first_m
        )
        prev_m = first_m
        for m in range(first_m + 1, len(exists)):
            if exists[m]:
                diff = m - prev_m
                res = min(diff,res)
                prev_m = m
        return res