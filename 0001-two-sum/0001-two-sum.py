class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        cnt_set = {}
        for i,n in enumerate(nums):
            diff = target - n
            if diff in cnt_set:
                return [i,cnt_set[diff]]
            else:
                cnt_set[n]=i            
        return []
        