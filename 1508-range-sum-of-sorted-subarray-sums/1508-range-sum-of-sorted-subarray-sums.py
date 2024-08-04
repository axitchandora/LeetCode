class Solution:
    def rangeSum(self, nums: List[int], n: int, left: int, right: int) -> int:
        MOD = 10 ** 9 + 7
        subarr_sums = []
        
        for i in range(n):
            cur_sum = 0
            for j in range(i, n):
                cur_sum = (cur_sum + nums[j]) % MOD
                subarr_sums.append(cur_sum)
                
        subarr_sums.sort()
        res = 0
        for i in range(left-1, right):
            res = (res + subarr_sums[i]) % MOD
        
        return res