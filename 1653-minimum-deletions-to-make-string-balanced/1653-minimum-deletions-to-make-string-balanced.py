class Solution:
    def minimumDeletions(self, s: str) -> int:
        res = float("inf")
        count_a_right = [0] * len(s)
        for i in range(len(s)-2,-1,-1):
            count_a_right[i] = count_a_right[i+1]
            count_a_right[i] += 1 if s[i+1] == 'a' else 0
            
        count_b_left = 0        
        for i, c in enumerate(s):
            deletions = count_a_right[i] + count_b_left
            if c == 'b':
                count_b_left += 1
            res = min(deletions,res)            
            
        return res
        
        