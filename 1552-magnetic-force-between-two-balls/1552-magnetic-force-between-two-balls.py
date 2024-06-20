class Solution:
    def maxDistance(self, position: List[int], m: int) -> int:
        INF = 10 ** 20
        position.sort()
        
        left = 1
        right = position[-1] - position[0]
        
        #we cab figure out a magnetic force of "target"
        def good(target):
            balls = 0
            last_basket = -INF
            
            for b in position:
                if b - last_basket >= target :
                    balls += 1
                    last_basket = b
                    
            return balls >= m
        
        while left < right:
            mid = (left + right + 1) //2
            
            if good(mid):
                left = mid
            else:
                right = mid - 1
        return left
        