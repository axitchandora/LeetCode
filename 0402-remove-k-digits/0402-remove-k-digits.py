class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        stack = []
        
        for s in num:
            while k>0 and stack and stack[-1] > s:
                k -= 1
                stack.pop()
            stack.append(s)
            
        stack = stack[:-k] if k > 0 else stack
        
        # Remove leading zeros
        non_zero_index = 0
        while non_zero_index < len(stack) and stack[non_zero_index] == '0':
            non_zero_index += 1
        
        # If all digits are removed, return '0'
        if non_zero_index == len(stack):
            return '0'
        
        return ''.join(stack[non_zero_index:])
            