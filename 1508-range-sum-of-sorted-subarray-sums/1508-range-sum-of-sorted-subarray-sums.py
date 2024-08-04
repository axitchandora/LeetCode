class Solution:
    def rangeSum(self, nums: List[int], n: int, left: int, right: int) -> int:
        MOD = 10 ** 9 + 7
        minHeap = [(n, i) for i, n in enumerate(nums)]
        heapq.heapify(minHeap)
        
        res = 0
        for i in range(right):
            num, index = heapq.heappop(minHeap)
            if i >= left - 1:
                res = (res + num) % MOD
                
            if index + 1 < n:
                next_pair = (num + nums[index+1], index +1 )
                heapq.heappush(minHeap, next_pair)
        return res
        