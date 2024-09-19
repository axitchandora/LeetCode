class NeighborSum:

    def __init__(self, grid: List[List[int]]):
        self.grid = grid
        self.n = len(grid)
        self.map = {}
        for i in range(self.n):
            for j in range(self.n):
                self.map[grid[i][j]] = (i,j)                
        self.adjDir = [[1,0],[0,1],[-1,0],[0,-1]]
        self.daiDir = [[-1,-1],[1,1],[1,-1],[-1,1]]
    def adjacentSum(self, value: int) -> int:
        adjSum = 0
        for dx,dy in self.adjDir:
            x, y = self.map[value][0]+ dx , self.map[value][1]+ dy
            if x >= 0 and x < self.n and y >=0 and y < self.n:
                adjSum += self.grid[x][y]
        return adjSum
    def diagonalSum(self, value: int) -> int:
        daiSum = 0
        for dx,dy in self.daiDir:
            x, y = self.map[value][0]+ dx , self.map[value][1]+ dy
            if x >= 0 and x < self.n and y >=0 and y < self.n:
                daiSum += self.grid[x][y]
        return daiSum    


# Your NeighborSum object will be instantiated and called as such:
# obj = NeighborSum(grid)
# param_1 = obj.adjacentSum(value)
# param_2 = obj.diagonalSum(value)