class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        streak = 0
        
        for i in arr:
            if i % 2 == 1:
                streak += 1
            else:
                streak = 0
            if streak >= 3:
                return True
        return False
        