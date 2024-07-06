class Solution:
    def passThePillow(self, n: int, time: int) -> int:
        
        
        cycle = time // (n - 1)
        pos = time % (n - 1)
        
        if cycle % 2 == 0:
            return pos + 1
        else:
            return n - pos