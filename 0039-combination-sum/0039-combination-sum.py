class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result=[]
        currComb=[]
        def dfs(candidates,currPtr,target,currComb,result):
            if(target == 0):
                result.append(list(currComb))
                return
            for i in range(currPtr, len(candidates)):
                if(target< candidates[i]):
                    continue                    
                currComb.append(candidates[i])
                dfs(candidates,i,target-candidates[i],currComb,result)
                currComb.pop()
            
        dfs(candidates,0,target,[],result)
        return result
            
        