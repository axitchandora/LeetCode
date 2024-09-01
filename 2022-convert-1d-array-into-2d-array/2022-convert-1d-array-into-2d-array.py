class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        if len(original) != m * n:
            return []
        
        res = []
        
        for r in range(m):
            start = r * n
            end = start + n
            res.append(original[start:end])
            
        return res
        