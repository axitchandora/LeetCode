class Solution:
    def minDifference(self, nums: List[int]) -> int:
        if len(nums) <= 4:
            return 0
        nums.sort()
        res = float("inf")
        for l in range(4):
            r = len(nums) - 4 + l
            res = min (res , nums[r]-nums[l])
        
        return res
        