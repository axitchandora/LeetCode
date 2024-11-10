class Solution:
    def minimumSubarrayLength(self, nums: List[int], k: int) -> int:
        res = float("inf")
        bits = [0] * 32
        l = 0
        
        def bits_update(bits,n ,diff):
            for i in range(32):
                if n & (1 << i):
                    bits[i] += diff
        
        def bits_to_int(bits):
            res = 0
            for i in range(32):
                if bits[i]:
                    res += (1 << i)
            return res
        
        for r in range(len(nums)):
            bits_update(bits, nums[r], 1)
            
            cur_or = bits_to_int(bits)
            
            while l <= r and  cur_or >= k:
                res = min(res, r - l + 1)                
                bits_update(bits, nums[l], -1)
                cur_or = bits_to_int(bits)
                l += 1
            
        return -1 if res == float("inf") else res
    
        