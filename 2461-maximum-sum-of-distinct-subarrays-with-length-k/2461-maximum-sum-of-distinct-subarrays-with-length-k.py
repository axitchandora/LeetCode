class Solution:
    def maximumSubarraySum(self, nums: List[int], k: int) -> int:
        res = 0
        prev_idx = {} # num -> last occuring index
        cur_sum = 0
        
        l = 0
        for r in range(len(nums)):
            cur_sum += nums[r]
            
            i = prev_idx.get(nums[r], -1)
            
            while l <= i or r - l + 1 > k:
                cur_sum -= nums[l]
                l += 1            
           
            if r - l + 1 == k:
                res = max(res, cur_sum)
            
            prev_idx[nums[r]] = r
        
        return res