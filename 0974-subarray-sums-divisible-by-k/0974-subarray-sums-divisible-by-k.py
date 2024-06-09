class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        res = 0
        curSum = 0
        prefix_rem = defaultdict(int)
        prefix_rem[0] = 1
        
        for n in nums:
            curSum += n
            rem = curSum % k
            res += prefix_rem.get(rem,0)
            prefix_rem[rem] += 1
        
        return res