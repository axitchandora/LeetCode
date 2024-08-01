class Solution:
    def countSeniors(self, details: List[str]) -> int:
        res = 0
        for d in details:
            ten = ord(d[11]) - ord("0")
            one = ord(d[12]) - ord("0")
            cur_age = ten * 10 + one
            if cur_age > 60:
                res += 1
        return res
        