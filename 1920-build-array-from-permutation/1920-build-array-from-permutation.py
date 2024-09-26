class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        res = [-1] * len(nums)
        for i in range(len(nums)):
            res[i] = nums[nums[i]]
        return res