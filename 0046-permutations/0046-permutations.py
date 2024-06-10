class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        
        #Base Case
        if len(nums) == 1:
            return [nums.copy()]
        
        for i in range(len(nums)):
            n = nums.pop(0)
            prems = self.permute(nums)
            
            for prem in prems:
                prem.append(n)
            res.extend(prems)
            nums.append(n)
            
        return res