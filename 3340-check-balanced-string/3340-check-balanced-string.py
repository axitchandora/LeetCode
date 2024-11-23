class Solution:
    def isBalanced(self, num: str) -> bool:
        odd = 0
        even = 0
        for i,n in enumerate(num):
            if i % 2:
                odd += ord(n) - ord("0")
            else:
                even += ord(n) - ord("0")
        return odd == even