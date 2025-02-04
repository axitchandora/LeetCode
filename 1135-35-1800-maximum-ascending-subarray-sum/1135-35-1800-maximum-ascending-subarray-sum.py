class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        cur = nums[0]
        res = cur

        for i in range(1, len(nums)):
            if not(nums[i-1] < nums[i]):
                cur = 0
            cur += nums[i]
            res = max(res, cur)
        return res