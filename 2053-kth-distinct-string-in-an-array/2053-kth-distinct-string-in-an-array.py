class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        count = {}        
        
        for a in arr:
            if a not in count:
                count[a] = 1
            else:
                count[a] += 1
        for a in arr:
            if count[a]==1:
                k-=1
                if k ==0:
                    return a                
            
        return ""
        