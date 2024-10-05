class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        res = 0
        
        def dfs(idx, currXor):
            if idx == len(nums):
                nonlocal res
                res += currXor
                return 
            dfs(idx + 1, currXor ^  nums[idx])
            dfs(idx + 1, currXor)
            
        dfs(0,0)
        return res
        
        
        
        