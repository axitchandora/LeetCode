class Solution:
    def rotateTheBox(self, box: List[List[str]]) -> List[List[str]]:
        ROWS, COLS = len(box), len(box[0])
        
        for r in range(ROWS):
            i = COLS - 1
            for c in reversed(range(COLS)):
                if box[r][c] == "#":
                    box[r][c], box[r][i] = box[r][i], box[r][c]
                    i -= 1
                if box[r][c] == "*":
                    i = c - 1
        res = []
        
        for c in range(COLS):
            col = []
            for r in reversed(range(ROWS)):
                col.append(box[r][c])
            res.append(col)
        
        return res