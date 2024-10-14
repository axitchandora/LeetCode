class Solution:
    def maxKelements(self, nums: List[int], k: int) -> int:
        res = 0
        
        max_heap = [-n for n in nums]
        heapq.heapify(max_heap)
        
        while k:
            n = -heapq.heappop(max_heap)
            res += n
            k -= 1
            heapq.heappush(max_heap, -math.ceil(n/3))        
        return res