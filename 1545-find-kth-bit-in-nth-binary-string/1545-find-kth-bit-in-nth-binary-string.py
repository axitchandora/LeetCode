class Solution:
    def findKthBit(self, n: int, k: int) -> str:
        length = 2**n - 1

        def helper(length, k):
            if length == 1:
                return "0"
            
            half = length // 2
            # 15 -> 7 , 8
            if k <= half:
                return helper(half, k)
            elif k > half + 1:
                res = helper(half, 1 + (length - k))
                return "0" if res == "1" else "1"
            else:
                return "1"
        
        return helper(length, k)