class Solution:
    def maximumSwap(self, num: int) -> int:
        num = list(str(num))
        
        max_digit = "0"
        max_i = -1
        swap_i = swap_j = -1
        
        for i in reversed(range(len(num))):
            # max
            if num[i] > max_digit:
                max_digit = num[i]
                max_i = i
            
            # swap
            if num[i] < max_digit:
                swap_i, swap_j = i, max_i
        num[swap_i], num[swap_j] = num[swap_j], num[swap_i]
        return int("".join(num))
            