class Solution:
    def findLengthOfShortestSubarray(self, arr: List[int]) -> int:
        # Remove prefix
        N = len(arr)
        r = N - 1
        while r > 0 and arr[r - 1] <= arr[r]:
            r -= 1
            
        res = r
        
        # Remove postfix
        l = 0
        while l + 1 < N and arr[l] <= arr[l + 1]:
            l += 1
        res = min(res, N - 1 - l)
        
        # Remove middle
        l, r = 0, N - 1
        
        while l < r:
            # Shrink valid window
            while r < N and l + 1 < r and arr[r - 1] <= arr[r] and arr[l] <= arr[r]:
                r -= 1
                
            # Expand Invalid Window
            while r < N and arr[l] > arr[r]:
                r += 1
                
            res = min(res, r - l - 1)
            if arr[l] > arr[l + 1]:
                break
            l += 1
        return res