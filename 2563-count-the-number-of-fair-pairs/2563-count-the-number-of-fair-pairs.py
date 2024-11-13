class Solution:
    def countFairPairs(self, nums: List[int], lower: int, upper: int) -> int:
        def bin_search(l, r , target):
            # Return largest i, where nums[i] < target
            while l <= r:
                m = (l + r) // 2 # l + ( r - 1) // 2
                if nums[m] >= target:
                    r = m - 1
                else:
                    l = m + 1
            return r
            
        nums.sort()
        res = 0
        
        for i in range(len(nums)):
            low = lower - nums[i]
            up = upper - nums[i]
            res += (
            bin_search(i + 1, len(nums) - 1, up + 1) -
            bin_search(i + 1, len(nums) - 1, low)
            )
            
        return res