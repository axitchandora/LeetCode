class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        count = DefaultDict(int)
        res = 0
        for st in stones:
            count[st] += 1
        for jw in jewels:
            res += count[jw]            
        return res
        