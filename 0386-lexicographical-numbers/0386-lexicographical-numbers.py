class Solution:
    def lexicalOrder(self, n: int) -> List[int]:
        res = []
        for i in range(1,n+1):
            res.append(str(i))
        res.sort()        
        return [int(n) for n in res]