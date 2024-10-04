class Solution:
    def validStrings(self, n: int) -> List[str]:      
        res = []
        def dfs(prevZero,currStr,result):
            if len(currStr) == n:
                result.append(currStr)
                return
            if prevZero:
                dfs(False,currStr+"1",result)
            else:
                dfs(True,currStr+"0",result)
                dfs(False,currStr+"1",result)        
        dfs(False,"",res)
        
        return res