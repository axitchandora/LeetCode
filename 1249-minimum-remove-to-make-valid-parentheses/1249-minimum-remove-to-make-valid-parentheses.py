class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        res = []
        cnt = 0
        for i in s:
            if i == '(':
                cnt += 1
                res.append(i)
            elif i == ')' and cnt > 0:
                cnt -= 1
                res.append(i)
            elif i != ')' :
                res.append(i)
        filtered = []
        print(cnt)
        for i in res[::-1]:
            if i == '(' and cnt > 0:
                cnt -= 1
            else:
                filtered.append(i)
            
        return "".join(filtered[::-1])
        