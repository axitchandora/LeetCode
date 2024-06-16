class Solution:
    def minPatches(self, nums: List[int], n: int) -> int:
        
        right = 0
        count = 0
        for x in nums:
            while n > right and x > right + 1:
                # there is a gap from right + 1 to x - 1
                right += right + 1
                count += 1
            right += x
        while n > right:
            right += right + 1
            count += 1 
        return count
        