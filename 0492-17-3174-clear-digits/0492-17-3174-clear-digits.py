class Solution:
    def clearDigits(self, s: str) -> str:
        res = []
        delete_cnt = 0
        
        def isdigit(c):
            return ord("0") <= ord(c) <= ord("9")

        for i in range(len(s)):
            if isdigit(s[i]):
                res.pop()
            else:
                res.append(s[i])
        return "".join(res)
