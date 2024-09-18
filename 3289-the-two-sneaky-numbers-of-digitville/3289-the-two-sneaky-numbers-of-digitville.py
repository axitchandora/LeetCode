class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        freq = Counter(nums)
        res = []
        for n, cnt in freq.items():
            if cnt == 2:
                res.append(n)
        return res