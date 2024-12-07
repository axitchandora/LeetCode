class Solution:
    def minimumSize(self, nums: List[int], maxOperations: int) -> int:
        
        def can_divide(max_balls):
            ops = 0
            for n in nums:
                ops += ceil(n / max_balls) - 1
                if ops > maxOperations:
                    return False
            return True
        l, r = 1, max(nums)
        while l < r:
            m = l + ((r - l) //2)
            if can_divide(m):
                r = m
            else:
                l = m + 1
        return l
        