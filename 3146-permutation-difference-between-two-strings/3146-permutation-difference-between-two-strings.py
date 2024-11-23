class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        count = [0] * 26
        for i,ch in enumerate(s):
            count[ord(ch)-ord('a')] = i
        res = 0
        for i, ch in enumerate(t):
            res += abs(i-count[ord(ch)-ord('a')])
        
        return res
        