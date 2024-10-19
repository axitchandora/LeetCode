class Solution:
    def findKthBit(self, n: int, k: int) -> str:
        length = 2**n - 1
#         invert = False
#         while length > 1:
#             half = length // 2
            
#             if k <= half:
#                 length = half
#             elif k > half + 1:
#                 k = 1 + length - k
#                 length = half
#             else:
#                 return "1"

        def helper(length, k, invert):
            if length == 1:
                return "0" if not invert else "1"
            
            half = length // 2
            # 15 -> 7 , 8
            if k <= half:
                return helper(half, k, invert)
            elif k > half + 1:
                return helper(half, 1 + (length - k), not invert)
            else:
                return "1" if not invert else "0"
        
        return helper(length, k, False)