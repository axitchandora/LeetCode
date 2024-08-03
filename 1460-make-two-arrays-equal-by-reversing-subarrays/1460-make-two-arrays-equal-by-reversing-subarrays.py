class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        freq_target = defaultdict(int)
        for t in target:
            freq_target[t] += 1
        
        for a in arr:
            if a not in freq_target or freq_target[a] <= 0:
                return False
            freq_target[a] -= 1
        return True
        