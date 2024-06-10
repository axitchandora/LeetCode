class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()

        def dfs(i, subset):
            if i == len(nums):
                res.append(subset.copy())
                return
            #Add the Num in Subset
            subset.append(nums[i])
            dfs(i+1,subset)   
            subset.pop()
            
            #Skip the duplicate num in subset
            while i+1 < len(nums) and nums[i] == nums[i+1]:
                i+=1
            dfs(i+1,subset)    
            
            
        dfs(0,[])
        return res
        