class Solution:
    def sortJumbled(self, mapping: List[int], nums: List[int]) -> List[int]:
        pairs = []
        
        for i , n in enumerate(nums):
            n = str(n)
            mapped_n = 0
            for c in n:
                mapped_n *= 10
                mapped_n += mapping[int(c)]
                
            pairs.append((mapped_n,i))
            
        pairs.sort()
        
        return [nums[p[1]] for p in pairs]
        