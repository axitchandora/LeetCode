class Solution:
    def minDifference(self, nums: List[int]) -> int:
        if len(nums) <= 4:
            return 0
        min_four = sorted(heapq.nsmallest(4, nums))
        max_four = sorted(heapq.nlargest(4, nums))
        res = float("inf")
        
        for i in range(4):
            res = min(res, max_four[i] - min_four[i])        
        return res
        