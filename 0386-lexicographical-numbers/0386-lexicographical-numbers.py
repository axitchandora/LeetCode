class Solution:
    def lexicalOrder(self, n: int) -> List[int]:             
        res = [] 
        curr = 1
        while len(res) < n:
            res.append(curr)        
            if curr * 10 <= n:
                curr *= 10
            else:
                while curr == n or curr % 10 == 9:
                    curr= curr // 10
                curr += 1
        return res