class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        res = 0
        
        n = start ^ goal
        
        while n:
            res += n & 1
            n = n >> 1
        
        return res
        