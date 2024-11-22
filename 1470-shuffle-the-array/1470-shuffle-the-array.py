class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        res = [0] * len(nums)
        l = 0
        r = n
        for i in range(0,len(nums),2):            
            res[i] = nums[l]
            res[i+1] = nums[r]
            l += 1
            r += 1
        return res