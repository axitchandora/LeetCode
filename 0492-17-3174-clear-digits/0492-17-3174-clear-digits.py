class Solution:
    def clearDigits(self, s: str) -> str:
        res = []
        delete_cnt = 0
        
        def isdigit(c):
            return ord("0") <= ord(c) <= ord("9")

        for i in reversed(range(len(s))):
            if isdigit(s[i]):
                delete_cnt += 1
            elif delete_cnt:
                delete_cnt -= 1
            else:
                res.append(s[i])
        return "".join(res[::-1])
