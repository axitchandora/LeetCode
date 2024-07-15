class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        
        def dfs(i,j, oldcolor):
            if min(i,j) < 0 or i >= len(image) or j >= len(image[0]) or image[i][j] != oldcolor:
                return
            image[i][j] = color
            dfs(i+1,j, oldcolor)
            dfs(i-1,j, oldcolor)
            dfs(i,j+1, oldcolor)
            dfs(i,j-1, oldcolor)
            return
        if image[sr][sc] != color:
            dfs(sr,sc,image[sr][sc])
            
        return image
        