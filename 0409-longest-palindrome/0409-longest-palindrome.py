class Solution:
    def longestPalindrome(self, s: str) -> int:
        freq = {}
        res = 0
        for c in s:
            freq[c] = freq.get(c, 0) + 1
        odd_freq = False
        for v in freq.values():
            if (v % 2) == 0:
                res += v
            else:
                res += v - 1
                odd_freq = True
        if odd_freq:
            return res + 1
        return res
                
        