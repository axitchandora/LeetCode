class Solution:
    def minSwaps(self, nums: List[int]) -> int:
        N = len(nums)
        total_ones = nums.count(1)
        l = 0
        windows_ones = max_window_ones = 0
        for r in range(2 * N):
            if nums[r % N]:
                windows_ones += 1
            if r - l + 1 > total_ones:
                windows_ones -= nums[l % N]
                l += 1
            max_window_ones = max(max_window_ones, windows_ones)
            
        return total_ones - max_window_ones
        