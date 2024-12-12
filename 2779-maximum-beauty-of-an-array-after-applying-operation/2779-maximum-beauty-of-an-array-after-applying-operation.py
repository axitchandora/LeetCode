class Solution(object):
    def maximumBeauty(self, nums, k):
        nums.sort()
        
        res = 0
        l = 0
        for r in range(len(nums)):
            while nums[r] - nums[l] > 2* k:
                l += 1            
            res = max(res, r - l + 1)
        
        return res
        