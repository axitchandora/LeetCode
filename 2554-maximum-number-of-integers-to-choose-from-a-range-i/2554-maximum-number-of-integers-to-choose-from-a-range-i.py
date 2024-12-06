class Solution:
    def maxCount(self, banned: List[int], n: int, maxSum: int) -> int:
        dont_use = set(banned)
        cnt = 0
        curSum = 0
        for num in range(1,n+1):
            if num not in dont_use:
                curSum += num
                if curSum > maxSum:
                    break
                cnt += 1
        return cnt