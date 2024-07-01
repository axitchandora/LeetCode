class Solution:
    def removeDuplicates(self, s: str) -> str:
        stack = []
        for i in s:
            if len(stack) > 0 and stack[-1] == i:
                stack.pop()
            else:
                stack.append(i)
        return "".join(stack)
        