class Solution:
    def tribonacci(self, n: int) -> int:
        t = [0,1,1]
        
        if n < 3:
            return t[n]
        
        for i in range(3,n+1):
            t[0],t[1],t[2]= t[1],t[2],sum(t)
        return t[2]
        
        