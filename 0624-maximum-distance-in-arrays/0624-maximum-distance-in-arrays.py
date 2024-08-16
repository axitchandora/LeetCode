class Solution:
    def maxDistance(self, arrays: List[List[int]]) -> int:
        cur_min, cur_max = arrays[0][0], arrays[0][-1]
        res = 0
        
        for i in range(1, len(arrays)):
            arr = arrays[i]
            res = max(
                res,
                max(arr[-1] - cur_min, cur_max - arr[0])
            )
            cur_min = min(cur_min, arr[0])
            cur_max = max(cur_max, arr[-1])
            
        return res
        