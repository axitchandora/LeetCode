class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        count = {}
        for i,ch in enumerate(s):
            count[ch] = i
        res = 0
        for i, ch in enumerate(t):
            res += abs(i-count[ch])
        
        return res
        