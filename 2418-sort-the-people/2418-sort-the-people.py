class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        height_to_name = {}
        for h, n in zip(heights, names):
            height_to_name[h] = n
            
        res = []
        
        for h in reversed(sorted(heights)):
            res.append(height_to_name[h])
        return res
        