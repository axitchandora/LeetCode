class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        open_cnt = 0
        res = 0
        
        
        for c in s:
            if c == "(":
                open_cnt += 1
            else:
                if open_cnt == 0:
                    res += 1
                open_cnt = max(open_cnt - 1, 0)
                
        return res + open_cnt
        