class Solution:
    def minimumObstacles(self, grid: List[List[int]]) -> int:
        ROWS, COLS = len(grid), len(grid[0])
        
        min_heap = [(0, 0, 0)] #(obstacles, r, c)
        visit = set([(0, 0)])
        
        while min_heap:
            obstacles, r, c = heapq.heappop(min_heap)
            
            if (r, c) == (ROWS - 1, COLS - 1):
                return obstacles
            
            nei = [[r + 1, c], [r - 1,c], [r,c + 1], [r,c - 1]]
            for nr, nc in nei:
                if (nr, nc) in visit or nr < 0 or nc < 0 or nc == COLS or nr == ROWS:
                    continue
                heapq.heappush(min_heap, (obstacles + grid[nr][nc],nr,nc))
                visit.add((nr, nc))
            
            