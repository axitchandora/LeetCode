class Solution:
    def countBits(self, n: int) -> List[int]:
        res = []
        def hammingWeight(num):
            cnt = 0
            while num > 0:
                if num & 1 != 0:
                    cnt +=1
                num >>= 1
            return cnt
        for i in range(0,n+1):
            res.append(hammingWeight(i))
        return res