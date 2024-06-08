class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        remainder = { 0 : -1}
        total_sum = 0
        
        for i , n in enumerate(nums):
            total_sum += n
            rm = total_sum % k
            if rm not in remainder:
                remainder[rm] = i
            elif i - remainder[rm] >= 2:
                return True
        return False