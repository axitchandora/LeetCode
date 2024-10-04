class Solution:
    def dividePlayers(self, skill: List[int]) -> int:
        total = sum(skill)
        
        if (2 * total) % len(skill):
            return -1
        
        count = Counter(skill)
        target = (2 * total) // len(skill)
        res = 0
        
        for s in skill:
            if not count[s]:
                continue
            
            diff = target - s
            if not count[diff]:
                return -1
        
            res += s * diff
            count[s] -= 1
            count[diff] -= 1
            
        return res