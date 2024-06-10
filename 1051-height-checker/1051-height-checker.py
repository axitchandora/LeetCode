class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        res = 0
        new_h = sorted(heights)
        for i in range(len(new_h)):
            if new_h[i]!=heights[i]:
                res += 1
        return res
        
        
        
        
        