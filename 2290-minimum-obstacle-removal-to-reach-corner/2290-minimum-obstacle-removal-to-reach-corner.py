class Solution:
    def minimumObstacles(self, grid: List[List[int]]) -> int:
        ROWS, COLS = len(grid), len(grid[0])
        
        q = deque([(0, 0, 0)]) #(obstacles, r, c)
        visit = set([(0, 0)])
        
        while q:
            obstacles, r, c = q.popleft()
            
            if (r, c) == (ROWS - 1, COLS - 1):
                return obstacles
            
            nei = [[r + 1, c], [r - 1,c], [r,c + 1], [r,c - 1]]
            for nr, nc in nei:
                if (nr, nc) in visit or nr < 0 or nc < 0 or nc == COLS or nr == ROWS:
                    continue
                if grid[nr][nc]:
                    q.append((obstacles + 1, nr, nc))
                else:
                    q.appendleft((obstacles, nr, nc))
                visit.add((nr, nc))
            
            