class Solution:
    def isArraySpecial(self, nums: List[int], queries: List[List[int]]) -> List[bool]:
        prefixSum = [1 for _ in range(len(nums))]
        res = []
        for i in range(1,len(nums)):
            if (nums[i]&1) == (nums[i-1]&1):
                prefixSum[i] = 1
            else:
                prefixSum[i] = 1 + prefixSum[i-1]
        for s, e in queries:
             res.append((e-s+1) <= prefixSum[e])
        return res
