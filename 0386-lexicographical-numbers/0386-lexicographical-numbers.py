class Solution:
    def lexicalOrder(self, n: int) -> List[int]:             
        return [int(n) for n in sorted([str(i) for i in range(1,n+1)])]