class Solution:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:
        prefix = [0]
        for n in arr:
            prefix.append(prefix[-1] ^ n)
        
        res = []
        for left, right in queries:
            res.append(
            prefix[right + 1] ^ prefix[left]
            )
        return res