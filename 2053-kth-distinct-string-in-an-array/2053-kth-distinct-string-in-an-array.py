class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        
        for i in range(len(arr)):
            distinct_string = True
            for j in range(len(arr)):
                if i == j :
                    continue
                    
                if arr[i] == arr[j]:
                    distinct_string = False
                    break
            if distinct_string:
                k -= 1
            if k==0:
                return arr[i]
            
        return ""
        