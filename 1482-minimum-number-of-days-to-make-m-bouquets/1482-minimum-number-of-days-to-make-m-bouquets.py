class Solution:
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        N = len(bloomDay)
        INF = 10 ** 20
        MAX = max(bloomDay)
        
        left = 1
        right = MAX + 1
        bloomDay.append(INF)
        
        def good(target):
            # how many flowers we can make
            count = 0
            # current streak
            current = 0
            
            for x in bloomDay:
                if x <= target:
                    current += 1
                else:
                    current = 0
                
                if current >= k:
                    current -= k
                    count +=1                    
            
            return count >= m
        
        while left < right :
            mid = (left + right) // 2
            
            if good(mid):
                right = mid
            else:
                left = mid + 1
          
        if left == MAX + 1:
            return -1
        return left
        