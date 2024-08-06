class Solution:
    def minimumPushes(self, word: str) -> int:
        counts = [0] * 26
        for c in word:
            counts[ord(c) - ord("a")] += 1
            
        counts.sort(reverse=True)
        
        res = 0
        distinct = 0
        for i, cnt in enumerate(counts):
            res += cnt * (1 + i // 8)
            distinct += 1
        
        return res
        