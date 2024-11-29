class Solution:
    def minimumTime(self, grid: List[List[int]]) -> int:
        if min(grid[0][1], grid[1][0]) > 1:
            return -1
        
        min_heap = [(0, 0, 0)] # (time, r, c)
        ROWS, COLS = len(grid), len(grid[0])
        visit = set()
        
        while min_heap:
            t, r, c = heapq.heappop(min_heap)
            
            if (r, c) == (ROWS - 1, COLS - 1):
                return t
            
            nei = [(r + 1, c), (r - 1, c), (r, c + 1), (r, c - 1)]
            for nr, nc in nei:
                if nr < 0 or nc < 0 or nr == ROWS or nc == COLS or (nr, nc) in visit:
                    continue
                wait = 0
                if abs(grid[nr][nc] - t) % 2 == 0:
                    wait = 1                
                n_time = max(grid[nr][nc] + wait, t + 1)
                heapq.heappush(min_heap, (n_time, nr, nc))
                visit.add((nr, nc))