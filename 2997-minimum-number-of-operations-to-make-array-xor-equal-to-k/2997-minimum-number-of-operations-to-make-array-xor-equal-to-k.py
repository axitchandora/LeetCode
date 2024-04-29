class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        freq = defaultdict(int)
        for num in nums:
            for i in range(32):
                freq[i] += (num>>i)&1
        res = 0    
        for i in range(32):
            kth_bit = (k>>i)&1
            if kth_bit == 1:
                if freq[i]%2 == 0:
                    res += 1
            else:
                if freq[i]%2 == 1:
                    res += 1 
        return res
            
        