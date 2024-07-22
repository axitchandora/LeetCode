class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for ele in s:
            if ele == '(' or ele == '{' or ele == '[':
                stack.append(ele)
            elif ele == ')':
                if len(stack)== 0 or stack[-1]!= '(':
                    return False
                stack.pop()
            elif ele == '}':
                if len(stack)==0 or stack[-1]!= '{':
                    return False
                stack.pop()
            elif ele == ']':
                if len(stack)==0 or stack[-1]!= '[':
                    return False
                stack.pop()
        return True if len(stack)==0 else False
        