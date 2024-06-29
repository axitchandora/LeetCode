class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        res = [-1 , -1]
        res[0] = self.binarySearch(nums, target, False)
        if res[0] != -1 :
            res[1] = self.binarySearch(nums, target, True)
        return res
    
    def binarySearch(self, arr, key, findMaxIndex):
        idx = -1
        start , end = 0 , len(arr) - 1
        while start <= end:
            mid = start + (end - start)//2
            if key < arr[mid]:
                end = mid - 1
            elif key > arr[mid]:
                start = mid + 1
            else:
                idx = mid
                if findMaxIndex:
                    start = mid + 1
                else:
                    end = mid - 1        
        return idx 
        