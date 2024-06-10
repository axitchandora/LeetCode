class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        count = [0] * 101
        for h in heights:
            count[h] += 1
        expected = [] 
        for i in range(1,101):
            cnt = count[i]
            while cnt > 0:
                expected.append(i)
                cnt -=1
            
        res = 0        
        
        for i in range(len(expected)):
            if expected[i]!=heights[i]:
                res += 1
        return res
        
        
        
        
        