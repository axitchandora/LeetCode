class Solution:
    def canArrange(self, arr: List[int], k: int) -> bool:
        remainder_count = [0] * k
        
        for n in arr:
            rem = n % k
            if rem < 0:
                rem += k
            remainder_count[rem] += 1
            
        if remainder_count[0] % 2 != 0:
            return False
        
        for r in range(1, (k//2)+ 1):
            if remainder_count[r] != remainder_count[k-r]:
                return False
            
        return True