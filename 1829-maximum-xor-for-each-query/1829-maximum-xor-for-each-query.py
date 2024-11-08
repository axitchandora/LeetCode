class Solution:
    def getMaximumXor(self, nums: List[int], maximumBit: int) -> List[int]:
        xor = 0
        
        for n in nums:
            xor ^= n
        
        mask = (1 << maximumBit) - 1
        answer = []
        for n in reversed(nums):
            answer.append(xor ^ mask)
            xor ^= n
            
        return answer 
        