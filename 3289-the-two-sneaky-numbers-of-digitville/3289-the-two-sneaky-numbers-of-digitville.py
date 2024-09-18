class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        return [n for n, cnt in Counter(nums).items() if cnt > 1]