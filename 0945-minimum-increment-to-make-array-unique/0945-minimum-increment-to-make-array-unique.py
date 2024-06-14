class Solution:
    def minIncrementForUnique(self, nums: List[int]) -> int:
        count = Counter(nums)
        res = 0
        
        for i in range(len(nums) + max(nums)):
            if count[i] > 1 :
                extra = count[i] - 1
                count[i + 1] += extra
                res += extra
                
        return res
            