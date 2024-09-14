class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        target = max(nums)
        size, res = 0 , 0
        for n in nums:
            if n == target:
                size += 1
            else:
                size = 0
            res = max(size, res)
        return res