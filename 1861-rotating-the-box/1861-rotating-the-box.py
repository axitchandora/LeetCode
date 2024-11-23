class Solution:
    def rotateTheBox(self, box: List[List[str]]) -> List[List[str]]:
        ROWS, COLS = len(box), len(box[0])
        
        res = [["."] * ROWS for _ in range(COLS)]
        
        for r in range(ROWS):
            i = COLS - 1
            for c in reversed(range(COLS)):
                if box[r][c] == "#":
                    res[i][ROWS - r - 1] = "#"
                    i -= 1
                if box[r][c] == "*":
                    res[c][ROWS - r - 1] = "*"
                    i = c - 1
        

        
        return res