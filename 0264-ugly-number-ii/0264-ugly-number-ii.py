class Solution:
    def nthUglyNumber(self, n: int) -> int:
        minHeap = [1]
        visit = set()
        factors = [2, 3, 5]
        for i in range(n):
            num = heapq.heappop(minHeap)
            if i == n - 1:
                return num
            
            for f in factors:
                if num * f not in visit:
                    visit.add(num * f)
                    heapq.heappush(minHeap, num * f)
                    
                    
        