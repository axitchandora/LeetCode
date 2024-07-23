class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        count = Counter(nums)
        
        def custom_sort(n):
            return (count[n], -n)
        
        nums.sort(key=custom_sort)
        
        return nums
        