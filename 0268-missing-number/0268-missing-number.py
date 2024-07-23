class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n1 = 0
        for i in range(0,len(nums)+1):
            n1 ^= i
        n2 = 0
        for i in nums:
            n2 ^= i
            
        return n1 ^ n2
        