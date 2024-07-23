class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        one = twice = 0
        for n in nums:
            one = (one ^ n) & (~twice)
            twice = (twice ^ n) & (~one)
            
        return one
        