class Solution:  
    
    def minElement(self, nums: List[int]) -> int:
        res = float("inf")
        def sumofdigit(n):
            r = 0
            while n:
                r += n % 10
                n = n//10
            return r
        for n in nums:
            res = min(res,sumofdigit(n))
        return res
        