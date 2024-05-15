class Solution:
    def maximumSafenessFactor(self, grid: List[List[int]]) -> int:
        N = len(grid)
        
        def in_bounds(r,c):
            return min(r,c)>=0 and max(r,c)<N
        
        def precompute():
            q = deque()
            min_dist = {}
            for r in range(N):
                for c in range(N):
                    if grid[r][c]:
                        q.append([r,c,0])
                        min_dist[(r,c)]=0
            while q:
                r,c, dist = q.popleft()
                nei = [[r+1,c],[r-1,c],[r,c+1],[r,c-1]]
                for r2,c2 in nei:
                    if in_bounds(r2,c2) and (r2,c2) not in min_dist:
                        min_dist[(r2,c2)]=dist+1
                        q.append([r2,c2,dist+1])
            return min_dist
        
        min_dist = precompute()
        maxHeap = [[-min_dist[(0,0)],0,0]] # dist ,r ,c
        visit = set()
        visit.add((0,0))
        while maxHeap:
            dist, r ,c = heapq.heappop(maxHeap)
            dist = -dist
            if(r,c) == (N-1,N-1):
                return dist
            nei = [[r+1,c],[r-1,c],[r,c+1],[r,c-1]]
            for r2,c2 in nei:
                if in_bounds(r2,c2) and (r2,c2) not in visit:
                    visit.add((r2,c2))
                    dist2 = min(dist,min_dist[(r2,c2)])
                    heapq.heappush(maxHeap,[-dist2,r2,c2])
        
            
        