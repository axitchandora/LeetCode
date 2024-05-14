class Solution:
    def mincostToHireWorkers(self, quality: List[int], wage: List[int], k: int) -> float:
        res = float("inf")
        pairs = [] # (ratio, quality)
        for i in range(len(quality)):
            pairs.append(((wage[i]/quality[i]),quality[i]))
        pairs.sort(key=lambda p:p[0])
        total_quality = 0
        maxheap = [] #quailty
        for ratio,q in pairs:
            heapq.heappush(maxheap, -q)
            total_quality += q
            
            if(len(maxheap)>k):
                total_quality += heapq.heappop(maxheap)
            if(len(maxheap)==k):
                res = min(res, total_quality*ratio)
            
        return res
        
        