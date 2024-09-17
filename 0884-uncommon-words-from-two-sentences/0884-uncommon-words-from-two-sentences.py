class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        count = defaultdict(int)
        
        for w in s1.split(" ") + s2.split(" "):
            count[w] +=1
        
        res = []
        for w , cnt in count.items():
            if cnt == 1:
                res.append(w)
                
        return res