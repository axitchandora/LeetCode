class Solution:
    def minChanges(self, s: str) -> int:
        l = 0
        res = 0
        
        
        for r in range(len(s)):
            if s[l] != s[r]:
                if r & 1:
                    res += 1
                l = r
        return res