class Solution:
    def isBalanced(self, num: str) -> bool:
        odd = 0
        even = 0
        for i,n in enumerate(num):
            if i % 2:
                odd += int(n)
            else:
                even += int(n)
        return odd == even