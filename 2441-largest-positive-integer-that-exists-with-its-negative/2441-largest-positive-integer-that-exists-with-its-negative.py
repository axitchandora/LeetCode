class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        s = set()
        for i in nums:
            if i<0:
                s.add(i)
        ans = -1
        for i in nums:
            if i>ans and -i in s:
                ans = i
                
        return ans
            
        