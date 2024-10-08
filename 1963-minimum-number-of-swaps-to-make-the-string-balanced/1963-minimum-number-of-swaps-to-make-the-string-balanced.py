class Solution:
    def minSwaps(self, s: str) -> int:
        close, maxClose = 0, 0
        
        for c in s:
            if c == "[":
                close -= 1
            else:
                close += 1
            maxClose = max(close, maxClose)
            
        return (maxClose + 1)//2
        