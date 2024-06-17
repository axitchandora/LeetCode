class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        left, right = 0, int(sqrt(c))
        
        while left <= right:
            total = left * left + right * right
            if total > c:
                right -= 1
            elif total < c:
                left += 1
            else:
                return True
        return False