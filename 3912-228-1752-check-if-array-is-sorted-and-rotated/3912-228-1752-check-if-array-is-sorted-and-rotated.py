class Solution:
    def check(self, nums: List[int]) -> bool:
        N = len(nums)
        count = 1


        for i in range(1, 2 * N):
            if nums[(i - 1) % N] <= nums[i % N]:
                count += 1
            else:
                count = 1
            if count == N:
                return True
        return N == 1
        