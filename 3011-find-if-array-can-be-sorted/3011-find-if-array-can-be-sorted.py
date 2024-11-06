class Solution:
    def canSortArray(self, nums: List[int]) -> bool:
        
        def count_bits(n):
            return bin(n).count("1")
        
        cur_min, cur_max = nums[0], nums[0]
        prev_max = float("-inf")
        
        for n in nums:
            if count_bits(n) == count_bits(cur_min):
                cur_min = min(cur_min, n)
                cur_max = max(cur_max, n)
            else:
                if cur_min < prev_max:
                    return False
                prev_max = cur_max
                cur_min, cur_max = n, n
        if cur_min < prev_max:
            return False
        return True