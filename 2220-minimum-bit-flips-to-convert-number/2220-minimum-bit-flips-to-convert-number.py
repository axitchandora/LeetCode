class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        res = 0
        
        while start or goal:
            if (start & 1 ) != (goal & 1):
                res +=1
            start = start >> 1
            goal = goal >> 1
        
        return res
        