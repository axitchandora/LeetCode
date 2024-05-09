class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        N = len(score)
        
        heap = []
        for index, score in enumerate(score):
            heapq.heappush(heap, (-score,index))
          
        rank = [0]*N
        p = 1
        while heap:
            curridx = heapq.heappop(heap)[1]
            cres = ""
            if(p==1):
                cres="Gold Medal"
            elif(p==2):
                cres="Silver Medal"
            elif(p==3):
                cres="Bronze Medal"
            else:
                cres=str(p)
            p += 1
            rank[curridx]=cres
        return rank            
        
        