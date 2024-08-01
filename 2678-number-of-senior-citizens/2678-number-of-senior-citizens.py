class Solution:
    def countSeniors(self, details: List[str]) -> int:
        res = 0
        for d in details:
            cur_age = int(d[11:13])
            if cur_age > 60:
                res += 1
        return res
        