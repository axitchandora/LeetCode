class Solution:
    def minKBitFlips(self, nums: List[int], k: int) -> int:
        cur_window_flips = 0
        res = 0
        
        for i in range(len(nums)):
            if i - k >= 0 and nums[i - k] == 2:
                cur_window_flips -= 1
            if(nums[i] + cur_window_flips ) % 2 == 0:
                if i + k > len(nums):
                    return -1
                res += 1
                cur_window_flips += 1
                nums[i] = 2
        return res